package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,482:1\n1282#2,6:483\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n*L\n227#1:483,6\n*E\n"})
public final class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x3 f25473a = new x3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f25474b = 0;

    private x3() {
    }

    @androidx.compose.runtime.o
    @NotNull
    public final w3 a(long j10, long j11, long j12, long j13, long j14, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long j15;
        long jW;
        long jL = (i11 & 1) != 0 ? x9.f25488a.a(c0Var, 6).l() : j10;
        long jW2 = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jN = (i11 & 4) != 0 ? x9.f25488a.a(c0Var, 6).n() : j12;
        long jW3 = (i11 & 8) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if ((i11 & 16) != 0) {
            long j16 = jL;
            jW = androidx.compose.ui.graphics.q0.w(j16, u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j15 = j16;
        } else {
            j15 = jL;
            jW = j14;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(469524104, i10, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:225)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && c0Var.L(j15)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.L(jW2)) || (i10 & 48) == 32) | ((((i10 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.L(jN)) || (i10 & androidx.media3.exoplayer.a5.S0) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && c0Var.L(jW3)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && c0Var.L(jW)) || (i10 & 24576) == 16384);
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            long j17 = j15;
            long j18 = jW3;
            a5 a5Var = new a5(jN, androidx.compose.ui.graphics.q0.w(jN, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j17, androidx.compose.ui.graphics.q0.w(j17, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j18, androidx.compose.ui.graphics.q0.w(jW3, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), jW, j17, jW2, jW3, jW, null);
            c0Var.Y(a5Var);
            objI0 = a5Var;
        }
        a5 a5Var2 = (a5) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a5Var2;
    }
}
