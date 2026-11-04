package androidx.compose.animation;

import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class SizeAnimationModifierElement extends androidx.compose.ui.node.e1<f1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> f12592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e f12593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, Unit> f12594e;

    /* JADX WARN: Multi-variable type inference failed */
    public SizeAnimationModifierElement(@NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> y0Var, @NotNull androidx.compose.ui.e eVar, @Nullable Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.u, Unit> function2) {
        this.f12592c = y0Var;
        this.f12593d = eVar;
        this.f12594e = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SizeAnimationModifierElement p(SizeAnimationModifierElement sizeAnimationModifierElement, androidx.compose.animation.core.y0 y0Var, androidx.compose.ui.e eVar, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = sizeAnimationModifierElement.f12592c;
        }
        if ((i10 & 2) != 0) {
            eVar = sizeAnimationModifierElement.f12593d;
        }
        if ((i10 & 4) != 0) {
            function2 = sizeAnimationModifierElement.f12594e;
        }
        return sizeAnimationModifierElement.o(y0Var, eVar, function2);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return Intrinsics.areEqual(this.f12592c, sizeAnimationModifierElement.f12592c) && Intrinsics.areEqual(this.f12593d, sizeAnimationModifierElement.f12593d) && Intrinsics.areEqual(this.f12594e, sizeAnimationModifierElement.f12594e);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((this.f12592c.hashCode() * 31) + this.f12593d.hashCode()) * 31;
        Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, Unit> function2 = this.f12594e;
        return iHashCode + (function2 == null ? 0 : function2.hashCode());
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("animateContentSize");
        t2Var.b().c("animationSpec", this.f12592c);
        t2Var.b().c("alignment", this.f12593d);
        t2Var.b().c("finishedListener", this.f12594e);
    }

    @NotNull
    public final androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> l() {
        return this.f12592c;
    }

    @NotNull
    public final androidx.compose.ui.e m() {
        return this.f12593d;
    }

    @Nullable
    public final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, Unit> n() {
        return this.f12594e;
    }

    @NotNull
    public final SizeAnimationModifierElement o(@NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> y0Var, @NotNull androidx.compose.ui.e eVar, @Nullable Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.u, Unit> function2) {
        return new SizeAnimationModifierElement(y0Var, eVar, function2);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public f1 a() {
        return new f1(this.f12592c, this.f12593d, this.f12594e);
    }

    @NotNull
    public final androidx.compose.ui.e r() {
        return this.f12593d;
    }

    @NotNull
    public final androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> s() {
        return this.f12592c;
    }

    @Nullable
    public final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, Unit> t() {
        return this.f12594e;
    }

    @NotNull
    public String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.f12592c + ", alignment=" + this.f12593d + ", finishedListener=" + this.f12594e + ')';
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull f1 f1Var) {
        f1Var.C9(this.f12592c);
        f1Var.D9(this.f12594e);
        f1Var.A9(this.f12593d);
    }
}
