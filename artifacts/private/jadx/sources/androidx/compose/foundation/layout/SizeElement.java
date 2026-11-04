package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class SizeElement extends androidx.compose.ui.node.e1<k6> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f15817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f15818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f15819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f15820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f15821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.platform.t2, Unit> f15822h;

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10, function1);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return androidx.compose.ui.unit.h.x(this.f15817c, sizeElement.f15817c) && androidx.compose.ui.unit.h.x(this.f15818d, sizeElement.f15818d) && androidx.compose.ui.unit.h.x(this.f15819e, sizeElement.f15819e) && androidx.compose.ui.unit.h.x(this.f15820f, sizeElement.f15820f) && this.f15821g == sizeElement.f15821g;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((((((androidx.compose.ui.unit.h.D(this.f15817c) * 31) + androidx.compose.ui.unit.h.D(this.f15818d)) * 31) + androidx.compose.ui.unit.h.D(this.f15819e)) * 31) + androidx.compose.ui.unit.h.D(this.f15820f)) * 31) + Boolean.hashCode(this.f15821g);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        this.f15822h.invoke(t2Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public k6 a() {
        return new k6(this.f15817c, this.f15818d, this.f15819e, this.f15820f, this.f15821g, null);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull k6 k6Var) {
        k6Var.H9(this.f15817c);
        k6Var.G9(this.f15818d);
        k6Var.F9(this.f15819e);
        k6Var.E9(this.f15820f);
        k6Var.D9(this.f15821g);
    }

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.ui.unit.h.f42689b.e() : f10, (i10 & 2) != 0 ? androidx.compose.ui.unit.h.f42689b.e() : f11, (i10 & 4) != 0 ? androidx.compose.ui.unit.h.f42689b.e() : f12, (i10 & 8) != 0 ? androidx.compose.ui.unit.h.f42689b.e() : f13, z10, function1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SizeElement(float f10, float f11, float f12, float f13, boolean z10, Function1<? super androidx.compose.ui.platform.t2, Unit> function1) {
        this.f15817c = f10;
        this.f15818d = f11;
        this.f15819e = f12;
        this.f15820f = f13;
        this.f15821g = z10;
        this.f15822h = function1;
    }
}
