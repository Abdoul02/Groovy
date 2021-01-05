package com.abdoul.groovy.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abdoul.groovy.model.PlaylistDetails
import com.abdoul.groovy.service.PlaylistDetailsService
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class PlaylistDetailsViewModel(private val service: PlaylistDetailsService) : ViewModel() {

    val playlistsDetails: MutableLiveData<Result<PlaylistDetails>> = MutableLiveData()
    val loader = MutableLiveData<Boolean>()

    fun getPlaylistsDetails(id: String) {

        viewModelScope.launch {
            loader.postValue(true)
            service.fetchPlaylistDetails(id)
                .onEach {
                    loader.postValue(false)
                }
                .collect {
                    playlistsDetails.postValue(it)
                }
        }
    }
}