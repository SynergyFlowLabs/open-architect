package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.e1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.y1;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = "1.3")
final class y implements Iterator<y1>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f312963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f312964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f312965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f312966d;

    public /* synthetic */ y(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    public long b() {
        long j10 = this.f312966d;
        if (j10 != this.f312963a) {
            this.f312966d = y1.n(this.f312965c + j10);
            return j10;
        }
        if (!this.f312964b) {
            throw new NoSuchElementException();
        }
        this.f312964b = false;
        return j10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f312964b;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ y1 next() {
        return y1.c(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private y(long j10, long j11, long j12) {
        this.f312963a = j11;
        boolean z10 = false;
        if (j12 <= 0 ? Long.compareUnsigned(j10, j11) >= 0 : Long.compareUnsigned(j10, j11) <= 0) {
            z10 = true;
        }
        this.f312964b = z10;
        this.f312965c = y1.n(j12);
        if (!this.f312964b) {
            j10 = j11;
        }
        this.f312966d = j10;
    }
}
