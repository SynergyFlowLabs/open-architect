package org.apache.commons.collections4.iterators;

import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class v<E> implements Enumeration<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator<? extends E> f335870a;

    public v() {
    }

    public Iterator<? extends E> a() {
        return this.f335870a;
    }

    public void b(Iterator<? extends E> it) {
        this.f335870a = it;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f335870a.hasNext();
    }

    @Override // java.util.Enumeration
    public E nextElement() {
        return this.f335870a.next();
    }

    public v(Iterator<? extends E> it) {
        this.f335870a = it;
    }
}
