package androidx.compose.ui.layout;

import com.sun.jna.Callback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class OnVisibilityChangedElement extends androidx.compose.ui.node.e1<b2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f39231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f39232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final d0 f39233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<Boolean, Unit> f39234f;

    /* JADX WARN: Multi-variable type inference failed */
    public OnVisibilityChangedElement(long j10, float f10, @Nullable d0 d0Var, @NotNull Function1<? super Boolean, Unit> function1) {
        this.f39231c = j10;
        this.f39232d = f10;
        this.f39233e = d0Var;
        this.f39234f = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && OnVisibilityChangedElement.class == obj.getClass()) {
            OnVisibilityChangedElement onVisibilityChangedElement = (OnVisibilityChangedElement) obj;
            return this.f39231c == onVisibilityChangedElement.f39231c && this.f39232d == onVisibilityChangedElement.f39232d && Intrinsics.areEqual(this.f39233e, onVisibilityChangedElement.f39233e) && this.f39234f == onVisibilityChangedElement.f39234f;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.f39231c) * 31) + Float.hashCode(this.f39232d)) * 31;
        d0 d0Var = this.f39233e;
        return ((iHashCode + (d0Var != null ? d0Var.hashCode() : 0)) * 31) + this.f39234f.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("onViewportVisibilityChanged");
        t2Var.b().c("minDurationMs", Long.valueOf(this.f39231c));
        t2Var.b().c("minFractionVisible", Float.valueOf(this.f39232d));
        t2Var.b().c("viewportRef", this.f39233e);
        t2Var.b().c(Callback.METHOD_NAME, this.f39234f);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public b2 a() {
        return new b2(this.f39231c, this.f39232d, this.f39233e, this.f39234f);
    }

    @NotNull
    public final Function1<Boolean, Unit> m() {
        return this.f39234f;
    }

    public final long n() {
        return this.f39231c;
    }

    public final float o() {
        return this.f39232d;
    }

    @Nullable
    public final d0 p() {
        return this.f39233e;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull b2 b2Var) {
        b2Var.Q9(this.f39231c);
        b2Var.R9(this.f39232d);
        b2Var.J9(this.f39234f);
        b2Var.S9(this.f39233e);
        b2Var.x9();
    }
}
