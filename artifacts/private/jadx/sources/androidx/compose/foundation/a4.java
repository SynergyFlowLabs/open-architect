package androidx.compose.foundation;

import androidx.compose.runtime.k7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Overscroll.kt\nandroidx/compose/foundation/OverscrollKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,396:1\n75#2:397\n1282#3,6:398\n*S KotlinDebug\n*F\n+ 1 Overscroll.kt\nandroidx/compose/foundation/OverscrollKt\n*L\n345#1:397\n346#1:398,6\n*E\n"})
public final class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<y3> f13910a = androidx.compose.runtime.a1.l(new Function1() { // from class: androidx.compose.foundation.z3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return a4.b((androidx.compose.runtime.v0) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final y3 b(androidx.compose.runtime.v0 v0Var) {
        return t.d(v0Var);
    }

    @NotNull
    public static final androidx.compose.runtime.m4<y3> c() {
        return f13910a;
    }

    @NotNull
    public static final androidx.compose.ui.a0 d(@NotNull androidx.compose.ui.a0 a0Var, @Nullable x3 x3Var) {
        androidx.compose.ui.a0 overscrollModifierElement;
        if (x3Var == null || (overscrollModifierElement = x3Var.y()) == null) {
            overscrollModifierElement = androidx.compose.ui.a0.E;
        }
        if (overscrollModifierElement == androidx.compose.ui.a0.E) {
            overscrollModifierElement = new OverscrollModifierElement(x3Var);
        }
        return a0Var.B2(overscrollModifierElement);
    }

    @androidx.compose.runtime.o
    @Nullable
    public static final x3 e(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(282942128);
        if (androidx.compose.runtime.m0.l0()) {
            int i11 = 0 & (-1);
            androidx.compose.runtime.m0.A0(282942128, i10, -1, "androidx.compose.foundation.rememberOverscrollEffect (Overscroll.kt:343)");
        }
        y3 y3Var = (y3) c0Var.W(f13910a);
        if (y3Var == null) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return null;
        }
        boolean zD = c0Var.D(y3Var);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = y3Var.a();
            c0Var.Y(objI0);
        }
        x3 x3Var = (x3) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return x3Var;
    }

    @k7
    @NotNull
    public static final x3 f(@NotNull x3 x3Var) {
        return new k5(true, false, x3Var);
    }

    @k7
    @NotNull
    public static final x3 g(@NotNull x3 x3Var) {
        return new k5(false, true, x3Var);
    }
}
