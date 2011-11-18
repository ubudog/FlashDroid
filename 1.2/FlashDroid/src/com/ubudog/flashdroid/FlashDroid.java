package com.ubudog.flashdroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

public class FlashDroid extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // Set screen brightness
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.screenBrightness = 100 / 100.0f;
        getWindow().setAttributes(lp);
        
    }
}