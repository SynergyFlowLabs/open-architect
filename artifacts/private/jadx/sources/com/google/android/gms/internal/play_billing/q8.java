package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class q8 extends p5 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f109269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final q8 f109270e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f109271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f109272c;

    static {
        Object[] objArr = new Object[0];
        f109269d = objArr;
        f109270e = new q8(objArr, 0, false);
    }

    q8() {
        this(f109269d, 0, true);
    }

    public static q8 i() {
        return f109270e;
    }

    private static int l(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f109272c;
    }

    private final void n(int i10) {
        if (i10 < 0 || i10 >= this.f109272c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f109272c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f109271b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[l(length)];
            System.arraycopy(this.f109271b, 0, objArr2, 0, i10);
            System.arraycopy(this.f109271b, i10, objArr2, i12, this.f109272c - i10);
            this.f109271b = objArr2;
        }
        this.f109271b[i10] = obj;
        this.f109272c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final /* bridge */ /* synthetic */ i7 e(int i10) {
        if (i10 >= this.f109272c) {
            return new q8(i10 == 0 ? f109269d : Arrays.copyOf(this.f109271b, i10), this.f109272c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        n(i10);
        return this.f109271b[i10];
    }

    final void k(int i10) {
        int length = this.f109271b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f109271b = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = l(length);
        }
        this.f109271b = Arrays.copyOf(this.f109271b, length);
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        c();
        n(i10);
        Object[] objArr = this.f109271b;
        Object obj = objArr[i10];
        int i11 = this.f109272c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f109272c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        n(i10);
        Object[] objArr = this.f109271b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f109272c;
    }

    private q8(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f109271b = objArr;
        this.f109272c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i10 = this.f109272c;
        int length = this.f109271b.length;
        if (i10 == length) {
            this.f109271b = Arrays.copyOf(this.f109271b, l(length));
        }
        Object[] objArr = this.f109271b;
        int i11 = this.f109272c;
        this.f109272c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
