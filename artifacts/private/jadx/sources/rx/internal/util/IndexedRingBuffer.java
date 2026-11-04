package rx.internal.util;

import androidx.compose.animation.core.z1;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.Subscription;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes14.dex */
public final class IndexedRingBuffer<E> implements Subscription {
    private static final ObjectPool<IndexedRingBuffer<?>> POOL = new ObjectPool<IndexedRingBuffer<?>>() { // from class: rx.internal.util.IndexedRingBuffer.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // rx.internal.util.ObjectPool
        public IndexedRingBuffer<?> createObject() {
            return new IndexedRingBuffer<>();
        }
    };
    static final int SIZE;
    private final ElementSection<E> elements = new ElementSection<>();
    private final IndexSection removed = new IndexSection();
    final AtomicInteger index = new AtomicInteger();
    final AtomicInteger removedIndex = new AtomicInteger();

    static final class ElementSection<E> {
        final AtomicReferenceArray<E> array = new AtomicReferenceArray<>(IndexedRingBuffer.SIZE);
        final AtomicReference<ElementSection<E>> next = new AtomicReference<>();

        ElementSection() {
        }

        ElementSection<E> getNext() {
            if (this.next.get() != null) {
                return this.next.get();
            }
            ElementSection<E> elementSection = new ElementSection<>();
            return z1.a(this.next, null, elementSection) ? elementSection : this.next.get();
        }
    }

    static class IndexSection {
        private final AtomicIntegerArray unsafeArray = new AtomicIntegerArray(IndexedRingBuffer.SIZE);
        private final AtomicReference<IndexSection> _next = new AtomicReference<>();

        IndexSection() {
        }

        public int getAndSet(int i10, int i11) {
            return this.unsafeArray.getAndSet(i10, i11);
        }

        IndexSection getNext() {
            if (this._next.get() != null) {
                return this._next.get();
            }
            IndexSection indexSection = new IndexSection();
            return z1.a(this._next, null, indexSection) ? indexSection : this._next.get();
        }

        public void set(int i10, int i11) {
            this.unsafeArray.set(i10, i11);
        }
    }

    static {
        int i10 = PlatformDependent.isAndroid() ? 8 : 128;
        String property = System.getProperty("rx.indexed-ring-buffer.size");
        if (property != null) {
            try {
                i10 = Integer.parseInt(property);
            } catch (NumberFormatException e10) {
                System.err.println("Failed to set 'rx.indexed-ring-buffer.size' with value " + property + " => " + e10.getMessage());
            }
        }
        SIZE = i10;
    }

    IndexedRingBuffer() {
    }

    private ElementSection<E> getElementSection(int i10) {
        int i11 = SIZE;
        if (i10 < i11) {
            return this.elements;
        }
        int i12 = i10 / i11;
        ElementSection<E> next = this.elements;
        for (int i13 = 0; i13 < i12; i13++) {
            next = next.getNext();
        }
        return next;
    }

    private synchronized int getIndexForAdd() {
        int andIncrement;
        try {
            int indexFromPreviouslyRemoved = getIndexFromPreviouslyRemoved();
            if (indexFromPreviouslyRemoved >= 0) {
                int i10 = SIZE;
                if (indexFromPreviouslyRemoved < i10) {
                    andIncrement = this.removed.getAndSet(indexFromPreviouslyRemoved, -1);
                } else {
                    andIncrement = getIndexSection(indexFromPreviouslyRemoved).getAndSet(indexFromPreviouslyRemoved % i10, -1);
                }
                if (andIncrement == this.index.get()) {
                    this.index.getAndIncrement();
                }
            } else {
                andIncrement = this.index.getAndIncrement();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return andIncrement;
    }

    private synchronized int getIndexFromPreviouslyRemoved() {
        int i10;
        int i11;
        do {
            try {
                i10 = this.removedIndex.get();
                if (i10 <= 0) {
                    return -1;
                }
                i11 = i10 - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        } while (!this.removedIndex.compareAndSet(i10, i11));
        return i11;
    }

    private IndexSection getIndexSection(int i10) {
        int i11 = SIZE;
        if (i10 < i11) {
            return this.removed;
        }
        int i12 = i10 / i11;
        IndexSection next = this.removed;
        for (int i13 = 0; i13 < i12; i13++) {
            next = next.getNext();
        }
        return next;
    }

    public static <T> IndexedRingBuffer<T> getInstance() {
        return (IndexedRingBuffer) POOL.borrowObject();
    }

    private synchronized void pushRemovedIndex(int i10) {
        try {
            int andIncrement = this.removedIndex.getAndIncrement();
            int i11 = SIZE;
            if (andIncrement < i11) {
                this.removed.set(andIncrement, i10);
            } else {
                getIndexSection(andIncrement).set(andIncrement % i11, i10);
            }
        } finally {
        }
    }

    public int add(E e10) {
        int indexForAdd = getIndexForAdd();
        int i10 = SIZE;
        if (indexForAdd < i10) {
            this.elements.array.set(indexForAdd, e10);
            return indexForAdd;
        }
        getElementSection(indexForAdd).array.set(indexForAdd % i10, e10);
        return indexForAdd;
    }

    public int forEach(Func1<? super E, Boolean> func1) {
        return forEach(func1, 0);
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return false;
    }

    public void releaseToPool() {
        int i10 = this.index.get();
        int i11 = 0;
        loop0: for (ElementSection<E> elementSection = this.elements; elementSection != null; elementSection = elementSection.next.get()) {
            int i12 = 0;
            while (i12 < SIZE) {
                if (i11 >= i10) {
                    break loop0;
                }
                elementSection.array.set(i12, null);
                i12++;
                i11++;
            }
        }
        this.index.set(0);
        this.removedIndex.set(0);
        POOL.returnObject(this);
    }

    public E remove(int i10) {
        E andSet;
        int i11 = SIZE;
        if (i10 < i11) {
            andSet = this.elements.array.getAndSet(i10, null);
        } else {
            andSet = getElementSection(i10).array.getAndSet(i10 % i11, null);
        }
        pushRemovedIndex(i10);
        return andSet;
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        releaseToPool();
    }

    public int forEach(Func1<? super E, Boolean> func1, int i10) {
        int iForEach = forEach(func1, i10, this.index.get());
        if (i10 > 0 && iForEach == this.index.get()) {
            return forEach(func1, 0, i10);
        }
        if (iForEach == this.index.get()) {
            return 0;
        }
        return iForEach;
    }

    private int forEach(Func1<? super E, Boolean> func1, int i10, int i11) {
        int i12;
        E e10;
        int i13 = this.index.get();
        ElementSection<E> elementSection = this.elements;
        int i14 = SIZE;
        if (i10 >= i14) {
            elementSection = getElementSection(i10);
            i10 %= i14;
            i12 = i10;
        } else {
            i12 = i10;
        }
        while (elementSection != null) {
            while (i10 < SIZE) {
                if (i12 < i13 && i12 < i11 && ((e10 = elementSection.array.get(i10)) == null || func1.call(e10).booleanValue())) {
                    i10++;
                    i12++;
                }
                return i12;
            }
            elementSection = elementSection.next.get();
            i10 = 0;
        }
        return i12;
    }
}
