package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class d extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.layout.a f15953s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f15954t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f15955v;

    public /* synthetic */ d(androidx.compose.ui.layout.a aVar, float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, f10, f11);
    }

    public final void A9(float f10) {
        this.f15954t = f10;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        return c.c(c1Var, this.f15953s, this.f15954t, this.f15955v, z0Var, j10);
    }

    public final float v9() {
        return this.f15955v;
    }

    @NotNull
    public final androidx.compose.ui.layout.a w9() {
        return this.f15953s;
    }

    public final float x9() {
        return this.f15954t;
    }

    public final void y9(float f10) {
        this.f15955v = f10;
    }

    public final void z9(@NotNull androidx.compose.ui.layout.a aVar) {
        this.f15953s = aVar;
    }

    private d(androidx.compose.ui.layout.a aVar, float f10, float f11) {
        this.f15953s = aVar;
        this.f15954t = f10;
        this.f15955v = f11;
    }
}
