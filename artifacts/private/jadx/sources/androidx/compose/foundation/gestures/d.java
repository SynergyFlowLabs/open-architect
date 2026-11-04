package androidx.compose.foundation.gestures;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1751:1\n75#2:1752\n1282#3,6:1753\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableDefaults\n*L\n1520#1:1752\n1521#1:1753,6\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f14520a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.o<Float> f14521b = androidx.compose.animation.core.p.t(0, 0, null, 7, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Function1<Float, Float> f14522c = new Function1() { // from class: androidx.compose.foundation.gestures.c
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Float.valueOf(d.b(((Float) obj).floatValue()));
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.g0<Float> f14523d = androidx.compose.animation.core.i0.d(0.0f, 0.0f, 3, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f14524e = 8;

    static {
        boolean z10 = false;
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float f10) {
        return f10 / 2.0f;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final <T> e5 c(@NotNull b0<T> b0Var, @Nullable Function1<? super Float, Float> function1, @Nullable androidx.compose.animation.core.o<Float> oVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            function1 = f14522c;
        }
        if ((i11 & 4) != 0) {
            oVar = f14521b;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-952742024, i10, -1, "androidx.compose.foundation.gestures.AnchoredDraggableDefaults.flingBehavior (AnchoredDraggable.kt:1518)");
        }
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
        boolean zD = ((((i10 & 14) ^ 6) > 4 && c0Var.D(b0Var)) || (i10 & 6) == 4) | c0Var.D(dVar) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(function1)) || (i10 & 48) == 32) | c0Var.D(oVar);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = k.F(b0Var, dVar, function1, oVar);
            c0Var.Y(objI0);
        }
        e5 e5Var = (e5) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return e5Var;
    }

    @NotNull
    public final androidx.compose.animation.core.g0<Float> d() {
        return f14523d;
    }

    @NotNull
    public final Function1<Float, Float> e() {
        return f14522c;
    }

    @NotNull
    public final androidx.compose.animation.core.o<Float> f() {
        return f14521b;
    }
}
