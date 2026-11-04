package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1117:1\n1#2:1118\n113#3:1119\n113#3:1120\n113#3:1121\n113#3:1122\n113#3:1123\n113#3:1124\n113#3:1125\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n*L\n867#1:1119\n466#1:1120\n469#1:1121\n497#1:1122\n512#1:1123\n527#1:1124\n537#1:1125\n*E\n"})
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s3 f32666a = new s3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f32667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f32668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f32669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f32670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f32671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f32672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f32673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f32674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f32675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f32676k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f32677l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f32678m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f32679n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f32680o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f32681p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f32682q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f32683r = 0;

    static {
        d0.i iVar = d0.i.f268183a;
        float fY = iVar.y();
        f32667b = fY;
        float fN = iVar.N();
        f32668c = fN;
        float f10 = 16;
        float fR = androidx.compose.ui.unit.h.r(f10);
        f32669d = fR;
        d0.n nVar = d0.n.f268506a;
        f32670e = nVar.f();
        f32671f = nVar.k();
        float fR2 = androidx.compose.ui.unit.h.r(8);
        f32672g = fR2;
        androidx.compose.foundation.layout.g5 g5VarI = androidx.compose.foundation.layout.d5.i(fY, fR2, fN, fR2);
        f32673h = g5VarI;
        f32674i = androidx.compose.foundation.layout.d5.i(fR, fR2, fN, fR2);
        float fR3 = androidx.compose.ui.unit.h.r(12);
        f32675j = fR3;
        f32676k = androidx.compose.foundation.layout.d5.i(fR3, g5VarI.d(), fR3, g5VarI.a());
        float fR4 = androidx.compose.ui.unit.h.r(f10);
        f32677l = fR4;
        f32678m = androidx.compose.foundation.layout.d5.i(fR3, g5VarI.d(), fR4, g5VarI.a());
        f32679n = androidx.compose.ui.unit.h.r(58);
        f32680o = nVar.a();
        f32681p = androidx.compose.ui.unit.h.r(18);
        f32682q = nVar.d();
    }

    private s3() {
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 A() {
        return f32678m;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getTextShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 B(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-349121587, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:566)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.n.f268506a.b(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.foundation.a1 C(boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jW;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-626854767, i10, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonBorder (Button.kt:898)");
        }
        float fG = d0.n.f268506a.g();
        if (z10) {
            c0Var.E(-112346942);
            jW = o6.r(d0.u1.f269028a.o(), c0Var, 6);
            c0Var.A();
        } else {
            c0Var.E(-112259336);
            d0.u1 u1Var = d0.u1.f269028a;
            jW = androidx.compose.ui.graphics.q0.w(o6.r(u1Var.o(), c0Var, 6), u1Var.a(), 0.0f, 0.0f, 0.0f, 14, null);
            c0Var.A();
        }
        androidx.compose.foundation.a1 a1VarA = androidx.compose.foundation.b1.a(fG, jW);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a1VarA;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final r3 D(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1344886725, i10, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:709)");
        }
        r3 r3VarO = o(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r3VarO;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final r3 E(long j10, long j11, long j12, long j13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 2) != 0) {
            j11 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 4) != 0) {
            j12 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 8) != 0) {
            j13 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1778526249, i10, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:727)");
        }
        long j14 = j11;
        long j15 = j10;
        r3 r3VarC = o(pj.f31758a.a(c0Var, 6)).c(j15, j14, j12, j13);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r3VarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final r3 F(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1880341584, i10, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:752)");
        }
        r3 r3VarP = p(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r3VarP;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final r3 G(long j10, long j11, long j12, long j13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 2) != 0) {
            j11 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 4) != 0) {
            j12 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 8) != 0) {
            j13 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1402274782, i10, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:770)");
        }
        long j14 = j11;
        long j15 = j10;
        r3 r3VarC = p(pj.f31758a.a(c0Var, 6)).c(j15, j14, j12, j13);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r3VarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final r3 a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1449248637, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:572)");
        }
        r3 r3VarL = l(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r3VarL;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final r3 b(long j10, long j11, long j12, long j13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 2) != 0) {
            j11 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 4) != 0) {
            j12 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 8) != 0) {
            j13 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-339300779, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:590)");
        }
        long j14 = j11;
        long j15 = j10;
        r3 r3VarC = l(pj.f31758a.a(c0Var, 6)).c(j15, j14, j12, j13);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r3VarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final t3 c(float f10, float f11, float f12, float f13, float f14, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = d0.s0.f268821a.b();
        }
        if ((i11 & 2) != 0) {
            f11 = d0.s0.f268821a.t();
        }
        if ((i11 & 4) != 0) {
            f12 = d0.s0.f268821a.j();
        }
        if ((i11 & 8) != 0) {
            f13 = d0.s0.f268821a.m();
        }
        float f15 = f13;
        if ((i11 & 16) != 0) {
            f14 = d0.s0.f268821a.d();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1827791191, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:811)");
        }
        float f16 = f14;
        float f17 = f12;
        t3 t3Var = new t3(f10, f11, f17, f15, f16, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return t3Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final r3 d(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(2025043443, i10, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:617)");
        }
        r3 r3VarM = m(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r3VarM;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final r3 e(long j10, long j11, long j12, long j13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 2) != 0) {
            j11 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 4) != 0) {
            j12 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 8) != 0) {
            j13 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1507908383, i10, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:635)");
        }
        long j14 = j11;
        long j15 = j10;
        r3 r3VarC = m(pj.f31758a.a(c0Var, 6)).c(j15, j14, j12, j13);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r3VarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final t3 f(float f10, float f11, float f12, float f13, float f14, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = d0.c0.f267716a.b();
        }
        if ((i11 & 2) != 0) {
            f11 = d0.c0.f267716a.t();
        }
        if ((i11 & 4) != 0) {
            f12 = d0.c0.f267716a.j();
        }
        if ((i11 & 8) != 0) {
            f13 = d0.c0.f267716a.m();
        }
        float f15 = f13;
        if ((i11 & 16) != 0) {
            f14 = d0.c0.f267716a.d();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1065482445, i10, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:838)");
        }
        float f16 = f14;
        float f17 = f12;
        t3 t3Var = new t3(f10, f11, f17, f15, f16, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return t3Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final r3 g(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(824987837, i10, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:663)");
        }
        r3 r3VarN = n(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r3VarN;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final r3 h(long j10, long j11, long j12, long j13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 2) != 0) {
            j11 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 4) != 0) {
            j12 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 8) != 0) {
            j13 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if (androidx.compose.runtime.m0.l0()) {
            int i12 = 1 | (-1);
            androidx.compose.runtime.m0.A0(1670757653, i10, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:682)");
        }
        long j14 = j11;
        long j15 = j10;
        r3 r3VarC = n(pj.f31758a.a(c0Var, 6)).c(j15, j14, j12, j13);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r3VarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final t3 i(float f10, float f11, float f12, float f13, float f14, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = d0.w0.f269168a.b();
        }
        if ((i11 & 2) != 0) {
            f11 = d0.w0.f269168a.s();
        }
        if ((i11 & 4) != 0) {
            f12 = d0.w0.f269168a.i();
        }
        if ((i11 & 8) != 0) {
            f13 = d0.w0.f269168a.l();
        }
        float f15 = f13;
        if ((i11 & 16) != 0) {
            f14 = androidx.compose.ui.unit.h.r(0);
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(5982871, i10, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:868)");
        }
        float f16 = f14;
        t3 t3Var = new t3(f10, f11, f12, f15, f16, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return t3Var;
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 j() {
        return f32674i;
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 k() {
        return f32673h;
    }

    @NotNull
    public final r3 l(@NotNull l6 l6Var) {
        r3 r3VarI = l6Var.i();
        if (r3VarI != null) {
            return r3VarI;
        }
        d0.s0 s0Var = d0.s0.f268821a;
        r3 r3Var = new r3(o6.o(l6Var, s0Var.a()), o6.o(l6Var, s0Var.q()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, s0Var.c()), s0Var.e(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, s0Var.h()), s0Var.i(), 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.b1(r3Var);
        return r3Var;
    }

    @NotNull
    public final r3 m(@NotNull l6 l6Var) {
        r3 r3VarO = l6Var.o();
        if (r3VarO != null) {
            return r3VarO;
        }
        d0.c0 c0Var = d0.c0.f267716a;
        r3 r3Var = new r3(o6.o(l6Var, c0Var.a()), o6.o(l6Var, c0Var.q()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, c0Var.c()), c0Var.e(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, c0Var.h()), c0Var.i(), 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.g1(r3Var);
        return r3Var;
    }

    @NotNull
    public final r3 n(@NotNull l6 l6Var) {
        r3 r3VarU = l6Var.u();
        if (r3VarU != null) {
            return r3VarU;
        }
        d0.w0 w0Var = d0.w0.f269168a;
        r3 r3Var = new r3(o6.o(l6Var, w0Var.a()), o6.o(l6Var, w0Var.q()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, w0Var.e()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, w0Var.h()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.m1(r3Var);
        return r3Var;
    }

    @NotNull
    public final r3 o(@NotNull l6 l6Var) {
        r3 r3VarH = l6Var.H();
        if (r3VarH != null) {
            return r3VarH;
        }
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        long jS = aVar.s();
        d0.u1 u1Var = d0.u1.f269028a;
        r3 r3Var = new r3(jS, o6.o(l6Var, u1Var.n()), aVar.s(), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, u1Var.d()), u1Var.e(), 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.z1(r3Var);
        return r3Var;
    }

    @NotNull
    public final r3 p(@NotNull l6 l6Var) {
        r3 r3VarW = l6Var.W();
        if (r3VarW != null) {
            return r3VarW;
        }
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        long jS = aVar.s();
        long jO = o6.o(l6Var, d0.u.Primary);
        long jS2 = aVar.s();
        d0.z2 z2Var = d0.z2.f269526a;
        r3 r3Var = new r3(jS, jO, jS2, androidx.compose.ui.graphics.q0.w(o6.o(l6Var, z2Var.e()), z2Var.f(), 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.N1(r3Var);
        return r3Var;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getElevatedShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 q(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(2143958791, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:554)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.n.f268506a.b(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getFilledTonalShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 r(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-886584987, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:558)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.n.f268506a.b(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    public final float s() {
        return f32681p;
    }

    public final float t() {
        return f32682q;
    }

    public final float u() {
        return f32680o;
    }

    public final float v() {
        return f32679n;
    }

    @kotlin.l(message = "Please use the version that takes an `enabled` param to get the `BorderStroke` with the correct opacity", replaceWith = @kotlin.b1(expression = "outlinedButtonBorder(enabled)", imports = {}))
    @NotNull
    @androidx.compose.runtime.o
    @oj.i(name = "getOutlinedButtonBorder")
    public final androidx.compose.foundation.a1 w(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-563957672, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:886)");
        }
        androidx.compose.foundation.a1 a1VarA = androidx.compose.foundation.b1.a(d0.n.f268506a.g(), o6.r(d0.u1.f269028a.o(), c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a1VarA;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getOutlinedShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 x(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2045213065, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:562)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.n.f268506a.b(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 y(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1234923021, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:550)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.n.f268506a.b(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 z() {
        return f32676k;
    }
}
