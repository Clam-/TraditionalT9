package org.nyanya.android.traditionalt9;

import android.content.Context;
import android.content.SharedPreferences;

public class AppSharedPreferences {

    private static final String defaultKeyPref = "GlobalAppPref";
    private final SharedPreferences sharedPreferences;

    /* used key */
    private final String isDictionaryLoadedFirstTimePref = "isDictionaryLoadedFirstTime";
    /* used key */

    public AppSharedPreferences(Context context) {
        sharedPreferences = context.getApplicationContext().getSharedPreferences(defaultKeyPref, Context.MODE_PRIVATE);
    }

    public boolean isDictionaryLoadedFirstTime() {
        return sharedPreferences.getBoolean(isDictionaryLoadedFirstTimePref, false);
    }
}
