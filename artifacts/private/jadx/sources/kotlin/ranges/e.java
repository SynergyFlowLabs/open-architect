package kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class e implements f<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f312921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f312922b;

    public e(float f10, float f11) {
        this.f312921a = f10;
        this.f312922b = f11;
    }

    public boolean a(float f10) {
        return f10 >= this.f312921a && f10 <= this.f312922b;
    }

    @Override // kotlin.ranges.g
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float i() {
        return Float.valueOf(this.f312922b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.f, kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean c(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.f
    public /* bridge */ /* synthetic */ boolean d(Comparable comparable, Comparable comparable2) {
        return f(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    @Override // kotlin.ranges.g
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Float u() {
        return Float.valueOf(this.f312921a);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (!isEmpty() || !((e) obj).isEmpty()) {
            e eVar = (e) obj;
            if (this.f312921a != eVar.f312921a || this.f312922b != eVar.f312922b) {
                return false;
            }
        }
        return true;
    }

    public boolean f(float f10, float f11) {
        return f10 <= f11;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f312921a) * 31) + Float.hashCode(this.f312922b);
    }

    @Override // kotlin.ranges.f, kotlin.ranges.g
    public boolean isEmpty() {
        return this.f312921a > this.f312922b;
    }

    @NotNull
    public String toString() {
        return this.f312921a + ".." + this.f312922b;
    }
}
