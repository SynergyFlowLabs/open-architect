package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRulerAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RulerAlignment.kt\nandroidx/compose/foundation/layout/RulerAlignmentKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,119:1\n101#2,10:120\n101#2,10:130\n101#2,10:140\n101#2,10:150\n101#2,10:160\n101#2,10:170\n101#2,10:180\n101#2,10:190\n*S KotlinDebug\n*F\n+ 1 RulerAlignment.kt\nandroidx/compose/foundation/layout/RulerAlignmentKt\n*L\n41#1:120,10\n42#1:130,10\n43#1:140,10\n45#1:150,10\n57#1:160,10\n58#1:170,10\n59#1:180,10\n61#1:190,10\n*E\n"})
public final class f6 {
    @NotNull
    public static final androidx.compose.ui.a0 g(@NotNull androidx.compose.ui.a0 a0Var, @NotNull final androidx.compose.ui.layout.m2 m2Var) {
        return androidx.compose.ui.layout.q0.a(a0Var, new pj.n() { // from class: androidx.compose.foundation.layout.d6
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return f6.h(m2Var, (androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 h(final androidx.compose.ui.layout.m2 m2Var, androidx.compose.ui.layout.c1 c1Var, final androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
        if (androidx.compose.ui.unit.b.j(bVar.x()) && androidx.compose.ui.unit.b.i(bVar.x())) {
            final int iP = androidx.compose.ui.unit.b.p(bVar.x());
            final int iO = androidx.compose.ui.unit.b.o(bVar.x());
            return androidx.compose.ui.layout.c1.h6(c1Var, iP, iO, null, new Function1() { // from class: androidx.compose.foundation.layout.z5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f6.i(m2Var, iP, iO, z0Var, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(bVar.x());
        final int iH1 = i2VarP0.h1();
        final int iC1 = i2VarP0.c1();
        return androidx.compose.ui.layout.c1.h6(c1Var, iH1, iC1, null, new Function1() { // from class: androidx.compose.foundation.layout.a6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f6.j(m2Var, iH1, iC1, i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(androidx.compose.ui.layout.m2 m2Var, int i10, int i11, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.layout.i2.a aVar) {
        int iL0 = kotlin.math.b.L0(aVar.I(m2Var.y(), 0.0f));
        if (iL0 < 0) {
            iL0 = 0;
        }
        int i12 = iL0 > i10 ? i10 : iL0;
        int iL1 = kotlin.math.b.L0(aVar.I(m2Var.n(), 0.0f));
        if (iL1 < 0) {
            iL1 = 0;
        }
        int i13 = iL1 > i11 ? i11 : iL1;
        int iL2 = kotlin.math.b.L0(aVar.I(m2Var.x(), i10));
        if (iL2 < 0) {
            iL2 = 0;
        }
        if (iL2 <= i10) {
            i10 = iL2;
        }
        int iL3 = kotlin.math.b.L0(aVar.I(m2Var.b(), i11));
        int i14 = iL3 >= 0 ? iL3 : 0;
        if (i14 <= i11) {
            i11 = i14;
        }
        androidx.compose.ui.layout.i2.a.P(aVar, z0Var.P0(androidx.compose.ui.unit.b.f42658b.c(i10 - i12, i11 - i13)), i12, i13, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(androidx.compose.ui.layout.m2 m2Var, int i10, int i11, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        int iL0 = kotlin.math.b.L0(aVar.I(m2Var.y(), 0.0f));
        if (iL0 < 0) {
            iL0 = 0;
        }
        if (iL0 > i10) {
            iL0 = i10;
        }
        int iL1 = kotlin.math.b.L0(aVar.I(m2Var.n(), 0.0f));
        if (iL1 < 0) {
            iL1 = 0;
        }
        if (iL1 > i11) {
            iL1 = i11;
        }
        int iL2 = kotlin.math.b.L0(aVar.I(m2Var.x(), i10));
        if (iL2 < 0) {
            iL2 = 0;
        }
        if (iL2 > i10) {
            iL2 = i10;
        }
        int iL3 = kotlin.math.b.L0(aVar.I(m2Var.b(), i11));
        int i12 = iL3 >= 0 ? iL3 : 0;
        if (i12 > i11) {
            i12 = i11;
        }
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, ((iL0 + iL2) - i10) / 2, ((iL1 + i12) - i11) / 2, 0.0f, 4, null);
        return Unit.f312394a;
    }

    @NotNull
    public static final androidx.compose.ui.a0 k(@NotNull androidx.compose.ui.a0 a0Var, @NotNull final androidx.compose.ui.layout.m2 m2Var) {
        return androidx.compose.ui.layout.q0.a(a0Var, new pj.n() { // from class: androidx.compose.foundation.layout.e6
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return f6.l(m2Var, (androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 l(final androidx.compose.ui.layout.m2 m2Var, androidx.compose.ui.layout.c1 c1Var, final androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
        if (!androidx.compose.ui.unit.b.j(bVar.x()) || !androidx.compose.ui.unit.b.i(bVar.x())) {
            return androidx.compose.ui.layout.c1.h6(c1Var, 0, 0, null, new Function1() { // from class: androidx.compose.foundation.layout.c6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f6.n(z0Var, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
        final int iP = androidx.compose.ui.unit.b.p(bVar.x());
        final int iO = androidx.compose.ui.unit.b.o(bVar.x());
        return androidx.compose.ui.layout.c1.h6(c1Var, iP, iO, null, new Function1() { // from class: androidx.compose.foundation.layout.b6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f6.m(m2Var, iP, iO, z0Var, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(androidx.compose.ui.layout.m2 m2Var, int i10, int i11, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.layout.i2.a aVar) {
        int i12;
        int i13;
        int iL0 = kotlin.math.b.L0(aVar.I(m2Var.y(), 0.0f));
        int iL1 = kotlin.math.b.L0(aVar.I(m2Var.n(), 0.0f));
        int iL2 = kotlin.math.b.L0(aVar.I(m2Var.x(), i10));
        int iL3 = kotlin.math.b.L0(aVar.I(m2Var.b(), i11));
        if (iL0 <= 0) {
            if (iL1 > 0) {
                i11 = iL1;
            } else if (iL2 < i10) {
                i10 -= iL2;
                i12 = iL2;
                i13 = 0;
            } else if (iL3 < i11) {
                i11 -= iL3;
                i13 = iL3;
                i12 = 0;
            } else {
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i13 = i12;
            }
            androidx.compose.ui.layout.i2.a.P(aVar, z0Var.P0(androidx.compose.ui.unit.b.f42658b.c(i10, i11)), i12, i13, 0.0f, 4, null);
            return Unit.f312394a;
        }
        i10 = iL0;
        i12 = 0;
        i13 = i12;
        androidx.compose.ui.layout.i2.a.P(aVar, z0Var.P0(androidx.compose.ui.unit.b.f42658b.c(i10, i11)), i12, i13, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, z0Var.P0(androidx.compose.ui.unit.b.f42658b.c(0, 0)), 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }
}
