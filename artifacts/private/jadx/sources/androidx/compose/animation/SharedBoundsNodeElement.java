package androidx.compose.animation;

import androidx.compose.ui.platform.t2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class SharedBoundsNodeElement extends androidx.compose.ui.node.e1<v0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12590d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f12591c;

    public SharedBoundsNodeElement(@NotNull y0 y0Var) {
        this.f12591c = y0Var;
    }

    public static /* synthetic */ SharedBoundsNodeElement n(SharedBoundsNodeElement sharedBoundsNodeElement, y0 y0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = sharedBoundsNodeElement.f12591c;
        }
        return sharedBoundsNodeElement.m(y0Var);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedBoundsNodeElement) && Intrinsics.areEqual(this.f12591c, ((SharedBoundsNodeElement) obj).f12591c);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f12591c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("sharedBounds");
        t2Var.b().c("sharedElementState", this.f12591c);
    }

    @NotNull
    public final y0 l() {
        return this.f12591c;
    }

    @NotNull
    public final SharedBoundsNodeElement m(@NotNull y0 y0Var) {
        return new SharedBoundsNodeElement(y0Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public v0 a() {
        return new v0(this.f12591c);
    }

    @NotNull
    public final y0 p() {
        return this.f12591c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull v0 v0Var) {
        v0Var.I9(this.f12591c);
    }

    @NotNull
    public String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.f12591c + ')';
    }
}
