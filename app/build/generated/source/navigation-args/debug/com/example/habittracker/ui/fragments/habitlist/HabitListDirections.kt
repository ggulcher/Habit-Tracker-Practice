package com.example.habittracker.ui.fragments.habitlist

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.habittracker.R
import com.example.habittracker.data.models.Habit
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class HabitListDirections private constructor() {
  private data class ActionHabitListToUpdateHabitItem(
    val selectedHabit: Habit
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_habitList_to_updateHabitItem

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Habit::class.java)) {
        result.putParcelable("selectedHabit", this.selectedHabit as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Habit::class.java)) {
        result.putSerializable("selectedHabit", this.selectedHabit as Serializable)
      } else {
        throw UnsupportedOperationException(Habit::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun actionHabitListToCreateHabitItem(): NavDirections =
        ActionOnlyNavDirections(R.id.action_habitList_to_createHabitItem)

    fun actionHabitListToUpdateHabitItem(selectedHabit: Habit): NavDirections =
        ActionHabitListToUpdateHabitItem(selectedHabit)
  }
}
