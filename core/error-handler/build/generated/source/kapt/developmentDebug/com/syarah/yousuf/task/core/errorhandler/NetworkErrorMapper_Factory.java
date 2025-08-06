package com.syarah.yousuf.task.core.errorhandler;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.serialization.json.Json;

@ScopeMetadata
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
public final class NetworkErrorMapper_Factory implements Factory<NetworkErrorMapper> {
  private final Provider<Json> jsonProvider;

  public NetworkErrorMapper_Factory(Provider<Json> jsonProvider) {
    this.jsonProvider = jsonProvider;
  }

  @Override
  public NetworkErrorMapper get() {
    return newInstance(jsonProvider.get());
  }

  public static NetworkErrorMapper_Factory create(Provider<Json> jsonProvider) {
    return new NetworkErrorMapper_Factory(jsonProvider);
  }

  public static NetworkErrorMapper newInstance(Json json) {
    return new NetworkErrorMapper(json);
  }
}
