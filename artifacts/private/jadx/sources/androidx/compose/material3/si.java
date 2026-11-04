package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/InputChipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2969:1\n1#2:2970\n*E\n"})
public final class si {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final si f32916a = new si();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f32917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f32918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f32919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f32920e = 0;

    static {
        d0.a1 a1Var = d0.a1.f267553a;
        f32917b = a1Var.d();
        f32918c = a1Var.t();
        f32919d = a1Var.b();
    }

    private si() {
    }

    public final float a() {
        return f32919d;
    }

    @NotNull
    public final uw b(@NotNull l6 l6Var) {
        uw uwVarC = l6Var.C();
        if (uwVarC != null) {
            return uwVarC;
        }
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        long jS = aVar.s();
        d0.a1 a1Var = d0.a1.f267553a;
        uw uwVar = new uw(jS, o6.o(l6Var, a1Var.W()), o6.o(l6Var, a1Var.X()), o6.o(l6Var, a1Var.d0()), aVar.s(), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, a1Var.g()), a1Var.h(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, a1Var.i()), a1Var.j(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, a1Var.m()), a1Var.n(), 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, a1Var.u()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, a1Var.k()), a1Var.l(), 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, a1Var.E()), o6.o(l6Var, a1Var.F()), o6.o(l6Var, a1Var.K()), null);
        l6Var.u1(uwVar);
        return uwVar;
    }

    public final float c() {
        return f32917b;
    }

    public final float d() {
        return f32918c;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 e(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1052444143, i10, -1, "androidx.compose.material3.InputChipDefaults.<get-shape> (Chip.kt:1715)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.a1.f267553a.e(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.foundation.a1 f(boolean z10, boolean z11, long j10, long j11, long j12, long j13, float f10, float f11, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jW;
        long jR = (i11 & 4) != 0 ? o6.r(d0.a1.f267553a.Y(), c0Var, 6) : j10;
        long jS = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.s() : j11;
        if ((i11 & 16) != 0) {
            d0.a1 a1Var = d0.a1.f267553a;
            jW = androidx.compose.ui.graphics.q0.w(o6.r(a1Var.o(), c0Var, 6), a1Var.p(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW = j12;
        }
        long jS2 = (i11 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.s() : j13;
        float fZ = (i11 & 64) != 0 ? d0.a1.f267553a.Z() : f10;
        float fG = (i11 & 128) != 0 ? d0.a1.f267553a.G() : f11;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(2050575347, i10, -1, "androidx.compose.material3.InputChipDefaults.inputChipBorder (Chip.kt:1703)");
        }
        if (!z10) {
            jR = z11 ? jS2 : jW;
        } else if (z11) {
            jR = jS;
        }
        if (z11) {
            fZ = fG;
        }
        androidx.compose.foundation.a1 a1VarA = androidx.compose.foundation.b1.a(fZ, jR);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a1VarA;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final uw g(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-770375587, i10, -1, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1562)");
        }
        uw uwVarB = b(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return uwVarB;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final uw h(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12) {
        long jU = (i12 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i12 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i12 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i12 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i12 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jU6 = (i12 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j15;
        long jU7 = (i12 & 64) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j16;
        long jU8 = (i12 & 128) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j17;
        long j23 = jU;
        long jU9 = (i12 & 256) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j18;
        long jU10 = (i12 & 512) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j19;
        long jU11 = (i12 & 1024) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j20;
        long jU12 = (i12 & 2048) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j21;
        long jU13 = (i12 & 4096) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j22;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1312840646, i10, i11, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1599)");
        }
        uw uwVarB = b(pj.f31758a.a(c0Var, 6)).b(j23, jU2, jU3, jU4, jU5, jU6, jU7, jU8, jU9, jU10, jU11, jU12, jU13);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return uwVarB;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final vw i(float f10, float f11, float f12, float f13, float f14, float f15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = d0.a1.f267553a.c();
        }
        if ((i11 & 2) != 0) {
            f11 = f10;
        }
        if ((i11 & 4) != 0) {
            f12 = f10;
        }
        if ((i11 & 8) != 0) {
            f13 = f10;
        }
        if ((i11 & 16) != 0) {
            f14 = d0.a1.f267553a.q();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = f10;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1745270109, i10, -1, "androidx.compose.material3.InputChipDefaults.inputChipElevation (Chip.kt:1666)");
        }
        float f17 = f15;
        float f18 = f12;
        float f19 = f10;
        vw vwVar = new vw(f19, f11, f18, f13, f16, f17, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return vwVar;
    }
}
