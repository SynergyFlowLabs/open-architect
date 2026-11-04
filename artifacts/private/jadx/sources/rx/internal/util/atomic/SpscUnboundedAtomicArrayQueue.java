package rx.internal.util.atomic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: classes14.dex */
public final class SpscUnboundedAtomicArrayQueue<T> implements Queue<T> {
    AtomicReferenceArray<Object> consumerBuffer;
    final AtomicLong consumerIndex;
    int consumerMask;
    AtomicReferenceArray<Object> producerBuffer;
    final AtomicLong producerIndex;
    long producerLookAhead;
    int producerLookAheadStep;
    int producerMask;
    static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object HAS_NEXT = new Object();

    public SpscUnboundedAtomicArrayQueue(int i10) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i10));
        int i11 = iRoundToPowerOfTwo - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.producerBuffer = atomicReferenceArray;
        this.producerMask = i11;
        adjustLookAheadStep(iRoundToPowerOfTwo);
        this.consumerBuffer = atomicReferenceArray;
        this.consumerMask = i11;
        this.producerLookAhead = iRoundToPowerOfTwo - 2;
        soProducerIndex(0L);
    }

    private void adjustLookAheadStep(int i10) {
        this.producerLookAheadStep = Math.min(i10 / 4, MAX_LOOK_AHEAD_STEP);
    }

    private static int calcDirectOffset(int i10) {
        return i10;
    }

    private static int calcWrappedOffset(long j10, int i10) {
        return calcDirectOffset(((int) j10) & i10);
    }

    private long lpConsumerIndex() {
        return this.consumerIndex.get();
    }

    private long lpProducerIndex() {
        return this.producerIndex.get();
    }

    private long lvConsumerIndex() {
        return this.consumerIndex.get();
    }

    private static <E> Object lvElement(AtomicReferenceArray<Object> atomicReferenceArray, int i10) {
        return atomicReferenceArray.get(i10);
    }

    private AtomicReferenceArray<Object> lvNext(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) lvElement(atomicReferenceArray, calcDirectOffset(atomicReferenceArray.length() - 1));
    }

    private long lvProducerIndex() {
        return this.producerIndex.get();
    }

    private T newBufferPeek(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10) {
        this.consumerBuffer = atomicReferenceArray;
        return (T) lvElement(atomicReferenceArray, calcWrappedOffset(j10, i10));
    }

    private T newBufferPoll(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10) {
        this.consumerBuffer = atomicReferenceArray;
        int iCalcWrappedOffset = calcWrappedOffset(j10, i10);
        T t10 = (T) lvElement(atomicReferenceArray, iCalcWrappedOffset);
        if (t10 == null) {
            return null;
        }
        soConsumerIndex(j10 + 1);
        soElement(atomicReferenceArray, iCalcWrappedOffset, null);
        return t10;
    }

    private void resize(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10, T t10, long j11) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.producerBuffer = atomicReferenceArray2;
        this.producerLookAhead = (j11 + j10) - 1;
        soProducerIndex(j10 + 1);
        soElement(atomicReferenceArray2, i10, t10);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, i10, HAS_NEXT);
    }

    private void soConsumerIndex(long j10) {
        this.consumerIndex.lazySet(j10);
    }

    private static void soElement(AtomicReferenceArray<Object> atomicReferenceArray, int i10, Object obj) {
        atomicReferenceArray.lazySet(i10, obj);
    }

    private void soNext(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        soElement(atomicReferenceArray, calcDirectOffset(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void soProducerIndex(long j10) {
        this.producerIndex.lazySet(j10);
    }

    private boolean writeToQueue(AtomicReferenceArray<Object> atomicReferenceArray, T t10, long j10, int i10) {
        soProducerIndex(j10 + 1);
        soElement(atomicReferenceArray, i10, t10);
        return true;
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(T t10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T element() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return lvProducerIndex() == lvConsumerIndex();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public boolean offer(T t10) {
        t10.getClass();
        AtomicReferenceArray<Object> atomicReferenceArray = this.producerBuffer;
        long jLpProducerIndex = lpProducerIndex();
        int i10 = this.producerMask;
        int iCalcWrappedOffset = calcWrappedOffset(jLpProducerIndex, i10);
        if (jLpProducerIndex < this.producerLookAhead) {
            return writeToQueue(atomicReferenceArray, t10, jLpProducerIndex, iCalcWrappedOffset);
        }
        long j10 = ((long) this.producerLookAheadStep) + jLpProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j10, i10)) == null) {
            this.producerLookAhead = j10 - 1;
            return writeToQueue(atomicReferenceArray, t10, jLpProducerIndex, iCalcWrappedOffset);
        }
        if (lvElement(atomicReferenceArray, calcWrappedOffset(jLpProducerIndex + 1, i10)) != null) {
            return writeToQueue(atomicReferenceArray, t10, jLpProducerIndex, iCalcWrappedOffset);
        }
        resize(atomicReferenceArray, jLpProducerIndex, iCalcWrappedOffset, t10, i10);
        return true;
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long jLpConsumerIndex = lpConsumerIndex();
        int i10 = this.consumerMask;
        T t10 = (T) lvElement(atomicReferenceArray, calcWrappedOffset(jLpConsumerIndex, i10));
        return t10 == HAS_NEXT ? newBufferPeek(lvNext(atomicReferenceArray), jLpConsumerIndex, i10) : t10;
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long jLpConsumerIndex = lpConsumerIndex();
        int i10 = this.consumerMask;
        int iCalcWrappedOffset = calcWrappedOffset(jLpConsumerIndex, i10);
        T t10 = (T) lvElement(atomicReferenceArray, iCalcWrappedOffset);
        boolean z10 = t10 == HAS_NEXT;
        if (t10 == null || z10) {
            if (z10) {
                return newBufferPoll(lvNext(atomicReferenceArray), jLpConsumerIndex, i10);
            }
            return null;
        }
        soConsumerIndex(jLpConsumerIndex + 1);
        soElement(atomicReferenceArray, iCalcWrappedOffset, null);
        return t10;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public int size() {
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

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }
}
