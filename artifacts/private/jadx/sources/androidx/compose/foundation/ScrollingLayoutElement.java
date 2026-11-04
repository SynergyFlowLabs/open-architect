package androidx.compose.foundation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class ScrollingLayoutElement extends androidx.compose.ui.node.e1<v4> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f13902f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b5 f13903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f13904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f13905e;

    public ScrollingLayoutElement(@NotNull b5 b5Var, boolean z10, boolean z11) {
        this.f13903c = b5Var;
        this.f13904d = z10;
        this.f13905e = z11;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        int i10 = 7 & 0;
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return Intrinsics.areEqual(this.f13903c, scrollingLayoutElement.f13903c) && this.f13904d == scrollingLayoutElement.f13904d && this.f13905e == scrollingLayoutElement.f13905e;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((this.f13903c.hashCode() * 31) + Boolean.hashCode(this.f13904d)) * 31) + Boolean.hashCode(this.f13905e);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("scroll");
        t2Var.b().c("state", this.f13903c);
        t2Var.b().c("reverseScrolling", Boolean.valueOf(this.f13904d));
        t2Var.b().c("isVertical", Boolean.valueOf(this.f13905e));
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public v4 a() {
        return new v4(this.f13903c, this.f13904d, this.f13905e);
    }

    public final boolean m() {
        return this.f13904d;
    }

    @NotNull
    public final b5 n() {
        return this.f13903c;
    }

    public final boolean o() {
        return this.f13905e;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull v4 v4Var) {
        v4Var.H9(this.f13903c);
        v4Var.G9(this.f13904d);
        v4Var.I9(this.f13905e);
    }
}
