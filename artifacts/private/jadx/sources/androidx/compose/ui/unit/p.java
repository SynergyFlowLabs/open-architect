package androidx.compose.ui.unit;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f42708a = -9223372034707292160L;

    public static final void a(boolean z10, @NotNull Function0<String> function0) {
        if (z10) {
            return;
        }
        d(function0.invoke());
    }

    public static final void b(boolean z10, @NotNull Function0<String> function0) {
        if (z10) {
            return;
        }
        c(function0.invoke());
    }

    public static final void c(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void d(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}
