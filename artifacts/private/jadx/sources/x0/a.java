package x0;

import kotlin.a0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final void a(boolean z10, @NotNull Function0<String> function0) {
        if (!z10) {
            g(function0.invoke());
        }
    }

    @NotNull
    public static final <T> T b(@Nullable T t10, @NotNull Function0<String> function0) {
        if (t10 != null) {
            return t10;
        }
        h(function0.invoke());
        throw new a0();
    }

    public static final void c(boolean z10, @NotNull Function0<String> function0) {
        if (z10) {
            return;
        }
        e(function0.invoke());
    }

    @NotNull
    public static final <T> T d(@Nullable T t10, @NotNull Function0<String> function0) {
        if (t10 != null) {
            return t10;
        }
        f(function0.invoke());
        throw new a0();
    }

    public static final void e(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    @NotNull
    public static final Void f(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void g(@NotNull String str) {
        throw new IllegalStateException(str);
    }

    @NotNull
    public static final Void h(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}
