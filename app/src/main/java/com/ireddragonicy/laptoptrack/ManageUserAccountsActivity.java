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

public class ManageUserAccountsActivity extends ComponentActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private RadioGroup roleRadioGroup;
    private Button createUserButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_user_accounts);

        // Initialize UI components
        usernameEditText = findViewById(R.id.edit_text_username);
        passwordEditText = findViewById(R.id.edit_text_password);
        roleRadioGroup = findViewById(R.id.radio_group_role);
        createUserButton = findViewById(R.id.btn_create_user);

        // Set click listener
        createUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createUserAccount();
            }
        });
    }

    /**
     * Validates input and creates a new user account.
     */
    private void createUserAccount() {
        String username = usernameEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();
        int selectedRoleId = roleRadioGroup.getCheckedRadioButtonId();

        if (TextUtils.isEmpty(username)) {
            usernameEditText.setError("Username is required");
            return;
        }

        if (TextUtils.isEmpty(password)) {
            passwordEditText.setError("Password is required");
            return;
        }

        if (selectedRoleId == -1) {
            Toast.makeText(this, "Please select a role", Toast.LENGTH_SHORT).show();
            return;
        }

        String role = "";
        // Replace switch-case with if-else to avoid "Constant expression required" error
        if (selectedRoleId == R.id.radio_role_lecturer) {
            role = "Lecturer";
        } else if (selectedRoleId == R.id.radio_role_technician) {
            role = "Technician";
        } else if (selectedRoleId == R.id.radio_role_student) {
            role = "Student";
        } else if (selectedRoleId == R.id.radio_role_itmanager) {
            role = "ITManager";
        } else {
            role = "User";
        }

        // TODO: Implement logic to create user account in the backend or local storage
        // Example: Save to a database or send to a server

        Toast.makeText(this, "User " + username + " with role " + role + " created successfully!", Toast.LENGTH_SHORT).show();
        finish(); // Close the activity after successful creation
    }
}
