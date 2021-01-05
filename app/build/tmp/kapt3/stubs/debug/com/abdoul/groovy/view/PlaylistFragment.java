package com.abdoul.groovy.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J \u0010\u001b\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u0010H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/abdoul/groovy/view/PlaylistFragment;", "Landroidx/fragment/app/Fragment;", "()V", "viewModel", "Lcom/abdoul/groovy/viewModel/PlaylistViewModel;", "getViewModel", "()Lcom/abdoul/groovy/viewModel/PlaylistViewModel;", "setViewModel", "(Lcom/abdoul/groovy/viewModel/PlaylistViewModel;)V", "viewModelFactory", "Lcom/abdoul/groovy/viewModel/PlaylistViewModelFactory;", "getViewModelFactory", "()Lcom/abdoul/groovy/viewModel/PlaylistViewModelFactory;", "setViewModelFactory", "(Lcom/abdoul/groovy/viewModel/PlaylistViewModelFactory;)V", "observeLoader", "", "observePlaylist", "view", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setUpList", "playlists", "", "Lcom/abdoul/groovy/model/Playlist;", "setUpViewModel", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PlaylistFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public com.abdoul.groovy.viewModel.PlaylistViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.abdoul.groovy.viewModel.PlaylistViewModelFactory viewModelFactory;
    public static final com.abdoul.groovy.view.PlaylistFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.abdoul.groovy.viewModel.PlaylistViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.abdoul.groovy.viewModel.PlaylistViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.abdoul.groovy.viewModel.PlaylistViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.abdoul.groovy.viewModel.PlaylistViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void observePlaylist(android.view.View view) {
    }
    
    private final void observeLoader() {
    }
    
    private final void setUpList(android.view.View view, java.util.List<com.abdoul.groovy.model.Playlist> playlists) {
    }
    
    private final void setUpViewModel() {
    }
    
    public PlaylistFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.abdoul.groovy.view.PlaylistFragment newInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/abdoul/groovy/view/PlaylistFragment$Companion;", "", "()V", "newInstance", "Lcom/abdoul/groovy/view/PlaylistFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.abdoul.groovy.view.PlaylistFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}