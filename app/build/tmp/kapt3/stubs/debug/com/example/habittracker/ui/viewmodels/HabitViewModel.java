package com.example.habittracker.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/habittracker/ui/viewmodels/HabitViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getAllHabits", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/habittracker/data/models/Habit;", "getGetAllHabits", "()Landroidx/lifecycle/LiveData;", "repository", "Lcom/example/habittracker/logic/repository/HabitRepository;", "addHabit", "", "habit", "deleteAllHabits", "deleteHabit", "updateHabit", "app_debug"})
public final class HabitViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.habittracker.logic.repository.HabitRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.habittracker.data.models.Habit>> getAllHabits = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.habittracker.data.models.Habit>> getGetAllHabits() {
        return null;
    }
    
    public final void addHabit(@org.jetbrains.annotations.NotNull()
    com.example.habittracker.data.models.Habit habit) {
    }
    
    public final void updateHabit(@org.jetbrains.annotations.NotNull()
    com.example.habittracker.data.models.Habit habit) {
    }
    
    public final void deleteHabit(@org.jetbrains.annotations.NotNull()
    com.example.habittracker.data.models.Habit habit) {
    }
    
    public final void deleteAllHabits() {
    }
    
    public HabitViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}