package rx.internal.util.unsafe;

import java.util.Iterator;
import rx.internal.util.SuppressAnimalSniffer;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes14.dex */
@SuppressAnimalSniffer
public abstract class ConcurrentCircularArrayQueue<E> extends ConcurrentCircularArrayQueueL0Pad<E> {
    protected static final int BUFFER_PAD = 32;
    private static final long REF_ARRAY_BASE;
    private static final int REF_ELEMENT_SHIFT;
    protected static final int SPARSE_SHIFT;
    protected final E[] buffer;
    protected final long mask;

    static {
        int iIntValue = Integer.getInteger("sparse.shift", 0).intValue();
        SPARSE_SHIFT = iIntValue;
        Unsafe unsafe = UnsafeAccess.UNSAFE;
        int iArrayIndexScale = unsafe.arrayIndexScale(Object[].class);
        if (4 == iArrayIndexScale) {
            REF_ELEMENT_SHIFT = iIntValue + 2;
        } else {
            if (8 != iArrayIndexScale) {
                throw new IllegalStateException("Unknown pointer size");
            }
            REF_ELEMENT_SHIFT = iIntValue + 3;
        }
        REF_ARRAY_BASE = unsafe.arrayBaseOffset(Object[].class) + (32 << (REF_ELEMENT_SHIFT - iIntValue));
    }

    public ConcurrentCircularArrayQueue(int i10) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i10);
        this.mask = iRoundToPowerOfTwo - 1;
        this.buffer = (E[]) new Object[(iRoundToPowerOfTwo << SPARSE_SHIFT) + 64];
    }

    protected final long calcElementOffset(long j10) {
        return calcElementOffset(j10, this.mask);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    protected final E lpElement(long j10) {
        return lpElement(this.buffer, j10);
    }

    protected final E lvElement(long j10) {
        return lvElement(this.buffer, j10);
    }

    protected final void soElement(long j10, E e10) {
        soElement(this.buffer, j10, e10);
    }

    protected final void spElement(long j10, E e10) {
        spElement(this.buffer, j10, e10);
    }

    protected final long calcElementOffset(long j10, long j11) {
        return REF_ARRAY_BASE + ((j10 & j11) << REF_ELEMENT_SHIFT);
    }

    protected final E lpElement(E[] eArr, long j10) {
        return (E) UnsafeAccess.UNSAFE.getObject(eArr, j10);
    }

    protected final E lvElement(E[] eArr, long j10) {
        return (E) UnsafeAccess.UNSAFE.getObjectVolatile(eArr, j10);
    }

    protected final void soElement(E[] eArr, long j10, E e10) {
        UnsafeAccess.UNSAFE.putOrderedObject(eArr, j10, e10);
    }

    protected final void spElement(E[] eArr, long j10, E e10) {
        UnsafeAccess.UNSAFE.putObject(eArr, j10, e10);
    }
}
