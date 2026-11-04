package androidx.compose.animation;

import androidx.compose.animation.core.l3;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class EnterExitTransitionElement extends androidx.compose.ui.node.e1<c0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l3<z> f12577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private l3<z>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> f12578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> f12579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> f12580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private d0 f12581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private f0 f12582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private Function0<Boolean> f12583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private m0 f12584j;

    public EnterExitTransitionElement(@NotNull l3<z> l3Var, @Nullable l3<z>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> aVar, @Nullable l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> aVar2, @Nullable l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> aVar3, @NotNull d0 d0Var, @NotNull f0 f0Var, @NotNull Function0<Boolean> function0, @NotNull m0 m0Var) {
        this.f12577c = l3Var;
        this.f12578d = aVar;
        this.f12579e = aVar2;
        this.f12580f = aVar3;
        this.f12581g = d0Var;
        this.f12582h = f0Var;
        this.f12583i = function0;
        this.f12584j = m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnterExitTransitionElement u(EnterExitTransitionElement enterExitTransitionElement, l3 l3Var, l3.a aVar, l3.a aVar2, l3.a aVar3, d0 d0Var, f0 f0Var, Function0 function0, m0 m0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l3Var = enterExitTransitionElement.f12577c;
        }
        if ((i10 & 2) != 0) {
            aVar = enterExitTransitionElement.f12578d;
        }
        if ((i10 & 4) != 0) {
            aVar2 = enterExitTransitionElement.f12579e;
        }
        if ((i10 & 8) != 0) {
            aVar3 = enterExitTransitionElement.f12580f;
        }
        if ((i10 & 16) != 0) {
            d0Var = enterExitTransitionElement.f12581g;
        }
        if ((i10 & 32) != 0) {
            f0Var = enterExitTransitionElement.f12582h;
        }
        if ((i10 & 64) != 0) {
            function0 = enterExitTransitionElement.f12583i;
        }
        if ((i10 & 128) != 0) {
            m0Var = enterExitTransitionElement.f12584j;
        }
        Function0 function1 = function0;
        m0 m0Var2 = m0Var;
        d0 d0Var2 = d0Var;
        f0 f0Var2 = f0Var;
        return enterExitTransitionElement.t(l3Var, aVar, aVar2, aVar3, d0Var2, f0Var2, function1, m0Var2);
    }

    @Nullable
    public final l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> A() {
        return this.f12579e;
    }

    @Nullable
    public final l3<z>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> B() {
        return this.f12578d;
    }

    @Nullable
    public final l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> C() {
        return this.f12580f;
    }

    @NotNull
    public final l3<z> D() {
        return this.f12577c;
    }

    @NotNull
    public final Function0<Boolean> E() {
        return this.f12583i;
    }

    public final void F(@NotNull Function0<Boolean> function0) {
        this.f12583i = function0;
    }

    public final void G(@NotNull d0 d0Var) {
        this.f12581g = d0Var;
    }

    public final void H(@NotNull f0 f0Var) {
        this.f12582h = f0Var;
    }

    public final void I(@NotNull m0 m0Var) {
        this.f12584j = m0Var;
    }

    public final void K(@Nullable l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> aVar) {
        this.f12579e = aVar;
    }

    public final void L(@Nullable l3<z>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> aVar) {
        this.f12578d = aVar;
    }

    public final void M(@Nullable l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> aVar) {
        this.f12580f = aVar;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull c0 c0Var) {
        c0Var.Q9(this.f12577c);
        c0Var.O9(this.f12578d);
        c0Var.N9(this.f12579e);
        c0Var.P9(this.f12580f);
        c0Var.J9(this.f12581g);
        c0Var.K9(this.f12582h);
        c0Var.I9(this.f12583i);
        c0Var.L9(this.f12584j);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return Intrinsics.areEqual(this.f12577c, enterExitTransitionElement.f12577c) && Intrinsics.areEqual(this.f12578d, enterExitTransitionElement.f12578d) && Intrinsics.areEqual(this.f12579e, enterExitTransitionElement.f12579e) && Intrinsics.areEqual(this.f12580f, enterExitTransitionElement.f12580f) && Intrinsics.areEqual(this.f12581g, enterExitTransitionElement.f12581g) && Intrinsics.areEqual(this.f12582h, enterExitTransitionElement.f12582h) && Intrinsics.areEqual(this.f12583i, enterExitTransitionElement.f12583i) && Intrinsics.areEqual(this.f12584j, enterExitTransitionElement.f12584j);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = this.f12577c.hashCode() * 31;
        l3<z>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> aVar = this.f12578d;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> aVar2 = this.f12579e;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> aVar3 = this.f12580f;
        return ((((((((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.f12581g.hashCode()) * 31) + this.f12582h.hashCode()) * 31) + this.f12583i.hashCode()) * 31) + this.f12584j.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("enterExitTransition");
        t2Var.b().c("transition", this.f12577c);
        t2Var.b().c("sizeAnimation", this.f12578d);
        t2Var.b().c("offsetAnimation", this.f12579e);
        t2Var.b().c("slideAnimation", this.f12580f);
        t2Var.b().c("enter", this.f12581g);
        t2Var.b().c("exit", this.f12582h);
        t2Var.b().c("graphicsLayerBlock", this.f12584j);
    }

    @NotNull
    public final l3<z> l() {
        return this.f12577c;
    }

    @Nullable
    public final l3<z>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> m() {
        return this.f12578d;
    }

    @Nullable
    public final l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> n() {
        return this.f12579e;
    }

    @Nullable
    public final l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> o() {
        return this.f12580f;
    }

    @NotNull
    public final d0 p() {
        return this.f12581g;
    }

    @NotNull
    public final f0 q() {
        return this.f12582h;
    }

    @NotNull
    public final Function0<Boolean> r() {
        return this.f12583i;
    }

    @NotNull
    public final m0 s() {
        return this.f12584j;
    }

    @NotNull
    public final EnterExitTransitionElement t(@NotNull l3<z> l3Var, @Nullable l3<z>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> aVar, @Nullable l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> aVar2, @Nullable l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> aVar3, @NotNull d0 d0Var, @NotNull f0 f0Var, @NotNull Function0<Boolean> function0, @NotNull m0 m0Var) {
        return new EnterExitTransitionElement(l3Var, aVar, aVar2, aVar3, d0Var, f0Var, function0, m0Var);
    }

    @NotNull
    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.f12577c + ", sizeAnimation=" + this.f12578d + ", offsetAnimation=" + this.f12579e + ", slideAnimation=" + this.f12580f + ", enter=" + this.f12581g + ", exit=" + this.f12582h + ", isEnabled=" + this.f12583i + ", graphicsLayerBlock=" + this.f12584j + ')';
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public c0 a() {
        return new c0(this.f12577c, this.f12578d, this.f12579e, this.f12580f, this.f12581g, this.f12582h, this.f12583i, this.f12584j);
    }

    @NotNull
    public final d0 w() {
        return this.f12581g;
    }

    @NotNull
    public final f0 y() {
        return this.f12582h;
    }

    @NotNull
    public final m0 z() {
        return this.f12584j;
    }
}
