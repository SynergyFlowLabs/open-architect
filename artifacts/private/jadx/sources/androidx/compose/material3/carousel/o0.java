package androidx.compose.material3.carousel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class o0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f26627h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f26628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f26629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f26630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f26631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f26632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f26633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f26634g;

    public o0(float f10, float f11, float f12, boolean z10, boolean z11, boolean z12, float f13) {
        this.f26628a = f10;
        this.f26629b = f11;
        this.f26630c = f12;
        this.f26631d = z10;
        this.f26632e = z11;
        this.f26633f = z12;
        this.f26634g = f13;
    }

    public static /* synthetic */ o0 i(o0 o0Var, float f10, float f11, float f12, boolean z10, boolean z11, boolean z12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = o0Var.f26628a;
        }
        if ((i10 & 2) != 0) {
            f11 = o0Var.f26629b;
        }
        if ((i10 & 4) != 0) {
            f12 = o0Var.f26630c;
        }
        if ((i10 & 8) != 0) {
            z10 = o0Var.f26631d;
        }
        if ((i10 & 16) != 0) {
            z11 = o0Var.f26632e;
        }
        if ((i10 & 32) != 0) {
            z12 = o0Var.f26633f;
        }
        if ((i10 & 64) != 0) {
            f13 = o0Var.f26634g;
        }
        boolean z13 = z12;
        float f14 = f13;
        boolean z14 = z11;
        float f15 = f12;
        return o0Var.h(f10, f11, f15, z10, z14, z13, f14);
    }

    public final float a() {
        return this.f26628a;
    }

    public final float b() {
        return this.f26629b;
    }

    public final float c() {
        return this.f26630c;
    }

    public final boolean d() {
        return this.f26631d;
    }

    public final boolean e() {
        return this.f26632e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Float.compare(this.f26628a, o0Var.f26628a) == 0 && Float.compare(this.f26629b, o0Var.f26629b) == 0 && Float.compare(this.f26630c, o0Var.f26630c) == 0 && this.f26631d == o0Var.f26631d && this.f26632e == o0Var.f26632e && this.f26633f == o0Var.f26633f && Float.compare(this.f26634g, o0Var.f26634g) == 0;
    }

    public final boolean f() {
        return this.f26633f;
    }

    public final float g() {
        return this.f26634g;
    }

    @NotNull
    public final o0 h(float f10, float f11, float f12, boolean z10, boolean z11, boolean z12, float f13) {
        return new o0(f10, f11, f12, z10, z11, z12, f13);
    }

    public int hashCode() {
        return (((((((((((Float.hashCode(this.f26628a) * 31) + Float.hashCode(this.f26629b)) * 31) + Float.hashCode(this.f26630c)) * 31) + Boolean.hashCode(this.f26631d)) * 31) + Boolean.hashCode(this.f26632e)) * 31) + Boolean.hashCode(this.f26633f)) * 31) + Float.hashCode(this.f26634g);
    }

    public final float j() {
        return this.f26634g;
    }

    public final float k() {
        return this.f26629b;
    }

    public final float l() {
        return this.f26628a;
    }

    public final float m() {
        return this.f26630c;
    }

    public final boolean n() {
        return this.f26632e;
    }

    public final boolean o() {
        return this.f26631d;
    }

    public final boolean p() {
        return this.f26633f;
    }

    @NotNull
    public String toString() {
        return "Keyline(size=" + this.f26628a + ", offset=" + this.f26629b + ", unadjustedOffset=" + this.f26630c + ", isFocal=" + this.f26631d + ", isAnchor=" + this.f26632e + ", isPivot=" + this.f26633f + ", cutoff=" + this.f26634g + ')';
    }
}
