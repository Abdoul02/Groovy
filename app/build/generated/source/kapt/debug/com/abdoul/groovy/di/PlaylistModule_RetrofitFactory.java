package com.abdoul.groovy.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PlaylistModule_RetrofitFactory implements Factory<Retrofit> {
  private final PlaylistModule module;

  public PlaylistModule_RetrofitFactory(PlaylistModule module) {
    this.module = module;
  }

  @Override
  public Retrofit get() {
    return retrofit(module);
  }

  public static PlaylistModule_RetrofitFactory create(PlaylistModule module) {
    return new PlaylistModule_RetrofitFactory(module);
  }

  public static Retrofit retrofit(PlaylistModule instance) {
    return Preconditions.checkNotNull(instance.retrofit(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
