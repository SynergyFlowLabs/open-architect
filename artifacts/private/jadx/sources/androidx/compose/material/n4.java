package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,351:1\n646#2:352\n635#2:353\n75#3:354\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n*L\n311#1:352\n311#1:353\n311#1:354\n*E\n"})
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<l4> f23921a = androidx.compose.runtime.a1.m(new Function0() { // from class: androidx.compose.material.m4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return n4.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final l4 b() {
        return j(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
    }

    public static final long c(@NotNull l4 l4Var, long j10) {
        if (!androidx.compose.ui.graphics.q0.y(j10, l4Var.j()) && !androidx.compose.ui.graphics.q0.y(j10, l4Var.k())) {
            if (!androidx.compose.ui.graphics.q0.y(j10, l4Var.l()) && !androidx.compose.ui.graphics.q0.y(j10, l4Var.m())) {
                if (androidx.compose.ui.graphics.q0.y(j10, l4Var.c())) {
                    return l4Var.e();
                }
                if (androidx.compose.ui.graphics.q0.y(j10, l4Var.n())) {
                    return l4Var.i();
                }
                return androidx.compose.ui.graphics.q0.y(j10, l4Var.d()) ? l4Var.f() : androidx.compose.ui.graphics.q0.f38131b.u();
            }
            return l4Var.h();
        }
        return l4Var.g();
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    public static final long d(long j10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(441849991, i10, -1, "androidx.compose.material.contentColorFor (Colors.kt:310)");
        }
        c0Var.E(-583916561);
        long jC = c(x9.f25488a.a(c0Var, 6), j10);
        if (jC == 16) {
            jC = ((androidx.compose.ui.graphics.q0) c0Var.W(x4.a())).M();
        }
        c0Var.A();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jC;
    }

    @NotNull
    public static final l4 e(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new l4(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, false, null);
    }

    public static /* synthetic */ l4 f(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i10, Object obj) {
        long jD = (i10 & 1) != 0 ? androidx.compose.ui.graphics.s0.d(4290479868L) : j10;
        long jD2 = (i10 & 2) != 0 ? androidx.compose.ui.graphics.s0.d(4281794739L) : j11;
        long jD3 = (i10 & 4) != 0 ? androidx.compose.ui.graphics.s0.d(4278442694L) : j12;
        long j22 = (i10 & 8) != 0 ? jD3 : j13;
        long jD4 = (i10 & 16) != 0 ? androidx.compose.ui.graphics.s0.d(4279374354L) : j14;
        long jD5 = (i10 & 32) != 0 ? androidx.compose.ui.graphics.s0.d(4279374354L) : j15;
        long jD6 = (i10 & 64) != 0 ? androidx.compose.ui.graphics.s0.d(4291782265L) : j16;
        long jA = (i10 & 128) != 0 ? androidx.compose.ui.graphics.q0.f38131b.a() : j17;
        long jA2 = (i10 & 256) != 0 ? androidx.compose.ui.graphics.q0.f38131b.a() : j18;
        long jW = (i10 & 512) != 0 ? androidx.compose.ui.graphics.q0.f38131b.w() : j19;
        long jW2 = (i10 & 1024) != 0 ? androidx.compose.ui.graphics.q0.f38131b.w() : j20;
        if ((i10 & 2048) != 0) {
            j21 = androidx.compose.ui.graphics.q0.f38131b.a();
        }
        return e(jD, jD2, jD3, j22, jD4, jD5, jD6, jA, jA2, jW, jW2, j21);
    }

    @NotNull
    public static final androidx.compose.runtime.m4<l4> g() {
        return f23921a;
    }

    public static final long h(@NotNull l4 l4Var) {
        return l4Var.o() ? l4Var.j() : l4Var.n();
    }

    @NotNull
    public static final l4 i(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new l4(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, true, null);
    }

    public static /* synthetic */ l4 j(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i10, Object obj) {
        long jD = (i10 & 1) != 0 ? androidx.compose.ui.graphics.s0.d(4284612846L) : j10;
        long jD2 = (i10 & 2) != 0 ? androidx.compose.ui.graphics.s0.d(4281794739L) : j11;
        long jD3 = (i10 & 4) != 0 ? androidx.compose.ui.graphics.s0.d(4278442694L) : j12;
        long jD4 = (i10 & 8) != 0 ? androidx.compose.ui.graphics.s0.d(4278290310L) : j13;
        long jW = (i10 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.w() : j14;
        long jW2 = (i10 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.w() : j15;
        long jD5 = (i10 & 64) != 0 ? androidx.compose.ui.graphics.s0.d(4289724448L) : j16;
        long jW3 = (i10 & 128) != 0 ? androidx.compose.ui.graphics.q0.f38131b.w() : j17;
        long j22 = jD;
        long jA = (i10 & 256) != 0 ? androidx.compose.ui.graphics.q0.f38131b.a() : j18;
        long jA2 = (i10 & 512) != 0 ? androidx.compose.ui.graphics.q0.f38131b.a() : j19;
        long jA3 = (i10 & 1024) != 0 ? androidx.compose.ui.graphics.q0.f38131b.a() : j20;
        if ((i10 & 2048) != 0) {
            j21 = androidx.compose.ui.graphics.q0.f38131b.w();
        }
        return i(j22, jD2, jD3, jD4, jW, jW2, jD5, jW3, jA, jA2, jA3, j21);
    }

    public static final void k(@NotNull l4 l4Var, @NotNull l4 l4Var2) {
        l4Var.x(l4Var2.j());
        l4Var.y(l4Var2.k());
        l4Var.z(l4Var2.l());
        l4Var.A(l4Var2.m());
        l4Var.p(l4Var2.c());
        l4Var.B(l4Var2.n());
        l4Var.q(l4Var2.d());
        l4Var.u(l4Var2.g());
        l4Var.v(l4Var2.h());
        l4Var.s(l4Var2.e());
        l4Var.w(l4Var2.i());
        l4Var.t(l4Var2.f());
        l4Var.r(l4Var2.o());
    }
}
