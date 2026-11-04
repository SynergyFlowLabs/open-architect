package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@kotlin.l(level = kotlin.n.WARNING, message = "Maintained for binary compatibility. Use the chipBorder functions instead")
public final class c5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f26470d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f26471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f26473c;

    public /* synthetic */ c5(long j10, long j11, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, f10);
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.foundation.a1> a(boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1899621712, i10, -1, "androidx.compose.material3.ChipBorder.borderStroke (Chip.kt:2915)");
        }
        androidx.compose.runtime.n7<androidx.compose.foundation.a1> n7VarW = androidx.compose.runtime.w6.w(androidx.compose.foundation.b1.a(this.f26473c, z10 ? this.f26471a : this.f26472b), c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarW;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return androidx.compose.ui.graphics.q0.y(this.f26471a, c5Var.f26471a) && androidx.compose.ui.graphics.q0.y(this.f26472b, c5Var.f26472b) && androidx.compose.ui.unit.h.x(this.f26473c, c5Var.f26473c);
    }

    public int hashCode() {
        return (((androidx.compose.ui.graphics.q0.K(this.f26471a) * 31) + androidx.compose.ui.graphics.q0.K(this.f26472b)) * 31) + androidx.compose.ui.unit.h.D(this.f26473c);
    }

    private c5(long j10, long j11, float f10) {
        this.f26471a = j10;
        this.f26472b = j11;
        this.f26473c = f10;
    }
}
