package androidx.compose.animation;

import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class RenderInTransitionOverlayNodeElement extends androidx.compose.ui.node.e1<s0> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f12585g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private b1 f12586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Function0<Boolean> f12587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f12588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.ui.unit.w, androidx.compose.ui.unit.d, k2> f12589f;

    /* JADX WARN: Multi-variable type inference failed */
    public RenderInTransitionOverlayNodeElement(@NotNull b1 b1Var, @NotNull Function0<Boolean> function0, float f10, @NotNull Function2<? super androidx.compose.ui.unit.w, ? super androidx.compose.ui.unit.d, ? extends k2> function2) {
        this.f12586c = b1Var;
        this.f12587d = function0;
        this.f12588e = f10;
        this.f12589f = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RenderInTransitionOverlayNodeElement q(RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement, b1 b1Var, Function0 function0, float f10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            b1Var = renderInTransitionOverlayNodeElement.f12586c;
        }
        if ((i10 & 2) != 0) {
            function0 = renderInTransitionOverlayNodeElement.f12587d;
        }
        if ((i10 & 4) != 0) {
            f10 = renderInTransitionOverlayNodeElement.f12588e;
        }
        if ((i10 & 8) != 0) {
            function2 = renderInTransitionOverlayNodeElement.f12589f;
        }
        return renderInTransitionOverlayNodeElement.p(b1Var, function0, f10, function2);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof RenderInTransitionOverlayNodeElement) {
            RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement = (RenderInTransitionOverlayNodeElement) obj;
            if (Intrinsics.areEqual(this.f12586c, renderInTransitionOverlayNodeElement.f12586c) && this.f12587d == renderInTransitionOverlayNodeElement.f12587d && this.f12588e == renderInTransitionOverlayNodeElement.f12588e && this.f12589f == renderInTransitionOverlayNodeElement.f12589f) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((((this.f12586c.hashCode() * 31) + this.f12587d.hashCode()) * 31) + Float.hashCode(this.f12588e)) * 31) + this.f12589f.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("renderInSharedTransitionOverlay");
        t2Var.b().c("sharedTransitionScope", this.f12586c);
        t2Var.b().c("renderInOverlay", this.f12587d);
        t2Var.b().c("zIndexInOverlay", Float.valueOf(this.f12588e));
        t2Var.b().c("clipInOverlayDuringTransition", this.f12589f);
    }

    @NotNull
    public final b1 l() {
        return this.f12586c;
    }

    @NotNull
    public final Function0<Boolean> m() {
        return this.f12587d;
    }

    public final float n() {
        return this.f12588e;
    }

    @NotNull
    public final Function2<androidx.compose.ui.unit.w, androidx.compose.ui.unit.d, k2> o() {
        return this.f12589f;
    }

    @NotNull
    public final RenderInTransitionOverlayNodeElement p(@NotNull b1 b1Var, @NotNull Function0<Boolean> function0, float f10, @NotNull Function2<? super androidx.compose.ui.unit.w, ? super androidx.compose.ui.unit.d, ? extends k2> function2) {
        return new RenderInTransitionOverlayNodeElement(b1Var, function0, f10, function2);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public s0 a() {
        return new s0(this.f12586c, this.f12587d, this.f12588e, this.f12589f);
    }

    @NotNull
    public final Function2<androidx.compose.ui.unit.w, androidx.compose.ui.unit.d, k2> s() {
        return this.f12589f;
    }

    @NotNull
    public final Function0<Boolean> t() {
        return this.f12587d;
    }

    @NotNull
    public String toString() {
        return "RenderInTransitionOverlayNodeElement(sharedTransitionScope=" + this.f12586c + ", renderInOverlay=" + this.f12587d + ", zIndexInOverlay=" + this.f12588e + ", clipInOverlay=" + this.f12589f + ')';
    }

    @NotNull
    public final b1 u() {
        return this.f12586c;
    }

    public final float v() {
        return this.f12588e;
    }

    public final void w(@NotNull Function0<Boolean> function0) {
        this.f12587d = function0;
    }

    public final void y(@NotNull b1 b1Var) {
        this.f12586c = b1Var;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull s0 s0Var) {
        s0Var.D9(this.f12586c);
        s0Var.C9(this.f12587d);
        s0Var.E9(this.f12588e);
        s0Var.B9(this.f12589f);
    }
}
