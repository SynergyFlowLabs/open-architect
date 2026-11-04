package org.apache.commons.collections4.iterators;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class y<E> implements org.apache.commons.collections4.q0<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f335878f = "ListIteratorWrapper does not support optional operations of ListIterator.";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f335879g = "Cannot remove element at index {0}.";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator<? extends E> f335880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<E> f335881b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f335882c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f335883d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f335884e;

    public y(Iterator<? extends E> it) {
        if (it == null) {
            throw new NullPointerException("Iterator must not be null");
        }
        this.f335880a = it;
    }

    @Override // java.util.ListIterator
    public void add(E e10) throws UnsupportedOperationException {
        Iterator<? extends E> it = this.f335880a;
        if (!(it instanceof ListIterator)) {
            throw new UnsupportedOperationException(f335878f);
        }
        ((ListIterator) it).add(e10);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.f335882c == this.f335883d || (this.f335880a instanceof ListIterator)) {
            return this.f335880a.hasNext();
        }
        return true;
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.i0
    public boolean hasPrevious() {
        Iterator<? extends E> it = this.f335880a;
        if (it instanceof ListIterator) {
            return ((ListIterator) it).hasPrevious();
        }
        return this.f335882c > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() throws NoSuchElementException {
        Iterator<? extends E> it = this.f335880a;
        if (it instanceof ListIterator) {
            return it.next();
        }
        int i10 = this.f335882c;
        if (i10 < this.f335883d) {
            this.f335882c = i10 + 1;
            return this.f335881b.get(i10);
        }
        E next = it.next();
        this.f335881b.add(next);
        this.f335882c++;
        this.f335883d++;
        this.f335884e = true;
        return next;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        Iterator<? extends E> it = this.f335880a;
        return it instanceof ListIterator ? ((ListIterator) it).nextIndex() : this.f335882c;
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.i0
    public E previous() throws NoSuchElementException {
        Iterator<? extends E> it = this.f335880a;
        if (it instanceof ListIterator) {
            return (E) ((ListIterator) it).previous();
        }
        int i10 = this.f335882c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        this.f335884e = this.f335883d == i10;
        List<E> list = this.f335881b;
        int i11 = i10 - 1;
        this.f335882c = i11;
        return list.get(i11);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        Iterator<? extends E> it = this.f335880a;
        return it instanceof ListIterator ? ((ListIterator) it).previousIndex() : this.f335882c - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() throws UnsupportedOperationException {
        Iterator<? extends E> it = this.f335880a;
        if (it instanceof ListIterator) {
            it.remove();
            return;
        }
        int i10 = this.f335882c;
        int i11 = this.f335883d;
        int i12 = i10 == i11 ? i10 - 1 : i10;
        if (!this.f335884e || i11 - i10 > 1) {
            throw new IllegalStateException(MessageFormat.format(f335879g, Integer.valueOf(i12)));
        }
        it.remove();
        this.f335881b.remove(i12);
        this.f335882c = i12;
        this.f335883d--;
        this.f335884e = false;
    }

    @Override // org.apache.commons.collections4.p0
    public void reset() {
        Iterator<? extends E> it = this.f335880a;
        if (!(it instanceof ListIterator)) {
            this.f335882c = 0;
            return;
        }
        ListIterator listIterator = (ListIterator) it;
        while (listIterator.previousIndex() >= 0) {
            listIterator.previous();
        }
    }

    @Override // java.util.ListIterator
    public void set(E e10) throws UnsupportedOperationException {
        Iterator<? extends E> it = this.f335880a;
        if (!(it instanceof ListIterator)) {
            throw new UnsupportedOperationException(f335878f);
        }
        ((ListIterator) it).set(e10);
    }
}
