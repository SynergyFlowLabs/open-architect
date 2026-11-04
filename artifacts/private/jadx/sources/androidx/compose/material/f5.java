package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
final class f5 implements md {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22723c;

    public /* synthetic */ f5(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    @Override // androidx.compose.material.md
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> a(boolean z10, boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long j10;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW;
        c0Var.E(1243421834);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1243421834, i10, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:176)");
        }
        if (z10) {
            j10 = !z11 ? this.f22722b : this.f22721a;
        } else {
            j10 = this.f22723c;
        }
        long j11 = j10;
        if (z10) {
            c0Var.E(-1312642667);
            c0Var2 = c0Var;
            n7VarW = androidx.compose.animation.e1.c(j11, androidx.compose.animation.core.p.t(100, 0, null, 6, null), null, null, c0Var2, 48, 12);
            c0Var2.A();
        } else {
            c0Var2 = c0Var;
            c0Var2.E(-1312539964);
            n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(j11), c0Var2, 0);
            c0Var2.A();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var2.A();
        return n7VarW;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f5.class != obj.getClass()) {
            return false;
        }
        f5 f5Var = (f5) obj;
        return androidx.compose.ui.graphics.q0.y(this.f22721a, f5Var.f22721a) && androidx.compose.ui.graphics.q0.y(this.f22722b, f5Var.f22722b) && androidx.compose.ui.graphics.q0.y(this.f22723c, f5Var.f22723c);
    }

    public int hashCode() {
        return (((androidx.compose.ui.graphics.q0.K(this.f22721a) * 31) + androidx.compose.ui.graphics.q0.K(this.f22722b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f22723c);
    }

    private f5(long j10, long j11, long j12) {
        this.f22721a = j10;
        this.f22722b = j11;
        this.f22723c = j12;
    }
}
