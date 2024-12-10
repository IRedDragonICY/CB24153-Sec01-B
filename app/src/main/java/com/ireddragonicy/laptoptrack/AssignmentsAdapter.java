package com.ireddragonicy.laptoptrack;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AssignmentsAdapter extends RecyclerView.Adapter<AssignmentsAdapter.AssignmentViewHolder> {

    private List<Assignment> assignmentsList;

    public AssignmentsAdapter(List<Assignment> assignmentsList) {
        this.assignmentsList = assignmentsList;
    }

    @NonNull
    @Override
    public AssignmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_assignment, parent, false);
        return new AssignmentViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AssignmentViewHolder holder, int position) {
        Assignment assignment = assignmentsList.get(position);
        holder.laptopId.setText("ID: " + assignment.getLaptopId());
        holder.laptopModel.setText("Model: " + assignment.getLaptopModel());
        holder.status.setText("Status: " + assignment.getStatus());
        holder.date.setText("Date: " + assignment.getDate());
    }

    @Override
    public int getItemCount() {
        return assignmentsList.size();
    }

    public static class AssignmentViewHolder extends RecyclerView.ViewHolder {
        public TextView laptopId, laptopModel, status, date;

        public AssignmentViewHolder(@NonNull View itemView) {
            super(itemView);
            laptopId = itemView.findViewById(R.id.text_view_assignment_laptop_id);
            laptopModel = itemView.findViewById(R.id.text_view_assignment_laptop_model);
            status = itemView.findViewById(R.id.text_view_assignment_status);
            date = itemView.findViewById(R.id.text_view_assignment_date);
        }
    }
}
