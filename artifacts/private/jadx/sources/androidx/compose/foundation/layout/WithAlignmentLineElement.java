package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class WithAlignmentLineElement extends androidx.compose.ui.node.e1<g6.b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15829d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.a f15830c;

    public WithAlignmentLineElement(@NotNull androidx.compose.ui.layout.a aVar) {
        this.f15830c = aVar;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineElement withAlignmentLineElement = obj instanceof WithAlignmentLineElement ? (WithAlignmentLineElement) obj : null;
        if (withAlignmentLineElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f15830c, withAlignmentLineElement.f15830c);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f15830c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("alignBy");
        t2Var.e(this.f15830c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public g6.b a() {
        return new g6.b(this.f15830c);
    }

    @NotNull
    public final androidx.compose.ui.layout.a m() {
        return this.f15830c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull g6.b bVar) {
        bVar.w9(this.f15830c);
    }
}
