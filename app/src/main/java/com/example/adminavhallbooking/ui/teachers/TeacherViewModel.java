package com.example.adminavhallbooking.ui.teachers;

import android.provider.ContactsContract;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashSet;

public class TeacherViewModel extends ViewModel {

    private final MutableLiveData<ArrayList<Teacher>>  teachersMutableArrayList;
    HashSet<String> teachersHashSet;

    DatabaseReference databaseRef;
    public TeacherViewModel() {
        teachersMutableArrayList= new MutableLiveData<>();
        teachersMutableArrayList.setValue(new ArrayList<>());
        teachersHashSet  = new HashSet<>();
        databaseRef = FirebaseDatabase.getInstance().getReference();
        loadData();
    }

    public void loadData(){
        databaseRef.child("Teachers").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot:snapshot.getChildren()){

                    Teacher teacher  = dataSnapshot.getValue(Teacher.class);
                    if(teachersHashSet.contains(teacher.getUid())){
                        continue;
                    }
                    teachersHashSet.add(teacher.getUid());
                    teachersMutableArrayList.getValue().add(teacher);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public MutableLiveData<ArrayList<Teacher>> getList() {
        return teachersMutableArrayList;
    }
}