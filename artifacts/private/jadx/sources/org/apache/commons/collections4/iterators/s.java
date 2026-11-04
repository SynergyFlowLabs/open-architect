package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class s<E> implements Iterator<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator<? extends E> f335852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.apache.commons.collections4.l0<? super E> f335853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private E f335854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f335855d = false;

    public s() {
    }

    private boolean e() {
        while (this.f335852a.hasNext()) {
            E next = this.f335852a.next();
            if (this.f335853b.a(next)) {
                this.f335854c = next;
                this.f335855d = true;
                return true;
            }
        }
        return false;
    }

    public Iterator<? extends E> b() {
        return this.f335852a;
    }

    public org.apache.commons.collections4.l0<? super E> c() {
        return this.f335853b;
    }

    public void d(Iterator<? extends E> it) {
        this.f335852a = it;
        this.f335854c = null;
        this.f335855d = false;
    }

    public void f(org.apache.commons.collections4.l0<? super E> l0Var) {
        this.f335853b = l0Var;
        this.f335854c = null;
        this.f335855d = false;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335855d || e();
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.f335855d && !e()) {
            throw new NoSuchElementException();
        }
        this.f335855d = false;
        return this.f335854c;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.f335855d) {
            throw new IllegalStateException("remove() cannot be called");
        }
        this.f335852a.remove();
    }

    public s(Iterator<? extends E> it) {
        this.f335852a = it;
    }

    public s(Iterator<? extends E> it, org.apache.commons.collections4.l0<? super E> l0Var) {
        this.f335852a = it;
        this.f335853b = l0Var;
    }
}
