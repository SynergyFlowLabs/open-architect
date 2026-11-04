package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes14.dex */
@SuppressAnimalSniffer
public abstract class ConcurrentSequencedCircularArrayQueue<E> extends ConcurrentCircularArrayQueue<E> {
    private static final long ARRAY_BASE;
    private static final int ELEMENT_SHIFT;
    protected final long[] sequenceBuffer;

    static {
        Unsafe unsafe = UnsafeAccess.UNSAFE;
        if (8 != unsafe.arrayIndexScale(long[].class)) {
            throw new IllegalStateException("Unexpected long[] element size");
        }
        int i10 = ConcurrentCircularArrayQueue.SPARSE_SHIFT;
        int i11 = i10 + 3;
        ELEMENT_SHIFT = i11;
        ARRAY_BASE = unsafe.arrayBaseOffset(long[].class) + (32 << (i11 - i10));
    }

    public ConcurrentSequencedCircularArrayQueue(int i10) {
        super(i10);
        int i11 = (int) (this.mask + 1);
        this.sequenceBuffer = new long[(i11 << ConcurrentCircularArrayQueue.SPARSE_SHIFT) + 64];
        for (long j10 = 0; j10 < i11; j10++) {
            soSequence(this.sequenceBuffer, calcSequenceOffset(j10), j10);
        }
    }

    protected final long calcSequenceOffset(long j10) {
        return ARRAY_BASE + ((j10 & this.mask) << ELEMENT_SHIFT);
    }

    protected final long lvSequence(long[] jArr, long j10) {
        return UnsafeAccess.UNSAFE.getLongVolatile(jArr, j10);
    }

    protected final void soSequence(long[] jArr, long j10, long j11) {
        UnsafeAccess.UNSAFE.putOrderedLong(jArr, j10, j11);
    }
}
