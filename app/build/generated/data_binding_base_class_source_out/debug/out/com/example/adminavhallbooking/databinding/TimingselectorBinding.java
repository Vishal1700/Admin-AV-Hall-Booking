// Generated by data binding compiler. Do not edit!
package com.example.adminavhallbooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.adminavhallbooking.R;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class TimingselectorBinding extends ViewDataBinding {
  @NonNull
  public final ImageView cancelbutton;

  @NonNull
  public final MaterialButton donebutton;

  @NonNull
  public final MaterialButton endtimeselectbutton;

  @NonNull
  public final TextView endtimetextview;

  @NonNull
  public final MaterialButton lunchtimebutton;

  @NonNull
  public final AppCompatTextView lunchtimetextview;

  @NonNull
  public final RadioButton radiofirst;

  @NonNull
  public final RadioGroup radiogroup;

  @NonNull
  public final RadioButton radioother;

  @NonNull
  public final TextView simpletextavhalltime;

  @NonNull
  public final MaterialButton starttimeselectbutton;

  @NonNull
  public final AppCompatTextView starttimetextview;

  @NonNull
  public final AppCompatTextView yeartext;

  protected TimingselectorBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView cancelbutton, MaterialButton donebutton, MaterialButton endtimeselectbutton,
      TextView endtimetextview, MaterialButton lunchtimebutton, AppCompatTextView lunchtimetextview,
      RadioButton radiofirst, RadioGroup radiogroup, RadioButton radioother,
      TextView simpletextavhalltime, MaterialButton starttimeselectbutton,
      AppCompatTextView starttimetextview, AppCompatTextView yeartext) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cancelbutton = cancelbutton;
    this.donebutton = donebutton;
    this.endtimeselectbutton = endtimeselectbutton;
    this.endtimetextview = endtimetextview;
    this.lunchtimebutton = lunchtimebutton;
    this.lunchtimetextview = lunchtimetextview;
    this.radiofirst = radiofirst;
    this.radiogroup = radiogroup;
    this.radioother = radioother;
    this.simpletextavhalltime = simpletextavhalltime;
    this.starttimeselectbutton = starttimeselectbutton;
    this.starttimetextview = starttimetextview;
    this.yeartext = yeartext;
  }

  @NonNull
  public static TimingselectorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.timingselector, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TimingselectorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TimingselectorBinding>inflateInternal(inflater, R.layout.timingselector, root, attachToRoot, component);
  }

  @NonNull
  public static TimingselectorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.timingselector, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TimingselectorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TimingselectorBinding>inflateInternal(inflater, R.layout.timingselector, null, false, component);
  }

  public static TimingselectorBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static TimingselectorBinding bind(@NonNull View view, @Nullable Object component) {
    return (TimingselectorBinding)bind(component, view, R.layout.timingselector);
  }
}