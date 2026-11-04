package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface x4<V extends w> extends y4<V> {

    public static final class a {
        @Deprecated
        public static <V extends w> long a(@NotNull x4<V> x4Var, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
            return x4.super.c(v10, v11, v12);
        }

        @Deprecated
        @NotNull
        public static <V extends w> V b(@NotNull x4<V> x4Var, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
            return (V) x4.super.e(v10, v11, v12);
        }

        @Deprecated
        public static <V extends w> boolean c(@NotNull x4<V> x4Var) {
            return x4.super.b();
        }
    }

    int a();

    @Override // androidx.compose.animation.core.u4
    default long c(@NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return ((long) (k() + a())) * 1000000;
    }

    int k();
}
