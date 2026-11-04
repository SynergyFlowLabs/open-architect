package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class mc extends da implements RandomAccess, yb, fd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f108683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final mc f108684e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f108685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f108686c;

    static {
        long[] jArr = new long[0];
        f108683d = jArr;
        f108684e = new mc(jArr, 0, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    mc() {
        this(f108683d, 0, true);
        int i10 = 7 ^ 1;
    }

    public static mc i() {
        return f108684e;
    }

    private static int m(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void n(int i10) {
        if (i10 < 0 || i10 >= this.f108686c) {
            throw new IndexOutOfBoundsException(p(i10));
        }
    }

    private final String p(int i10) {
        return fa.a(this.f108686c, i10, com.google.common.base.c.f116462o, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f108686c)) {
            throw new IndexOutOfBoundsException(p(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f108685b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[m(length)];
            System.arraycopy(this.f108685b, 0, jArr2, 0, i10);
            System.arraycopy(this.f108685b, i10, jArr2, i12, this.f108686c - i10);
            this.f108685b = jArr2;
        }
        this.f108685b[i10] = jLongValue;
        this.f108686c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = ac.f108281b;
        collection.getClass();
        if (!(collection instanceof mc)) {
            return super.addAll(collection);
        }
        mc mcVar = (mc) collection;
        int i10 = mcVar.f108686c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f108686c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f108685b;
        if (i12 > jArr.length) {
            this.f108685b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(mcVar.f108685b, 0, this.f108685b, this.f108686c, mcVar.f108686c);
        this.f108686c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zb, com.google.android.gms.internal.measurement.sb
    /* JADX INFO: renamed from: e */
    public final yb f(int i10) {
        if (i10 >= this.f108686c) {
            return new mc(i10 == 0 ? f108683d : Arrays.copyOf(this.f108685b, i10), this.f108686c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc)) {
            return super.equals(obj);
        }
        mc mcVar = (mc) obj;
        if (this.f108686c != mcVar.f108686c) {
            return false;
        }
        long[] jArr = mcVar.f108685b;
        for (int i10 = 0; i10 < this.f108686c; i10++) {
            if (this.f108685b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        n(i10);
        return Long.valueOf(this.f108685b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f108686c; i11++) {
            long j10 = this.f108685b[i11];
            byte[] bArr = ac.f108281b;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f108686c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f108685b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void k(long j10) {
        c();
        int i10 = this.f108686c;
        int length = this.f108685b.length;
        if (i10 == length) {
            long[] jArr = new long[m(length)];
            System.arraycopy(this.f108685b, 0, jArr, 0, this.f108686c);
            this.f108685b = jArr;
        }
        long[] jArr2 = this.f108685b;
        int i11 = this.f108686c;
        this.f108686c = i11 + 1;
        jArr2[i11] = j10;
    }

    final void l(int i10) {
        int length = this.f108685b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f108685b = new long[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = m(length);
        }
        this.f108685b = Arrays.copyOf(this.f108685b, length);
    }

    @Override // com.google.android.gms.internal.measurement.yb
    public final long o2(int i10) {
        n(i10);
        return this.f108685b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        n(i10);
        long[] jArr = this.f108685b;
        long j10 = jArr[i10];
        int i11 = this.f108686c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f108686c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f108685b;
        System.arraycopy(jArr, i11, jArr, i10, this.f108686c - i11);
        this.f108686c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        c();
        n(i10);
        long[] jArr = this.f108685b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f108686c;
    }

    private mc(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f108685b = jArr;
        this.f108686c = i10;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        k(((Long) obj).longValue());
        return true;
    }
}
