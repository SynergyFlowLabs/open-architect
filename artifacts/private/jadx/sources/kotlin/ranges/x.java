package kotlin.ranges;

import java.util.Iterator;
import kotlin.e1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.m2;
import kotlin.y1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@m2(markerClass = {kotlin.u.class})
@e1(version = "1.5")
public class x implements Iterable<y1>, qj.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f312959d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f312960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f312961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f312962c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final x a(long j10, long j11, long j12) {
            return new x(j10, j11, j12, null);
        }

        private a() {
        }
    }

    public /* synthetic */ x(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        if (!isEmpty() || !((x) obj).isEmpty()) {
            x xVar = (x) obj;
            if (this.f312960a != xVar.f312960a || this.f312961b != xVar.f312961b || this.f312962c != xVar.f312962c) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = this.f312960a;
        int iN = ((int) y1.n(j10 ^ y1.n(j10 >>> 32))) * 31;
        long j11 = this.f312961b;
        int iN2 = (iN + ((int) y1.n(j11 ^ y1.n(j11 >>> 32)))) * 31;
        long j12 = this.f312962c;
        return iN2 + ((int) ((j12 >>> 32) ^ j12));
    }

    public boolean isEmpty() {
        long j10 = this.f312962c;
        int iCompareUnsigned = Long.compareUnsigned(this.f312960a, this.f312961b);
        if (j10 > 0) {
            return iCompareUnsigned > 0;
        }
        return iCompareUnsigned < 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<y1> iterator() {
        return new y(this.f312960a, this.f312961b, this.f312962c, null);
    }

    public final long l() {
        return this.f312960a;
    }

    public final long m() {
        return this.f312961b;
    }

    public final long n() {
        return this.f312962c;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        long j10;
        if (this.f312962c > 0) {
            sb2 = new StringBuilder();
            sb2.append((Object) y1.u0(this.f312960a));
            sb2.append("..");
            sb2.append((Object) y1.u0(this.f312961b));
            sb2.append(" step ");
            j10 = this.f312962c;
        } else {
            sb2 = new StringBuilder();
            sb2.append((Object) y1.u0(this.f312960a));
            sb2.append(" downTo ");
            sb2.append((Object) y1.u0(this.f312961b));
            sb2.append(" step ");
            j10 = -this.f312962c;
        }
        sb2.append(j10);
        return sb2.toString();
    }

    private x(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f312960a = j10;
        this.f312961b = kotlin.internal.r.c(j10, j11, j12);
        this.f312962c = j12;
    }
}
