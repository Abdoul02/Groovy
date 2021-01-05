package com.abdoul.groovy.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.fragment.navArgs
import com.abdoul.groovy.R
import com.abdoul.groovy.model.PlaylistDetails
import com.abdoul.groovy.viewModel.PlaylistDetailsViewModel
import com.abdoul.groovy.viewModel.PlaylistDetailsViewModelFactory
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_item_list.*
import kotlinx.android.synthetic.main.fragment_playlist_detail.*
import javax.inject.Inject

@AndroidEntryPoint
class PlaylistDetailsFragment : Fragment() {

    lateinit var viewModel: PlaylistDetailsViewModel

    @Inject
    lateinit var viewModelFactory: PlaylistDetailsViewModelFactory

    private val args: PlaylistDetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_playlist_detail, container, false)

        val id = args.playlistId

        viewModel =
            ViewModelProvider(this, viewModelFactory).get(PlaylistDetailsViewModel::class.java)
        viewModel.getPlaylistsDetails(id)

        observeLoader()
        observePlaylistDetails()

        return view
    }

    private fun observeLoader() {
        viewModel.loader.observe(this as LifecycleOwner) { loading ->
            when (loading) {
                true -> details_loader.visibility = View.VISIBLE
                else -> details_loader.visibility = View.GONE
            }
        }
    }

    private fun observePlaylistDetails() {
        viewModel.playlistsDetails.observe(this as LifecycleOwner) { details ->
            if (details.getOrNull() != null) {
                setupUI(details)
            } else {
                Snackbar.make(
                    playlists_details_root,
                    R.string.generic_error,
                    Snackbar.LENGTH_LONG
                ).show()
            }
        }
    }

    private fun setupUI(details: Result<PlaylistDetails>) {
        playlist_name.text = details.getOrNull()!!.name
        playlist_details.text = details.getOrNull()!!.details
    }

    companion object {
        @JvmStatic
        fun newInstance() = PlaylistDetailsFragment()
    }
}