package com.abdoul.groovy.view;

import com.abdoul.groovy.viewModel.PlaylistDetailsViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class PlaylistDetailsFragment_MembersInjector implements MembersInjector<PlaylistDetailsFragment> {
  private final Provider<PlaylistDetailsViewModelFactory> viewModelFactoryProvider;

  public PlaylistDetailsFragment_MembersInjector(
      Provider<PlaylistDetailsViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PlaylistDetailsFragment> create(
      Provider<PlaylistDetailsViewModelFactory> viewModelFactoryProvider) {
    return new PlaylistDetailsFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(PlaylistDetailsFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.abdoul.groovy.view.PlaylistDetailsFragment.viewModelFactory")
  public static void injectViewModelFactory(PlaylistDetailsFragment instance,
      PlaylistDetailsViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
