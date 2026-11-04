package com.google.vr.sdk.deps;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
final class u2 extends f2<Double> implements m3, d5, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u2 f129611d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f129612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f129613c;

    static {
        u2 u2Var = new u2();
        f129611d = u2Var;
        u2Var.b();
    }

    u2() {
        this(new double[10], 0);
    }

    private final void i(int i10, double d10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f129613c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        double[] dArr = this.f129612b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f129612b, i10, dArr2, i10 + 1, this.f129613c - i10);
            this.f129612b = dArr2;
        }
        this.f129612b[i10] = d10;
        this.f129613c++;
        ((AbstractList) this).modCount++;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f129613c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private final String l(int i10) {
        int i11 = this.f129613c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // com.google.vr.sdk.deps.u3
    public final /* synthetic */ u3<Double> N3(int i10) {
        if (i10 >= this.f129613c) {
            return new u2(Arrays.copyOf(this.f129612b, i10), this.f129613c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        i(i10, ((Double) obj).doubleValue());
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        c();
        k3.d(collection);
        if (!(collection instanceof u2)) {
            return super.addAll(collection);
        }
        u2 u2Var = (u2) collection;
        int i10 = u2Var.f129613c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f129613c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f129612b;
        if (i12 > dArr.length) {
            this.f129612b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(u2Var.f129612b, 0, this.f129612b, this.f129613c, u2Var.f129613c);
        this.f129613c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(double d10) {
        i(this.f129613c, d10);
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return super.equals(obj);
        }
        u2 u2Var = (u2) obj;
        if (this.f129613c != u2Var.f129613c) {
            return false;
        }
        double[] dArr = u2Var.f129612b;
        for (int i10 = 0; i10 < this.f129613c; i10++) {
            if (Double.doubleToLongBits(this.f129612b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Double.valueOf(this.f129612b[i10]);
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f129613c; i10++) {
            iB = (iB * 31) + k3.b(Double.doubleToLongBits(this.f129612b[i10]));
        }
        return iB;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f129613c; i10++) {
            if (obj.equals(Double.valueOf(this.f129612b[i10]))) {
                double[] dArr = this.f129612b;
                System.arraycopy(dArr, i10 + 1, dArr, i10, this.f129613c - i10);
                this.f129613c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f129612b;
        System.arraycopy(dArr, i11, dArr, i10, this.f129613c - i11);
        this.f129613c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        k(i10);
        double[] dArr = this.f129612b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f129613c;
    }

    private u2(double[] dArr, int i10) {
        this.f129612b = dArr;
        this.f129613c = i10;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        c();
        k(i10);
        double[] dArr = this.f129612b;
        double d10 = dArr[i10];
        int i11 = this.f129613c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, i11 - i10);
        }
        this.f129613c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }
}
