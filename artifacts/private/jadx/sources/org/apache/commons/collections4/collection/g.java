package org.apache.commons.collections4.collection;

import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.collections4.a1;
import org.apache.commons.collections4.iterators.o0;

/* JADX INFO: loaded from: classes14.dex */
public final class g<E> extends a<E> implements org.apache.commons.collections4.f<E>, a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f335616c = -7112672385450340330L;

    private g(org.apache.commons.collections4.f<? extends E> fVar) {
        super(fVar);
    }

    public static <E> org.apache.commons.collections4.f<E> k(Collection<? extends E> collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        for (int i10 = 0; i10 < 1000 && !(collection instanceof org.apache.commons.collections4.f); i10++) {
            if (collection instanceof a) {
                collection = ((a) collection).c();
            } else if (collection instanceof e) {
                collection = ((e) collection).c();
            }
        }
        if (collection instanceof org.apache.commons.collections4.f) {
            return new g((org.apache.commons.collections4.f) collection);
        }
        throw new IllegalArgumentException("Collection is not a bounded collection.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> org.apache.commons.collections4.f<E> l(org.apache.commons.collections4.f<? extends E> fVar) {
        return fVar instanceof a1 ? fVar : new g(fVar);
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.collection.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public org.apache.commons.collections4.f<E> c() {
        return (org.apache.commons.collections4.f) super.c();
    }

    @Override // org.apache.commons.collections4.f
    public boolean isFull() {
        return c().isFull();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.c
    public Iterator<E> iterator() {
        return o0.b(c().iterator());
    }

    @Override // org.apache.commons.collections4.f
    public int o0() {
        return c().o0();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }
}
