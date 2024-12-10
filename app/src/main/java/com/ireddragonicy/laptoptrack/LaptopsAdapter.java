package com.ireddragonicy.laptoptrack;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LaptopsAdapter extends RecyclerView.Adapter<LaptopsAdapter.LaptopViewHolder> {

    private List<Laptop> laptopsList;

    public LaptopsAdapter(List<Laptop> laptopsList) {
        this.laptopsList = laptopsList;
    }

    @NonNull
    @Override
    public LaptopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_laptop, parent, false);
        return new LaptopViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull LaptopViewHolder holder, int position) {
        Laptop laptop = laptopsList.get(position);
        holder.laptopId.setText("ID: " + laptop.getId());
        holder.laptopModel.setText("Model: " + laptop.getModel());
        holder.laptopStatus.setText("Status: " + laptop.getStatus());
        holder.laptopDrawer.setText("Drawer: " + laptop.getDrawerLocation());
    }

    @Override
    public int getItemCount() {
        return laptopsList.size();
    }

    public static class LaptopViewHolder extends RecyclerView.ViewHolder {
        public TextView laptopId, laptopModel, laptopStatus, laptopDrawer;

        public LaptopViewHolder(@NonNull View itemView) {
            super(itemView);
            laptopId = itemView.findViewById(R.id.text_view_laptop_id);
            laptopModel = itemView.findViewById(R.id.text_view_laptop_model);
            laptopStatus = itemView.findViewById(R.id.text_view_laptop_status);
            laptopDrawer = itemView.findViewById(R.id.text_view_laptop_drawer);
        }
    }
}
