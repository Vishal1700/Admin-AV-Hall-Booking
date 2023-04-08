// Generated by view binder compiler. Do not edit!
package com.example.adminavhallbooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.adminavhallbooking.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentTimeSlotBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton addtimebutton;

  @NonNull
  public final CardView firstYearCard;

  @NonNull
  public final MaterialButton firstyearbutton;

  @NonNull
  public final TextView firstyeartimingtextview;

  @NonNull
  public final CardView otherYearCard;

  @NonNull
  public final MaterialButton otheryearbutton;

  @NonNull
  public final TextView otheryeartextview;

  private FragmentTimeSlotBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton addtimebutton, @NonNull CardView firstYearCard,
      @NonNull MaterialButton firstyearbutton, @NonNull TextView firstyeartimingtextview,
      @NonNull CardView otherYearCard, @NonNull MaterialButton otheryearbutton,
      @NonNull TextView otheryeartextview) {
    this.rootView = rootView;
    this.addtimebutton = addtimebutton;
    this.firstYearCard = firstYearCard;
    this.firstyearbutton = firstyearbutton;
    this.firstyeartimingtextview = firstyeartimingtextview;
    this.otherYearCard = otherYearCard;
    this.otheryearbutton = otheryearbutton;
    this.otheryeartextview = otheryeartextview;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTimeSlotBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTimeSlotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_time_slot, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTimeSlotBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addtimebutton;
      FloatingActionButton addtimebutton = ViewBindings.findChildViewById(rootView, id);
      if (addtimebutton == null) {
        break missingId;
      }

      id = R.id.firstYearCard;
      CardView firstYearCard = ViewBindings.findChildViewById(rootView, id);
      if (firstYearCard == null) {
        break missingId;
      }

      id = R.id.firstyearbutton;
      MaterialButton firstyearbutton = ViewBindings.findChildViewById(rootView, id);
      if (firstyearbutton == null) {
        break missingId;
      }

      id = R.id.firstyeartimingtextview;
      TextView firstyeartimingtextview = ViewBindings.findChildViewById(rootView, id);
      if (firstyeartimingtextview == null) {
        break missingId;
      }

      id = R.id.otherYearCard;
      CardView otherYearCard = ViewBindings.findChildViewById(rootView, id);
      if (otherYearCard == null) {
        break missingId;
      }

      id = R.id.otheryearbutton;
      MaterialButton otheryearbutton = ViewBindings.findChildViewById(rootView, id);
      if (otheryearbutton == null) {
        break missingId;
      }

      id = R.id.otheryeartextview;
      TextView otheryeartextview = ViewBindings.findChildViewById(rootView, id);
      if (otheryeartextview == null) {
        break missingId;
      }

      return new FragmentTimeSlotBinding((ConstraintLayout) rootView, addtimebutton, firstYearCard,
          firstyearbutton, firstyeartimingtextview, otherYearCard, otheryearbutton,
          otheryeartextview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
