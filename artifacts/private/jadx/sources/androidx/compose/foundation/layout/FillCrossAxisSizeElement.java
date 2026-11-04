package androidx.compose.foundation.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class FillCrossAxisSizeElement extends androidx.compose.ui.node.e1<v1> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15784d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f15785c;

    public FillCrossAxisSizeElement(float f10) {
        this.f15785c = f10;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        v1 v1Var = obj instanceof v1 ? (v1) obj : null;
        return v1Var != null && this.f15785c == v1Var.v9();
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return Float.hashCode(this.f15785c) * 31;
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("fraction");
        t2Var.e(Float.valueOf(this.f15785c));
        t2Var.b().c("fraction", Float.valueOf(this.f15785c));
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public v1 a() {
        return new v1(this.f15785c);
    }

    public final float m() {
        return this.f15785c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull v1 v1Var) {
        v1Var.x9(this.f15785c);
    }
}
