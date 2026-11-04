package rx.internal.util.unsafe;

import java.util.Iterator;
import rx.internal.util.SuppressAnimalSniffer;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes14.dex */
@SuppressAnimalSniffer
public class SpscUnboundedArrayQueue<E> extends SpscUnboundedArrayQueueConsumerField<E> implements QueueProgressIndicators {
    private static final long C_INDEX_OFFSET;
    private static final long P_INDEX_OFFSET;
    private static final long REF_ARRAY_BASE;
    private static final int REF_ELEMENT_SHIFT;
    static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object HAS_NEXT = new Object();

    static {
        Unsafe unsafe = UnsafeAccess.UNSAFE;
        int iArrayIndexScale = unsafe.arrayIndexScale(Object[].class);
        int i10 = 7 & 4;
        if (4 == iArrayIndexScale) {
            REF_ELEMENT_SHIFT = 2;
        } else {
            if (8 != iArrayIndexScale) {
                throw new IllegalStateException("Unknown pointer size");
            }
            REF_ELEMENT_SHIFT = 3;
        }
        REF_ARRAY_BASE = unsafe.arrayBaseOffset(Object[].class);
        try {
            P_INDEX_OFFSET = unsafe.objectFieldOffset(SpscUnboundedArrayQueueProducerFields.class.getDeclaredField("producerIndex"));
            try {
                C_INDEX_OFFSET = unsafe.objectFieldOffset(SpscUnboundedArrayQueueConsumerField.class.getDeclaredField("consumerIndex"));
            } catch (NoSuchFieldException e10) {
                InternalError internalError = new InternalError();
                internalError.initCause(e10);
                throw internalError;
            }
        } catch (NoSuchFieldException e11) {
            InternalError internalError2 = new InternalError();
            internalError2.initCause(e11);
            throw internalError2;
        }
    }

    public SpscUnboundedArrayQueue(int i10) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i10);
        long j10 = iRoundToPowerOfTwo - 1;
        E[] eArr = (E[]) new Object[iRoundToPowerOfTwo + 1];
        this.producerBuffer = eArr;
        this.producerMask = j10;
        adjustLookAheadStep(iRoundToPowerOfTwo);
        this.consumerBuffer = eArr;
        this.consumerMask = j10;
        this.producerLookAhead = j10 - 1;
        soProducerIndex(0L);
    }

    private void adjustLookAheadStep(int i10) {
        this.producerLookAheadStep = Math.min(i10 / 4, MAX_LOOK_AHEAD_STEP);
    }

    private static long calcDirectOffset(long j10) {
        return REF_ARRAY_BASE + (j10 << REF_ELEMENT_SHIFT);
    }

    private static long calcWrappedOffset(long j10, long j11) {
        return calcDirectOffset(j10 & j11);
    }

    private long lvConsumerIndex() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, C_INDEX_OFFSET);
    }

    private static <E> Object lvElement(E[] eArr, long j10) {
        return UnsafeAccess.UNSAFE.getObjectVolatile(eArr, j10);
    }

    private E[] lvNext(E[] eArr) {
        return (E[]) ((Object[]) lvElement(eArr, calcDirectOffset(eArr.length - 1)));
    }

    private long lvProducerIndex() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, P_INDEX_OFFSET);
    }

    private E newBufferPeek(E[] eArr, long j10, long j11) {
        this.consumerBuffer = eArr;
        return (E) lvElement(eArr, calcWrappedOffset(j10, j11));
    }

    private E newBufferPoll(E[] eArr, long j10, long j11) {
        this.consumerBuffer = eArr;
        long jCalcWrappedOffset = calcWrappedOffset(j10, j11);
        E e10 = (E) lvElement(eArr, jCalcWrappedOffset);
        if (e10 == null) {
            return null;
        }
        soElement(eArr, jCalcWrappedOffset, null);
        soConsumerIndex(j10 + 1);
        return e10;
    }

    private void resize(E[] eArr, long j10, long j11, E e10, long j12) {
        E[] eArr2 = (E[]) new Object[eArr.length];
        this.producerBuffer = eArr2;
        this.producerLookAhead = (j12 + j10) - 1;
        soElement(eArr2, j11, e10);
        soNext(eArr, eArr2);
        soElement(eArr, j11, HAS_NEXT);
        soProducerIndex(j10 + 1);
    }

    private void soConsumerIndex(long j10) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, j10);
    }

    private static void soElement(Object[] objArr, long j10, Object obj) {
        UnsafeAccess.UNSAFE.putOrderedObject(objArr, j10, obj);
    }

    private void soNext(E[] eArr, E[] eArr2) {
        soElement(eArr, calcDirectOffset(eArr.length - 1), eArr2);
    }

    private void soProducerIndex(long j10) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j10);
    }

    private boolean writeToQueue(E[] eArr, E e10, long j10, long j11) {
        soElement(eArr, j11, e10);
        soProducerIndex(j10 + 1);
        return true;
    }

    @Override // rx.internal.util.unsafe.QueueProgressIndicators
    public long currentConsumerIndex() {
        return lvConsumerIndex();
    }

    @Override // rx.internal.util.unsafe.QueueProgressIndicators
    public long currentProducerIndex() {
        return lvProducerIndex();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(E e10) {
        if (e10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        E[] eArr = this.producerBuffer;
        long j10 = this.producerIndex;
        long j11 = this.producerMask;
        long jCalcWrappedOffset = calcWrappedOffset(j10, j11);
        if (j10 < this.producerLookAhead) {
            return writeToQueue(eArr, e10, j10, jCalcWrappedOffset);
        }
        long j12 = ((long) this.producerLookAheadStep) + j10;
        if (lvElement(eArr, calcWrappedOffset(j12, j11)) == null) {
            this.producerLookAhead = j12 - 1;
            return writeToQueue(eArr, e10, j10, jCalcWrappedOffset);
        }
        if (lvElement(eArr, calcWrappedOffset(j10 + 1, j11)) != null) {
            return writeToQueue(eArr, e10, j10, jCalcWrappedOffset);
        }
        resize(eArr, j10, jCalcWrappedOffset, e10, j11);
        return true;
    }

    @Override // java.util.Queue
    public final E peek() {
        E[] eArr = this.consumerBuffer;
        long j10 = this.consumerIndex;
        long j11 = this.consumerMask;
        E e10 = (E) lvElement(eArr, calcWrappedOffset(j10, j11));
        return e10 == HAS_NEXT ? newBufferPeek(lvNext(eArr), j10, j11) : e10;
    }

    @Override // java.util.Queue
    public final E poll() {
        E[] eArr = this.consumerBuffer;
        long j10 = this.consumerIndex;
        long j11 = this.consumerMask;
        long jCalcWrappedOffset = calcWrappedOffset(j10, j11);
        E e10 = (E) lvElement(eArr, jCalcWrappedOffset);
        boolean z10 = e10 == HAS_NEXT;
        if (e10 == null || z10) {
            if (z10) {
                return newBufferPoll(lvNext(eArr), j10, j11);
            }
            return null;
        }
        soElement(eArr, jCalcWrappedOffset, null);
        soConsumerIndex(j10 + 1);
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        long jLvConsumerIndex = lvConsumerIndex();
        while (true) {
            long jLvProducerIndex = lvProducerIndex();
            long jLvConsumerIndex2 = lvConsumerIndex();
            if (jLvConsumerIndex == jLvConsumerIndex2) {
                return (int) (jLvProducerIndex - jLvConsumerIndex2);
            }
            jLvConsumerIndex = jLvConsumerIndex2;
        }
    }
}
