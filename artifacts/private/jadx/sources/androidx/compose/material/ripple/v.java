package androidx.compose.material.ripple;

import androidx.compose.animation.core.u0;
import androidx.compose.animation.core.y3;
import androidx.compose.foundation.t2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.x0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,530:1\n1282#2,6:531\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n*L\n147#1:531,6\n*E\n"})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final y3<Float> f24838a = new y3<>(15, 0, u0.e(), 2, null);

    @NotNull
    public static final androidx.compose.ui.node.j c(@NotNull androidx.compose.foundation.interaction.h hVar, boolean z10, float f10, @NotNull x0 x0Var, @NotNull Function0<l> function0) {
        return z.d(hVar, z10, f10, x0Var, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.o<Float> d(androidx.compose.foundation.interaction.g gVar) {
        if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
            return f24838a;
        }
        if (!(gVar instanceof androidx.compose.foundation.interaction.c.a) && !(gVar instanceof androidx.compose.foundation.interaction.a.b)) {
            return f24838a;
        }
        return new y3(45, 0, u0.e(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.o<Float> e(androidx.compose.foundation.interaction.g gVar) {
        if (!(gVar instanceof androidx.compose.foundation.interaction.e.a) && !(gVar instanceof androidx.compose.foundation.interaction.c.a) && (gVar instanceof androidx.compose.foundation.interaction.a.b)) {
            return new y3(150, 0, u0.e(), 2, null);
        }
        return f24838a;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.ERROR, message = "rememberRipple has been deprecated - it returns an old Indication implementation that is not compatible with the new Indication APIs that provide notable performance improvements. Instead, use the new ripple APIs provided by design system libraries, such as material and material3. If you are implementing your own design system library, use createRippleNode to create your own custom ripple implementation that queries your own theme values. For a migration guide and background information, please visit developer.android.com")
    @NotNull
    public static final t2 f(boolean z10, float f10, long j10, @Nullable c0 c0Var, int i10, int i11) {
        boolean z11 = true;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i11 & 4) != 0) {
            j10 = q0.f38131b.u();
        }
        if (m0.l0()) {
            m0.A0(1635163520, i10, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:144)");
        }
        n7 n7VarW = w6.w(q0.n(j10), c0Var, (i10 >> 6) & 14);
        boolean z12 = (((i10 & 14) ^ 6) > 4 && c0Var.G(z10)) || (i10 & 6) == 4;
        if ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 || !c0Var.I(f10)) && (i10 & 48) != 32) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object objI0 = c0Var.i0();
        if (z13 || objI0 == c0.f35327a.a()) {
            objI0 = new i(z10, f10, n7VarW, null);
            c0Var.Y(objI0);
        }
        i iVar = (i) objI0;
        if (m0.l0()) {
            m0.z0();
        }
        return iVar;
    }
}
