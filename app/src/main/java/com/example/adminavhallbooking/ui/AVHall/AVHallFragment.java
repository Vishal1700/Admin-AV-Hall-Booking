package com.example.adminavhallbooking.UI.AVHall;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.adminavhallbooking.Adapters.AVHallAdapter;
import com.example.adminavhallbooking.Models.AVHalls;
import com.example.adminavhallbooking.R;
import com.example.adminavhallbooking.databinding.FragmentAvhallBinding;
import com.example.adminavhallbooking.databinding.FragmentAvhallBinding;
import com.example.adminavhallbooking.UI.AVHall.AVHallViewModel;

import java.util.ArrayList;
import java.util.List;

public class AVHallFragment extends Fragment {

    private FragmentAvhallBinding binding;
    private AVHallViewModel avHallViewModel;
    private AVHallAdapter avHallAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AVHallViewModel avHallViewModel = new ViewModelProvider(this).get(AVHallViewModel.class);

        binding = FragmentAvhallBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = new Dialog(getContext());
        avHallViewModel = new ViewModelProvider(this).get(AVHallViewModel.class);

        avHallAdapter = new AVHallAdapter();
        binding.recyclerView.setAdapter(avHallAdapter);

        avHallViewModel.getAvHalls().observe(getViewLifecycleOwner(), avHalls -> {
            avHallAdapter.setHalls((ArrayList<AVHalls>) avHalls);
            avHallAdapter.notifyDataSetChanged();

        });

        binding.AddHallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setContentView(R.layout.add_av_hall_dialog);
                dialog.show();
                dialog.setCancelable(false);
                Button OkBtn = dialog.findViewById(R.id.done_btn);
                OkBtn.setOnClickListener(view1 -> {


                    EditText HallNameET = dialog.findViewById(R.id.hall_name_et);
                    EditText HallLocationET = dialog.findViewById(R.id.hall_location_et);
                    EditText HallCapacityET = dialog.findViewById(R.id.hall_capacity_et);
                    EditText DeptET = dialog.findViewById(R.id.hall_dept_et);

                    String HallName = HallNameET.getText().toString();
                    String HallLocation = HallLocationET.getText().toString();
                    String HallCapacity = HallCapacityET.getText().toString();
                    String Dept = DeptET.getText().toString();

                    AVHalls hall = new AVHalls();

                    //Validation
                    if(HallName.isEmpty()) {
                        Toast.makeText(getContext(), "Please specify the hall name", Toast.LENGTH_SHORT).show();
                    }
                    else if(HallLocation.isEmpty()) {
                        Toast.makeText(getContext(), "Please specify the hall location", Toast.LENGTH_SHORT).show();
                    }
                    else if(HallCapacity.isEmpty()) {
                        Toast.makeText(getContext(), "Please specify the hall capacity", Toast.LENGTH_SHORT).show();
                    }
                    else if(Dept.isEmpty()) {
                        Toast.makeText(getContext(), "Please specify the department", Toast.LENGTH_SHORT).show();
                    }

                    else{
                        hall.setName(HallName);
                        hall.setLocation(HallLocation);
                        hall.setCapacity(Integer.parseInt(HallCapacity));
                        hall.setDept(Dept);
                        avHallViewModel.addHall(hall);
                        Toast.makeText(getContext(), "SENDING DATA", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }


                });

                ImageView Cancel = dialog.findViewById(R.id.CancelBtn);
                Cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });

            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}