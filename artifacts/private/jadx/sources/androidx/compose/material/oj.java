package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,964:1\n85#2:965\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n*L\n951#1:965\n*E\n"})
public final class oj {
    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    public static final androidx.compose.runtime.n7<androidx.compose.foundation.a1> b(boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, gj gjVar, float f10, float f11, androidx.compose.runtime.c0 c0Var, int i10) {
        androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7VarW;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1097899920, i10, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:949)");
        }
        androidx.compose.runtime.n7<Boolean> n7VarA = androidx.compose.foundation.interaction.d.a(hVar, c0Var, (i10 >> 6) & 14);
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarE = gjVar.e(z10, z11, hVar, c0Var, i10 & 8190);
        float f12 = c(n7VarA) ? f10 : f11;
        if (z10) {
            c0Var.E(1361102414);
            n7VarW = androidx.compose.animation.core.f.d(f12, androidx.compose.animation.core.p.t(150, 0, null, 6, null), null, null, c0Var, 48, 12);
            c0Var.A();
        } else {
            c0Var.E(1361206636);
            n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.unit.h.o(f11), c0Var, (i10 >> 15) & 14);
            c0Var.A();
        }
        androidx.compose.runtime.n7<androidx.compose.foundation.a1> n7VarW2 = androidx.compose.runtime.w6.w(new androidx.compose.foundation.a1(n7VarW.getValue().O(), new androidx.compose.ui.graphics.s3(n7VarE.getValue().M(), null), null), c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarW2;
    }

    private static final boolean c(androidx.compose.runtime.n7<Boolean> n7Var) {
        return n7Var.getValue().booleanValue();
    }
}
