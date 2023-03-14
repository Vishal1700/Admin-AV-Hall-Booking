package com.example.adminavhallbooking.ui.teachers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adminavhallbooking.R;
import com.example.adminavhallbooking.databinding.DisplaypersonrecyclerviewBinding;

import java.util.ArrayList;
import java.util.Objects;

public class TeacherRecyclerAdpater extends RecyclerView.Adapter<TeacherRecyclerAdpater.ViewHolder> {

    ArrayList<Teacher>  teachersList;
    public TeacherRecyclerAdpater() {

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.displaypersonrecyclerview, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Teacher teacher =  Objects.requireNonNull(teachersList.get(position));
        holder.binding.tachername.setText(teacher.getFirstName()+teacher.getLastName());
        holder.binding.teacherphonenumber.setText(teacher.getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return (teachersList!=null) ? teachersList.size():0;
    }

    public void notify(ArrayList<Teacher> teachers) {
        teachersList = teachers;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        DisplaypersonrecyclerviewBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = DisplaypersonrecyclerviewBinding.bind(itemView);
        }
    }

}
