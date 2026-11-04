package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,631:1\n1#2:632\n113#3:633\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchDefaults\n*L\n436#1:633\n*E\n"})
public final class q20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q20 f32058a = new q20();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f32059b = androidx.compose.ui.unit.h.r(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f32060c = 0;

    private q20() {
    }

    @androidx.compose.runtime.o
    @NotNull
    public final p20 a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(435552781, i10, -1, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:306)");
        }
        p20 p20VarC = c(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return p20VarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final p20 b(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12) {
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        int i13;
        long j31;
        long j32;
        long jR = (i12 & 1) != 0 ? o6.r(d0.y2.f269421a.v(), c0Var, 6) : j10;
        long jR2 = (i12 & 2) != 0 ? o6.r(d0.y2.f269421a.G(), c0Var, 6) : j11;
        long jS = (i12 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.s() : j12;
        long jR3 = (i12 & 8) != 0 ? o6.r(d0.y2.f269421a.B(), c0Var, 6) : j13;
        long jR4 = (i12 & 16) != 0 ? o6.r(d0.y2.f269421a.R(), c0Var, 6) : j14;
        long jR5 = (i12 & 32) != 0 ? o6.r(d0.y2.f269421a.e0(), c0Var, 6) : j15;
        long jR6 = (i12 & 64) != 0 ? o6.r(d0.y2.f269421a.Q(), c0Var, 6) : j16;
        long jR7 = (i12 & 128) != 0 ? o6.r(d0.y2.f269421a.Y(), c0Var, 6) : j17;
        if ((i12 & 256) != 0) {
            d0.y2 y2Var = d0.y2.f269421a;
            j26 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.r(y2Var.a(), c0Var, 6), y2Var.b(), 0.0f, 0.0f, 0.0f, 14, null), pj.f31758a.a(c0Var, 6).M0());
        } else {
            j26 = j18;
        }
        if ((i12 & 512) != 0) {
            d0.y2 y2Var2 = d0.y2.f269421a;
            j27 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.r(y2Var2.e(), c0Var, 6), y2Var2.f(), 0.0f, 0.0f, 0.0f, 14, null), pj.f31758a.a(c0Var, 6).M0());
        } else {
            j27 = j19;
        }
        long jS2 = (i12 & 1024) != 0 ? androidx.compose.ui.graphics.q0.f38131b.s() : j20;
        if ((i12 & 2048) != 0) {
            d0.y2 y2Var3 = d0.y2.f269421a;
            j28 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.r(y2Var3.c(), c0Var, 6), y2Var3.d(), 0.0f, 0.0f, 0.0f, 14, null), pj.f31758a.a(c0Var, 6).M0());
        } else {
            j28 = j21;
        }
        if ((i12 & 4096) != 0) {
            d0.y2 y2Var4 = d0.y2.f269421a;
            j29 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.r(y2Var4.g(), c0Var, 6), y2Var4.h(), 0.0f, 0.0f, 0.0f, 14, null), pj.f31758a.a(c0Var, 6).M0());
        } else {
            j29 = j22;
        }
        if ((i12 & 8192) != 0) {
            d0.y2 y2Var5 = d0.y2.f269421a;
            j30 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.r(y2Var5.k(), c0Var, 6), y2Var5.f(), 0.0f, 0.0f, 0.0f, 14, null), pj.f31758a.a(c0Var, 6).M0());
        } else {
            j30 = j23;
        }
        if ((i12 & 16384) != 0) {
            d0.y2 y2Var6 = d0.y2.f269421a;
            i13 = 6;
            j31 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.r(y2Var6.l(), c0Var, 6), y2Var6.f(), 0.0f, 0.0f, 0.0f, 14, null), pj.f31758a.a(c0Var, 6).M0());
        } else {
            i13 = 6;
            j31 = j24;
        }
        if ((i12 & 32768) != 0) {
            d0.y2 y2Var7 = d0.y2.f269421a;
            j32 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.r(y2Var7.i(), c0Var, i13), y2Var7.j(), 0.0f, 0.0f, 0.0f, 14, null), pj.f31758a.a(c0Var, i13).M0());
        } else {
            j32 = j25;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1937926421, i10, i11, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:369)");
        }
        long j33 = jR;
        p20 p20Var = new p20(j33, jR2, jS, jR3, jR4, jR5, jR6, jR7, j26, j27, jS2, j28, j29, j30, j31, j32, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return p20Var;
    }

    @NotNull
    public final p20 c(@NotNull l6 l6Var) {
        p20 p20VarV = l6Var.V();
        if (p20VarV != null) {
            return p20VarV;
        }
        d0.y2 y2Var = d0.y2.f269421a;
        long jO = o6.o(l6Var, y2Var.v());
        long jO2 = o6.o(l6Var, y2Var.G());
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        p20 p20Var = new p20(jO, jO2, aVar.s(), o6.o(l6Var, y2Var.B()), o6.o(l6Var, y2Var.R()), o6.o(l6Var, y2Var.e0()), o6.o(l6Var, y2Var.Q()), o6.o(l6Var, y2Var.Y()), androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.o(l6Var, y2Var.a()), y2Var.b(), 0.0f, 0.0f, 0.0f, 14, null), l6Var.M0()), androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.o(l6Var, y2Var.e()), y2Var.f(), 0.0f, 0.0f, 0.0f, 14, null), l6Var.M0()), aVar.s(), androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.o(l6Var, y2Var.c()), y2Var.d(), 0.0f, 0.0f, 0.0f, 14, null), l6Var.M0()), androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.o(l6Var, y2Var.g()), y2Var.h(), 0.0f, 0.0f, 0.0f, 14, null), l6Var.M0()), androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.o(l6Var, y2Var.k()), y2Var.f(), 0.0f, 0.0f, 0.0f, 14, null), l6Var.M0()), androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.o(l6Var, y2Var.l()), y2Var.f(), 0.0f, 0.0f, 0.0f, 14, null), l6Var.M0()), androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.o(l6Var, y2Var.i()), y2Var.j(), 0.0f, 0.0f, 0.0f, 14, null), l6Var.M0()), null);
        l6Var.M1(p20Var);
        return p20Var;
    }

    public final float d() {
        return f32059b;
    }
}
