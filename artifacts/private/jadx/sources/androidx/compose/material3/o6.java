package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nColorScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1557:1\n646#2:1558\n635#2:1559\n75#3:1560\n75#3:1562\n113#4:1561\n*S KotlinDebug\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n*L\n1113#1:1558\n1113#1:1559\n1114#1:1560\n1541#1:1562\n1126#1:1561\n*E\n"})
public final class o6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f31300b = 0.38f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<l6> f31299a = androidx.compose.runtime.a1.m(new Function0() { // from class: androidx.compose.material3.m6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return o6.c();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<Boolean> f31301c = androidx.compose.runtime.a1.m(new Function0() { // from class: androidx.compose.material3.n6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(o6.d());
        }
    });

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31302a;

        static {
            int[] iArr = new int[d0.u.values().length];
            try {
                iArr[d0.u.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int i10 = 0 >> 2;
                iArr[d0.u.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d0.u.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d0.u.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d0.u.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d0.u.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d0.u.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d0.u.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d0.u.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[d0.u.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[d0.u.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[d0.u.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[d0.u.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[d0.u.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[d0.u.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[d0.u.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[d0.u.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[d0.u.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[d0.u.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[d0.u.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[d0.u.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[d0.u.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[d0.u.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[d0.u.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[d0.u.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[d0.u.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[d0.u.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[d0.u.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[d0.u.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[d0.u.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[d0.u.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[d0.u.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[d0.u.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[d0.u.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[d0.u.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[d0.u.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[d0.u.PrimaryFixed.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[d0.u.PrimaryFixedDim.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[d0.u.OnPrimaryFixed.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[d0.u.OnPrimaryFixedVariant.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[d0.u.SecondaryFixed.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[d0.u.SecondaryFixedDim.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[d0.u.OnSecondaryFixed.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[d0.u.OnSecondaryFixedVariant.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[d0.u.TertiaryFixed.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[d0.u.TertiaryFixedDim.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[d0.u.OnTertiaryFixed.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[d0.u.OnTertiaryFixedVariant.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            f31302a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l6 c() {
        return x(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d() {
        return true;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    public static final long e(@NotNull l6 l6Var, long j10, float f10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1610977682, i10, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:1539)");
        }
        boolean zBooleanValue = ((Boolean) c0Var.W(f31301c)).booleanValue();
        if (androidx.compose.ui.graphics.q0.y(j10, l6Var.M0()) && zBooleanValue) {
            j10 = y(l6Var, f10);
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j10;
    }

    @androidx.compose.runtime.k7
    public static final long f(@NotNull l6 l6Var, long j10) {
        if (androidx.compose.ui.graphics.q0.y(j10, l6Var.D0())) {
            return l6Var.n0();
        }
        if (androidx.compose.ui.graphics.q0.y(j10, l6Var.I0())) {
            return l6Var.r0();
        }
        if (androidx.compose.ui.graphics.q0.y(j10, l6Var.W0())) {
            return l6Var.x0();
        }
        if (androidx.compose.ui.graphics.q0.y(j10, l6Var.g())) {
            return l6Var.k0();
        }
        if (androidx.compose.ui.graphics.q0.y(j10, l6Var.f0())) {
            return l6Var.l0();
        }
        if (androidx.compose.ui.graphics.q0.y(j10, l6Var.E0())) {
            return l6Var.o0();
        }
        if (androidx.compose.ui.graphics.q0.y(j10, l6Var.J0())) {
            return l6Var.s0();
        }
        if (androidx.compose.ui.graphics.q0.y(j10, l6Var.X0())) {
            return l6Var.y0();
        }
        if (androidx.compose.ui.graphics.q0.y(j10, l6Var.g0())) {
            return l6Var.m0();
        }
        if (androidx.compose.ui.graphics.q0.y(j10, l6Var.j0())) {
            return l6Var.h0();
        }
        if (androidx.compose.ui.graphics.q0.y(j10, l6Var.M0())) {
            return l6Var.v0();
        }
        if (androidx.compose.ui.graphics.q0.y(j10, l6Var.V0())) {
            return l6Var.w0();
        }
        if (!androidx.compose.ui.graphics.q0.y(j10, l6Var.N0()) && !androidx.compose.ui.graphics.q0.y(j10, l6Var.O0()) && !androidx.compose.ui.graphics.q0.y(j10, l6Var.P0()) && !androidx.compose.ui.graphics.q0.y(j10, l6Var.Q0()) && !androidx.compose.ui.graphics.q0.y(j10, l6Var.R0()) && !androidx.compose.ui.graphics.q0.y(j10, l6Var.S0()) && !androidx.compose.ui.graphics.q0.y(j10, l6Var.T0())) {
            if (!androidx.compose.ui.graphics.q0.y(j10, l6Var.F0()) && !androidx.compose.ui.graphics.q0.y(j10, l6Var.G0())) {
                if (!androidx.compose.ui.graphics.q0.y(j10, l6Var.K0()) && !androidx.compose.ui.graphics.q0.y(j10, l6Var.L0())) {
                    if (!androidx.compose.ui.graphics.q0.y(j10, l6Var.Y0()) && !androidx.compose.ui.graphics.q0.y(j10, l6Var.Z0())) {
                        return androidx.compose.ui.graphics.q0.f38131b.u();
                    }
                    return l6Var.z0();
                }
                return l6Var.t0();
            }
            return l6Var.p0();
        }
        return l6Var.v0();
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    public static final long g(long j10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(509589638, i10, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:1112)");
        }
        c0Var.E(89374938);
        long jF = f(pj.f31758a.a(c0Var, 6), j10);
        if (jF == 16) {
            jF = ((androidx.compose.ui.graphics.q0) c0Var.W(c7.a())).M();
        }
        c0Var.A();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jF;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    public static final /* synthetic */ l6 h(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45) {
        return m(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 65520, null);
    }

    public static /* synthetic */ l6 i(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, int i10, int i11, Object obj) {
        long jZ = (i10 & 1) != 0 ? d0.s.f268795a.z() : j10;
        long j46 = (i10 & 2) != 0 ? d0.s.f268795a.j() : j11;
        long jA = (i10 & 4) != 0 ? d0.s.f268795a.A() : j12;
        long jK = (i10 & 8) != 0 ? d0.s.f268795a.k() : j13;
        long jE = (i10 & 16) != 0 ? d0.s.f268795a.e() : j14;
        long jE2 = (i10 & 32) != 0 ? d0.s.f268795a.E() : j15;
        long jN = (i10 & 64) != 0 ? d0.s.f268795a.n() : j16;
        long jF = (i10 & 128) != 0 ? d0.s.f268795a.F() : j17;
        long j47 = jZ;
        long jO = (i10 & 256) != 0 ? d0.s.f268795a.o() : j18;
        long jS = (i10 & 512) != 0 ? d0.s.f268795a.S() : j19;
        long jT = (i10 & 1024) != 0 ? d0.s.f268795a.t() : j20;
        long jT2 = (i10 & 2048) != 0 ? d0.s.f268795a.T() : j21;
        long jU = (i10 & 4096) != 0 ? d0.s.f268795a.u() : j22;
        long jA2 = (i10 & 8192) != 0 ? d0.s.f268795a.a() : j23;
        long jG = (i10 & 16384) != 0 ? d0.s.f268795a.g() : j24;
        long jI = (i10 & 32768) != 0 ? d0.s.f268795a.I() : j25;
        long jR = (i10 & 65536) != 0 ? d0.s.f268795a.r() : j26;
        long jR2 = (i10 & 131072) != 0 ? d0.s.f268795a.R() : j27;
        long jS2 = (i10 & 262144) != 0 ? d0.s.f268795a.s() : j28;
        long j48 = (i10 & 524288) != 0 ? j47 : j29;
        long jF2 = (i10 & 1048576) != 0 ? d0.s.f268795a.f() : j30;
        long jD = (i10 & 2097152) != 0 ? d0.s.f268795a.d() : j31;
        long jB = (i10 & 4194304) != 0 ? d0.s.f268795a.b() : j32;
        long jH = (i10 & 8388608) != 0 ? d0.s.f268795a.h() : j33;
        long jC = (i10 & 16777216) != 0 ? d0.s.f268795a.c() : j34;
        long jI2 = (i10 & com.google.api.client.googleapis.media.a.f115410j) != 0 ? d0.s.f268795a.i() : j35;
        long jX = (i10 & 67108864) != 0 ? d0.s.f268795a.x() : j36;
        long jY = (i10 & androidx.media3.common.j.W0) != 0 ? d0.s.f268795a.y() : j37;
        long jD2 = (i10 & 268435456) != 0 ? d0.s.f268795a.D() : j38;
        long J = (i10 & 536870912) != 0 ? d0.s.f268795a.J() : j39;
        long jK2 = (i10 & 1073741824) != 0 ? d0.s.f268795a.K() : j40;
        long jL = (i10 & Integer.MIN_VALUE) != 0 ? d0.s.f268795a.L() : j41;
        long jM = (i11 & 1) != 0 ? d0.s.f268795a.M() : j42;
        long jN2 = (i11 & 2) != 0 ? d0.s.f268795a.N() : j43;
        long jO2 = (i11 & 4) != 0 ? d0.s.f268795a.O() : j44;
        if ((i11 & 8) != 0) {
            j45 = d0.s.f268795a.P();
        }
        return h(j47, j46, jA, jK, jE, jE2, jN, jF, jO, jS, jT, jT2, jU, jA2, jG, jI, jR, jR2, jS2, j48, jF2, jD, jB, jH, jC, jI2, jX, jY, jD2, J, jK2, jL, jM, jN2, jO2, j45);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    public static final /* synthetic */ l6 j(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
        return m(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 65535, null);
    }

    public static /* synthetic */ l6 k(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, int i10, Object obj) {
        long jZ = (i10 & 1) != 0 ? d0.s.f268795a.z() : j10;
        long j39 = (i10 & 2) != 0 ? d0.s.f268795a.j() : j11;
        long jA = (i10 & 4) != 0 ? d0.s.f268795a.A() : j12;
        long jK = (i10 & 8) != 0 ? d0.s.f268795a.k() : j13;
        long jE = (i10 & 16) != 0 ? d0.s.f268795a.e() : j14;
        long jE2 = (i10 & 32) != 0 ? d0.s.f268795a.E() : j15;
        long jN = (i10 & 64) != 0 ? d0.s.f268795a.n() : j16;
        long jF = (i10 & 128) != 0 ? d0.s.f268795a.F() : j17;
        long j40 = jZ;
        long jO = (i10 & 256) != 0 ? d0.s.f268795a.o() : j18;
        long jS = (i10 & 512) != 0 ? d0.s.f268795a.S() : j19;
        long jT = (i10 & 1024) != 0 ? d0.s.f268795a.t() : j20;
        long jT2 = (i10 & 2048) != 0 ? d0.s.f268795a.T() : j21;
        long jU = (i10 & 4096) != 0 ? d0.s.f268795a.u() : j22;
        long jA2 = (i10 & 8192) != 0 ? d0.s.f268795a.a() : j23;
        long jG = (i10 & 16384) != 0 ? d0.s.f268795a.g() : j24;
        long jI = (i10 & 32768) != 0 ? d0.s.f268795a.I() : j25;
        long jR = (i10 & 65536) != 0 ? d0.s.f268795a.r() : j26;
        long jR2 = (i10 & 131072) != 0 ? d0.s.f268795a.R() : j27;
        long jS2 = (i10 & 262144) != 0 ? d0.s.f268795a.s() : j28;
        long j41 = (i10 & 524288) != 0 ? j40 : j29;
        long jF2 = (i10 & 1048576) != 0 ? d0.s.f268795a.f() : j30;
        long jD = (i10 & 2097152) != 0 ? d0.s.f268795a.d() : j31;
        long jB = (i10 & 4194304) != 0 ? d0.s.f268795a.b() : j32;
        long jH = (i10 & 8388608) != 0 ? d0.s.f268795a.h() : j33;
        long jC = (i10 & 16777216) != 0 ? d0.s.f268795a.c() : j34;
        long jI2 = (i10 & com.google.api.client.googleapis.media.a.f115410j) != 0 ? d0.s.f268795a.i() : j35;
        long jX = (i10 & 67108864) != 0 ? d0.s.f268795a.x() : j36;
        long jY = (i10 & androidx.media3.common.j.W0) != 0 ? d0.s.f268795a.y() : j37;
        if ((i10 & 268435456) != 0) {
            j38 = d0.s.f268795a.D();
        }
        return j(j40, j39, jA, jK, jE, jE2, jN, jF, jO, jS, jT, jT2, jU, jA2, jG, jI, jR, jR2, jS2, j41, jF2, jD, jB, jH, jC, jI2, jX, jY, j38);
    }

    @NotNull
    public static final l6 l(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57) {
        return new l6(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j45, j40, j41, j42, j43, j44, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, null);
    }

    public static /* synthetic */ l6 m(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, int i10, int i11, Object obj) {
        long jZ = (i10 & 1) != 0 ? d0.s.f268795a.z() : j10;
        long j58 = (i10 & 2) != 0 ? d0.s.f268795a.j() : j11;
        long jA = (i10 & 4) != 0 ? d0.s.f268795a.A() : j12;
        long jK = (i10 & 8) != 0 ? d0.s.f268795a.k() : j13;
        long jE = (i10 & 16) != 0 ? d0.s.f268795a.e() : j14;
        long jE2 = (i10 & 32) != 0 ? d0.s.f268795a.E() : j15;
        long jN = (i10 & 64) != 0 ? d0.s.f268795a.n() : j16;
        long j59 = jZ;
        long jF = (i10 & 128) != 0 ? d0.s.f268795a.F() : j17;
        long jO = (i10 & 256) != 0 ? d0.s.f268795a.o() : j18;
        long jS = (i10 & 512) != 0 ? d0.s.f268795a.S() : j19;
        long jT = (i10 & 1024) != 0 ? d0.s.f268795a.t() : j20;
        long jT2 = (i10 & 2048) != 0 ? d0.s.f268795a.T() : j21;
        long jU = (i10 & 4096) != 0 ? d0.s.f268795a.u() : j22;
        long jA2 = (i10 & 8192) != 0 ? d0.s.f268795a.a() : j23;
        long jG = (i10 & 16384) != 0 ? d0.s.f268795a.g() : j24;
        long jI = (i10 & 32768) != 0 ? d0.s.f268795a.I() : j25;
        long jR = (i10 & 65536) != 0 ? d0.s.f268795a.r() : j26;
        long jR2 = (i10 & 131072) != 0 ? d0.s.f268795a.R() : j27;
        long jS2 = (i10 & 262144) != 0 ? d0.s.f268795a.s() : j28;
        long j60 = (i10 & 524288) != 0 ? j59 : j29;
        long jF2 = (i10 & 1048576) != 0 ? d0.s.f268795a.f() : j30;
        long jD = (i10 & 2097152) != 0 ? d0.s.f268795a.d() : j31;
        long jB = (i10 & 4194304) != 0 ? d0.s.f268795a.b() : j32;
        long jH = (i10 & 8388608) != 0 ? d0.s.f268795a.h() : j33;
        long jC = (i10 & 16777216) != 0 ? d0.s.f268795a.c() : j34;
        long jI2 = (i10 & com.google.api.client.googleapis.media.a.f115410j) != 0 ? d0.s.f268795a.i() : j35;
        long jX = (i10 & 67108864) != 0 ? d0.s.f268795a.x() : j36;
        long jY = (i10 & androidx.media3.common.j.W0) != 0 ? d0.s.f268795a.y() : j37;
        long jD2 = (i10 & 268435456) != 0 ? d0.s.f268795a.D() : j38;
        long J = (i10 & 536870912) != 0 ? d0.s.f268795a.J() : j39;
        long jK2 = (i10 & 1073741824) != 0 ? d0.s.f268795a.K() : j40;
        long jL = (i10 & Integer.MIN_VALUE) != 0 ? d0.s.f268795a.L() : j41;
        long jM = (i11 & 1) != 0 ? d0.s.f268795a.M() : j42;
        long jN2 = (i11 & 2) != 0 ? d0.s.f268795a.N() : j43;
        long jO2 = (i11 & 4) != 0 ? d0.s.f268795a.O() : j44;
        long jP = (i11 & 8) != 0 ? d0.s.f268795a.P() : j45;
        long jB2 = (i11 & 16) != 0 ? d0.s.f268795a.B() : j46;
        long jC2 = (i11 & 32) != 0 ? d0.s.f268795a.C() : j47;
        long jL2 = (i11 & 64) != 0 ? d0.s.f268795a.l() : j48;
        long jM2 = (i11 & 128) != 0 ? d0.s.f268795a.m() : j49;
        long jG2 = (i11 & 256) != 0 ? d0.s.f268795a.G() : j50;
        long jH2 = (i11 & 512) != 0 ? d0.s.f268795a.H() : j51;
        long jP2 = (i11 & 1024) != 0 ? d0.s.f268795a.p() : j52;
        long jQ = (i11 & 2048) != 0 ? d0.s.f268795a.q() : j53;
        long jU2 = (i11 & 4096) != 0 ? d0.s.f268795a.U() : j54;
        long jV = (i11 & 8192) != 0 ? d0.s.f268795a.V() : j55;
        long jV2 = (i11 & 16384) != 0 ? d0.s.f268795a.v() : j56;
        if ((i11 & 32768) != 0) {
            j57 = d0.s.f268795a.w();
        }
        return l(j59, j58, jA, jK, jE, jE2, jN, jF, jO, jS, jT, jT2, jU, jA2, jG, jI, jR, jR2, jS2, j60, jF2, jD, jB, jH, jC, jI2, jX, jY, jD2, J, jK2, jL, jM, jN2, jO2, jP, jB2, jC2, jL2, jM2, jG2, jH2, jP2, jQ, jU2, jV, jV2, j57);
    }

    @NotNull
    public static final l6 n() {
        d0.z1 z1Var = d0.z1.f269474a;
        return x(0L, 0L, 0L, z1Var.d0(), 0L, 0L, 0L, 0L, z1Var.q0(), 0L, 0L, 0L, z1Var.D0(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, z1Var.f(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -33558793, 65535, null);
    }

    @androidx.compose.runtime.k7
    public static final long o(@NotNull l6 l6Var, @NotNull d0.u uVar) {
        switch (a.f31302a[uVar.ordinal()]) {
            case 1:
                return l6Var.g();
            case 2:
                return l6Var.f0();
            case 3:
                return l6Var.g0();
            case 4:
                return l6Var.h0();
            case 5:
                return l6Var.i0();
            case 6:
                return l6Var.j0();
            case 7:
                return l6Var.k0();
            case 8:
                return l6Var.l0();
            case 9:
                return l6Var.m0();
            case 10:
                return l6Var.n0();
            case 11:
                return l6Var.o0();
            case 12:
                return l6Var.r0();
            case 13:
                return l6Var.s0();
            case 14:
                return l6Var.v0();
            case 15:
                return l6Var.w0();
            case 16:
                return l6Var.U0();
            case 17:
                return l6Var.x0();
            case 18:
                return l6Var.y0();
            case 19:
                return l6Var.B0();
            case 20:
                return l6Var.C0();
            case 21:
                return l6Var.D0();
            case 22:
                return l6Var.E0();
            case 23:
                return l6Var.H0();
            case 24:
                return l6Var.I0();
            case 25:
                return l6Var.J0();
            case 26:
                return l6Var.M0();
            case 27:
                return l6Var.V0();
            case 28:
                return l6Var.N0();
            case 29:
                return l6Var.O0();
            case 30:
                return l6Var.P0();
            case 31:
                return l6Var.Q0();
            case 32:
                return l6Var.R0();
            case 33:
                return l6Var.S0();
            case 34:
                return l6Var.T0();
            case 35:
                return l6Var.W0();
            case 36:
                return l6Var.X0();
            case 37:
                return l6Var.F0();
            case 38:
                return l6Var.G0();
            case 39:
                return l6Var.p0();
            case 40:
                return l6Var.q0();
            case 41:
                return l6Var.K0();
            case 42:
                return l6Var.L0();
            case 43:
                return l6Var.t0();
            case 44:
                return l6Var.u0();
            case 45:
                return l6Var.Y0();
            case 46:
                return l6Var.Z0();
            case 47:
                return l6Var.z0();
            case 48:
                return l6Var.A0();
            default:
                throw new kotlin.k0();
        }
    }

    @NotNull
    public static final androidx.compose.runtime.m4<l6> p() {
        return f31299a;
    }

    @NotNull
    public static final androidx.compose.runtime.m4<Boolean> q() {
        return f31301c;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    @oj.i(name = "getValue")
    public static final long r(@NotNull d0.u uVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-810780884, i10, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1524)");
        }
        long jO = o(pj.f31758a.a(c0Var, 6), uVar);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jO;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional Fixed roles instead")
    public static final /* synthetic */ l6 s(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45) {
        return x(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 65520, null);
    }

    public static /* synthetic */ l6 t(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, int i10, int i11, Object obj) {
        long jZ = (i10 & 1) != 0 ? d0.t.f268869a.z() : j10;
        long j46 = (i10 & 2) != 0 ? d0.t.f268869a.j() : j11;
        long jA = (i10 & 4) != 0 ? d0.t.f268869a.A() : j12;
        long jK = (i10 & 8) != 0 ? d0.t.f268869a.k() : j13;
        long jE = (i10 & 16) != 0 ? d0.t.f268869a.e() : j14;
        long jE2 = (i10 & 32) != 0 ? d0.t.f268869a.E() : j15;
        long jN = (i10 & 64) != 0 ? d0.t.f268869a.n() : j16;
        long jF = (i10 & 128) != 0 ? d0.t.f268869a.F() : j17;
        long j47 = jZ;
        long jO = (i10 & 256) != 0 ? d0.t.f268869a.o() : j18;
        long jS = (i10 & 512) != 0 ? d0.t.f268869a.S() : j19;
        long jT = (i10 & 1024) != 0 ? d0.t.f268869a.t() : j20;
        long jT2 = (i10 & 2048) != 0 ? d0.t.f268869a.T() : j21;
        long jU = (i10 & 4096) != 0 ? d0.t.f268869a.u() : j22;
        long jA2 = (i10 & 8192) != 0 ? d0.t.f268869a.a() : j23;
        long jG = (i10 & 16384) != 0 ? d0.t.f268869a.g() : j24;
        long jI = (i10 & 32768) != 0 ? d0.t.f268869a.I() : j25;
        long jR = (i10 & 65536) != 0 ? d0.t.f268869a.r() : j26;
        long jR2 = (i10 & 131072) != 0 ? d0.t.f268869a.R() : j27;
        long jS2 = (i10 & 262144) != 0 ? d0.t.f268869a.s() : j28;
        long j48 = (i10 & 524288) != 0 ? j47 : j29;
        long jF2 = (i10 & 1048576) != 0 ? d0.t.f268869a.f() : j30;
        long jD = (i10 & 2097152) != 0 ? d0.t.f268869a.d() : j31;
        long jB = (i10 & 4194304) != 0 ? d0.t.f268869a.b() : j32;
        long jH = (i10 & 8388608) != 0 ? d0.t.f268869a.h() : j33;
        long jC = (i10 & 16777216) != 0 ? d0.t.f268869a.c() : j34;
        long jI2 = (i10 & com.google.api.client.googleapis.media.a.f115410j) != 0 ? d0.t.f268869a.i() : j35;
        long jX = (i10 & 67108864) != 0 ? d0.t.f268869a.x() : j36;
        long jY = (i10 & androidx.media3.common.j.W0) != 0 ? d0.t.f268869a.y() : j37;
        long jD2 = (i10 & 268435456) != 0 ? d0.t.f268869a.D() : j38;
        long J = (i10 & 536870912) != 0 ? d0.t.f268869a.J() : j39;
        long jK2 = (i10 & 1073741824) != 0 ? d0.t.f268869a.K() : j40;
        long jL = (i10 & Integer.MIN_VALUE) != 0 ? d0.t.f268869a.L() : j41;
        long jM = (i11 & 1) != 0 ? d0.t.f268869a.M() : j42;
        long jN2 = (i11 & 2) != 0 ? d0.t.f268869a.N() : j43;
        long jO2 = (i11 & 4) != 0 ? d0.t.f268869a.O() : j44;
        if ((i11 & 8) != 0) {
            j45 = d0.t.f268869a.P();
        }
        return s(j47, j46, jA, jK, jE, jE2, jN, jF, jO, jS, jT, jT2, jU, jA2, jG, jI, jR, jR2, jS2, j48, jF2, jD, jB, jH, jC, jI2, jX, jY, jD2, J, jK2, jL, jM, jN2, jO2, j45);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    public static final /* synthetic */ l6 u(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
        return x(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 65535, null);
    }

    public static /* synthetic */ l6 v(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, int i10, Object obj) {
        long jZ = (i10 & 1) != 0 ? d0.t.f268869a.z() : j10;
        long j39 = (i10 & 2) != 0 ? d0.t.f268869a.j() : j11;
        long jA = (i10 & 4) != 0 ? d0.t.f268869a.A() : j12;
        long jK = (i10 & 8) != 0 ? d0.t.f268869a.k() : j13;
        long jE = (i10 & 16) != 0 ? d0.t.f268869a.e() : j14;
        long jE2 = (i10 & 32) != 0 ? d0.t.f268869a.E() : j15;
        long jN = (i10 & 64) != 0 ? d0.t.f268869a.n() : j16;
        long jF = (i10 & 128) != 0 ? d0.t.f268869a.F() : j17;
        long j40 = jZ;
        long jO = (i10 & 256) != 0 ? d0.t.f268869a.o() : j18;
        long jS = (i10 & 512) != 0 ? d0.t.f268869a.S() : j19;
        long jT = (i10 & 1024) != 0 ? d0.t.f268869a.t() : j20;
        long jT2 = (i10 & 2048) != 0 ? d0.t.f268869a.T() : j21;
        long jU = (i10 & 4096) != 0 ? d0.t.f268869a.u() : j22;
        long jA2 = (i10 & 8192) != 0 ? d0.t.f268869a.a() : j23;
        long jG = (i10 & 16384) != 0 ? d0.t.f268869a.g() : j24;
        long jI = (i10 & 32768) != 0 ? d0.t.f268869a.I() : j25;
        long jR = (i10 & 65536) != 0 ? d0.t.f268869a.r() : j26;
        long jR2 = (i10 & 131072) != 0 ? d0.t.f268869a.R() : j27;
        long jS2 = (i10 & 262144) != 0 ? d0.t.f268869a.s() : j28;
        long j41 = (i10 & 524288) != 0 ? j40 : j29;
        long jF2 = (i10 & 1048576) != 0 ? d0.t.f268869a.f() : j30;
        long jD = (i10 & 2097152) != 0 ? d0.t.f268869a.d() : j31;
        long jB = (i10 & 4194304) != 0 ? d0.t.f268869a.b() : j32;
        long jH = (i10 & 8388608) != 0 ? d0.t.f268869a.h() : j33;
        long jC = (i10 & 16777216) != 0 ? d0.t.f268869a.c() : j34;
        long jI2 = (i10 & com.google.api.client.googleapis.media.a.f115410j) != 0 ? d0.t.f268869a.i() : j35;
        long jX = (i10 & 67108864) != 0 ? d0.t.f268869a.x() : j36;
        long jY = (i10 & androidx.media3.common.j.W0) != 0 ? d0.t.f268869a.y() : j37;
        if ((i10 & 268435456) != 0) {
            j38 = d0.t.f268869a.D();
        }
        return u(j40, j39, jA, jK, jE, jE2, jN, jF, jO, jS, jT, jT2, jU, jA2, jG, jI, jR, jR2, jS2, j41, jF2, jD, jB, jH, jC, jI2, jX, jY, j38);
    }

    @NotNull
    public static final l6 w(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57) {
        return new l6(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j45, j40, j41, j42, j43, j44, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, null);
    }

    public static /* synthetic */ l6 x(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, int i10, int i11, Object obj) {
        long jZ = (i10 & 1) != 0 ? d0.t.f268869a.z() : j10;
        long j58 = (i10 & 2) != 0 ? d0.t.f268869a.j() : j11;
        long jA = (i10 & 4) != 0 ? d0.t.f268869a.A() : j12;
        long jK = (i10 & 8) != 0 ? d0.t.f268869a.k() : j13;
        long jE = (i10 & 16) != 0 ? d0.t.f268869a.e() : j14;
        long jE2 = (i10 & 32) != 0 ? d0.t.f268869a.E() : j15;
        long jN = (i10 & 64) != 0 ? d0.t.f268869a.n() : j16;
        long j59 = jZ;
        long jF = (i10 & 128) != 0 ? d0.t.f268869a.F() : j17;
        long jO = (i10 & 256) != 0 ? d0.t.f268869a.o() : j18;
        long jS = (i10 & 512) != 0 ? d0.t.f268869a.S() : j19;
        long jT = (i10 & 1024) != 0 ? d0.t.f268869a.t() : j20;
        long jT2 = (i10 & 2048) != 0 ? d0.t.f268869a.T() : j21;
        long jU = (i10 & 4096) != 0 ? d0.t.f268869a.u() : j22;
        long jA2 = (i10 & 8192) != 0 ? d0.t.f268869a.a() : j23;
        long jG = (i10 & 16384) != 0 ? d0.t.f268869a.g() : j24;
        long jI = (i10 & 32768) != 0 ? d0.t.f268869a.I() : j25;
        long jR = (i10 & 65536) != 0 ? d0.t.f268869a.r() : j26;
        long jR2 = (i10 & 131072) != 0 ? d0.t.f268869a.R() : j27;
        long jS2 = (i10 & 262144) != 0 ? d0.t.f268869a.s() : j28;
        long j60 = (i10 & 524288) != 0 ? j59 : j29;
        long jF2 = (i10 & 1048576) != 0 ? d0.t.f268869a.f() : j30;
        long jD = (i10 & 2097152) != 0 ? d0.t.f268869a.d() : j31;
        long jB = (i10 & 4194304) != 0 ? d0.t.f268869a.b() : j32;
        long jH = (i10 & 8388608) != 0 ? d0.t.f268869a.h() : j33;
        long jC = (i10 & 16777216) != 0 ? d0.t.f268869a.c() : j34;
        long jI2 = (i10 & com.google.api.client.googleapis.media.a.f115410j) != 0 ? d0.t.f268869a.i() : j35;
        long jX = (i10 & 67108864) != 0 ? d0.t.f268869a.x() : j36;
        long jY = (i10 & androidx.media3.common.j.W0) != 0 ? d0.t.f268869a.y() : j37;
        long jD2 = (i10 & 268435456) != 0 ? d0.t.f268869a.D() : j38;
        long J = (i10 & 536870912) != 0 ? d0.t.f268869a.J() : j39;
        long jK2 = (i10 & 1073741824) != 0 ? d0.t.f268869a.K() : j40;
        long jL = (i10 & Integer.MIN_VALUE) != 0 ? d0.t.f268869a.L() : j41;
        long jM = (i11 & 1) != 0 ? d0.t.f268869a.M() : j42;
        long jN2 = (i11 & 2) != 0 ? d0.t.f268869a.N() : j43;
        long jO2 = (i11 & 4) != 0 ? d0.t.f268869a.O() : j44;
        long jP = (i11 & 8) != 0 ? d0.t.f268869a.P() : j45;
        long jB2 = (i11 & 16) != 0 ? d0.t.f268869a.B() : j46;
        long jC2 = (i11 & 32) != 0 ? d0.t.f268869a.C() : j47;
        long jL2 = (i11 & 64) != 0 ? d0.t.f268869a.l() : j48;
        long jM2 = (i11 & 128) != 0 ? d0.t.f268869a.m() : j49;
        long jG2 = (i11 & 256) != 0 ? d0.t.f268869a.G() : j50;
        long jH2 = (i11 & 512) != 0 ? d0.t.f268869a.H() : j51;
        long jP2 = (i11 & 1024) != 0 ? d0.t.f268869a.p() : j52;
        long jQ = (i11 & 2048) != 0 ? d0.t.f268869a.q() : j53;
        long jU2 = (i11 & 4096) != 0 ? d0.t.f268869a.U() : j54;
        long jV = (i11 & 8192) != 0 ? d0.t.f268869a.V() : j55;
        long jV2 = (i11 & 16384) != 0 ? d0.t.f268869a.v() : j56;
        if ((i11 & 32768) != 0) {
            j57 = d0.t.f268869a.w();
        }
        return w(j59, j58, jA, jK, jE, jE2, jN, jF, jO, jS, jT, jT2, jU, jA2, jG, jI, jR, jR2, jS2, j60, jF2, jD, jB, jH, jC, jI2, jX, jY, jD2, J, jK2, jL, jM, jN2, jO2, jP, jB2, jC2, jL2, jM2, jG2, jH2, jP2, jQ, jU2, jV, jV2, j57);
    }

    @androidx.compose.runtime.k7
    public static final long y(@NotNull l6 l6Var, float f10) {
        if (androidx.compose.ui.unit.h.x(f10, androidx.compose.ui.unit.h.r(0))) {
            return l6Var.M0();
        }
        return androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(l6Var.U0(), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), l6Var.M0());
    }
}
