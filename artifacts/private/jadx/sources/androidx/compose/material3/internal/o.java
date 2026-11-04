package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.d5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAccessibilityUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityUtil.kt\nandroidx/compose/material3/internal/AccessibilityUtilKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,78:1\n113#2:79\n113#2:80\n*S KotlinDebug\n*F\n+ 1 AccessibilityUtil.kt\nandroidx/compose/material3/internal/AccessibilityUtilKt\n*L\n28#1:79\n29#1:80\n*E\n"})
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f29030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f29031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.a0 f29032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.a0 f29033d;

    static {
        float f10 = 10;
        float fR = androidx.compose.ui.unit.h.r(f10);
        f29030a = fR;
        float fR2 = androidx.compose.ui.unit.h.r(f10);
        f29031b = fR2;
        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
        f29032c = d5.t(androidx.compose.ui.semantics.t.e(androidx.compose.ui.layout.q0.a(aVar, new pj.n() { // from class: androidx.compose.material3.internal.j
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return o.g((androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
            }
        }), true, new Function1() { // from class: androidx.compose.material3.internal.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.i((androidx.compose.ui.semantics.e0) obj);
            }
        }), fR, 0.0f, 2, null);
        f29033d = d5.t(androidx.compose.ui.semantics.t.e(androidx.compose.ui.layout.q0.a(aVar, new pj.n() { // from class: androidx.compose.material3.internal.l
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return o.j((androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
            }
        }), true, new Function1() { // from class: androidx.compose.material3.internal.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.l((androidx.compose.ui.semantics.e0) obj);
            }
        }), 0.0f, fR2, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 g(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
        final int iG6 = c1Var.g6(f29030a);
        long jX = bVar.x();
        int i10 = iG6 * 2;
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.c.q(jX, i10, 0));
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1() - i10, i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.material3.internal.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.h(i2VarP0, iG6, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(androidx.compose.ui.layout.i2 i2Var, int i10, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, -i10, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(androidx.compose.ui.semantics.e0 e0Var) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 j(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
        final int iG6 = c1Var.g6(f29031b);
        long jX = bVar.x();
        int i10 = iG6 * 2;
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.c.q(jX, 0, i10));
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1() - i10, null, new Function1() { // from class: androidx.compose.material3.internal.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.k(i2VarP0, iG6, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(androidx.compose.ui.layout.i2 i2Var, int i10, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, -i10, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(androidx.compose.ui.semantics.e0 e0Var) {
        return Unit.f312394a;
    }

    public static final float m() {
        return f29030a;
    }

    @androidx.annotation.l1
    public static /* synthetic */ void n() {
    }

    @NotNull
    public static final androidx.compose.ui.a0 o() {
        return f29032c;
    }

    @NotNull
    public static final androidx.compose.ui.a0 p() {
        return f29033d;
    }

    public static final float q() {
        return f29031b;
    }

    @androidx.annotation.l1
    public static /* synthetic */ void r() {
    }
}
