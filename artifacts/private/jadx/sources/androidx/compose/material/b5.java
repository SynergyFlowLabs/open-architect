package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@u7
@androidx.compose.runtime.o2
final class b5 implements e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f22154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f22155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f22156f;

    public /* synthetic */ b5(long j10, long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15);
    }

    @Override // androidx.compose.material.e4
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> a(boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(-1593588247);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1593588247, i10, -1, "androidx.compose.material.DefaultChipColors.backgroundColor (Chip.kt:576)");
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(z10 ? this.f22151a : this.f22154d), c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return n7VarW;
    }

    @Override // androidx.compose.material.e4
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> b(boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(483145880);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(483145880, i10, -1, "androidx.compose.material.DefaultChipColors.contentColor (Chip.kt:581)");
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(z10 ? this.f22152b : this.f22155e), c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return n7VarW;
    }

    @Override // androidx.compose.material.e4
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> c(boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(1955749013);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1955749013, i10, -1, "androidx.compose.material.DefaultChipColors.leadingIconContentColor (Chip.kt:586)");
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(z10 ? this.f22153c : this.f22156f), c0Var, 0);
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
        if (obj != null && b5.class == obj.getClass()) {
            b5 b5Var = (b5) obj;
            return androidx.compose.ui.graphics.q0.y(this.f22151a, b5Var.f22151a) && androidx.compose.ui.graphics.q0.y(this.f22152b, b5Var.f22152b) && androidx.compose.ui.graphics.q0.y(this.f22153c, b5Var.f22153c) && androidx.compose.ui.graphics.q0.y(this.f22154d, b5Var.f22154d) && androidx.compose.ui.graphics.q0.y(this.f22155e, b5Var.f22155e) && androidx.compose.ui.graphics.q0.y(this.f22156f, b5Var.f22156f);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((androidx.compose.ui.graphics.q0.K(this.f22151a) * 31) + androidx.compose.ui.graphics.q0.K(this.f22152b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f22153c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f22154d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f22155e)) * 31) + androidx.compose.ui.graphics.q0.K(this.f22156f);
    }

    private b5(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f22151a = j10;
        this.f22152b = j11;
        this.f22153c = j12;
        this.f22154d = j13;
        this.f22155e = j14;
        this.f22156f = j15;
    }
}
