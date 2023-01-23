package org.nyanya.android.traditionalt9;

import android.util.Log;

import org.nyanya.android.traditionalt9.LangHelper.LANGUAGE;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CharMap {
	protected static final AbstractList<Map<Character, Integer>> CHARTABLE = new ArrayList<Map<Character, Integer>>(LangHelper.NLANGS);
	static {
		// English
		Map<Character, Integer> enMap = new HashMap<Character, Integer>();
		enMap.put('.', 1); enMap.put(',', 1); enMap.put('!', 1); enMap.put('?', 1);
		enMap.put('-', 1); enMap.put('"', 1); enMap.put('\'', 1); enMap.put('@', 1);
		enMap.put('#', 1); enMap.put('$', 1); enMap.put('%', 1); enMap.put('&', 1);
		enMap.put('*', 1); enMap.put('(', 1); enMap.put(')', 1); enMap.put(':', 1);
		enMap.put(';', 1); enMap.put('/', 1); enMap.put('+', 1); enMap.put('=', 1);
		enMap.put('<', 1); enMap.put('>', 1); enMap.put('^', 1); enMap.put('_', 1);
		enMap.put('~', 1); enMap.put('1', 1);
		enMap.put('a', 2); enMap.put('á', 2); enMap.put('ä', 2); enMap.put('â', 2);
		enMap.put('à', 2); enMap.put('å', 2); enMap.put('b', 2); enMap.put('c', 2);
		enMap.put('ç', 2); enMap.put('2', 2);
		enMap.put('d', 3); enMap.put('e', 3); enMap.put('é', 3); enMap.put('ë', 3);
		enMap.put('è', 3); enMap.put('ê', 3); enMap.put('f', 3); enMap.put('3', 3);
		enMap.put('g', 4); enMap.put('h', 4); enMap.put('i', 4); enMap.put('í', 4);
		enMap.put('ï', 4); enMap.put('4', 4);
		enMap.put('j', 5); enMap.put('k', 5); enMap.put('l', 5); enMap.put('5', 5);
		enMap.put('m', 6); enMap.put('n', 6); enMap.put('ñ', 6); enMap.put('o', 6);
		enMap.put('ó', 6); enMap.put('ö', 6); enMap.put('ô', 6); enMap.put('6', 6);
		enMap.put('p', 7); enMap.put('q', 7); enMap.put('r', 7); enMap.put('s', 7);
		enMap.put('7', 7);
		enMap.put('t', 8); enMap.put('u', 8); enMap.put('û', 6); enMap.put('ü', 8);
		enMap.put('v', 8); enMap.put('8', 8); enMap.put('w', 9);
		enMap.put('x', 9); enMap.put('y', 9); enMap.put('z', 9);
		enMap.put('9', 9); enMap.put('+', 0); enMap.put('0', 0);
		// add extra characters for German and French maps.
		enMap.put('€', 1); enMap.put('ß', 7); // German chars
		enMap.put('æ', 1); enMap.put('î', 4); enMap.put('ù', 8); enMap.put('œ', 6);	// French chars
		enMap.put('ì', 4); enMap.put('ò', 8); // Italian chars
		Map<Character, Integer> endefritmap = Collections.unmodifiableMap(enMap);
		CHARTABLE.add(0, endefritmap);

		// Russian
		Map<Character, Integer> ruMap = new HashMap<Character, Integer>();
		ruMap.put('.', 1); ruMap.put(',', 1); ruMap.put('!', 1); ruMap.put('?', 1);
		ruMap.put('-', 1); ruMap.put('"', 1); ruMap.put('\'', 1); ruMap.put('@', 1);
		ruMap.put('#', 1); ruMap.put('$', 1); ruMap.put('%', 1); ruMap.put('&', 1);
		ruMap.put('*', 1); ruMap.put('(', 1); ruMap.put(')', 1); ruMap.put(':', 1);
		ruMap.put(';', 1); ruMap.put('/', 1); ruMap.put('+', 1); ruMap.put('=', 1);
		ruMap.put('<', 1); ruMap.put('>', 1); ruMap.put('^', 1); ruMap.put('_', 1);
		ruMap.put('~', 1); ruMap.put('1', 1);
		ruMap.put('а', 2); ruMap.put('б', 2); ruMap.put('в', 2); ruMap.put('г', 2);
		ruMap.put('2', 2);
		ruMap.put('д', 3); ruMap.put('е', 3); ruMap.put('ё', 3); ruMap.put('ж', 3);
		ruMap.put('з', 3); ruMap.put('3', 3);
		ruMap.put('и', 4); ruMap.put('й', 4); ruMap.put('к', 4); ruMap.put('л', 4);
		ruMap.put('4', 4);
		ruMap.put('м', 5); ruMap.put('н', 5); ruMap.put('о', 5); ruMap.put('п', 5);
		ruMap.put('5', 5);
		ruMap.put('р', 6); ruMap.put('с', 6); ruMap.put('т', 6); ruMap.put('у', 6);
		ruMap.put('6', 6);
		ruMap.put('ф', 7); ruMap.put('х', 7); ruMap.put('ц', 7); ruMap.put('ч', 7);
		ruMap.put('7', 7);
		ruMap.put('ш', 8); ruMap.put('щ', 8); ruMap.put('ъ', 8); ruMap.put('ы', 8);
		ruMap.put('8', 8);
		ruMap.put('ь', 9); ruMap.put('э', 9); ruMap.put('ю', 9); ruMap.put('я', 9);
		ruMap.put('9', 9);
		ruMap.put('+', 0);
		ruMap.put('0', 0);
	
		// add extra characters for other Cyrillic maps.
		ruMap.put('ґ', 2); ruMap.put('є', 3); ruMap.put('і', 4); ruMap.put('ї', 4);// Ukrainian chars
		// Stub for Bulgarian chars
		// Stub for Bielorussian chars	
		// etc
		CHARTABLE.add(1, Collections.unmodifiableMap(ruMap));

		CHARTABLE.add(2, Collections.unmodifiableMap(endefritmap));
		CHARTABLE.add(3, Collections.unmodifiableMap(endefritmap));
		CHARTABLE.add(4, Collections.unmodifiableMap(endefritmap));
		CHARTABLE.add(5, Collections.unmodifiableMap(ruMap));

		// Hebrew		Map<Character, Integer> heMap = new HashMap<Character, Integer>();
		Map<Character, Integer> heMap = new HashMap<Character, Integer>();
		heMap.put('.', 1); heMap.put(',', 1); heMap.put('!', 1); heMap.put('?', 1);
		heMap.put('-', 1); heMap.put('"', 1); heMap.put('\'', 1); heMap.put('@', 1);
		heMap.put('#', 1); heMap.put('$', 1); heMap.put('%', 1); heMap.put('&', 1);
		heMap.put('*', 1); heMap.put('(', 1); heMap.put(')', 1); heMap.put(':', 1);
		heMap.put(';', 1); heMap.put('/', 1); heMap.put('+', 1); heMap.put('=', 1);
		heMap.put('<', 1); heMap.put('>', 1); heMap.put('^', 1); heMap.put('_', 1);
		heMap.put('~', 1); heMap.put('1', 1);
		heMap.put('ד', 2); heMap.put('ה', 2);
		heMap.put('ו', 2); heMap.put('2', 2);
		heMap.put('א', 3); heMap.put('ב', 3);
		heMap.put('ג', 3); heMap.put('3', 3);
		heMap.put('מ', 4); heMap.put('ם', 4);
		heMap.put('נ', 4); heMap.put('ן', 4); heMap.put('4', 4);
		heMap.put('י', 5);
		heMap.put('כ', 5); heMap.put('ך', 5); heMap.put('ל', 5); heMap.put('5', 5);
		heMap.put('ז', 6); heMap.put('ח', 6); heMap.put('ט', 6); heMap.put('6', 6);
		heMap.put('ר', 7); heMap.put('ש', 7); heMap.put('ת', 7); heMap.put('7', 7);
		heMap.put('צ', 8); heMap.put('ץ', 8); heMap.put('ק', 8); heMap.put('8', 8);
		heMap.put('ס', 9); heMap.put('ע', 9); heMap.put('פ', 9); heMap.put('ף', 9);
		heMap.put('9', 9);
		heMap.put('+', 0); heMap.put('0', 0);

		CHARTABLE.add(6, Collections.unmodifiableMap(heMap));
	}

	protected static final char[][] ENT9TABLE = { { '0', '+' },
		{ '.', ',', '?', '!', '"', '/', '-', '@', '$', '%', '&', '*', '#', '(', ')', '_', '1' },
		{ 'a', 'b', 'c', 'A', 'B', 'C', '2' }, { 'd', 'e', 'f', 'D', 'E', 'F', '3' },
		{ 'g', 'h', 'i', 'G', 'H', 'I', '4' }, { 'j', 'k', 'l', 'J', 'K', 'L', '5' },
		{ 'm', 'n', 'o', 'M', 'N', 'O', '6' }, { 'p', 'q', 'r', 's', 'P', 'Q', 'R', 'S', '7' },
		{ 't', 'u', 'v', 'T', 'U', 'V', '8' }, { 'w', 'x', 'y', 'z', 'W', 'X', 'Y', 'Z', '9' },
		{ ' ', '\n' }, { ' ', '0', '+' }, { '\n' } }; // LAST TWO SPACE ON 0
	protected static final char[][] RUT9TABLE = { { '0', '+' },
		{ '.', ',', '?', '!', '"', '/', '-', '@', '$', '%', '&', '*', '#', '(', ')', '_', '1' },
		{ 'а', 'б', 'в', 'г', 'А', 'Б', 'В', 'Г', '2' }, { 'д', 'е', 'ё', 'ж', 'з', 'Д', 'Е', 'Ё', 'Ж', 'З', '3' },
		{ 'и', 'й', 'к', 'л', 'И', 'Й', 'К', 'Л', '4' }, { 'м', 'н', 'о', 'п', 'М', 'Н', 'О', 'П', '5' },
		{ 'р', 'с', 'т', 'у', 'Р', 'С', 'Т', 'У', '6' }, { 'ф', 'х', 'ц', 'ч', 'Ф', 'Х', 'Ц', 'Ч', '7' },
		{ 'ш', 'щ', 'ъ', 'ы', 'Ш', 'Щ', 'Ъ', 'Ы', '8' }, { 'ь', 'э', 'ю', 'я', 'Ь', 'Э', 'Ю', 'Я', '9' },
		{ ' ', '\n' }, { ' ', '0', '+' }, { '\n' } }; // LAST TWO SPACE ON 0

	protected static final char[][] DET9TABLE = {
		{ '0', '+' },
		{ '.', ',', '?', '!', ':', ';', '"', '\'', '-', '@', '^', '€', '$', '%', '&', '*', '#', '(', ')', '_', '1' },
		{ 'a', 'b', 'c', 'A', 'B', 'C', 'ä', 'Ä','á', 'â', 'à', 'å', 'ç', 'Á', 'Â', 'À', 'Å', 'Ç', '2' },
		{ 'd', 'e', 'f', 'D', 'E', 'F', 'é','ë','è','ê', 'É', 'Ë', 'È', 'Ê', '3' },
		{ 'g', 'h', 'i', 'G', 'H', 'I', 'í', 'ï', 'Í', 'Ï', '4' },
		{ 'j', 'k', 'l', 'J', 'K', 'L', '5' },
		{ 'm', 'n', 'o', 'M', 'N', 'O', 'ö', 'Ö', 'ñ','ó','ô', 'Ñ', 'Ó', 'Ô', '6' },
		{ 'p', 'q', 'r', 's', 'P', 'Q', 'R', 'S', 'ß', '7' },
		{ 't', 'u', 'v', 'T', 'U', 'V', 'ü', 'Ü', 'û', 'Û', '8' },
		{ 'w', 'x', 'y', 'z', 'W', 'X', 'Y', 'Z', '9' },
		{ ' ', '\n' }, { ' ', '0', '+' }, { '\n' } }; // LAST TWO SPACE ON 0

	protected static final char[][] FRT9TABLE = {
		{ '0', '+' },
		{ '.', ',', '?', '!', ':', ';', '"', '/', '-', '@', '^', '€', '$', '%', '&', '*', '#', '(', ')', '_', '1' },
		{ 'a', 'b', 'c', 'A', 'B', 'C', '2', 'â', 'à', 'æ', 'ç', 'Â', 'À', 'Æ', 'Ç'},
		{ 'd', 'e', 'f', 'D', 'E', 'F', '3', 'é', 'è','ê', 'ë', 'É', 'È', 'Ê', 'Ë' },
		{ 'g', 'h', 'i', 'G', 'H', 'I', '4', 'î', 'ï', 'Î', 'Ï' },
		{ 'j', 'k', 'l', 'J', 'K', 'L', '5' },
		{ 'm', 'n', 'o', 'M', 'N', 'O', '6', 'ô', 'œ', 'Ô', 'Œ'},
		{ 'p', 'q', 'r', 's', 'P', 'Q', 'R', 'S', '7' },
		{ 't', 'u', 'v', 'T', 'U', 'V', '8', 'û', 'Û', 'ù', 'Ù', 'ü', 'Ü'},
		{ 'w', 'x', 'y', 'z', 'W', 'X', 'Y', 'Z', '9' },
		{ ' ', '\n' }, { ' ', '0', '+' }, { '\n' } }; // LAST TWO SPACE ON 0

	protected static final char[][] ITT9TABLE = {
		{ '+', '0' },
		{ '.', ',', '?', '!', ':', ';', '"', '/', '-', '@', '^', '€', '$', '%', '&', '*', '#', '(', ')', '_', '1' },
		{ 'a', 'b', 'c', 'A', 'B', 'C', 'à', 'À', '2' }, { 'd', 'e', 'f', 'D', 'E', 'F', 'é', 'è', 'É', 'È', '3' },
		{ 'g', 'h', 'i', 'G', 'H', 'I', 'ì', 'Ì', '4' }, { 'j', 'k', 'l', 'J', 'K', 'L', '5' },
		{ 'm', 'n', 'o', 'M', 'N', 'O', 'ò', 'Ò', '6' }, { 'p', 'q', 'r', 's', 'P', 'Q', 'R', 'S', '7' },
		{ 't', 'u', 'v', 'T', 'U', 'V', 'ù', 'Ù', '8' }, { 'w', 'x', 'y', 'z', 'W', 'X', 'Y', 'Z', '9' },
		{ ' ', '\n' }, { ' ', '0', '+' }, { '\n' } }; // LAST TWO SPACE ON 0

	protected static final char[][] UKT9TABLE = { { '0', '+' },
		{ '.', ',', '?', '!', '\'', '"', '/', '-', '@', '$', '%', '&', '*', '#',  '(', ')', '_', '1' },
		{ 'а', 'б', 'в', 'г', 'ґ', 'А', 'Б', 'В', 'Г', 'Ґ', '2' }, { 'д', 'е', 'є', 'ж', 'з', 'Д', 'Е', 'Є', 'Ж', 'З', '3' },
		{ 'и', 'і', 'ї', 'й', 'к', 'л', 'И', 'І', 'Ї', 'Й', 'К', 'Л', '4' }, { 'м', 'н', 'о', 'п', 'М', 'Н', 'О', 'П', '5' },
		{ 'р', 'с', 'т', 'у', 'Р', 'С', 'Т', 'У', '6' }, { 'ф', 'х', 'ц', 'ч', 'Ф', 'Х', 'Ц', 'Ч', '7' },
		{ 'ш', 'щ', 'Ш', 'Щ', '8' }, { 'ь', 'ю', 'я', 'Ь', 'Ю', 'Я', '9' },
		{ ' ', '\n' }, { ' ', '0', '+' }, { '\n' } }; // LAST TWO SPACE ON 0

	protected static final char[][] HET9TABLE = { { '0', '+' },
		{ '.', ',', '?', '!', '"', '/', '-', '@', '$', '%', '&', '*', '#', '(', ')', '_', '1' },
		{ 'ד', 'ה', 'ו', '2' }, { 'א', 'ב', 'ג', '3' },
		{ 'מ', 'ם', 'נ', 'ן', '4' }, { 'י', 'כ', 'ך', 'ל', '5' },
		{ 'ז', 'ח', 'ט', '6' }, { 'ר', 'ש', 'ת', '7' },
		{ 'צ', 'ץ', 'ק', '8' }, { 'ס', 'ע', 'פ', 'ף', '9' },
		{ ' ', '\n' }, { ' ', '0', '+' }, { '\n' } }; // LAST TWO SPACE ON 0

	protected static final char[][][] T9TABLE = { ENT9TABLE, RUT9TABLE, DET9TABLE, FRT9TABLE, ITT9TABLE, UKT9TABLE, HET9TABLE };

	// last 2 don't matter, are for spaceOnZero extra 'slots' 0 position, and 10 position
	protected static final int[] ENT9CAPSTART = { 0, 0, 3, 3, 3, 3, 3, 4, 3, 4, 0,	 0, 0 };
	protected static final int[] RUT9CAPSTART = { 0, 0, 4, 5, 4, 4, 4, 4, 4, 4, 0,	 0, 0 };
	protected static final int[] DET9CAPSTART = { 0, 0, 3, 3, 3, 3, 3, 4, 3, 4, 0,	 0, 0 };
	protected static final int[] FRT9CAPSTART = { 0, 0, 3, 3, 3, 3, 3, 4, 3, 4, 0,	 0, 0 };
	protected static final int[] ITT9CAPSTART = { 0, 0, 3, 3, 3, 3, 3, 4, 3, 4, 0,	 0, 0 };
	protected static final int[] UKT9CAPSTART = { 0, 0, 5, 5, 6, 4, 4, 4, 2, 3, 0,	 0, 0 };
	protected static final int[] HET9CAPSTART = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,	 0, 0 }; // no CAPS on Hebrew
	protected static final int[][] T9CAPSTART = {ENT9CAPSTART, RUT9CAPSTART, DET9CAPSTART, FRT9CAPSTART, ITT9CAPSTART, UKT9CAPSTART, HET9CAPSTART};

	protected static String getStringSequence(String word, LANGUAGE lang) {
		StringBuilder seq = new StringBuilder();
		String tword = word.toLowerCase(LangHelper.LOCALES[lang.index]);
		for (int i = 0; i < word.length(); i++) {
			char c = tword.charAt(i);
			Integer z = CharMap.CHARTABLE.get(lang.index).get(c);
			if (z == null) {
				Log.e("getStringSequence",
						"ERROR: " + (int) c + " NOT FOUND FOR [" + lang.name() + "] (" + Integer.toHexString((int) c) + ") Index: " + i);
				throw new NullPointerException();
			}
			seq.append(z.toString());
		}
		return seq.toString();
	}
}
