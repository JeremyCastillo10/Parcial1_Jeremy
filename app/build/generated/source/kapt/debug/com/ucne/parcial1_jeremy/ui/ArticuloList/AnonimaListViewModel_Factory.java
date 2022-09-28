// Generated by Dagger (https://dagger.dev).
package com.ucne.parcial1_jeremy.ui.ArticuloList;

import com.ucne.parcial1_jeremy.repository.ArticuloRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AnonimaListViewModel_Factory implements Factory<AnonimaListViewModel> {
  private final Provider<ArticuloRepository> repositoryProvider;

  public AnonimaListViewModel_Factory(Provider<ArticuloRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AnonimaListViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static AnonimaListViewModel_Factory create(
      Provider<ArticuloRepository> repositoryProvider) {
    return new AnonimaListViewModel_Factory(repositoryProvider);
  }

  public static AnonimaListViewModel newInstance(ArticuloRepository repository) {
    return new AnonimaListViewModel(repository);
  }
}