package com.abdoul.groovy.service

import com.abdoul.groovy.model.PlaylistDetails
import retrofit2.http.GET
import retrofit2.http.Path
import javax.inject.Inject

interface PlaylistDetailsAPI {

    @GET("playlist-details/{id}")
    suspend fun fetchPlaylistDetails(@Path("id") id: String): PlaylistDetails

}
