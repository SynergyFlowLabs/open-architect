package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,613:1\n113#2:614\n113#2:615\n113#2:616\n113#2:617\n113#2:618\n113#2:619\n113#2:620\n113#2:621\n113#2:622\n113#2:623\n113#2:630\n113#2:631\n113#2:632\n113#2:633\n113#2:634\n113#2:635\n113#2:636\n113#2:637\n1282#3,6:624\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n*L\n344#1:614\n345#1:615\n346#1:616\n352#1:617\n353#1:618\n370#1:619\n371#1:620\n372#1:621\n373#1:622\n374#1:623\n294#1:630\n295#1:631\n310#1:632\n316#1:633\n323#1:634\n330#1:635\n468#1:636\n479#1:637\n376#1:624,6\n*E\n"})
public final class p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p3 f24148a = new p3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f24149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f24150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f24151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f24152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f24153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f24154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f24155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f24156i = 0.12f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f24157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f24158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f24159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f24160m = 0;

    static {
        float fR = androidx.compose.ui.unit.h.r(16);
        f24149b = fR;
        float f10 = 8;
        float fR2 = androidx.compose.ui.unit.h.r(f10);
        f24150c = fR2;
        androidx.compose.foundation.layout.g5 g5VarI = androidx.compose.foundation.layout.d5.i(fR, fR2, fR, fR2);
        f24151d = g5VarI;
        f24152e = androidx.compose.ui.unit.h.r(64);
        f24153f = androidx.compose.ui.unit.h.r(36);
        f24154g = androidx.compose.ui.unit.h.r(18);
        f24155h = androidx.compose.ui.unit.h.r(f10);
        f24157j = androidx.compose.ui.unit.h.r(1);
        float fR3 = androidx.compose.ui.unit.h.r(f10);
        f24158k = fR3;
        f24159l = androidx.compose.foundation.layout.d5.i(fR3, g5VarI.d(), fR3, g5VarI.a());
    }

    private p3() {
    }

    @androidx.compose.runtime.o
    @NotNull
    public final o3 a(long j10, long j11, long j12, long j13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long j14;
        long j15 = (i11 & 1) != 0 ? x9.f25488a.a(c0Var, 6).j() : j10;
        long jD = (i11 & 2) != 0 ? n4.d(j15, c0Var, i10 & 14) : j11;
        if ((i11 & 4) != 0) {
            x9 x9Var = x9.f25488a;
            j14 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(x9Var.a(c0Var, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), x9Var.a(c0Var, 6).n());
        } else {
            j14 = j12;
        }
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1870371134, i10, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:412)");
        }
        y4 y4Var = new y4(j15, jD, j14, jW, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return y4Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final q3 b(float f10, float f11, float f12, float f13, float f14, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.r(2);
        }
        float f15 = f10;
        if ((i11 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.r(8);
        }
        float f16 = f11;
        if ((i11 & 4) != 0) {
            f12 = androidx.compose.ui.unit.h.r(0);
        }
        float f17 = f12;
        if ((i11 & 8) != 0) {
            f13 = androidx.compose.ui.unit.h.r(4);
        }
        float f18 = f13;
        if ((i11 & 16) != 0) {
            f14 = androidx.compose.ui.unit.h.r(4);
        }
        float f19 = f14;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-737170518, i10, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:374)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && c0Var.I(f15)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.I(f16)) || (i10 & 48) == 32) | ((((i10 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.I(f17)) || (i10 & androidx.media3.exoplayer.a5.S0) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && c0Var.I(f18)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && c0Var.I(f19)) || (i10 & 24576) == 16384);
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            z4 z4Var = new z4(f15, f16, f17, f18, f19, null);
            c0Var.Y(z4Var);
            objI0 = z4Var;
        }
        z4 z4Var2 = (z4) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return z4Var2;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use another overload of elevation")
    public final /* synthetic */ q3 c(float f10, float f11, float f12, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.r(2);
        }
        float f13 = f10;
        if ((i11 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.r(8);
        }
        float f14 = f11;
        if ((i11 & 4) != 0) {
            f12 = androidx.compose.ui.unit.h.r(0);
        }
        float f15 = f12;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1428576874, i10, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:347)");
        }
        float f16 = 4;
        q3 q3VarB = b(f13, f14, f15, androidx.compose.ui.unit.h.r(f16), androidx.compose.ui.unit.h.r(f16), c0Var, (i10 & 14) | 27648 | (i10 & com.planner5d.library.engine.input.f.b.B) | (i10 & 896) | ((i10 << 6) & 458752), 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarB;
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 d() {
        return f24151d;
    }

    public final float e() {
        return f24154g;
    }

    public final float f() {
        return f24155h;
    }

    public final float g() {
        return f24153f;
    }

    public final float h() {
        return f24152e;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getOutlinedBorder")
    @NotNull
    public final androidx.compose.foundation.a1 i(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2091313033, i10, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:473)");
        }
        androidx.compose.foundation.a1 a1VarA = androidx.compose.foundation.b1.a(f24157j, androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a1VarA;
    }

    public final float j() {
        return f24157j;
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 k() {
        return f24159l;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final o3 l(long j10, long j11, long j12, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jN = (i11 & 1) != 0 ? x9.f25488a.a(c0Var, 6).n() : j10;
        long j13 = (i11 & 2) != 0 ? x9.f25488a.a(c0Var, 6).j() : j11;
        long jW = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2124406093, i10, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:434)");
        }
        y4 y4Var = new y4(jN, j13, jN, jW, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return y4Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final o3 m(long j10, long j11, long j12, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jS = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.s() : j10;
        long j13 = (i11 & 2) != 0 ? x9.f25488a.a(c0Var, 6).j() : j11;
        long jW = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(182742216, i10, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:456)");
        }
        y4 y4Var = new y4(jS, j13, jS, jW, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return y4Var;
    }
}
