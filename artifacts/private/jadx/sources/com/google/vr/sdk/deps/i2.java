package com.google.vr.sdk.deps;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
final class i2 extends f2<Boolean> implements l3, d5, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final i2 f129426d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f129427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f129428c;

    static {
        i2 i2Var = new i2();
        f129426d = i2Var;
        i2Var.b();
    }

    i2() {
        this(new boolean[10], 0);
    }

    private final void d(int i10, boolean z10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f129428c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        boolean[] zArr = this.f129427b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f129427b, i10, zArr2, i10 + 1, this.f129428c - i10);
            this.f129427b = zArr2;
        }
        this.f129427b[i10] = z10;
        this.f129428c++;
        ((AbstractList) this).modCount++;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f129428c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private final String l(int i10) {
        int i11 = this.f129428c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // com.google.vr.sdk.deps.u3
    public final /* synthetic */ u3<Boolean> N3(int i10) {
        if (i10 >= this.f129428c) {
            return new i2(Arrays.copyOf(this.f129427b, i10), this.f129428c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        d(i10, ((Boolean) obj).booleanValue());
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        k3.d(collection);
        if (!(collection instanceof i2)) {
            return super.addAll(collection);
        }
        i2 i2Var = (i2) collection;
        int i10 = i2Var.f129428c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f129428c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f129427b;
        if (i12 > zArr.length) {
            this.f129427b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(i2Var.f129427b, 0, this.f129427b, this.f129428c, i2Var.f129428c);
        this.f129428c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return super.equals(obj);
        }
        i2 i2Var = (i2) obj;
        if (this.f129428c != i2Var.f129428c) {
            return false;
        }
        boolean[] zArr = i2Var.f129427b;
        for (int i10 = 0; i10 < this.f129428c; i10++) {
            if (this.f129427b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Boolean.valueOf(this.f129427b[i10]);
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f129428c; i10++) {
            iC = (iC * 31) + k3.c(this.f129427b[i10]);
        }
        return iC;
    }

    public final void i(boolean z10) {
        d(this.f129428c, z10);
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f129428c; i10++) {
            if (obj.equals(Boolean.valueOf(this.f129427b[i10]))) {
                boolean[] zArr = this.f129427b;
                System.arraycopy(zArr, i10 + 1, zArr, i10, this.f129428c - i10);
                this.f129428c--;
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
        boolean[] zArr = this.f129427b;
        System.arraycopy(zArr, i11, zArr, i10, this.f129428c - i11);
        this.f129428c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        k(i10);
        boolean[] zArr = this.f129427b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f129428c;
    }

    private i2(boolean[] zArr, int i10) {
        this.f129427b = zArr;
        this.f129428c = i10;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        c();
        k(i10);
        boolean[] zArr = this.f129427b;
        boolean z10 = zArr[i10];
        int i11 = this.f129428c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, i11 - i10);
        }
        this.f129428c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }
}
