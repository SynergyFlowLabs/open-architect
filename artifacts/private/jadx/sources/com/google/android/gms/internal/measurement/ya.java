package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class ya extends da implements RandomAccess, tb, fd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final double[] f108997d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f108998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f108999c;

    static {
        double[] dArr = new double[0];
        f108997d = dArr;
        new ya(dArr, 0, false);
    }

    ya() {
        this(f108997d, 0, true);
    }

    private static int l(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void m(int i10) {
        if (i10 < 0 || i10 >= this.f108999c) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    private final String n(int i10) {
        return fa.a(this.f108999c, i10, com.google.common.base.c.f116462o, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f108999c)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        int i12 = i10 + 1;
        double[] dArr = this.f108998b;
        int length = dArr.length;
        if (i11 < length) {
            System.arraycopy(dArr, i10, dArr, i12, i11 - i10);
        } else {
            double[] dArr2 = new double[l(length)];
            int i13 = 7 & 0;
            System.arraycopy(this.f108998b, 0, dArr2, 0, i10);
            System.arraycopy(this.f108998b, i10, dArr2, i12, this.f108999c - i10);
            this.f108998b = dArr2;
        }
        this.f108998b[i10] = dDoubleValue;
        this.f108999c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = ac.f108281b;
        collection.getClass();
        if (!(collection instanceof ya)) {
            return super.addAll(collection);
        }
        ya yaVar = (ya) collection;
        int i10 = yaVar.f108999c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f108999c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f108998b;
        if (i12 > dArr.length) {
            this.f108998b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(yaVar.f108998b, 0, this.f108998b, this.f108999c, yaVar.f108999c);
        this.f108999c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final double d(int i10) {
        m(i10);
        return this.f108998b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zb, com.google.android.gms.internal.measurement.sb
    /* JADX INFO: renamed from: e */
    public final tb f(int i10) {
        if (i10 >= this.f108999c) {
            return new ya(i10 == 0 ? f108997d : Arrays.copyOf(this.f108998b, i10), this.f108999c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya)) {
            return super.equals(obj);
        }
        ya yaVar = (ya) obj;
        if (this.f108999c != yaVar.f108999c) {
            return false;
        }
        double[] dArr = yaVar.f108998b;
        for (int i10 = 0; i10 < this.f108999c; i10++) {
            if (Double.doubleToLongBits(this.f108998b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m(i10);
        return Double.valueOf(this.f108998b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f108999c; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f108998b[i11]);
            byte[] bArr = ac.f108281b;
            i10 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i10;
    }

    public final void i(double d10) {
        c();
        int i10 = this.f108999c;
        int length = this.f108998b.length;
        if (i10 == length) {
            double[] dArr = new double[l(length)];
            System.arraycopy(this.f108998b, 0, dArr, 0, this.f108999c);
            this.f108998b = dArr;
        }
        double[] dArr2 = this.f108998b;
        int i11 = this.f108999c;
        this.f108999c = i11 + 1;
        dArr2[i11] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f108999c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f108998b[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    final void k(int i10) {
        int length = this.f108998b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f108998b = new double[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = l(length);
        }
        this.f108998b = Arrays.copyOf(this.f108998b, length);
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        m(i10);
        double[] dArr = this.f108998b;
        double d10 = dArr[i10];
        int i11 = this.f108999c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f108999c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f108998b;
        System.arraycopy(dArr, i11, dArr, i10, this.f108999c - i11);
        this.f108999c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        m(i10);
        double[] dArr = this.f108998b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f108999c;
    }

    private ya(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f108998b = dArr;
        this.f108999c = i10;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Double) obj).doubleValue());
        return true;
    }
}
