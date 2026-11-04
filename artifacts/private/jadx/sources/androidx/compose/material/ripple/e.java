package androidx.compose.material.ripple;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.ui.graphics.q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@kotlin.l(message = "Replaced by the new RippleNode implementation")
@SourceDebugExtension({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRipple\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,173:1\n1282#2,6:174\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRipple\n*L\n58#1:174,6\n*E\n"})
public final class e extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24747e = 0;

    public /* synthetic */ e(boolean z10, float f10, n7 n7Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, n7Var);
    }

    @Override // androidx.compose.material.ripple.k
    @androidx.compose.runtime.o
    @NotNull
    public u c(@NotNull androidx.compose.foundation.interaction.h hVar, boolean z10, float f10, @NotNull n7<q0> n7Var, @NotNull n7<l> n7Var2, @Nullable c0 c0Var, int i10) {
        c0Var.E(-1768051227);
        if (m0.l0()) {
            m0.A0(-1768051227, i10, -1, "androidx.compose.material.ripple.CommonRipple.rememberUpdatedRippleInstance (CommonRipple.kt:56)");
        }
        boolean z11 = ((((i10 & 14) ^ 6) > 4 && c0Var.D(hVar)) || (i10 & 6) == 4) | ((((458752 & i10) ^ androidx.profileinstaller.n.c.f73814m) > 131072 && c0Var.D(this)) || (i10 & androidx.profileinstaller.n.c.f73814m) == 131072);
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == c0.f35327a.a()) {
            f fVar = new f(z10, f10, n7Var, n7Var2, null);
            c0Var.Y(fVar);
            objI0 = fVar;
        }
        f fVar2 = (f) objI0;
        if (m0.l0()) {
            m0.z0();
        }
        c0Var.A();
        return fVar2;
    }

    private e(boolean z10, float f10, n7<q0> n7Var) {
        super(z10, f10, n7Var, null);
    }
}
