package com.abdoul.groovy.viewModel;

import com.abdoul.groovy.service.PlaylistDetailsService;
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
public final class PlaylistDetailsViewModelFactory_Factory implements Factory<PlaylistDetailsViewModelFactory> {
  private final Provider<PlaylistDetailsService> serviceProvider;

  public PlaylistDetailsViewModelFactory_Factory(Provider<PlaylistDetailsService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public PlaylistDetailsViewModelFactory get() {
    return newInstance(serviceProvider.get());
  }

  public static PlaylistDetailsViewModelFactory_Factory create(
      Provider<PlaylistDetailsService> serviceProvider) {
    return new PlaylistDetailsViewModelFactory_Factory(serviceProvider);
  }

  public static PlaylistDetailsViewModelFactory newInstance(PlaylistDetailsService service) {
    return new PlaylistDetailsViewModelFactory(service);
  }
}
