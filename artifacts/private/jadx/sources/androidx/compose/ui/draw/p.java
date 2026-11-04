package androidx.compose.ui.draw;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class p extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.t {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.graphics.drawscope.c, Unit> f37306s;

    public p(@NotNull Function1<? super androidx.compose.ui.graphics.drawscope.c, Unit> function1) {
        this.f37306s = function1;
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        this.f37306s.invoke(cVar);
    }

    @NotNull
    public final Function1<androidx.compose.ui.graphics.drawscope.c, Unit> v9() {
        return this.f37306s;
    }

    public final void w9(@NotNull Function1<? super androidx.compose.ui.graphics.drawscope.c, Unit> function1) {
        this.f37306s = function1;
    }
}
