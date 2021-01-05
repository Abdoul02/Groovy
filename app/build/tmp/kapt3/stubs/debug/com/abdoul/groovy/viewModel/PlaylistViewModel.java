package com.abdoul.groovy.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR&\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b\u00f8\u0001\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/abdoul/groovy/viewModel/PlaylistViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/abdoul/groovy/repository/PlaylistRepository;", "(Lcom/abdoul/groovy/repository/PlaylistRepository;)V", "loader", "Landroidx/lifecycle/MutableLiveData;", "", "getLoader", "()Landroidx/lifecycle/MutableLiveData;", "playlists", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "", "Lcom/abdoul/groovy/model/Playlist;", "getPlaylists", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class PlaylistViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loader = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<kotlin.Result<java.util.List<com.abdoul.groovy.model.Playlist>>> playlists = null;
    private final com.abdoul.groovy.repository.PlaylistRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<java.util.List<com.abdoul.groovy.model.Playlist>>> getPlaylists() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public PlaylistViewModel(@org.jetbrains.annotations.NotNull()
    com.abdoul.groovy.repository.PlaylistRepository repository) {
        super();
    }
}