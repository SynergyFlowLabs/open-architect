package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nElevationOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/DefaultElevationOverlay\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,101:1\n113#2:102\n*S KotlinDebug\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/DefaultElevationOverlay\n*L\n70#1:102\n*E\n"})
final class c5 implements q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c5 f22302a = new c5();

    private c5() {
    }

    @Override // androidx.compose.material.q7
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    public long a(long j10, float f10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(-1687113661);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1687113661, i10, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:67)");
        }
        l4 l4VarA = x9.f25488a.a(c0Var, 6);
        if (androidx.compose.ui.unit.h.q(f10, androidx.compose.ui.unit.h.r(0)) <= 0 || l4VarA.o()) {
            c0Var.E(-1095440862);
            c0Var.A();
        } else {
            c0Var.E(-1095579370);
            j10 = androidx.compose.ui.graphics.s0.j(t7.f(j10, f10, c0Var, i10 & okhttp3.internal.ws.g.f334652s), j10);
            c0Var.A();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return j10;
    }
}
