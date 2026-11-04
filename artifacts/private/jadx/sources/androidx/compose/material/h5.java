package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
final class h5 implements ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f23006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f23008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f23009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f23010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f23011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f23012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f23013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f23014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f23015j;

    public /* synthetic */ h5(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19);
    }

    @Override // androidx.compose.material.ue
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> a(boolean z10, boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long j10;
        c0Var.E(1575395620);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1575395620, i10, -1, "androidx.compose.material.DefaultSliderColors.trackColor (Slider.kt:1191)");
        }
        if (z10) {
            j10 = z11 ? this.f23008c : this.f23009d;
        } else {
            j10 = z11 ? this.f23010e : this.f23011f;
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(j10), c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return n7VarW;
    }

    @Override // androidx.compose.material.ue
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> b(boolean z10, boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long j10;
        c0Var.E(-1491563694);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1491563694, i10, -1, "androidx.compose.material.DefaultSliderColors.tickColor (Slider.kt:1202)");
        }
        if (z10) {
            j10 = z11 ? this.f23012g : this.f23013h;
        } else {
            j10 = z11 ? this.f23014i : this.f23015j;
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(j10), c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return n7VarW;
    }

    @Override // androidx.compose.material.ue
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> c(boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(-1733795637);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1733795637, i10, -1, "androidx.compose.material.DefaultSliderColors.thumbColor (Slider.kt:1186)");
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(z10 ? this.f23006a : this.f23007b), c0Var, 0);
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
        if (obj == null || h5.class != obj.getClass()) {
            return false;
        }
        h5 h5Var = (h5) obj;
        return androidx.compose.ui.graphics.q0.y(this.f23006a, h5Var.f23006a) && androidx.compose.ui.graphics.q0.y(this.f23007b, h5Var.f23007b) && androidx.compose.ui.graphics.q0.y(this.f23008c, h5Var.f23008c) && androidx.compose.ui.graphics.q0.y(this.f23009d, h5Var.f23009d) && androidx.compose.ui.graphics.q0.y(this.f23010e, h5Var.f23010e) && androidx.compose.ui.graphics.q0.y(this.f23011f, h5Var.f23011f) && androidx.compose.ui.graphics.q0.y(this.f23012g, h5Var.f23012g) && androidx.compose.ui.graphics.q0.y(this.f23013h, h5Var.f23013h) && androidx.compose.ui.graphics.q0.y(this.f23014i, h5Var.f23014i) && androidx.compose.ui.graphics.q0.y(this.f23015j, h5Var.f23015j);
    }

    public int hashCode() {
        return (((((((((((((((((androidx.compose.ui.graphics.q0.K(this.f23006a) * 31) + androidx.compose.ui.graphics.q0.K(this.f23007b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f23008c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f23009d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f23010e)) * 31) + androidx.compose.ui.graphics.q0.K(this.f23011f)) * 31) + androidx.compose.ui.graphics.q0.K(this.f23012g)) * 31) + androidx.compose.ui.graphics.q0.K(this.f23013h)) * 31) + androidx.compose.ui.graphics.q0.K(this.f23014i)) * 31) + androidx.compose.ui.graphics.q0.K(this.f23015j);
    }

    private h5(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.f23006a = j10;
        this.f23007b = j11;
        this.f23008c = j12;
        this.f23009d = j13;
        this.f23010e = j14;
        this.f23011f = j15;
        this.f23012g = j16;
        this.f23013h = j17;
        this.f23014i = j18;
        this.f23015j = j19;
    }
}
