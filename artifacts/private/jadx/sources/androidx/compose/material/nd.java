package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,223:1\n1282#2,6:224\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n*L\n163#1:224,6\n*E\n"})
public final class nd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final nd f23956a = new nd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f23957b = 0;

    private nd() {
    }

    @androidx.compose.runtime.o
    @NotNull
    public final md a(long j10, long j11, long j12, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        long jL = (i11 & 1) != 0 ? x9.f25488a.a(c0Var, 6).l() : j10;
        long jW = (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jW2 = (i11 & 4) != 0 ? androidx.compose.ui.graphics.q0.w(x9.f25488a.a(c0Var, 6).i(), u4.f25148a.b(c0Var, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1370708026, i10, -1, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:161)");
        }
        boolean z10 = (((6 ^ (i10 & 14)) > 4 && c0Var.L(jL)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.L(jW)) || (i10 & 48) == 32) | ((((i10 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.L(jW2)) || (i10 & androidx.media3.exoplayer.a5.S0) == 256);
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            f5 f5Var = new f5(jL, jW, jW2, null);
            c0Var.Y(f5Var);
            objI0 = f5Var;
        }
        f5 f5Var2 = (f5) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return f5Var2;
    }
}
