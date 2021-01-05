package com.abdoul.groovy.view;

import com.abdoul.groovy.viewModel.PlaylistViewModelFactory;
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
public final class PlaylistFragment_MembersInjector implements MembersInjector<PlaylistFragment> {
  private final Provider<PlaylistViewModelFactory> viewModelFactoryProvider;

  public PlaylistFragment_MembersInjector(
      Provider<PlaylistViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PlaylistFragment> create(
      Provider<PlaylistViewModelFactory> viewModelFactoryProvider) {
    return new PlaylistFragment_MembersInjector(viewModelFactoryProvider);}

  @Override
  public void injectMembers(PlaylistFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.abdoul.groovy.view.PlaylistFragment.viewModelFactory")
  public static void injectViewModelFactory(PlaylistFragment instance,
      PlaylistViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
