package androidx.compose.foundation.relocation;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class BringIntoViewRequesterElement extends e1<g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f18559c;

    public BringIntoViewRequesterElement(@NotNull a aVar) {
        this.f18559c = aVar;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        return this == obj || ((obj instanceof BringIntoViewRequesterElement) && Intrinsics.areEqual(this.f18559c, ((BringIntoViewRequesterElement) obj).f18559c));
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f18559c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("bringIntoViewRequester");
        t2Var.b().c("bringIntoViewRequester", this.f18559c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public g a() {
        return new g(this.f18559c);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull g gVar) {
        gVar.w9(this.f18559c);
    }
}
