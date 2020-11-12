package com.example.habittracker.ui.fragments.updatehabit

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.habittracker.R

class UpdateHabitItemDirections private constructor() {
  companion object {
    fun actionUpdateHabitItemToHabitList(): NavDirections =
        ActionOnlyNavDirections(R.id.action_updateHabitItem_to_habitList)
  }
}
