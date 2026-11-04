package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class ApproachLayoutElement extends androidx.compose.ui.node.e1<f> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final pj.n<g, z0, androidx.compose.ui.unit.b, b1> f39214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.unit.u, Boolean> f39215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function2<i2.a, g0, Boolean> f39216e;

    public /* synthetic */ ApproachLayoutElement(pj.n nVar, Function1 function1, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, function1, (i10 & 4) != 0 ? y0.f39586a : function2);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproachLayoutElement)) {
            return false;
        }
        ApproachLayoutElement approachLayoutElement = (ApproachLayoutElement) obj;
        return this.f39214c == approachLayoutElement.f39214c && this.f39215d == approachLayoutElement.f39215d && this.f39216e == approachLayoutElement.f39216e;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((this.f39214c.hashCode() * 31) + this.f39215d.hashCode()) * 31) + this.f39216e.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("approachLayout");
        t2Var.b().c("approachMeasure", this.f39214c);
        t2Var.b().c("isMeasurementApproachInProgress", this.f39215d);
        t2Var.b().c("isPlacementApproachInProgress", this.f39216e);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f a() {
        return new f(this.f39214c, this.f39215d, this.f39216e);
    }

    @NotNull
    public final pj.n<g, z0, androidx.compose.ui.unit.b, b1> m() {
        return this.f39214c;
    }

    @NotNull
    public final Function1<androidx.compose.ui.unit.u, Boolean> n() {
        return this.f39215d;
    }

    @NotNull
    public final Function2<i2.a, g0, Boolean> o() {
        return this.f39216e;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull f fVar) {
        fVar.y9(this.f39214c);
        fVar.z9(this.f39215d);
        fVar.A9(this.f39216e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApproachLayoutElement(@NotNull pj.n<? super g, ? super z0, ? super androidx.compose.ui.unit.b, ? extends b1> nVar, @NotNull Function1<? super androidx.compose.ui.unit.u, Boolean> function1, @NotNull Function2<? super i2.a, ? super g0, Boolean> function2) {
        this.f39214c = nVar;
        this.f39215d = function1;
        this.f39216e = function2;
    }
}
