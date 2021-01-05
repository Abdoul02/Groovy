package com.abdoul.groovy;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.abdoul.groovy.di.PlaylistDetailsModule;
import com.abdoul.groovy.di.PlaylistDetailsModule_PlaylistDetailsAPIFactory;
import com.abdoul.groovy.di.PlaylistModule;
import com.abdoul.groovy.di.PlaylistModule_PlaylistAPIFactory;
import com.abdoul.groovy.di.PlaylistModule_RetrofitFactory;
import com.abdoul.groovy.other.PlaylistMapper;
import com.abdoul.groovy.repository.PlaylistRepository;
import com.abdoul.groovy.service.PlaylistAPI;
import com.abdoul.groovy.service.PlaylistDetailsAPI;
import com.abdoul.groovy.service.PlaylistDetailsService;
import com.abdoul.groovy.service.PlaylistService;
import com.abdoul.groovy.view.MainActivity;
import com.abdoul.groovy.view.PlaylistDetailsFragment;
import com.abdoul.groovy.view.PlaylistDetailsFragment_MembersInjector;
import com.abdoul.groovy.view.PlaylistFragment;
import com.abdoul.groovy.viewModel.PlaylistDetailsViewModelFactory;
import com.abdoul.groovy.viewModel.PlaylistViewModel_AssistedFactory;
import com.abdoul.groovy.viewModel.PlaylistViewModel_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerGroovyApplication_HiltComponents_ApplicationC extends GroovyApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private final PlaylistModule playlistModule;

  private DaggerGroovyApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam, PlaylistModule playlistModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.playlistModule = playlistModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private PlaylistAPI getPlaylistAPI() {
    return PlaylistModule_PlaylistAPIFactory.playlistAPI(playlistModule, PlaylistModule_RetrofitFactory.retrofit(playlistModule));
  }

  @Override
  public void injectGroovyApplication(GroovyApplication groovyApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private PlaylistModule playlistModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder playlistModule(PlaylistModule playlistModule) {
      this.playlistModule = Preconditions.checkNotNull(playlistModule);
      return this;
    }

    public GroovyApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (playlistModule == null) {
        this.playlistModule = new PlaylistModule();
      }
      return new DaggerGroovyApplication_HiltComponents_ApplicationC(applicationContextModule, playlistModule);
    }
  }

  private final class ActivityRetainedCBuilder implements GroovyApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public GroovyApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends GroovyApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements GroovyApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public GroovyApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends GroovyApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<PlaylistRepository> playlistRepositoryProvider;

      private volatile Provider<PlaylistViewModel_AssistedFactory> playlistViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private PlaylistService getPlaylistService() {
        return new PlaylistService(DaggerGroovyApplication_HiltComponents_ApplicationC.this.getPlaylistAPI());
      }

      private PlaylistRepository getPlaylistRepository() {
        return new PlaylistRepository(getPlaylistService(), new PlaylistMapper());
      }

      private Provider<PlaylistRepository> getPlaylistRepositoryProvider() {
        Object local = playlistRepositoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          playlistRepositoryProvider = (Provider<PlaylistRepository>) local;
        }
        return (Provider<PlaylistRepository>) local;
      }

      private PlaylistViewModel_AssistedFactory getPlaylistViewModel_AssistedFactory() {
        return PlaylistViewModel_AssistedFactory_Factory.newInstance(getPlaylistRepositoryProvider());
      }

      private Provider<PlaylistViewModel_AssistedFactory> getPlaylistViewModel_AssistedFactoryProvider(
          ) {
        Object local = playlistViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          playlistViewModel_AssistedFactoryProvider = (Provider<PlaylistViewModel_AssistedFactory>) local;
        }
        return (Provider<PlaylistViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>singletonMap("com.abdoul.groovy.viewModel.PlaylistViewModel", (Provider) getPlaylistViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerGroovyApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity arg0) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements GroovyApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public GroovyApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(new PlaylistDetailsModule(), fragment);
        }
      }

      private final class FragmentCImpl extends GroovyApplication_HiltComponents.FragmentC {
        private final PlaylistDetailsModule playlistDetailsModule;

        private final Fragment fragment;

        private FragmentCImpl(PlaylistDetailsModule playlistDetailsModuleParam,
            Fragment fragmentParam) {
          this.playlistDetailsModule = playlistDetailsModuleParam;
          this.fragment = fragmentParam;
        }

        private PlaylistDetailsAPI getPlaylistDetailsAPI() {
          return PlaylistDetailsModule_PlaylistDetailsAPIFactory.playlistDetailsAPI(playlistDetailsModule, PlaylistModule_RetrofitFactory.retrofit(DaggerGroovyApplication_HiltComponents_ApplicationC.this.playlistModule));
        }

        private PlaylistDetailsService getPlaylistDetailsService() {
          return new PlaylistDetailsService(getPlaylistDetailsAPI());
        }

        private PlaylistDetailsViewModelFactory getPlaylistDetailsViewModelFactory() {
          return new PlaylistDetailsViewModelFactory(getPlaylistDetailsService());
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerGroovyApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectPlaylistDetailsFragment(PlaylistDetailsFragment arg0) {
          injectPlaylistDetailsFragment2(arg0);
        }

        @Override
        public void injectPlaylistFragment(PlaylistFragment playlistFragment) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private PlaylistDetailsFragment injectPlaylistDetailsFragment2(
            PlaylistDetailsFragment instance) {
          PlaylistDetailsFragment_MembersInjector.injectViewModelFactory(instance, getPlaylistDetailsViewModelFactory());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements GroovyApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public GroovyApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends GroovyApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements GroovyApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public GroovyApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends GroovyApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.abdoul.groovy.viewModel.PlaylistViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getPlaylistViewModel_AssistedFactory();

            case 1: // com.abdoul.groovy.repository.PlaylistRepository 
            return (T) ActivityCImpl.this.getPlaylistRepository();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements GroovyApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public GroovyApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends GroovyApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
