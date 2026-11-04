package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class s0<E> implements Iterator<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator<Iterator<? extends E>> f335856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Iterator<? extends E> f335857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator<? extends E> f335858c;

    public s0(Iterator<? extends E> it, Iterator<? extends E> it2) {
        this(it, it2);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f335857b != null) {
            return true;
        }
        while (this.f335856a.hasNext()) {
            Iterator<? extends E> next = this.f335856a.next();
            if (next.hasNext()) {
                this.f335857b = next;
                return true;
            }
            this.f335856a.remove();
        }
        return false;
    }

    @Override // java.util.Iterator
    public E next() throws NoSuchElementException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E next = this.f335857b.next();
        this.f335858c = this.f335857b;
        this.f335857b = null;
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        Iterator<? extends E> it = this.f335858c;
        if (it == null) {
            throw new IllegalStateException("No value can be removed at present");
        }
        it.remove();
        this.f335858c = null;
    }

    public s0(Iterator<? extends E> it, Iterator<? extends E> it2, Iterator<? extends E> it3) {
        this(it, it2, it3);
    }

    public s0(Iterator<? extends E>... itArr) {
        this.f335857b = null;
        this.f335858c = null;
        ArrayList arrayList = new ArrayList();
        for (Iterator<? extends E> it : itArr) {
            if (it == null) {
                throw new NullPointerException("Iterator must not be null.");
            }
            arrayList.add(it);
        }
        this.f335856a = org.apache.commons.collections4.p.A(arrayList).w().iterator();
    }
}
