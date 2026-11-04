package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
final class r1 extends c<Integer> implements s1.g, RandomAccess, g3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final r1 f126283e = new r1(new int[0], 0, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f126284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f126285d;

    r1() {
        this(new int[10], 0, true);
    }

    private void k(int index, int element) {
        int i10;
        c();
        if (index < 0 || index > (i10 = this.f126285d)) {
            throw new IndexOutOfBoundsException(p(index));
        }
        int[] iArr = this.f126284c;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, index, iArr, index + 1, i10 - index);
        } else {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, index);
            System.arraycopy(this.f126284c, index, iArr2, index + 1, this.f126285d - index);
            this.f126284c = iArr2;
        }
        this.f126284c[index] = element;
        this.f126285d++;
        ((AbstractList) this).modCount++;
    }

    public static r1 l() {
        return f126283e;
    }

    private void m(int index) {
        if (index < 0 || index >= this.f126285d) {
            throw new IndexOutOfBoundsException(p(index));
        }
    }

    private String p(int index) {
        return "Index:" + index + ", Size:" + this.f126285d;
    }

    @Override // com.google.protobuf.s1.g
    public int X(int index, int element) {
        c();
        m(index);
        int[] iArr = this.f126284c;
        int i10 = iArr[index];
        iArr[index] = element;
        return i10;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        c();
        s1.d(collection);
        if (!(collection instanceof r1)) {
            return super.addAll(collection);
        }
        r1 r1Var = (r1) collection;
        int i10 = r1Var.f126285d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f126285d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f126284c;
        if (i12 > iArr.length) {
            this.f126284c = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(r1Var.f126284c, 0, this.f126284c, this.f126285d, r1Var.f126285d);
        this.f126285d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int index, Integer element) {
        k(index, element.intValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof r1)) {
            return super.equals(o10);
        }
        r1 r1Var = (r1) o10;
        if (this.f126285d != r1Var.f126285d) {
            return false;
        }
        int[] iArr = r1Var.f126284c;
        for (int i10 = 0; i10 < this.f126285d; i10++) {
            if (this.f126284c[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.s1.g
    public int getInt(int index) {
        m(index);
        return this.f126284c[index];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f126285d; i11++) {
            i10 = (i10 * 31) + this.f126284c[i11];
        }
        return i10;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer element) {
        w1(element.intValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) element).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f126284c[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer get(int index) {
        return Integer.valueOf(getInt(index));
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer remove(int index) {
        c();
        m(index);
        int[] iArr = this.f126284c;
        int i10 = iArr[index];
        int i11 = this.f126285d;
        if (index < i11 - 1) {
            System.arraycopy(iArr, index + 1, iArr, index, (i11 - index) - 1);
        }
        this.f126285d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int fromIndex, int toIndex) {
        c();
        if (toIndex < fromIndex) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f126284c;
        System.arraycopy(iArr, toIndex, iArr, fromIndex, this.f126285d - toIndex);
        this.f126285d -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer set(int index, Integer element) {
        return Integer.valueOf(X(index, element.intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f126285d;
    }

    @Override // com.google.protobuf.s1.g
    public void w1(int element) {
        c();
        int i10 = this.f126285d;
        int[] iArr = this.f126284c;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f126284c = iArr2;
        }
        int[] iArr3 = this.f126284c;
        int i11 = this.f126285d;
        this.f126285d = i11 + 1;
        iArr3[i11] = element;
    }

    private r1(int[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f126284c = other;
        this.f126285d = size;
    }

    @Override // com.google.protobuf.s1.k, com.google.protobuf.s1.i
    /* JADX INFO: renamed from: b */
    public s1.k<Integer> b2(int capacity) {
        if (capacity >= this.f126285d) {
            return new r1(Arrays.copyOf(this.f126284c, capacity), this.f126285d, true);
        }
        throw new IllegalArgumentException();
    }
}
