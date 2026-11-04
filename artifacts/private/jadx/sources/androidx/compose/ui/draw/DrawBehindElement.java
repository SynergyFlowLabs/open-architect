package androidx.compose.ui.draw;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class DrawBehindElement extends e1<k> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.graphics.drawscope.f, Unit> f37222c;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBehindElement(@NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        this.f37222c = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && this.f37222c == ((DrawBehindElement) obj).f37222c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f37222c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("drawBehind");
        t2Var.b().c("onDraw", this.f37222c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public k a() {
        return new k(this.f37222c);
    }

    @NotNull
    public final Function1<androidx.compose.ui.graphics.drawscope.f, Unit> m() {
        return this.f37222c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull k kVar) {
        kVar.w9(this.f37222c);
    }
}
