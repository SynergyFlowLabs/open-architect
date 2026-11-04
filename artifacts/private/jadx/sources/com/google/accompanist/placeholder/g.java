package com.google.accompanist.placeholder;

import androidx.compose.animation.core.g1;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.q0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.r;
import n0.h;
import n0.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class g implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final g1<Float> f103168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f103169d;

    public /* synthetic */ g(long j10, g1 g1Var, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, g1Var, f10);
    }

    private final long d() {
        return this.f103167b;
    }

    private final float f() {
        return this.f103169d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g h(g gVar, long j10, g1 g1Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = gVar.f103167b;
        }
        if ((i10 & 2) != 0) {
            g1Var = gVar.f103168c;
        }
        if ((i10 & 4) != 0) {
            f10 = gVar.f103169d;
        }
        return gVar.g(j10, g1Var, f10);
    }

    @Override // com.google.accompanist.placeholder.c
    @NotNull
    public i0 a(float f10, long j10) {
        return i0.a.l(i0.f37796b, CollectionsKt.listOf((Object[]) new q0[]{q0.n(q0.w(this.f103167b, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), q0.n(this.f103167b), q0.n(q0.w(this.f103167b, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))}), h.a(0.0f, 0.0f), r.t(Math.max(n.t(j10), n.m(j10)) * f10 * 2, 0.01f), 0, 8, null);
    }

    @Override // com.google.accompanist.placeholder.c
    @NotNull
    public g1<Float> b() {
        return this.f103168c;
    }

    @Override // com.google.accompanist.placeholder.c
    public float c(float f10) {
        float f11 = this.f103169d;
        return f10 <= f11 ? androidx.compose.ui.util.e.r(0.0f, 1.0f, f10 / f11) : androidx.compose.ui.util.e.r(1.0f, 0.0f, (f10 - f11) / (1.0f - f11));
    }

    @NotNull
    public final g1<Float> e() {
        return this.f103168c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return q0.y(this.f103167b, gVar.f103167b) && Intrinsics.areEqual(this.f103168c, gVar.f103168c) && Float.compare(this.f103169d, gVar.f103169d) == 0;
    }

    @NotNull
    public final g g(long j10, @NotNull g1<Float> animationSpec, float f10) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new g(j10, animationSpec, f10, null);
    }

    public int hashCode() {
        return (((q0.K(this.f103167b) * 31) + this.f103168c.hashCode()) * 31) + Float.hashCode(this.f103169d);
    }

    @NotNull
    public String toString() {
        return "Shimmer(highlightColor=" + ((Object) q0.L(this.f103167b)) + ", animationSpec=" + this.f103168c + ", progressForMaxAlpha=" + this.f103169d + ')';
    }

    private g(long j10, g1<Float> animationSpec, float f10) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.f103167b = j10;
        this.f103168c = animationSpec;
        this.f103169d = f10;
    }

    public /* synthetic */ g(long j10, g1 g1Var, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, g1Var, (i10 & 4) != 0 ? 0.6f : f10, null);
    }
}
