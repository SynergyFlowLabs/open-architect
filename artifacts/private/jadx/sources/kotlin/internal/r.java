package kotlin.internal;

import kotlin.a1;
import kotlin.e1;
import kotlin.u1;
import kotlin.y1;

/* JADX INFO: loaded from: classes11.dex */
public final class r {
    private static final int a(int i10, int i11, int i12) {
        int iRemainderUnsigned = Integer.remainderUnsigned(i10, i12);
        int iRemainderUnsigned2 = Integer.remainderUnsigned(i11, i12);
        int iCompareUnsigned = Integer.compareUnsigned(iRemainderUnsigned, iRemainderUnsigned2);
        int iN = u1.n(iRemainderUnsigned - iRemainderUnsigned2);
        return iCompareUnsigned >= 0 ? iN : u1.n(iN + i12);
    }

    private static final long b(long j10, long j11, long j12) {
        long jRemainderUnsigned = Long.remainderUnsigned(j10, j12);
        long jRemainderUnsigned2 = Long.remainderUnsigned(j11, j12);
        int iCompareUnsigned = Long.compareUnsigned(jRemainderUnsigned, jRemainderUnsigned2);
        long jN = y1.n(jRemainderUnsigned - jRemainderUnsigned2);
        return iCompareUnsigned >= 0 ? jN : y1.n(jN + j12);
    }

    @a1
    @e1(version = "1.3")
    public static final long c(long j10, long j11, long j12) {
        if (j12 > 0) {
            return Long.compareUnsigned(j10, j11) >= 0 ? j11 : y1.n(j11 - b(j11, j10, y1.n(j12)));
        }
        if (j12 < 0) {
            return Long.compareUnsigned(j10, j11) <= 0 ? j11 : y1.n(j11 + b(j10, j11, y1.n(-j12)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @a1
    @e1(version = "1.3")
    public static final int d(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (Integer.compareUnsigned(i10, i11) < 0) {
                return u1.n(i11 - a(i11, i10, u1.n(i12)));
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (Integer.compareUnsigned(i10, i11) > 0) {
                return u1.n(i11 + a(i10, i11, u1.n(-i12)));
            }
        }
        return i11;
    }
}
