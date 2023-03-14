package com.example.adminavhallbooking.ui.teachers;

public class Teacher {

    String firstName;
    String lastName;
    String uid;
    String gmail;
    String phoneNumber;
    String fcmToken;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUid() {
        return uid;
    }

    public String getGmail() {
        return gmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFcmToken() {
        return fcmToken;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFcmToken(String fcmToken) {
        this.fcmToken = fcmToken;
    }
}
