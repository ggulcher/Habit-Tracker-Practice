package com.example.habittracker.ui.fragments.createhabit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u000b\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J*\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0016J\"\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0016J\u001a\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0017J\b\u0010(\u001a\u00020\u0015H\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/example/habittracker/ui/fragments/createhabit/CreateHabitItem;", "Landroidx/fragment/app/Fragment;", "Landroid/app/TimePickerDialog$OnTimeSetListener;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "()V", "cleanDate", "", "cleanTime", "day", "", "description", "drawableSelected", "habitViewModel", "Lcom/example/habittracker/ui/viewmodels/HabitViewModel;", "hour", "minute", "month", "timeStamp", "title", "year", "addHabitToDB", "", "getDateCalendar", "getTimeCalendar", "onDateSet", "p0", "Landroid/widget/DatePicker;", "yearX", "monthX", "dayX", "onTimeSet", "TimePicker", "Landroid/widget/TimePicker;", "p1", "p2", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "pickDateAndTime", "app_debug"})
public final class CreateHabitItem extends androidx.fragment.app.Fragment implements android.app.TimePickerDialog.OnTimeSetListener, android.app.DatePickerDialog.OnDateSetListener {
    private java.lang.String title = "";
    private java.lang.String description = "";
    private int drawableSelected = 0;
    private java.lang.String timeStamp = "";
    private int day = 0;
    private int month = 0;
    private int year = 0;
    private int hour = 0;
    private int minute = 0;
    private java.lang.String cleanDate = "";
    private java.lang.String cleanTime = "";
    private com.example.habittracker.ui.viewmodels.HabitViewModel habitViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    private final void pickDateAndTime() {
    }
    
    private final void addHabitToDB() {
    }
    
    private final void drawableSelected() {
    }
    
    @java.lang.Override()
    public void onTimeSet(@org.jetbrains.annotations.Nullable()
    android.widget.TimePicker TimePicker, int p1, int p2) {
    }
    
    @java.lang.Override()
    public void onDateSet(@org.jetbrains.annotations.Nullable()
    android.widget.DatePicker p0, int yearX, int monthX, int dayX) {
    }
    
    private final void getTimeCalendar() {
    }
    
    private final void getDateCalendar() {
    }
    
    public CreateHabitItem() {
        super();
    }
}