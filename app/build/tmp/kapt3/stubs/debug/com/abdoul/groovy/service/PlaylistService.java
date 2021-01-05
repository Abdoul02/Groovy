package com.abdoul.groovy.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/abdoul/groovy/service/PlaylistService;", "", "api", "Lcom/abdoul/groovy/service/PlaylistAPI;", "(Lcom/abdoul/groovy/service/PlaylistAPI;)V", "fetchPlaylists", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "Lcom/abdoul/groovy/model/PlaylistRaw;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PlaylistService {
    private final com.abdoul.groovy.service.PlaylistAPI api = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchPlaylists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends kotlin.Result<? extends java.util.List<com.abdoul.groovy.model.PlaylistRaw>>>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public PlaylistService(@org.jetbrains.annotations.NotNull()
    com.abdoul.groovy.service.PlaylistAPI api) {
        super();
    }
}