package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/AssistChipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2969:1\n1#2:2970\n*E\n"})
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c2 f26440a = new c2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f26441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f26442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f26443d = 0;

    static {
        d0.g gVar = d0.g.f268054a;
        f26441b = gVar.a();
        f26442c = gVar.D();
    }

    private c2() {
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.WARNING, message = "Maintained for binary compatibility. Use the assistChipBorder function that returns BorderStroke instead", replaceWith = @kotlin.b1(expression = "assistChipBorder(enabled, borderColor, disabledBorderColor, borderWidth)", imports = {}))
    @NotNull
    public final c5 a(long j10, long j11, float f10, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jW;
        long jR = (i11 & 1) != 0 ? o6.r(d0.g.f268054a.v(), c0Var, 6) : j10;
        if ((i11 & 2) != 0) {
            d0.g gVar = d0.g.f268054a;
            jW = androidx.compose.ui.graphics.q0.w(o6.r(gVar.s(), c0Var, 6), gVar.t(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW = j11;
        }
        float fW = (i11 & 4) != 0 ? d0.g.f268054a.w() : f10;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(382372847, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1146)");
        }
        c5 c5Var = new c5(jR, jW, fW, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return c5Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.foundation.a1 b(boolean z10, long j10, long j11, float f10, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jW;
        long jR = (i11 & 2) != 0 ? o6.r(d0.g.f268054a.v(), c0Var, 6) : j10;
        if ((i11 & 4) != 0) {
            d0.g gVar = d0.g.f268054a;
            jW = androidx.compose.ui.graphics.q0.w(o6.r(gVar.s(), c0Var, 6), gVar.t(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW = j11;
        }
        float fW = (i11 & 8) != 0 ? d0.g.f268054a.w() : f10;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1458649561, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1118)");
        }
        if (!z10) {
            jR = jW;
        }
        androidx.compose.foundation.a1 a1VarA = androidx.compose.foundation.b1.a(fW, jR);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a1VarA;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final d5 c(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1961061417, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:1013)");
        }
        d5 d5VarI = i(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return d5VarI;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final d5 d(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jU6 = (i11 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j15;
        long jU7 = (i11 & 64) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j16;
        long jU8 = (i11 & 128) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j17;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-391745725, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:1039)");
        }
        d5 d5VarB = i(pj.f31758a.a(c0Var, 6)).b(jU, jU2, jU3, jU4, jU5, jU6, jU7, jU8);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return d5VarB;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final e5 e(float f10, float f11, float f12, float f13, float f14, float f15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = d0.g.f268054a.r();
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
            f14 = d0.g.f268054a.g();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = f10;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(245366099, i10, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:1092)");
        }
        float f17 = f15;
        float f18 = f12;
        float f19 = f10;
        e5 e5Var = new e5(f19, f11, f18, f13, f16, f17, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return e5Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final d5 f(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(655175583, i10, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1157)");
        }
        d5 d5VarJ = j(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return d5VarJ;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final d5 g(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i11 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jU6 = (i11 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j15;
        long jU7 = (i11 & 64) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j16;
        long jU8 = (i11 & 128) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j17;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-535762675, i10, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1183)");
        }
        d5 d5VarB = r10.f32387a.d(pj.f31758a.a(c0Var, 6)).b(jU, jU2, jU3, jU4, jU5, jU6, jU7, jU8);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return d5VarB;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final e5 h(float f10, float f11, float f12, float f13, float f14, float f15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = d0.g.f268054a.k();
        }
        if ((i11 & 2) != 0) {
            f11 = d0.g.f268054a.q();
        }
        if ((i11 & 4) != 0) {
            f12 = d0.g.f268054a.o();
        }
        if ((i11 & 8) != 0) {
            f13 = d0.g.f268054a.p();
        }
        if ((i11 & 16) != 0) {
            f14 = d0.g.f268054a.g();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = d0.g.f268054a.m();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1457698077, i10, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:1238)");
        }
        float f17 = f15;
        float f18 = f12;
        float f19 = f10;
        e5 e5Var = new e5(f19, f11, f18, f13, f16, f17, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return e5Var;
    }

    @NotNull
    public final d5 i(@NotNull l6 l6Var) {
        d5 d5VarH = l6Var.h();
        if (d5VarH != null) {
            return d5VarH;
        }
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        long jS = aVar.s();
        d0.g gVar = d0.g.f268054a;
        d5 d5Var = new d5(jS, o6.o(l6Var, gVar.E()), o6.o(l6Var, gVar.C()), o6.o(l6Var, gVar.C()), aVar.s(), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, gVar.e()), gVar.f(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, gVar.c()), gVar.d(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, gVar.c()), gVar.d(), 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.a1(d5Var);
        return d5Var;
    }

    @NotNull
    public final d5 j(@NotNull l6 l6Var) {
        d5 d5VarN = l6Var.n();
        if (d5VarN != null) {
            return d5VarN;
        }
        d0.g gVar = d0.g.f268054a;
        d5 d5Var = new d5(o6.o(l6Var, gVar.j()), o6.o(l6Var, gVar.E()), o6.o(l6Var, gVar.C()), o6.o(l6Var, gVar.C()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, gVar.l()), gVar.n(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, gVar.e()), gVar.f(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, gVar.c()), gVar.d(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, gVar.c()), gVar.d(), 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.f1(d5Var);
        return d5Var;
    }

    public final float k() {
        return f26441b;
    }

    public final float l() {
        return f26442c;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 m(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1988153916, i10, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:1249)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.g.f268054a.b(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }
}
