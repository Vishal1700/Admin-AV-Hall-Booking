package com.example.adminavhallbooking.ui.teachers;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.adminavhallbooking.R;

public class TeacherFragmentDirections {
  private TeacherFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionNavigationTeacherToNavigationRegisterTeacher() {
    return new ActionOnlyNavDirections(R.id.action_navigation_teacher_to_navigation_registerTeacher);
  }
}
