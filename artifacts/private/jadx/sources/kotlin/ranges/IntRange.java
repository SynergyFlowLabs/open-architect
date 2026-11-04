package kotlin.ranges;

import kotlin.e1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.m2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class IntRange extends j implements g<Integer>, q<Integer> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f312907e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final IntRange f312908f = new IntRange(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IntRange a() {
            return IntRange.f312908f;
        }

        private a() {
        }
    }

    public IntRange(int i10, int i11) {
        super(i10, i11, 1);
    }

    @kotlin.l(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    public static /* synthetic */ void w() {
    }

    @Override // kotlin.ranges.g
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Integer i() {
        return Integer.valueOf(m());
    }

    @Override // kotlin.ranges.g
    @NotNull
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Integer u() {
        return Integer.valueOf(l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean c(Comparable comparable) {
        return t(((Number) comparable).intValue());
    }

    @Override // kotlin.ranges.j
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof IntRange) {
            if (isEmpty() && ((IntRange) obj).isEmpty()) {
                return true;
            }
            IntRange intRange = (IntRange) obj;
            if (l() == intRange.l() && m() == intRange.m()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.ranges.j
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (l() * 31) + m();
    }

    @Override // kotlin.ranges.j, kotlin.ranges.g
    public boolean isEmpty() {
        return l() > m();
    }

    public boolean t(int i10) {
        return l() <= i10 && i10 <= m();
    }

    @Override // kotlin.ranges.j
    @NotNull
    public String toString() {
        return l() + ".." + m();
    }

    @Override // kotlin.ranges.q
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Integer k() {
        if (m() != Integer.MAX_VALUE) {
            return Integer.valueOf(m() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }
}
