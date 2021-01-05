package com.abdoul.groovy.viewModel;

import com.abdoul.groovy.repository.PlaylistRepository;
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
public final class PlaylistViewModelFactory_Factory implements Factory<PlaylistViewModelFactory> {
  private final Provider<PlaylistRepository> repositoryProvider;

  public PlaylistViewModelFactory_Factory(Provider<PlaylistRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public PlaylistViewModelFactory get() {
    return newInstance(repositoryProvider.get());
  }

  public static PlaylistViewModelFactory_Factory create(
      Provider<PlaylistRepository> repositoryProvider) {
    return new PlaylistViewModelFactory_Factory(repositoryProvider);
  }

  public static PlaylistViewModelFactory newInstance(PlaylistRepository repository) {
    return new PlaylistViewModelFactory(repository);
  }
}
