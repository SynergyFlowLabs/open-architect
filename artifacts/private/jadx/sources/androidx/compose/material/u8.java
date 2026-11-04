package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,398:1\n113#2:399\n113#2:400\n113#2:401\n113#2:402\n113#2:403\n113#2:404\n113#2:405\n113#2:406\n1282#3,6:407\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonDefaults\n*L\n213#1:399\n214#1:400\n219#1:401\n220#1:402\n235#1:403\n236#1:404\n237#1:405\n238#1:406\n240#1:407,6\n*E\n"})
public final class u8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u8 f25154a = new u8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f25155b = 0;

    private u8() {
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use another overload of elevation")
    public final /* synthetic */ v8 a(float f10, float f11, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.r(6);
        }
        float f12 = f10;
        if ((i11 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.r(12);
        }
        float f13 = f11;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-654132828, i10, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:215)");
        }
        float f14 = 8;
        v8 v8VarB = b(f12, f13, androidx.compose.ui.unit.h.r(f14), androidx.compose.ui.unit.h.r(f14), c0Var, (i10 & 14) | 3456 | (i10 & com.planner5d.library.engine.input.f.b.B) | (57344 & (i10 << 6)), 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return v8VarB;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final v8 b(float f10, float f11, float f12, float f13, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        int i12 = 1 << 6;
        if ((i11 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.r(6);
        }
        float f14 = f10;
        if ((i11 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.r(12);
        }
        float f15 = f11;
        if ((i11 & 4) != 0) {
            f12 = androidx.compose.ui.unit.h.r(8);
        }
        float f16 = f12;
        if ((i11 & 8) != 0) {
            f13 = androidx.compose.ui.unit.h.r(8);
        }
        float f17 = f13;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(380403812, i10, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:238)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && c0Var.I(f14)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.I(f15)) || (i10 & 48) == 32) | ((((i10 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.I(f16)) || (i10 & androidx.media3.exoplayer.a5.S0) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && c0Var.I(f17)) || (i10 & 3072) == 2048);
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            d5 d5Var = new d5(f14, f15, f16, f17, null);
            c0Var.Y(d5Var);
            objI0 = d5Var;
        }
        d5 d5Var2 = (d5) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return d5Var2;
    }
}
