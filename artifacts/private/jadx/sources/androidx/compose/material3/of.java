package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@af
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1537:1\n75#2:1538\n75#2:1539\n75#2:1540\n75#2:1541\n75#2:1542\n75#2:1543\n113#3:1544\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuDefaults\n*L\n579#1:1538\n740#1:1539\n866#1:1540\n978#1:1541\n1089#1:1542\n1188#1:1543\n845#1:1544\n*E\n"})
public final class of {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final of f31347a = new of();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f31348b = androidx.compose.foundation.layout.d5.g(ag.f26044a, androidx.compose.ui.unit.h.r(0));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f31349c = 0;

    private of() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(of ofVar, boolean z10, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        ofVar.d(z10, a0Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(of ofVar, boolean z10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ofVar.c(z10, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    @af
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.o
    public final /* synthetic */ void c(boolean z10, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        final of ofVar;
        final boolean z11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1803742020);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(this) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1803742020, i11, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:849)");
            }
            ofVar = this;
            z11 = z10;
            ofVar.d(z11, androidx.compose.ui.a0.E, c0VarR, (i11 & 14) | 48 | ((i11 << 3) & 896), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            ofVar = this;
            z11 = z10;
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.nf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return of.f(this.f31021a, z11, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @af
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void d(final boolean z10, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1732824199);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        if (c0VarR.h((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1732824199, i12, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:511)");
            }
            ni.p(androidx.compose.material3.internal.p2.b.f29069a.a(), null, androidx.compose.ui.draw.u.a(a0Var, z10 ? 180.0f : 0.0f), 0L, c0VarR, 48, 8);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.mf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return of.e(this.f30609a, z10, a0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 g() {
        return f31348b;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final j40 h(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @Nullable androidx.compose.foundation.text.selection.w4 w4Var, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12, int i13, int i14, int i15) {
        long jW;
        int i16;
        long jR;
        long jW2;
        int i17;
        long jR2;
        long jW3;
        int i18;
        long jR3;
        long jW4;
        int i19;
        long jR4;
        long jW5;
        int i20;
        long jR5;
        long jW6;
        int i21;
        long jR6;
        long jW7;
        int i22;
        long jR7;
        long jW8;
        long jR8 = (i14 & 1) != 0 ? o6.r(d0.t1.f268910a.p(), c0Var, 6) : j10;
        long jR9 = (i14 & 2) != 0 ? o6.r(d0.t1.f268910a.v(), c0Var, 6) : j11;
        if ((i14 & 4) != 0) {
            d0.t1 t1Var = d0.t1.f268910a;
            jW = androidx.compose.ui.graphics.q0.w(o6.r(t1Var.a(), c0Var, 6), t1Var.b(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW = j12;
        }
        long jR10 = (i14 & 8) != 0 ? o6.r(d0.t1.f268910a.m(), c0Var, 6) : j13;
        long jS = (i14 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.s() : j14;
        long jS2 = (i14 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.s() : j15;
        long jS3 = (i14 & 64) != 0 ? androidx.compose.ui.graphics.q0.f38131b.s() : j16;
        long jS4 = (i14 & 128) != 0 ? androidx.compose.ui.graphics.q0.f38131b.s() : j17;
        long jR11 = (i14 & 256) != 0 ? o6.r(d0.t1.f268910a.E(), c0Var, 6) : j18;
        long jR12 = (i14 & 512) != 0 ? o6.r(d0.t1.f268910a.O(), c0Var, 6) : j19;
        androidx.compose.foundation.text.selection.w4 w4Var2 = (i14 & 1024) != 0 ? (androidx.compose.foundation.text.selection.w4) c0Var.W(androidx.compose.foundation.text.selection.y4.d()) : w4Var;
        if ((i14 & 2048) != 0) {
            i16 = 6;
            jR = o6.r(d0.t1.f268910a.Z(), c0Var, 6);
        } else {
            i16 = 6;
            jR = j20;
        }
        long jR13 = (i14 & 4096) != 0 ? o6.r(d0.t1.f268910a.i0(), c0Var, i16) : j21;
        if ((i14 & 8192) != 0) {
            d0.t1 t1Var2 = d0.t1.f268910a;
            jW2 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var2.J(), c0Var, i16), t1Var2.K(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW2 = j22;
        }
        long j48 = jW2;
        if ((i14 & 16384) != 0) {
            i17 = 6;
            jR2 = o6.r(d0.t1.f268910a.W(), c0Var, 6);
        } else {
            i17 = 6;
            jR2 = j23;
        }
        long jR14 = (32768 & i14) != 0 ? o6.r(d0.t1.f268910a.Y(), c0Var, i17) : j24;
        long jR15 = (65536 & i14) != 0 ? o6.r(d0.t1.f268910a.g0(), c0Var, i17) : j25;
        if ((131072 & i14) != 0) {
            d0.t1 t1Var3 = d0.t1.f268910a;
            jW3 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var3.H(), c0Var, i17), t1Var3.I(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW3 = j26;
        }
        if ((i14 & 262144) != 0) {
            i18 = 6;
            jR3 = o6.r(d0.t1.f268910a.V(), c0Var, 6);
        } else {
            i18 = 6;
            jR3 = j27;
        }
        long jR16 = (i14 & 524288) != 0 ? o6.r(d0.t1.f268910a.b0(), c0Var, i18) : j28;
        long jR17 = (i14 & 1048576) != 0 ? o6.r(d0.t1.f268910a.k0(), c0Var, i18) : j29;
        if ((i14 & 2097152) != 0) {
            d0.t1 t1Var4 = d0.t1.f268910a;
            jW4 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var4.M(), c0Var, i18), t1Var4.N(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW4 = j30;
        }
        if ((i14 & 4194304) != 0) {
            i19 = 6;
            jR4 = o6.r(d0.t1.f268910a.X(), c0Var, 6);
        } else {
            i19 = 6;
            jR4 = j31;
        }
        long jR18 = (i14 & 8388608) != 0 ? o6.r(d0.t1.f268910a.q(), c0Var, i19) : j32;
        long jR19 = (i14 & 16777216) != 0 ? o6.r(d0.t1.f268910a.x(), c0Var, i19) : j33;
        if ((i14 & com.google.api.client.googleapis.media.a.f115410j) != 0) {
            d0.t1 t1Var5 = d0.t1.f268910a;
            jW5 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var5.c(), c0Var, i19), t1Var5.d(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW5 = j34;
        }
        if ((i14 & 67108864) != 0) {
            i20 = 6;
            jR5 = o6.r(d0.t1.f268910a.n(), c0Var, 6);
        } else {
            i20 = 6;
            jR5 = j35;
        }
        long jR20 = (i14 & androidx.media3.common.j.W0) != 0 ? o6.r(d0.t1.f268910a.z(), c0Var, i20) : j36;
        long jR21 = (i14 & 268435456) != 0 ? o6.r(d0.t1.f268910a.z(), c0Var, i20) : j37;
        if ((i14 & 536870912) != 0) {
            d0.t1 t1Var6 = d0.t1.f268910a;
            jW6 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var6.e(), c0Var, i20), t1Var6.f(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW6 = j38;
        }
        if ((i14 & 1073741824) != 0) {
            i21 = 6;
            jR6 = o6.r(d0.t1.f268910a.z(), c0Var, 6);
        } else {
            i21 = 6;
            jR6 = j39;
        }
        long jR22 = (i15 & 1) != 0 ? o6.r(d0.t1.f268910a.z(), c0Var, i21) : j40;
        long jR23 = (i15 & 2) != 0 ? o6.r(d0.t1.f268910a.z(), c0Var, i21) : j41;
        if ((i15 & 4) != 0) {
            d0.t1 t1Var7 = d0.t1.f268910a;
            jW7 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var7.e(), c0Var, i21), t1Var7.f(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW7 = j42;
        }
        if ((i15 & 8) != 0) {
            i22 = 6;
            jR7 = o6.r(d0.t1.f268910a.z(), c0Var, 6);
        } else {
            i22 = 6;
            jR7 = j43;
        }
        long jR24 = (i15 & 16) != 0 ? o6.r(d0.t1.f268910a.z(), c0Var, i22) : j44;
        long jR25 = (i15 & 32) != 0 ? o6.r(d0.t1.f268910a.z(), c0Var, i22) : j45;
        if ((i15 & 64) != 0) {
            d0.t1 t1Var8 = d0.t1.f268910a;
            jW8 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var8.e(), c0Var, i22), t1Var8.f(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW8 = j46;
        }
        long jR26 = (i15 & 128) != 0 ? o6.r(d0.t1.f268910a.z(), c0Var, 6) : j47;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-325161132, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:797)");
        }
        int i23 = i13 << 12;
        int i24 = i13 >> 18;
        int i25 = (i24 & 14) | 3072 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896);
        androidx.compose.foundation.text.selection.w4 w4Var3 = w4Var2;
        j40 j40VarK = lq.f30410a.k(jR8, jR9, jW, jR10, jS, jS2, jS3, jS4, jR11, jR12, w4Var3, jR, jR13, j48, jR2, jR14, jR15, jW3, jR3, jR16, jR17, jW4, jR4, jR18, jR19, jW5, jR5, jR20, jR21, jW6, jR6, 0L, 0L, 0L, 0L, jR22, jR23, jW7, jR7, jR24, jR25, jW8, jR26, c0Var, i10 & 2147483646, i11 & 2147483646, i12 & 2147483646, (i13 & 14) | (458752 & i23) | (3670016 & i23) | (29360128 & i23) | (234881024 & i23) | (i23 & 1879048192), i25, 0, 15);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j40VarK;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    public final /* synthetic */ j40 i(long j10, long j11, long j12, long j13, long j14, androidx.compose.foundation.text.selection.w4 w4Var, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12, int i13) {
        long jW;
        long jW2;
        long jW3;
        long jW4;
        long jW5;
        long jW6;
        long jR = (i13 & 1) != 0 ? o6.r(d0.t1.f268910a.v(), c0Var, 6) : j10;
        if ((i13 & 2) != 0) {
            d0.t1 t1Var = d0.t1.f268910a;
            jW = androidx.compose.ui.graphics.q0.w(o6.r(t1Var.a(), c0Var, 6), t1Var.b(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW = j11;
        }
        long jS = (i13 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.s() : j12;
        long jR2 = (i13 & 8) != 0 ? o6.r(d0.t1.f268910a.E(), c0Var, 6) : j13;
        long jR3 = (i13 & 16) != 0 ? o6.r(d0.t1.f268910a.O(), c0Var, 6) : j14;
        androidx.compose.foundation.text.selection.w4 w4Var2 = (i13 & 32) != 0 ? (androidx.compose.foundation.text.selection.w4) c0Var.W(androidx.compose.foundation.text.selection.y4.d()) : w4Var;
        long jR4 = (i13 & 64) != 0 ? o6.r(d0.t1.f268910a.Z(), c0Var, 6) : j15;
        long jR5 = (i13 & 128) != 0 ? o6.r(d0.t1.f268910a.i0(), c0Var, 6) : j16;
        if ((i13 & 256) != 0) {
            d0.t1 t1Var2 = d0.t1.f268910a;
            jW2 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var2.J(), c0Var, 6), t1Var2.K(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW2 = j17;
        }
        long jR6 = (i13 & 512) != 0 ? o6.r(d0.t1.f268910a.W(), c0Var, 6) : j18;
        long jR7 = (i13 & 1024) != 0 ? o6.r(d0.t1.f268910a.Y(), c0Var, 6) : j19;
        long jR8 = (i13 & 2048) != 0 ? o6.r(d0.t1.f268910a.g0(), c0Var, 6) : j20;
        if ((i13 & 4096) != 0) {
            d0.t1 t1Var3 = d0.t1.f268910a;
            jW3 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var3.H(), c0Var, 6), t1Var3.I(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW3 = j21;
        }
        long jR9 = (i13 & 8192) != 0 ? o6.r(d0.t1.f268910a.V(), c0Var, 6) : j22;
        long jR10 = (i13 & 16384) != 0 ? o6.r(d0.t1.f268910a.b0(), c0Var, 6) : j23;
        long jR11 = (32768 & i13) != 0 ? o6.r(d0.t1.f268910a.k0(), c0Var, 6) : j24;
        if ((65536 & i13) != 0) {
            d0.t1 t1Var4 = d0.t1.f268910a;
            jW4 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var4.M(), c0Var, 6), t1Var4.N(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW4 = j25;
        }
        long jR12 = (131072 & i13) != 0 ? o6.r(d0.t1.f268910a.X(), c0Var, 6) : j26;
        long jR13 = (262144 & i13) != 0 ? o6.r(d0.t1.f268910a.q(), c0Var, 6) : j27;
        long jR14 = (524288 & i13) != 0 ? o6.r(d0.t1.f268910a.x(), c0Var, 6) : j28;
        if ((1048576 & i13) != 0) {
            d0.t1 t1Var5 = d0.t1.f268910a;
            jW5 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var5.c(), c0Var, 6), t1Var5.d(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW5 = j29;
        }
        long jR15 = (2097152 & i13) != 0 ? o6.r(d0.t1.f268910a.n(), c0Var, 6) : j30;
        long jR16 = (4194304 & i13) != 0 ? o6.r(d0.t1.f268910a.z(), c0Var, 6) : j31;
        if ((i13 & 8388608) != 0) {
            d0.t1 t1Var6 = d0.t1.f268910a;
            jW6 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var6.a(), c0Var, 6), t1Var6.b(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW6 = j32;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-83147315, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:1228)");
        }
        d0.t1 t1Var7 = d0.t1.f268910a;
        long jR17 = o6.r(t1Var7.z(), c0Var, 6);
        long jR18 = o6.r(t1Var7.z(), c0Var, 6);
        long jW7 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var7.e(), c0Var, 6), t1Var7.f(), 0.0f, 0.0f, 0.0f, 14, null);
        long jR19 = o6.r(t1Var7.z(), c0Var, 6);
        long jR20 = o6.r(t1Var7.z(), c0Var, 6);
        long jR21 = o6.r(t1Var7.z(), c0Var, 6);
        long jW8 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var7.e(), c0Var, 6), t1Var7.f(), 0.0f, 0.0f, 0.0f, 14, null);
        long jR22 = o6.r(t1Var7.z(), c0Var, 6);
        int i14 = i10 << 3;
        int i15 = (i10 & 14) | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896);
        int i16 = i10 << 9;
        int i17 = i15 | (i16 & 7168) | ((i10 << 6) & 57344) | (i16 & 458752) | ((i10 << 12) & 3670016);
        int i18 = i10 << 15;
        int i19 = i17 | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i11 << 15;
        int i21 = ((i10 >> 15) & androidx.media3.extractor.y0.f69665l) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192);
        int i22 = i12 << 15;
        int i23 = i12 << 18;
        int i24 = ((i11 >> 15) & androidx.media3.extractor.y0.f69665l) | (i22 & 458752) | (i22 & 3670016) | (i22 & 29360128) | (i23 & 234881024) | (i23 & 1879048192);
        int i25 = ((i12 >> 6) & 14) | (i22 & 1879048192);
        long j33 = jR;
        j40 j40VarH = h(j33, jR, jW, j33, jS, jS, jS, jS, jR2, jR3, w4Var2, jR4, jR5, jW2, jR6, jR7, jR8, jW3, jR9, jR10, jR11, jW4, jR12, jR13, jR14, jW5, jR15, jR16, jR16, jW6, jR16, jR17, jR18, jW7, jR19, jR20, jR21, jW8, jR22, c0Var, i19, i21, i24, i25, 0, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j40VarH;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    public final /* synthetic */ j40 j(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, androidx.compose.foundation.text.selection.w4 w4Var, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12, int i13, int i14, int i15) {
        long jW;
        long jW2;
        long jW3;
        long jW4;
        long jW5;
        long jW6;
        long jW7;
        long jW8;
        long jR = (i14 & 1) != 0 ? o6.r(d0.t1.f268910a.p(), c0Var, 6) : j10;
        long jR2 = (i14 & 2) != 0 ? o6.r(d0.t1.f268910a.v(), c0Var, 6) : j11;
        if ((i14 & 4) != 0) {
            d0.t1 t1Var = d0.t1.f268910a;
            jW = androidx.compose.ui.graphics.q0.w(o6.r(t1Var.a(), c0Var, 6), t1Var.b(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW = j12;
        }
        long jR3 = (i14 & 8) != 0 ? o6.r(d0.t1.f268910a.m(), c0Var, 6) : j13;
        long jS = (i14 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.s() : j14;
        long jS2 = (i14 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.s() : j15;
        long jR4 = (i14 & 64) != 0 ? o6.r(d0.t1.f268910a.E(), c0Var, 6) : j16;
        long jR5 = (i14 & 128) != 0 ? o6.r(d0.t1.f268910a.O(), c0Var, 6) : j17;
        androidx.compose.foundation.text.selection.w4 w4Var2 = (i14 & 256) != 0 ? (androidx.compose.foundation.text.selection.w4) c0Var.W(androidx.compose.foundation.text.selection.y4.d()) : w4Var;
        long jR6 = (i14 & 512) != 0 ? o6.r(d0.t1.f268910a.Z(), c0Var, 6) : j18;
        long jR7 = (i14 & 1024) != 0 ? o6.r(d0.t1.f268910a.i0(), c0Var, 6) : j19;
        if ((i14 & 2048) != 0) {
            d0.t1 t1Var2 = d0.t1.f268910a;
            jW2 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var2.J(), c0Var, 6), t1Var2.K(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW2 = j20;
        }
        long jR8 = (i14 & 4096) != 0 ? o6.r(d0.t1.f268910a.W(), c0Var, 6) : j21;
        long jR9 = (i14 & 8192) != 0 ? o6.r(d0.t1.f268910a.Y(), c0Var, 6) : j22;
        long jR10 = (i14 & 16384) != 0 ? o6.r(d0.t1.f268910a.g0(), c0Var, 6) : j23;
        if ((32768 & i14) != 0) {
            d0.t1 t1Var3 = d0.t1.f268910a;
            jW3 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var3.H(), c0Var, 6), t1Var3.I(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW3 = j24;
        }
        long jR11 = (i14 & 65536) != 0 ? o6.r(d0.t1.f268910a.V(), c0Var, 6) : j25;
        long jR12 = (i14 & 131072) != 0 ? o6.r(d0.t1.f268910a.b0(), c0Var, 6) : j26;
        long jR13 = (i14 & 262144) != 0 ? o6.r(d0.t1.f268910a.k0(), c0Var, 6) : j27;
        if ((i14 & 524288) != 0) {
            d0.t1 t1Var4 = d0.t1.f268910a;
            jW4 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var4.M(), c0Var, 6), t1Var4.N(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW4 = j28;
        }
        long jR14 = (i14 & 1048576) != 0 ? o6.r(d0.t1.f268910a.X(), c0Var, 6) : j29;
        long jR15 = (i14 & 2097152) != 0 ? o6.r(d0.t1.f268910a.q(), c0Var, 6) : j30;
        long jR16 = (i14 & 4194304) != 0 ? o6.r(d0.t1.f268910a.x(), c0Var, 6) : j31;
        if ((i14 & 8388608) != 0) {
            d0.t1 t1Var5 = d0.t1.f268910a;
            jW5 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var5.c(), c0Var, 6), t1Var5.d(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW5 = j32;
        }
        long jR17 = (i14 & 16777216) != 0 ? o6.r(d0.t1.f268910a.n(), c0Var, 6) : j33;
        long jR18 = (i14 & com.google.api.client.googleapis.media.a.f115410j) != 0 ? o6.r(d0.t1.f268910a.z(), c0Var, 6) : j34;
        long jR19 = (i14 & 67108864) != 0 ? o6.r(d0.t1.f268910a.z(), c0Var, 6) : j35;
        if ((i14 & androidx.media3.common.j.W0) != 0) {
            d0.t1 t1Var6 = d0.t1.f268910a;
            jW6 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var6.e(), c0Var, 6), t1Var6.f(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW6 = j36;
        }
        long jR20 = (i14 & 268435456) != 0 ? o6.r(d0.t1.f268910a.z(), c0Var, 6) : j37;
        long jR21 = (i14 & 536870912) != 0 ? o6.r(d0.t1.f268910a.z(), c0Var, 6) : j38;
        long jR22 = (i14 & 1073741824) != 0 ? o6.r(d0.t1.f268910a.z(), c0Var, 6) : j39;
        if ((i15 & 1) != 0) {
            d0.t1 t1Var7 = d0.t1.f268910a;
            jW7 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var7.e(), c0Var, 6), t1Var7.f(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW7 = j40;
        }
        long jR23 = (i15 & 2) != 0 ? o6.r(d0.t1.f268910a.z(), c0Var, 6) : j41;
        long jR24 = (i15 & 4) != 0 ? o6.r(d0.t1.f268910a.z(), c0Var, 6) : j42;
        long jR25 = (i15 & 8) != 0 ? o6.r(d0.t1.f268910a.z(), c0Var, 6) : j43;
        if ((i15 & 16) != 0) {
            d0.t1 t1Var8 = d0.t1.f268910a;
            jW8 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var8.e(), c0Var, 6), t1Var8.f(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW8 = j44;
        }
        long jR26 = (i15 & 32) != 0 ? o6.r(d0.t1.f268910a.z(), c0Var, 6) : j45;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-907010558, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:1035)");
        }
        int i16 = i10 << 6;
        int i17 = (65534 & i10) | ((i10 << 3) & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192);
        int i18 = i11 << 6;
        int i19 = ((i10 >> 24) & okhttp3.internal.ws.g.f334652s) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i12 << 6;
        int i21 = i13 << 6;
        j40 j40VarH = h(jR, jR2, jW, jR3, jS, jS, jS, jS2, jR4, jR5, w4Var2, jR6, jR7, jW2, jR8, jR9, jR10, jW3, jR11, jR12, jR13, jW4, jR14, jR15, jR16, jW5, jR17, jR18, jR19, jW6, jR20, jR21, jR22, jW7, jR23, jR24, jR25, jW8, jR26, c0Var, i17, i19, ((i11 >> 24) & okhttp3.internal.ws.g.f334652s) | (i20 & 896) | (i20 & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), (i21 & 896) | ((i12 >> 24) & okhttp3.internal.ws.g.f334652s) | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), 0, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j40VarH;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final j40 k(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @Nullable androidx.compose.foundation.text.selection.w4 w4Var, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12, int i13, int i14, int i15) {
        long jW;
        int i16;
        long jR;
        long jW2;
        int i17;
        long jR2;
        long jW3;
        int i18;
        long jR3;
        long jW4;
        int i19;
        long jR4;
        long jW5;
        int i20;
        long jR5;
        long jW6;
        int i21;
        long jR6;
        long jW7;
        long jR7 = (i14 & 1) != 0 ? o6.r(d0.r0.f268731a.p(), c0Var, 6) : j10;
        long jR8 = (i14 & 2) != 0 ? o6.r(d0.r0.f268731a.v(), c0Var, 6) : j11;
        if ((i14 & 4) != 0) {
            d0.r0 r0Var = d0.r0.f268731a;
            jW = androidx.compose.ui.graphics.q0.w(o6.r(r0Var.a(), c0Var, 6), r0Var.b(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW = j12;
        }
        long jR9 = (i14 & 8) != 0 ? o6.r(d0.r0.f268731a.m(), c0Var, 6) : j13;
        long jR10 = (i14 & 16) != 0 ? o6.r(d0.r0.f268731a.H(), c0Var, 6) : j14;
        long jR11 = (i14 & 32) != 0 ? o6.r(d0.r0.f268731a.H(), c0Var, 6) : j15;
        long jR12 = (i14 & 64) != 0 ? o6.r(d0.r0.f268731a.H(), c0Var, 6) : j16;
        long jR13 = (i14 & 128) != 0 ? o6.r(d0.r0.f268731a.H(), c0Var, 6) : j17;
        long jR14 = (i14 & 256) != 0 ? o6.r(d0.r0.f268731a.G(), c0Var, 6) : j18;
        long jR15 = (i14 & 512) != 0 ? o6.r(d0.r0.f268731a.U(), c0Var, 6) : j19;
        androidx.compose.foundation.text.selection.w4 w4Var2 = (i14 & 1024) != 0 ? (androidx.compose.foundation.text.selection.w4) c0Var.W(androidx.compose.foundation.text.selection.y4.d()) : w4Var;
        if ((i14 & 2048) != 0) {
            i16 = 6;
            jR = o6.r(d0.r0.f268731a.c0(), c0Var, 6);
        } else {
            i16 = 6;
            jR = j20;
        }
        long jR16 = (i14 & 4096) != 0 ? o6.r(d0.r0.f268731a.E(), c0Var, i16) : j21;
        if ((i14 & 8192) != 0) {
            d0.r0 r0Var2 = d0.r0.f268731a;
            jW2 = androidx.compose.ui.graphics.q0.w(o6.r(r0Var2.J(), c0Var, i16), r0Var2.L(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW2 = j22;
        }
        long j48 = jW2;
        if ((i14 & 16384) != 0) {
            i17 = 6;
            jR2 = o6.r(d0.r0.f268731a.S(), c0Var, 6);
        } else {
            i17 = 6;
            jR2 = j23;
        }
        long jR17 = (32768 & i14) != 0 ? o6.r(d0.r0.f268731a.e0(), c0Var, i17) : j24;
        long jR18 = (65536 & i14) != 0 ? o6.r(d0.r0.f268731a.k0(), c0Var, i17) : j25;
        if ((131072 & i14) != 0) {
            d0.r0 r0Var3 = d0.r0.f268731a;
            jW3 = androidx.compose.ui.graphics.q0.w(o6.r(r0Var3.O(), c0Var, i17), r0Var3.P(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW3 = j26;
        }
        if ((i14 & 262144) != 0) {
            i18 = 6;
            jR3 = o6.r(d0.r0.f268731a.a0(), c0Var, 6);
        } else {
            i18 = 6;
            jR3 = j27;
        }
        long jR19 = (i14 & 524288) != 0 ? o6.r(d0.r0.f268731a.f0(), c0Var, i18) : j28;
        long jR20 = (i14 & 1048576) != 0 ? o6.r(d0.r0.f268731a.m0(), c0Var, i18) : j29;
        if ((i14 & 2097152) != 0) {
            d0.r0 r0Var4 = d0.r0.f268731a;
            jW4 = androidx.compose.ui.graphics.q0.w(o6.r(r0Var4.Q(), c0Var, i18), r0Var4.R(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW4 = j30;
        }
        if ((i14 & 4194304) != 0) {
            i19 = 6;
            jR4 = o6.r(d0.r0.f268731a.b0(), c0Var, 6);
        } else {
            i19 = 6;
            jR4 = j31;
        }
        long jR21 = (i14 & 8388608) != 0 ? o6.r(d0.r0.f268731a.q(), c0Var, i19) : j32;
        long jR22 = (i14 & 16777216) != 0 ? o6.r(d0.r0.f268731a.x(), c0Var, i19) : j33;
        long jR23 = (i14 & com.google.api.client.googleapis.media.a.f115410j) != 0 ? o6.r(d0.r0.f268731a.c(), c0Var, i19) : j34;
        long jR24 = (i14 & 67108864) != 0 ? o6.r(d0.r0.f268731a.n(), c0Var, i19) : j35;
        long jR25 = (i14 & androidx.media3.common.j.W0) != 0 ? o6.r(d0.r0.f268731a.z(), c0Var, i19) : j36;
        long jR26 = (i14 & 268435456) != 0 ? o6.r(d0.r0.f268731a.z(), c0Var, i19) : j37;
        if ((i14 & 536870912) != 0) {
            d0.r0 r0Var5 = d0.r0.f268731a;
            jW5 = androidx.compose.ui.graphics.q0.w(o6.r(r0Var5.e(), c0Var, i19), r0Var5.f(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW5 = j38;
        }
        if ((i14 & 1073741824) != 0) {
            i20 = 6;
            jR5 = o6.r(d0.r0.f268731a.z(), c0Var, 6);
        } else {
            i20 = 6;
            jR5 = j39;
        }
        long jR27 = (i15 & 1) != 0 ? o6.r(d0.r0.f268731a.z(), c0Var, i20) : j40;
        long jR28 = (i15 & 2) != 0 ? o6.r(d0.r0.f268731a.z(), c0Var, i20) : j41;
        if ((i15 & 4) != 0) {
            d0.r0 r0Var6 = d0.r0.f268731a;
            jW6 = androidx.compose.ui.graphics.q0.w(o6.r(r0Var6.e(), c0Var, i20), r0Var6.f(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW6 = j42;
        }
        if ((i15 & 8) != 0) {
            i21 = 6;
            jR6 = o6.r(d0.r0.f268731a.z(), c0Var, 6);
        } else {
            i21 = 6;
            jR6 = j43;
        }
        long jR29 = (i15 & 16) != 0 ? o6.r(d0.r0.f268731a.z(), c0Var, i21) : j44;
        long jR30 = (i15 & 32) != 0 ? o6.r(d0.r0.f268731a.z(), c0Var, i21) : j45;
        if ((i15 & 64) != 0) {
            d0.r0 r0Var7 = d0.r0.f268731a;
            jW7 = androidx.compose.ui.graphics.q0.w(o6.r(r0Var7.e(), c0Var, i21), r0Var7.f(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW7 = j46;
        }
        long jR31 = (i15 & 128) != 0 ? o6.r(d0.r0.f268731a.z(), c0Var, 6) : j47;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-375683630, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:634)");
        }
        int i22 = i13 << 12;
        int i23 = i13 >> 18;
        int i24 = (i23 & 14) | 3072 | (i23 & com.planner5d.library.engine.input.f.b.B) | (i23 & 896);
        androidx.compose.foundation.text.selection.w4 w4Var3 = w4Var2;
        j40 j40VarK = n40.f30917a.k(jR7, jR8, jW, jR9, jR10, jR11, jR12, jR13, jR14, jR15, w4Var3, jR, jR16, j48, jR2, jR17, jR18, jW3, jR3, jR19, jR20, jW4, jR4, jR21, jR22, jR23, jR24, jR25, jR26, jW5, jR5, 0L, 0L, 0L, 0L, jR27, jR28, jW6, jR6, jR29, jR30, jW7, jR31, c0Var, i10 & 2147483646, i11 & 2147483646, i12 & 2147483646, (i13 & 14) | (458752 & i22) | (3670016 & i22) | (29360128 & i22) | (234881024 & i22) | (i22 & 1879048192), i24, 0, 15);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j40VarK;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    public final /* synthetic */ j40 l(long j10, long j11, long j12, long j13, long j14, androidx.compose.foundation.text.selection.w4 w4Var, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12, int i13) {
        long jW;
        long jW2;
        long jW3;
        long jW4;
        long jW5;
        long jR = (i13 & 1) != 0 ? o6.r(d0.r0.f268731a.v(), c0Var, 6) : j10;
        if ((i13 & 2) != 0) {
            d0.r0 r0Var = d0.r0.f268731a;
            jW = androidx.compose.ui.graphics.q0.w(o6.r(r0Var.a(), c0Var, 6), r0Var.b(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW = j11;
        }
        long jR2 = (i13 & 4) != 0 ? o6.r(d0.r0.f268731a.H(), c0Var, 6) : j12;
        long jR3 = (i13 & 8) != 0 ? o6.r(d0.r0.f268731a.G(), c0Var, 6) : j13;
        long jR4 = (i13 & 16) != 0 ? o6.r(d0.r0.f268731a.U(), c0Var, 6) : j14;
        androidx.compose.foundation.text.selection.w4 w4Var2 = (i13 & 32) != 0 ? (androidx.compose.foundation.text.selection.w4) c0Var.W(androidx.compose.foundation.text.selection.y4.d()) : w4Var;
        long jR5 = (i13 & 64) != 0 ? o6.r(d0.r0.f268731a.c0(), c0Var, 6) : j15;
        long jR6 = (i13 & 128) != 0 ? o6.r(d0.r0.f268731a.E(), c0Var, 6) : j16;
        if ((i13 & 256) != 0) {
            d0.r0 r0Var2 = d0.r0.f268731a;
            jW2 = androidx.compose.ui.graphics.q0.w(o6.r(r0Var2.J(), c0Var, 6), r0Var2.L(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW2 = j17;
        }
        long jR7 = (i13 & 512) != 0 ? o6.r(d0.r0.f268731a.S(), c0Var, 6) : j18;
        long jR8 = (i13 & 1024) != 0 ? o6.r(d0.r0.f268731a.e0(), c0Var, 6) : j19;
        long jR9 = (i13 & 2048) != 0 ? o6.r(d0.r0.f268731a.k0(), c0Var, 6) : j20;
        if ((i13 & 4096) != 0) {
            d0.r0 r0Var3 = d0.r0.f268731a;
            jW3 = androidx.compose.ui.graphics.q0.w(o6.r(r0Var3.O(), c0Var, 6), r0Var3.P(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW3 = j21;
        }
        long jR10 = (i13 & 8192) != 0 ? o6.r(d0.r0.f268731a.a0(), c0Var, 6) : j22;
        long jR11 = (i13 & 16384) != 0 ? o6.r(d0.r0.f268731a.f0(), c0Var, 6) : j23;
        long jR12 = (32768 & i13) != 0 ? o6.r(d0.r0.f268731a.m0(), c0Var, 6) : j24;
        if ((65536 & i13) != 0) {
            d0.r0 r0Var4 = d0.r0.f268731a;
            jW4 = androidx.compose.ui.graphics.q0.w(o6.r(r0Var4.Q(), c0Var, 6), r0Var4.R(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW4 = j25;
        }
        long jR13 = (131072 & i13) != 0 ? o6.r(d0.r0.f268731a.b0(), c0Var, 6) : j26;
        long jR14 = (262144 & i13) != 0 ? o6.r(d0.r0.f268731a.q(), c0Var, 6) : j27;
        long jR15 = (524288 & i13) != 0 ? o6.r(d0.r0.f268731a.x(), c0Var, 6) : j28;
        long jR16 = (1048576 & i13) != 0 ? o6.r(d0.r0.f268731a.c(), c0Var, 6) : j29;
        long jR17 = (2097152 & i13) != 0 ? o6.r(d0.r0.f268731a.n(), c0Var, 6) : j30;
        long jR18 = (4194304 & i13) != 0 ? o6.r(d0.r0.f268731a.z(), c0Var, 6) : j31;
        if ((i13 & 8388608) != 0) {
            d0.r0 r0Var5 = d0.r0.f268731a;
            jW5 = androidx.compose.ui.graphics.q0.w(o6.r(r0Var5.a(), c0Var, 6), r0Var5.b(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW5 = j32;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2013303349, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:1128)");
        }
        d0.t1 t1Var = d0.t1.f268910a;
        long jR19 = o6.r(t1Var.z(), c0Var, 6);
        long jR20 = o6.r(t1Var.z(), c0Var, 6);
        long jW6 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var.e(), c0Var, 6), t1Var.f(), 0.0f, 0.0f, 0.0f, 14, null);
        long jR21 = o6.r(t1Var.z(), c0Var, 6);
        long jR22 = o6.r(t1Var.z(), c0Var, 6);
        long jR23 = o6.r(t1Var.z(), c0Var, 6);
        long jW7 = androidx.compose.ui.graphics.q0.w(o6.r(t1Var.e(), c0Var, 6), t1Var.f(), 0.0f, 0.0f, 0.0f, 14, null);
        long jR24 = o6.r(t1Var.z(), c0Var, 6);
        int i14 = i10 << 3;
        int i15 = (i10 & 14) | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896);
        int i16 = i10 << 9;
        int i17 = i15 | (i16 & 7168) | ((i10 << 6) & 57344) | (i16 & 458752) | ((i10 << 12) & 3670016);
        int i18 = i10 << 15;
        int i19 = i17 | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i11 << 15;
        int i21 = ((i10 >> 15) & androidx.media3.extractor.y0.f69665l) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192);
        int i22 = i12 << 15;
        int i23 = i12 << 18;
        int i24 = ((i11 >> 15) & androidx.media3.extractor.y0.f69665l) | (i22 & 458752) | (i22 & 3670016) | (i22 & 29360128) | (i23 & 234881024) | (i23 & 1879048192);
        int i25 = ((i12 >> 6) & 14) | (i22 & 1879048192);
        long j33 = jR;
        j40 j40VarK = k(j33, jR, jW, j33, jR2, jR2, jR2, jR2, jR3, jR4, w4Var2, jR5, jR6, jW2, jR7, jR8, jR9, jW3, jR10, jR11, jR12, jW4, jR13, jR14, jR15, jR16, jR17, jR18, jR18, jW5, jR18, jR19, jR20, jW6, jR21, jR22, jR23, jW7, jR24, c0Var, i19, i21, i24, i25, 0, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j40VarK;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    public final /* synthetic */ j40 m(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, androidx.compose.foundation.text.selection.w4 w4Var, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12, int i13, int i14, int i15) {
        long jW;
        long jW2;
        long jW3;
        long jW4;
        long jW5;
        long jW6;
        long jW7;
        long jR = (i14 & 1) != 0 ? o6.r(d0.r0.f268731a.p(), c0Var, 6) : j10;
        long jR2 = (i14 & 2) != 0 ? o6.r(d0.r0.f268731a.v(), c0Var, 6) : j11;
        if ((i14 & 4) != 0) {
            d0.r0 r0Var = d0.r0.f268731a;
            jW = androidx.compose.ui.graphics.q0.w(o6.r(r0Var.a(), c0Var, 6), r0Var.b(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW = j12;
        }
        long jR3 = (i14 & 8) != 0 ? o6.r(d0.r0.f268731a.m(), c0Var, 6) : j13;
        long jR4 = (i14 & 16) != 0 ? o6.r(d0.r0.f268731a.H(), c0Var, 6) : j14;
        long jR5 = (i14 & 32) != 0 ? o6.r(d0.r0.f268731a.H(), c0Var, 6) : j15;
        long jR6 = (i14 & 64) != 0 ? o6.r(d0.r0.f268731a.G(), c0Var, 6) : j16;
        long jR7 = (i14 & 128) != 0 ? o6.r(d0.r0.f268731a.U(), c0Var, 6) : j17;
        androidx.compose.foundation.text.selection.w4 w4Var2 = (i14 & 256) != 0 ? (androidx.compose.foundation.text.selection.w4) c0Var.W(androidx.compose.foundation.text.selection.y4.d()) : w4Var;
        long jR8 = (i14 & 512) != 0 ? o6.r(d0.r0.f268731a.c0(), c0Var, 6) : j18;
        long jR9 = (i14 & 1024) != 0 ? o6.r(d0.r0.f268731a.E(), c0Var, 6) : j19;
        if ((i14 & 2048) != 0) {
            d0.r0 r0Var2 = d0.r0.f268731a;
            jW2 = androidx.compose.ui.graphics.q0.w(o6.r(r0Var2.J(), c0Var, 6), r0Var2.L(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW2 = j20;
        }
        long jR10 = (i14 & 4096) != 0 ? o6.r(d0.r0.f268731a.S(), c0Var, 6) : j21;
        long jR11 = (i14 & 8192) != 0 ? o6.r(d0.r0.f268731a.e0(), c0Var, 6) : j22;
        long jR12 = (i14 & 16384) != 0 ? o6.r(d0.r0.f268731a.k0(), c0Var, 6) : j23;
        if ((32768 & i14) != 0) {
            d0.r0 r0Var3 = d0.r0.f268731a;
            jW3 = androidx.compose.ui.graphics.q0.w(o6.r(r0Var3.O(), c0Var, 6), r0Var3.P(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW3 = j24;
        }
        long jR13 = (i14 & 65536) != 0 ? o6.r(d0.r0.f268731a.a0(), c0Var, 6) : j25;
        long jR14 = (i14 & 131072) != 0 ? o6.r(d0.r0.f268731a.f0(), c0Var, 6) : j26;
        long jR15 = (i14 & 262144) != 0 ? o6.r(d0.r0.f268731a.m0(), c0Var, 6) : j27;
        if ((i14 & 524288) != 0) {
            d0.r0 r0Var4 = d0.r0.f268731a;
            jW4 = androidx.compose.ui.graphics.q0.w(o6.r(r0Var4.Q(), c0Var, 6), r0Var4.R(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW4 = j28;
        }
        long jR16 = (i14 & 1048576) != 0 ? o6.r(d0.r0.f268731a.b0(), c0Var, 6) : j29;
        long jR17 = (i14 & 2097152) != 0 ? o6.r(d0.r0.f268731a.q(), c0Var, 6) : j30;
        long jR18 = (i14 & 4194304) != 0 ? o6.r(d0.r0.f268731a.x(), c0Var, 6) : j31;
        long jR19 = (i14 & 8388608) != 0 ? o6.r(d0.r0.f268731a.c(), c0Var, 6) : j32;
        long jR20 = (i14 & 16777216) != 0 ? o6.r(d0.r0.f268731a.n(), c0Var, 6) : j33;
        long jR21 = (i14 & com.google.api.client.googleapis.media.a.f115410j) != 0 ? o6.r(d0.r0.f268731a.z(), c0Var, 6) : j34;
        long jR22 = (i14 & 67108864) != 0 ? o6.r(d0.r0.f268731a.z(), c0Var, 6) : j35;
        if ((i14 & androidx.media3.common.j.W0) != 0) {
            d0.r0 r0Var5 = d0.r0.f268731a;
            jW5 = androidx.compose.ui.graphics.q0.w(o6.r(r0Var5.e(), c0Var, 6), r0Var5.f(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW5 = j36;
        }
        long jR23 = (i14 & 268435456) != 0 ? o6.r(d0.r0.f268731a.z(), c0Var, 6) : j37;
        long jR24 = (i14 & 536870912) != 0 ? o6.r(d0.r0.f268731a.z(), c0Var, 6) : j38;
        long jR25 = (i14 & 1073741824) != 0 ? o6.r(d0.r0.f268731a.z(), c0Var, 6) : j39;
        if ((i15 & 1) != 0) {
            d0.r0 r0Var6 = d0.r0.f268731a;
            jW6 = androidx.compose.ui.graphics.q0.w(o6.r(r0Var6.e(), c0Var, 6), r0Var6.f(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW6 = j40;
        }
        long jR26 = (i15 & 2) != 0 ? o6.r(d0.r0.f268731a.z(), c0Var, 6) : j41;
        long jR27 = (i15 & 4) != 0 ? o6.r(d0.r0.f268731a.z(), c0Var, 6) : j42;
        long jR28 = (i15 & 8) != 0 ? o6.r(d0.r0.f268731a.z(), c0Var, 6) : j43;
        if ((i15 & 16) != 0) {
            d0.r0 r0Var7 = d0.r0.f268731a;
            jW7 = androidx.compose.ui.graphics.q0.w(o6.r(r0Var7.e(), c0Var, 6), r0Var7.f(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW7 = j44;
        }
        long jR29 = (i15 & 32) != 0 ? o6.r(d0.r0.f268731a.z(), c0Var, 6) : j45;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1357676928, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:921)");
        }
        int i16 = i10 << 6;
        int i17 = (65534 & i10) | ((i10 << 3) & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192);
        int i18 = i11 << 6;
        int i19 = ((i10 >> 24) & okhttp3.internal.ws.g.f334652s) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i12 << 6;
        int i21 = i13 << 6;
        j40 j40VarK = k(jR, jR2, jW, jR3, jR4, jR4, jR4, jR5, jR6, jR7, w4Var2, jR8, jR9, jW2, jR10, jR11, jR12, jW3, jR13, jR14, jR15, jW4, jR16, jR17, jR18, jR19, jR20, jR21, jR22, jW5, jR23, jR24, jR25, jW6, jR26, jR27, jR28, jW7, jR29, c0Var, i17, i19, ((i11 >> 24) & okhttp3.internal.ws.g.f334652s) | (i20 & 896) | (i20 & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), (i21 & 896) | ((i12 >> 24) & okhttp3.internal.ws.g.f334652s) | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), 0, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j40VarK;
    }
}
