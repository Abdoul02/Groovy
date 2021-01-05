package com.abdoul.groovy.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J&\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/abdoul/groovy/repository/PlaylistRepository;", "", "service", "Lcom/abdoul/groovy/service/PlaylistService;", "mapper", "Lcom/abdoul/groovy/other/PlaylistMapper;", "(Lcom/abdoul/groovy/service/PlaylistService;Lcom/abdoul/groovy/other/PlaylistMapper;)V", "getPlaylists", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "Lcom/abdoul/groovy/model/Playlist;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PlaylistRepository {
    private final com.abdoul.groovy.service.PlaylistService service = null;
    private final com.abdoul.groovy.other.PlaylistMapper mapper = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPlaylists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends kotlin.Result<? extends java.util.List<com.abdoul.groovy.model.Playlist>>>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public PlaylistRepository(@org.jetbrains.annotations.NotNull()
    com.abdoul.groovy.service.PlaylistService service, @org.jetbrains.annotations.NotNull()
    com.abdoul.groovy.other.PlaylistMapper mapper) {
        super();
    }
}