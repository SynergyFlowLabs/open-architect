package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class OffsetElement extends androidx.compose.ui.node.e1<u4> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f15801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f15802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f15803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.platform.t2, Unit> f15804f;

    public /* synthetic */ OffsetElement(float f10, float f11, boolean z10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, z10, function1);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        if (offsetElement == null) {
            return false;
        }
        return androidx.compose.ui.unit.h.x(this.f15801c, offsetElement.f15801c) && androidx.compose.ui.unit.h.x(this.f15802d, offsetElement.f15802d) && this.f15803e == offsetElement.f15803e;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((androidx.compose.ui.unit.h.D(this.f15801c) * 31) + androidx.compose.ui.unit.h.D(this.f15802d)) * 31) + Boolean.hashCode(this.f15803e);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        this.f15804f.invoke(t2Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public u4 a() {
        return new u4(this.f15801c, this.f15802d, this.f15803e, null);
    }

    @NotNull
    public final Function1<androidx.compose.ui.platform.t2, Unit> m() {
        return this.f15804f;
    }

    public final boolean n() {
        return this.f15803e;
    }

    public final float o() {
        return this.f15801c;
    }

    public final float p() {
        return this.f15802d;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull u4 u4Var) {
        u4Var.D9(this.f15801c, this.f15802d, this.f15803e);
    }

    @NotNull
    public String toString() {
        return "OffsetModifierElement(x=" + ((Object) androidx.compose.ui.unit.h.M(this.f15801c)) + ", y=" + ((Object) androidx.compose.ui.unit.h.M(this.f15802d)) + ", rtlAware=" + this.f15803e + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private OffsetElement(float f10, float f11, boolean z10, Function1<? super androidx.compose.ui.platform.t2, Unit> function1) {
        this.f15801c = f10;
        this.f15802d = f11;
        this.f15803e = z10;
        this.f15804f = function1;
    }
}
