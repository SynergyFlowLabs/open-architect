package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class IntrinsicWidthElement extends androidx.compose.ui.node.e1<h4> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final e4 f15795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.platform.t2, Unit> f15797e;

    /* JADX WARN: Multi-variable type inference failed */
    public IntrinsicWidthElement(@NotNull e4 e4Var, boolean z10, @NotNull Function1<? super androidx.compose.ui.platform.t2, Unit> function1) {
        this.f15795c = e4Var;
        this.f15796d = z10;
        this.f15797e = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.f15795c == intrinsicWidthElement.f15795c && this.f15796d == intrinsicWidthElement.f15796d;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (this.f15795c.hashCode() * 31) + Boolean.hashCode(this.f15796d);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        this.f15797e.invoke(t2Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public h4 a() {
        return new h4(this.f15795c, this.f15796d);
    }

    public final boolean m() {
        return this.f15796d;
    }

    @NotNull
    public final Function1<androidx.compose.ui.platform.t2, Unit> n() {
        return this.f15797e;
    }

    @NotNull
    public final e4 o() {
        return this.f15795c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull h4 h4Var) {
        h4Var.B9(this.f15795c);
        h4Var.A9(this.f15796d);
    }
}
