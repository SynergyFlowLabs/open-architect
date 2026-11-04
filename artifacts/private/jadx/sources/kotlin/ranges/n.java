package kotlin.ranges;

import kotlin.e1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.m2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends l implements g<Long>, q<Long> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f312943e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final n f312944f = new n(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final n a() {
            return n.f312944f;
        }

        private a() {
        }
    }

    public n(long j10, long j11) {
        super(j10, j11, 1L);
    }

    @kotlin.l(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    public static /* synthetic */ void w() {
    }

    @Override // kotlin.ranges.g
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Long i() {
        return Long.valueOf(m());
    }

    @Override // kotlin.ranges.g
    @NotNull
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Long u() {
        return Long.valueOf(l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean c(Comparable comparable) {
        return t(((Number) comparable).longValue());
    }

    @Override // kotlin.ranges.l
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        if (!isEmpty() || !((n) obj).isEmpty()) {
            n nVar = (n) obj;
            if (l() != nVar.l() || m() != nVar.m()) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.ranges.l
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (l() ^ (l() >>> 32))) + (m() ^ (m() >>> 32)));
    }

    @Override // kotlin.ranges.l, kotlin.ranges.g
    public boolean isEmpty() {
        return l() > m();
    }

    public boolean t(long j10) {
        if (l() > j10 || j10 > m()) {
            return false;
        }
        int i10 = 2 >> 1;
        return true;
    }

    @Override // kotlin.ranges.l
    @NotNull
    public String toString() {
        return l() + ".." + m();
    }

    @Override // kotlin.ranges.q
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Long k() {
        if (m() != Long.MAX_VALUE) {
            return Long.valueOf(m() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }
}
