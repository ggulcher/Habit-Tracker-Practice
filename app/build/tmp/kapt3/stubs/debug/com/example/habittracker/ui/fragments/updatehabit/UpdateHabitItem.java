package com.example.habittracker.ui.fragments.updatehabit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u0011\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J*\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000fH\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\"\u0010/\u001a\u00020\u001b2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000fH\u0016J\u001a\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020\u001bH\u0002J\b\u0010:\u001a\u00020\u001bH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lcom/example/habittracker/ui/fragments/updatehabit/UpdateHabitItem;", "Landroidx/fragment/app/Fragment;", "Landroid/app/TimePickerDialog$OnTimeSetListener;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "()V", "args", "Lcom/example/habittracker/ui/fragments/updatehabit/UpdateHabitItemArgs;", "getArgs", "()Lcom/example/habittracker/ui/fragments/updatehabit/UpdateHabitItemArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "cleanDate", "", "cleanTime", "day", "", "description", "drawableSelected", "habitViewModel", "Lcom/example/habittracker/ui/viewmodels/HabitViewModel;", "hour", "minute", "month", "timeStamp", "title", "year", "deleteHabit", "", "habit", "Lcom/example/habittracker/data/models/Habit;", "getDateCalendar", "getTimeCalendar", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDateSet", "p0", "Landroid/widget/DatePicker;", "yearX", "monthX", "dayX", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onTimeSet", "TimePicker", "Landroid/widget/TimePicker;", "p1", "p2", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "pickDateAndTime", "updateHabit", "app_debug"})
public final class UpdateHabitItem extends androidx.fragment.app.Fragment implements android.app.TimePickerDialog.OnTimeSetListener, android.app.DatePickerDialog.OnDateSetListener {
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
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.habittracker.ui.fragments.updatehabit.UpdateHabitItemArgs getArgs() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateHabit() {
    }
    
    private final void drawableSelected() {
    }
    
    private final void pickDateAndTime() {
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
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void deleteHabit(com.example.habittracker.data.models.Habit habit) {
    }
    
    public UpdateHabitItem() {
        super();
    }
}