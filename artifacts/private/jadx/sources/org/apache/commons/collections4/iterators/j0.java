package org.apache.commons.collections4.iterators;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class j0<E> implements org.apache.commons.collections4.p0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f335817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f335818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f335819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private E f335820d;

    public j0(E e10) {
        this(e10, true);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335818b && !this.f335819c;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.f335818b || this.f335819c) {
            throw new NoSuchElementException();
        }
        this.f335818b = false;
        return this.f335820d;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f335817a) {
            throw new UnsupportedOperationException();
        }
        if (this.f335819c || this.f335818b) {
            throw new IllegalStateException();
        }
        this.f335820d = null;
        this.f335819c = true;
    }

    @Override // org.apache.commons.collections4.p0
    public void reset() {
        this.f335818b = true;
    }

    public j0(E e10, boolean z10) {
        this.f335818b = true;
        this.f335819c = false;
        this.f335820d = e10;
        this.f335817a = z10;
    }
}
