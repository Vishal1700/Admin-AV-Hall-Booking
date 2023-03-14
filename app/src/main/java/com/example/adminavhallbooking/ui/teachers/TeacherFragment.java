package com.example.adminavhallbooking.UI.teachers;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adminavhallbooking.R;
import com.example.adminavhallbooking.databinding.FragmentTeacherBinding;

import java.util.ArrayList;

public class TeacherFragment extends Fragment {
    TeacherViewModel teacherViewModel;
    private FragmentTeacherBinding binding;

    NavController navController;
    TeacherRecyclerAdpater teacherRecyclerAdpater;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        teacherViewModel = new ViewModelProvider(this).get(TeacherViewModel.class);
        teacherRecyclerAdpater = new TeacherRecyclerAdpater(new ArrayList<>());


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        binding.addteacherbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavDirections action = TeacherFragmentDirections.actionNavigationTeacherToNavigationRegisterTeacher();
               navController.navigate(action);
            }
        });
        RecyclerView recyclerView = getView().findViewById(R.id.teacherrecyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(teacherRecyclerAdpater);
        teacherViewModel.getList().observe(getViewLifecycleOwner(), new Observer<ArrayList<Teacher>>() {
            @Override
            public void onChanged(ArrayList<Teacher> teachers) {
                teacherRecyclerAdpater.teachersList = teachers;
                teacherRecyclerAdpater.notify(teachers);

            }
        });
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        binding = FragmentTeacherBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}