package com.example.adminavhallbooking.ui.teachers;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.adminavhallbooking.databinding.FragmentRegisterTeacherBinding;
import com.example.adminavhallbooking.repositories.RegisterTeacherFramentRepository;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterTeacherFragment extends Fragment implements RegisterTeacherFramentRepository.RegisterCallBack  {




    String firstName;
    String lastName;
    String gmail;
    String phoneNumber;
    FragmentRegisterTeacherBinding binding;
    void validateInformation(){
        firstName = binding.firstnameedittext.getText().toString();
        lastName = binding.lastnameeditext.getText().toString();
        gmail = binding.gmailedittext.getText().toString();
        phoneNumber = binding.phonenumberedittext.getText().toString();
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

        Matcher m = pattern.matcher(gmail);
        Log.i("firstName",firstName);
        if(firstName.isEmpty()){
            binding.firstnameerrorfield.setError("First Name Cannot be Empty");
        }else if(lastName.isEmpty()){
            binding.lastnamerrorfield.setError("Last Name cannot be Empty");
        }else if (gmail.isEmpty()){
            binding.gmailerrorfield.setError("Email cannot be Empty");
        }else if(!m.matches()){
            binding.gmailerrorfield.setError("Invalid Email Address");
        }else if(phoneNumber.isEmpty()){
            binding.phonenumbererrorfield.setError("Phone Number cannot be Empty");
        }else if(phoneNumber.length()<10){
            binding.phonenumbererrorfield.setError("Invalid Phone Number");
        }else{
            registerUser();
        }


    }

    private void registerUser() {
        RegisterTeacherFramentRepository repository = new RegisterTeacherFramentRepository(firstName,lastName,gmail,phoneNumber);
        repository.registerUser(this);
    }

    @Override
    public void onRegisterComplete() {
        Toast.makeText(getActivity().getApplicationContext(),"Registration SuccessFull",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.registerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateInformation();
            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentRegisterTeacherBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}