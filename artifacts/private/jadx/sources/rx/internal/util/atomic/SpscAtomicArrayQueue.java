package rx.internal.util.atomic;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes14.dex */
public final class SpscAtomicArrayQueue<E> extends AtomicReferenceArrayQueue<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    final AtomicLong consumerIndex;
    final int lookAheadStep;
    final AtomicLong producerIndex;
    long producerLookAhead;

    public SpscAtomicArrayQueue(int i10) {
        super(i10);
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(i10 / 4, MAX_LOOK_AHEAD_STEP.intValue());
    }

    private long lvConsumerIndex() {
        return this.consumerIndex.get();
    }

    private long lvProducerIndex() {
        return this.producerIndex.get();
    }

    private void soConsumerIndex(long j10) {
        this.consumerIndex.lazySet(j10);
    }

    private void soProducerIndex(long j10) {
        this.producerIndex.lazySet(j10);
    }

    @Override // rx.internal.util.atomic.AtomicReferenceArrayQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return lvProducerIndex() == lvConsumerIndex();
    }

    @Override // rx.internal.util.atomic.AtomicReferenceArrayQueue, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // java.util.Queue
    public boolean offer(E e10) {
        if (e10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i10 = this.mask;
        long j10 = this.producerIndex.get();
        int iCalcElementOffset = calcElementOffset(j10, i10);
        if (j10 >= this.producerLookAhead) {
            long j11 = ((long) this.lookAheadStep) + j10;
            if (lvElement(atomicReferenceArray, calcElementOffset(j11, i10)) == null) {
                this.producerLookAhead = j11;
            } else if (lvElement(atomicReferenceArray, iCalcElementOffset) != null) {
                return false;
            }
        }
        soElement(atomicReferenceArray, iCalcElementOffset, e10);
        soProducerIndex(j10 + 1);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        return lvElement(calcElementOffset(this.consumerIndex.get()));
    }

    @Override // java.util.Queue
    public E poll() {
        long j10 = this.consumerIndex.get();
        int iCalcElementOffset = calcElementOffset(j10);
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        E eLvElement = lvElement(atomicReferenceArray, iCalcElementOffset);
        if (eLvElement == null) {
            return null;
        }
        soElement(atomicReferenceArray, iCalcElementOffset, null);
        soConsumerIndex(j10 + 1);
        return eLvElement;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
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
}
