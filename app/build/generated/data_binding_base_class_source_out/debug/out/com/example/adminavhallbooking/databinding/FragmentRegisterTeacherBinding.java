// Generated by view binder compiler. Do not edit!
package com.example.adminavhallbooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.adminavhallbooking.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRegisterTeacherBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextInputEditText firstnameedittext;

  @NonNull
  public final TextInputLayout firstnameerrorfield;

  @NonNull
  public final TextInputEditText gmailedittext;

  @NonNull
  public final TextInputLayout gmailerrorfield;

  @NonNull
  public final TextInputEditText lastnameeditext;

  @NonNull
  public final TextInputLayout lastnamerrorfield;

  @NonNull
  public final TextInputEditText phonenumberedittext;

  @NonNull
  public final TextInputLayout phonenumbererrorfield;

  @NonNull
  public final MaterialButton registerbutton;

  @NonNull
  public final TextView textView;

  private FragmentRegisterTeacherBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextInputEditText firstnameedittext, @NonNull TextInputLayout firstnameerrorfield,
      @NonNull TextInputEditText gmailedittext, @NonNull TextInputLayout gmailerrorfield,
      @NonNull TextInputEditText lastnameeditext, @NonNull TextInputLayout lastnamerrorfield,
      @NonNull TextInputEditText phonenumberedittext,
      @NonNull TextInputLayout phonenumbererrorfield, @NonNull MaterialButton registerbutton,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.firstnameedittext = firstnameedittext;
    this.firstnameerrorfield = firstnameerrorfield;
    this.gmailedittext = gmailedittext;
    this.gmailerrorfield = gmailerrorfield;
    this.lastnameeditext = lastnameeditext;
    this.lastnamerrorfield = lastnamerrorfield;
    this.phonenumberedittext = phonenumberedittext;
    this.phonenumbererrorfield = phonenumbererrorfield;
    this.registerbutton = registerbutton;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRegisterTeacherBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRegisterTeacherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_register_teacher, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRegisterTeacherBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.firstnameedittext;
      TextInputEditText firstnameedittext = ViewBindings.findChildViewById(rootView, id);
      if (firstnameedittext == null) {
        break missingId;
      }

      id = R.id.firstnameerrorfield;
      TextInputLayout firstnameerrorfield = ViewBindings.findChildViewById(rootView, id);
      if (firstnameerrorfield == null) {
        break missingId;
      }

      id = R.id.gmailedittext;
      TextInputEditText gmailedittext = ViewBindings.findChildViewById(rootView, id);
      if (gmailedittext == null) {
        break missingId;
      }

      id = R.id.gmailerrorfield;
      TextInputLayout gmailerrorfield = ViewBindings.findChildViewById(rootView, id);
      if (gmailerrorfield == null) {
        break missingId;
      }

      id = R.id.lastnameeditext;
      TextInputEditText lastnameeditext = ViewBindings.findChildViewById(rootView, id);
      if (lastnameeditext == null) {
        break missingId;
      }

      id = R.id.lastnamerrorfield;
      TextInputLayout lastnamerrorfield = ViewBindings.findChildViewById(rootView, id);
      if (lastnamerrorfield == null) {
        break missingId;
      }

      id = R.id.phonenumberedittext;
      TextInputEditText phonenumberedittext = ViewBindings.findChildViewById(rootView, id);
      if (phonenumberedittext == null) {
        break missingId;
      }

      id = R.id.phonenumbererrorfield;
      TextInputLayout phonenumbererrorfield = ViewBindings.findChildViewById(rootView, id);
      if (phonenumbererrorfield == null) {
        break missingId;
      }

      id = R.id.registerbutton;
      MaterialButton registerbutton = ViewBindings.findChildViewById(rootView, id);
      if (registerbutton == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new FragmentRegisterTeacherBinding((ConstraintLayout) rootView, firstnameedittext,
          firstnameerrorfield, gmailedittext, gmailerrorfield, lastnameeditext, lastnamerrorfield,
          phonenumberedittext, phonenumbererrorfield, registerbutton, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}