package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@kotlin.l(message = "Replaced by the new RippleNode implementation")
@SourceDebugExtension({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/PlatformRipple\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,362:1\n75#2:363\n1282#3,6:364\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/PlatformRipple\n*L\n86#1:363\n87#1:364,6\n*E\n"})
public final class i extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24765e = 0;

    public /* synthetic */ i(boolean z10, float f10, n7 n7Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, n7Var);
    }

    @Override // androidx.compose.material.ripple.k
    @androidx.compose.runtime.o
    @NotNull
    public u c(@NotNull androidx.compose.foundation.interaction.h hVar, boolean z10, float f10, @NotNull n7<q0> n7Var, @NotNull n7<l> n7Var2, @Nullable c0 c0Var, int i10) {
        c0Var.E(331259447);
        if (m0.l0()) {
            m0.A0(331259447, i10, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:84)");
        }
        ViewGroup viewGroupE = z.e((View) c0Var.W(AndroidCompositionLocals_androidKt.m()));
        boolean zD = ((((i10 & 14) ^ 6) > 4 && c0Var.D(hVar)) || (i10 & 6) == 4) | ((((458752 & i10) ^ androidx.profileinstaller.n.c.f73814m) > 131072 && c0Var.D(this)) || (i10 & androidx.profileinstaller.n.c.f73814m) == 131072) | c0Var.D(viewGroupE);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == c0.f35327a.a()) {
            Object bVar = new b(z10, f10, n7Var, n7Var2, viewGroupE, null);
            c0Var.Y(bVar);
            objI0 = bVar;
        }
        b bVar2 = (b) objI0;
        if (m0.l0()) {
            m0.z0();
        }
        c0Var.A();
        return bVar2;
    }

    private i(boolean z10, float f10, n7<q0> n7Var) {
        super(z10, f10, n7Var, null);
    }
}
