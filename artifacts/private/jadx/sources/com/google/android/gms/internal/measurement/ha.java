package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class ha extends da implements RandomAccess, sb, fd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean[] f108484d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f108485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f108486c;

    static {
        boolean[] zArr = new boolean[0];
        f108484d = zArr;
        new ha(zArr, 0, false);
    }

    ha() {
        this(f108484d, 0, true);
    }

    private static int k(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f108486c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private final String m(int i10) {
        return fa.a(this.f108486c, i10, com.google.common.base.c.f116462o, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f108486c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        int i12 = i10 + 1;
        boolean[] zArr = this.f108485b;
        int length = zArr.length;
        if (i11 < length) {
            System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[k(length)];
            System.arraycopy(this.f108485b, 0, zArr2, 0, i10);
            System.arraycopy(this.f108485b, i10, zArr2, i12, this.f108486c - i10);
            this.f108485b = zArr2;
        }
        this.f108485b[i10] = zBooleanValue;
        this.f108486c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = ac.f108281b;
        collection.getClass();
        if (!(collection instanceof ha)) {
            return super.addAll(collection);
        }
        ha haVar = (ha) collection;
        int i10 = haVar.f108486c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f108486c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f108485b;
        if (i12 > zArr.length) {
            this.f108485b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(haVar.f108485b, 0, this.f108485b, this.f108486c, haVar.f108486c);
        this.f108486c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean d(int i10) {
        l(i10);
        return this.f108485b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zb, com.google.android.gms.internal.measurement.sb
    /* JADX INFO: renamed from: e */
    public final sb f(int i10) {
        if (i10 >= this.f108486c) {
            return new ha(i10 == 0 ? f108484d : Arrays.copyOf(this.f108485b, i10), this.f108486c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha)) {
            return super.equals(obj);
        }
        ha haVar = (ha) obj;
        if (this.f108486c != haVar.f108486c) {
            return false;
        }
        boolean[] zArr = haVar.f108485b;
        for (int i10 = 0; i10 < this.f108486c; i10++) {
            if (this.f108485b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        l(i10);
        return Boolean.valueOf(this.f108485b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f108486c; i10++) {
            iB = (iB * 31) + ac.b(this.f108485b[i10]);
        }
        return iB;
    }

    public final void i(boolean z10) {
        c();
        int i10 = this.f108486c;
        int length = this.f108485b.length;
        if (i10 == length) {
            boolean[] zArr = new boolean[k(length)];
            System.arraycopy(this.f108485b, 0, zArr, 0, this.f108486c);
            this.f108485b = zArr;
        }
        boolean[] zArr2 = this.f108485b;
        int i11 = this.f108486c;
        this.f108486c = i11 + 1;
        zArr2[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f108486c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f108485b[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        l(i10);
        boolean[] zArr = this.f108485b;
        boolean z10 = zArr[i10];
        int i11 = this.f108486c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f108486c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f108485b;
        System.arraycopy(zArr, i11, zArr, i10, this.f108486c - i11);
        this.f108486c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        l(i10);
        boolean[] zArr = this.f108485b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f108486c;
    }

    private ha(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f108485b = zArr;
        this.f108486c = i10;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Boolean) obj).booleanValue());
        return true;
    }
}
