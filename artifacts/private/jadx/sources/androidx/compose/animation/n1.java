package androidx.compose.animation;

import android.view.ViewConfiguration;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSplineBasedFloatDecayAnimationSpec.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplineBasedFloatDecayAnimationSpec.android.kt\nandroidx/compose/animation/SplineBasedFloatDecayAnimationSpec_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,49:1\n75#2:50\n1282#3,6:51\n*S KotlinDebug\n*F\n+ 1 SplineBasedFloatDecayAnimationSpec.android.kt\nandroidx/compose/animation/SplineBasedFloatDecayAnimationSpec_androidKt\n*L\n44#1:50\n45#1:51,6\n*E\n"})
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f13676a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f13676a;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final <T> androidx.compose.animation.core.g0<T> b(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(904445851, i10, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
        boolean zI = c0Var.I(dVar.getDensity());
        Object objI0 = c0Var.i0();
        if (zI || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = androidx.compose.animation.core.i0.e(new m1(dVar));
            c0Var.Y(objI0);
        }
        androidx.compose.animation.core.g0<T> g0Var = (androidx.compose.animation.core.g0) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return g0Var;
    }
}
