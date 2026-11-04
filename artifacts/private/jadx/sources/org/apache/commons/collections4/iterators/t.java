package org.apache.commons.collections4.iterators;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class t<E> implements ListIterator<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ListIterator<? extends E> f335859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.apache.commons.collections4.l0<? super E> f335860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private E f335861c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private E f335863e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f335862d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f335864f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f335865g = 0;

    public t() {
    }

    private void b() {
        this.f335861c = null;
        this.f335862d = false;
    }

    private void c() {
        this.f335863e = null;
        this.f335864f = false;
    }

    private boolean g() {
        if (this.f335864f) {
            c();
            if (!g()) {
                return false;
            }
            b();
        }
        if (this.f335859a == null) {
            return false;
        }
        while (this.f335859a.hasNext()) {
            E next = this.f335859a.next();
            if (this.f335860b.a(next)) {
                this.f335861c = next;
                this.f335862d = true;
                return true;
            }
        }
        return false;
    }

    private boolean i() {
        if (this.f335862d) {
            b();
            if (!i()) {
                return false;
            }
            c();
        }
        if (this.f335859a == null) {
            return false;
        }
        while (this.f335859a.hasPrevious()) {
            E ePrevious = this.f335859a.previous();
            if (this.f335860b.a(ePrevious)) {
                this.f335863e = ePrevious;
                this.f335864f = true;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.ListIterator
    public void add(E e10) {
        throw new UnsupportedOperationException("FilterListIterator.add(Object) is not supported.");
    }

    public ListIterator<? extends E> d() {
        return this.f335859a;
    }

    public org.apache.commons.collections4.l0<? super E> e() {
        return this.f335860b;
    }

    public void f(ListIterator<? extends E> listIterator) {
        this.f335859a = listIterator;
    }

    public void h(org.apache.commons.collections4.l0<? super E> l0Var) {
        this.f335860b = l0Var;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f335862d || g();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f335864f || i();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!this.f335862d && !g()) {
            throw new NoSuchElementException();
        }
        this.f335865g++;
        E e10 = this.f335861c;
        b();
        return e10;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f335865g;
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (!this.f335864f && !i()) {
            throw new NoSuchElementException();
        }
        this.f335865g--;
        E e10 = this.f335863e;
        c();
        return e10;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f335865g - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("FilterListIterator.remove() is not supported.");
    }

    @Override // java.util.ListIterator
    public void set(E e10) {
        throw new UnsupportedOperationException("FilterListIterator.set(Object) is not supported.");
    }

    public t(ListIterator<? extends E> listIterator) {
        this.f335859a = listIterator;
    }

    public t(ListIterator<? extends E> listIterator, org.apache.commons.collections4.l0<? super E> l0Var) {
        this.f335859a = listIterator;
        this.f335860b = l0Var;
    }

    public t(org.apache.commons.collections4.l0<? super E> l0Var) {
        this.f335860b = l0Var;
    }
}
