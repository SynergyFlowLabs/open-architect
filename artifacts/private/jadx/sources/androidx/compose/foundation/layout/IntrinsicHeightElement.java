package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class IntrinsicHeightElement extends androidx.compose.ui.node.e1<b4> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final e4 f15792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.platform.t2, Unit> f15794e;

    /* JADX WARN: Multi-variable type inference failed */
    public IntrinsicHeightElement(@NotNull e4 e4Var, boolean z10, @NotNull Function1<? super androidx.compose.ui.platform.t2, Unit> function1) {
        this.f15792c = e4Var;
        this.f15793d = z10;
        this.f15794e = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.f15792c == intrinsicHeightElement.f15792c && this.f15793d == intrinsicHeightElement.f15793d;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (this.f15792c.hashCode() * 31) + Boolean.hashCode(this.f15793d);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        this.f15794e.invoke(t2Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public b4 a() {
        return new b4(this.f15792c, this.f15793d);
    }

    public final boolean m() {
        return this.f15793d;
    }

    @NotNull
    public final e4 n() {
        return this.f15792c;
    }

    @NotNull
    public final Function1<androidx.compose.ui.platform.t2, Unit> o() {
        return this.f15794e;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull b4 b4Var) {
        b4Var.B9(this.f15792c);
        b4Var.A9(this.f15793d);
    }
}
