package com.abdoul.groovy.service;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PlaylistDetailsService_Factory implements Factory<PlaylistDetailsService> {
  private final Provider<PlaylistDetailsAPI> apiProvider;

  public PlaylistDetailsService_Factory(Provider<PlaylistDetailsAPI> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public PlaylistDetailsService get() {
    return newInstance(apiProvider.get());
  }

  public static PlaylistDetailsService_Factory create(Provider<PlaylistDetailsAPI> apiProvider) {
    return new PlaylistDetailsService_Factory(apiProvider);
  }

  public static PlaylistDetailsService newInstance(PlaylistDetailsAPI api) {
    return new PlaylistDetailsService(api);
  }
}
