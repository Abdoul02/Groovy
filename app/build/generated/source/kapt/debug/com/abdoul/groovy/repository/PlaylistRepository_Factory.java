package com.abdoul.groovy.repository;

import com.abdoul.groovy.other.PlaylistMapper;
import com.abdoul.groovy.service.PlaylistService;
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
public final class PlaylistRepository_Factory implements Factory<PlaylistRepository> {
  private final Provider<PlaylistService> serviceProvider;

  private final Provider<PlaylistMapper> mapperProvider;

  public PlaylistRepository_Factory(Provider<PlaylistService> serviceProvider,
      Provider<PlaylistMapper> mapperProvider) {
    this.serviceProvider = serviceProvider;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public PlaylistRepository get() {
    return newInstance(serviceProvider.get(), mapperProvider.get());
  }

  public static PlaylistRepository_Factory create(Provider<PlaylistService> serviceProvider,
      Provider<PlaylistMapper> mapperProvider) {
    return new PlaylistRepository_Factory(serviceProvider, mapperProvider);
  }

  public static PlaylistRepository newInstance(PlaylistService service, PlaylistMapper mapper) {
    return new PlaylistRepository(service, mapper);
  }
}
