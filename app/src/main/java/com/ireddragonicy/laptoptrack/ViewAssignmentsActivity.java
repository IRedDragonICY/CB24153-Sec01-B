package com.ireddragonicy.laptoptrack;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ViewAssignmentsActivity extends ComponentActivity {

    private RecyclerView assignmentsRecyclerView;
    private AssignmentsAdapter assignmentsAdapter;
    private ArrayList<Assignment> assignmentsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_assignments);

        // Initialize RecyclerView
        assignmentsRecyclerView = findViewById(R.id.recycler_view_assignments);
        assignmentsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize data (Replace with actual data fetching logic)
        assignmentsList = new ArrayList<>();
        assignmentsList.add(new Assignment("Laptop001", "Dell XPS 13", "Checked Out", "2024-01-15"));
        assignmentsList.add(new Assignment("Laptop002", "MacBook Pro", "Returned", "2023-12-20"));
        // Add more assignments as needed

        // Initialize Adapter
        assignmentsAdapter = new AssignmentsAdapter(assignmentsList);
        assignmentsRecyclerView.setAdapter(assignmentsAdapter);
    }
}
