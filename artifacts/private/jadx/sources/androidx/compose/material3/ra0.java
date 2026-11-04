package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nWideNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WideNavigationRail.kt\nandroidx/compose/material3/WideNavigationRailDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1263:1\n1#2:1264\n*E\n"})
public final class ra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ra0 f32505a = new ra0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final am f32506b = dc0.l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f32507c = 0;

    private ra0() {
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getContainerColor")
    private final long d(androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(2034736487, i10, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-containerColor> (WideNavigationRail.kt:855)");
        }
        long jR = o6.r(d0.o1.f268586a.a(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getDefaultWideWideNavigationRailColors")
    private final qa0 e(l6 l6Var, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1969597361, i10, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-defaultWideWideNavigationRailColors> (WideNavigationRail.kt:862)");
        }
        qa0 qa0VarE0 = l6Var.e0();
        if (qa0VarE0 == null) {
            c0Var.E(1297532678);
            int i11 = (i10 >> 3) & 14;
            qa0VarE0 = new qa0(d(c0Var, i11), o6.f(l6Var, d(c0Var, i11)), g(c0Var, i11), androidx.compose.ui.graphics.q0.w(o6.r(d0.f2.f268022a.a(), c0Var, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null), o6.f(l6Var, g(c0Var, i11)), null);
            l6Var.T1(qa0VarE0);
            c0Var.A();
        } else {
            c0Var.E(1297515721);
            c0Var.A();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return qa0VarE0;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getModalContainerColor")
    private final long g(androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1008951947, i10, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-modalContainerColor> (WideNavigationRail.kt:858)");
        }
        long jR = o6.r(d0.q1.f268698a.e(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final qa0 a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(255272712, i10, -1, "androidx.compose.material3.WideNavigationRailDefaults.colors (WideNavigationRail.kt:820)");
        }
        qa0 qa0VarE = e(pj.f31758a.a(c0Var, 6), c0Var, (i10 << 3) & com.planner5d.library.engine.input.f.b.B);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return qa0VarE;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final qa0 b(long j10, long j11, long j12, long j13, long j14, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jD = (i11 & 1) != 0 ? f32505a.d(c0Var, 6) : j10;
        long jG = (i11 & 2) != 0 ? o6.g(jD, c0Var, i10 & 14) : j11;
        long jR = (i11 & 4) != 0 ? o6.r(d0.q1.f268698a.e(), c0Var, 6) : j12;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.w(o6.r(d0.f2.f268022a.a(), c0Var, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jG2 = (i11 & 16) != 0 ? o6.g(jR, c0Var, (i10 >> 6) & 14) : j14;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(239918099, i10, -1, "androidx.compose.material3.WideNavigationRailDefaults.colors (WideNavigationRail.kt:846)");
        }
        qa0 qa0VarA = e(pj.f31758a.a(c0Var, 6), c0Var, (i10 >> 12) & com.planner5d.library.engine.input.f.b.B).a(jD, jG, jR, jW, jG2);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return qa0VarA;
    }

    @NotNull
    public final androidx.compose.foundation.layout.q.m c() {
        return androidx.compose.foundation.layout.q.f16330a.y();
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getModalCollapsedShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 f(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(926228775, i10, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-modalCollapsedShape> (WideNavigationRail.kt:806)");
        }
        androidx.compose.ui.graphics.q3 q3VarJ = j(c0Var, i10 & 14);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarJ;
    }

    @NotNull
    public final am h() {
        return f32506b;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getModalExpandedShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 i(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1865689797, i10, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-modalExpandedShape> (WideNavigationRail.kt:810)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.q1.f268698a.g(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 j(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1756160851, i10, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-shape> (WideNavigationRail.kt:790)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.o1.f268586a.c(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getWindowInsets")
    @NotNull
    public final androidx.compose.foundation.layout.v6 k(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1769402286, i10, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-windowInsets> (WideNavigationRail.kt:800)");
        }
        androidx.compose.foundation.layout.v6 v6VarA = androidx.compose.material3.internal.o3.a(androidx.compose.foundation.layout.v6.f16495a, c0Var, 6);
        androidx.compose.foundation.layout.v7.a aVar = androidx.compose.foundation.layout.v7.f16497b;
        androidx.compose.foundation.layout.v6 v6VarK = androidx.compose.foundation.layout.b7.k(v6VarA, androidx.compose.foundation.layout.v7.s(aVar.l(), aVar.j()));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return v6VarK;
    }
}
