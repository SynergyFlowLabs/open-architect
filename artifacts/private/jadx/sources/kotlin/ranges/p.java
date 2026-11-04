package kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class p implements q<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f312947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f312948b;

    public p(float f10, float f11) {
        this.f312947a = f10;
        this.f312948b = f11;
    }

    private final boolean e(float f10, float f11) {
        return f10 <= f11;
    }

    public boolean a(float f10) {
        return f10 >= this.f312947a && f10 < this.f312948b;
    }

    @Override // kotlin.ranges.q
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float k() {
        return Float.valueOf(this.f312948b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.q
    public /* bridge */ /* synthetic */ boolean c(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    @Override // kotlin.ranges.q
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float u() {
        return Float.valueOf(this.f312947a);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof p) {
            if (isEmpty() && ((p) obj).isEmpty()) {
                return true;
            }
            p pVar = (p) obj;
            if (this.f312947a == pVar.f312947a && this.f312948b == pVar.f312948b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f312947a) * 31) + Float.hashCode(this.f312948b);
    }

    @Override // kotlin.ranges.q
    public boolean isEmpty() {
        return this.f312947a >= this.f312948b;
    }

    @NotNull
    public String toString() {
        return this.f312947a + "..<" + this.f312948b;
    }
}
