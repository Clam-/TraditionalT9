package org.nyanya.android.traditionalt9;

import android.content.Context;
import android.content.SharedPreferences;

public class AppSharedPreferences {

    private static final String defaultKeyPref = "GlobalAppPref";
    private final SharedPreferences sharedPreferences;

    /* used key */
    private static final String isDictionaryLoadedFirstTimePref = "isDictionaryLoadedFirstTime";
    private static final String inputTypingMode = "inputTypingMode";
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

    public void setTypingInputMode(int typingInputMode) {
        sharedPreferences.edit().putInt(inputTypingMode, typingInputMode).commit();
    }

    public int getTypingInputMode() {
        return sharedPreferences.getInt(inputTypingMode, TraditionalT9.MODE_LANG);
    }
}
