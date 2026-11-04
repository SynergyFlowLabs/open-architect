package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,273:1\n113#2:274\n113#2:275\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n*L\n50#1:274\n78#1:275\n*E\n"})
public final class s4 {
    @NotNull
    public static final androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @NotNull final Function1<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> function1) {
        return a0Var.B2(new OffsetPxElement(function1, false, new Function1() { // from class: androidx.compose.foundation.layout.p4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s4.f(function1, (androidx.compose.ui.platform.t2) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function1 function1, androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("absoluteOffset");
        t2Var.b().c(androidx.constraintlayout.core.motion.utils.v.c.R, function1);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 g(@NotNull androidx.compose.ui.a0 a0Var, final float f10, final float f11) {
        return a0Var.B2(new OffsetElement(f10, f11, false, new Function1() { // from class: androidx.compose.foundation.layout.q4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s4.i(f10, f11, (androidx.compose.ui.platform.t2) obj);
            }
        }, null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 h(androidx.compose.ui.a0 a0Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.r(0);
        }
        return g(a0Var, f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(float f10, float f11, androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("absoluteOffset");
        t2Var.b().c("x", androidx.compose.ui.unit.h.o(f10));
        t2Var.b().c("y", androidx.compose.ui.unit.h.o(f11));
        return Unit.f312394a;
    }

    @NotNull
    public static final androidx.compose.ui.a0 j(@NotNull androidx.compose.ui.a0 a0Var, @NotNull final Function1<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> function1) {
        return a0Var.B2(new OffsetPxElement(function1, true, new Function1() { // from class: androidx.compose.foundation.layout.o4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s4.k(function1, (androidx.compose.ui.platform.t2) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function1 function1, androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d(androidx.constraintlayout.core.motion.utils.v.c.R);
        t2Var.b().c(androidx.constraintlayout.core.motion.utils.v.c.R, function1);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 l(@NotNull androidx.compose.ui.a0 a0Var, final float f10, final float f11) {
        return a0Var.B2(new OffsetElement(f10, f11, true, new Function1() { // from class: androidx.compose.foundation.layout.r4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s4.n(f10, f11, (androidx.compose.ui.platform.t2) obj);
            }
        }, null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 m(androidx.compose.ui.a0 a0Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.r(0);
        }
        return l(a0Var, f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(float f10, float f11, androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d(androidx.constraintlayout.core.motion.utils.v.c.R);
        t2Var.b().c("x", androidx.compose.ui.unit.h.o(f10));
        t2Var.b().c("y", androidx.compose.ui.unit.h.o(f11));
        return Unit.f312394a;
    }
}
