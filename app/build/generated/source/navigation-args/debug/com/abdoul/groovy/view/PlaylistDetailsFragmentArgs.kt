package com.abdoul.groovy.view

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class PlaylistDetailsFragmentArgs(
  public val playlistId: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("playlistId", this.playlistId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): PlaylistDetailsFragmentArgs {
      bundle.setClassLoader(PlaylistDetailsFragmentArgs::class.java.classLoader)
      val __playlistId : String?
      if (bundle.containsKey("playlistId")) {
        __playlistId = bundle.getString("playlistId")
        if (__playlistId == null) {
          throw IllegalArgumentException("Argument \"playlistId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"playlistId\" is missing and does not have an android:defaultValue")
      }
      return PlaylistDetailsFragmentArgs(__playlistId)
    }
  }
}
