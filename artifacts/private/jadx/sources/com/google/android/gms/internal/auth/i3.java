package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class i3 extends o2 implements RandomAccess, x3, e5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final i3 f107659d = new i3(new double[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f107660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107661c;

    i3() {
        this(new double[10], 0, true);
    }

    private final String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f107661c;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f107661c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f107661c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        double[] dArr = this.f107660b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f107660b, i10, dArr2, i10 + 1, this.f107661c - i10);
            this.f107660b = dArr2;
        }
        this.f107660b[i10] = dDoubleValue;
        this.f107661c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = z3.f107905d;
        collection.getClass();
        if (!(collection instanceof i3)) {
            return super.addAll(collection);
        }
        i3 i3Var = (i3) collection;
        int i10 = i3Var.f107661c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f107661c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f107660b;
        if (i12 > dArr.length) {
            this.f107660b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(i3Var.f107660b, 0, this.f107660b, this.f107661c, i3Var.f107661c);
        this.f107661c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(double d10) {
        c();
        int i10 = this.f107661c;
        double[] dArr = this.f107660b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f107660b = dArr2;
        }
        double[] dArr3 = this.f107660b;
        int i11 = this.f107661c;
        this.f107661c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.android.gms.internal.auth.x3
    public final /* bridge */ /* synthetic */ x3 e(int i10) {
        if (i10 >= this.f107661c) {
            return new i3(Arrays.copyOf(this.f107660b, i10), this.f107661c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return super.equals(obj);
        }
        i3 i3Var = (i3) obj;
        if (this.f107661c != i3Var.f107661c) {
            return false;
        }
        double[] dArr = i3Var.f107660b;
        for (int i10 = 0; i10 < this.f107661c; i10++) {
            if (Double.doubleToLongBits(this.f107660b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Double.valueOf(this.f107660b[i10]);
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f107661c; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f107660b[i11]);
            byte[] bArr = z3.f107905d;
            i10 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f107661c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f107660b[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        k(i10);
        double[] dArr = this.f107660b;
        double d10 = dArr[i10];
        int i11 = this.f107661c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f107661c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f107660b;
        System.arraycopy(dArr, i11, dArr, i10, this.f107661c - i11);
        this.f107661c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        k(i10);
        double[] dArr = this.f107660b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f107661c;
    }

    private i3(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f107660b = dArr;
        this.f107661c = i10;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Double) obj).doubleValue());
        return true;
    }
}
