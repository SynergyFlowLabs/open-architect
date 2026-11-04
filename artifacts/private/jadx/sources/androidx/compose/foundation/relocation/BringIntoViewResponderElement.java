package androidx.compose.foundation.relocation;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class BringIntoViewResponderElement extends e1<j> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h f18560c;

    public BringIntoViewResponderElement(@NotNull h hVar) {
        this.f18560c = hVar;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof BringIntoViewResponderElement) && Intrinsics.areEqual(this.f18560c, ((BringIntoViewResponderElement) obj).f18560c);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f18560c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("bringIntoViewResponder");
        t2Var.b().c("responder", this.f18560c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public j a() {
        return new j(this.f18560c);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull j jVar) {
        jVar.A9(this.f18560c);
    }
}
