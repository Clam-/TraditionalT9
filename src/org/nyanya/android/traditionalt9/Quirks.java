package org.nyanya.android.traditionalt9;

import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;

public class Quirks {
    public static Quirks getCurrentPhoneQuirks() {
        Quirks q = new Quirks();

        String manufacturer = Build.MANUFACTURER;
        String model = Build.MODEL;

        Log.v("T9_Quirks", "Get quirks for "+model+" of "+manufacturer);

        if(manufacturer.equals("SHARP")) {
            if(model.equals("SH-01J")) {
                q.leftSoftKey = 0x00000083; //KeyEvent.KEYCODE_F2;
                q.rightSoftKey = 0x00000084; //KeyEvent.KEYCODE_F2;
            }
        }

        return q;
    }


    public int leftSoftKey = KeyEvent.KEYCODE_SOFT_LEFT;
    public int rightSoftKey = KeyEvent.KEYCODE_SOFT_RIGHT;
}
