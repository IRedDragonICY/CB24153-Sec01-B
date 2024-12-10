package com.ireddragonicy.laptoptrack;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.activity.ComponentActivity;

public class MainActivity extends ComponentActivity {

    private static final int SPLASH_DURATION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro); // Layout for the splash screen

        // Handler to delay the transition to LoginActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent to start LoginActivity
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Close MainActivity so user cannot return to splash screen
            }
        }, SPLASH_DURATION);
    }
}
