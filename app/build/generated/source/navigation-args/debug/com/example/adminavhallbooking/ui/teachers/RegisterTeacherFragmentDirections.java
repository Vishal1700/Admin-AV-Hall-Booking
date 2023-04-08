package com.example.adminavhallbooking.ui.teachers;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.adminavhallbooking.R;

public class RegisterTeacherFragmentDirections {
  private RegisterTeacherFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionNavigationRegisterTeacherToNavigationTeacher() {
    return new ActionOnlyNavDirections(R.id.action_navigation_registerTeacher_to_navigation_teacher);
  }
}
