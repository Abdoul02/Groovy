package com.abdoul.groovy.playlist

import junit.framework.TestCase.assertEquals
import org.junit.Test
import com.abdoul.groovy.R
import com.abdoul.groovy.model.PlaylistRaw
import com.abdoul.groovy.other.PlaylistMapper
import com.abdoul.groovy.utils.BaseUnitTest

class PlaylistMapperShould : BaseUnitTest() {

    private val playlistRaw = PlaylistRaw("1", "name", "category")
    private val playlistRawRock = PlaylistRaw("1", "name", "rock")
    private val mapper = PlaylistMapper()

    private val playlist = mapper(listOf(playlistRaw)).first()

    private val playlistRock = mapper(listOf(playlistRawRock)).first()

    @Test
    fun keepSameId() {
        assertEquals(playlistRaw.id, playlist.id)
    }

    @Test
    fun keepSameName() {
        assertEquals(playlistRaw.name, playlist.name)
    }

    @Test
    fun keepSameCategory() {
        assertEquals(playlistRaw.category, playlist.category)
    }

    @Test
    fun mapDefaultImageWhenNotRock() {
        assertEquals(R.mipmap.playlist, playlist.image)
    }

    @Test
    fun mapRockImageWhenRockCategory() {
        assertEquals(R.mipmap.rock, playlistRock.image)
    }

}