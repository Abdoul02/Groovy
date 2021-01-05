package com.abdoul.groovy.di;

import com.abdoul.groovy.service.PlaylistDetailsAPI;
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
public final class PlaylistDetailsModule_PlaylistDetailsAPIFactory implements Factory<PlaylistDetailsAPI> {
  private final PlaylistDetailsModule module;

  private final Provider<Retrofit> retrofitProvider;

  public PlaylistDetailsModule_PlaylistDetailsAPIFactory(PlaylistDetailsModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public PlaylistDetailsAPI get() {
    return playlistDetailsAPI(module, retrofitProvider.get());
  }

  public static PlaylistDetailsModule_PlaylistDetailsAPIFactory create(PlaylistDetailsModule module,
      Provider<Retrofit> retrofitProvider) {
    return new PlaylistDetailsModule_PlaylistDetailsAPIFactory(module, retrofitProvider);
  }

  public static PlaylistDetailsAPI playlistDetailsAPI(PlaylistDetailsModule instance,
      Retrofit retrofit) {
    return Preconditions.checkNotNull(instance.playlistDetailsAPI(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
