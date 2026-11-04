package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
final class y4 implements o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f25665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f25667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f25668d;

    public /* synthetic */ y4(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    @Override // androidx.compose.material.o3
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> a(boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(-655254499);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-655254499, i10, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:581)");
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(z10 ? this.f25665a : this.f25667c), c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return n7VarW;
    }

    @Override // androidx.compose.material.o3
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> b(boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(-2133647540);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2133647540, i10, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:586)");
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(z10 ? this.f25666b : this.f25668d), c0Var, 0);
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
        if (obj == null || y4.class != obj.getClass()) {
            return false;
        }
        y4 y4Var = (y4) obj;
        return androidx.compose.ui.graphics.q0.y(this.f25665a, y4Var.f25665a) && androidx.compose.ui.graphics.q0.y(this.f25666b, y4Var.f25666b) && androidx.compose.ui.graphics.q0.y(this.f25667c, y4Var.f25667c) && androidx.compose.ui.graphics.q0.y(this.f25668d, y4Var.f25668d);
    }

    public int hashCode() {
        return (((((androidx.compose.ui.graphics.q0.K(this.f25665a) * 31) + androidx.compose.ui.graphics.q0.K(this.f25666b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f25667c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f25668d);
    }

    private y4(long j10, long j11, long j12, long j13) {
        this.f25665a = j10;
        this.f25666b = j11;
        this.f25667c = j12;
        this.f25668d = j13;
    }
}
