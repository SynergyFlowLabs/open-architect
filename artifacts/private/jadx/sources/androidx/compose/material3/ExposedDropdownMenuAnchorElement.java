package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class ExposedDropdownMenuAnchorElement extends androidx.compose.ui.node.e1<cf> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f25904c;

    public ExposedDropdownMenuAnchorElement(@NotNull Function0<Unit> function0) {
        this.f25904c = function0;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ExposedDropdownMenuAnchorElement) && this.f25904c == ((ExposedDropdownMenuAnchorElement) obj).f25904c) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f25904c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("exposedDropdownMenuAnchorType");
        t2Var.b().c("updateStateOnAttach", this.f25904c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public cf a() {
        return new cf(this.f25904c);
    }

    @NotNull
    public final Function0<Unit> m() {
        return this.f25904c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull cf cfVar) {
        cfVar.w9(this.f25904c);
    }
}
