package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class l4 extends o2 implements RandomAccess, x3, e5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final l4 f107699d = new l4(new long[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f107700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107701c;

    l4() {
        this(new long[10], 0, true);
    }

    private final String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f107701c;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f107701c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f107701c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        long[] jArr = this.f107700b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f107700b, i10, jArr2, i10 + 1, this.f107701c - i10);
            this.f107700b = jArr2;
        }
        this.f107700b[i10] = jLongValue;
        this.f107701c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = z3.f107905d;
        collection.getClass();
        if (!(collection instanceof l4)) {
            return super.addAll(collection);
        }
        l4 l4Var = (l4) collection;
        int i10 = l4Var.f107701c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f107701c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f107700b;
        if (i12 > jArr.length) {
            this.f107700b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(l4Var.f107700b, 0, this.f107700b, this.f107701c, l4Var.f107701c);
        this.f107701c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j10) {
        c();
        int i10 = this.f107701c;
        long[] jArr = this.f107700b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f107700b = jArr2;
        }
        long[] jArr3 = this.f107700b;
        int i11 = this.f107701c;
        this.f107701c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // com.google.android.gms.internal.auth.x3
    public final /* bridge */ /* synthetic */ x3 e(int i10) {
        if (i10 >= this.f107701c) {
            return new l4(Arrays.copyOf(this.f107700b, i10), this.f107701c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return super.equals(obj);
        }
        l4 l4Var = (l4) obj;
        if (this.f107701c != l4Var.f107701c) {
            return false;
        }
        long[] jArr = l4Var.f107700b;
        for (int i10 = 0; i10 < this.f107701c; i10++) {
            if (this.f107700b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Long.valueOf(this.f107700b[i10]);
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f107701c; i11++) {
            long j10 = this.f107700b[i11];
            byte[] bArr = z3.f107905d;
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
        int i10 = this.f107701c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f107700b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        k(i10);
        long[] jArr = this.f107700b;
        long j10 = jArr[i10];
        int i11 = this.f107701c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f107701c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f107700b;
        System.arraycopy(jArr, i11, jArr, i10, this.f107701c - i11);
        this.f107701c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        c();
        k(i10);
        long[] jArr = this.f107700b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f107701c;
    }

    private l4(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f107700b = jArr;
        this.f107701c = i10;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
