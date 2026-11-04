package com.google.vr.sdk.deps;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
final class i4 extends f2<Long> implements t3, d5, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final i4 f129444d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f129445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f129446c;

    static {
        i4 i4Var = new i4();
        f129444d = i4Var;
        i4Var.b();
    }

    i4() {
        this(new long[10], 0);
    }

    private final void d(int i10, long j10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f129446c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        long[] jArr = this.f129445b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f129445b, i10, jArr2, i10 + 1, this.f129446c - i10);
            this.f129445b = jArr2;
        }
        this.f129445b[i10] = j10;
        this.f129446c++;
        ((AbstractList) this).modCount++;
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f129446c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private final String m(int i10) {
        int i11 = this.f129446c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // com.google.vr.sdk.deps.u3
    public final /* synthetic */ u3<Long> N3(int i10) {
        if (i10 >= this.f129446c) {
            return new i4(Arrays.copyOf(this.f129445b, i10), this.f129446c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        d(i10, ((Long) obj).longValue());
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        c();
        k3.d(collection);
        if (!(collection instanceof i4)) {
            return super.addAll(collection);
        }
        i4 i4Var = (i4) collection;
        int i10 = i4Var.f129446c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f129446c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f129445b;
        if (i12 > jArr.length) {
            this.f129445b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(i4Var.f129445b, 0, this.f129445b, this.f129446c, i4Var.f129446c);
        this.f129446c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4)) {
            return super.equals(obj);
        }
        i4 i4Var = (i4) obj;
        if (this.f129446c != i4Var.f129446c) {
            return false;
        }
        long[] jArr = i4Var.f129445b;
        for (int i10 = 0; i10 < this.f129446c; i10++) {
            if (this.f129445b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return Long.valueOf(k(i10));
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f129446c; i10++) {
            iB = (iB * 31) + k3.b(this.f129445b[i10]);
        }
        return iB;
    }

    public final void i(long j10) {
        d(this.f129446c, j10);
    }

    public final long k(int i10) {
        l(i10);
        return this.f129445b[i10];
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f129446c; i10++) {
            if (obj.equals(Long.valueOf(this.f129445b[i10]))) {
                long[] jArr = this.f129445b;
                System.arraycopy(jArr, i10 + 1, jArr, i10, this.f129446c - i10);
                this.f129446c--;
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
        long[] jArr = this.f129445b;
        System.arraycopy(jArr, i11, jArr, i10, this.f129446c - i11);
        this.f129446c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        c();
        l(i10);
        long[] jArr = this.f129445b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f129446c;
    }

    private i4(long[] jArr, int i10) {
        this.f129445b = jArr;
        this.f129446c = i10;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        c();
        l(i10);
        long[] jArr = this.f129445b;
        long j10 = jArr[i10];
        int i11 = this.f129446c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, i11 - i10);
        }
        this.f129446c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }
}
