package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class Scrollable2DElement extends androidx.compose.ui.node.e1<f4> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final g4 f14295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.x3 f14296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f14297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final c3 f14298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.interaction.j f14299g;

    public Scrollable2DElement(@NotNull g4 g4Var, @Nullable androidx.compose.foundation.x3 x3Var, boolean z10, @Nullable c3 c3Var, @Nullable androidx.compose.foundation.interaction.j jVar) {
        this.f14295c = g4Var;
        this.f14296d = x3Var;
        this.f14297e = z10;
        this.f14298f = c3Var;
        this.f14299g = jVar;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scrollable2DElement)) {
            return false;
        }
        Scrollable2DElement scrollable2DElement = (Scrollable2DElement) obj;
        return Intrinsics.areEqual(this.f14295c, scrollable2DElement.f14295c) && Intrinsics.areEqual(this.f14296d, scrollable2DElement.f14296d) && this.f14297e == scrollable2DElement.f14297e && Intrinsics.areEqual(this.f14298f, scrollable2DElement.f14298f) && Intrinsics.areEqual(this.f14299g, scrollable2DElement.f14299g);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = this.f14295c.hashCode() * 31;
        androidx.compose.foundation.x3 x3Var = this.f14296d;
        int iHashCode2 = (((iHashCode + (x3Var != null ? x3Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.f14297e)) * 31;
        c3 c3Var = this.f14298f;
        int iHashCode3 = (iHashCode2 + (c3Var != null ? c3Var.hashCode() : 0)) * 31;
        androidx.compose.foundation.interaction.j jVar = this.f14299g;
        return iHashCode3 + (jVar != null ? jVar.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("scrollable2D");
        t2Var.b().c("state", this.f14295c);
        t2Var.b().c("overscrollEffect", this.f14296d);
        t2Var.b().c("enabled", Boolean.valueOf(this.f14297e));
        t2Var.b().c("flingBehavior", this.f14298f);
        t2Var.b().c("interactionSource", this.f14299g);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f4 a() {
        return new f4(this.f14295c, this.f14296d, this.f14298f, this.f14297e, this.f14299g);
    }

    public final boolean m() {
        return this.f14297e;
    }

    @Nullable
    public final c3 n() {
        return this.f14298f;
    }

    @Nullable
    public final androidx.compose.foundation.interaction.j o() {
        return this.f14299g;
    }

    @Nullable
    public final androidx.compose.foundation.x3 p() {
        return this.f14296d;
    }

    @NotNull
    public final g4 q() {
        return this.f14295c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull f4 f4Var) {
        f4Var.oa(this.f14295c, this.f14296d, this.f14297e, this.f14298f, this.f14299g);
    }
}
