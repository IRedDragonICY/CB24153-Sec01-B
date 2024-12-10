package com.ireddragonicy.laptoptrack;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.ComponentActivity;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends ComponentActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private Button registerButton;
    private Button forgotPasswordButton;

    // Simulated user database: username -> {password, role}
    private static final Map<String, String[]> users = new HashMap<>();

    static {
        users.put("lecturer", new String[]{"12345", "Lecturer"});
        users.put("technician", new String[]{"12345", "Technician"});
        users.put("student", new String[]{"12345", "Student"});
        users.put("itmanager", new String[]{"12345", "ITManager"});
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize UI components
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.login_button);
        registerButton = findViewById(R.id.register_button);
        forgotPasswordButton = findViewById(R.id.forgot_password_button);

        // Set click listener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleLogin();
            }
        });

        // Set click listener for the register button
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToRegister();
            }
        });

        // Set click listener for the forgot password button
        forgotPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showForgotPasswordToast();
            }
        });
    }

    /**
     * Handles the login logic: validates input, authenticates user, and navigates to dashboard.
     */
    private void handleLogin() {
        String username = usernameEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        // Validate input
        if (TextUtils.isEmpty(username)) {
            usernameEditText.setError("Username is required");
            return;
        }

        if (TextUtils.isEmpty(password)) {
            passwordEditText.setError("Password is required");
            return;
        }

        // Authenticate user
        if (users.containsKey(username)) {
            String[] userData = users.get(username);
            String correctPassword = userData[0];
            String role = userData[1];

            if (password.equals(correctPassword)) {
                // Authentication successful
                Toast.makeText(LoginActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                navigateToDashboard(role);
            } else {
                // Incorrect password
                Toast.makeText(LoginActivity.this, "Incorrect password.", Toast.LENGTH_SHORT).show();
            }
        } else {
            // Username not found
            Toast.makeText(LoginActivity.this, "User not found.", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Navigates to the dashboard activity based on user role.
     *
     * @param role The role of the authenticated user.
     */
    private void navigateToDashboard(String role) {
        Intent intent;
        switch (role) {
            case "Lecturer":
                intent = new Intent(LoginActivity.this, LecturerDashboardActivity.class);
                break;
            case "Technician":
                intent = new Intent(LoginActivity.this, TechnicianDashboardActivity.class);
                break;
            case "Student":
                intent = new Intent(LoginActivity.this, StudentDashboardActivity.class);
                break;
            case "ITManager":
                intent = new Intent(LoginActivity.this, ITManagerDashboardActivity.class);
                break;
            default:
                Toast.makeText(this, "Unknown role.", Toast.LENGTH_SHORT).show();
                return;
        }
        startActivity(intent);
        finish(); // Prevent user from returning to login screen
    }

    /**
     * Navigates the user to the RegisterActivity.
     */
    private void navigateToRegister() {
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

    /**
     * Displays a toast message for the "Forgot Password" feature.
     */
    private void showForgotPasswordToast() {
        Toast.makeText(this, "Forgot Password feature coming soon!", Toast.LENGTH_SHORT).show();
    }
}
