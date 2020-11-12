package com.example.habittracker.logic.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/habittracker/logic/repository/HabitRepository;", "", "habitDao", "Lcom/example/habittracker/logic/dao/HabitDao;", "(Lcom/example/habittracker/logic/dao/HabitDao;)V", "getAllHabits", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/habittracker/data/models/Habit;", "getGetAllHabits", "()Landroidx/lifecycle/LiveData;", "addHabit", "", "habit", "(Lcom/example/habittracker/data/models/Habit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllHabits", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteHabit", "updateHabit", "app_debug"})
public final class HabitRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.habittracker.data.models.Habit>> getAllHabits = null;
    private final com.example.habittracker.logic.dao.HabitDao habitDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.habittracker.data.models.Habit>> getGetAllHabits() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addHabit(@org.jetbrains.annotations.NotNull()
    com.example.habittracker.data.models.Habit habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateHabit(@org.jetbrains.annotations.NotNull()
    com.example.habittracker.data.models.Habit habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteHabit(@org.jetbrains.annotations.NotNull()
    com.example.habittracker.data.models.Habit habit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAllHabits(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    public HabitRepository(@org.jetbrains.annotations.NotNull()
    com.example.habittracker.logic.dao.HabitDao habitDao) {
        super();
    }
}