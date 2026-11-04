package com.google.vr.sdk.deps;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
final class f3 extends f2<Float> implements q3, d5, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f3 f129368d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f129369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f129370c;

    static {
        f3 f3Var = new f3();
        f129368d = f3Var;
        f3Var.b();
    }

    f3() {
        this(new float[10], 0);
    }

    private final void i(int i10, float f10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f129370c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        float[] fArr = this.f129369b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f129369b, i10, fArr2, i10 + 1, this.f129370c - i10);
            this.f129369b = fArr2;
        }
        this.f129369b[i10] = f10;
        this.f129370c++;
        ((AbstractList) this).modCount++;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f129370c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private final String l(int i10) {
        int i11 = this.f129370c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    public static f3 m() {
        return f129368d;
    }

    @Override // com.google.vr.sdk.deps.u3
    public final /* synthetic */ u3<Float> N3(int i10) {
        if (i10 >= this.f129370c) {
            return new f3(Arrays.copyOf(this.f129369b, i10), this.f129370c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        i(i10, ((Float) obj).floatValue());
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        c();
        k3.d(collection);
        if (!(collection instanceof f3)) {
            return super.addAll(collection);
        }
        f3 f3Var = (f3) collection;
        int i10 = f3Var.f129370c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f129370c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f129369b;
        if (i12 > fArr.length) {
            this.f129369b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(f3Var.f129369b, 0, this.f129369b, this.f129370c, f3Var.f129370c);
        this.f129370c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(float f10) {
        i(this.f129370c, f10);
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return super.equals(obj);
        }
        f3 f3Var = (f3) obj;
        if (this.f129370c != f3Var.f129370c) {
            return false;
        }
        float[] fArr = f3Var.f129369b;
        for (int i10 = 0; i10 < this.f129370c; i10++) {
            if (Float.floatToIntBits(this.f129369b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Float.valueOf(this.f129369b[i10]);
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f129370c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f129369b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f129370c; i10++) {
            if (obj.equals(Float.valueOf(this.f129369b[i10]))) {
                float[] fArr = this.f129369b;
                System.arraycopy(fArr, i10 + 1, fArr, i10, this.f129370c - i10);
                this.f129370c--;
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
        float[] fArr = this.f129369b;
        System.arraycopy(fArr, i11, fArr, i10, this.f129370c - i11);
        this.f129370c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        c();
        k(i10);
        float[] fArr = this.f129369b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f129370c;
    }

    private f3(float[] fArr, int i10) {
        this.f129369b = fArr;
        this.f129370c = i10;
    }

    @Override // com.google.vr.sdk.deps.f2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        c();
        k(i10);
        float[] fArr = this.f129369b;
        float f10 = fArr[i10];
        int i11 = this.f129370c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, i11 - i10);
        }
        this.f129370c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }
}
