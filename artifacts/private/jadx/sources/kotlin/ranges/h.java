package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
class h<T extends Comparable<? super T>> implements q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final T f312923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final T f312924b;

    public h(@NotNull T start, @NotNull T endExclusive) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(endExclusive, "endExclusive");
        this.f312923a = start;
        this.f312924b = endExclusive;
    }

    @Override // kotlin.ranges.q
    public boolean c(@NotNull T t10) {
        return q.a.a(this, t10);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (!isEmpty() || !((h) obj).isEmpty()) {
            h hVar = (h) obj;
            if (!Intrinsics.areEqual(u(), hVar.u()) || !Intrinsics.areEqual(k(), hVar.k())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (u().hashCode() * 31) + k().hashCode();
    }

    @Override // kotlin.ranges.q
    public boolean isEmpty() {
        return q.a.b(this);
    }

    @Override // kotlin.ranges.q
    @NotNull
    public T k() {
        return this.f312924b;
    }

    @NotNull
    public String toString() {
        return u() + "..<" + k();
    }

    @Override // kotlin.ranges.q
    @NotNull
    public T u() {
        return this.f312923a;
    }
}
