package androidx.compose.ui.focus;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class FocusChangedElement extends e1<e> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<p0, Unit> f37337c;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedElement(@NotNull Function1<? super p0, Unit> function1) {
        this.f37337c = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && this.f37337c == ((FocusChangedElement) obj).f37337c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f37337c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("onFocusChanged");
        t2Var.b().c("onFocusChanged", this.f37337c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e a() {
        return new e(this.f37337c);
    }

    @NotNull
    public final Function1<p0, Unit> m() {
        return this.f37337c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull e eVar) {
        eVar.w9(this.f37337c);
    }
}
