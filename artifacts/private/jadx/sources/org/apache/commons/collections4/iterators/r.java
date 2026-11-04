package org.apache.commons.collections4.iterators;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class r<E> implements Iterator<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection<? super E> f335848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Enumeration<? extends E> f335849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private E f335850c;

    public r() {
        this(null, null);
    }

    public Enumeration<? extends E> b() {
        return this.f335849b;
    }

    public void c(Enumeration<? extends E> enumeration) {
        this.f335849b = enumeration;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335849b.hasMoreElements();
    }

    @Override // java.util.Iterator
    public E next() {
        E eNextElement = this.f335849b.nextElement();
        this.f335850c = eNextElement;
        return eNextElement;
    }

    @Override // java.util.Iterator
    public void remove() {
        Collection<? super E> collection = this.f335848a;
        if (collection == null) {
            throw new UnsupportedOperationException("No Collection associated with this Iterator");
        }
        E e10 = this.f335850c;
        if (e10 == null) {
            throw new IllegalStateException("next() must have been called for remove() to function");
        }
        collection.remove(e10);
    }

    public r(Enumeration<? extends E> enumeration) {
        this(enumeration, null);
    }

    public r(Enumeration<? extends E> enumeration, Collection<? super E> collection) {
        this.f335849b = enumeration;
        this.f335848a = collection;
        this.f335850c = null;
    }
}
