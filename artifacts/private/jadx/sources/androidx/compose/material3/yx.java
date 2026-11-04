package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nShortNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortNavigationBar.kt\nandroidx/compose/material3/ShortNavigationBarItemDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n1#2:542\n*E\n"})
public final class yx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final yx f34867a = new yx();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f34868b = 0;

    private yx() {
    }

    @androidx.compose.runtime.o
    @NotNull
    public final vo a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(954437293, i10, -1, "androidx.compose.material3.ShortNavigationBarItemDefaults.colors (ShortNavigationBar.kt:287)");
        }
        vo voVarC = c(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return voVarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final vo b(long j10, long j11, long j12, long j13, long j14, long j15, long j16, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long j17;
        long jW;
        long j18;
        long jW2;
        long jR = (i11 & 1) != 0 ? o6.r(d0.k1.f268357a.d(), c0Var, 6) : j10;
        long jR2 = (i11 & 2) != 0 ? o6.r(d0.k1.f268357a.h(), c0Var, 6) : j11;
        long jR3 = (i11 & 4) != 0 ? o6.r(d0.k1.f268357a.e(), c0Var, 6) : j12;
        long jR4 = (i11 & 8) != 0 ? o6.r(d0.k1.f268357a.j(), c0Var, 6) : j13;
        long jR5 = (i11 & 16) != 0 ? o6.r(d0.k1.f268357a.k(), c0Var, 6) : j14;
        if ((i11 & 32) != 0) {
            long j19 = jR4;
            jW = androidx.compose.ui.graphics.q0.w(j19, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j17 = j19;
        } else {
            j17 = jR4;
            jW = j15;
        }
        if ((i11 & 64) != 0) {
            long j20 = jR5;
            jW2 = androidx.compose.ui.graphics.q0.w(j20, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j18 = j20;
        } else {
            j18 = jR5;
            jW2 = j16;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1801697574, i10, -1, "androidx.compose.material3.ShortNavigationBarItemDefaults.colors (ShortNavigationBar.kt:312)");
        }
        vo voVarA = c(pj.f31758a.a(c0Var, 6)).a(jR, jR2, jR3, j17, j18, jW, jW2);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return voVarA;
    }

    @NotNull
    public final vo c(@NotNull l6 l6Var) {
        vo voVarS = l6Var.S();
        if (voVarS != null) {
            return voVarS;
        }
        d0.k1 k1Var = d0.k1.f268357a;
        vo voVar = new vo(o6.o(l6Var, k1Var.d()), o6.o(l6Var, k1Var.h()), o6.o(l6Var, k1Var.e()), o6.o(l6Var, k1Var.j()), o6.o(l6Var, k1Var.k()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, k1Var.j()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, k1Var.k()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.J1(voVar);
        return voVar;
    }
}
