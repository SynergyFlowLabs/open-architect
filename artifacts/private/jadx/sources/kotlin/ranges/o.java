package kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class o implements q<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f312945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f312946b;

    public o(double d10, double d11) {
        this.f312945a = d10;
        this.f312946b = d11;
    }

    private final boolean e(double d10, double d11) {
        return d10 <= d11;
    }

    public boolean a(double d10) {
        return d10 >= this.f312945a && d10 < this.f312946b;
    }

    @Override // kotlin.ranges.q
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Double k() {
        return Double.valueOf(this.f312946b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.q
    public /* bridge */ /* synthetic */ boolean c(Comparable comparable) {
        return a(((Number) comparable).doubleValue());
    }

    @Override // kotlin.ranges.q
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Double u() {
        return Double.valueOf(this.f312945a);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        if (isEmpty() && ((o) obj).isEmpty()) {
            return true;
        }
        o oVar = (o) obj;
        return this.f312945a == oVar.f312945a && this.f312946b == oVar.f312946b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f312945a) * 31) + Double.hashCode(this.f312946b);
    }

    @Override // kotlin.ranges.q
    public boolean isEmpty() {
        return this.f312945a >= this.f312946b;
    }

    @NotNull
    public String toString() {
        return this.f312945a + "..<" + this.f312946b;
    }
}
