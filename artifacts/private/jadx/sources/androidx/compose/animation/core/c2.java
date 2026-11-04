package androidx.compose.animation.core;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class c2 {
    public static final void a(boolean z10, @NotNull Function0<String> function0) {
        if (z10) {
            return;
        }
        e(function0.invoke());
    }

    @NotNull
    public static final <T> T b(@Nullable T t10, @NotNull Function0<String> function0) {
        if (t10 != null) {
            return t10;
        }
        f(function0.invoke());
        throw new kotlin.a0();
    }

    public static final void c(boolean z10, @NotNull Function0<String> function0) {
        if (!z10) {
            d(function0.invoke());
        }
    }

    public static final void d(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void e(@NotNull String str) {
        throw new IllegalStateException(str);
    }

    @NotNull
    public static final Void f(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}
