package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,130:1\n113#2:131\n113#2:132\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n*L\n62#1:131\n113#1:132\n*E\n"})
public final class u3 {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(@Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, @Nullable androidx.compose.foundation.a1 a1Var, float f10, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        if ((i11 & 2) != 0) {
            q3Var = x9.f25488a.b(c0Var, 6).d();
        }
        androidx.compose.ui.graphics.q3 q3Var2 = q3Var;
        long jN = (i11 & 4) != 0 ? x9.f25488a.a(c0Var, 6).n() : j10;
        long jD = (i11 & 8) != 0 ? n4.d(jN, c0Var, (i10 >> 6) & 14) : j11;
        androidx.compose.foundation.a1 a1Var2 = (i11 & 16) != 0 ? null : a1Var;
        float fR = (i11 & 32) != 0 ? androidx.compose.ui.unit.h.r(1) : f10;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-574573525, i10, -1, "androidx.compose.material.Card (Card.kt:63)");
        }
        ah.e(a0Var, q3Var2, jN, jD, a1Var2, fR, function2, c0Var, i10 & 4194302, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
    }

    @androidx.compose.runtime.o
    @u7
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void b(@NotNull Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, @Nullable androidx.compose.foundation.a1 a1Var, float f10, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        androidx.compose.ui.a0 a0Var2 = (i11 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        androidx.compose.ui.graphics.q3 q3VarD = (i11 & 8) != 0 ? x9.f25488a.b(c0Var, 6).d() : q3Var;
        long jN = (i11 & 16) != 0 ? x9.f25488a.a(c0Var, 6).n() : j10;
        long jD = (i11 & 32) != 0 ? n4.d(jN, c0Var, (i10 >> 12) & 14) : j11;
        androidx.compose.foundation.a1 a1Var2 = (i11 & 64) != 0 ? null : a1Var;
        float fR = (i11 & 128) != 0 ? androidx.compose.ui.unit.h.r(1) : f10;
        androidx.compose.foundation.interaction.j jVar2 = (i11 & 256) == 0 ? jVar : null;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-103820906, i10, -1, "androidx.compose.material.Card (Card.kt:115)");
        }
        float f11 = fR;
        ah.f(function0, a0Var2, z11, q3VarD, jN, jD, a1Var2, f11, jVar2, function2, c0Var, i10 & 2147483646, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
    }
}
