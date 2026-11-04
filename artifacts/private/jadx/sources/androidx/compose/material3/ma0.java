package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nDragHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragHandle.kt\nandroidx/compose/material3/VerticalDragHandleDefaults\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,347:1\n646#2:348\n635#2:349\n646#2:350\n635#2:351\n646#2:352\n635#2:353\n363#3:354\n363#3:355\n363#3:356\n1#4:357\n*S KotlinDebug\n*F\n+ 1 DragHandle.kt\nandroidx/compose/material3/VerticalDragHandleDefaults\n*L\n237#1:348\n237#1:349\n238#1:350\n238#1:351\n239#1:352\n239#1:353\n298#1:354\n299#1:355\n300#1:356\n*E\n"})
public final class ma0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ma0 f30593a = new ma0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final wd f30594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f30595c = 0;

    static {
        d0.b0 b0Var = d0.b0.f267621a;
        f30594b = new wd(androidx.compose.ui.unit.i.b(b0Var.p(), b0Var.i()), androidx.compose.ui.unit.i.b(b0Var.n(), b0Var.l()), androidx.compose.ui.unit.i.b(b0Var.g(), b0Var.e()), null);
    }

    private ma0() {
    }

    private final md c(l6 l6Var) {
        md mdVarC0 = l6Var.c0();
        if (mdVarC0 != null) {
            return mdVarC0;
        }
        d0.b0 b0Var = d0.b0.f267621a;
        md mdVar = new md(o6.o(l6Var, b0Var.a()), o6.o(l6Var, b0Var.j()), o6.o(l6Var, b0Var.c()), null);
        l6Var.R1(mdVar);
        return mdVar;
    }

    private final vd d(ax axVar) {
        vd vdVarE = axVar.e();
        if (vdVarE != null) {
            return vdVarE;
        }
        d0.b0 b0Var = d0.b0.f267621a;
        vd vdVar = new vd(cx.g(axVar, b0Var.o()), cx.g(axVar, b0Var.m()), cx.g(axVar, b0Var.f()));
        axVar.n(vdVar);
        return vdVar;
    }

    public static /* synthetic */ wd i(ma0 ma0Var, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = androidx.compose.ui.unit.l.f42704b.a();
        }
        long j13 = j10;
        if ((i10 & 2) != 0) {
            j11 = androidx.compose.ui.unit.l.f42704b.a();
        }
        long j14 = j11;
        if ((i10 & 4) != 0) {
            j12 = androidx.compose.ui.unit.l.f42704b.a();
        }
        return ma0Var.h(j13, j14, j12);
    }

    @androidx.compose.runtime.o
    @NotNull
    public final md a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1465068453, i10, -1, "androidx.compose.material3.VerticalDragHandleDefaults.colors (DragHandle.kt:215)");
        }
        md mdVarC = c(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return mdVarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final md b(long j10, long j11, long j12, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2062501640, i10, -1, "androidx.compose.material3.VerticalDragHandleDefaults.colors (DragHandle.kt:234)");
        }
        md mdVarC = c(pj.f31758a.a(c0Var, 6));
        if (jU == 16) {
            jU = mdVarC.a();
        }
        if (jU2 == 16) {
            jU2 = mdVarC.c();
        }
        if (jU3 == 16) {
            jU3 = mdVarC.b();
        }
        md mdVar = new md(jU, jU2, jU3, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return mdVar;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final vd e(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1385335639, i10, -1, "androidx.compose.material3.VerticalDragHandleDefaults.shapes (DragHandle.kt:246)");
        }
        vd vdVarD = d(pj.f31758a.d(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return vdVarD;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final vd f(@Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable androidx.compose.ui.graphics.q3 q3Var2, @Nullable androidx.compose.ui.graphics.q3 q3Var3, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            q3Var = null;
        }
        if ((i11 & 2) != 0) {
            q3Var2 = null;
        }
        if ((i11 & 4) != 0) {
            q3Var3 = null;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(650848370, i10, -1, "androidx.compose.material3.VerticalDragHandleDefaults.shapes (DragHandle.kt:265)");
        }
        vd vdVarD = d(pj.f31758a.d(c0Var, 6));
        if (q3Var == null) {
            q3Var = vdVarD.c();
        }
        if (q3Var2 == null) {
            q3Var2 = vdVarD.b();
        }
        if (q3Var3 == null) {
            q3Var3 = vdVarD.a();
        }
        vd vdVar = new vd(q3Var, q3Var2, q3Var3);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return vdVar;
    }

    @NotNull
    public final wd g() {
        return f30594b;
    }

    @NotNull
    public final wd h(long j10, long j11, long j12) {
        wd wdVar = f30594b;
        if (j10 == n0.d.f332689d) {
            j10 = wdVar.c();
        }
        if (j11 == n0.d.f332689d) {
            j11 = wdVar.b();
        }
        long j13 = j11;
        if (j12 == n0.d.f332689d) {
            j12 = wdVar.a();
        }
        return new wd(j10, j13, j12, null);
    }
}
