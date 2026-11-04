package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
final class i5 implements zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f23098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f23100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f23101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f23102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f23103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f23104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f23105h;

    public /* synthetic */ i5(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17);
    }

    @Override // androidx.compose.material.zh
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> a(boolean z10, boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long j10;
        c0Var.E(-1176343362);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1176343362, i10, -1, "androidx.compose.material.DefaultSwitchColors.trackColor (Switch.kt:378)");
        }
        if (z10) {
            j10 = z11 ? this.f23099b : this.f23101d;
        } else {
            j10 = z11 ? this.f23103f : this.f23105h;
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(j10), c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return n7VarW;
    }

    @Override // androidx.compose.material.zh
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> b(boolean z10, boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long j10;
        c0Var.E(-66424183);
        if (androidx.compose.runtime.m0.l0()) {
            int i11 = 7 | (-1);
            androidx.compose.runtime.m0.A0(-66424183, i10, -1, "androidx.compose.material.DefaultSwitchColors.thumbColor (Switch.kt:367)");
        }
        if (z10) {
            j10 = z11 ? this.f23098a : this.f23100c;
        } else {
            j10 = z11 ? this.f23102e : this.f23104g;
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(j10), c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return n7VarW;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i5.class != obj.getClass()) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return androidx.compose.ui.graphics.q0.y(this.f23098a, i5Var.f23098a) && androidx.compose.ui.graphics.q0.y(this.f23099b, i5Var.f23099b) && androidx.compose.ui.graphics.q0.y(this.f23100c, i5Var.f23100c) && androidx.compose.ui.graphics.q0.y(this.f23101d, i5Var.f23101d) && androidx.compose.ui.graphics.q0.y(this.f23102e, i5Var.f23102e) && androidx.compose.ui.graphics.q0.y(this.f23103f, i5Var.f23103f) && androidx.compose.ui.graphics.q0.y(this.f23104g, i5Var.f23104g) && androidx.compose.ui.graphics.q0.y(this.f23105h, i5Var.f23105h);
    }

    public int hashCode() {
        return (((((((((((((androidx.compose.ui.graphics.q0.K(this.f23098a) * 31) + androidx.compose.ui.graphics.q0.K(this.f23099b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f23100c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f23101d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f23102e)) * 31) + androidx.compose.ui.graphics.q0.K(this.f23103f)) * 31) + androidx.compose.ui.graphics.q0.K(this.f23104g)) * 31) + androidx.compose.ui.graphics.q0.K(this.f23105h);
    }

    private i5(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.f23098a = j10;
        this.f23099b = j11;
        this.f23100c = j12;
        this.f23101d = j13;
        this.f23102e = j14;
        this.f23103f = j15;
        this.f23104g = j16;
        this.f23105h = j17;
    }
}
