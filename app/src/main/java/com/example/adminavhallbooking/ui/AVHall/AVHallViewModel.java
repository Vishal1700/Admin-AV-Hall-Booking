package com.example.adminavhallbooking.UI.AVHall;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.adminavhallbooking.Models.AVHalls;
import com.example.adminavhallbooking.Repositories.AvHallsRepoistory;

import java.util.List;

public class AVHallViewModel extends ViewModel {

    private AvHallsRepoistory avHallsRepoistory;
    private MutableLiveData<List<AVHalls>> hallList = new MutableLiveData<>();

    public AVHallViewModel() {
        avHallsRepoistory = new AvHallsRepoistory();
        getAvHalls();
    }
    public void addHall(AVHalls avHall) {
        avHallsRepoistory.AddAvHall(avHall);
    }

    public LiveData<List<AVHalls>> getAvHalls() {
        if(hallList.getValue()==null) {
            hallList = (MutableLiveData<List<AVHalls>>) avHallsRepoistory.getAvHalls();
        }
        return hallList;
    }
}