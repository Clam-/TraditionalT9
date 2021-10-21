package org.nyanya.android.traditionalt9;

import android.content.Context;
import android.content.SharedPreferences;

public class AppSharedPreferences {

    private static final String defaultKeyPref = "GlobalAppPref";
    private final SharedPreferences sharedPreferences;

    /* used key */
    private final String isDictionaryLoadedFirstTimePref = "isDictionaryLoadedFirstTime";
    /* used key */

    private static AppSharedPreferences INSTANCE = null;

    public static AppSharedPreferences getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new AppSharedPreferences(context.getApplicationContext());
        }
        return INSTANCE;
    }

    private AppSharedPreferences(Context context) {
        sharedPreferences = context.getApplicationContext().getSharedPreferences(defaultKeyPref, Context.MODE_PRIVATE);
    }

    public boolean isDictionaryLoadedFirstTime() {
        return sharedPreferences.getBoolean(isDictionaryLoadedFirstTimePref, false);
    }

    public void setIsDictionaryLoadedFirstTimePref(boolean loaded) {
        sharedPreferences.edit().putBoolean(isDictionaryLoadedFirstTimePref, loaded).commit();
    }
}
