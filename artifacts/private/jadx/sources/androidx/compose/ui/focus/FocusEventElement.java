package androidx.compose.ui.focus;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class FocusEventElement extends e1<l> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<p0, Unit> f37338c;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusEventElement(@NotNull Function1<? super p0, Unit> function1) {
        this.f37338c = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusEventElement) && this.f37338c == ((FocusEventElement) obj).f37338c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f37338c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("onFocusEvent");
        t2Var.b().c("onFocusEvent", this.f37338c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public l a() {
        return new l(this.f37338c);
    }

    @NotNull
    public final Function1<p0, Unit> m() {
        return this.f37338c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull l lVar) {
        lVar.w9(this.f37338c);
    }
}
