package com.ireddragonicy.laptoptrack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.ComponentActivity;

public class StudentDashboardActivity extends ComponentActivity {

    private Button viewAvailableLaptopsButton;
    private Button requestCheckOutButton;
    private Button viewAssignmentsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dashboard);

        // Initialize UI components
        viewAvailableLaptopsButton = findViewById(R.id.btn_view_available_laptops);
        requestCheckOutButton = findViewById(R.id.btn_request_check_out);
        viewAssignmentsButton = findViewById(R.id.btn_view_assignments);

        // Set click listeners
        viewAvailableLaptopsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentDashboardActivity.this, ViewAvailableLaptopsActivity.class);
                startActivity(intent);
            }
        });

        requestCheckOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentDashboardActivity.this, RequestCheckOutActivity.class);
                startActivity(intent);
            }
        });

        viewAssignmentsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentDashboardActivity.this, ViewAssignmentsActivity.class);
                startActivity(intent);
            }
        });

        Button logoutButton = findViewById(R.id.btn_logout);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentDashboardActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
