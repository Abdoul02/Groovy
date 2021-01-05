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
public final class PlaylistViewModel_Factory implements Factory<PlaylistViewModel> {
  private final Provider<PlaylistRepository> repositoryProvider;

  public PlaylistViewModel_Factory(Provider<PlaylistRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public PlaylistViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static PlaylistViewModel_Factory create(Provider<PlaylistRepository> repositoryProvider) {
    return new PlaylistViewModel_Factory(repositoryProvider);
  }

  public static PlaylistViewModel newInstance(PlaylistRepository repository) {
    return new PlaylistViewModel(repository);
  }
}
