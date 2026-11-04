package org.apache.commons.collections4.iterators;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class e0<E> implements Iterator<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deque<Iterator<? extends E>> f335786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private E f335787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w0<? super E, ? extends E> f335788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f335789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Iterator<? extends E> f335790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private E f335791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Iterator<? extends E> f335792g;

    public e0(E e10, w0<? super E, ? extends E> w0Var) {
        this.f335786a = new ArrayDeque(8);
        this.f335789d = false;
        if (e10 instanceof Iterator) {
            this.f335790e = (Iterator) e10;
        } else {
            this.f335787b = e10;
        }
        this.f335788c = w0Var;
    }

    protected void b(E e10) {
        if (e10 instanceof Iterator) {
            c((Iterator) e10);
        } else {
            this.f335791f = e10;
            this.f335789d = true;
        }
    }

    protected void c(Iterator<? extends E> it) {
        Iterator<? extends E> it2 = this.f335790e;
        if (it != it2) {
            if (it2 != null) {
                this.f335786a.push(it2);
            }
            this.f335790e = it;
        }
        while (this.f335790e.hasNext() && !this.f335789d) {
            E next = this.f335790e.next();
            w0<? super E, ? extends E> w0Var = this.f335788c;
            if (w0Var != null) {
                next = w0Var.a(next);
            }
            b(next);
        }
        if (this.f335789d || this.f335786a.isEmpty()) {
            return;
        }
        Iterator<? extends E> itPop = this.f335786a.pop();
        this.f335790e = itPop;
        c(itPop);
    }

    protected void d() {
        if (this.f335789d) {
            return;
        }
        Iterator<? extends E> it = this.f335790e;
        if (it != null) {
            c(it);
            return;
        }
        E e10 = this.f335787b;
        if (e10 == null) {
            return;
        }
        w0<? super E, ? extends E> w0Var = this.f335788c;
        if (w0Var == null) {
            b(e10);
        } else {
            b(w0Var.a(e10));
        }
        this.f335787b = null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        d();
        return this.f335789d;
    }

    @Override // java.util.Iterator
    public E next() {
        d();
        if (!this.f335789d) {
            throw new NoSuchElementException("No more elements in the iteration");
        }
        this.f335792g = this.f335790e;
        E e10 = this.f335791f;
        this.f335791f = null;
        this.f335789d = false;
        return e10;
    }

    @Override // java.util.Iterator
    public void remove() {
        Iterator<? extends E> it = this.f335792g;
        if (it == null) {
            throw new IllegalStateException("Iterator remove() cannot be called at this time");
        }
        it.remove();
        this.f335792g = null;
    }

    public e0(Iterator<? extends E> it) {
        this.f335786a = new ArrayDeque(8);
        this.f335789d = false;
        this.f335790e = it;
        this.f335788c = null;
    }
}
