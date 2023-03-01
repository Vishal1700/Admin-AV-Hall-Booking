package com.example.adminavhallbooking.ui.AVHall;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.adminavhallbooking.databinding.FragmentAvhallBinding;
import com.example.adminavhallbooking.databinding.FragmentAvhallBinding;

public class AVHallFragment extends Fragment {

    private FragmentAvhallBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AVHallViewModel AVHallViewModel =
                new ViewModelProvider(this).get(AVHallViewModel.class);

        binding = FragmentAvhallBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        AVHallViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}