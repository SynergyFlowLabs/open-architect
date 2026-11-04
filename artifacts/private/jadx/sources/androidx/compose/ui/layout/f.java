package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class f extends androidx.compose.ui.a0.d implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private pj.n<? super g, ? super z0, ? super androidx.compose.ui.unit.b, ? extends b1> f39317s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.unit.u, Boolean> f39318t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private Function2<? super i2.a, ? super g0, Boolean> f39319v;

    public f(@NotNull pj.n<? super g, ? super z0, ? super androidx.compose.ui.unit.b, ? extends b1> nVar, @NotNull Function1<? super androidx.compose.ui.unit.u, Boolean> function1, @NotNull Function2<? super i2.a, ? super g0, Boolean> function2) {
        this.f39317s = nVar;
        this.f39318t = function1;
        this.f39319v = function2;
    }

    public final void A9(@NotNull Function2<? super i2.a, ? super g0, Boolean> function2) {
        this.f39319v = function2;
    }

    @Override // androidx.compose.ui.layout.e
    public boolean G6(long j10) {
        return this.f39318t.invoke(androidx.compose.ui.unit.u.b(j10)).booleanValue();
    }

    @Override // androidx.compose.ui.layout.e
    public boolean J8(@NotNull i2.a aVar, @NotNull g0 g0Var) {
        return this.f39319v.invoke(aVar, g0Var).booleanValue();
    }

    @Override // androidx.compose.ui.layout.e
    @NotNull
    public b1 l2(@NotNull g gVar, @NotNull z0 z0Var, long j10) {
        return this.f39317s.invoke(gVar, z0Var, androidx.compose.ui.unit.b.a(j10));
    }

    @NotNull
    public final pj.n<g, z0, androidx.compose.ui.unit.b, b1> v9() {
        return this.f39317s;
    }

    @NotNull
    public final Function1<androidx.compose.ui.unit.u, Boolean> w9() {
        return this.f39318t;
    }

    @NotNull
    public final Function2<i2.a, g0, Boolean> x9() {
        return this.f39319v;
    }

    public final void y9(@NotNull pj.n<? super g, ? super z0, ? super androidx.compose.ui.unit.b, ? extends b1> nVar) {
        this.f39317s = nVar;
    }

    public final void z9(@NotNull Function1<? super androidx.compose.ui.unit.u, Boolean> function1) {
        this.f39318t = function1;
    }
}
