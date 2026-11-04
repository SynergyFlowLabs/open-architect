package rx.internal.util.atomic;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: classes14.dex */
abstract class AtomicReferenceArrayQueue<E> extends AbstractQueue<E> {
    protected final AtomicReferenceArray<E> buffer;
    protected final int mask;

    public AtomicReferenceArrayQueue(int i10) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i10);
        this.mask = iRoundToPowerOfTwo - 1;
        this.buffer = new AtomicReferenceArray<>(iRoundToPowerOfTwo);
    }

    protected final int calcElementOffset(long j10, int i10) {
        return ((int) j10) & i10;
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

    protected final E lpElement(AtomicReferenceArray<E> atomicReferenceArray, int i10) {
        return atomicReferenceArray.get(i10);
    }

    protected final E lvElement(AtomicReferenceArray<E> atomicReferenceArray, int i10) {
        return atomicReferenceArray.get(i10);
    }

    protected final void soElement(AtomicReferenceArray<E> atomicReferenceArray, int i10, E e10) {
        atomicReferenceArray.lazySet(i10, e10);
    }

    protected final void spElement(AtomicReferenceArray<E> atomicReferenceArray, int i10, E e10) {
        atomicReferenceArray.lazySet(i10, e10);
    }

    protected final void svElement(AtomicReferenceArray<E> atomicReferenceArray, int i10, E e10) {
        atomicReferenceArray.set(i10, e10);
    }

    protected final int calcElementOffset(long j10) {
        return this.mask & ((int) j10);
    }

    protected final E lpElement(int i10) {
        return this.buffer.get(i10);
    }

    protected final E lvElement(int i10) {
        return lvElement(this.buffer, i10);
    }

    protected final void soElement(int i10, E e10) {
        this.buffer.lazySet(i10, e10);
    }

    protected final void spElement(int i10, E e10) {
        this.buffer.lazySet(i10, e10);
    }
}
