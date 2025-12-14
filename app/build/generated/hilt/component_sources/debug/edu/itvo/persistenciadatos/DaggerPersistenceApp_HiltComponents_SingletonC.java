package edu.itvo.persistenciadatos;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import edu.itvo.persistenciadatos.data.local.database.AppDatabase;
import edu.itvo.persistenciadatos.data.local.database.ProductDao;
import edu.itvo.persistenciadatos.data.local.database.UserDao;
import edu.itvo.persistenciadatos.di.DataModule_ProvideProductRepositoryFactory;
import edu.itvo.persistenciadatos.di.DataModule_ProvideUserRepositoryFactory;
import edu.itvo.persistenciadatos.di.DatabaseModule_ProvideAppDatabaseFactory;
import edu.itvo.persistenciadatos.di.DatabaseModule_ProvideProductDaoFactory;
import edu.itvo.persistenciadatos.di.DatabaseModule_ProvideUserDaoFactory;
import edu.itvo.persistenciadatos.domain.repository.ProductRepository;
import edu.itvo.persistenciadatos.domain.repository.UserRepository;
import edu.itvo.persistenciadatos.domain.usecase.ActualizarContrasenaUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ActualizarNotificacionesUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ActualizarProductoUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ActualizarTemaUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ActualizarUsuarioUseCase;
import edu.itvo.persistenciadatos.domain.usecase.CerrarSesionUseCase;
import edu.itvo.persistenciadatos.domain.usecase.CrearProductoUseCase;
import edu.itvo.persistenciadatos.domain.usecase.EliminarProductoUseCase;
import edu.itvo.persistenciadatos.domain.usecase.EliminarUsuarioUseCase;
import edu.itvo.persistenciadatos.domain.usecase.GetUserPreferencesUseCase;
import edu.itvo.persistenciadatos.domain.usecase.GetUserUseCase;
import edu.itvo.persistenciadatos.domain.usecase.IsUserLoggedInUseCase;
import edu.itvo.persistenciadatos.domain.usecase.LoginUseCase;
import edu.itvo.persistenciadatos.domain.usecase.LoginUsuarioUseCase;
import edu.itvo.persistenciadatos.domain.usecase.LogoutUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ObtenerProductoPorIdUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ObtenerTodosLosProductosUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ObtenerTodosLosUsuariosUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ObtenerUsuarioActualUseCase;
import edu.itvo.persistenciadatos.domain.usecase.ObtenerUsuarioPorIdUseCase;
import edu.itvo.persistenciadatos.domain.usecase.RegistrarUsuarioUseCase;
import edu.itvo.persistenciadatos.domain.usecase.UpdateThemeUseCase;
import edu.itvo.persistenciadatos.presentation.viewmodel.AdminViewModel;
import edu.itvo.persistenciadatos.presentation.viewmodel.AdminViewModel_HiltModules;
import edu.itvo.persistenciadatos.presentation.viewmodel.AdminViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import edu.itvo.persistenciadatos.presentation.viewmodel.AdminViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import edu.itvo.persistenciadatos.presentation.viewmodel.AuthViewModel;
import edu.itvo.persistenciadatos.presentation.viewmodel.AuthViewModel_HiltModules;
import edu.itvo.persistenciadatos.presentation.viewmodel.AuthViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import edu.itvo.persistenciadatos.presentation.viewmodel.AuthViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import edu.itvo.persistenciadatos.presentation.viewmodel.MainViewModel;
import edu.itvo.persistenciadatos.presentation.viewmodel.MainViewModel_HiltModules;
import edu.itvo.persistenciadatos.presentation.viewmodel.MainViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import edu.itvo.persistenciadatos.presentation.viewmodel.MainViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import edu.itvo.persistenciadatos.presentation.viewmodel.ProductViewModel;
import edu.itvo.persistenciadatos.presentation.viewmodel.ProductViewModel_HiltModules;
import edu.itvo.persistenciadatos.presentation.viewmodel.ProductViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import edu.itvo.persistenciadatos.presentation.viewmodel.ProductViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class DaggerPersistenceApp_HiltComponents_SingletonC {
  private DaggerPersistenceApp_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public PersistenceApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements PersistenceApp_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private SavedStateHandleHolder savedStateHandleHolder;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ActivityRetainedCBuilder savedStateHandleHolder(
        SavedStateHandleHolder savedStateHandleHolder) {
      this.savedStateHandleHolder = Preconditions.checkNotNull(savedStateHandleHolder);
      return this;
    }

    @Override
    public PersistenceApp_HiltComponents.ActivityRetainedC build() {
      Preconditions.checkBuilderRequirement(savedStateHandleHolder, SavedStateHandleHolder.class);
      return new ActivityRetainedCImpl(singletonCImpl, savedStateHandleHolder);
    }
  }

  private static final class ActivityCBuilder implements PersistenceApp_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public PersistenceApp_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements PersistenceApp_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public PersistenceApp_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements PersistenceApp_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public PersistenceApp_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements PersistenceApp_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public PersistenceApp_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements PersistenceApp_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public PersistenceApp_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements PersistenceApp_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public PersistenceApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends PersistenceApp_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends PersistenceApp_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends PersistenceApp_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends PersistenceApp_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Map<Class<?>, Boolean> getViewModelKeys() {
      return LazyClassKeyMap.<Boolean>of(MapBuilder.<String, Boolean>newMapBuilder(4).put(AdminViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, AdminViewModel_HiltModules.KeyModule.provide()).put(AuthViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, AuthViewModel_HiltModules.KeyModule.provide()).put(MainViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, MainViewModel_HiltModules.KeyModule.provide()).put(ProductViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, ProductViewModel_HiltModules.KeyModule.provide()).build());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }
  }

  private static final class ViewModelCImpl extends PersistenceApp_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    Provider<AdminViewModel> adminViewModelProvider;

    Provider<AuthViewModel> authViewModelProvider;

    Provider<MainViewModel> mainViewModelProvider;

    Provider<ProductViewModel> productViewModelProvider;

    ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        SavedStateHandle savedStateHandleParam, ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    ObtenerTodosLosUsuariosUseCase obtenerTodosLosUsuariosUseCase() {
      return new ObtenerTodosLosUsuariosUseCase(singletonCImpl.provideUserRepositoryProvider.get());
    }

    ObtenerUsuarioPorIdUseCase obtenerUsuarioPorIdUseCase() {
      return new ObtenerUsuarioPorIdUseCase(singletonCImpl.provideUserRepositoryProvider.get());
    }

    ActualizarUsuarioUseCase actualizarUsuarioUseCase() {
      return new ActualizarUsuarioUseCase(singletonCImpl.provideUserRepositoryProvider.get());
    }

    EliminarUsuarioUseCase eliminarUsuarioUseCase() {
      return new EliminarUsuarioUseCase(singletonCImpl.provideUserRepositoryProvider.get());
    }

    ActualizarContrasenaUseCase actualizarContrasenaUseCase() {
      return new ActualizarContrasenaUseCase(singletonCImpl.provideUserRepositoryProvider.get());
    }

    ObtenerUsuarioActualUseCase obtenerUsuarioActualUseCase() {
      return new ObtenerUsuarioActualUseCase(singletonCImpl.provideUserRepositoryProvider.get());
    }

    ActualizarTemaUseCase actualizarTemaUseCase() {
      return new ActualizarTemaUseCase(singletonCImpl.provideUserRepositoryProvider.get());
    }

    ActualizarNotificacionesUseCase actualizarNotificacionesUseCase() {
      return new ActualizarNotificacionesUseCase(singletonCImpl.provideUserRepositoryProvider.get());
    }

    LoginUsuarioUseCase loginUsuarioUseCase() {
      return new LoginUsuarioUseCase(singletonCImpl.provideUserRepositoryProvider.get());
    }

    RegistrarUsuarioUseCase registrarUsuarioUseCase() {
      return new RegistrarUsuarioUseCase(singletonCImpl.provideUserRepositoryProvider.get());
    }

    CerrarSesionUseCase cerrarSesionUseCase() {
      return new CerrarSesionUseCase(singletonCImpl.provideUserRepositoryProvider.get());
    }

    GetUserUseCase getUserUseCase() {
      return new GetUserUseCase(singletonCImpl.provideUserRepositoryProvider.get());
    }

    LoginUseCase loginUseCase() {
      return new LoginUseCase(singletonCImpl.provideUserRepositoryProvider.get());
    }

    LogoutUseCase logoutUseCase() {
      return new LogoutUseCase(singletonCImpl.provideUserRepositoryProvider.get());
    }

    UpdateThemeUseCase updateThemeUseCase() {
      return new UpdateThemeUseCase(singletonCImpl.provideUserRepositoryProvider.get());
    }

    GetUserPreferencesUseCase getUserPreferencesUseCase() {
      return new GetUserPreferencesUseCase(singletonCImpl.provideUserRepositoryProvider.get());
    }

    IsUserLoggedInUseCase isUserLoggedInUseCase() {
      return new IsUserLoggedInUseCase(singletonCImpl.provideUserRepositoryProvider.get());
    }

    ObtenerTodosLosProductosUseCase obtenerTodosLosProductosUseCase() {
      return new ObtenerTodosLosProductosUseCase(singletonCImpl.provideProductRepositoryProvider.get());
    }

    ObtenerProductoPorIdUseCase obtenerProductoPorIdUseCase() {
      return new ObtenerProductoPorIdUseCase(singletonCImpl.provideProductRepositoryProvider.get());
    }

    CrearProductoUseCase crearProductoUseCase() {
      return new CrearProductoUseCase(singletonCImpl.provideProductRepositoryProvider.get());
    }

    ActualizarProductoUseCase actualizarProductoUseCase() {
      return new ActualizarProductoUseCase(singletonCImpl.provideProductRepositoryProvider.get());
    }

    EliminarProductoUseCase eliminarProductoUseCase() {
      return new EliminarProductoUseCase(singletonCImpl.provideProductRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.adminViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.authViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.mainViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.productViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
    }

    @Override
    public Map<Class<?>, javax.inject.Provider<ViewModel>> getHiltViewModelMap() {
      return LazyClassKeyMap.<javax.inject.Provider<ViewModel>>of(MapBuilder.<String, javax.inject.Provider<ViewModel>>newMapBuilder(4).put(AdminViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (adminViewModelProvider))).put(AuthViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (authViewModelProvider))).put(MainViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (mainViewModelProvider))).put(ProductViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (productViewModelProvider))).build());
    }

    @Override
    public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
      return Collections.<Class<?>, Object>emptyMap();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @Override
      @SuppressWarnings("unchecked")
      public T get() {
        switch (id) {
          case 0: // edu.itvo.persistenciadatos.presentation.viewmodel.AdminViewModel
          return (T) new AdminViewModel(viewModelCImpl.obtenerTodosLosUsuariosUseCase(), viewModelCImpl.obtenerUsuarioPorIdUseCase(), viewModelCImpl.actualizarUsuarioUseCase(), viewModelCImpl.eliminarUsuarioUseCase(), viewModelCImpl.actualizarContrasenaUseCase(), viewModelCImpl.obtenerUsuarioActualUseCase(), viewModelCImpl.actualizarTemaUseCase(), viewModelCImpl.actualizarNotificacionesUseCase());

          case 1: // edu.itvo.persistenciadatos.presentation.viewmodel.AuthViewModel
          return (T) new AuthViewModel(viewModelCImpl.loginUsuarioUseCase(), viewModelCImpl.registrarUsuarioUseCase(), viewModelCImpl.cerrarSesionUseCase(), viewModelCImpl.obtenerUsuarioActualUseCase());

          case 2: // edu.itvo.persistenciadatos.presentation.viewmodel.MainViewModel
          return (T) new MainViewModel(viewModelCImpl.getUserUseCase(), viewModelCImpl.loginUseCase(), viewModelCImpl.logoutUseCase(), viewModelCImpl.updateThemeUseCase(), viewModelCImpl.getUserPreferencesUseCase(), viewModelCImpl.isUserLoggedInUseCase());

          case 3: // edu.itvo.persistenciadatos.presentation.viewmodel.ProductViewModel
          return (T) new ProductViewModel(viewModelCImpl.obtenerTodosLosProductosUseCase(), viewModelCImpl.obtenerProductoPorIdUseCase(), viewModelCImpl.crearProductoUseCase(), viewModelCImpl.actualizarProductoUseCase(), viewModelCImpl.eliminarProductoUseCase());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends PersistenceApp_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    ActivityRetainedCImpl(SingletonCImpl singletonCImpl,
        SavedStateHandleHolder savedStateHandleHolderParam) {
      this.singletonCImpl = singletonCImpl;

      initialize(savedStateHandleHolderParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @Override
      @SuppressWarnings("unchecked")
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends PersistenceApp_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends PersistenceApp_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    Provider<AppDatabase> provideAppDatabaseProvider;

    Provider<UserDao> provideUserDaoProvider;

    Provider<UserRepository> provideUserRepositoryProvider;

    Provider<ProductDao> provideProductDaoProvider;

    Provider<ProductRepository> provideProductRepositoryProvider;

    SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.provideAppDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<AppDatabase>(singletonCImpl, 2));
      this.provideUserDaoProvider = DoubleCheck.provider(new SwitchingProvider<UserDao>(singletonCImpl, 1));
      this.provideUserRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<UserRepository>(singletonCImpl, 0));
      this.provideProductDaoProvider = DoubleCheck.provider(new SwitchingProvider<ProductDao>(singletonCImpl, 4));
      this.provideProductRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<ProductRepository>(singletonCImpl, 3));
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    @Override
    public void injectPersistenceApp(PersistenceApp persistenceApp) {
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @Override
      @SuppressWarnings("unchecked")
      public T get() {
        switch (id) {
          case 0: // edu.itvo.persistenciadatos.domain.repository.UserRepository
          return (T) DataModule_ProvideUserRepositoryFactory.provideUserRepository(singletonCImpl.provideUserDaoProvider.get());

          case 1: // edu.itvo.persistenciadatos.data.local.database.UserDao
          return (T) DatabaseModule_ProvideUserDaoFactory.provideUserDao(singletonCImpl.provideAppDatabaseProvider.get());

          case 2: // edu.itvo.persistenciadatos.data.local.database.AppDatabase
          return (T) DatabaseModule_ProvideAppDatabaseFactory.provideAppDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 3: // edu.itvo.persistenciadatos.domain.repository.ProductRepository
          return (T) DataModule_ProvideProductRepositoryFactory.provideProductRepository(singletonCImpl.provideProductDaoProvider.get());

          case 4: // edu.itvo.persistenciadatos.data.local.database.ProductDao
          return (T) DatabaseModule_ProvideProductDaoFactory.provideProductDao(singletonCImpl.provideAppDatabaseProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
