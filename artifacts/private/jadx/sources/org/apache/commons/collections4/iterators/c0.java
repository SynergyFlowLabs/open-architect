package org.apache.commons.collections4.iterators;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class c0<E> implements org.apache.commons.collections4.p0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final E[] f335779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f335780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f335781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f335782d;

    public c0(E... eArr) {
        this(eArr, 0, eArr.length);
    }

    public E[] b() {
        return this.f335779a;
    }

    public int c() {
        return this.f335781c;
    }

    public int d() {
        return this.f335780b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335782d < this.f335781c;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E[] eArr = this.f335779a;
        int i10 = this.f335782d;
        this.f335782d = i10 + 1;
        return eArr[i10];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() method is not supported for an ObjectArrayIterator");
    }

    @Override // org.apache.commons.collections4.p0
    public void reset() {
        this.f335782d = this.f335780b;
    }

    public c0(E[] eArr, int i10) {
        this(eArr, i10, eArr.length);
    }

    public c0(E[] eArr, int i10, int i11) {
        this.f335782d = 0;
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Start index must not be less than zero");
        }
        if (i11 <= eArr.length) {
            if (i10 > eArr.length) {
                throw new ArrayIndexOutOfBoundsException("Start index must not be greater than the array length");
            }
            if (i11 >= i10) {
                this.f335779a = eArr;
                this.f335780b = i10;
                this.f335781c = i11;
                this.f335782d = i10;
                return;
            }
            throw new IllegalArgumentException("End index must not be less than start index");
        }
        throw new ArrayIndexOutOfBoundsException("End index must not be greater than the array length");
    }
}
