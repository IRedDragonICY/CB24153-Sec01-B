package com.ireddragonicy.laptoptrack;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.activity.ComponentActivity;

public class RegisterActivity extends ComponentActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private RadioGroup roleRadioGroup;
    private Button registerButton;
    private Button loginButton; // Tambahkan referensi untuk tombol Login

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register); // Layout untuk layar registrasi

        // Inisialisasi komponen UI
        usernameEditText = findViewById(R.id.register_username);
        passwordEditText = findViewById(R.id.register_password);
        roleRadioGroup = findViewById(R.id.register_radio_group_role);
        registerButton = findViewById(R.id.register_button);
        loginButton = findViewById(R.id.login_button); // Inisialisasi tombol Login

        // Set listener klik untuk tombol register
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleRegistration();
            }
        });

        // Set listener klik untuk tombol Login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToLogin();
            }
        });
    }

    /**
     * Menangani logika registrasi: memvalidasi input dan mensimulasikan pembuatan akun.
     */
    private void handleRegistration() {
        String username = usernameEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();
        int selectedRoleId = roleRadioGroup.getCheckedRadioButtonId();

        // Validasi input
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

        RadioButton selectedRadioButton = findViewById(selectedRoleId);
        String role = selectedRadioButton.getText().toString();


        String toastMessage = "Congratulations! You’re officially part of the LaptopTrack squad! 🎉\n(But remember, your data is still in the void.) 😅";
        Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show();

        usernameEditText.setText("");
        passwordEditText.setText("");
        roleRadioGroup.clearCheck();

        finish();
    }


    private void navigateToLogin() {
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(intent);
        finish(); // Tutup RegisterActivity agar pengguna tidak bisa kembali ke sini dengan tombol Back
    }
}
