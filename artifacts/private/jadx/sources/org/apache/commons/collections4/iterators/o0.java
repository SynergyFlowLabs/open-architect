package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import org.apache.commons.collections4.a1;

/* JADX INFO: loaded from: classes14.dex */
public final class o0<E> implements Iterator<E>, a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator<? extends E> f335840a;

    private o0(Iterator<? extends E> it) {
        this.f335840a = it;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> Iterator<E> b(Iterator<? extends E> it) {
        if (it != 0) {
            return it instanceof a1 ? it : new o0(it);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335840a.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        return this.f335840a.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is not supported");
    }
}
