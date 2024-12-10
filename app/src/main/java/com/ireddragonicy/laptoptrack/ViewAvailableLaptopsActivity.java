package com.ireddragonicy.laptoptrack;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ViewAvailableLaptopsActivity extends ComponentActivity {

    private RecyclerView laptopsRecyclerView;
    private LaptopsAdapter laptopsAdapter;
    private ArrayList<Laptop> availableLaptopsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_available_laptops);

        // Initialize RecyclerView
        laptopsRecyclerView = findViewById(R.id.recycler_view_available_laptops);
        laptopsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize data (Replace with actual data fetching logic)
        availableLaptopsList = new ArrayList<>();
        availableLaptopsList.add(new Laptop("Laptop001", "Dell XPS 13", "Available", "Drawer A1"));
        availableLaptopsList.add(new Laptop("Laptop002", "MacBook Pro", "Available", "Drawer A2"));
        // Add more laptops as needed

        // Initialize Adapter
        laptopsAdapter = new LaptopsAdapter(availableLaptopsList);
        laptopsRecyclerView.setAdapter(laptopsAdapter);
    }
}
