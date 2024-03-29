package com.example.mvvmkotlin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.mvvmkotlin.viewmodel.UserViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityRegisterBinding extends ViewDataBinding {
  @NonNull
  public final EditText EmailRegister;

  @NonNull
  public final EditText NameRegister;

  @NonNull
  public final EditText NumberRegister;

  @NonNull
  public final EditText PasswordRegister;

  @NonNull
  public final Button buttonRegister;

  @Bindable
  protected UserViewModel mRegisterModel;

  protected ActivityRegisterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText EmailRegister, EditText NameRegister, EditText NumberRegister,
      EditText PasswordRegister, Button buttonRegister) {
    super(_bindingComponent, _root, _localFieldCount);
    this.EmailRegister = EmailRegister;
    this.NameRegister = NameRegister;
    this.NumberRegister = NumberRegister;
    this.PasswordRegister = PasswordRegister;
    this.buttonRegister = buttonRegister;
  }

  public abstract void setRegisterModel(@Nullable UserViewModel registerModel);

  @Nullable
  public UserViewModel getRegisterModel() {
    return mRegisterModel;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_register, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityRegisterBinding>inflateInternal(inflater, com.example.mvvmkotlin.R.layout.activity_register, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_register, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityRegisterBinding>inflateInternal(inflater, com.example.mvvmkotlin.R.layout.activity_register, null, false, component);
  }

  public static ActivityRegisterBinding bind(@NonNull View view) {
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
  public static ActivityRegisterBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityRegisterBinding)bind(component, view, com.example.mvvmkotlin.R.layout.activity_register);
  }
}
