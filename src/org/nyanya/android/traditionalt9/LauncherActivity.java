package org.nyanya.android.traditionalt9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LauncherActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }

    public void goToSettings(View v) {
        final Intent intent = new Intent(this, TraditionalT9Settings.class);
        startActivity(intent);
    }
}
