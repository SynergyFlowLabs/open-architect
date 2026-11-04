package androidx.compose.ui.focus;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class l extends androidx.compose.ui.a0.d implements j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Function1<? super p0, Unit> f37430s;

    public l(@NotNull Function1<? super p0, Unit> function1) {
        this.f37430s = function1;
    }

    @Override // androidx.compose.ui.focus.j
    public void Z(@NotNull p0 p0Var) {
        this.f37430s.invoke(p0Var);
    }

    @NotNull
    public final Function1<p0, Unit> v9() {
        return this.f37430s;
    }

    public final void w9(@NotNull Function1<? super p0, Unit> function1) {
        this.f37430s = function1;
    }
}
