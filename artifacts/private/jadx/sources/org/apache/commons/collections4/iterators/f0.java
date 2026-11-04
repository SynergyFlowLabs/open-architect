package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class f0<E> implements Iterator<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator<? extends E> f335794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f335795b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f335796c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private E f335797d;

    public f0(Iterator<? extends E> it) {
        this.f335794a = it;
    }

    private void c() {
        if (this.f335795b || this.f335796c) {
            return;
        }
        if (this.f335794a.hasNext()) {
            this.f335797d = this.f335794a.next();
            this.f335796c = true;
        } else {
            this.f335795b = true;
            this.f335797d = null;
            this.f335796c = false;
        }
    }

    public static <E> f0<E> d(Iterator<? extends E> it) {
        if (it != null) {
            return it instanceof f0 ? (f0) it : new f0<>(it);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public E b() {
        c();
        if (this.f335795b) {
            throw new NoSuchElementException();
        }
        return this.f335797d;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f335795b) {
            return false;
        }
        if (this.f335796c) {
            return true;
        }
        return this.f335794a.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E next = this.f335796c ? this.f335797d : this.f335794a.next();
        this.f335797d = null;
        this.f335796c = false;
        return next;
    }

    public E peek() {
        c();
        if (this.f335795b) {
            return null;
        }
        return this.f335797d;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.f335796c) {
            throw new IllegalStateException("peek() or element() called before remove()");
        }
        this.f335794a.remove();
    }
}
