package com.ireddragonicy.laptoptrack;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.ComponentActivity;

public class CheckOutLaptopActivity extends ComponentActivity {

    private EditText laptopIdEditText;
    private EditText userNameEditText;
    private Button checkoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out_laptop);

        // Initialize UI components
        laptopIdEditText = findViewById(R.id.edit_text_laptop_id);
        userNameEditText = findViewById(R.id.edit_text_user_name);
        checkoutButton = findViewById(R.id.button_checkout);

        // Set click listener for the checkout button
        checkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleCheckout();
            }
        });
    }

    /**
     * Handles the laptop checkout process by validating input and updating the backend or local storage.
     */
    private void handleCheckout() {
        String laptopId = laptopIdEditText.getText().toString().trim();
        String userName = userNameEditText.getText().toString().trim();

        // Validate input fields
        if (TextUtils.isEmpty(laptopId)) {
            laptopIdEditText.setError("Laptop ID is required");
            return;
        }

        if (TextUtils.isEmpty(userName)) {
            userNameEditText.setError("Your Name is required");
            return;
        }

        // TODO: Implement logic to perform checkout in the backend or local storage
        // Example: Update laptop status to "Checked Out" and assign to the user

        // For demonstration, we'll show a success toast
        Toast.makeText(this, "Laptop " + laptopId + " checked out by " + userName + " successfully!", Toast.LENGTH_LONG).show();

        // Clear input fields after successful checkout
        laptopIdEditText.setText("");
        userNameEditText.setText("");
    }
}
