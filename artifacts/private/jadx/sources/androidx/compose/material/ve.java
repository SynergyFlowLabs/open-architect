package androidx.compose.material;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ve f25286a = new ve();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f25287b = 0.24f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f25288c = 0.12f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f25289d = 0.32f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f25290e = 0.54f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f25291f = 0.12f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f25292g = 0;

    private ve() {
    }

    @androidx.compose.runtime.o
    @NotNull
    public final ue a(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12) {
        long j20;
        long j21;
        long jW;
        long j22;
        long jW2;
        long j23;
        long jW3;
        long j24;
        long jW4;
        long j25;
        long jW5;
        long j26 = (i12 & 1) != 0 ? x9.f25488a.a(c0Var, 6).j() : j10;
        if ((i12 & 2) != 0) {
            x9 x9Var = x9.f25488a;
            j20 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(x9Var.a(c0Var, 6).i(), u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null), x9Var.a(c0Var, 6).n());
        } else {
            j20 = j11;
        }
        long j27 = (i12 & 4) != 0 ? x9.f25488a.a(c0Var, 6).j() : j12;
        if ((i12 & 8) != 0) {
            long j28 = j27;
            jW = androidx.compose.ui.graphics.q0.w(j28, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
            j21 = j28;
        } else {
            j21 = j27;
            jW = j13;
        }
        long jW6 = (i12 & 16) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        if ((i12 & 32) != 0) {
            long j29 = jW6;
            jW2 = androidx.compose.ui.graphics.q0.w(j29, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            j22 = j29;
        } else {
            j22 = jW6;
            jW2 = j15;
        }
        long jW7 = (i12 & 64) != 0 ? androidx.compose.ui.graphics.q0.w(n4.d(j21, c0Var, (i10 >> 6) & 14), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if ((i12 & 128) != 0) {
            long j30 = j21;
            jW3 = androidx.compose.ui.graphics.q0.w(j30, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
            j23 = j30;
        } else {
            j23 = j21;
            jW3 = j17;
        }
        if ((i12 & 256) != 0) {
            long j31 = jW7;
            jW4 = androidx.compose.ui.graphics.q0.w(j31, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            j24 = j31;
        } else {
            j24 = jW7;
            jW4 = j18;
        }
        if ((i12 & 512) != 0) {
            long j32 = jW2;
            jW5 = androidx.compose.ui.graphics.q0.w(j32, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j32;
        } else {
            j25 = jW2;
            jW5 = j19;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(436017687, i10, i11, "androidx.compose.material.SliderDefaults.colors (Slider.kt:605)");
        }
        h5 h5Var = new h5(j26, j20, j23, jW, j22, j25, j24, jW3, jW4, jW5, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return h5Var;
    }
}
