package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,477:1\n102#2:478\n102#2:479\n102#2:480\n102#2:481\n113#2:486\n113#2:487\n113#2:488\n113#2:489\n93#3,4:482\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n*L\n346#1:478\n347#1:479\n348#1:480\n349#1:481\n336#1:486\n337#1:487\n338#1:488\n339#1:489\n345#1:482,4\n*E\n"})
final class PaddingElement extends androidx.compose.ui.node.e1<f5> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f15808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f15809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f15810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f15811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f15812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.platform.t2, Unit> f15813h;

    public /* synthetic */ PaddingElement(float f10, float f11, float f12, float f13, boolean z10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10, function1);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && androidx.compose.ui.unit.h.x(this.f15808c, paddingElement.f15808c) && androidx.compose.ui.unit.h.x(this.f15809d, paddingElement.f15809d) && androidx.compose.ui.unit.h.x(this.f15810e, paddingElement.f15810e) && androidx.compose.ui.unit.h.x(this.f15811f, paddingElement.f15811f) && this.f15812g == paddingElement.f15812g;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((((((androidx.compose.ui.unit.h.D(this.f15808c) * 31) + androidx.compose.ui.unit.h.D(this.f15809d)) * 31) + androidx.compose.ui.unit.h.D(this.f15810e)) * 31) + androidx.compose.ui.unit.h.D(this.f15811f)) * 31) + Boolean.hashCode(this.f15812g);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        this.f15813h.invoke(t2Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f5 a() {
        return new f5(this.f15808c, this.f15809d, this.f15810e, this.f15811f, this.f15812g, null);
    }

    public final float m() {
        return this.f15811f;
    }

    public final float n() {
        return this.f15810e;
    }

    @NotNull
    public final Function1<androidx.compose.ui.platform.t2, Unit> o() {
        return this.f15813h;
    }

    public final boolean p() {
        return this.f15812g;
    }

    public final float q() {
        return this.f15808c;
    }

    public final float r() {
        return this.f15809d;
    }

    public final void s(float f10) {
        this.f15811f = f10;
    }

    public final void t(float f10) {
        this.f15810e = f10;
    }

    public final void u(boolean z10) {
        this.f15812g = z10;
    }

    public final void v(float f10) {
        this.f15808c = f10;
    }

    public final void w(float f10) {
        this.f15809d = f10;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull f5 f5Var) {
        f5Var.F9(this.f15808c);
        f5Var.G9(this.f15809d);
        f5Var.D9(this.f15810e);
        f5Var.C9(this.f15811f);
        f5Var.E9(this.f15812g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PaddingElement(float f10, float f11, float f12, float f13, boolean z10, Function1<? super androidx.compose.ui.platform.t2, Unit> function1) {
        this.f15808c = f10;
        this.f15809d = f11;
        this.f15810e = f12;
        this.f15811f = f13;
        this.f15812g = z10;
        this.f15813h = function1;
        boolean z11 = true;
        boolean z12 = f10 >= 0.0f || Float.isNaN(f10);
        float f14 = this.f15809d;
        boolean z13 = z12 & (f14 >= 0.0f || Float.isNaN(f14));
        float f15 = this.f15810e;
        boolean z14 = z13 & (f15 >= 0.0f || Float.isNaN(f15));
        float f16 = this.f15811f;
        if (f16 < 0.0f && !Float.isNaN(f16)) {
            z11 = false;
        }
        if (!z14 || !z11) {
            x.a.f("Padding must be non-negative");
        }
    }

    public /* synthetic */ PaddingElement(float f10, float f11, float f12, float f13, boolean z10, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.ui.unit.h.r(0) : f10, (i10 & 2) != 0 ? androidx.compose.ui.unit.h.r(0) : f11, (i10 & 4) != 0 ? androidx.compose.ui.unit.h.r(0) : f12, (i10 & 8) != 0 ? androidx.compose.ui.unit.h.r(0) : f13, z10, function1, null);
    }
}
