package org.apache.commons.collections4.iterators;

import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class l0<E> extends c<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f335832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f335833c;

    public l0(Iterator<E> it, long j10) {
        super(it);
        if (j10 < 0) {
            throw new IllegalArgumentException("Offset parameter must not be negative.");
        }
        this.f335832b = j10;
        this.f335833c = 0L;
        c();
    }

    private void c() {
        while (this.f335833c < this.f335832b && hasNext()) {
            next();
        }
    }

    @Override // org.apache.commons.collections4.iterators.c, java.util.Iterator
    public E next() {
        E e10 = (E) super.next();
        this.f335833c++;
        return e10;
    }

    @Override // org.apache.commons.collections4.iterators.g, java.util.Iterator
    public void remove() {
        if (this.f335833c <= this.f335832b) {
            throw new IllegalStateException("remove() can not be called before calling next()");
        }
        super.remove();
    }
}
