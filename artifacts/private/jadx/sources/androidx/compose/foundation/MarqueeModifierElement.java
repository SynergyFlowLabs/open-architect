package androidx.compose.foundation;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class MarqueeModifierElement extends androidx.compose.ui.node.e1<m3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f13886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f13887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f13888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final p3 f13889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f13890h;

    public /* synthetic */ MarqueeModifierElement(int i10, int i11, int i12, int i13, p3 p3Var, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, i13, p3Var, f10);
    }

    private final int l() {
        return this.f13885c;
    }

    private final int m() {
        return this.f13886d;
    }

    private final int n() {
        return this.f13887e;
    }

    private final int o() {
        return this.f13888f;
    }

    private final p3 p() {
        return this.f13889g;
    }

    private final float q() {
        return this.f13890h;
    }

    public static /* synthetic */ MarqueeModifierElement s(MarqueeModifierElement marqueeModifierElement, int i10, int i11, int i12, int i13, p3 p3Var, float f10, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = marqueeModifierElement.f13885c;
        }
        if ((i14 & 2) != 0) {
            i11 = marqueeModifierElement.f13886d;
        }
        if ((i14 & 4) != 0) {
            i12 = marqueeModifierElement.f13887e;
        }
        if ((i14 & 8) != 0) {
            i13 = marqueeModifierElement.f13888f;
        }
        if ((i14 & 16) != 0) {
            p3Var = marqueeModifierElement.f13889g;
        }
        if ((i14 & 32) != 0) {
            f10 = marqueeModifierElement.f13890h;
        }
        p3 p3Var2 = p3Var;
        float f11 = f10;
        return marqueeModifierElement.r(i10, i11, i12, i13, p3Var2, f11);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
        return this.f13885c == marqueeModifierElement.f13885c && h3.f(this.f13886d, marqueeModifierElement.f13886d) && this.f13887e == marqueeModifierElement.f13887e && this.f13888f == marqueeModifierElement.f13888f && Intrinsics.areEqual(this.f13889g, marqueeModifierElement.f13889g) && androidx.compose.ui.unit.h.x(this.f13890h, marqueeModifierElement.f13890h);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((((((((Integer.hashCode(this.f13885c) * 31) + h3.g(this.f13886d)) * 31) + Integer.hashCode(this.f13887e)) * 31) + Integer.hashCode(this.f13888f)) * 31) + this.f13889g.hashCode()) * 31) + androidx.compose.ui.unit.h.D(this.f13890h);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("basicMarquee");
        t2Var.b().c("iterations", Integer.valueOf(this.f13885c));
        t2Var.b().c("animationMode", h3.c(this.f13886d));
        t2Var.b().c("delayMillis", Integer.valueOf(this.f13887e));
        t2Var.b().c("initialDelayMillis", Integer.valueOf(this.f13888f));
        t2Var.b().c("spacing", this.f13889g);
        t2Var.b().c("velocity", androidx.compose.ui.unit.h.o(this.f13890h));
    }

    @NotNull
    public final MarqueeModifierElement r(int i10, int i11, int i12, int i13, @NotNull p3 p3Var, float f10) {
        return new MarqueeModifierElement(i10, i11, i12, i13, p3Var, f10, null);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public m3 a() {
        return new m3(this.f13885c, this.f13886d, this.f13887e, this.f13888f, this.f13889g, this.f13890h, null);
    }

    @NotNull
    public String toString() {
        return "MarqueeModifierElement(iterations=" + this.f13885c + ", animationMode=" + ((Object) h3.h(this.f13886d)) + ", delayMillis=" + this.f13887e + ", initialDelayMillis=" + this.f13888f + ", spacing=" + this.f13889g + ", velocity=" + ((Object) androidx.compose.ui.unit.h.M(this.f13890h)) + ')';
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull m3 m3Var) {
        m3Var.Z9(this.f13885c, this.f13886d, this.f13887e, this.f13888f, this.f13889g, this.f13890h);
    }

    private MarqueeModifierElement(int i10, int i11, int i12, int i13, p3 p3Var, float f10) {
        this.f13885c = i10;
        this.f13886d = i11;
        this.f13887e = i12;
        this.f13888f = i13;
        this.f13889g = p3Var;
        this.f13890h = f10;
    }
}
