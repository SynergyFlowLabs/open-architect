package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
class i<T extends Comparable<? super T>> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final T f312925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final T f312926b;

    public i(@NotNull T start, @NotNull T endInclusive) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(endInclusive, "endInclusive");
        this.f312925a = start;
        this.f312926b = endInclusive;
    }

    @Override // kotlin.ranges.g
    public boolean c(@NotNull T t10) {
        return g.a.a(this, t10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(i(), r4.i()) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 6
            boolean r0 = r4 instanceof kotlin.ranges.i
            if (r0 == 0) goto L3c
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L16
            r0 = r4
            r2 = 6
            kotlin.ranges.i r0 = (kotlin.ranges.i) r0
            boolean r0 = r0.isEmpty()
            r2 = 5
            if (r0 != 0) goto L39
        L16:
            r2 = 2
            java.lang.Comparable r0 = r3.u()
            kotlin.ranges.i r4 = (kotlin.ranges.i) r4
            r2 = 6
            java.lang.Comparable r1 = r4.u()
            r2 = 2
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r2 = 3
            if (r0 == 0) goto L3c
            java.lang.Comparable r3 = r3.i()
            r2 = 2
            java.lang.Comparable r4 = r4.i()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L3c
        L39:
            r3 = 1
            r2 = 5
            return r3
        L3c:
            r3 = 0
            r2 = r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.i.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (u().hashCode() * 31) + i().hashCode();
    }

    @Override // kotlin.ranges.g
    @NotNull
    public T i() {
        return this.f312926b;
    }

    @Override // kotlin.ranges.g
    public boolean isEmpty() {
        return g.a.b(this);
    }

    @NotNull
    public String toString() {
        return u() + ".." + i();
    }

    @Override // kotlin.ranges.g
    @NotNull
    public T u() {
        return this.f312925a;
    }
}
