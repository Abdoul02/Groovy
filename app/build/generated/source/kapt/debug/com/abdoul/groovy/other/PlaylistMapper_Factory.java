package com.abdoul.groovy.other;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PlaylistMapper_Factory implements Factory<PlaylistMapper> {
  @Override
  public PlaylistMapper get() {
    return newInstance();
  }

  public static PlaylistMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PlaylistMapper newInstance() {
    return new PlaylistMapper();
  }

  private static final class InstanceHolder {
    private static final PlaylistMapper_Factory INSTANCE = new PlaylistMapper_Factory();
  }
}
