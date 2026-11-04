package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@u7
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,728:1\n113#2:729\n113#2:730\n113#2:731\n113#2:732\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n*L\n359#1:729\n555#1:730\n558#1:731\n561#1:732\n*E\n"})
public final class f4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f22714c = 0.54f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f22715d = 0.87f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f22716e = 0.12f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f22720i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f4 f22712a = new f4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f22713b = androidx.compose.ui.unit.h.r(32);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f22717f = androidx.compose.ui.unit.h.r(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f22718g = androidx.compose.ui.unit.h.r(20);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f22719h = androidx.compose.ui.unit.h.r(18);

    private f4() {
    }

    @androidx.compose.runtime.o
    @NotNull
    public final e4 a(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long j16;
        long j17;
        long j18;
        long jW;
        long jW2;
        if ((i11 & 1) != 0) {
            x9 x9Var = x9.f25488a;
            j16 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(x9Var.a(c0Var, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), x9Var.a(c0Var, 6).n());
        } else {
            j16 = j10;
        }
        long jW3 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jW4 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.w(jW3, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if ((i11 & 8) != 0) {
            x9 x9Var2 = x9.f25488a;
            j17 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(x9Var2.a(c0Var, 6).i(), u4.f25148a.b(c0Var, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), x9Var2.a(c0Var, 6).n());
        } else {
            j17 = j13;
        }
        if ((i11 & 16) != 0) {
            long j19 = jW3;
            jW = androidx.compose.ui.graphics.q0.w(j19, u4.f25148a.b(c0Var, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
            j18 = j19;
        } else {
            j18 = jW3;
            jW = j14;
        }
        if ((i11 & 32) != 0) {
            jW2 = androidx.compose.ui.graphics.q0.w(jW4, u4.f25148a.b(c0Var, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW2 = j15;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1838505436, i10, -1, "androidx.compose.material.ChipDefaults.chipColors (Chip.kt:389)");
        }
        long j20 = j18;
        b5 b5Var = new b5(j16, j20, jW4, j17, jW, jW2, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return b5Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final qe b(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long j19;
        long j20;
        long j21;
        long jW;
        long j22;
        long jW2;
        if ((i11 & 1) != 0) {
            x9 x9Var = x9.f25488a;
            j19 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(x9Var.a(c0Var, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), x9Var.a(c0Var, 6).n());
        } else {
            j19 = j10;
        }
        long jW3 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jW4 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.w(jW3, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if ((i11 & 8) != 0) {
            x9 x9Var2 = x9.f25488a;
            j20 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(x9Var2.a(c0Var, 6).i(), u4.f25148a.b(c0Var, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), x9Var2.a(c0Var, 6).n());
        } else {
            j20 = j13;
        }
        if ((i11 & 16) != 0) {
            long j23 = jW3;
            jW = androidx.compose.ui.graphics.q0.w(j23, u4.f25148a.b(c0Var, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
            j21 = j23;
        } else {
            j21 = jW3;
            jW = j14;
        }
        if ((i11 & 32) != 0) {
            long j24 = jW4;
            jW2 = androidx.compose.ui.graphics.q0.w(j24, u4.f25148a.b(c0Var, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
            j22 = j24;
        } else {
            j22 = jW4;
            jW2 = j15;
        }
        long j25 = (i11 & 64) != 0 ? androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), j19) : j16;
        long j26 = (i11 & 128) != 0 ? androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j21) : j17;
        long j27 = (i11 & 256) != 0 ? androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j22) : j18;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(830140629, i10, -1, "androidx.compose.material.ChipDefaults.filterChipColors (Chip.kt:474)");
        }
        long j28 = j20;
        long j29 = j21;
        long j30 = j22;
        long j31 = j19;
        g5 g5Var = new g5(j31, j29, j30, j28, jW, jW2, j25, j26, j27, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return g5Var;
    }

    public final float c() {
        return f22718g;
    }

    public final float d() {
        return f22713b;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getOutlinedBorder")
    @NotNull
    public final androidx.compose.foundation.a1 e(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1650225597, i10, -1, "androidx.compose.material.ChipDefaults.<get-outlinedBorder> (Chip.kt:539)");
        }
        androidx.compose.foundation.a1 a1VarA = androidx.compose.foundation.b1.a(f22717f, androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a1VarA;
    }

    public final float f() {
        return f22717f;
    }

    public final float g() {
        return f22719h;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final e4 h(long j10, long j11, long j12, long j13, long j14, long j15, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jW;
        long jW2;
        long jN = (i11 & 1) != 0 ? x9.f25488a.a(c0Var, 6).n() : j10;
        long jW3 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jW4 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.w(jW3, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long j16 = (i11 & 8) != 0 ? jN : j13;
        if ((i11 & 16) != 0) {
            jW = androidx.compose.ui.graphics.q0.w(jW3, u4.f25148a.b(c0Var, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW = j14;
        }
        if ((i11 & 32) != 0) {
            jW2 = androidx.compose.ui.graphics.q0.w(jW4, u4.f25148a.b(c0Var, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jW2 = j15;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1763922662, i10, -1, "androidx.compose.material.ChipDefaults.outlinedChipColors (Chip.kt:422)");
        }
        e4 e4VarA = a(jN, jW3, jW4, j16, jW, jW2, c0Var, i10 & 4194302, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return e4VarA;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final qe i(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long j19;
        long jW;
        long j20;
        long jW2;
        long jN = (i11 & 1) != 0 ? x9.f25488a.a(c0Var, 6).n() : j10;
        long jW3 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jW4 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.w(jW3, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long j21 = (i11 & 8) != 0 ? jN : j13;
        if ((i11 & 16) != 0) {
            long j22 = jW3;
            jW = androidx.compose.ui.graphics.q0.w(j22, u4.f25148a.b(c0Var, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
            j19 = j22;
        } else {
            j19 = jW3;
            jW = j14;
        }
        if ((i11 & 32) != 0) {
            long j23 = jW4;
            jW2 = androidx.compose.ui.graphics.q0.w(j23, u4.f25148a.b(c0Var, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
            j20 = j23;
        } else {
            j20 = jW4;
            jW2 = j15;
        }
        long j24 = (i11 & 64) != 0 ? androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jN) : j16;
        long j25 = (i11 & 128) != 0 ? androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j19) : j17;
        long j26 = (i11 & 256) != 0 ? androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j20) : j18;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(346878099, i10, -1, "androidx.compose.material.ChipDefaults.outlinedFilterChipColors (Chip.kt:523)");
        }
        long j27 = j21;
        long j28 = j19;
        long j29 = j20;
        long j30 = jN;
        g5 g5Var = new g5(j30, j28, j29, j27, jW, jW2, j24, j25, j26, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return g5Var;
    }
}
