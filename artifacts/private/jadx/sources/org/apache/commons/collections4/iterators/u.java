package org.apache.commons.collections4.iterators;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes14.dex */
public class u<E> implements Iterator<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue<Iterator<? extends E>> f335866a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Iterator<? extends E> f335867b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator<? extends E> f335868c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f335869d = false;

    public u() {
    }

    private void c() {
        if (this.f335869d) {
            throw new UnsupportedOperationException("IteratorChain cannot be changed after the first use of a method from the Iterator interface");
        }
    }

    private void e() {
        if (!this.f335869d) {
            this.f335869d = true;
        }
    }

    public void b(Iterator<? extends E> it) {
        c();
        if (it == null) {
            throw new NullPointerException("Iterator must not be null");
        }
        this.f335866a.add(it);
    }

    public boolean d() {
        return this.f335869d;
    }

    public int f() {
        return this.f335866a.size();
    }

    protected void g() {
        if (this.f335867b == null) {
            if (this.f335866a.isEmpty()) {
                this.f335867b = l.b();
            } else {
                this.f335867b = this.f335866a.remove();
            }
            this.f335868c = this.f335867b;
        }
        while (!this.f335867b.hasNext() && !this.f335866a.isEmpty()) {
            this.f335867b = this.f335866a.remove();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        e();
        g();
        Iterator<? extends E> it = this.f335867b;
        this.f335868c = it;
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        e();
        g();
        Iterator<? extends E> it = this.f335867b;
        this.f335868c = it;
        return it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        e();
        if (this.f335867b == null) {
            g();
        }
        this.f335868c.remove();
    }

    public u(Iterator<? extends E> it) {
        b(it);
    }

    public u(Iterator<? extends E> it, Iterator<? extends E> it2) {
        b(it);
        b(it2);
    }

    public u(Iterator<? extends E>... itArr) {
        for (Iterator<? extends E> it : itArr) {
            b(it);
        }
    }

    public u(Collection<Iterator<? extends E>> collection) {
        Iterator<Iterator<? extends E>> it = collection.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
