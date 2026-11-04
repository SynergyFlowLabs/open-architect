package kotlinx.serialization.internal;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlinx.serialization.i
public interface p0<T> extends KSerializer<T> {

    public static final class a {
        @Deprecated
        @NotNull
        public static <T> KSerializer<?>[] a(@NotNull p0<T> p0Var) {
            return p0.super.typeParametersSerializers();
        }
    }

    @NotNull
    KSerializer<?>[] childSerializers();

    @NotNull
    default KSerializer<?>[] typeParametersSerializers() {
        return m2.f315974a;
    }
}
