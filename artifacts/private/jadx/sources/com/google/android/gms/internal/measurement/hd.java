package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class hd extends da implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f108532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final hd f108533e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f108534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f108535c;

    static {
        Object[] objArr = new Object[0];
        f108532d = objArr;
        f108533e = new hd(objArr, 0, false);
    }

    hd() {
        this(f108532d, 0, true);
    }

    public static hd i() {
        return f108533e;
    }

    private static int l(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void m(int i10) {
        if (i10 < 0 || i10 >= this.f108535c) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    private final String n(int i10) {
        return fa.a(this.f108535c, i10, com.google.common.base.c.f116462o, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f108535c)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f108534b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[l(length)];
            System.arraycopy(this.f108534b, 0, objArr2, 0, i10);
            System.arraycopy(this.f108534b, i10, objArr2, i12, this.f108535c - i10);
            this.f108534b = objArr2;
        }
        this.f108534b[i10] = obj;
        this.f108535c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zb, com.google.android.gms.internal.measurement.sb
    public final /* bridge */ /* synthetic */ zb f(int i10) {
        if (i10 >= this.f108535c) {
            return new hd(i10 == 0 ? f108532d : Arrays.copyOf(this.f108534b, i10), this.f108535c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m(i10);
        return this.f108534b[i10];
    }

    final void k(int i10) {
        int length = this.f108534b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f108534b = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = l(length);
        }
        this.f108534b = Arrays.copyOf(this.f108534b, length);
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        c();
        m(i10);
        Object[] objArr = this.f108534b;
        Object obj = objArr[i10];
        int i11 = this.f108535c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f108535c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        m(i10);
        Object[] objArr = this.f108534b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f108535c;
    }

    private hd(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f108534b = objArr;
        this.f108535c = i10;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i10 = this.f108535c;
        int length = this.f108534b.length;
        if (i10 == length) {
            this.f108534b = Arrays.copyOf(this.f108534b, l(length));
        }
        Object[] objArr = this.f108534b;
        int i11 = this.f108535c;
        this.f108535c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
