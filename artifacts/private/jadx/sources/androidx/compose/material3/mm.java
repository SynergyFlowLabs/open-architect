package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarItemDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,815:1\n1#2:816\n*E\n"})
public final class mm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final mm f30654a = new mm();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f30655b = 0;

    private mm() {
    }

    @androidx.compose.runtime.o
    @NotNull
    public final lm a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1018883954, i10, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:344)");
        }
        lm lmVarD = d(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return lmVarD;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final lm b(long j10, long j11, long j12, long j13, long j14, long j15, long j16, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jU6 = (i11 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j15;
        long jU7 = (i11 & 64) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j16;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1618564327, i10, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:369)");
        }
        lm lmVarA = d(pj.f31758a.a(c0Var, 6)).a(jU, jU2, jU3, jU4, jU5, jU6, jU7);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return lmVarA;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use overload with disabledIconColor and disabledTextColor")
    public final /* synthetic */ lm c(long j10, long j11, long j12, long j13, long j14, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jR = (i11 & 1) != 0 ? o6.r(d0.k1.f268357a.d(), c0Var, 6) : j10;
        long jR2 = (i11 & 2) != 0 ? o6.r(d0.k1.f268357a.h(), c0Var, 6) : j11;
        long jR3 = (i11 & 4) != 0 ? o6.r(d0.k1.f268357a.e(), c0Var, 6) : j12;
        long jR4 = (i11 & 8) != 0 ? o6.r(d0.k1.f268357a.j(), c0Var, 6) : j13;
        long jR5 = (i11 & 16) != 0 ? o6.r(d0.k1.f268357a.k(), c0Var, 6) : j14;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-213647161, i10, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:412)");
        }
        lm lmVar = new lm(jR, jR2, jR3, jR4, jR5, androidx.compose.ui.graphics.q0.w(jR4, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(jR5, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return lmVar;
    }

    @NotNull
    public final lm d(@NotNull l6 l6Var) {
        lm lmVarF = l6Var.F();
        if (lmVarF != null) {
            return lmVarF;
        }
        d0.k1 k1Var = d0.k1.f268357a;
        lm lmVar = new lm(o6.o(l6Var, k1Var.d()), o6.o(l6Var, k1Var.h()), o6.o(l6Var, k1Var.e()), o6.o(l6Var, k1Var.j()), o6.o(l6Var, k1Var.k()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, k1Var.j()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, k1Var.k()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.x1(lmVar);
        return lmVar;
    }
}
