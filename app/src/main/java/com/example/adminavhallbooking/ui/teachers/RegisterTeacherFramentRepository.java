package com.example.adminavhallbooking.ui.teachers;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class RegisterTeacherFramentRepository {
    interface RegisterCallBack{
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
            }
        });
        
        
    }

    private void sendCredentailToGmail() {

    }
}
