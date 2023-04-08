// Generated by view binder compiler. Do not edit!
package com.example.adminavhallbooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TimePicker;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.adminavhallbooking.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SelectimelayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton donebutton;

  @NonNull
  public final TimePicker timepicker;

  private SelectimelayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton donebutton, @NonNull TimePicker timepicker) {
    this.rootView = rootView;
    this.donebutton = donebutton;
    this.timepicker = timepicker;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SelectimelayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SelectimelayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.selectimelayout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SelectimelayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.donebutton;
      MaterialButton donebutton = ViewBindings.findChildViewById(rootView, id);
      if (donebutton == null) {
        break missingId;
      }

      id = R.id.timepicker;
      TimePicker timepicker = ViewBindings.findChildViewById(rootView, id);
      if (timepicker == null) {
        break missingId;
      }

      return new SelectimelayoutBinding((ConstraintLayout) rootView, donebutton, timepicker);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
