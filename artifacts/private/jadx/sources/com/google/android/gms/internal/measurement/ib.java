package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class ib extends da implements RandomAccess, wb, fd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float[] f108565d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f108566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f108567c;

    static {
        float[] fArr = new float[0];
        f108565d = fArr;
        new ib(fArr, 0, false);
    }

    ib() {
        this(f108565d, 0, true);
    }

    private static int l(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void m(int i10) {
        if (i10 < 0 || i10 >= this.f108567c) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    private final String n(int i10) {
        return fa.a(this.f108567c, i10, com.google.common.base.c.f116462o, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f108567c)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.f108566b;
        int length = fArr.length;
        if (i11 < length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[l(length)];
            System.arraycopy(this.f108566b, 0, fArr2, 0, i10);
            System.arraycopy(this.f108566b, i10, fArr2, i12, this.f108567c - i10);
            this.f108566b = fArr2;
        }
        this.f108566b[i10] = fFloatValue;
        this.f108567c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = ac.f108281b;
        collection.getClass();
        if (!(collection instanceof ib)) {
            return super.addAll(collection);
        }
        ib ibVar = (ib) collection;
        int i10 = ibVar.f108567c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f108567c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f108566b;
        if (i12 > fArr.length) {
            this.f108566b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(ibVar.f108566b, 0, this.f108566b, this.f108567c, ibVar.f108567c);
        this.f108567c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final float d(int i10) {
        m(i10);
        return this.f108566b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zb, com.google.android.gms.internal.measurement.sb
    /* JADX INFO: renamed from: e */
    public final wb f(int i10) {
        if (i10 >= this.f108567c) {
            return new ib(i10 == 0 ? f108565d : Arrays.copyOf(this.f108566b, i10), this.f108567c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib)) {
            return super.equals(obj);
        }
        ib ibVar = (ib) obj;
        if (this.f108567c != ibVar.f108567c) {
            return false;
        }
        float[] fArr = ibVar.f108566b;
        for (int i10 = 0; i10 < this.f108567c; i10++) {
            if (Float.floatToIntBits(this.f108566b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m(i10);
        return Float.valueOf(this.f108566b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f108567c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f108566b[i10]);
        }
        return iFloatToIntBits;
    }

    public final void i(float f10) {
        c();
        int i10 = this.f108567c;
        int length = this.f108566b.length;
        if (i10 == length) {
            float[] fArr = new float[l(length)];
            System.arraycopy(this.f108566b, 0, fArr, 0, this.f108567c);
            this.f108566b = fArr;
        }
        float[] fArr2 = this.f108566b;
        int i11 = this.f108567c;
        this.f108567c = i11 + 1;
        fArr2[i11] = f10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f108567c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f108566b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    final void k(int i10) {
        int length = this.f108566b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f108566b = new float[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = l(length);
        }
        this.f108566b = Arrays.copyOf(this.f108566b, length);
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        m(i10);
        float[] fArr = this.f108566b;
        float f10 = fArr[i10];
        int i11 = this.f108567c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f108567c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f108566b;
        System.arraycopy(fArr, i11, fArr, i10, this.f108567c - i11);
        this.f108567c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        c();
        m(i10);
        float[] fArr = this.f108566b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f108567c;
    }

    private ib(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f108566b = fArr;
        this.f108567c = i10;
    }

    @Override // com.google.android.gms.internal.measurement.da, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Float) obj).floatValue());
        return true;
    }
}
