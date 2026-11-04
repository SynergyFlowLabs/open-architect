package androidx.compose.ui.draw;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class DrawWithCacheElement extends e1<h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<i, o> f37223c;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithCacheElement(@NotNull Function1<? super i, o> function1) {
        this.f37223c = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && this.f37223c == ((DrawWithCacheElement) obj).f37223c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f37223c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("drawWithCache");
        t2Var.b().c("onBuildDrawCache", this.f37223c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public h a() {
        return new h(new i(), this.f37223c);
    }

    @NotNull
    public final Function1<i, o> m() {
        return this.f37223c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull h hVar) {
        hVar.y9(this.f37223c);
    }
}
