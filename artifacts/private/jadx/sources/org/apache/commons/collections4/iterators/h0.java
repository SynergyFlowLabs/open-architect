package org.apache.commons.collections4.iterators;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class h0<E> implements Iterator<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator<? extends E> f335807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deque<E> f335808b = new ArrayDeque();

    public h0(Iterator<? extends E> it) {
        this.f335807a = it;
    }

    public static <E> h0<E> c(Iterator<? extends E> it) {
        if (it != null) {
            return it instanceof h0 ? (h0) it : new h0<>(it);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public void b(E e10) {
        this.f335808b.push(e10);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f335808b.isEmpty()) {
            return this.f335807a.hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public E next() {
        return !this.f335808b.isEmpty() ? this.f335808b.pop() : this.f335807a.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
