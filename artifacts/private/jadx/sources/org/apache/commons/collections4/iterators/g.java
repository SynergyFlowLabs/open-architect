package org.apache.commons.collections4.iterators;

import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public abstract class g<I, O> implements Iterator<O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator<I> f335798a;

    protected g(Iterator<I> it) {
        if (it == null) {
            throw new NullPointerException("Iterator must not be null");
        }
        this.f335798a = it;
    }

    protected Iterator<I> b() {
        return this.f335798a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335798a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f335798a.remove();
    }
}
