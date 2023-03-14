package com.example.adminavhallbooking.repositories;

import android.widget.Toast;

import com.example.adminavhallbooking.ui.teachers.SendMail;
import com.example.adminavhallbooking.ui.teachers.Teacher;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class RegisterTeacherFramentRepository {
    public interface RegisterCallBack{
        public void onRegisterComplete();
    }
    DatabaseReference dbRef;
    RegisterTeacherFramentRepository(){

    }
    Teacher teacher;

    public RegisterTeacherFramentRepository(String firstName, String lastName, String gmail, String phoneNumber) {
        dbRef = FirebaseDatabase.getInstance().getReference();
        teacher = new Teacher();
        teacher.setFirstName(firstName);
        teacher.setLastName(lastName);
        teacher.setFcmToken("");
        teacher.setGmail(gmail);
        teacher.setPhoneNumber(phoneNumber);
    }

    public void registerUser(RegisterCallBack registerCallBack) {
        String  uidUser = dbRef.child("User").push().getKey();
        teacher.setUid(uidUser);
        dbRef.child("Teachers").child(uidUser).setValue(teacher).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void unused) {
                registerCallBack.onRegisterComplete();
                SendMail sendMail = new SendMail();
                sendMail.sendmailToGmail(teacher.getGmail());
                registerUserToFirebaseAuth();
            }
        });
        
        
    }

    private void registerUserToFirebaseAuth() {
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(teacher.getGmail(),"abcdefghi").addOnCanceledListener(new OnCanceledListener() {
                @Override
                public void onCanceled() {

                }
            });
    }
}
