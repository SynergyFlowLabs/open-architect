package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class u3 extends o2 implements RandomAccess, x3, e5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u3 f107846d = new u3(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f107847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107848c;

    u3() {
        this(new int[10], 0, true);
    }

    private final String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f107848c;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f107848c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f107848c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        int[] iArr = this.f107847b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f107847b, i10, iArr2, i10 + 1, this.f107848c - i10);
            this.f107847b = iArr2;
        }
        this.f107847b[i10] = iIntValue;
        this.f107848c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = z3.f107905d;
        collection.getClass();
        if (!(collection instanceof u3)) {
            return super.addAll(collection);
        }
        u3 u3Var = (u3) collection;
        int i10 = u3Var.f107848c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f107848c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f107847b;
        if (i12 > iArr.length) {
            this.f107847b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(u3Var.f107847b, 0, this.f107847b, this.f107848c, u3Var.f107848c);
        this.f107848c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        c();
        int i11 = this.f107848c;
        int[] iArr = this.f107847b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f107847b = iArr2;
        }
        int[] iArr3 = this.f107847b;
        int i12 = this.f107848c;
        this.f107848c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.android.gms.internal.auth.x3
    public final /* bridge */ /* synthetic */ x3 e(int i10) {
        if (i10 >= this.f107848c) {
            return new u3(Arrays.copyOf(this.f107847b, i10), this.f107848c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return super.equals(obj);
        }
        u3 u3Var = (u3) obj;
        if (this.f107848c != u3Var.f107848c) {
            return false;
        }
        int[] iArr = u3Var.f107847b;
        for (int i10 = 0; i10 < this.f107848c; i10++) {
            if (this.f107847b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Integer.valueOf(this.f107847b[i10]);
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f107848c; i11++) {
            i10 = (i10 * 31) + this.f107847b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f107848c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f107847b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        k(i10);
        int[] iArr = this.f107847b;
        int i11 = iArr[i10];
        int i12 = this.f107848c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f107848c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f107847b;
        System.arraycopy(iArr, i11, iArr, i10, this.f107848c - i11);
        this.f107848c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        k(i10);
        int[] iArr = this.f107847b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f107848c;
    }

    private u3(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f107847b = iArr;
        this.f107848c = i10;
    }

    @Override // com.google.android.gms.internal.auth.o2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
