package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class m6 extends p5 implements RandomAccess, i7, o8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final double[] f109205d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f109206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f109207c;

    static {
        double[] dArr = new double[0];
        f109205d = dArr;
        new m6(dArr, 0, false);
    }

    m6() {
        this(f109205d, 0, true);
    }

    private static int l(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f109207c;
    }

    private final void n(int i10) {
        if (i10 < 0 || i10 >= this.f109207c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f109207c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        int i12 = i10 + 1;
        double[] dArr = this.f109206b;
        int length = dArr.length;
        if (i11 < length) {
            System.arraycopy(dArr, i10, dArr, i12, i11 - i10);
        } else {
            double[] dArr2 = new double[l(length)];
            System.arraycopy(this.f109206b, 0, dArr2, 0, i10);
            System.arraycopy(this.f109206b, i10, dArr2, i12, this.f109207c - i10);
            this.f109206b = dArr2;
        }
        this.f109206b[i10] = dDoubleValue;
        this.f109207c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = j7.f109152b;
        collection.getClass();
        if (!(collection instanceof m6)) {
            return super.addAll(collection);
        }
        m6 m6Var = (m6) collection;
        int i10 = m6Var.f109207c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f109207c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f109206b;
        if (i12 > dArr.length) {
            this.f109206b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(m6Var.f109206b, 0, this.f109206b, this.f109207c, m6Var.f109207c);
        this.f109207c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final double d(int i10) {
        n(i10);
        return this.f109206b[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final /* bridge */ /* synthetic */ i7 e(int i10) {
        if (i10 >= this.f109207c) {
            return new m6(i10 == 0 ? f109205d : Arrays.copyOf(this.f109206b, i10), this.f109207c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6)) {
            return super.equals(obj);
        }
        m6 m6Var = (m6) obj;
        if (this.f109207c != m6Var.f109207c) {
            return false;
        }
        double[] dArr = m6Var.f109206b;
        for (int i10 = 0; i10 < this.f109207c; i10++) {
            if (Double.doubleToLongBits(this.f109206b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        n(i10);
        return Double.valueOf(this.f109206b[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f109207c; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f109206b[i11]);
            byte[] bArr = j7.f109152b;
            i10 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i10;
    }

    public final void i(double d10) {
        c();
        int i10 = this.f109207c;
        int length = this.f109206b.length;
        if (i10 == length) {
            double[] dArr = new double[l(length)];
            System.arraycopy(this.f109206b, 0, dArr, 0, this.f109207c);
            this.f109206b = dArr;
        }
        double[] dArr2 = this.f109206b;
        int i11 = this.f109207c;
        this.f109207c = i11 + 1;
        dArr2[i11] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f109207c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f109206b[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    final void k(int i10) {
        int length = this.f109206b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f109206b = new double[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = l(length);
        }
        this.f109206b = Arrays.copyOf(this.f109206b, length);
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        n(i10);
        double[] dArr = this.f109206b;
        double d10 = dArr[i10];
        int i11 = this.f109207c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f109207c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f109206b;
        System.arraycopy(dArr, i11, dArr, i10, this.f109207c - i11);
        this.f109207c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        n(i10);
        double[] dArr = this.f109206b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f109207c;
    }

    private m6(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f109206b = dArr;
        this.f109207c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Double) obj).doubleValue());
        return true;
    }
}
