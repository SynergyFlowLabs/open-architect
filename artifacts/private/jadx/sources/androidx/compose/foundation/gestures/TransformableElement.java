package androidx.compose.foundation.gestures;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class TransformableElement extends androidx.compose.ui.node.e1<o5> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final p5 f14308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<n0.g, Boolean> f14309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f14310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f14311f;

    /* JADX WARN: Multi-variable type inference failed */
    public TransformableElement(@NotNull p5 p5Var, @NotNull Function1<? super n0.g, Boolean> function1, boolean z10, boolean z11) {
        this.f14308c = p5Var;
        this.f14309d = function1;
        this.f14310e = z10;
        this.f14311f = z11;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransformableElement.class != obj.getClass()) {
            return false;
        }
        TransformableElement transformableElement = (TransformableElement) obj;
        return Intrinsics.areEqual(this.f14308c, transformableElement.f14308c) && this.f14309d == transformableElement.f14309d && this.f14310e == transformableElement.f14310e && this.f14311f == transformableElement.f14311f;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((((this.f14308c.hashCode() * 31) + this.f14309d.hashCode()) * 31) + Boolean.hashCode(this.f14310e)) * 31) + Boolean.hashCode(this.f14311f);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("transformable");
        t2Var.b().c("state", this.f14308c);
        t2Var.b().c("canPan", this.f14309d);
        t2Var.b().c("enabled", Boolean.valueOf(this.f14311f));
        t2Var.b().c("lockRotationOnZoomPan", Boolean.valueOf(this.f14310e));
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public o5 a() {
        return new o5(this.f14308c, this.f14309d, this.f14310e, this.f14311f);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull o5 o5Var) {
        o5Var.M9(this.f14308c, this.f14309d, this.f14310e, this.f14311f);
    }
}
