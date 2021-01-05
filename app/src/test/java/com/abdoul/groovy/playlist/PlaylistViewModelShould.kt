package com.abdoul.groovy.playlist

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Test
import com.abdoul.groovy.model.Playlist
import com.abdoul.groovy.repository.PlaylistRepository
import com.abdoul.groovy.utils.BaseUnitTest
import com.abdoul.groovy.utils.captureValues
import com.abdoul.groovy.utils.getValueForTest
import com.abdoul.groovy.viewModel.PlaylistViewModel

class PlaylistViewModelShould : BaseUnitTest() {

    private val repository: PlaylistRepository = mock()
    private val playlists = mock<List<Playlist>>()
    private val expected = Result.success(playlists)
    private val exception = RuntimeException("Something went wrong")

    @ExperimentalCoroutinesApi
    @Test
    fun getPlaylistsFromRepository() = runBlockingTest {
        val viewModel = mockSuccessfulCase()
        viewModel.playlists.getValueForTest()

        verify(repository, times(1)).getPlaylists()
    }

    @ExperimentalCoroutinesApi
    @Test
    fun emitsPlaylistsFromRepository() = runBlockingTest {
        val viewModel = mockSuccessfulCase()

        assertEquals(expected, viewModel.playlists.getValueForTest())
    }

    @ExperimentalCoroutinesApi
    @Test
    fun emitErrorWhenReceiveError() {
        val viewModel = mockFailureCase()

        val valueForTest = viewModel.playlists.getValueForTest()
        assertEquals(
            exception,
            if (valueForTest != null) valueForTest.exceptionOrNull() else throw NullPointerException(
                "Expression 'viewModel.playlists.getValueForTest()' must not be null"
            )
        )
    }

    @ExperimentalCoroutinesApi
    @Test
    fun showSpinnerWhileLoading() = runBlockingTest {
        val viewModel = mockSuccessfulCase()

        viewModel.loader.captureValues {
            viewModel.playlists.getValueForTest()

            assertEquals(true, values[0])
        }
    }

    @Test
    fun closeLoaderAfterPlaylistsLoad() = runBlockingTest {
        val viewModel = mockSuccessfulCase()

        viewModel.loader.captureValues {
            viewModel.playlists.getValueForTest()

            assertEquals(false, values.last())
        }
    }

    @Test
    fun closeLoaderAfterError() = runBlockingTest {
        val viewModel = mockFailureCase()

        viewModel.loader.captureValues {
            viewModel.playlists.getValueForTest()

            assertEquals(false, values.last())
        }
    }

    private fun mockFailureCase(): PlaylistViewModel {
        runBlockingTest {
            whenever(repository.getPlaylists()).thenReturn(
                flow {
                    emit(Result.failure<List<Playlist>>(exception))
                }
            )
        }

        return PlaylistViewModel(repository)
    }

    @ExperimentalCoroutinesApi
    private fun mockSuccessfulCase(): PlaylistViewModel {
        runBlockingTest {
            whenever(repository.getPlaylists()).thenReturn(
                flow {
                    emit(expected)
                }
            )
        }

        return PlaylistViewModel(repository)
    }
}