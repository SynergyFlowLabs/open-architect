package org.apache.commons.collections4.iterators;

import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public abstract class x<E> implements Iterator<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f335874a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f335875b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator<? extends E> f335876c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Iterator<? extends E> f335877d = null;

    private void c() {
        int i10 = this.f335874a;
        if (i10 == 0) {
            int i11 = i10 + 1;
            this.f335874a = i11;
            Iterator<? extends E> itB = b(i11);
            this.f335876c = itB;
            if (itB == null) {
                this.f335876c = l.b();
                this.f335875b = true;
            }
            this.f335877d = this.f335876c;
        }
        while (!this.f335876c.hasNext() && !this.f335875b) {
            int i12 = this.f335874a + 1;
            this.f335874a = i12;
            Iterator<? extends E> itB2 = b(i12);
            if (itB2 != null) {
                this.f335876c = itB2;
            } else {
                this.f335875b = true;
            }
        }
    }

    protected abstract Iterator<? extends E> b(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        c();
        Iterator<? extends E> it = this.f335876c;
        this.f335877d = it;
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        c();
        Iterator<? extends E> it = this.f335876c;
        this.f335877d = it;
        return it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.f335876c == null) {
            c();
        }
        this.f335877d.remove();
    }
}
