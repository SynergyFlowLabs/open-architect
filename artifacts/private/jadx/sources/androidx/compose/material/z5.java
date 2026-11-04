package androidx.compose.material;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/DraggableAnchorsNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,875:1\n30#2:876\n80#3:877\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/DraggableAnchorsNode\n*L\n856#1:876\n856#1:877\n*E\n"})
final class z5<T> extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private u<T> f25803s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, ? extends Pair<? extends w5<T>, ? extends T>> f25804t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.gestures.q3 f25805v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f25806w;

    public z5(@NotNull u<T> uVar, @NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, ? extends Pair<? extends w5<T>, ? extends T>> function2, @NotNull androidx.compose.foundation.gestures.q3 q3Var) {
        this.f25803s = uVar;
        this.f25804t = function2;
        this.f25805v = q3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z9(androidx.compose.ui.layout.c1 c1Var, z5 z5Var, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        float fC = c1Var.P5() ? z5Var.f25803s.u().c(z5Var.f25803s.F()) : z5Var.f25803s.K();
        androidx.compose.foundation.gestures.q3 q3Var = z5Var.f25805v;
        float f10 = q3Var == androidx.compose.foundation.gestures.q3.Horizontal ? fC : 0.0f;
        if (q3Var != androidx.compose.foundation.gestures.q3.Vertical) {
            fC = 0.0f;
        }
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, kotlin.math.b.L0(f10), kotlin.math.b.L0(fC), 0.0f, 4, null);
        return Unit.f312394a;
    }

    public final void A9(@NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, ? extends Pair<? extends w5<T>, ? extends T>> function2) {
        this.f25804t = function2;
    }

    public final void B9(@NotNull androidx.compose.foundation.gestures.q3 q3Var) {
        this.f25805v = q3Var;
    }

    public final void C9(@NotNull u<T> uVar) {
        this.f25803s = uVar;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull final androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(j10);
        if (!c1Var.P5() || !this.f25806w) {
            Pair<? extends w5<T>, ? extends T> pairInvoke = this.f25804t.invoke(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.e((((long) i2VarP0.c1()) & com.rabbitmq.client.k0.f265952a) | (((long) i2VarP0.h1()) << 32))), androidx.compose.ui.unit.b.a(j10));
            this.f25803s.U(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        this.f25806w = c1Var.P5() || this.f25806w;
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.material.y5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z5.z9(c1Var, this, i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        this.f25806w = false;
    }

    @NotNull
    public final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.b, Pair<w5<T>, T>> w9() {
        return this.f25804t;
    }

    @NotNull
    public final androidx.compose.foundation.gestures.q3 x9() {
        return this.f25805v;
    }

    @NotNull
    public final u<T> y9() {
        return this.f25803s;
    }
}
