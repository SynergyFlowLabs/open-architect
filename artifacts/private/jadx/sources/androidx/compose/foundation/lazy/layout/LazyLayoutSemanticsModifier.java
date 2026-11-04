package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.q3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends androidx.compose.ui.node.e1<x1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<l0> f17260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final q1 f17261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final q3 f17262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f17263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f17264g;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutSemanticsModifier(@NotNull Function0<? extends l0> function0, @NotNull q1 q1Var, @NotNull q3 q3Var, boolean z10, boolean z11) {
        this.f17260c = function0;
        this.f17261d = q1Var;
        this.f17262e = q3Var;
        this.f17263f = z10;
        this.f17264g = z11;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f17260c == lazyLayoutSemanticsModifier.f17260c && Intrinsics.areEqual(this.f17261d, lazyLayoutSemanticsModifier.f17261d) && this.f17262e == lazyLayoutSemanticsModifier.f17262e && this.f17263f == lazyLayoutSemanticsModifier.f17263f && this.f17264g == lazyLayoutSemanticsModifier.f17264g;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((((((this.f17260c.hashCode() * 31) + this.f17261d.hashCode()) * 31) + this.f17262e.hashCode()) * 31) + Boolean.hashCode(this.f17263f)) * 31) + Boolean.hashCode(this.f17264g);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public x1 a() {
        return new x1(this.f17260c, this.f17261d, this.f17262e, this.f17263f, this.f17264g);
    }

    @NotNull
    public final Function0<l0> m() {
        return this.f17260c;
    }

    @NotNull
    public final q3 n() {
        return this.f17262e;
    }

    public final boolean o() {
        return this.f17264g;
    }

    @NotNull
    public final q1 p() {
        return this.f17261d;
    }

    public final boolean q() {
        return this.f17263f;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull x1 x1Var) {
        x1Var.F9(this.f17260c, this.f17261d, this.f17262e, this.f17263f, this.f17264g);
    }
}
