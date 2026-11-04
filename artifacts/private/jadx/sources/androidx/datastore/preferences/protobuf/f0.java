package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class f0 extends c<Double> implements s1.b, RandomAccess, i3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final f0 f50307e = new f0(new double[0], 0, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double[] f50308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50309d;

    f0() {
        this(new double[10], 0, true);
    }

    private void k(int index, double element) {
        int i10;
        c();
        if (index < 0 || index > (i10 = this.f50309d)) {
            throw new IndexOutOfBoundsException(p(index));
        }
        double[] dArr = this.f50308c;
        if (i10 < dArr.length) {
            System.arraycopy(dArr, index, dArr, index + 1, i10 - index);
        } else {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, index);
            System.arraycopy(this.f50308c, index, dArr2, index + 1, this.f50309d - index);
            this.f50308c = dArr2;
        }
        this.f50308c[index] = element;
        this.f50309d++;
        ((AbstractList) this).modCount++;
    }

    public static f0 l() {
        return f50307e;
    }

    private void m(int index) {
        if (index < 0 || index >= this.f50309d) {
            throw new IndexOutOfBoundsException(p(index));
        }
    }

    private String p(int index) {
        return "Index:" + index + ", Size:" + this.f50309d;
    }

    @Override // androidx.datastore.preferences.protobuf.s1.b
    public void R0(double element) {
        c();
        int i10 = this.f50309d;
        double[] dArr = this.f50308c;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f50308c = dArr2;
        }
        double[] dArr3 = this.f50308c;
        int i11 = this.f50309d;
        this.f50309d = i11 + 1;
        dArr3[i11] = element;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        c();
        s1.d(collection);
        if (!(collection instanceof f0)) {
            return super.addAll(collection);
        }
        f0 f0Var = (f0) collection;
        int i10 = f0Var.f50309d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f50309d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f50308c;
        if (i12 > dArr.length) {
            this.f50308c = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(f0Var.f50308c, 0, this.f50308c, this.f50309d, f0Var.f50309d);
        this.f50309d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int index, Double element) {
        k(index, element.doubleValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof f0)) {
            return super.equals(o10);
        }
        f0 f0Var = (f0) o10;
        if (this.f50309d != f0Var.f50309d) {
            return false;
        }
        double[] dArr = f0Var.f50308c;
        for (int i10 = 0; i10 < this.f50309d; i10++) {
            if (Double.doubleToLongBits(this.f50308c[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.s1.b
    public double g0(int index, double element) {
        c();
        m(index);
        double[] dArr = this.f50308c;
        double d10 = dArr[index];
        dArr[index] = element;
        return d10;
    }

    @Override // androidx.datastore.preferences.protobuf.s1.b
    public double getDouble(int index) {
        m(index);
        return this.f50308c[index];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iS = 1;
        for (int i10 = 0; i10 < this.f50309d; i10++) {
            iS = (iS * 31) + s1.s(Double.doubleToLongBits(this.f50308c[i10]));
        }
        return iS;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean add(Double element) {
        R0(element.doubleValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) element).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f50308c[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Double get(int index) {
        return Double.valueOf(getDouble(index));
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Double remove(int index) {
        c();
        m(index);
        double[] dArr = this.f50308c;
        double d10 = dArr[index];
        int i10 = this.f50309d;
        if (index < i10 - 1) {
            System.arraycopy(dArr, index + 1, dArr, index, (i10 - index) - 1);
        }
        this.f50309d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int fromIndex, int toIndex) {
        c();
        if (toIndex < fromIndex) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f50308c;
        System.arraycopy(dArr, toIndex, dArr, fromIndex, this.f50309d - toIndex);
        this.f50309d -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Double set(int index, Double element) {
        return Double.valueOf(g0(index, element.doubleValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f50309d;
    }

    private f0(double[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f50308c = other;
        this.f50309d = size;
    }

    @Override // androidx.datastore.preferences.protobuf.s1.l
    /* JADX INFO: renamed from: b */
    public s1.l<Double> b2(int capacity) {
        if (capacity >= this.f50309d) {
            return new f0(Arrays.copyOf(this.f50308c, capacity), this.f50309d, true);
        }
        throw new IllegalArgumentException();
    }
}
