package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class HorizontalAlignElement extends androidx.compose.ui.node.e1<u3> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15790d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e.b f15791c;

    public HorizontalAlignElement(@NotNull androidx.compose.ui.e.b bVar) {
        this.f15791c = bVar;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f15791c, horizontalAlignElement.f15791c);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f15791c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("align");
        t2Var.e(this.f15791c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public u3 a() {
        return new u3(this.f15791c);
    }

    @NotNull
    public final androidx.compose.ui.e.b m() {
        return this.f15791c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull u3 u3Var) {
        u3Var.x9(this.f15791c);
    }
}
