package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class rb extends da implements RandomAccess, xb, fd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f108773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final rb f108774e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f108775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f108776c;

    static {
        int[] iArr = new int[0];
        f108773d = iArr;
        f108774e = new rb(iArr, 0, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    rb() {
        this(f108773d, 0, true);
        int i10 = 6 ^ 1;
    }

    public static rb i() {
        return f108774e;
    }

    private static int n(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void p(int i10) {
        if (i10 < 0 || i10 >= this.f108776c) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    private final String r(int i10) {
        return fa.a(this.f108776c, i10, com.google.common.base.c.f116462o, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f108776c)) {
            throw new IndexOutOfBoundsException(r(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f108775b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[n(length)];
            System.arraycopy(this.f108775b, 0, iArr2, 0, i10);
            System.arraycopy(this.f108775b, i10, iArr2, i12, this.f108776c - i10);
            this.f108775b = iArr2;
        }
        this.f108775b[i10] = iIntValue;
        this.f108776c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = ac.f108281b;
        collection.getClass();
        if (!(collection instanceof rb)) {
            return super.addAll(collection);
        }
        rb rbVar = (rb) collection;
        int i10 = rbVar.f108776c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f108776c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f108775b;
        if (i12 > iArr.length) {
            this.f108775b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(rbVar.f108775b, 0, this.f108775b, this.f108776c, rbVar.f108776c);
        this.f108776c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zb, com.google.android.gms.internal.measurement.sb
    /* JADX INFO: renamed from: c2 */
    public final xb f(int i10) {
        if (i10 >= this.f108776c) {
            return new rb(i10 == 0 ? f108773d : Arrays.copyOf(this.f108775b, i10), this.f108776c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb)) {
            return super.equals(obj);
        }
        rb rbVar = (rb) obj;
        if (this.f108776c != rbVar.f108776c) {
            return false;
        }
        int[] iArr = rbVar.f108775b;
        for (int i10 = 0; i10 < this.f108776c; i10++) {
            if (this.f108775b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        p(i10);
        return Integer.valueOf(this.f108775b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f108776c; i11++) {
            i10 = (i10 * 31) + this.f108775b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f108776c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f108775b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    public final int k(int i10) {
        p(i10);
        return this.f108775b[i10];
    }

    public final void l(int i10) {
        c();
        int i11 = this.f108776c;
        int length = this.f108775b.length;
        if (i11 == length) {
            int[] iArr = new int[n(length)];
            System.arraycopy(this.f108775b, 0, iArr, 0, this.f108776c);
            this.f108775b = iArr;
        }
        int[] iArr2 = this.f108775b;
        int i12 = this.f108776c;
        this.f108776c = i12 + 1;
        iArr2[i12] = i10;
    }

    final void m(int i10) {
        int length = this.f108775b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f108775b = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = n(length);
        }
        this.f108775b = Arrays.copyOf(this.f108775b, length);
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        p(i10);
        int[] iArr = this.f108775b;
        int i11 = iArr[i10];
        int i12 = this.f108776c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f108776c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f108775b;
        System.arraycopy(iArr, i11, iArr, i10, this.f108776c - i11);
        this.f108776c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        p(i10);
        int[] iArr = this.f108775b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f108776c;
    }

    private rb(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f108775b = iArr;
        this.f108776c = i10;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        l(((Integer) obj).intValue());
        return true;
    }
}
