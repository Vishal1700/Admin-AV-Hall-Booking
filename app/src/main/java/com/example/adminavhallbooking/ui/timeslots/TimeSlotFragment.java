package com.example.adminavhallbooking.ui.timeslots;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.adminavhallbooking.R;
import com.example.adminavhallbooking.databinding.FragmentTimeSlotBinding;
import com.example.adminavhallbooking.repositories.TimeSlotRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TimeSlotFragment extends Fragment {
    FragmentTimeSlotBinding binding;
    private com.example.adminavhallbooking.ui.timeslots.TimeSlotViewModel mViewModel;
    Dialog addTimeDialog , selectTimeDialog;

    int selected;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentTimeSlotBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(com.example.adminavhallbooking.ui.timeslots.TimeSlotViewModel.class);
        setDialog();
        mViewModel.getFirstyearTimeSlotMutableLiveData().observe(getViewLifecycleOwner(), new Observer<TimeSlot>() {
            @Override
            public void onChanged(TimeSlot timeSlot) {
                if(timeSlot == null)
                        return;
                if(timeSlot.startTime == null)
                        return;

                String time = timeSlot.getEndTime();
                SimpleDateFormat df = new SimpleDateFormat("HH:mm");
                Date d = null;
                try {
                    d = df.parse(time);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                Calendar cal = Calendar.getInstance();
                cal.setTime(d);
                cal.add(Calendar.MINUTE, 35);

                String endlunchtime = df.format(cal.getTime());


                binding.firstyeartimingtextview.setText(makeString(timeSlot.startTime,timeSlot.endTime,timeSlot.lunchTime,endlunchtime));
                binding.firstyeartimingtextview.setVisibility(View.VISIBLE);
            }
        });

        mViewModel.getOtheryearTimeSlotMutableLiveData().observe(getViewLifecycleOwner(), new Observer<TimeSlot>() {
            @Override
            public void onChanged(TimeSlot timeSlot) {
                if(timeSlot == null)
                    return;

                if(timeSlot.startTime == null)
                    return;


                String time = timeSlot.getEndTime();
                SimpleDateFormat df = new SimpleDateFormat("HH:mm");
                Date d = null;
                try {
                    d = df.parse(time);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                Calendar cal = Calendar.getInstance();
                cal.setTime(d);
                cal.add(Calendar.MINUTE, 35);
                String endlunchtime = df.format(cal.getTime());

                binding.otheryeartextview.setVisibility(View.VISIBLE);
                binding.otheryeartextview.setText(makeString(timeSlot.startTime,timeSlot.endTime,timeSlot.lunchTime,endlunchtime));
            }
        });
        addOnClickListeners();

    }

    private String makeString(String startTime, String endTime, String lunchTime, String endlunchtime) {
        return "From " + startTime + " to " + endTime +"\n" + "Lunch Time : " + lunchTime +" to " + endlunchtime;
    }

    private void addOnClickListeners() {
        binding.addtimebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTimeDialog.show();
                addTimeDialog.findViewById(R.id.radiofirst).setActivated(true);
            }
        });


        addTimeDialog.findViewById(R.id.radiofirst).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTimeDialog.findViewById(R.id.radioother).setActivated(false);
                addTimeDialog.findViewById(R.id.radiofirst).setActivated(true);
            }
        });

        addTimeDialog.findViewById(R.id.radioother).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTimeDialog.findViewById(R.id.radioother).setActivated(true);
                addTimeDialog.findViewById(R.id.radiofirst).setActivated(false);
            }
        });

        addTimeDialog.findViewById(R.id.cancelbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTimeDialog.dismiss();
            }
        });

        addTimeDialog.findViewById(R.id.starttimeselectbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected = 0;
                selectTimeDialog.show();
            }
        });

        addTimeDialog.findViewById(R.id.lunchtimebutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected = 2;
                selectTimeDialog.show();
            }
        });

        addTimeDialog.findViewById(R.id.endtimeselectbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected = 1;
                selectTimeDialog.show();

            }
        });

        selectTimeDialog.findViewById(R.id.donebutton).setOnClickListener(v -> setTime());

        addTimeDialog.findViewById(R.id.donebutton).setOnClickListener(v -> {
            TimeSlotRepository repository = new TimeSlotRepository();
            TextView starttimeTextView = addTimeDialog.findViewById(R.id.starttimetextview);
            TextView endtimeTextView = addTimeDialog.findViewById(R.id.endtimetextview);
            TextView lunchTimeTextView = addTimeDialog.findViewById(R.id.lunchtimetextview);
            String startTime = starttimeTextView.getText().toString();
            String endTime  = endtimeTextView.getText().toString();
            String lunchTime = lunchTimeTextView.getText().toString();
            if(addTimeDialog.findViewById(R.id.radiofirst).isActivated()){
                repository.sendTimeSlotTODatabase(getContext(),"First Year",startTime,endTime,lunchTime);
            }else{
                repository.sendTimeSlotTODatabase(getContext(),"Other Year",startTime,endTime,lunchTime);
            }
            addTimeDialog.dismiss();
        });


    }

    private void setTime() {
        if(selected == 1){
            AppCompatTextView endtimeTextView = addTimeDialog.findViewById(R.id.endtimetextview);
            TimePicker picker = selectTimeDialog.findViewById(R.id.timepicker);
            endtimeTextView.setText(picker.getHour() + ":"+picker.getMinute());
        }else if (selected == 0){
            AppCompatTextView starttimeTextView = addTimeDialog.findViewById(R.id.starttimetextview);
            TimePicker picker = selectTimeDialog.findViewById(R.id.timepicker);
            starttimeTextView.setText(picker.getHour() + ":"+picker.getMinute());
        }else{
            AppCompatTextView lunchtimeTextViwe = addTimeDialog.findViewById(R.id.lunchtimetextview);
            TimePicker picker = selectTimeDialog.findViewById(R.id.timepicker);
            lunchtimeTextViwe.setText(picker.getHour() + ":"+picker.getMinute());
        }
        selectTimeDialog.dismiss();
    }


    private void setDialog() {
        addTimeDialog = new Dialog(getContext());
        addTimeDialog.setContentView(R.layout.timingselector);
        addTimeDialog.setCancelable(false);
        selectTimeDialog = new Dialog(getContext());
        selectTimeDialog.setContentView(R.layout.selectimelayout);
        selectTimeDialog.setCancelable(false);
        TimePicker pick = selectTimeDialog.findViewById(R.id.timepicker);
        pick.setIs24HourView(true);
    }


}