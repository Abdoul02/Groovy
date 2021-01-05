package com.abdoul.groovy.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006\u00f8\u0001\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/abdoul/groovy/viewModel/PlaylistDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lcom/abdoul/groovy/service/PlaylistDetailsService;", "(Lcom/abdoul/groovy/service/PlaylistDetailsService;)V", "loader", "Landroidx/lifecycle/MutableLiveData;", "", "getLoader", "()Landroidx/lifecycle/MutableLiveData;", "playlistsDetails", "Lkotlin/Result;", "Lcom/abdoul/groovy/model/PlaylistDetails;", "getPlaylistsDetails", "", "id", "", "app_debug"})
public final class PlaylistDetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Result<com.abdoul.groovy.model.PlaylistDetails>> playlistsDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loader = null;
    private final com.abdoul.groovy.service.PlaylistDetailsService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Result<com.abdoul.groovy.model.PlaylistDetails>> getPlaylistsDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoader() {
        return null;
    }
    
    public final void getPlaylistsDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public PlaylistDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.abdoul.groovy.service.PlaylistDetailsService service) {
        super();
    }
}