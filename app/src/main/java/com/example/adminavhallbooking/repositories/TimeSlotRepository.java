package com.example.adminavhallbooking.repositories;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.adminavhallbooking.ui.timeslots.TimeSlot;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.sql.Time;

public class TimeSlotRepository {

    MutableLiveData<TimeSlot> firstyearTimeSlotMutableLiveData,otheryearTimeSlotMutableLiveData;
    public TimeSlotRepository(){
        firstyearTimeSlotMutableLiveData = new MutableLiveData<>();
        firstyearTimeSlotMutableLiveData.setValue(new TimeSlot());
        otheryearTimeSlotMutableLiveData = new MutableLiveData<>();
        otheryearTimeSlotMutableLiveData.setValue(new TimeSlot());
    }


    public void sendTimeSlotTODatabase(Context context, String year, String startTime, String endTime,String lunchTime) {

        TimeSlot timeSlot = new TimeSlot(startTime,endTime,lunchTime);
        FirebaseDatabase.getInstance().getReference().child("TimeSlot").child(year).setValue(timeSlot).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void unused) {
                Toast.makeText(context,"Added Successfully",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void loadTimings(){
        FirebaseDatabase.getInstance().getReference().child("TimeSlot").child("First Year").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                TimeSlot firstYearSlot = snapshot.getValue(TimeSlot.class);
                firstyearTimeSlotMutableLiveData.postValue(firstYearSlot);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        FirebaseDatabase.getInstance().getReference().child("TimeSlot").child("Other Year").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                TimeSlot otherYearSlot = snapshot.getValue(TimeSlot.class);
                otheryearTimeSlotMutableLiveData.postValue(otherYearSlot);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public MutableLiveData<TimeSlot> getFirstyearTimeSlotMutableLiveData(){
        return firstyearTimeSlotMutableLiveData;
    }

    public MutableLiveData<TimeSlot> getOtheryearTimeSlotMutableLiveData(){
        return otheryearTimeSlotMutableLiveData;
    }


}
