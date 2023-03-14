package com.example.adminavhallbooking.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adminavhallbooking.Models.AVHalls;
import com.example.adminavhallbooking.R;

import java.util.ArrayList;
import java.util.List;

public class AVHallAdapter extends RecyclerView.Adapter<AVHallAdapter.AVHallHolder> {

    private ArrayList<AVHalls> HallList = new ArrayList<>();

    @NonNull
    @Override
    public AVHallHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hall_list_rv, parent, false);
        return new AVHallHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull AVHallHolder holder, int position) {
        AVHalls curr_av = HallList.get(position);
        holder.name.setText(curr_av.getName());
        holder.location.setText(curr_av.getLocation());
        holder.capacity.setText(String.valueOf(curr_av.getCapacity()));
        holder.dept.setText(curr_av.getDept());
    }

    @Override
    public int getItemCount() {
        return HallList.size();
    }

    public void setHalls(ArrayList<AVHalls> halls) {
        this.HallList = halls;
        notifyDataSetChanged();
    }

    public class AVHallHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView location;
        private TextView capacity;
        private TextView dept;

        public AVHallHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.NameTV);
            location = itemView.findViewById(R.id.LocationTV);
            capacity = itemView.findViewById(R.id.CapacityTV);
            dept = itemView.findViewById(R.id.DeptTV);
        }
    }
}
