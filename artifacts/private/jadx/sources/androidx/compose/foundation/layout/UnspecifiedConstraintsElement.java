package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends androidx.compose.ui.node.e1<s6> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f15823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f15824d;

    public /* synthetic */ UnspecifiedConstraintsElement(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return androidx.compose.ui.unit.h.x(this.f15823c, unspecifiedConstraintsElement.f15823c) && androidx.compose.ui.unit.h.x(this.f15824d, unspecifiedConstraintsElement.f15824d);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (androidx.compose.ui.unit.h.D(this.f15823c) * 31) + androidx.compose.ui.unit.h.D(this.f15824d);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("defaultMinSize");
        t2Var.b().c("minWidth", androidx.compose.ui.unit.h.o(this.f15823c));
        t2Var.b().c("minHeight", androidx.compose.ui.unit.h.o(this.f15824d));
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public s6 a() {
        return new s6(this.f15823c, this.f15824d, null);
    }

    public final float m() {
        return this.f15824d;
    }

    public final float n() {
        return this.f15823c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull s6 s6Var) {
        s6Var.A9(this.f15823c);
        s6Var.z9(this.f15824d);
    }

    public /* synthetic */ UnspecifiedConstraintsElement(float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.ui.unit.h.f42689b.e() : f10, (i10 & 2) != 0 ? androidx.compose.ui.unit.h.f42689b.e() : f11, null);
    }

    private UnspecifiedConstraintsElement(float f10, float f11) {
        this.f15823c = f10;
        this.f15824d = f11;
    }
}
