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
public final class PlaylistService_Factory implements Factory<PlaylistService> {
  private final Provider<PlaylistAPI> apiProvider;

  public PlaylistService_Factory(Provider<PlaylistAPI> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public PlaylistService get() {
    return newInstance(apiProvider.get());
  }

  public static PlaylistService_Factory create(Provider<PlaylistAPI> apiProvider) {
    return new PlaylistService_Factory(apiProvider);
  }

  public static PlaylistService newInstance(PlaylistAPI api) {
    return new PlaylistService(api);
  }
}
