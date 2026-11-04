package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class w7 extends p5 implements RandomAccess, i7, o8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f109420d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f109421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f109422c;

    static {
        long[] jArr = new long[0];
        f109420d = jArr;
        new w7(jArr, 0, false);
    }

    w7() {
        this(f109420d, 0, true);
    }

    private static int l(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f109422c;
    }

    private final void n(int i10) {
        if (i10 < 0 || i10 >= this.f109422c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f109422c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f109421b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[l(length)];
            System.arraycopy(this.f109421b, 0, jArr2, 0, i10);
            System.arraycopy(this.f109421b, i10, jArr2, i12, this.f109422c - i10);
            this.f109421b = jArr2;
        }
        this.f109421b[i10] = jLongValue;
        this.f109422c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = j7.f109152b;
        collection.getClass();
        if (!(collection instanceof w7)) {
            return super.addAll(collection);
        }
        w7 w7Var = (w7) collection;
        int i10 = w7Var.f109422c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f109422c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f109421b;
        if (i12 > jArr.length) {
            this.f109421b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(w7Var.f109421b, 0, this.f109421b, this.f109422c, w7Var.f109422c);
        this.f109422c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long d(int i10) {
        n(i10);
        return this.f109421b[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final /* bridge */ /* synthetic */ i7 e(int i10) {
        if (i10 >= this.f109422c) {
            return new w7(i10 == 0 ? f109420d : Arrays.copyOf(this.f109421b, i10), this.f109422c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return super.equals(obj);
        }
        w7 w7Var = (w7) obj;
        if (this.f109422c != w7Var.f109422c) {
            return false;
        }
        long[] jArr = w7Var.f109421b;
        for (int i10 = 0; i10 < this.f109422c; i10++) {
            if (this.f109421b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        n(i10);
        return Long.valueOf(this.f109421b[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f109422c; i11++) {
            long j10 = this.f109421b[i11];
            byte[] bArr = j7.f109152b;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    public final void i(long j10) {
        c();
        int i10 = this.f109422c;
        int length = this.f109421b.length;
        if (i10 == length) {
            long[] jArr = new long[l(length)];
            System.arraycopy(this.f109421b, 0, jArr, 0, this.f109422c);
            this.f109421b = jArr;
        }
        long[] jArr2 = this.f109421b;
        int i11 = this.f109422c;
        this.f109422c = i11 + 1;
        jArr2[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f109422c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f109421b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    final void k(int i10) {
        int length = this.f109421b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f109421b = new long[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = l(length);
        }
        this.f109421b = Arrays.copyOf(this.f109421b, length);
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        n(i10);
        long[] jArr = this.f109421b;
        long j10 = jArr[i10];
        int i11 = this.f109422c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f109422c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f109421b;
        System.arraycopy(jArr, i11, jArr, i10, this.f109422c - i11);
        this.f109422c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        c();
        n(i10);
        long[] jArr = this.f109421b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f109422c;
    }

    private w7(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f109421b = jArr;
        this.f109422c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Long) obj).longValue());
        return true;
    }
}
