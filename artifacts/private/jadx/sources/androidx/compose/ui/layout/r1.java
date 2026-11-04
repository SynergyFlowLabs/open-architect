package androidx.compose.ui.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class r1 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.v {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Function1<? super g0, Unit> f39473s;

    public r1(@NotNull Function1<? super g0, Unit> function1) {
        this.f39473s = function1;
    }

    @Override // androidx.compose.ui.node.v
    public void n0(@NotNull g0 g0Var) {
        this.f39473s.invoke(g0Var);
    }

    @NotNull
    public final Function1<g0, Unit> v9() {
        return this.f39473s;
    }

    public final void w9(@NotNull Function1<? super g0, Unit> function1) {
        this.f39473s = function1;
    }
}
