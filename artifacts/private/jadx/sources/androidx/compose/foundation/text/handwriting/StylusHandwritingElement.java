package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class StylusHandwritingElement extends e1<i> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f19349c;

    public StylusHandwritingElement(@NotNull Function0<Unit> function0) {
        this.f19349c = function0;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElement) && this.f19349c == ((StylusHandwritingElement) obj).f19349c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f19349c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("stylusHandwriting");
        t2Var.b().c("onHandwritingSlopExceeded", this.f19349c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public i a() {
        return new i(this.f19349c);
    }

    @NotNull
    public final Function0<Unit> m() {
        return this.f19349c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull i iVar) {
        iVar.I9(this.f19349c);
    }
}
