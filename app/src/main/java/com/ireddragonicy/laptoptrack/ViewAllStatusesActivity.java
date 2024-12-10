package com.ireddragonicy.laptoptrack;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ViewAllStatusesActivity extends ComponentActivity {

    private RecyclerView statusesRecyclerView;
    private LaptopsAdapter laptopsAdapter;
    private ArrayList<Laptop> allLaptopsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_statuses);

        // Initialize RecyclerView
        statusesRecyclerView = findViewById(R.id.recycler_view_all_statuses);
        statusesRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize data (Replace with actual data fetching logic)
        allLaptopsList = new ArrayList<>();
        allLaptopsList.add(new Laptop("Laptop001", "Dell XPS 13", "Checked Out", "Drawer A1"));
        allLaptopsList.add(new Laptop("Laptop002", "MacBook Pro", "Available", "Drawer A2"));
        allLaptopsList.add(new Laptop("Laptop003", "HP Spectre x360", "Under Maintenance", "Drawer A3"));
        // Add more laptops as needed

        // Initialize Adapter
        laptopsAdapter = new LaptopsAdapter(allLaptopsList);
        statusesRecyclerView.setAdapter(laptopsAdapter);
    }
}
