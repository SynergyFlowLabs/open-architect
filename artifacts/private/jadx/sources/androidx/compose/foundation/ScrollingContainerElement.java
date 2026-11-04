package androidx.compose.foundation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class ScrollingContainerElement extends androidx.compose.ui.node.e1<e5> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.gestures.v4 f13893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.gestures.q3 f13894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f13895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f13896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.gestures.c3 f13897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.interaction.j f13898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.gestures.m0 f13899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f13900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final x3 f13901k;

    public ScrollingContainerElement(@NotNull androidx.compose.foundation.gestures.v4 v4Var, @NotNull androidx.compose.foundation.gestures.q3 q3Var, boolean z10, boolean z11, @Nullable androidx.compose.foundation.gestures.c3 c3Var, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.foundation.gestures.m0 m0Var, boolean z12, @Nullable x3 x3Var) {
        this.f13893c = v4Var;
        this.f13894d = q3Var;
        this.f13895e = z10;
        this.f13896f = z11;
        this.f13897g = c3Var;
        this.f13898h = jVar;
        this.f13899i = m0Var;
        this.f13900j = z12;
        this.f13901k = x3Var;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return Intrinsics.areEqual(this.f13893c, scrollingContainerElement.f13893c) && this.f13894d == scrollingContainerElement.f13894d && this.f13895e == scrollingContainerElement.f13895e && this.f13896f == scrollingContainerElement.f13896f && Intrinsics.areEqual(this.f13897g, scrollingContainerElement.f13897g) && Intrinsics.areEqual(this.f13898h, scrollingContainerElement.f13898h) && Intrinsics.areEqual(this.f13899i, scrollingContainerElement.f13899i) && this.f13900j == scrollingContainerElement.f13900j && Intrinsics.areEqual(this.f13901k, scrollingContainerElement.f13901k);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((((((this.f13893c.hashCode() * 31) + this.f13894d.hashCode()) * 31) + Boolean.hashCode(this.f13895e)) * 31) + Boolean.hashCode(this.f13896f)) * 31;
        androidx.compose.foundation.gestures.c3 c3Var = this.f13897g;
        int iHashCode2 = (iHashCode + (c3Var != null ? c3Var.hashCode() : 0)) * 31;
        androidx.compose.foundation.interaction.j jVar = this.f13898h;
        int iHashCode3 = (iHashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        androidx.compose.foundation.gestures.m0 m0Var = this.f13899i;
        int iHashCode4 = (((iHashCode3 + (m0Var != null ? m0Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.f13900j)) * 31;
        x3 x3Var = this.f13901k;
        return iHashCode4 + (x3Var != null ? x3Var.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("scrollingContainer");
        t2Var.b().c("state", this.f13893c);
        t2Var.b().c(io.sentry.protocol.e.c.f306223k, this.f13894d);
        t2Var.b().c("enabled", Boolean.valueOf(this.f13895e));
        t2Var.b().c("reverseScrolling", Boolean.valueOf(this.f13896f));
        t2Var.b().c("flingBehavior", this.f13897g);
        t2Var.b().c("interactionSource", this.f13898h);
        t2Var.b().c("bringIntoViewSpec", this.f13899i);
        t2Var.b().c("useLocalOverscrollFactory", Boolean.valueOf(this.f13900j));
        t2Var.b().c("overscrollEffect", this.f13901k);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e5 a() {
        return new e5(this.f13893c, this.f13894d, this.f13895e, this.f13896f, this.f13897g, this.f13898h, this.f13899i, this.f13900j, this.f13901k);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull e5 e5Var) {
        e5Var.L9(this.f13893c, this.f13894d, this.f13900j, this.f13901k, this.f13895e, this.f13896f, this.f13897g, this.f13898h, this.f13899i);
    }
}
