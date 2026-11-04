package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface u4<V extends w> {

    public static final class a {
        @Deprecated
        @NotNull
        public static <V extends w> V a(@NotNull u4<V> u4Var, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
            return (V) u4.super.e(v10, v11, v12);
        }
    }

    boolean b();

    long c(@NotNull V v10, @NotNull V v11, @NotNull V v12);

    @NotNull
    default V e(@NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return (V) g(c(v10, v11, v12), v10, v11, v12);
    }

    @NotNull
    V g(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12);

    @NotNull
    V i(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12);
}
