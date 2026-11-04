package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class h1 extends c<Float> implements s1.f, RandomAccess, i3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h1 f50376e = new h1(new float[0], 0, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f50377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50378d;

    h1() {
        this(new float[10], 0, true);
    }

    private void k(int index, float element) {
        int i10;
        c();
        if (index < 0 || index > (i10 = this.f50378d)) {
            throw new IndexOutOfBoundsException(p(index));
        }
        float[] fArr = this.f50377c;
        if (i10 < fArr.length) {
            System.arraycopy(fArr, index, fArr, index + 1, i10 - index);
        } else {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, index);
            System.arraycopy(this.f50377c, index, fArr2, index + 1, this.f50378d - index);
            this.f50377c = fArr2;
        }
        this.f50377c[index] = element;
        this.f50378d++;
        ((AbstractList) this).modCount++;
    }

    public static h1 l() {
        return f50376e;
    }

    private void m(int index) {
        if (index < 0 || index >= this.f50378d) {
            throw new IndexOutOfBoundsException(p(index));
        }
    }

    private String p(int index) {
        return "Index:" + index + ", Size:" + this.f50378d;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        c();
        s1.d(collection);
        if (!(collection instanceof h1)) {
            return super.addAll(collection);
        }
        h1 h1Var = (h1) collection;
        int i10 = h1Var.f50378d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f50378d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f50377c;
        if (i12 > fArr.length) {
            this.f50377c = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(h1Var.f50377c, 0, this.f50377c, this.f50378d, h1Var.f50378d);
        this.f50378d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.s1.f
    public void b1(float element) {
        c();
        int i10 = this.f50378d;
        float[] fArr = this.f50377c;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f50377c = fArr2;
        }
        float[] fArr3 = this.f50377c;
        int i11 = this.f50378d;
        this.f50378d = i11 + 1;
        fArr3[i11] = element;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int index, Float element) {
        k(index, element.floatValue());
    }

    @Override // androidx.datastore.preferences.protobuf.s1.f
    public float d0(int index, float element) {
        c();
        m(index);
        float[] fArr = this.f50377c;
        float f10 = fArr[index];
        fArr[index] = element;
        return f10;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof h1)) {
            return super.equals(o10);
        }
        h1 h1Var = (h1) o10;
        if (this.f50378d != h1Var.f50378d) {
            return false;
        }
        float[] fArr = h1Var.f50377c;
        for (int i10 = 0; i10 < this.f50378d; i10++) {
            if (Float.floatToIntBits(this.f50377c[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.s1.f
    public float getFloat(int index) {
        m(index);
        return this.f50377c[index];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f50378d; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f50377c[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean add(Float element) {
        b1(element.floatValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) element).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f50377c[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Float get(int index) {
        return Float.valueOf(getFloat(index));
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float remove(int index) {
        c();
        m(index);
        float[] fArr = this.f50377c;
        float f10 = fArr[index];
        int i10 = this.f50378d;
        if (index < i10 - 1) {
            System.arraycopy(fArr, index + 1, fArr, index, (i10 - index) - 1);
        }
        this.f50378d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int fromIndex, int toIndex) {
        c();
        if (toIndex < fromIndex) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f50377c;
        System.arraycopy(fArr, toIndex, fArr, fromIndex, this.f50378d - toIndex);
        this.f50378d -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Float set(int index, Float element) {
        return Float.valueOf(d0(index, element.floatValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f50378d;
    }

    private h1(float[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f50377c = other;
        this.f50378d = size;
    }

    @Override // androidx.datastore.preferences.protobuf.s1.l
    /* JADX INFO: renamed from: b */
    public s1.l<Float> b2(int capacity) {
        if (capacity >= this.f50378d) {
            return new h1(Arrays.copyOf(this.f50377c, capacity), this.f50378d, true);
        }
        throw new IllegalArgumentException();
    }
}
