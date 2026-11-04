package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class LazyLayoutAnimateItemElement extends androidx.compose.ui.node.e1<p> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f17226f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final androidx.compose.animation.core.y0<Float> f17227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> f17228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final androidx.compose.animation.core.y0<Float> f17229e;

    public LazyLayoutAnimateItemElement(@Nullable androidx.compose.animation.core.y0<Float> y0Var, @Nullable androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var2, @Nullable androidx.compose.animation.core.y0<Float> y0Var3) {
        this.f17227c = y0Var;
        this.f17228d = y0Var2;
        this.f17229e = y0Var3;
    }

    private final androidx.compose.animation.core.y0<Float> l() {
        return this.f17227c;
    }

    private final androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> m() {
        return this.f17228d;
    }

    private final androidx.compose.animation.core.y0<Float> n() {
        return this.f17229e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LazyLayoutAnimateItemElement p(LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement, androidx.compose.animation.core.y0 y0Var, androidx.compose.animation.core.y0 y0Var2, androidx.compose.animation.core.y0 y0Var3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = lazyLayoutAnimateItemElement.f17227c;
        }
        if ((i10 & 2) != 0) {
            y0Var2 = lazyLayoutAnimateItemElement.f17228d;
        }
        if ((i10 & 4) != 0) {
            y0Var3 = lazyLayoutAnimateItemElement.f17229e;
        }
        return lazyLayoutAnimateItemElement.o(y0Var, y0Var2, y0Var3);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return Intrinsics.areEqual(this.f17227c, lazyLayoutAnimateItemElement.f17227c) && Intrinsics.areEqual(this.f17228d, lazyLayoutAnimateItemElement.f17228d) && Intrinsics.areEqual(this.f17229e, lazyLayoutAnimateItemElement.f17229e);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        androidx.compose.animation.core.y0<Float> y0Var = this.f17227c;
        int iHashCode = (y0Var == null ? 0 : y0Var.hashCode()) * 31;
        androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var2 = this.f17228d;
        int iHashCode2 = (iHashCode + (y0Var2 == null ? 0 : y0Var2.hashCode())) * 31;
        androidx.compose.animation.core.y0<Float> y0Var3 = this.f17229e;
        return iHashCode2 + (y0Var3 != null ? y0Var3.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("animateItem");
        t2Var.b().c("fadeInSpec", this.f17227c);
        t2Var.b().c("placementSpec", this.f17228d);
        t2Var.b().c("fadeOutSpec", this.f17229e);
    }

    @NotNull
    public final LazyLayoutAnimateItemElement o(@Nullable androidx.compose.animation.core.y0<Float> y0Var, @Nullable androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var2, @Nullable androidx.compose.animation.core.y0<Float> y0Var3) {
        return new LazyLayoutAnimateItemElement(y0Var, y0Var2, y0Var3);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public p a() {
        return new p(this.f17227c, this.f17228d, this.f17229e);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull p pVar) {
        pVar.y9(this.f17227c);
        pVar.A9(this.f17228d);
        pVar.z9(this.f17229e);
    }

    @NotNull
    public String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f17227c + ", placementSpec=" + this.f17228d + ", fadeOutSpec=" + this.f17229e + ')';
    }
}
