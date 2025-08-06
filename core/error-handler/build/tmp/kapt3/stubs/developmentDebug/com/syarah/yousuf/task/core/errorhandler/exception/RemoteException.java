package com.syarah.yousuf.task.core.errorhandler.exception;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0019\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0005\u0082\u0001\u0003\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/syarah/yousuf/task/core/errorhandler/exception/RemoteException;", "", "message", "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Http", "Network", "Unknown", "Lcom/syarah/yousuf/task/core/errorhandler/exception/RemoteException$Http;", "Lcom/syarah/yousuf/task/core/errorhandler/exception/RemoteException$Network;", "Lcom/syarah/yousuf/task/core/errorhandler/exception/RemoteException$Unknown;", "error-handler_developmentDebug"})
public abstract class RemoteException extends java.lang.Throwable {
    
    private RemoteException(java.lang.String message, java.lang.Throwable throwable) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/syarah/yousuf/task/core/errorhandler/exception/RemoteException$Http;", "Lcom/syarah/yousuf/task/core/errorhandler/exception/RemoteException;", "message", "", "throwable", "", "body", "Lcom/syarah/yousuf/task/core/errorhandler/model/HttpErrorBodyModel;", "status", "Lcom/syarah/yousuf/task/core/errorhandler/exception/HttpStatus;", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/syarah/yousuf/task/core/errorhandler/model/HttpErrorBodyModel;Lcom/syarah/yousuf/task/core/errorhandler/exception/HttpStatus;)V", "getBody", "()Lcom/syarah/yousuf/task/core/errorhandler/model/HttpErrorBodyModel;", "getStatus", "()Lcom/syarah/yousuf/task/core/errorhandler/exception/HttpStatus;", "error-handler_developmentDebug"})
    public static final class Http extends com.syarah.yousuf.task.core.errorhandler.exception.RemoteException {
        @org.jetbrains.annotations.NotNull()
        private final com.syarah.yousuf.task.core.errorhandler.model.HttpErrorBodyModel body = null;
        @org.jetbrains.annotations.NotNull()
        private final com.syarah.yousuf.task.core.errorhandler.exception.HttpStatus status = null;
        
        public Http(@org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable, @org.jetbrains.annotations.NotNull()
        com.syarah.yousuf.task.core.errorhandler.model.HttpErrorBodyModel body, @org.jetbrains.annotations.NotNull()
        com.syarah.yousuf.task.core.errorhandler.exception.HttpStatus status) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.syarah.yousuf.task.core.errorhandler.model.HttpErrorBodyModel getBody() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.syarah.yousuf.task.core.errorhandler.exception.HttpStatus getStatus() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/syarah/yousuf/task/core/errorhandler/exception/RemoteException$Network;", "Lcom/syarah/yousuf/task/core/errorhandler/exception/RemoteException;", "message", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "error-handler_developmentDebug"})
    public static final class Network extends com.syarah.yousuf.task.core.errorhandler.exception.RemoteException {
        
        public Network(@org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/syarah/yousuf/task/core/errorhandler/exception/RemoteException$Unknown;", "Lcom/syarah/yousuf/task/core/errorhandler/exception/RemoteException;", "message", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "error-handler_developmentDebug"})
    public static final class Unknown extends com.syarah.yousuf.task.core.errorhandler.exception.RemoteException {
        
        public Unknown(@org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
        }
    }
}