package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class OffsetPxElement extends androidx.compose.ui.node.e1<w4> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> f15805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.platform.t2, Unit> f15807e;

    /* JADX WARN: Multi-variable type inference failed */
    public OffsetPxElement(@NotNull Function1<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> function1, boolean z10, @NotNull Function1<? super androidx.compose.ui.platform.t2, Unit> function2) {
        this.f15805c = function1;
        this.f15806d = z10;
        this.f15807e = function2;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        if (offsetPxElement == null) {
            return false;
        }
        return this.f15805c == offsetPxElement.f15805c && this.f15806d == offsetPxElement.f15806d;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (this.f15805c.hashCode() * 31) + Boolean.hashCode(this.f15806d);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        this.f15807e.invoke(t2Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public w4 a() {
        return new w4(this.f15805c, this.f15806d);
    }

    @NotNull
    public final Function1<androidx.compose.ui.platform.t2, Unit> m() {
        return this.f15807e;
    }

    @NotNull
    public final Function1<androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> n() {
        return this.f15805c;
    }

    public final boolean o() {
        return this.f15806d;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull w4 w4Var) {
        w4Var.B9(this.f15805c, this.f15806d);
    }

    @NotNull
    public String toString() {
        return "OffsetPxModifier(offset=" + this.f15805c + ", rtlAware=" + this.f15806d + ')';
    }
}
