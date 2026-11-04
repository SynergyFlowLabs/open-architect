package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailItemDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,838:1\n1#2:839\n*E\n"})
public final class tp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final tp f33241a = new tp();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f33242b = 0;

    private tp() {
    }

    @androidx.compose.runtime.o
    @NotNull
    public final sp a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2014332261, i10, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:346)");
        }
        sp spVarD = d(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return spVarD;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final sp b(long j10, long j11, long j12, long j13, long j14, long j15, long j16, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long j17;
        long jW;
        long j18;
        long jW2;
        long jR = (i11 & 1) != 0 ? o6.r(d0.p1.f268638a.c(), c0Var, 6) : j10;
        long jR2 = (i11 & 2) != 0 ? o6.r(d0.p1.f268638a.e(), c0Var, 6) : j11;
        long jR3 = (i11 & 4) != 0 ? o6.r(d0.p1.f268638a.d(), c0Var, 6) : j12;
        long jR4 = (i11 & 8) != 0 ? o6.r(d0.p1.f268638a.i(), c0Var, 6) : j13;
        long jR5 = (i11 & 16) != 0 ? o6.r(d0.p1.f268638a.j(), c0Var, 6) : j14;
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
            androidx.compose.runtime.m0.A0(-2104358508, i10, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:371)");
        }
        sp spVarA = d(pj.f31758a.a(c0Var, 6)).a(jR, jR2, jR3, j17, j18, jW, jW2);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return spVarA;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use overload with disabledIconColor and disabledTextColor")
    public final /* synthetic */ sp c(long j10, long j11, long j12, long j13, long j14, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jR = (i11 & 1) != 0 ? o6.r(d0.p1.f268638a.c(), c0Var, 6) : j10;
        long jR2 = (i11 & 2) != 0 ? o6.r(d0.p1.f268638a.e(), c0Var, 6) : j11;
        long jR3 = (i11 & 4) != 0 ? o6.r(d0.p1.f268638a.d(), c0Var, 6) : j12;
        long jR4 = (i11 & 8) != 0 ? o6.r(d0.p1.f268638a.i(), c0Var, 6) : j13;
        long jR5 = (i11 & 16) != 0 ? o6.r(d0.p1.f268638a.j(), c0Var, 6) : j14;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1621601574, i10, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:415)");
        }
        sp spVar = new sp(jR, jR2, jR3, jR4, jR5, androidx.compose.ui.graphics.q0.w(jR4, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(jR5, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return spVar;
    }

    @NotNull
    public final sp d(@NotNull l6 l6Var) {
        sp spVarG = l6Var.G();
        if (spVarG != null) {
            return spVarG;
        }
        d0.p1 p1Var = d0.p1.f268638a;
        sp spVar = new sp(o6.o(l6Var, p1Var.c()), o6.o(l6Var, p1Var.e()), o6.o(l6Var, p1Var.d()), o6.o(l6Var, p1Var.i()), o6.o(l6Var, p1Var.j()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, p1Var.i()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, p1Var.j()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.y1(spVar);
        return spVar;
    }
}
