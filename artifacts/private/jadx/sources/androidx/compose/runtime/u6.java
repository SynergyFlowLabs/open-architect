package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface u6<T> {

    public static final class a {
        @Deprecated
        @Nullable
        public static <T> T a(@NotNull u6<T> u6Var, T t10, T t11, T t12) {
            return (T) u6.super.c(t10, t11, t12);
        }
    }

    boolean b(T t10, T t11);

    @Nullable
    default T c(T t10, T t11, T t12) {
        return null;
    }
}
