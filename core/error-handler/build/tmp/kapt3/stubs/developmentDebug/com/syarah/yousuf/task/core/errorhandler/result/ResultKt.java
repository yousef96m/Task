package com.syarah.yousuf.task.core.errorhandler.result;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0086\b\u00f8\u0001\u0000\u001a9\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0006*\u0002H\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00020\b\u00a2\u0006\u0002\u0010\n\u001a-\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0006*\u0002H\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0007\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\u000b\u001a\u001d\u0010\f\u001a\u0004\u0018\u0001H\u0006\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u0001\u00a2\u0006\u0002\u0010\r\u001a\u001b\u0010\u000e\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u0001\u00a2\u0006\u0002\u0010\r\u001aE\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00012!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u0011H\u0006\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u0002H\u00020\b\u001a?\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00012!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\t0\b\u001a\u0010\u0010\u0015\u001a\u00020\u0016*\u0006\u0012\u0002\b\u00030\u0001H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0017"}, d2 = {"runWithCatching", "Lcom/syarah/yousuf/task/core/errorhandler/result/Result;", "R", "block", "Lkotlin/Function0;", "getOrDefault", "T", "defaultValue", "Lkotlin/Function1;", "", "(Lcom/syarah/yousuf/task/core/errorhandler/result/Result;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Lcom/syarah/yousuf/task/core/errorhandler/result/Result;Ljava/lang/Object;)Ljava/lang/Object;", "getOrNull", "(Lcom/syarah/yousuf/task/core/errorhandler/result/Result;)Ljava/lang/Object;", "getOrThrow", "map", "transform", "Lkotlin/ParameterName;", "name", "value", "mapError", "throwOnFailure", "", "error-handler_developmentDebug"})
@kotlin.Suppress(names = {"UNCHECKED_CAST"})
public final class ResultKt {
    
    public static final void throwOnFailure(@org.jetbrains.annotations.NotNull()
    com.syarah.yousuf.task.core.errorhandler.result.Result<?> $this$throwOnFailure) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <R extends java.lang.Object>com.syarah.yousuf.task.core.errorhandler.result.Result<R> runWithCatching(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends R> block) {
        return null;
    }
    
    public static final <T extends java.lang.Object>T getOrThrow(@org.jetbrains.annotations.NotNull()
    com.syarah.yousuf.task.core.errorhandler.result.Result<? extends T> $this$getOrThrow) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>T getOrNull(@org.jetbrains.annotations.NotNull()
    com.syarah.yousuf.task.core.errorhandler.result.Result<? extends T> $this$getOrNull) {
        return null;
    }
    
    public static final <R extends java.lang.Object, T extends R>R getOrDefault(@org.jetbrains.annotations.NotNull()
    com.syarah.yousuf.task.core.errorhandler.result.Result<? extends R> $this$getOrDefault, R defaultValue) {
        return null;
    }
    
    public static final <R extends java.lang.Object, T extends R>R getOrDefault(@org.jetbrains.annotations.NotNull()
    com.syarah.yousuf.task.core.errorhandler.result.Result<? extends R> $this$getOrDefault, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends R> defaultValue) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <R extends java.lang.Object, T extends java.lang.Object>com.syarah.yousuf.task.core.errorhandler.result.Result<R> map(@org.jetbrains.annotations.NotNull()
    com.syarah.yousuf.task.core.errorhandler.result.Result<? extends T> $this$map, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends R> transform) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>com.syarah.yousuf.task.core.errorhandler.result.Result<T> mapError(@org.jetbrains.annotations.NotNull()
    com.syarah.yousuf.task.core.errorhandler.result.Result<? extends T> $this$mapError, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> transform) {
        return null;
    }
}