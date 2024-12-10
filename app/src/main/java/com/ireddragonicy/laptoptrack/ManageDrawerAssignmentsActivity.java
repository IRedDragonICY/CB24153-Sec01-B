package com.ireddragonicy.laptoptrack;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.ComponentActivity;

public class ManageDrawerAssignmentsActivity extends ComponentActivity {

    private EditText laptopIdEditText;
    private EditText newDrawerLocationEditText;
    private Button assignDrawerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_drawer_assignments);

        // Initialize UI components
        laptopIdEditText = findViewById(R.id.edit_text_laptop_id);
        newDrawerLocationEditText = findViewById(R.id.edit_text_new_drawer_location);
        assignDrawerButton = findViewById(R.id.btn_assign_drawer);

        // Set click listener
        assignDrawerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                assignDrawer();
            }
        });
    }

    /**
     * Validates input and assigns a new drawer location to the laptop.
     */
    private void assignDrawer() {
        String laptopId = laptopIdEditText.getText().toString().trim();
        String newDrawerLocation = newDrawerLocationEditText.getText().toString().trim();

        if (TextUtils.isEmpty(laptopId)) {
            laptopIdEditText.setError("Laptop ID is required");
            return;
        }

        if (TextUtils.isEmpty(newDrawerLocation)) {
            newDrawerLocationEditText.setError("New Drawer Location is required");
            return;
        }

        // TODO: Implement logic to update drawer assignment in the backend or local storage

        Toast.makeText(this, "Laptop " + laptopId + " assigned to " + newDrawerLocation, Toast.LENGTH_SHORT).show();
        finish(); // Close the activity after successful assignment
    }
}
