package androidx.compose.material3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class ThumbElement extends androidx.compose.ui.node.e1<s50> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.interaction.h f25920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.y0<Float> f25922e;

    public ThumbElement(@NotNull androidx.compose.foundation.interaction.h hVar, boolean z10, @NotNull androidx.compose.animation.core.y0<Float> y0Var) {
        this.f25920c = hVar;
        this.f25921d = z10;
        this.f25922e = y0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThumbElement p(ThumbElement thumbElement, androidx.compose.foundation.interaction.h hVar, boolean z10, androidx.compose.animation.core.y0 y0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = thumbElement.f25920c;
        }
        if ((i10 & 2) != 0) {
            z10 = thumbElement.f25921d;
        }
        if ((i10 & 4) != 0) {
            y0Var = thumbElement.f25922e;
        }
        return thumbElement.o(hVar, z10, y0Var);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return Intrinsics.areEqual(this.f25920c, thumbElement.f25920c) && this.f25921d == thumbElement.f25921d && Intrinsics.areEqual(this.f25922e, thumbElement.f25922e);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((this.f25920c.hashCode() * 31) + Boolean.hashCode(this.f25921d)) * 31) + this.f25922e.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("switchThumb");
        t2Var.b().c("interactionSource", this.f25920c);
        t2Var.b().c("checked", Boolean.valueOf(this.f25921d));
        t2Var.b().c("animationSpec", this.f25922e);
    }

    @NotNull
    public final androidx.compose.foundation.interaction.h l() {
        return this.f25920c;
    }

    public final boolean m() {
        return this.f25921d;
    }

    @NotNull
    public final androidx.compose.animation.core.y0<Float> n() {
        return this.f25922e;
    }

    @NotNull
    public final ThumbElement o(@NotNull androidx.compose.foundation.interaction.h hVar, boolean z10, @NotNull androidx.compose.animation.core.y0<Float> y0Var) {
        return new ThumbElement(hVar, z10, y0Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public s50 a() {
        return new s50(this.f25920c, this.f25921d, this.f25922e);
    }

    @NotNull
    public final androidx.compose.animation.core.y0<Float> r() {
        return this.f25922e;
    }

    public final boolean s() {
        return this.f25921d;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.h t() {
        return this.f25920c;
    }

    @NotNull
    public String toString() {
        return "ThumbElement(interactionSource=" + this.f25920c + ", checked=" + this.f25921d + ", animationSpec=" + this.f25922e + ')';
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull s50 s50Var) {
        s50Var.G9(this.f25920c);
        if (s50Var.B9() != this.f25921d) {
            androidx.compose.ui.node.j0.b(s50Var);
        }
        s50Var.F9(this.f25921d);
        s50Var.E9(this.f25922e);
        s50Var.H9();
    }
}
