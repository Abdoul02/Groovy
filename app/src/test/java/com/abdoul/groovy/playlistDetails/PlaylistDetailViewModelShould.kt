package com.abdoul.groovy.playlistDetails

import com.abdoul.groovy.model.PlaylistDetails
import com.abdoul.groovy.service.PlaylistDetailsService
import com.abdoul.groovy.utils.BaseUnitTest
import com.abdoul.groovy.utils.captureValues
import com.abdoul.groovy.utils.getValueForTest
import com.abdoul.groovy.viewModel.PlaylistDetailsViewModel
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Test

class PlaylistDetailViewModelShould : BaseUnitTest() {

    lateinit var viewModel: PlaylistDetailsViewModel
    private val id = "1"
    private val playlistDetails = mock<PlaylistDetails>()
    private val expected = Result.success(playlistDetails)
    private val service: PlaylistDetailsService = mock()
    private val exception = RuntimeException("Something went wrong")
    private val error = Result.failure<PlaylistDetails>(exception)

    @Test
    fun getPlaylistDetailsFromService() = runBlockingTest {
        mockSuccessfulCase()

        viewModel.getPlaylistsDetails(id)

        viewModel.playlistsDetails.getValueForTest()

        verify(service, times(1)).fetchPlaylistDetails(id)
    }

    @Test
    fun emitsPlaylistDetailsFromService() = runBlockingTest {
        mockSuccessfulCase()

        viewModel.getPlaylistsDetails(id)

        assertEquals(expected, viewModel.playlistsDetails.getValueForTest())
    }

    @Test
    fun emitsErrorWhenServiceFails() = runBlockingTest {
        mockFailingCase()

        assertEquals(error, viewModel.playlistsDetails.getValueForTest())
    }

    @ExperimentalCoroutinesApi
    @Test
    fun showSpinnerWhileLoading() = runBlockingTest {
        mockSuccessfulCase()

        viewModel.loader.captureValues {
            viewModel.playlistsDetails.getValueForTest()

            viewModel.getPlaylistsDetails(id)

            assertEquals(true, values[0])
        }
    }

    @Test
    fun closeLoaderAfterPlaylistsLoad() = runBlockingTest {
        mockSuccessfulCase()

        viewModel.loader.captureValues {
            viewModel.playlistsDetails.getValueForTest()

            viewModel.getPlaylistsDetails(id)

            assertEquals(false, values.last())
        }
    }

    private suspend fun mockFailingCase() {
        whenever(service.fetchPlaylistDetails(id)).thenReturn(
            flow {
                emit(error)
            }
        )

        viewModel = PlaylistDetailsViewModel(service)
        viewModel.getPlaylistsDetails(id)
    }

    private suspend fun mockSuccessfulCase() {
        whenever(service.fetchPlaylistDetails(id)).thenReturn(
            flow {
                emit(expected)
            }
        )

        viewModel = PlaylistDetailsViewModel(service)
    }
}