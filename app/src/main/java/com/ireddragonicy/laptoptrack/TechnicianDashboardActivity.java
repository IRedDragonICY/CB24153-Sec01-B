package com.ireddragonicy.laptoptrack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.ComponentActivity;

public class TechnicianDashboardActivity extends ComponentActivity {

    private Button viewAllStatusesButton;
    private Button checkInOutLaptopButton;
    private Button updateLaptopInfoButton;
    private Button manageDrawerAssignmentsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technician_dashboard);

        // Initialize UI components
        viewAllStatusesButton = findViewById(R.id.btn_view_all_statuses);
        checkInOutLaptopButton = findViewById(R.id.btn_check_in_out_laptop);
        updateLaptopInfoButton = findViewById(R.id.btn_update_laptop_info);
        manageDrawerAssignmentsButton = findViewById(R.id.btn_manage_drawer_assignments);

        // Set click listeners
//        viewAllStatusesButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(TechnicianDashboardActivity.this, ViewAllStatusesActivity.class);
//                startActivity(intent);
//            }
//        });

//        checkInOutLaptopButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(TechnicianDashboardActivity.this, CheckInOutLaptopActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        updateLaptopInfoButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(TechnicianDashboardActivity.this, UpdateLaptopInfoActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        manageDrawerAssignmentsButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(TechnicianDashboardActivity.this, ManageDrawerAssignmentsActivity.class);
//                startActivity(intent);
//            }
//        });

        Button logoutButton = findViewById(R.id.btn_logout);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TechnicianDashboardActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
