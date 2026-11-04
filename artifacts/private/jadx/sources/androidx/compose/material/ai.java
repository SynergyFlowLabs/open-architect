package androidx.compose.material;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ai f22088a = new ai();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f22089b = 0;

    private ai() {
    }

    @androidx.compose.runtime.o
    @NotNull
    public final zh a(long j10, long j11, float f10, long j12, long j13, float f11, long j14, long j15, long j16, long j17, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12) {
        long j18;
        long j19;
        int i13;
        long j20;
        long j21;
        long jM = (i12 & 1) != 0 ? x9.f25488a.a(c0Var, 6).m() : j10;
        long j22 = (i12 & 2) != 0 ? jM : j11;
        float f12 = (i12 & 4) != 0 ? 0.54f : f10;
        long jN = (i12 & 8) != 0 ? x9.f25488a.a(c0Var, 6).n() : j12;
        long jI = (i12 & 16) != 0 ? x9.f25488a.a(c0Var, 6).i() : j13;
        float f13 = (i12 & 32) != 0 ? 0.38f : f11;
        if ((i12 & 64) != 0) {
            long j23 = jM;
            j18 = j23;
            j19 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(j23, u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null), x9.f25488a.a(c0Var, 6).n());
        } else {
            j18 = jM;
            j19 = j14;
        }
        long j24 = (i12 & 128) != 0 ? androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(j22, u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null), x9.f25488a.a(c0Var, 6).n()) : j15;
        if ((i12 & 256) != 0) {
            i13 = 6;
            j20 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(jN, u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null), x9.f25488a.a(c0Var, 6).n());
        } else {
            i13 = 6;
            j20 = j16;
        }
        if ((i12 & 512) != 0) {
            j21 = androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(jI, u4.f25148a.b(c0Var, i13), 0.0f, 0.0f, 0.0f, 14, null), x9.f25488a.a(c0Var, i13).n());
        } else {
            j21 = j17;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1032127534, i10, i11, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:341)");
        }
        long j25 = j18;
        i5 i5Var = new i5(j25, androidx.compose.ui.graphics.q0.w(j22, f12, 0.0f, 0.0f, 0.0f, 14, null), jN, androidx.compose.ui.graphics.q0.w(jI, f13, 0.0f, 0.0f, 0.0f, 14, null), j19, androidx.compose.ui.graphics.q0.w(j24, f12, 0.0f, 0.0f, 0.0f, 14, null), j20, androidx.compose.ui.graphics.q0.w(j21, f13, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return i5Var;
    }
}
