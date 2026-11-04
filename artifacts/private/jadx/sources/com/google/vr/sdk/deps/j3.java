package com.google.vr.sdk.deps;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
final class j3 extends f2<Integer> implements r3, d5, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j3 f129456d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f129457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f129458c;

    static {
        j3 j3Var = new j3();
        f129456d = j3Var;
        j3Var.b();
    }

    j3() {
        this(new int[10], 0);
    }

    private final void d(int i10, int i11) {
        int i12;
        c();
        if (i10 < 0 || i10 > (i12 = this.f129458c)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        int[] iArr = this.f129457b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f129457b, i10, iArr2, i10 + 1, this.f129458c - i10);
            this.f129457b = iArr2;
        }
        this.f129457b[i10] = i11;
        this.f129458c++;
        ((AbstractList) this).modCount++;
    }

    public static j3 l() {
        return f129456d;
    }

    private final void m(int i10) {
        if (i10 < 0 || i10 >= this.f129458c) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    private final String n(int i10) {
        int i11 = this.f129458c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // com.google.vr.sdk.deps.u3
    public final /* synthetic */ u3<Integer> N3(int i10) {
        if (i10 >= this.f129458c) {
            return new j3(Arrays.copyOf(this.f129457b, i10), this.f129458c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        d(i10, ((Integer) obj).intValue());
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        k3.d(collection);
        if (!(collection instanceof j3)) {
            return super.addAll(collection);
        }
        j3 j3Var = (j3) collection;
        int i10 = j3Var.f129458c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f129458c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f129457b;
        if (i12 > iArr.length) {
            this.f129457b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(j3Var.f129457b, 0, this.f129457b, this.f129458c, j3Var.f129458c);
        this.f129458c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return super.equals(obj);
        }
        j3 j3Var = (j3) obj;
        if (this.f129458c != j3Var.f129458c) {
            return false;
        }
        int[] iArr = j3Var.f129457b;
        for (int i10 = 0; i10 < this.f129458c; i10++) {
            if (this.f129457b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return Integer.valueOf(i(i10));
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f129458c; i11++) {
            i10 = (i10 * 31) + this.f129457b[i11];
        }
        return i10;
    }

    public final int i(int i10) {
        m(i10);
        return this.f129457b[i10];
    }

    public final void k(int i10) {
        d(this.f129458c, i10);
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f129458c; i10++) {
            if (obj.equals(Integer.valueOf(this.f129457b[i10]))) {
                int[] iArr = this.f129457b;
                System.arraycopy(iArr, i10 + 1, iArr, i10, this.f129458c - i10);
                this.f129458c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f129457b;
        System.arraycopy(iArr, i11, iArr, i10, this.f129458c - i11);
        this.f129458c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        m(i10);
        int[] iArr = this.f129457b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f129458c;
    }

    private j3(int[] iArr, int i10) {
        this.f129457b = iArr;
        this.f129458c = i10;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        c();
        m(i10);
        int[] iArr = this.f129457b;
        int i11 = iArr[i10];
        int i12 = this.f129458c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, i12 - i10);
        }
        this.f129458c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }
}
