# -*- coding: utf-8 -*-
import msgpack
import gzip
import sys
import pdb
import codecs
import unicodedata

filename = sys.argv[1]
langno = int(sys.argv[2]) #english=1, russian=2
outfile = sys.argv[3]
border = int(sys.argv[4])

with gzip.open(filename, 'rb') as infile:
    data = msgpack.load(infile, raw=False)
    header = data[0]
    if (
        not isinstance(header, dict) or header.get('format') != 'cB'
        or header.get('version') != 1
    ):
        raise ValueError("Unexpected header: %r" % header)
    dict_data = data[1:]
    buckets = len(dict_data)
    with codecs.open(outfile, "w", "utf-8") as outfile:
        for bucket_no,bucket in enumerate(dict_data):
            if len(bucket) == 0:
                continue
            wfreq = buckets - bucket_no
            if wfreq < border:
                break
            for word in bucket:
                word = unicodedata.normalize('NFKD', word.lower())
                if " " in word:
                    print("spaces not allowed")
                    continue
                elif any(char.isdigit() for char in word):# or any(unicodedata.category(c) not in ["Lu", "Ll", "Pc", "Pd", "Po"] for c in word): # http://www.unicode.org/reports/tr44/tr44-6.html#General_Category_Values
                    print("Weird:", word)
                    continue
                else:
                    outfile.write(word+u" "+str(wfreq)+u" "+str(langno)+u"\n")