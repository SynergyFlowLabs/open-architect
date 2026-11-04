package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class u5 extends p5 implements RandomAccess, i7, o8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean[] f109354d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f109355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f109356c;

    static {
        boolean[] zArr = new boolean[0];
        f109354d = zArr;
        new u5(zArr, 0, false);
    }

    u5() {
        this(f109354d, 0, true);
    }

    private static int k(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f109356c;
    }

    private final void m(int i10) {
        if (i10 < 0 || i10 >= this.f109356c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f109356c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int i12 = i10 + 1;
        boolean[] zArr = this.f109355b;
        int length = zArr.length;
        if (i11 < length) {
            System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[k(length)];
            System.arraycopy(this.f109355b, 0, zArr2, 0, i10);
            System.arraycopy(this.f109355b, i10, zArr2, i12, this.f109356c - i10);
            this.f109355b = zArr2;
        }
        this.f109355b[i10] = zBooleanValue;
        this.f109356c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = j7.f109152b;
        collection.getClass();
        if (!(collection instanceof u5)) {
            return super.addAll(collection);
        }
        u5 u5Var = (u5) collection;
        int i10 = u5Var.f109356c;
        int i11 = 2 << 0;
        if (i10 == 0) {
            return false;
        }
        int i12 = this.f109356c;
        if (Integer.MAX_VALUE - i12 < i10) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i10;
        boolean[] zArr = this.f109355b;
        if (i13 > zArr.length) {
            this.f109355b = Arrays.copyOf(zArr, i13);
        }
        System.arraycopy(u5Var.f109355b, 0, this.f109355b, this.f109356c, u5Var.f109356c);
        this.f109356c = i13;
        int i14 = 7 >> 1;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(boolean z10) {
        c();
        int i10 = this.f109356c;
        int length = this.f109355b.length;
        if (i10 == length) {
            boolean[] zArr = new boolean[k(length)];
            System.arraycopy(this.f109355b, 0, zArr, 0, this.f109356c);
            this.f109355b = zArr;
        }
        boolean[] zArr2 = this.f109355b;
        int i11 = this.f109356c;
        this.f109356c = i11 + 1;
        zArr2[i11] = z10;
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final /* bridge */ /* synthetic */ i7 e(int i10) {
        if (i10 >= this.f109356c) {
            return new u5(i10 == 0 ? f109354d : Arrays.copyOf(this.f109355b, i10), this.f109356c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return super.equals(obj);
        }
        u5 u5Var = (u5) obj;
        if (this.f109356c != u5Var.f109356c) {
            return false;
        }
        boolean[] zArr = u5Var.f109355b;
        for (int i10 = 0; i10 < this.f109356c; i10++) {
            if (this.f109355b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m(i10);
        return Boolean.valueOf(this.f109355b[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i10 = 0; i10 < this.f109356c; i10++) {
            iA = (iA * 31) + j7.a(this.f109355b[i10]);
        }
        return iA;
    }

    public final boolean i(int i10) {
        m(i10);
        return this.f109355b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f109356c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f109355b[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        m(i10);
        boolean[] zArr = this.f109355b;
        boolean z10 = zArr[i10];
        int i11 = this.f109356c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f109356c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f109355b;
        System.arraycopy(zArr, i11, zArr, i10, this.f109356c - i11);
        this.f109356c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        m(i10);
        boolean[] zArr = this.f109355b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f109356c;
    }

    private u5(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f109355b = zArr;
        this.f109356c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Boolean) obj).booleanValue());
        return true;
    }
}
