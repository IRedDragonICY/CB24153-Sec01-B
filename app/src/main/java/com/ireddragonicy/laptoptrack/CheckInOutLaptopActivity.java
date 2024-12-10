package com.ireddragonicy.laptoptrack;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.activity.ComponentActivity;

public class CheckInOutLaptopActivity extends ComponentActivity {

    private EditText laptopIdEditText;
    private RadioGroup actionRadioGroup;
    private RadioButton checkInRadioButton;
    private RadioButton checkOutRadioButton;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in_out_laptop);

        // Initialize UI components
        laptopIdEditText = findViewById(R.id.edit_text_laptop_id);
        actionRadioGroup = findViewById(R.id.radio_group_action);
        checkInRadioButton = findViewById(R.id.radio_check_in);
        checkOutRadioButton = findViewById(R.id.radio_check_out);
        submitButton = findViewById(R.id.btn_submit_action);

        // Set click listener
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performCheckInOut();
            }
        });
    }

    /**
     * Validates input and performs the check-in or check-out action.
     */
    private void performCheckInOut() {
        String laptopId = laptopIdEditText.getText().toString().trim();
        int selectedActionId = actionRadioGroup.getCheckedRadioButtonId();

        if (TextUtils.isEmpty(laptopId)) {
            laptopIdEditText.setError("Laptop ID is required");
            return;
        }

        if (selectedActionId == -1) {
            Toast.makeText(this, "Please select an action (Check In or Check Out)", Toast.LENGTH_SHORT).show();
            return;
        }

        String action = "";
        if (selectedActionId == R.id.radio_check_in) {
            action = "Checked In";
        } else if (selectedActionId == R.id.radio_check_out) {
            action = "Checked Out";
        }

        // TODO: Implement logic to update laptop status in the backend or local storage

        Toast.makeText(this, "Laptop " + laptopId + " has been " + action, Toast.LENGTH_SHORT).show();
        finish(); // Close the activity after successful action
    }
}
