package com.ireddragonicy.laptoptrack;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.ComponentActivity;

public class ReportIssueActivity extends ComponentActivity {

    private EditText laptopIdEditText;
    private EditText issueDescriptionEditText;
    private Button reportButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_issue);

        // Initialize UI components
        laptopIdEditText = findViewById(R.id.edit_text_report_laptop_id);
        issueDescriptionEditText = findViewById(R.id.edit_text_issue_description);
        reportButton = findViewById(R.id.button_report_issue);

        // Set click listener for the report button
        reportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleReportIssue();
            }
        });
    }

    /**
     * Handles the issue reporting process by validating input and updating the backend or local storage.
     */
    private void handleReportIssue() {
        String laptopId = laptopIdEditText.getText().toString().trim();
        String issueDescription = issueDescriptionEditText.getText().toString().trim();

        // Validate input fields
        if (TextUtils.isEmpty(laptopId)) {
            laptopIdEditText.setError("Laptop ID is required");
            return;
        }

        if (TextUtils.isEmpty(issueDescription)) {
            issueDescriptionEditText.setError("Issue description is required");
            return;
        }

        // TODO: Implement logic to report the issue in the backend or local storage
        // Example: Save the issue report to a database or send it to a server

        // For demonstration, we'll show a success toast
        Toast.makeText(this, "Issue reported for Laptop " + laptopId + " successfully!", Toast.LENGTH_LONG).show();

        // Clear input fields after successful report
        laptopIdEditText.setText("");
        issueDescriptionEditText.setText("");
    }
}
