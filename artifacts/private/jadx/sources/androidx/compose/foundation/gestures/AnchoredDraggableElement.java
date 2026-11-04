package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class AnchoredDraggableElement<T> extends androidx.compose.ui.node.e1<o<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b0<T> f14266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final q3 f14267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f14268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Boolean f14269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.interaction.j f14270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final Boolean f14271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.x3 f14272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final c3 f14273j;

    public /* synthetic */ AnchoredDraggableElement(b0 b0Var, q3 q3Var, boolean z10, Boolean bool, androidx.compose.foundation.interaction.j jVar, Boolean bool2, androidx.compose.foundation.x3 x3Var, c3 c3Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b0Var, q3Var, z10, bool, jVar, (i10 & 32) != 0 ? null : bool2, x3Var, (i10 & 128) != 0 ? null : c3Var);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableElement)) {
            return false;
        }
        AnchoredDraggableElement anchoredDraggableElement = (AnchoredDraggableElement) obj;
        return Intrinsics.areEqual(this.f14266c, anchoredDraggableElement.f14266c) && this.f14267d == anchoredDraggableElement.f14267d && this.f14268e == anchoredDraggableElement.f14268e && Intrinsics.areEqual(this.f14269f, anchoredDraggableElement.f14269f) && Intrinsics.areEqual(this.f14270g, anchoredDraggableElement.f14270g) && Intrinsics.areEqual(this.f14271h, anchoredDraggableElement.f14271h) && Intrinsics.areEqual(this.f14272i, anchoredDraggableElement.f14272i) && Intrinsics.areEqual(this.f14273j, anchoredDraggableElement.f14273j);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((((this.f14266c.hashCode() * 31) + this.f14267d.hashCode()) * 31) + Boolean.hashCode(this.f14268e)) * 31;
        Boolean bool = this.f14269f;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        androidx.compose.foundation.interaction.j jVar = this.f14270g;
        int iHashCode3 = (iHashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        Boolean bool2 = this.f14271h;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        androidx.compose.foundation.x3 x3Var = this.f14272i;
        int iHashCode5 = (iHashCode4 + (x3Var != null ? x3Var.hashCode() : 0)) * 31;
        c3 c3Var = this.f14273j;
        return iHashCode5 + (c3Var != null ? c3Var.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("anchoredDraggable");
        t2Var.b().c("state", this.f14266c);
        t2Var.b().c(io.sentry.protocol.e.c.f306223k, this.f14267d);
        t2Var.b().c("enabled", Boolean.valueOf(this.f14268e));
        t2Var.b().c("reverseDirection", this.f14269f);
        t2Var.b().c("interactionSource", this.f14270g);
        t2Var.b().c("startDragImmediately", this.f14271h);
        t2Var.b().c("overscrollEffect", this.f14272i);
        t2Var.b().c("flingBehavior", this.f14273j);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public o<T> a() {
        return new o<>(this.f14266c, this.f14267d, this.f14268e, this.f14269f, this.f14270g, this.f14272i, this.f14271h, this.f14273j);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull o<T> oVar) {
        oVar.Aa(this.f14266c, this.f14267d, this.f14268e, this.f14269f, this.f14270g, this.f14272i, this.f14271h, this.f14273j);
    }

    public AnchoredDraggableElement(@NotNull b0<T> b0Var, @NotNull q3 q3Var, boolean z10, @Nullable Boolean bool, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable Boolean bool2, @Nullable androidx.compose.foundation.x3 x3Var, @Nullable c3 c3Var) {
        this.f14266c = b0Var;
        this.f14267d = q3Var;
        this.f14268e = z10;
        this.f14269f = bool;
        this.f14270g = jVar;
        this.f14271h = bool2;
        this.f14272i = x3Var;
        this.f14273j = c3Var;
    }
}
