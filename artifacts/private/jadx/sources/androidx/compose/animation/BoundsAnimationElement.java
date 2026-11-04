package androidx.compose.animation;

import androidx.compose.ui.platform.t2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@i0
public final class BoundsAnimationElement extends androidx.compose.ui.node.e1<q> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f12572g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.w0 f12573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final s f12574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.b, androidx.compose.ui.unit.b> f12575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f12576f;

    /* JADX WARN: Multi-variable type inference failed */
    public BoundsAnimationElement(@NotNull androidx.compose.ui.layout.w0 w0Var, @NotNull s sVar, @NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, androidx.compose.ui.unit.b> function2, boolean z10) {
        this.f12573c = w0Var;
        this.f12574d = sVar;
        this.f12575e = function2;
        this.f12576f = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoundsAnimationElement q(BoundsAnimationElement boundsAnimationElement, androidx.compose.ui.layout.w0 w0Var, s sVar, Function2 function2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            w0Var = boundsAnimationElement.f12573c;
        }
        if ((i10 & 2) != 0) {
            sVar = boundsAnimationElement.f12574d;
        }
        if ((i10 & 4) != 0) {
            function2 = boundsAnimationElement.f12575e;
        }
        if ((i10 & 8) != 0) {
            z10 = boundsAnimationElement.f12576f;
        }
        return boundsAnimationElement.p(w0Var, sVar, function2, z10);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoundsAnimationElement)) {
            return false;
        }
        BoundsAnimationElement boundsAnimationElement = (BoundsAnimationElement) obj;
        return Intrinsics.areEqual(this.f12573c, boundsAnimationElement.f12573c) && Intrinsics.areEqual(this.f12574d, boundsAnimationElement.f12574d) && Intrinsics.areEqual(this.f12575e, boundsAnimationElement.f12575e) && this.f12576f == boundsAnimationElement.f12576f;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((((this.f12573c.hashCode() * 31) + this.f12574d.hashCode()) * 31) + this.f12575e.hashCode()) * 31) + Boolean.hashCode(this.f12576f);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("boundsAnimation");
        t2Var.b().c("lookaheadScope", this.f12573c);
        t2Var.b().c("boundsTransform", this.f12574d);
        t2Var.b().c("onChooseMeasureConstraints", this.f12575e);
        t2Var.b().c("animateMotionFrameOfReference", Boolean.valueOf(this.f12576f));
    }

    @NotNull
    public final androidx.compose.ui.layout.w0 l() {
        return this.f12573c;
    }

    @NotNull
    public final s m() {
        return this.f12574d;
    }

    @NotNull
    public final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.b, androidx.compose.ui.unit.b> n() {
        return this.f12575e;
    }

    public final boolean o() {
        return this.f12576f;
    }

    @NotNull
    public final BoundsAnimationElement p(@NotNull androidx.compose.ui.layout.w0 w0Var, @NotNull s sVar, @NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.b, androidx.compose.ui.unit.b> function2, boolean z10) {
        return new BoundsAnimationElement(w0Var, sVar, function2, z10);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public q a() {
        return new q(this.f12573c, this.f12574d, this.f12575e, this.f12576f);
    }

    public final boolean s() {
        return this.f12576f;
    }

    @NotNull
    public final s t() {
        return this.f12574d;
    }

    @NotNull
    public String toString() {
        return "BoundsAnimationElement(lookaheadScope=" + this.f12573c + ", boundsTransform=" + this.f12574d + ", resolveMeasureConstraints=" + this.f12575e + ", animateMotionFrameOfReference=" + this.f12576f + ')';
    }

    @NotNull
    public final androidx.compose.ui.layout.w0 u() {
        return this.f12573c;
    }

    @NotNull
    public final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.b, androidx.compose.ui.unit.b> v() {
        return this.f12575e;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull q qVar) {
        qVar.C9(this.f12573c);
        qVar.B9(this.f12574d);
        qVar.D9(this.f12575e);
        qVar.A9(this.f12576f);
    }
}
