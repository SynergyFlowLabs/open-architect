package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f37637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f37638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f37639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f37640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f37641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f37642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f37643g;

    public k0(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f37637a = d10;
        this.f37638b = d11;
        this.f37639c = d12;
        this.f37640d = d13;
        this.f37641e = d14;
        this.f37642f = d15;
        this.f37643g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (!l0.b(d10)) {
            if (d14 < 0.0d || d14 > 1.0d) {
                throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
            }
            if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
                throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
            }
            if (d14 >= 1.0d && d13 == 0.0d) {
                throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
            }
            if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
                throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
            }
            if (d13 < 0.0d) {
                throw new IllegalArgumentException("The transfer function must be increasing");
            }
            if (d11 < 0.0d || d10 < 0.0d) {
                throw new IllegalArgumentException("The transfer function must be positive or increasing");
            }
        }
    }

    public final double a() {
        return this.f37637a;
    }

    public final double b() {
        return this.f37638b;
    }

    public final double c() {
        return this.f37639c;
    }

    public final double d() {
        return this.f37640d;
    }

    public final double e() {
        return this.f37641e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Double.compare(this.f37637a, k0Var.f37637a) == 0 && Double.compare(this.f37638b, k0Var.f37638b) == 0 && Double.compare(this.f37639c, k0Var.f37639c) == 0 && Double.compare(this.f37640d, k0Var.f37640d) == 0 && Double.compare(this.f37641e, k0Var.f37641e) == 0 && Double.compare(this.f37642f, k0Var.f37642f) == 0 && Double.compare(this.f37643g, k0Var.f37643g) == 0;
    }

    public final double f() {
        return this.f37642f;
    }

    public final double g() {
        return this.f37643g;
    }

    @NotNull
    public final k0 h(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        return new k0(d10, d11, d12, d13, d14, d15, d16);
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f37637a) * 31) + Double.hashCode(this.f37638b)) * 31) + Double.hashCode(this.f37639c)) * 31) + Double.hashCode(this.f37640d)) * 31) + Double.hashCode(this.f37641e)) * 31) + Double.hashCode(this.f37642f)) * 31) + Double.hashCode(this.f37643g);
    }

    public final double j() {
        return this.f37638b;
    }

    public final double k() {
        return this.f37639c;
    }

    public final double l() {
        return this.f37640d;
    }

    public final double m() {
        return this.f37641e;
    }

    public final double n() {
        return this.f37642f;
    }

    public final double o() {
        return this.f37643g;
    }

    public final double p() {
        return this.f37637a;
    }

    public final boolean q() {
        return this.f37637a == -3.0d;
    }

    public final boolean r() {
        return this.f37637a == -2.0d;
    }

    @NotNull
    public String toString() {
        return "TransferParameters(gamma=" + this.f37637a + ", a=" + this.f37638b + ", b=" + this.f37639c + ", c=" + this.f37640d + ", d=" + this.f37641e + ", e=" + this.f37642f + ", f=" + this.f37643g + ')';
    }

    public /* synthetic */ k0(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }
}
