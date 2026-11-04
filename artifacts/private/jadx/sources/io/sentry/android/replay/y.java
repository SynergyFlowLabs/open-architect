package io.sentry.android.replay;

import io.sentry.p8;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class y {
    @kotlin.l(level = kotlin.n.ERROR, message = "Getter is unsupported.")
    public static final boolean a(@NotNull p8 p8Var) {
        Intrinsics.checkNotNullParameter(p8Var, "<this>");
        throw new IllegalStateException("Getter not supported");
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Getter is unsupported.")
    public static final boolean b(@NotNull p8 p8Var) {
        Intrinsics.checkNotNullParameter(p8Var, "<this>");
        throw new IllegalStateException("Getter not supported");
    }

    public static final void c(@NotNull p8 p8Var, boolean z10) {
        Intrinsics.checkNotNullParameter(p8Var, "<this>");
        p8Var.t(z10);
    }

    public static final void d(@NotNull p8 p8Var, boolean z10) {
        Intrinsics.checkNotNullParameter(p8Var, "<this>");
        p8Var.u(z10);
    }
}
