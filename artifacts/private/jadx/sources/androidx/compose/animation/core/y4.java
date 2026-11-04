package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface y4<V extends w> extends u4<V> {

    public static final class a {
        @Deprecated
        @NotNull
        public static <V extends w> V a(@NotNull y4<V> y4Var, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
            return (V) y4.super.e(v10, v11, v12);
        }

        @Deprecated
        public static <V extends w> boolean b(@NotNull y4<V> y4Var) {
            return y4.super.b();
        }
    }

    @Override // androidx.compose.animation.core.u4
    default boolean b() {
        return false;
    }
}
