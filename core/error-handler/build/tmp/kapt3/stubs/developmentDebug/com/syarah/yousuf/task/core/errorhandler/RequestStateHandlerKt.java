package com.syarah.yousuf.task.core.errorhandler;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aV\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00010\u0006\u00a2\u0006\u0002\b\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\t\u00a2\u0006\u0002\b\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u00a8\u0006\u000b"}, d2 = {"RequestStateHandler", "", "T", "requestState", "Lcom/syarah/yousuf/task/core/errorhandler/RequestState;", "onLoading", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "onSuccess", "Lkotlin/Function1;", "retry", "error-handler_developmentDebug"})
public final class RequestStateHandlerKt {
    
    /**
     * Project: SyarahTask
     * Created: Aug 05, 2025
     *
     * @author Yousuf Abu Fadda
     */
    @androidx.compose.runtime.Composable()
    public static final <T extends java.lang.Object>void RequestStateHandler(@org.jetbrains.annotations.NotNull()
    com.syarah.yousuf.task.core.errorhandler.RequestState<? extends T> requestState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoading, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
    }
}