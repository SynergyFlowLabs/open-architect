package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,769:1\n1#2:770\n*E\n"})
public final class fj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final fj f27672a = new fj();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f27673b = d0.d1.f267807a.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f27674c = 0;

    private fj() {
    }

    @androidx.compose.runtime.o
    @NotNull
    public final ej a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-552214416, i10, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:546)");
        }
        ej ejVarE = e(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return ejVarE;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final ej b(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jU6 = (i11 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j15;
        long jU7 = (i11 & 64) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j16;
        long jU8 = (i11 & 128) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j17;
        long jU9 = (i11 & 256) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j18;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-352515689, i10, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:576)");
        }
        ej ejVarB = e(pj.f31758a.a(c0Var, 6)).b(jU, jU2, jU3, jU4, jU5, jU6, jU7, jU8, jU9);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return ejVarB;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    @oj.i(name = "getContainerColor")
    public final long c(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            int i11 = 3 ^ (-1);
            androidx.compose.runtime.m0.A0(-1253579929, i10, -1, "androidx.compose.material3.ListItemDefaults.<get-containerColor> (ListItem.kt:536)");
        }
        long jR = o6.r(d0.d1.f267807a.d(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    @oj.i(name = "getContentColor")
    public final long d(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1076068327, i10, -1, "androidx.compose.material3.ListItemDefaults.<get-contentColor> (ListItem.kt:540)");
        }
        long jR = o6.r(d0.d1.f267807a.w(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    @NotNull
    public final ej e(@NotNull l6 l6Var) {
        ej ejVarD = l6Var.D();
        if (ejVarD != null) {
            return ejVarD;
        }
        d0.d1 d1Var = d0.d1.f267807a;
        ej ejVar = new ej(o6.o(l6Var, d1Var.d()), o6.o(l6Var, d1Var.w()), o6.o(l6Var, d1Var.E()), o6.o(l6Var, d1Var.N()), o6.o(l6Var, d1Var.U()), o6.o(l6Var, d1Var.X()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, d1Var.g()), d1Var.h(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, d1Var.i()), d1Var.j(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, d1Var.k()), d1Var.l(), 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.v1(ejVar);
        return ejVar;
    }

    public final float f() {
        return f27673b;
    }

    @NotNull
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    @oj.i(name = "getShape")
    public final androidx.compose.ui.graphics.q3 g(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-496871597, i10, -1, "androidx.compose.material3.ListItemDefaults.<get-shape> (ListItem.kt:532)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.d1.f267807a.f(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }
}
