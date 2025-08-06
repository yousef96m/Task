package com.syarah.yousuf.task.core.errorhandler.result;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \r*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\r\u000eB\u0011\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/syarah/yousuf/task/core/errorhandler/result/Result;", "T", "", "value", "(Ljava/lang/Object;)V", "isFailure", "", "()Z", "isSuccess", "getValue$error_handler_developmentDebug", "()Ljava/lang/Object;", "toString", "", "Companion", "Failure", "error-handler_developmentDebug"})
public final class Result<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object value = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.syarah.yousuf.task.core.errorhandler.result.Result.Companion Companion = null;
    
    public Result(@org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getValue$error_handler_developmentDebug() {
        return null;
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final boolean isFailure() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u0001J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\b\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/syarah/yousuf/task/core/errorhandler/result/Result$Companion;", "", "()V", "failure", "Lcom/syarah/yousuf/task/core/errorhandler/result/Result;", "T", "exception", "success", "value", "(Ljava/lang/Object;)Lcom/syarah/yousuf/task/core/errorhandler/result/Result;", "error-handler_developmentDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.syarah.yousuf.task.core.errorhandler.result.Result<T> success(T value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.syarah.yousuf.task.core.errorhandler.result.Result<T> failure(@org.jetbrains.annotations.NotNull()
        java.lang.Object exception) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0001H\u00c6\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u00c6\u0001J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001R\u0012\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/syarah/yousuf/task/core/errorhandler/result/Result$Failure;", "", "exception", "(Ljava/lang/Object;)V", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "error-handler_developmentDebug"})
    public static final class Failure {
        @kotlin.jvm.JvmField()
        @org.jetbrains.annotations.NotNull()
        public java.lang.Object exception;
        
        public Failure(@org.jetbrains.annotations.NotNull()
        java.lang.Object exception) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.syarah.yousuf.task.core.errorhandler.result.Result.Failure copy(@org.jetbrains.annotations.NotNull()
        java.lang.Object exception) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}