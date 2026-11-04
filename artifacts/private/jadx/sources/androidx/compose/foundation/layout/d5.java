package androidx.compose.foundation.layout;

import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,477:1\n113#2:478\n113#2:479\n113#2:480\n113#2:481\n113#2:482\n113#2:483\n113#2:484\n113#2:485\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n53#1:478\n83#1:479\n162#1:480\n279#1:481\n289#1:482\n290#1:483\n291#1:484\n292#1:485\n*E\n"})
public final class d5 {
    @androidx.compose.runtime.k7
    @NotNull
    public static final g5 f(float f10) {
        return new i5(f10, f10, f10, f10, null);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final g5 g(float f10, float f11) {
        return new i5(f10, f11, f10, f11, null);
    }

    public static /* synthetic */ g5 h(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.r(0);
        }
        return g(f10, f11);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final g5 i(float f10, float f11, float f12, float f13) {
        return new i5(f10, f11, f12, f13, null);
    }

    public static /* synthetic */ g5 j(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 4) != 0) {
            f12 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 8) != 0) {
            f13 = androidx.compose.ui.unit.h.r(0);
        }
        return i(f10, f11, f12, f13);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 k(@NotNull androidx.compose.ui.a0 a0Var, final float f10, final float f11, final float f12, final float f13) {
        return a0Var.B2(new PaddingElement(f10, f11, f12, f13, false, new Function1() { // from class: androidx.compose.foundation.layout.a5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d5.m(f10, f11, f12, f13, (androidx.compose.ui.platform.t2) obj);
            }
        }, null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 l(androidx.compose.ui.a0 a0Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 4) != 0) {
            f12 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 8) != 0) {
            f13 = androidx.compose.ui.unit.h.r(0);
        }
        return k(a0Var, f10, f11, f12, f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(float f10, float f11, float f12, float f13, androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("absolutePadding");
        t2Var.b().c("left", androidx.compose.ui.unit.h.o(f10));
        t2Var.b().c("top", androidx.compose.ui.unit.h.o(f11));
        t2Var.b().c("right", androidx.compose.ui.unit.h.o(f12));
        t2Var.b().c(VerticalAlignment.BOTTOM, androidx.compose.ui.unit.h.o(f13));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.k7
    public static final float n(@NotNull g5 g5Var, @NotNull androidx.compose.ui.unit.w wVar) {
        return wVar == androidx.compose.ui.unit.w.Ltr ? g5Var.c(wVar) : g5Var.b(wVar);
    }

    @androidx.compose.runtime.k7
    public static final float o(@NotNull g5 g5Var, @NotNull androidx.compose.ui.unit.w wVar) {
        return wVar == androidx.compose.ui.unit.w.Ltr ? g5Var.b(wVar) : g5Var.c(wVar);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 p(@NotNull androidx.compose.ui.a0 a0Var, @NotNull final g5 g5Var) {
        return a0Var.B2(new PaddingValuesElement(g5Var, new Function1() { // from class: androidx.compose.foundation.layout.z4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d5.q(g5Var, (androidx.compose.ui.platform.t2) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(g5 g5Var, androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("padding");
        t2Var.b().c("paddingValues", g5Var);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 r(@NotNull androidx.compose.ui.a0 a0Var, final float f10) {
        return a0Var.B2(new PaddingElement(f10, f10, f10, f10, true, new Function1() { // from class: androidx.compose.foundation.layout.c5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d5.w(f10, (androidx.compose.ui.platform.t2) obj);
            }
        }, null));
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 s(@NotNull androidx.compose.ui.a0 a0Var, final float f10, final float f11) {
        return a0Var.B2(new PaddingElement(f10, f11, f10, f11, true, new Function1() { // from class: androidx.compose.foundation.layout.b5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d5.x(f10, f11, (androidx.compose.ui.platform.t2) obj);
            }
        }, null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 t(androidx.compose.ui.a0 a0Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.r(0);
        }
        return s(a0Var, f10, f11);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 u(@NotNull androidx.compose.ui.a0 a0Var, final float f10, final float f11, final float f12, final float f13) {
        return a0Var.B2(new PaddingElement(f10, f11, f12, f13, true, new Function1() { // from class: androidx.compose.foundation.layout.y4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d5.y(f10, f11, f12, f13, (androidx.compose.ui.platform.t2) obj);
            }
        }, null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 v(androidx.compose.ui.a0 a0Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 4) != 0) {
            f12 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 8) != 0) {
            f13 = androidx.compose.ui.unit.h.r(0);
        }
        return u(a0Var, f10, f11, f12, f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(float f10, androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("padding");
        t2Var.e(androidx.compose.ui.unit.h.o(f10));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(float f10, float f11, androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("padding");
        t2Var.b().c("horizontal", androidx.compose.ui.unit.h.o(f10));
        t2Var.b().c("vertical", androidx.compose.ui.unit.h.o(f11));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(float f10, float f11, float f12, float f13, androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("padding");
        t2Var.b().c("start", androidx.compose.ui.unit.h.o(f10));
        t2Var.b().c("top", androidx.compose.ui.unit.h.o(f11));
        t2Var.b().c("end", androidx.compose.ui.unit.h.o(f12));
        t2Var.b().c(VerticalAlignment.BOTTOM, androidx.compose.ui.unit.h.o(f13));
        return Unit.f312394a;
    }
}
