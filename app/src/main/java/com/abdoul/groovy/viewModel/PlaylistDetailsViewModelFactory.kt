package com.abdoul.groovy.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.abdoul.groovy.service.PlaylistDetailsService
import javax.inject.Inject

class PlaylistDetailsViewModelFactory @Inject constructor(private val service: PlaylistDetailsService) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PlaylistDetailsViewModel(service) as T
    }

}
