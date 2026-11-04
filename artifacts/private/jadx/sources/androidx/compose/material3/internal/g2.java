package androidx.compose.material3.internal;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/internal/DraggableAnchorsNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,868:1\n30#2:869\n80#3:870\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/internal/DraggableAnchorsNode\n*L\n842#1:869\n842#1:870\n*E\n"})
final class g2<T> extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private d0<T> f28882s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, ? extends Pair<? extends b2<T>, ? extends T>> f28883t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.gestures.q3 f28884v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f28885w;

    public g2(@NotNull d0<T> d0Var, @NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, ? extends Pair<? extends b2<T>, ? extends T>> function2, @NotNull androidx.compose.foundation.gestures.q3 q3Var) {
        this.f28882s = d0Var;
        this.f28883t = function2;
        this.f28884v = q3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A9(androidx.compose.ui.layout.c1 c1Var, g2 g2Var, final androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        final float fC = c1Var.P5() ? g2Var.f28882s.u().c(g2Var.f28882s.F()) : g2Var.f28882s.K();
        androidx.compose.foundation.gestures.q3 q3Var = g2Var.f28884v;
        final float f10 = q3Var == androidx.compose.foundation.gestures.q3.Horizontal ? fC : 0.0f;
        if (q3Var != androidx.compose.foundation.gestures.q3.Vertical) {
            fC = 0.0f;
        }
        aVar.K0(new Function1() { // from class: androidx.compose.material3.internal.f2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g2.B9(i2Var, f10, fC, (androidx.compose.ui.layout.i2.a) obj);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B9(androidx.compose.ui.layout.i2 i2Var, float f10, float f11, androidx.compose.ui.layout.i2.a aVar) {
        int i10 = 0 << 0;
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, kotlin.math.b.L0(f10), kotlin.math.b.L0(f11), 0.0f, 4, null);
        return Unit.f312394a;
    }

    public final void C9(@NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, ? extends Pair<? extends b2<T>, ? extends T>> function2) {
        this.f28883t = function2;
    }

    public final void D9(@NotNull androidx.compose.foundation.gestures.q3 q3Var) {
        this.f28884v = q3Var;
    }

    public final void E9(@NotNull d0<T> d0Var) {
        this.f28882s = d0Var;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull final androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(j10);
        if (!c1Var.P5() || !this.f28885w) {
            Pair<? extends b2<T>, ? extends T> pairInvoke = this.f28883t.invoke(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.e((((long) i2VarP0.c1()) & com.rabbitmq.client.k0.f265952a) | (((long) i2VarP0.h1()) << 32))), androidx.compose.ui.unit.b.a(j10));
            this.f28882s.U(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        this.f28885w = c1Var.P5() || this.f28885w;
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.material3.internal.e2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g2.A9(c1Var, this, i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        this.f28885w = false;
    }

    @NotNull
    public final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.b, Pair<b2<T>, T>> x9() {
        return this.f28883t;
    }

    @NotNull
    public final androidx.compose.foundation.gestures.q3 y9() {
        return this.f28884v;
    }

    @NotNull
    public final d0<T> z9() {
        return this.f28882s;
    }
}
