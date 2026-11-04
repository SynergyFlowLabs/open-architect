package androidx.compose.material;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class yf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final yf f25708a = new yf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f25709b = 0.8f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f25710c = 0;

    private yf() {
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getBackgroundColor")
    public final long a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1630911716, i10, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:201)");
        }
        x9 x9Var = x9.f25488a;
        long j10 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(x9Var.a(c0Var, 6).i(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), x9Var.a(c0Var, 6).n());
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j10;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getPrimaryActionColor")
    public final long b(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long jK;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-810329402, i10, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:221)");
        }
        l4 l4VarA = x9.f25488a.a(c0Var, 6);
        if (l4VarA.o()) {
            jK = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(l4VarA.n(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), l4VarA.j());
        } else {
            jK = l4VarA.k();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jK;
    }
}
