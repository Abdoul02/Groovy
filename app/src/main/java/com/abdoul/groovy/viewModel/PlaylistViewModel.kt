package com.abdoul.groovy.viewModel

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import kotlinx.coroutines.flow.onEach
import com.abdoul.groovy.model.Playlist
import com.abdoul.groovy.repository.PlaylistRepository
import javax.inject.Inject

class PlaylistViewModel @ViewModelInject constructor(
    private val repository: PlaylistRepository) :
    ViewModel() {

    val loader = MutableLiveData<Boolean>()

    val playlists = liveData<Result<List<Playlist>>> {
        loader.postValue(true)
        emitSource(repository.getPlaylists()
            .onEach { loader.postValue(false) }
            .asLiveData())
    }
}