package com.abdoul.groovy.view

import android.os.Bundle
import androidx.navigation.NavDirections
import com.abdoul.groovy.R
import kotlin.Int
import kotlin.String

public class PlaylistFragmentDirections private constructor() {
  private data class ActionPlaylistFragmentToPlaylistDetailFragment(
    public val playlistId: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_playlistFragment_to_playlistDetailFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("playlistId", this.playlistId)
      return result
    }
  }

  public companion object {
    public fun actionPlaylistFragmentToPlaylistDetailFragment(playlistId: String): NavDirections =
        ActionPlaylistFragmentToPlaylistDetailFragment(playlistId)
  }
}
