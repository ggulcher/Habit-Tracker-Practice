package com.example.habittracker.ui.fragments.updatehabit

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.habittracker.data.models.Habit
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class UpdateHabitItemArgs(
  val selectedHabit: Habit
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
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

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): UpdateHabitItemArgs {
      bundle.setClassLoader(UpdateHabitItemArgs::class.java.classLoader)
      val __selectedHabit : Habit?
      if (bundle.containsKey("selectedHabit")) {
        if (Parcelable::class.java.isAssignableFrom(Habit::class.java) ||
            Serializable::class.java.isAssignableFrom(Habit::class.java)) {
          __selectedHabit = bundle.get("selectedHabit") as Habit?
        } else {
          throw UnsupportedOperationException(Habit::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__selectedHabit == null) {
          throw IllegalArgumentException("Argument \"selectedHabit\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"selectedHabit\" is missing and does not have an android:defaultValue")
      }
      return UpdateHabitItemArgs(__selectedHabit)
    }
  }
}
