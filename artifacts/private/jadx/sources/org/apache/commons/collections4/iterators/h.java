package org.apache.commons.collections4.iterators;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class h<E> implements org.apache.commons.collections4.p0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f335803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f335804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f335805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f335806d;

    public h(Object obj) {
        this(obj, 0);
    }

    protected void b(int i10, int i11, String str) {
        if (i10 > i11) {
            throw new ArrayIndexOutOfBoundsException("Attempt to make an ArrayIterator that " + str + "s beyond the end of the array. ");
        }
        if (i10 >= 0) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Attempt to make an ArrayIterator that " + str + "s before the start of the array. ");
    }

    public Object c() {
        return this.f335803a;
    }

    public int d() {
        return this.f335805c;
    }

    public int e() {
        return this.f335804b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335806d < this.f335805c;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.f335803a;
        int i10 = this.f335806d;
        this.f335806d = i10 + 1;
        return (E) Array.get(obj, i10);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() method is not supported");
    }

    @Override // org.apache.commons.collections4.p0
    public void reset() {
        this.f335806d = this.f335804b;
    }

    public h(Object obj, int i10) {
        this(obj, i10, Array.getLength(obj));
    }

    public h(Object obj, int i10, int i11) {
        this.f335803a = obj;
        this.f335804b = i10;
        this.f335805c = i11;
        this.f335806d = i10;
        int length = Array.getLength(obj);
        b(i10, length, "start");
        b(i11, length, "end");
        if (i11 < i10) {
            throw new IllegalArgumentException("End index must not be less than start index.");
        }
    }
}
