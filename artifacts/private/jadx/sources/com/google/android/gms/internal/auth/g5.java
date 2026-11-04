package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class g5 extends o2 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g5 f107640d = new g5(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f107641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107642c;

    g5() {
        this(new Object[10], 0, true);
    }

    public static g5 i() {
        return f107640d;
    }

    private final String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f107642c;
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f107642c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f107642c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        Object[] objArr = this.f107641b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f107641b, i10, objArr2, i10 + 1, this.f107642c - i10);
            this.f107641b = objArr2;
        }
        this.f107641b[i10] = obj;
        this.f107642c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.x3
    public final /* bridge */ /* synthetic */ x3 e(int i10) {
        if (i10 >= this.f107642c) {
            return new g5(Arrays.copyOf(this.f107641b, i10), this.f107642c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        l(i10);
        return this.f107641b[i10];
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        c();
        l(i10);
        Object[] objArr = this.f107641b;
        Object obj = objArr[i10];
        int i11 = this.f107642c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f107642c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        l(i10);
        Object[] objArr = this.f107641b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f107642c;
    }

    private g5(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f107641b = objArr;
        this.f107642c = i10;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i10 = this.f107642c;
        Object[] objArr = this.f107641b;
        if (i10 == objArr.length) {
            this.f107641b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f107641b;
        int i11 = this.f107642c;
        this.f107642c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
