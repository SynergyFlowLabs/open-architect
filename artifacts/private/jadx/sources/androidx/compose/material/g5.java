package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@u7
@androidx.compose.runtime.o2
final class g5 implements qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f22864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f22865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f22866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f22867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f22868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f22869i;

    public /* synthetic */ g5(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18);
    }

    @Override // androidx.compose.material.qe
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> b(boolean z10, boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long j10;
        c0Var.E(189838188);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(189838188, i10, -1, "androidx.compose.material.DefaultSelectableChipColors.leadingIconColor (Chip.kt:658)");
        }
        if (z10) {
            j10 = !z11 ? this.f22863c : this.f22869i;
        } else {
            j10 = this.f22866f;
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(j10), c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return n7VarW;
    }

    @Override // androidx.compose.material.qe
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> c(boolean z10, boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long j10;
        c0Var.E(2025240134);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(2025240134, i10, -1, "androidx.compose.material.DefaultSelectableChipColors.contentColor (Chip.kt:647)");
        }
        if (z10) {
            j10 = !z11 ? this.f22862b : this.f22868h;
        } else {
            j10 = this.f22865e;
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(j10), c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return n7VarW;
    }

    @Override // androidx.compose.material.qe
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> d(boolean z10, boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long j10;
        c0Var.E(-403836585);
        if (androidx.compose.runtime.m0.l0()) {
            int i11 = 2 & (-1);
            androidx.compose.runtime.m0.A0(-403836585, i10, -1, "androidx.compose.material.DefaultSelectableChipColors.backgroundColor (Chip.kt:636)");
        }
        if (z10) {
            j10 = !z11 ? this.f22861a : this.f22867g;
        } else {
            j10 = this.f22864d;
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
        if (obj != null && g5.class == obj.getClass()) {
            g5 g5Var = (g5) obj;
            return androidx.compose.ui.graphics.q0.y(this.f22861a, g5Var.f22861a) && androidx.compose.ui.graphics.q0.y(this.f22862b, g5Var.f22862b) && androidx.compose.ui.graphics.q0.y(this.f22863c, g5Var.f22863c) && androidx.compose.ui.graphics.q0.y(this.f22864d, g5Var.f22864d) && androidx.compose.ui.graphics.q0.y(this.f22865e, g5Var.f22865e) && androidx.compose.ui.graphics.q0.y(this.f22866f, g5Var.f22866f) && androidx.compose.ui.graphics.q0.y(this.f22867g, g5Var.f22867g) && androidx.compose.ui.graphics.q0.y(this.f22868h, g5Var.f22868h) && androidx.compose.ui.graphics.q0.y(this.f22869i, g5Var.f22869i);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((androidx.compose.ui.graphics.q0.K(this.f22861a) * 31) + androidx.compose.ui.graphics.q0.K(this.f22862b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f22863c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f22864d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f22865e)) * 31) + androidx.compose.ui.graphics.q0.K(this.f22866f)) * 31) + androidx.compose.ui.graphics.q0.K(this.f22867g)) * 31) + androidx.compose.ui.graphics.q0.K(this.f22868h)) * 31) + androidx.compose.ui.graphics.q0.K(this.f22869i);
    }

    private g5(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.f22861a = j10;
        this.f22862b = j11;
        this.f22863c = j12;
        this.f22864d = j13;
        this.f22865e = j14;
        this.f22866f = j15;
        this.f22867g = j16;
        this.f22868h = j17;
        this.f22869i = j18;
    }
}
