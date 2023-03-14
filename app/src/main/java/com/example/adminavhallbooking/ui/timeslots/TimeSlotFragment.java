package com.example.adminavhallbooking.ui.timeslots;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adminavhallbooking.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TimeSlotFragment extends Fragment {

    private com.example.adminavhallbooking.ui.timeslots.TimeSlotViewModel mViewModel;

    public static TimeSlotFragment newInstance() {
        return new TimeSlotFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_time_slot, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(com.example.adminavhallbooking.ui.timeslots.TimeSlotViewModel.class);
        // TODO: Use the ViewModel
    }

}