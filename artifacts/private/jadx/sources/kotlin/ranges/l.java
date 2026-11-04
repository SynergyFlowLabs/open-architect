package kotlin.ranges;

import kotlin.collections.LongIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class l implements Iterable<Long>, qj.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f312935d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f312936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f312937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f312938c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final l a(long j10, long j11, long j12) {
            return new l(j10, j11, j12);
        }

        private a() {
        }
    }

    public l(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f312936a = j10;
        this.f312937b = kotlin.internal.n.d(j10, j11, j12);
        this.f312938c = j12;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (isEmpty() && ((l) obj).isEmpty()) {
            return true;
        }
        l lVar = (l) obj;
        return this.f312936a == lVar.f312936a && this.f312937b == lVar.f312937b && this.f312938c == lVar.f312938c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = 31;
        long j11 = this.f312936a;
        long j12 = this.f312937b;
        long j13 = j10 * (((j11 ^ (j11 >>> 32)) * j10) + (j12 ^ (j12 >>> 32)));
        long j14 = this.f312938c;
        return (int) (j13 + (j14 ^ (j14 >>> 32)));
    }

    public boolean isEmpty() {
        long j10 = this.f312938c;
        long j11 = this.f312936a;
        long j12 = this.f312937b;
        if (j10 > 0) {
            return j11 > j12;
        }
        return j11 < j12;
    }

    public final long l() {
        return this.f312936a;
    }

    public final long m() {
        return this.f312937b;
    }

    public final long n() {
        return this.f312938c;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public LongIterator iterator() {
        return new m(this.f312936a, this.f312937b, this.f312938c);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        long j10;
        if (this.f312938c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f312936a);
            sb2.append("..");
            sb2.append(this.f312937b);
            sb2.append(" step ");
            j10 = this.f312938c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f312936a);
            sb2.append(" downTo ");
            sb2.append(this.f312937b);
            sb2.append(" step ");
            j10 = -this.f312938c;
        }
        sb2.append(j10);
        return sb2.toString();
    }
}
