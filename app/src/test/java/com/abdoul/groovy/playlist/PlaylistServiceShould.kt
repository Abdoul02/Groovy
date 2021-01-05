package com.abdoul.groovy.playlist

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Test
import com.abdoul.groovy.model.PlaylistRaw
import com.abdoul.groovy.service.PlaylistAPI
import com.abdoul.groovy.service.PlaylistService
import com.abdoul.groovy.utils.BaseUnitTest

class PlaylistServiceShould : BaseUnitTest() {

    private lateinit var service: PlaylistService
    private var api: PlaylistAPI = mock()
    private val playlists: List<PlaylistRaw> = mock()

    @Test
    fun fetchPlaylistFromAPI() = runBlockingTest {
        service = PlaylistService(api)

        service.fetchPlaylists().first()

        verify(api, times(1)).fetchAllPlaylists()
    }

    @Test
    fun convertValuesToFlowResultAndEmitsThem() = runBlockingTest {
        whenever(api.fetchAllPlaylists()).thenReturn(playlists)

        service = PlaylistService(api)

        assertEquals(Result.success(playlists), service.fetchPlaylists().first())
    }

    @Test
    fun emitsErrorResultWhenNetworkFails() = runBlockingTest {
        whenever(api.fetchAllPlaylists()).thenThrow(RuntimeException("Damn backend developers"))

        service = PlaylistService(api)

        assertEquals(
            "Something went wrong",
            service.fetchPlaylists().first().exceptionOrNull()?.message
        )
    }
}