package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.LongIterator;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends LongIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f312939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f312940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f312941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f312942d;

    public m(long j10, long j11, long j12) {
        this.f312939a = j12;
        this.f312940b = j11;
        boolean z10 = false;
        if (j12 > 0) {
            if (j10 <= j11) {
                z10 = true;
            }
        } else if (j10 >= j11) {
            z10 = true;
        }
        this.f312941c = z10;
        this.f312942d = z10 ? j10 : j11;
    }

    public final long b() {
        return this.f312939a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f312941c;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        long j10 = this.f312942d;
        if (j10 != this.f312940b) {
            this.f312942d = this.f312939a + j10;
            return j10;
        }
        if (!this.f312941c) {
            throw new NoSuchElementException();
        }
        this.f312941c = false;
        return j10;
    }
}
