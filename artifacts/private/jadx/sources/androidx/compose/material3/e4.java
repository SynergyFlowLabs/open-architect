package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,847:1\n1#2:848\n1282#3,6:849\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardDefaults\n*L\n623#1:849,6\n*E\n"})
public final class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e4 f27241a = new e4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f27242b = 0;

    private e4() {
    }

    @androidx.compose.runtime.o
    @NotNull
    public final d4 a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            int i11 = 1 | (-1);
            androidx.compose.runtime.m0.A0(-1876034303, i10, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:472)");
        }
        d4 d4VarG = g(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return d4VarG;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final d4 b(long j10, long j11, long j12, long j13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long j14;
        long jW;
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jG = (i11 & 2) != 0 ? o6.g(jU, c0Var, i10 & 14) : j11;
        long jU2 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        if ((i11 & 8) != 0) {
            long j15 = jG;
            jW = androidx.compose.ui.graphics.q0.w(j15, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j14 = j15;
        } else {
            j14 = jG;
            jW = j13;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1589582123, i10, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:490)");
        }
        d4 d4VarC = g(pj.f31758a.a(c0Var, 6)).c(jU, j14, jU2, jW);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return d4VarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final f4 c(float f10, float f11, float f12, float f13, float f14, float f15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = d0.t0.f268895a.b();
        }
        if ((i11 & 2) != 0) {
            f11 = d0.t0.f268895a.m();
        }
        if ((i11 & 4) != 0) {
            f12 = d0.t0.f268895a.h();
        }
        if ((i11 & 8) != 0) {
            f13 = d0.t0.f268895a.j();
        }
        if ((i11 & 16) != 0) {
            f14 = d0.t0.f268895a.g();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = d0.t0.f268895a.e();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-574898487, i10, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:400)");
        }
        float f17 = f15;
        float f18 = f12;
        float f19 = f10;
        f4 f4Var = new f4(f19, f11, f18, f13, f16, f17, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return f4Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final d4 d(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1610137975, i10, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:518)");
        }
        d4 d4VarH = h(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return d4VarH;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final d4 e(long j10, long j11, long j12, long j13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long j14;
        long jW;
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jG = (i11 & 2) != 0 ? o6.g(jU, c0Var, i10 & 14) : j11;
        long jU2 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        if ((i11 & 8) != 0) {
            long j15 = jG;
            jW = androidx.compose.ui.graphics.q0.w(j15, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j14 = j15;
        } else {
            j14 = jG;
            jW = j13;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(139558303, i10, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:536)");
        }
        d4 d4VarC = h(pj.f31758a.a(c0Var, 6)).c(jU, j14, jU2, jW);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return d4VarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final f4 f(float f10, float f11, float f12, float f13, float f14, float f15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = d0.d0.f267792a.b();
        }
        if ((i11 & 2) != 0) {
            f11 = d0.d0.f267792a.m();
        }
        if ((i11 & 4) != 0) {
            f12 = d0.d0.f267792a.h();
        }
        if ((i11 & 8) != 0) {
            f13 = d0.d0.f267792a.j();
        }
        if ((i11 & 16) != 0) {
            f14 = d0.d0.f267792a.g();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = d0.d0.f267792a.e();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1154241939, i10, -1, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:430)");
        }
        float f17 = f15;
        float f18 = f12;
        float f19 = f10;
        f4 f4Var = new f4(f19, f11, f18, f13, f16, f17, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return f4Var;
    }

    @NotNull
    public final d4 g(@NotNull l6 l6Var) {
        d4 d4VarJ = l6Var.j();
        if (d4VarJ != null) {
            return d4VarJ;
        }
        d0.t0 t0Var = d0.t0.f268895a;
        d4 d4Var = new d4(o6.o(l6Var, t0Var.a()), o6.f(l6Var, o6.o(l6Var, t0Var.a())), androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.o(l6Var, t0Var.d()), t0Var.f(), 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, t0Var.a())), androidx.compose.ui.graphics.q0.w(o6.f(l6Var, o6.o(l6Var, t0Var.a())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.c1(d4Var);
        return d4Var;
    }

    @NotNull
    public final d4 h(@NotNull l6 l6Var) {
        d4 d4VarP = l6Var.p();
        if (d4VarP != null) {
            return d4VarP;
        }
        d0.d0 d0Var = d0.d0.f267792a;
        d4 d4Var = new d4(o6.o(l6Var, d0Var.a()), o6.f(l6Var, o6.o(l6Var, d0Var.a())), androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.o(l6Var, d0Var.d()), d0Var.f(), 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, d0Var.d())), androidx.compose.ui.graphics.q0.w(o6.f(l6Var, o6.o(l6Var, d0Var.a())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.h1(d4Var);
        return d4Var;
    }

    @NotNull
    public final d4 i(@NotNull l6 l6Var) {
        d4 d4VarI = l6Var.I();
        if (d4VarI != null) {
            return d4VarI;
        }
        d0.v1 v1Var = d0.v1.f269120a;
        d4 d4Var = new d4(o6.o(l6Var, v1Var.a()), o6.f(l6Var, o6.o(l6Var, v1Var.a())), o6.o(l6Var, v1Var.a()), androidx.compose.ui.graphics.q0.w(o6.f(l6Var, o6.o(l6Var, v1Var.a())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.A1(d4Var);
        return d4Var;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getElevatedShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 j(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-133496185, i10, -1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:374)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.d0.f267792a.c(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getOutlinedShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 k(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1095404023, i10, -1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:378)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.v1.f269120a.c(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 l(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1266660211, i10, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:370)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.t0.f268895a.c(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.foundation.a1 m(boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long j10;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-392936593, i10, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:613)");
        }
        if (z10) {
            c0Var.E(2106932974);
            j10 = o6.r(d0.v1.f269120a.n(), c0Var, 6);
            c0Var.A();
        } else {
            c0Var.E(2107012365);
            j10 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.r(d0.v1.f269120a.e(), c0Var, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), o6.r(d0.d0.f267792a.a(), c0Var, 6));
            c0Var.A();
        }
        boolean zL = c0Var.L(j10);
        Object objI0 = c0Var.i0();
        if (zL || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = androidx.compose.foundation.b1.a(d0.v1.f269120a.o(), j10);
            c0Var.Y(objI0);
        }
        androidx.compose.foundation.a1 a1Var = (androidx.compose.foundation.a1) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a1Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final d4 n(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1204388929, i10, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:567)");
        }
        d4 d4VarI = i(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return d4VarI;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final d4 o(long j10, long j11, long j12, long j13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jU = (i11 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jG = (i11 & 2) != 0 ? o6.g(jU, c0Var, i10 & 14) : j11;
        long jU2 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jW = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.w(o6.g(jU, c0Var, i10 & 14), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1112362409, i10, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:585)");
        }
        d4 d4VarC = i(pj.f31758a.a(c0Var, 6)).c(jU, jG, jU2, jW);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return d4VarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final f4 p(float f10, float f11, float f12, float f13, float f14, float f15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = d0.v1.f269120a.b();
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
            f14 = d0.v1.f269120a.f();
        }
        float f16 = f14;
        if ((i11 & 32) != 0) {
            f15 = d0.v1.f269120a.d();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-97678773, i10, -1, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:459)");
        }
        float f17 = f15;
        float f18 = f12;
        float f19 = f10;
        f4 f4Var = new f4(f19, f11, f18, f13, f16, f17, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return f4Var;
    }
}
