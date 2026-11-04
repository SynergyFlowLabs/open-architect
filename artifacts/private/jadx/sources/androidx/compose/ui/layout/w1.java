package androidx.compose.ui.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class w1 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.f0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Function1<? super g0, Unit> f39571s;

    public w1(@NotNull Function1<? super g0, Unit> function1) {
        this.f39571s = function1;
    }

    @NotNull
    public final Function1<g0, Unit> v9() {
        return this.f39571s;
    }

    public final void w9(@NotNull Function1<? super g0, Unit> function1) {
        this.f39571s = function1;
    }

    @Override // androidx.compose.ui.node.f0
    public void x(@NotNull g0 g0Var) {
        this.f39571s.invoke(g0Var);
    }
}
