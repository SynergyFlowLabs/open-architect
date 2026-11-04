package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class f7 extends p5 implements RandomAccess, h7, o8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f109120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final f7 f109121e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f109122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f109123c;

    static {
        int[] iArr = new int[0];
        f109120d = iArr;
        f109121e = new f7(iArr, 0, false);
    }

    f7() {
        this(f109120d, 0, true);
    }

    public static f7 i() {
        return f109121e;
    }

    private static int m(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String n(int i10) {
        return "Index:" + i10 + ", Size:" + this.f109123c;
    }

    private final void p(int i10) {
        if (i10 < 0 || i10 >= this.f109123c) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f109123c)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f109122b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[m(length)];
            System.arraycopy(this.f109122b, 0, iArr2, 0, i10);
            System.arraycopy(this.f109122b, i10, iArr2, i12, this.f109123c - i10);
            this.f109122b = iArr2;
        }
        this.f109122b[i10] = iIntValue;
        this.f109123c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = j7.f109152b;
        collection.getClass();
        if (!(collection instanceof f7)) {
            return super.addAll(collection);
        }
        f7 f7Var = (f7) collection;
        int i10 = f7Var.f109123c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f109123c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f109122b;
        if (i12 > iArr.length) {
            this.f109122b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(f7Var.f109122b, 0, this.f109122b, this.f109123c, f7Var.f109123c);
        this.f109123c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i10) {
        p(i10);
        return this.f109122b[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final /* bridge */ /* synthetic */ i7 e(int i10) {
        if (i10 >= this.f109123c) {
            return new f7(i10 == 0 ? f109120d : Arrays.copyOf(this.f109122b, i10), this.f109123c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7)) {
            return super.equals(obj);
        }
        f7 f7Var = (f7) obj;
        if (this.f109123c != f7Var.f109123c) {
            return false;
        }
        int[] iArr = f7Var.f109122b;
        for (int i10 = 0; i10 < this.f109123c; i10++) {
            if (this.f109122b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        p(i10);
        return Integer.valueOf(this.f109122b[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f109123c; i11++) {
            i10 = (i10 * 31) + this.f109122b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f109123c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f109122b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void k(int i10) {
        c();
        int i11 = this.f109123c;
        int length = this.f109122b.length;
        if (i11 == length) {
            int[] iArr = new int[m(length)];
            System.arraycopy(this.f109122b, 0, iArr, 0, this.f109123c);
            this.f109122b = iArr;
        }
        int[] iArr2 = this.f109122b;
        int i12 = this.f109123c;
        this.f109123c = i12 + 1;
        iArr2[i12] = i10;
    }

    final void l(int i10) {
        int length = this.f109122b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f109122b = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = m(length);
        }
        this.f109122b = Arrays.copyOf(this.f109122b, length);
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        p(i10);
        int[] iArr = this.f109122b;
        int i11 = iArr[i10];
        int i12 = this.f109123c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f109123c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f109122b;
        System.arraycopy(iArr, i11, iArr, i10, this.f109123c - i11);
        this.f109123c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        p(i10);
        int[] iArr = this.f109122b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f109123c;
    }

    private f7(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f109122b = iArr;
        this.f109123c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        k(((Integer) obj).intValue());
        return true;
    }
}
