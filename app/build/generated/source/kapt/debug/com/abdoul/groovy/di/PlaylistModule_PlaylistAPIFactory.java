package com.abdoul.groovy.di;

import com.abdoul.groovy.service.PlaylistAPI;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PlaylistModule_PlaylistAPIFactory implements Factory<PlaylistAPI> {
  private final PlaylistModule module;

  private final Provider<Retrofit> retrofitProvider;

  public PlaylistModule_PlaylistAPIFactory(PlaylistModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public PlaylistAPI get() {
    return playlistAPI(module, retrofitProvider.get());
  }

  public static PlaylistModule_PlaylistAPIFactory create(PlaylistModule module,
      Provider<Retrofit> retrofitProvider) {
    return new PlaylistModule_PlaylistAPIFactory(module, retrofitProvider);
  }

  public static PlaylistAPI playlistAPI(PlaylistModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(instance.playlistAPI(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
