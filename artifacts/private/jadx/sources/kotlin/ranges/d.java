package kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class d implements f<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f312919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f312920b;

    public d(double d10, double d11) {
        this.f312919a = d10;
        this.f312920b = d11;
    }

    public boolean a(double d10) {
        return d10 >= this.f312919a && d10 <= this.f312920b;
    }

    @Override // kotlin.ranges.g
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Double i() {
        return Double.valueOf(this.f312920b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.f, kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean c(Comparable comparable) {
        return a(((Number) comparable).doubleValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.f
    public /* bridge */ /* synthetic */ boolean d(Comparable comparable, Comparable comparable2) {
        return f(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    @Override // kotlin.ranges.g
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Double u() {
        return Double.valueOf(this.f312919a);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f312919a == dVar.f312919a && this.f312920b == dVar.f312920b;
    }

    public boolean f(double d10, double d11) {
        return d10 <= d11;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f312919a) * 31) + Double.hashCode(this.f312920b);
    }

    @Override // kotlin.ranges.f, kotlin.ranges.g
    public boolean isEmpty() {
        return this.f312919a > this.f312920b;
    }

    @NotNull
    public String toString() {
        return this.f312919a + ".." + this.f312920b;
    }
}
