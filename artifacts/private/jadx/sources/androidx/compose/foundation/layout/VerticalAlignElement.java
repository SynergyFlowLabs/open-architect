package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class VerticalAlignElement extends androidx.compose.ui.node.e1<u6> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15825d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e.c f15826c;

    public VerticalAlignElement(@NotNull androidx.compose.ui.e.c cVar) {
        this.f15826c = cVar;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f15826c, verticalAlignElement.f15826c);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f15826c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("align");
        t2Var.e(this.f15826c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public u6 a() {
        return new u6(this.f15826c);
    }

    @NotNull
    public final androidx.compose.ui.e.c m() {
        return this.f15826c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull u6 u6Var) {
        u6Var.x9(this.f15826c);
    }
}
