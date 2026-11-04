package androidx.compose.ui.platform;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class TestTagElement extends androidx.compose.ui.node.e1<d4> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f40276c;

    public TestTagElement(@NotNull String str) {
        this.f40276c = str;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TestTagElement) {
            return Intrinsics.areEqual(this.f40276c, ((TestTagElement) obj).f40276c);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f40276c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("testTag");
        t2Var.b().c("tag", this.f40276c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d4 a() {
        return new d4(this.f40276c);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull d4 d4Var) {
        d4Var.w9(this.f40276c);
    }
}
