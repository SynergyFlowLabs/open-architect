package androidx.lifecycle.compose;

import androidx.compose.runtime.m0;
import androidx.lifecycle.o0;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nDropUnlessLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropUnlessLifecycle.kt\nandroidx/lifecycle/compose/DropUnlessLifecycleKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,101:1\n75#2:102\n75#2:109\n75#2:110\n1282#3,6:103\n*S KotlinDebug\n*F\n+ 1 DropUnlessLifecycle.kt\nandroidx/lifecycle/compose/DropUnlessLifecycleKt\n*L\n46#1:102\n76#1:109\n98#1:110\n54#1:103,6\n*E\n"})
public final class b {
    @androidx.compose.runtime.o
    @androidx.annotation.j
    @NotNull
    public static final Function0<Unit> b(@Nullable o0 o0Var, @NotNull Function0<Unit> function0, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            o0Var = (o0) c0Var.W(d0.c());
        }
        o0 o0Var2 = o0Var;
        if (m0.l0()) {
            m0.A0(1331131589, i10, -1, "androidx.lifecycle.compose.dropUnlessResumed (DropUnlessLifecycle.kt:99)");
        }
        int i12 = i10 << 3;
        Function0<Unit> function0D = d(androidx.lifecycle.c0.b.RESUMED, o0Var2, function0, c0Var, (i12 & com.planner5d.library.engine.input.f.b.B) | 6 | (i12 & 896), 0);
        if (m0.l0()) {
            m0.z0();
        }
        return function0D;
    }

    @androidx.compose.runtime.o
    @androidx.annotation.j
    @NotNull
    public static final Function0<Unit> c(@Nullable o0 o0Var, @NotNull Function0<Unit> function0, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            o0Var = (o0) c0Var.W(d0.c());
        }
        o0 o0Var2 = o0Var;
        if (m0.l0()) {
            m0.A0(1207869935, i10, -1, "androidx.lifecycle.compose.dropUnlessStarted (DropUnlessLifecycle.kt:77)");
        }
        int i12 = i10 << 3;
        Function0<Unit> function0D = d(androidx.lifecycle.c0.b.STARTED, o0Var2, function0, c0Var, (i12 & com.planner5d.library.engine.input.f.b.B) | 6 | (i12 & 896), 0);
        if (m0.l0()) {
            m0.z0();
        }
        return function0D;
    }

    @androidx.compose.runtime.o
    @androidx.annotation.j
    private static final Function0<Unit> d(final androidx.lifecycle.c0.b bVar, final o0 o0Var, final Function0<Unit> function0, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            o0Var = (o0) c0Var.W(d0.c());
        }
        if (m0.l0()) {
            m0.A0(-2057956404, i10, -1, "androidx.lifecycle.compose.dropUnlessStateIsAtLeast (DropUnlessLifecycle.kt:47)");
        }
        if (bVar == androidx.lifecycle.c0.b.DESTROYED) {
            throw new IllegalArgumentException("Target state is not allowed to be `Lifecycle.State.DESTROYED` because Compose disposes of the composition before `Lifecycle.Event.ON_DESTROY` observers are invoked.");
        }
        boolean zK0 = c0Var.k0(o0Var) | ((((i10 & 14) ^ 6) > 4 && c0Var.K(bVar.ordinal())) || (i10 & 6) == 4) | ((((i10 & 896) ^ a5.S0) > 256 && c0Var.D(function0)) || (i10 & a5.S0) == 256);
        Object objI0 = c0Var.i0();
        if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: androidx.lifecycle.compose.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b.e(o0Var, bVar, function0);
                }
            };
            c0Var.Y(objI0);
        }
        Function0<Unit> function1 = (Function0) objI0;
        if (m0.l0()) {
            m0.z0();
        }
        return function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(o0 o0Var, androidx.lifecycle.c0.b bVar, Function0 function0) {
        if (o0Var.getLifecycle().d().n(bVar)) {
            function0.invoke();
        }
        return Unit.f312394a;
    }
}
