package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public final class h4<E> extends n5<E> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f117437c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue<E> f117438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.common.annotations.e
    final int f117439b;

    private h4(int maxSize) {
        com.google.common.base.j0.k(maxSize >= 0, "maxSize (%s) must >= 0", maxSize);
        this.f117438a = new ArrayDeque(maxSize);
        this.f117439b = maxSize;
    }

    public static <E> h4<E> q1(int maxSize) {
        return new h4<>(maxSize);
    }

    @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
    @z7.a
    public boolean add(E e10) {
        com.google.common.base.j0.E(e10);
        if (this.f117439b == 0) {
            return true;
        }
        if (size() == this.f117439b) {
            this.f117438a.remove();
        }
        this.f117438a.add(e10);
        return true;
    }

    @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
    @z7.a
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.f117439b) {
            return N0(collection);
        }
        clear();
        return o7.a(this, o7.N(collection, size - this.f117439b));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.n5, com.google.common.collect.v4
    public Queue<E> i1() {
        return this.f117438a;
    }

    @Override // com.google.common.collect.n5, java.util.Queue
    @z7.a
    public boolean offer(E e10) {
        return add(e10);
    }

    public int remainingCapacity() {
        return this.f117439b - size();
    }

    @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
    @com.google.common.annotations.d
    public Object[] toArray() {
        return super.toArray();
    }
}
