package com.example.adminavhallbooking.ui.timeslots;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.adminavhallbooking.repositories.TimeSlotRepository;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class TimeSlotViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    MutableLiveData<TimeSlot> firstyearTimeSlotMutableLiveData,otheryearTimeSlotMutableLiveData;
    TimeSlotRepository repository;
    public TimeSlotViewModel(){
        firstyearTimeSlotMutableLiveData = new MutableLiveData<>();
        firstyearTimeSlotMutableLiveData.setValue(new TimeSlot());
        otheryearTimeSlotMutableLiveData = new MutableLiveData<>();
        otheryearTimeSlotMutableLiveData.setValue(new TimeSlot());
        repository = new TimeSlotRepository();
        repository.loadTimings();
    }

    public MutableLiveData<TimeSlot> getFirstyearTimeSlotMutableLiveData() {

        return repository.getFirstyearTimeSlotMutableLiveData();
    }

    public MutableLiveData<TimeSlot> getOtheryearTimeSlotMutableLiveData() {
        return repository.getOtheryearTimeSlotMutableLiveData();
    }
}