package com.ireddragonicy.laptoptrack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.ComponentActivity;

public class LecturerDashboardActivity extends ComponentActivity {

    private Button viewAvailableLaptopsButton;
    private Button checkOutLaptopButton;
    private Button reportIssueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturer_dashboard);

        // Initialize UI components
        viewAvailableLaptopsButton = findViewById(R.id.btn_view_available_laptops);
        checkOutLaptopButton = findViewById(R.id.btn_check_out_laptop);
        reportIssueButton = findViewById(R.id.btn_report_issue);

        // Set click listeners
        viewAvailableLaptopsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LecturerDashboardActivity.this, ViewAvailableLaptopsActivity.class);
                startActivity(intent);
            }
        });



        checkOutLaptopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LecturerDashboardActivity.this, CheckOutLaptopActivity.class);
                startActivity(intent);
            }
        });

        reportIssueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LecturerDashboardActivity.this, ReportIssueActivity.class);
                startActivity(intent);
            }
        });

            Button logoutButton = findViewById(R.id.btn_logout);
            logoutButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LecturerDashboardActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            });
    }
}
