package com.ireddragonicy.laptoptrack;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.ComponentActivity;

public class UpdateLaptopInfoActivity extends ComponentActivity {

    private EditText laptopIdEditText;
    private EditText laptopModelEditText;
    private EditText laptopStatusEditText;
    private EditText drawerLocationEditText;
    private Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_laptop_info);

        // Initialize UI components
        laptopIdEditText = findViewById(R.id.edit_text_laptop_id);
        laptopModelEditText = findViewById(R.id.edit_text_laptop_model);
        laptopStatusEditText = findViewById(R.id.edit_text_laptop_status);
        drawerLocationEditText = findViewById(R.id.edit_text_drawer_location);
        updateButton = findViewById(R.id.btn_update_laptop_info);

        // Set click listener
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateLaptopInfo();
            }
        });
    }

    /**
     * Validates input and updates the laptop information.
     */
    private void updateLaptopInfo() {
        String laptopId = laptopIdEditText.getText().toString().trim();
        String laptopModel = laptopModelEditText.getText().toString().trim();
        String laptopStatus = laptopStatusEditText.getText().toString().trim();
        String drawerLocation = drawerLocationEditText.getText().toString().trim();

        if (TextUtils.isEmpty(laptopId)) {
            laptopIdEditText.setError("Laptop ID is required");
            return;
        }

        if (TextUtils.isEmpty(laptopModel)) {
            laptopModelEditText.setError("Laptop Model is required");
            return;
        }

        if (TextUtils.isEmpty(laptopStatus)) {
            laptopStatusEditText.setError("Laptop Status is required");
            return;
        }

        if (TextUtils.isEmpty(drawerLocation)) {
            drawerLocationEditText.setError("Drawer Location is required");
            return;
        }

        // TODO: Implement logic to update laptop information in the backend or local storage

        Toast.makeText(this, "Laptop " + laptopId + " information updated successfully!", Toast.LENGTH_SHORT).show();
        finish(); // Close the activity after successful update
    }
}
