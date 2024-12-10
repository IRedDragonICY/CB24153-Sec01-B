package com.ireddragonicy.laptoptrack;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

public class IntroActivity extends ComponentActivity {

    // Duration for the splash screen in milliseconds (e.g., 3 seconds)
    private static final int SPLASH_DURATION = 3000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        // Use a Handler to delay the transition to LoginActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start LoginActivity
                Intent intent = new Intent(IntroActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Close IntroActivity so the user cannot return to it
            }
        }, SPLASH_DURATION);
    }
}
