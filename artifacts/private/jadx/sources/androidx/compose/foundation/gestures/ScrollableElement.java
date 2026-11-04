package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class ScrollableElement extends androidx.compose.ui.node.e1<u4> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final v4 f14300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final q3 f14301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.x3 f14302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f14303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f14304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final c3 f14305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.interaction.j f14306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final m0 f14307j;

    public ScrollableElement(@NotNull v4 v4Var, @NotNull q3 q3Var, @Nullable androidx.compose.foundation.x3 x3Var, boolean z10, boolean z11, @Nullable c3 c3Var, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable m0 m0Var) {
        this.f14300c = v4Var;
        this.f14301d = q3Var;
        this.f14302e = x3Var;
        this.f14303f = z10;
        this.f14304g = z11;
        this.f14305h = c3Var;
        this.f14306i = jVar;
        this.f14307j = m0Var;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return Intrinsics.areEqual(this.f14300c, scrollableElement.f14300c) && this.f14301d == scrollableElement.f14301d && Intrinsics.areEqual(this.f14302e, scrollableElement.f14302e) && this.f14303f == scrollableElement.f14303f && this.f14304g == scrollableElement.f14304g && Intrinsics.areEqual(this.f14305h, scrollableElement.f14305h) && Intrinsics.areEqual(this.f14306i, scrollableElement.f14306i) && Intrinsics.areEqual(this.f14307j, scrollableElement.f14307j);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((this.f14300c.hashCode() * 31) + this.f14301d.hashCode()) * 31;
        androidx.compose.foundation.x3 x3Var = this.f14302e;
        int iHashCode2 = (((((iHashCode + (x3Var != null ? x3Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.f14303f)) * 31) + Boolean.hashCode(this.f14304g)) * 31;
        c3 c3Var = this.f14305h;
        int iHashCode3 = (iHashCode2 + (c3Var != null ? c3Var.hashCode() : 0)) * 31;
        androidx.compose.foundation.interaction.j jVar = this.f14306i;
        int iHashCode4 = (iHashCode3 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        m0 m0Var = this.f14307j;
        return iHashCode4 + (m0Var != null ? m0Var.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("scrollable");
        t2Var.b().c(io.sentry.protocol.e.c.f306223k, this.f14301d);
        t2Var.b().c("state", this.f14300c);
        t2Var.b().c("overscrollEffect", this.f14302e);
        t2Var.b().c("enabled", Boolean.valueOf(this.f14303f));
        t2Var.b().c("reverseDirection", Boolean.valueOf(this.f14304g));
        t2Var.b().c("flingBehavior", this.f14305h);
        t2Var.b().c("interactionSource", this.f14306i);
        t2Var.b().c("bringIntoViewSpec", this.f14307j);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public u4 a() {
        return new u4(this.f14300c, this.f14302e, this.f14305h, this.f14301d, this.f14303f, this.f14304g, this.f14306i, this.f14307j);
    }

    @Nullable
    public final m0 m() {
        return this.f14307j;
    }

    public final boolean n() {
        return this.f14303f;
    }

    @Nullable
    public final c3 o() {
        return this.f14305h;
    }

    @Nullable
    public final androidx.compose.foundation.interaction.j p() {
        return this.f14306i;
    }

    @NotNull
    public final q3 q() {
        return this.f14301d;
    }

    @Nullable
    public final androidx.compose.foundation.x3 r() {
        return this.f14302e;
    }

    public final boolean s() {
        return this.f14304g;
    }

    @NotNull
    public final v4 t() {
        return this.f14300c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull u4 u4Var) {
        u4Var.ua(this.f14300c, this.f14301d, this.f14302e, this.f14303f, this.f14304g, this.f14305h, this.f14306i, this.f14307j);
    }
}
