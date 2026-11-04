package org.apache.commons.collections4.iterators;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class z<E> implements org.apache.commons.collections4.p0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection<? extends E> f335885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Iterator<? extends E> f335886b;

    public z(Collection<? extends E> collection) {
        if (collection == null) {
            throw new NullPointerException("The collection must not be null");
        }
        this.f335885a = collection;
        reset();
    }

    public int b() {
        return this.f335885a.size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335885a.size() > 0;
    }

    @Override // java.util.Iterator
    public E next() {
        if (this.f335885a.size() == 0) {
            throw new NoSuchElementException("There are no elements for this iterator to loop on");
        }
        if (!this.f335886b.hasNext()) {
            reset();
        }
        return this.f335886b.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f335886b.remove();
    }

    @Override // org.apache.commons.collections4.p0
    public void reset() {
        this.f335886b = this.f335885a.iterator();
    }
}
