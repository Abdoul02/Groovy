package com.abdoul.groovy;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
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
import com.abdoul.groovy.view.PlaylistFragment_MembersInjector;
import com.abdoul.groovy.viewModel.PlaylistDetailsViewModelFactory;
import com.abdoul.groovy.viewModel.PlaylistViewModelFactory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerGroovyApplication_HiltComponents_ApplicationC extends GroovyApplication_HiltComponents.ApplicationC {
  private DaggerGroovyApplication_HiltComponents_ApplicationC() {

  }

  public static Builder builder() {
    return new Builder();
  }

  public static GroovyApplication_HiltComponents.ApplicationC create() {
    return new Builder().build();
  }

  @Override
  public void injectGroovyApplication(GroovyApplication groovyApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();}

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();}

  public static final class Builder {
    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public GroovyApplication_HiltComponents.ApplicationC build() {
      return new DaggerGroovyApplication_HiltComponents_ApplicationC();
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
      return new ActivityCBuilder();}

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
      private ActivityCImpl(Activity activity) {

      }

      @Override
      public void injectMainActivity(MainActivity arg0) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>emptySet();}

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();}

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();}

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
          return new FragmentCImpl(new PlaylistDetailsModule(), new PlaylistModule(), fragment);
        }
      }

      private final class FragmentCImpl extends GroovyApplication_HiltComponents.FragmentC {
        private final PlaylistModule playlistModule;

        private final PlaylistDetailsModule playlistDetailsModule;

        private FragmentCImpl(PlaylistDetailsModule playlistDetailsModuleParam,
            PlaylistModule playlistModuleParam, Fragment fragment) {
          this.playlistModule = playlistModuleParam;
          this.playlistDetailsModule = playlistDetailsModuleParam;
        }

        private PlaylistDetailsAPI getPlaylistDetailsAPI() {
          return PlaylistDetailsModule_PlaylistDetailsAPIFactory.playlistDetailsAPI(playlistDetailsModule, PlaylistModule_RetrofitFactory.retrofit(playlistModule));}

        private PlaylistDetailsService getPlaylistDetailsService() {
          return new PlaylistDetailsService(getPlaylistDetailsAPI());}

        private PlaylistDetailsViewModelFactory getPlaylistDetailsViewModelFactory() {
          return new PlaylistDetailsViewModelFactory(getPlaylistDetailsService());}

        private PlaylistAPI getPlaylistAPI() {
          return PlaylistModule_PlaylistAPIFactory.playlistAPI(playlistModule, PlaylistModule_RetrofitFactory.retrofit(playlistModule));}

        private PlaylistService getPlaylistService() {
          return new PlaylistService(getPlaylistAPI());}

        private PlaylistRepository getPlaylistRepository() {
          return new PlaylistRepository(getPlaylistService(), new PlaylistMapper());}

        private PlaylistViewModelFactory getPlaylistViewModelFactory() {
          return new PlaylistViewModelFactory(getPlaylistRepository());}

        @Override
        public void injectPlaylistDetailsFragment(PlaylistDetailsFragment arg0) {
          injectPlaylistDetailsFragment2(arg0);}

        @Override
        public void injectPlaylistFragment(PlaylistFragment arg0) {
          injectPlaylistFragment2(arg0);}

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>emptySet();}

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();}

        private PlaylistDetailsFragment injectPlaylistDetailsFragment2(
            PlaylistDetailsFragment instance) {
          PlaylistDetailsFragment_MembersInjector.injectViewModelFactory(instance, getPlaylistDetailsViewModelFactory());
          return instance;
        }

        private PlaylistFragment injectPlaylistFragment2(PlaylistFragment instance) {
          PlaylistFragment_MembersInjector.injectViewModelFactory(instance, getPlaylistViewModelFactory());
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
