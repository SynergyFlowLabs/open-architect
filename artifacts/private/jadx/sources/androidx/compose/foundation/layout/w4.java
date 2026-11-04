package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class w4 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> f16518s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f16519t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f16520v;

    public w4(@NotNull Function1<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> function1, boolean z10) {
        this.f16518s = function1;
        this.f16519t = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y9(w4 w4Var, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        long jX = w4Var.f16518s.invoke(aVar).x();
        if (w4Var.f16519t) {
            androidx.compose.ui.layout.i2.a.p0(aVar, i2Var, androidx.compose.ui.unit.q.n(jX), androidx.compose.ui.unit.q.p(jX), 0.0f, null, 12, null);
        } else {
            androidx.compose.ui.layout.i2.a.A0(aVar, i2Var, androidx.compose.ui.unit.q.n(jX), androidx.compose.ui.unit.q.p(jX), 0.0f, null, 12, null);
        }
        return Unit.f312394a;
    }

    public final void A9(boolean z10) {
        this.f16519t = z10;
    }

    public final void B9(@NotNull Function1<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> function1, boolean z10) {
        if (this.f16518s != function1 || this.f16519t != z10) {
            androidx.compose.ui.node.j0.c(this);
        }
        this.f16518s = function1;
        this.f16519t = z10;
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return this.f16520v;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(j10);
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.foundation.layout.v4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w4.y9(this.f16488a, i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @NotNull
    public final Function1<androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> w9() {
        return this.f16518s;
    }

    public final boolean x9() {
        return this.f16519t;
    }

    public final void z9(@NotNull Function1<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> function1) {
        this.f16518s = function1;
    }
}
