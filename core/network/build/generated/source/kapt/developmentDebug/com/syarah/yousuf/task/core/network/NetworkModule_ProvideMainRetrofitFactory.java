package com.syarah.yousuf.task.core.network;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
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
public final class NetworkModule_ProvideMainRetrofitFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<Converter.Factory> converterFactoryProvider;

  public NetworkModule_ProvideMainRetrofitFactory(Provider<OkHttpClient> okHttpClientProvider,
      Provider<Converter.Factory> converterFactoryProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
    this.converterFactoryProvider = converterFactoryProvider;
  }

  @Override
  public Retrofit get() {
    return provideMainRetrofit(okHttpClientProvider.get(), converterFactoryProvider.get());
  }

  public static NetworkModule_ProvideMainRetrofitFactory create(
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<Converter.Factory> converterFactoryProvider) {
    return new NetworkModule_ProvideMainRetrofitFactory(okHttpClientProvider, converterFactoryProvider);
  }

  public static Retrofit provideMainRetrofit(OkHttpClient okHttpClient,
      Converter.Factory converterFactory) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideMainRetrofit(okHttpClient, converterFactory));
  }
}
