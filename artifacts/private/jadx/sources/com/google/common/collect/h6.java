package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes5.dex */
@z7.f("Use ImmutableList.of or another implementation")
@a4
@com.google.common.annotations.b(emulated = true)
public abstract class h6<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f117440a = 1296;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object[] f117441b = new Object[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f117442c = 912559;

    static abstract class a<E> extends b<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object[] f117443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f117444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f117445d;

        a(int initialCapacity) {
            a3.b(initialCapacity, "initialCapacity");
            this.f117443b = new Object[initialCapacity];
            this.f117444c = 0;
        }

        private void i(int newElements) {
            Object[] objArr = this.f117443b;
            int iF = b.f(objArr.length, this.f117444c + newElements);
            if (iF <= objArr.length && !this.f117445d) {
                return;
            }
            this.f117443b = Arrays.copyOf(this.f117443b, iF);
            this.f117445d = false;
        }

        @Override // com.google.common.collect.h6.b
        @z7.a
        public b<E> b(E... elements) {
            h(elements, elements.length);
            return this;
        }

        @Override // com.google.common.collect.h6.b
        @z7.a
        public b<E> c(Iterable<? extends E> elements) {
            if (elements instanceof Collection) {
                Collection collection = (Collection) elements;
                i(collection.size());
                if (collection instanceof h6) {
                    this.f117444c = ((h6) collection).d(this.f117443b, this.f117444c);
                    return this;
                }
            }
            super.c(elements);
            return this;
        }

        @Override // com.google.common.collect.h6.b
        @z7.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a<E> a(E element) {
            com.google.common.base.j0.E(element);
            i(1);
            Object[] objArr = this.f117443b;
            int i10 = this.f117444c;
            this.f117444c = i10 + 1;
            objArr[i10] = element;
            return this;
        }

        final void h(Object[] elements, int n10) {
            x8.c(elements, n10);
            i(n10);
            System.arraycopy(elements, 0, this.f117443b, this.f117444c, n10);
            this.f117444c += n10;
        }
    }

    @z7.f
    public static abstract class b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f117446a = 4;

        b() {
        }

        static int f(int oldCapacity, int minCapacity) {
            if (minCapacity < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (minCapacity <= oldCapacity) {
                return oldCapacity;
            }
            int iHighestOneBit = oldCapacity + (oldCapacity >> 1) + 1;
            if (iHighestOneBit < minCapacity) {
                iHighestOneBit = Integer.highestOneBit(minCapacity - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        @z7.a
        public abstract b<E> a(E element);

        @z7.a
        public b<E> b(E... elements) {
            for (E e10 : elements) {
                a(e10);
            }
            return this;
        }

        @z7.a
        public b<E> c(Iterable<? extends E> elements) {
            Iterator<? extends E> it = elements.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        @z7.a
        public b<E> d(Iterator<? extends E> elements) {
            while (elements.hasNext()) {
                a(elements.next());
            }
            return this;
        }

        public abstract h6<E> e();
    }

    h6() {
    }

    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    public final boolean addAll(Collection<? extends E> newElements) {
        throw new UnsupportedOperationException();
    }

    public l6<E> c() {
        return isEmpty() ? l6.F() : l6.p(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@fj.a Object object);

    @z7.a
    int d(Object[] dst, int offset) {
        nb<E> it = iterator();
        while (it.hasNext()) {
            dst[offset] = it.next();
            offset++;
        }
        return offset;
    }

    @fj.a
    Object[] i() {
        return null;
    }

    int k() {
        throw new UnsupportedOperationException();
    }

    int l() {
        throw new UnsupportedOperationException();
    }

    abstract boolean m();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public abstract nb<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @z7.a
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@fj.a Object object) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    public final boolean removeAll(Collection<?> oldElements) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    public final boolean retainAll(Collection<?> elementsToKeep) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @d6
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, f117440a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @com.google.common.annotations.d
    public final Object[] toArray() {
        return toArray(f117441b);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return new l6.d(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @z7.a
    public final <T> T[] toArray(T[] tArr) {
        com.google.common.base.j0.E(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrI = i();
            if (objArrI != null) {
                return (T[]) d9.a(objArrI, l(), k(), tArr);
            }
            tArr = (T[]) x8.j(tArr, size);
        } else if (tArr.length > size) {
            int i10 = 7 >> 0;
            tArr[size] = null;
        }
        d(tArr, 0);
        return tArr;
    }
}
