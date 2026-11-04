package androidx.compose.animation;

import androidx.compose.animation.core.q2;
import androidx.compose.animation.core.z3;
import androidx.compose.runtime.n7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSingleValueAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,111:1\n1282#2,6:112\n*S KotlinDebug\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n*L\n64#1:112,6\n*E\n"})
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final q2<androidx.compose.ui.graphics.q0> f13487a = androidx.compose.animation.core.p.r(0.0f, 0.0f, null, 7, null);

    @e0.c
    @NotNull
    public static final androidx.compose.animation.core.c<androidx.compose.ui.graphics.q0, androidx.compose.animation.core.v> a(long j10) {
        return new androidx.compose.animation.core.c<>(androidx.compose.ui.graphics.q0.n(j10), v.a(androidx.compose.ui.graphics.q0.f38131b).invoke(androidx.compose.ui.graphics.q0.E(j10)), null, null, 12, null);
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ n7 b(long j10, androidx.compose.animation.core.o oVar, Function1 function1, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = f13487a;
        }
        androidx.compose.animation.core.o oVar2 = oVar;
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1942442407, i10, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:82)");
        }
        n7<androidx.compose.ui.graphics.q0> n7VarC = c(j10, oVar2, null, function2, c0Var, (i10 & okhttp3.internal.ws.g.f334652s) | ((i10 << 3) & 7168), 4);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final n7<androidx.compose.ui.graphics.q0> c(long j10, @Nullable androidx.compose.animation.core.o<androidx.compose.ui.graphics.q0> oVar, @Nullable String str, @Nullable Function1<? super androidx.compose.ui.graphics.q0, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = f13487a;
        }
        androidx.compose.animation.core.o<androidx.compose.ui.graphics.q0> oVar2 = oVar;
        if ((i11 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        Function1<? super androidx.compose.ui.graphics.q0, Unit> function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-451899108, i10, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        boolean zD = c0Var.D(androidx.compose.ui.graphics.q0.E(j10));
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = (z3) v.a(androidx.compose.ui.graphics.q0.f38131b).invoke(androidx.compose.ui.graphics.q0.E(j10));
            c0Var.Y(objI0);
        }
        int i12 = i10 << 6;
        n7<androidx.compose.ui.graphics.q0> n7VarT = androidx.compose.animation.core.f.t(androidx.compose.ui.graphics.q0.n(j10), (z3) objI0, oVar2, null, str2, function2, c0Var, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarT;
    }
}
