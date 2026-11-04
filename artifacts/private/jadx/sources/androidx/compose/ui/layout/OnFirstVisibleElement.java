package androidx.compose.ui.layout;

import com.sun.jna.Callback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class OnFirstVisibleElement extends androidx.compose.ui.node.e1<n1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f39221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f39222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final d0 f39223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f39224f;

    public OnFirstVisibleElement(long j10, float f10, @Nullable d0 d0Var, @NotNull Function0<Unit> function0) {
        this.f39221c = j10;
        this.f39222d = f10;
        this.f39223e = d0Var;
        this.f39224f = function0;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && OnFirstVisibleElement.class == obj.getClass()) {
            OnFirstVisibleElement onFirstVisibleElement = (OnFirstVisibleElement) obj;
            return this.f39221c == onFirstVisibleElement.f39221c && this.f39222d == onFirstVisibleElement.f39222d && Intrinsics.areEqual(this.f39223e, onFirstVisibleElement.f39223e) && this.f39224f == onFirstVisibleElement.f39224f;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.f39221c) * 31) + Float.hashCode(this.f39222d)) * 31;
        d0 d0Var = this.f39223e;
        return ((iHashCode + (d0Var != null ? d0Var.hashCode() : 0)) * 31) + this.f39224f.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("onFirstVisible");
        t2Var.b().c("minDurationMs", Long.valueOf(this.f39221c));
        t2Var.b().c("minFractionVisible", Float.valueOf(this.f39222d));
        t2Var.b().c("viewportBounds", this.f39223e);
        t2Var.b().c(Callback.METHOD_NAME, this.f39224f);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public n1 a() {
        return new n1(this.f39221c, this.f39222d, this.f39223e, this.f39224f);
    }

    @NotNull
    public final Function0<Unit> m() {
        return this.f39224f;
    }

    public final long n() {
        return this.f39221c;
    }

    public final float o() {
        return this.f39222d;
    }

    @Nullable
    public final d0 p() {
        return this.f39223e;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull n1 n1Var) {
        n1Var.O9(this.f39221c);
        n1Var.P9(this.f39222d);
        n1Var.I9(this.f39224f);
        n1Var.Q9(this.f39223e);
        n1Var.x9();
    }
}
