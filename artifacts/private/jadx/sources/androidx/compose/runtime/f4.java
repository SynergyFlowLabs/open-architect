package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class f4 {
    public static final void a(boolean z10) {
        if (!z10) {
            e("Check failed.");
        }
    }

    public static final void b(boolean z10, @NotNull Function0<String> function0) {
        if (z10) {
            return;
        }
        e(function0.invoke());
    }

    public static final void c(boolean z10, @NotNull Function0<String> function0) {
        if (z10) {
            return;
        }
        d(function0.invoke());
    }

    public static final void d(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void e(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}
