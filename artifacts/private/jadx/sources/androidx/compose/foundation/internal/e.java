package androidx.compose.foundation.internal;

import kotlin.a0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final void a(boolean z10) {
        if (z10) {
            return;
        }
        i("Check failed.");
    }

    public static final void b(boolean z10, @NotNull Function0<String> function0) {
        if (z10) {
            return;
        }
        i(function0.invoke());
    }

    @NotNull
    public static final <T> T c(@Nullable T t10) {
        if (t10 != null) {
            return t10;
        }
        j("Required value was null.");
        throw new a0();
    }

    @NotNull
    public static final <T> T d(@Nullable T t10, @NotNull Function0<String> function0) {
        if (t10 != null) {
            return t10;
        }
        j(function0.invoke());
        throw new a0();
    }

    public static final void e(boolean z10, @NotNull Function0<String> function0) {
        if (z10) {
            return;
        }
        g(function0.invoke());
    }

    @NotNull
    public static final <T> T f(@Nullable T t10, @NotNull Function0<String> function0) {
        if (t10 != null) {
            return t10;
        }
        h(function0.invoke());
        throw new a0();
    }

    public static final void g(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    @NotNull
    public static final Void h(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void i(@NotNull String str) {
        throw new IllegalStateException(str);
    }

    @NotNull
    public static final Void j(@NotNull String str) {
        throw new IllegalStateException(str);
    }

    public static final void k(@NotNull String str) {
        throw new IndexOutOfBoundsException(str);
    }
}
