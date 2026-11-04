package androidx.compose.ui.focus;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class e extends androidx.compose.ui.a0.d implements j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Function1<? super p0, Unit> f37405s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private p0 f37406t;

    public e(@NotNull Function1<? super p0, Unit> function1) {
        this.f37405s = function1;
    }

    @Override // androidx.compose.ui.focus.j
    public void Z(@NotNull p0 p0Var) {
        if (!Intrinsics.areEqual(this.f37406t, p0Var)) {
            this.f37406t = p0Var;
            this.f37405s.invoke(p0Var);
        }
    }

    @NotNull
    public final Function1<p0, Unit> v9() {
        return this.f37405s;
    }

    public final void w9(@NotNull Function1<? super p0, Unit> function1) {
        this.f37405s = function1;
    }
}
