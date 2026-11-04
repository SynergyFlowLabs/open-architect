package org.apache.commons.collections4.iterators;

import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class w<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator<? extends E> f335871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterator<E> f335872b;

    static class a implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f335873a;

        a(Iterator it) {
            this.f335873a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f335873a.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            return (E) this.f335873a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f335873a.remove();
        }
    }

    public w(Iterator<? extends E> it) {
        this(it, false);
    }

    private static <E> Iterator<E> c(Iterator<? extends E> it) {
        return new a(it);
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<? extends E> it = this.f335871a;
        if (it instanceof org.apache.commons.collections4.p0) {
            ((org.apache.commons.collections4.p0) it).reset();
        }
        return this.f335872b;
    }

    public w(Iterator<? extends E> it, boolean z10) {
        if (!z10 || (it instanceof org.apache.commons.collections4.p0)) {
            this.f335871a = it;
        } else {
            this.f335871a = new y(it);
        }
        this.f335872b = c(this.f335871a);
    }
}
