package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class x6 extends p5 implements RandomAccess, i7, o8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float[] f109430d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f109431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f109432c;

    static {
        float[] fArr = new float[0];
        f109430d = fArr;
        new x6(fArr, 0, false);
    }

    x6() {
        this(f109430d, 0, true);
    }

    private static int l(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f109432c;
    }

    private final void n(int i10) {
        if (i10 < 0 || i10 >= this.f109432c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f109432c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.f109431b;
        int length = fArr.length;
        if (i11 < length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[l(length)];
            System.arraycopy(this.f109431b, 0, fArr2, 0, i10);
            System.arraycopy(this.f109431b, i10, fArr2, i12, this.f109432c - i10);
            this.f109431b = fArr2;
        }
        this.f109431b[i10] = fFloatValue;
        this.f109432c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = j7.f109152b;
        collection.getClass();
        if (!(collection instanceof x6)) {
            return super.addAll(collection);
        }
        x6 x6Var = (x6) collection;
        int i10 = x6Var.f109432c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f109432c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f109431b;
        if (i12 > fArr.length) {
            this.f109431b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(x6Var.f109431b, 0, this.f109431b, this.f109432c, x6Var.f109432c);
        this.f109432c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final float d(int i10) {
        n(i10);
        return this.f109431b[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final /* bridge */ /* synthetic */ i7 e(int i10) {
        if (i10 >= this.f109432c) {
            return new x6(i10 == 0 ? f109430d : Arrays.copyOf(this.f109431b, i10), this.f109432c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6)) {
            return super.equals(obj);
        }
        x6 x6Var = (x6) obj;
        if (this.f109432c != x6Var.f109432c) {
            return false;
        }
        float[] fArr = x6Var.f109431b;
        for (int i10 = 0; i10 < this.f109432c; i10++) {
            if (Float.floatToIntBits(this.f109431b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        n(i10);
        return Float.valueOf(this.f109431b[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f109432c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f109431b[i10]);
        }
        return iFloatToIntBits;
    }

    public final void i(float f10) {
        c();
        int i10 = this.f109432c;
        int length = this.f109431b.length;
        if (i10 == length) {
            float[] fArr = new float[l(length)];
            System.arraycopy(this.f109431b, 0, fArr, 0, this.f109432c);
            this.f109431b = fArr;
        }
        float[] fArr2 = this.f109431b;
        int i11 = this.f109432c;
        this.f109432c = i11 + 1;
        fArr2[i11] = f10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f109432c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f109431b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    final void k(int i10) {
        int length = this.f109431b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f109431b = new float[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = l(length);
        }
        this.f109431b = Arrays.copyOf(this.f109431b, length);
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        n(i10);
        float[] fArr = this.f109431b;
        float f10 = fArr[i10];
        int i11 = this.f109432c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f109432c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f109431b;
        System.arraycopy(fArr, i11, fArr, i10, this.f109432c - i11);
        this.f109432c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        c();
        n(i10);
        float[] fArr = this.f109431b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f109432c;
    }

    private x6(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f109431b = fArr;
        this.f109432c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.p5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Float) obj).floatValue());
        return true;
    }
}
