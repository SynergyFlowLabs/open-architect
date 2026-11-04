package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface w2<T> {

    public static final class a {
        @Deprecated
        public static <T> boolean a(@NotNull w2<T> w2Var, @NotNull kotlin.reflect.d<?> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return w2.super.b(key);
        }
    }

    @Nullable
    KSerializer<T> a(@NotNull kotlin.reflect.d<Object> dVar);

    default boolean b(@NotNull kotlin.reflect.d<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return false;
    }
}
