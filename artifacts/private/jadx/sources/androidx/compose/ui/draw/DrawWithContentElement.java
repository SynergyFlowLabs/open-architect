package androidx.compose.ui.draw;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class DrawWithContentElement extends e1<p> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.graphics.drawscope.c, Unit> f37224c;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithContentElement(@NotNull Function1<? super androidx.compose.ui.graphics.drawscope.c, Unit> function1) {
        this.f37224c = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DrawWithContentElement) && this.f37224c == ((DrawWithContentElement) obj).f37224c) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f37224c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("drawWithContent");
        t2Var.b().c("onDraw", this.f37224c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public p a() {
        return new p(this.f37224c);
    }

    @NotNull
    public final Function1<androidx.compose.ui.graphics.drawscope.c, Unit> m() {
        return this.f37224c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull p pVar) {
        pVar.w9(this.f37224c);
    }
}
