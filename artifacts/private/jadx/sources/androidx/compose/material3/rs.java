package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,267:1\n1#2:268\n*E\n"})
public final class rs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final rs f32593a = new rs();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f32594b = 0;

    private rs() {
    }

    @androidx.compose.runtime.o
    @NotNull
    public final qs a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1191566130, i10, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:135)");
        }
        qs qsVarC = c(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return qsVarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final qs b(long j10, long j11, long j12, long j13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 2) != 0) {
            j11 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 4) != 0) {
            j12 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if ((i11 & 8) != 0) {
            j13 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-351083046, i10, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:155)");
        }
        long j14 = j11;
        long j15 = j10;
        qs qsVarA = c(pj.f31758a.a(c0Var, 6)).a(j15, j14, j12, j13);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return qsVarA;
    }

    @NotNull
    public final qs c(@NotNull l6 l6Var) {
        qs qsVarO = l6Var.O();
        if (qsVarO != null) {
            return qsVarO;
        }
        d0.d2 d2Var = d0.d2.f267839a;
        qs qsVar = new qs(o6.o(l6Var, d2Var.f()), o6.o(l6Var, d2Var.k()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, d2Var.a()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, d2Var.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.G1(qsVar);
        return qsVar;
    }
}
