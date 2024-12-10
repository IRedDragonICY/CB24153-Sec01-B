package com.ireddragonicy.laptoptrack;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.ComponentActivity;

public class RequestCheckOutActivity extends ComponentActivity {

    private EditText laptopIdEditText;
    private Button requestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_check_out);

        // Initialize UI components
        laptopIdEditText = findViewById(R.id.edit_text_laptop_id);
        requestButton = findViewById(R.id.btn_request_check_out);

        // Set click listener
        requestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitCheckOutRequest();
            }
        });
    }

    /**
     * Validates input and submits a laptop check-out request.
     */
    private void submitCheckOutRequest() {
        String laptopId = laptopIdEditText.getText().toString().trim();

        if (TextUtils.isEmpty(laptopId)) {
            laptopIdEditText.setError("Laptop ID is required");
            return;
        }

        // TODO: Implement logic to submit check-out request to the backend for approval

        Toast.makeText(this, "Check-out request for Laptop " + laptopId + " submitted successfully!", Toast.LENGTH_SHORT).show();
        finish(); // Close the activity after submission
    }
}
