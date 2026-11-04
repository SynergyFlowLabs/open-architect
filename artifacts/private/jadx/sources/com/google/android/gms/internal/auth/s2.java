package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class s2 extends o2 implements RandomAccess, x3, e5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final s2 f107793d = new s2(new boolean[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f107794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107795c;

    s2() {
        this(new boolean[10], 0, true);
    }

    private final String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f107795c;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f107795c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f107795c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        boolean[] zArr = this.f107794b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f107794b, i10, zArr2, i10 + 1, this.f107795c - i10);
            this.f107794b = zArr2;
        }
        this.f107794b[i10] = zBooleanValue;
        this.f107795c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = z3.f107905d;
        collection.getClass();
        if (!(collection instanceof s2)) {
            return super.addAll(collection);
        }
        s2 s2Var = (s2) collection;
        int i10 = s2Var.f107795c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f107795c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f107794b;
        if (i12 > zArr.length) {
            this.f107794b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(s2Var.f107794b, 0, this.f107794b, this.f107795c, s2Var.f107795c);
        this.f107795c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(boolean z10) {
        c();
        int i10 = this.f107795c;
        boolean[] zArr = this.f107794b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f107794b = zArr2;
        }
        boolean[] zArr3 = this.f107794b;
        int i11 = this.f107795c;
        this.f107795c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.google.android.gms.internal.auth.x3
    public final /* bridge */ /* synthetic */ x3 e(int i10) {
        if (i10 >= this.f107795c) {
            return new s2(Arrays.copyOf(this.f107794b, i10), this.f107795c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return super.equals(obj);
        }
        s2 s2Var = (s2) obj;
        if (this.f107795c != s2Var.f107795c) {
            return false;
        }
        boolean[] zArr = s2Var.f107794b;
        for (int i10 = 0; i10 < this.f107795c; i10++) {
            if (this.f107794b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Boolean.valueOf(this.f107794b[i10]);
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i10 = 0; i10 < this.f107795c; i10++) {
            iA = (iA * 31) + z3.a(this.f107794b[i10]);
        }
        return iA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f107795c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f107794b[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        k(i10);
        boolean[] zArr = this.f107794b;
        boolean z10 = zArr[i10];
        int i11 = this.f107795c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f107795c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f107794b;
        System.arraycopy(zArr, i11, zArr, i10, this.f107795c - i11);
        this.f107795c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        k(i10);
        boolean[] zArr = this.f107794b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f107795c;
    }

    private s2(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f107794b = zArr;
        this.f107795c = i10;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Boolean) obj).booleanValue());
        return true;
    }
}
