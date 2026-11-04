package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
final class j3<E> extends c<E> implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j3<Object> f126020e = new j3<>(new Object[0], 0, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private E[] f126021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f126022d;

    j3() {
        this(new Object[10], 0, true);
    }

    private static <E> E[] d(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> j3<E> i() {
        return (j3<E>) f126020e;
    }

    private void k(int index) {
        if (index < 0 || index >= this.f126022d) {
            throw new IndexOutOfBoundsException(l(index));
        }
    }

    private String l(int index) {
        return "Index:" + index + ", Size:" + this.f126022d;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        c();
        int i10 = this.f126022d;
        E[] eArr = this.f126021c;
        if (i10 == eArr.length) {
            this.f126021c = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f126021c;
        int i11 = this.f126022d;
        this.f126022d = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        k(index);
        return this.f126021c[index];
    }

    @Override // com.google.protobuf.s1.k, com.google.protobuf.s1.i
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public j3<E> b2(int capacity) {
        if (capacity >= this.f126022d) {
            return new j3<>(Arrays.copyOf(this.f126021c, capacity), this.f126022d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int index) {
        c();
        k(index);
        E[] eArr = this.f126021c;
        E e10 = eArr[index];
        int i10 = this.f126022d;
        if (index < i10 - 1) {
            System.arraycopy(eArr, index + 1, eArr, index, (i10 - index) - 1);
        }
        this.f126022d--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        c();
        k(index);
        E[] eArr = this.f126021c;
        E e10 = eArr[index];
        eArr[index] = element;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f126022d;
    }

    private j3(E[] array, int size, boolean isMutable) {
        super(isMutable);
        this.f126021c = array;
        this.f126022d = size;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f126022d)) {
            E[] eArr = this.f126021c;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) d(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f126021c, 0, eArr2, 0, i10);
                System.arraycopy(this.f126021c, i10, eArr2, i10 + 1, this.f126022d - i10);
                this.f126021c = eArr2;
            }
            this.f126021c[i10] = e10;
            this.f126022d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(l(i10));
    }
}
