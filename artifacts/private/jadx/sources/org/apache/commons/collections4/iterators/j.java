package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class j<E> implements Iterator<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator<? extends E> f335813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f335814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f335815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f335816d;

    public j(Iterator<? extends E> it, long j10, long j11) {
        if (it == null) {
            throw new NullPointerException("Iterator must not be null");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException("Offset parameter must not be negative.");
        }
        if (j11 < 0) {
            throw new IllegalArgumentException("Max parameter must not be negative.");
        }
        this.f335813a = it;
        this.f335814b = j10;
        this.f335815c = j11;
        this.f335816d = 0L;
        c();
    }

    private boolean b() {
        return (this.f335816d - this.f335814b) + 1 <= this.f335815c;
    }

    private void c() {
        while (this.f335816d < this.f335814b && this.f335813a.hasNext()) {
            this.f335813a.next();
            this.f335816d++;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (b()) {
            return this.f335813a.hasNext();
        }
        return false;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!b()) {
            throw new NoSuchElementException();
        }
        E next = this.f335813a.next();
        this.f335816d++;
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.f335816d <= this.f335814b) {
            throw new IllegalStateException("remove() can not be called before calling next()");
        }
        this.f335813a.remove();
    }
}
