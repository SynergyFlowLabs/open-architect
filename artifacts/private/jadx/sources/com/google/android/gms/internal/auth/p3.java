package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class p3 extends o2 implements RandomAccess, x3, e5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p3 f107734d = new p3(new float[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f107735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107736c;

    p3() {
        this(new float[10], 0, true);
    }

    private final String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f107736c;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f107736c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f107736c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        float[] fArr = this.f107735b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f107735b, i10, fArr2, i10 + 1, this.f107736c - i10);
            this.f107735b = fArr2;
        }
        this.f107735b[i10] = fFloatValue;
        this.f107736c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = z3.f107905d;
        collection.getClass();
        if (!(collection instanceof p3)) {
            return super.addAll(collection);
        }
        p3 p3Var = (p3) collection;
        int i10 = p3Var.f107736c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f107736c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f107735b;
        if (i12 > fArr.length) {
            this.f107735b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(p3Var.f107735b, 0, this.f107735b, this.f107736c, p3Var.f107736c);
        this.f107736c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i10 = 6 & (-1);
        return indexOf(obj) != -1;
    }

    public final void d(float f10) {
        c();
        int i10 = this.f107736c;
        float[] fArr = this.f107735b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f107735b = fArr2;
        }
        float[] fArr3 = this.f107735b;
        int i11 = this.f107736c;
        this.f107736c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.android.gms.internal.auth.x3
    public final /* bridge */ /* synthetic */ x3 e(int i10) {
        if (i10 >= this.f107736c) {
            return new p3(Arrays.copyOf(this.f107735b, i10), this.f107736c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3)) {
            return super.equals(obj);
        }
        p3 p3Var = (p3) obj;
        if (this.f107736c != p3Var.f107736c) {
            return false;
        }
        float[] fArr = p3Var.f107735b;
        for (int i10 = 0; i10 < this.f107736c; i10++) {
            if (Float.floatToIntBits(this.f107735b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Float.valueOf(this.f107735b[i10]);
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f107736c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f107735b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f107736c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f107735b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        k(i10);
        float[] fArr = this.f107735b;
        float f10 = fArr[i10];
        int i11 = this.f107736c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f107736c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f107735b;
        System.arraycopy(fArr, i11, fArr, i10, this.f107736c - i11);
        this.f107736c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        c();
        k(i10);
        float[] fArr = this.f107735b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f107736c;
    }

    private p3(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f107735b = fArr;
        this.f107736c = i10;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Float) obj).floatValue());
        return true;
    }
}
