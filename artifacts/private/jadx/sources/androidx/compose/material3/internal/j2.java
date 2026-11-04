package androidx.compose.material3.internal;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDraggableAnchors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DraggableAnchors.kt\nandroidx/compose/material3/internal/DraggableAnchorsNodeV2\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,159:1\n30#2:160\n80#3:161\n*S KotlinDebug\n*F\n+ 1 DraggableAnchors.kt\nandroidx/compose/material3/internal/DraggableAnchorsNodeV2\n*L\n126#1:160\n126#1:161\n*E\n"})
final class j2<T> extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.gestures.b0<T> f28974s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, ? extends Pair<? extends androidx.compose.foundation.gestures.t2<T>, ? extends T>> f28975t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.gestures.q3 f28976v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f28977w;

    public j2(@NotNull androidx.compose.foundation.gestures.b0<T> b0Var, @NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, ? extends Pair<? extends androidx.compose.foundation.gestures.t2<T>, ? extends T>> function2, @NotNull androidx.compose.foundation.gestures.q3 q3Var) {
        this.f28974s = b0Var;
        this.f28975t = function2;
        this.f28976v = q3Var;
    }

    private final boolean A9() {
        return androidx.compose.ui.node.k.t(this) == androidx.compose.ui.unit.w.Rtl && this.f28976v == androidx.compose.foundation.gestures.q3.Horizontal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B9(androidx.compose.ui.layout.c1 c1Var, j2 j2Var, final androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        final float fC = c1Var.P5() ? j2Var.f28974s.r().c(j2Var.f28974s.F()) : j2Var.f28974s.N();
        float f10 = j2Var.A9() ? -1.0f : 1.0f;
        androidx.compose.foundation.gestures.q3 q3Var = j2Var.f28976v;
        final float f11 = q3Var == androidx.compose.foundation.gestures.q3.Horizontal ? f10 * fC : 0.0f;
        if (q3Var != androidx.compose.foundation.gestures.q3.Vertical) {
            fC = 0.0f;
        }
        aVar.K0(new Function1() { // from class: androidx.compose.material3.internal.i2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j2.C9(i2Var, f11, fC, (androidx.compose.ui.layout.i2.a) obj);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C9(androidx.compose.ui.layout.i2 i2Var, float f10, float f11, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, kotlin.math.b.L0(f10), kotlin.math.b.L0(f11), 0.0f, 4, null);
        return Unit.f312394a;
    }

    public final void D9(@NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, ? extends Pair<? extends androidx.compose.foundation.gestures.t2<T>, ? extends T>> function2) {
        this.f28975t = function2;
    }

    public final void E9(@NotNull androidx.compose.foundation.gestures.q3 q3Var) {
        this.f28976v = q3Var;
    }

    public final void F9(@NotNull androidx.compose.foundation.gestures.b0<T> b0Var) {
        this.f28974s = b0Var;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull final androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(j10);
        if (!c1Var.P5() || !this.f28977w) {
            Pair<? extends androidx.compose.foundation.gestures.t2<T>, ? extends T> pairInvoke = this.f28975t.invoke(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.e((((long) i2VarP0.c1()) & com.rabbitmq.client.k0.f265952a) | (((long) i2VarP0.h1()) << 32))), androidx.compose.ui.unit.b.a(j10));
            this.f28974s.d0(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        this.f28977w = c1Var.P5() || this.f28977w;
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.material3.internal.h2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j2.B9(c1Var, this, i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        this.f28977w = false;
    }

    @NotNull
    public final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.b, Pair<androidx.compose.foundation.gestures.t2<T>, T>> x9() {
        return this.f28975t;
    }

    @NotNull
    public final androidx.compose.foundation.gestures.q3 y9() {
        return this.f28976v;
    }

    @NotNull
    public final androidx.compose.foundation.gestures.b0<T> z9() {
        return this.f28974s;
    }
}
