package com.ireddragonicy.laptoptrack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.ComponentActivity;

public class ITManagerDashboardActivity extends ComponentActivity {

    private Button viewAllStatusesButton;
    private Button checkInOutLaptopButton;
    private Button updateLaptopInfoButton;
    private Button manageDrawerAssignmentsButton;
    private Button manageUserAccountsButton;
    private Button viewAnalyticsReportsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itmanager_dashboard);

        // Initialize UI components
        viewAllStatusesButton = findViewById(R.id.btn_view_all_statuses);
        checkInOutLaptopButton = findViewById(R.id.btn_check_in_out_laptop);
        updateLaptopInfoButton = findViewById(R.id.btn_update_laptop_info);
        manageDrawerAssignmentsButton = findViewById(R.id.btn_manage_drawer_assignments);
        manageUserAccountsButton = findViewById(R.id.btn_manage_user_accounts);
        viewAnalyticsReportsButton = findViewById(R.id.btn_view_analytics_reports);

        viewAllStatusesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ITManagerDashboardActivity.this, ViewAllStatusesActivity.class);
                startActivity(intent);
            }
        });

        checkInOutLaptopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ITManagerDashboardActivity.this, CheckInOutLaptopActivity.class);
                startActivity(intent);
            }
        });

        updateLaptopInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ITManagerDashboardActivity.this, UpdateLaptopInfoActivity.class);
                startActivity(intent);
            }
        });

        manageDrawerAssignmentsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ITManagerDashboardActivity.this, ManageDrawerAssignmentsActivity.class);
                startActivity(intent);
            }
        });

        manageUserAccountsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ITManagerDashboardActivity.this, ManageUserAccountsActivity.class);
                startActivity(intent);
            }
        });

        viewAnalyticsReportsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ITManagerDashboardActivity.this, ViewAnalyticsReportsActivity.class);
                startActivity(intent);
            }
        });

        Button logoutButton = findViewById(R.id.btn_logout);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ITManagerDashboardActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
