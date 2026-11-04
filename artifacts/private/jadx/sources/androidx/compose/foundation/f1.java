package androidx.compose.foundation;

import androidx.compose.foundation.layout.l6;
import androidx.compose.runtime.s5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCanvas.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Canvas.kt\nandroidx/compose/foundation/CanvasKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,62:1\n1282#2,6:63\n*S KotlinDebug\n*F\n+ 1 Canvas.kt\nandroidx/compose/foundation/CanvasKt\n*L\n61#1:63,6\n*E\n"})
public final class f1 {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void d(@NotNull final androidx.compose.ui.a0 a0Var, @NotNull final String str, @NotNull final Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1162737955);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(str) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function1) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1162737955, i11, -1, "androidx.compose.foundation.Canvas (Canvas.kt:60)");
            }
            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.draw.n.b(a0Var, function1);
            boolean z10 = (i11 & com.planner5d.library.engine.input.f.b.B) == 32;
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.foundation.d1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return f1.g(str, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            l6.a(androidx.compose.ui.semantics.t.f(a0VarB, false, (Function1) objI0, 1, null), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.e1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f1.h(a0Var, str, function1, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void e(@NotNull final androidx.compose.ui.a0 a0Var, @NotNull final Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-932836462);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function1) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-932836462, i11, -1, "androidx.compose.foundation.Canvas (Canvas.kt:40)");
            }
            l6.a(androidx.compose.ui.draw.n.b(a0Var, function1), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.c1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f1.f(a0Var, function1, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(androidx.compose.ui.a0 a0Var, Function1 function1, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        e(a0Var, function1, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(androidx.compose.ui.a0 a0Var, String str, Function1 function1, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        d(a0Var, str, function1, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
