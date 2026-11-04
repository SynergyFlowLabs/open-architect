package androidx.compose.foundation.gestures;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDraggable2D.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,329:1\n1282#2,6:330\n*S KotlinDebug\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DKt\n*L\n109#1:330,6\n*E\n"})
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<n0.g, Unit> f14946a = new Function1() { // from class: androidx.compose.foundation.gestures.n2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return p2.e((n0.g) obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Function1<androidx.compose.ui.unit.c0, Unit> f14947b = new Function1() { // from class: androidx.compose.foundation.gestures.o2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return p2.f((androidx.compose.ui.unit.c0) obj);
        }
    };

    @NotNull
    public static final s2 d(@NotNull Function1<? super n0.g, Unit> function1) {
        return new t0(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(n0.g gVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(androidx.compose.ui.unit.c0 c0Var) {
        return Unit.f312394a;
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 g(@NotNull androidx.compose.ui.a0 a0Var, @NotNull s2 s2Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, boolean z11, @NotNull Function1<? super n0.g, Unit> function1, @NotNull Function1<? super androidx.compose.ui.unit.c0, Unit> function2, boolean z12) {
        return a0Var.B2(new Draggable2DElement(s2Var, z10, jVar, z11, function1, function2, z12));
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final s2 i(@NotNull Function1<? super n0.g, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1150277615, i10, -1, "androidx.compose.foundation.gestures.rememberDraggable2DState (Draggable2D.kt:106)");
        }
        final n7 n7VarW = w6.w(function1, c0Var, i10 & 14);
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = d(new Function1() { // from class: androidx.compose.foundation.gestures.m2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p2.j(n7VarW, (n0.g) obj);
                }
            });
            c0Var.Y(objI0);
        }
        s2 s2Var = (s2) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return s2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(n7 n7Var, n0.g gVar) {
        ((Function1) n7Var.getValue()).invoke(gVar);
        return Unit.f312394a;
    }
}
