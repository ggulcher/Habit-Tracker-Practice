package com.example.habittracker.ui.fragments.createhabit

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.habittracker.R

class CreateHabitItemDirections private constructor() {
  companion object {
    fun actionCreateHabitItemToHabitList(): NavDirections =
        ActionOnlyNavDirections(R.id.action_createHabitItem_to_habitList)
  }
}
