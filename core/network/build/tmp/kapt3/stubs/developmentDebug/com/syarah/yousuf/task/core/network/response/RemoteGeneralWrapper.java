package com.syarah.yousuf.task.core.network.response;

/**
 * Project: SyarahTask
 * Created: Aug 05, 2025
 *
 * @author Yousuf Abu Fadda
 */
@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 =*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002<=Bg\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fBS\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010$\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010 Jb\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u00002\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010/\u001a\u00020\u0004H\u00d6\u0001J\t\u00100\u001a\u00020\u0007H\u00d6\u0001J@\u00101\u001a\u000202\"\u0004\b\u0001\u001032\f\u00104\u001a\b\u0012\u0004\u0012\u0002H30\u00002\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\f\u00109\u001a\b\u0012\u0004\u0012\u0002H30:H\u00c1\u0001\u00a2\u0006\u0002\b;R \u0010\b\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u0015\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001bR \u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010!\u0012\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010 R \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010!\u0012\u0004\b\"\u0010\u0012\u001a\u0004\b#\u0010 \u00a8\u0006>"}, d2 = {"Lcom/syarah/yousuf/task/core/network/response/RemoteGeneralWrapper;", "T", "", "seen1", "", "status", "message", "", "components", "errors", "", "exception", "updateAvailable", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "getComponents$annotations", "()V", "getComponents", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrors$annotations", "getErrors", "()Ljava/util/List;", "getException$annotations", "getException", "()Ljava/lang/String;", "getMessage$annotations", "getMessage", "getStatus$annotations", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUpdateAvailable$annotations", "getUpdateAvailable", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lcom/syarah/yousuf/task/core/network/response/RemoteGeneralWrapper;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "T0", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "write$Self$network_developmentDebug", "$serializer", "Companion", "network_developmentDebug"})
public final class RemoteGeneralWrapper<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable()
    private final T components = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> errors = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String exception = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer updateAvailable = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.syarah.yousuf.task.core.network.response.RemoteGeneralWrapper.Companion Companion = null;
    
    public RemoteGeneralWrapper(@org.jetbrains.annotations.Nullable()
    java.lang.Integer status, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    T components, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> errors, @org.jetbrains.annotations.Nullable()
    java.lang.String exception, @org.jetbrains.annotations.Nullable()
    java.lang.Integer updateAvailable) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStatus() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "status")
    @java.lang.Deprecated()
    public static void getStatus$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "message")
    @java.lang.Deprecated()
    public static void getMessage$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getComponents() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "data")
    @java.lang.Deprecated()
    public static void getComponents$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getErrors() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "errors")
    @java.lang.Deprecated()
    public static void getErrors$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getException() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "exception")
    @java.lang.Deprecated()
    public static void getException$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUpdateAvailable() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "update_available")
    @java.lang.Deprecated()
    public static void getUpdateAvailable$annotations() {
    }
    
    public RemoteGeneralWrapper() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.syarah.yousuf.task.core.network.response.RemoteGeneralWrapper<T> copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer status, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    T components, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> errors, @org.jetbrains.annotations.Nullable()
    java.lang.String exception, @org.jetbrains.annotations.Nullable()
    java.lang.Integer updateAvailable) {
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
    
    @kotlin.jvm.JvmStatic()
    public static final <T0 extends java.lang.Object>void write$Self$network_developmentDebug(@org.jetbrains.annotations.NotNull()
    com.syarah.yousuf.task.core.network.response.RemoteGeneralWrapper<T0> self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.KSerializer<T0> typeSerial0) {
    }
    
    /**
     * Project: SyarahTask
     * Created: Aug 05, 2025
     *
     * @author Yousuf Abu Fadda
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004B\u0015\b\u0017\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u000fH\u00d6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u00d6\u0001J\u0018\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u000fH\u00d6\u0001\u00a2\u0006\u0002\u0010\u0010R\u0014\u0010\b\u001a\u00020\t8VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068BX\u00c2\u0005\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001a"}, d2 = {"com/syarah/yousuf/task/core/network/response/RemoteGeneralWrapper.$serializer", "T", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/syarah/yousuf/task/core/network/response/RemoteGeneralWrapper;", "()V", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getTypeSerial0", "()Lkotlinx/serialization/KSerializer;", "childSerializers", "", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "typeParametersSerializers", "network_developmentDebug"})
    @java.lang.Deprecated()
    public static final class $serializer<T extends java.lang.Object> implements kotlinx.serialization.internal.GeneratedSerializer<com.syarah.yousuf.task.core.network.response.RemoteGeneralWrapper<T>> {
        
        private $serializer() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.syarah.yousuf.task.core.network.response.RemoteGeneralWrapper<T> deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        private final kotlinx.serialization.KSerializer<T> getTypeSerial0() {
            return null;
        }
        
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        com.syarah.yousuf.task.core.network.response.RemoteGeneralWrapper<T> value) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
    
    /**
     * Project: SyarahTask
     * Created: Aug 05, 2025
     *
     * @author Yousuf Abu Fadda
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u0004\"\u0004\b\u0001\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004H\u00c6\u0001\u00a8\u0006\b"}, d2 = {"Lcom/syarah/yousuf/task/core/network/response/RemoteGeneralWrapper$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/syarah/yousuf/task/core/network/response/RemoteGeneralWrapper;", "T0", "typeSerial0", "network_developmentDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T0 extends java.lang.Object>kotlinx.serialization.KSerializer<com.syarah.yousuf.task.core.network.response.RemoteGeneralWrapper<T0>> serializer(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.KSerializer<T0> typeSerial0) {
            return null;
        }
    }
}