package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nHorizontalCenterOptically.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HorizontalCenterOptically.kt\nandroidx/compose/material3/HorizontalCenterOpticallyKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,90:1\n113#2:91\n113#2:92\n113#2:93\n113#2:94\n33#3:95\n53#4,3:96\n*S KotlinDebug\n*F\n+ 1 HorizontalCenterOptically.kt\nandroidx/compose/material3/HorizontalCenterOpticallyKt\n*L\n43#1:91\n44#1:92\n70#1:93\n71#1:94\n50#1:95\n50#1:96,3\n*E\n"})
public final class ih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f28593a = 0.11f;

    @NotNull
    public static final androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, @NotNull final androidx.compose.foundation.shape.e eVar, final float f10, final float f11) {
        return androidx.compose.ui.layout.q0.a(a0Var, new pj.n() { // from class: androidx.compose.material3.gh
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ih.i(f10, f11, eVar, (androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
            }
        });
    }

    @NotNull
    public static final androidx.compose.ui.a0 f(@NotNull androidx.compose.ui.a0 a0Var, @NotNull final zw zwVar, final float f10, final float f11) {
        return androidx.compose.ui.layout.q0.a(a0Var, new pj.n() { // from class: androidx.compose.material3.hh
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ih.k(f10, f11, zwVar, (androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
            }
        });
    }

    public static /* synthetic */ androidx.compose.ui.a0 g(androidx.compose.ui.a0 a0Var, androidx.compose.foundation.shape.e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 4) != 0) {
            f11 = androidx.compose.ui.unit.h.r(0);
        }
        return e(a0Var, eVar, f10, f11);
    }

    public static /* synthetic */ androidx.compose.ui.a0 h(androidx.compose.ui.a0 a0Var, zw zwVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = androidx.compose.ui.unit.h.r(0);
        }
        if ((i10 & 4) != 0) {
            f11 = androidx.compose.ui.unit.h.r(0);
        }
        return f(a0Var, zwVar, f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 i(float f10, float f11, androidx.compose.foundation.shape.e eVar, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(bVar.x());
        int iH1 = i2VarP0.h1();
        int iC1 = i2VarP0.c1();
        long jF = n0.n.f((((long) Float.floatToRawIntBits(iH1)) << 32) | (((long) Float.floatToRawIntBits(iC1)) & com.rabbitmq.client.k0.f265952a));
        final float f12 = -c1Var.S7(f10);
        final float fS7 = c1Var.S7(f11);
        float fA = eVar.h().a(jF, c1Var);
        float fA2 = eVar.g().a(jF, c1Var);
        float fA3 = eVar.f().a(jF, c1Var);
        float fA4 = eVar.e().a(jF, c1Var);
        float f13 = 2;
        final float f14 = (((fA + fA3) / f13) - ((fA2 + fA4) / f13)) * 0.11f;
        return androidx.compose.ui.layout.c1.h6(c1Var, iH1, iC1, null, new Function1() { // from class: androidx.compose.material3.fh
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ih.j(f14, f12, fS7, i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(float f10, float f11, float f12, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, kotlin.math.b.L0(kotlin.ranges.r.H(f10, f11, f12)), 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 k(float f10, float f11, final zw zwVar, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(bVar.x());
        int iH1 = i2VarP0.h1();
        int iC1 = i2VarP0.c1();
        final float f12 = -c1Var.S7(f10);
        final float fS7 = c1Var.S7(f11);
        return androidx.compose.ui.layout.c1.h6(c1Var, iH1, iC1, null, new Function1() { // from class: androidx.compose.material3.eh
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ih.l(zwVar, f12, fS7, i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(zw zwVar, float f10, float f11, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, kotlin.math.b.L0(kotlin.ranges.r.H(zwVar.offset(), f10, f11)), 0, 0.0f, 4, null);
        return Unit.f312394a;
    }
}
