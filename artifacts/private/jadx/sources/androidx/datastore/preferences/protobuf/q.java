package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class q extends c<Boolean> implements s1.a, RandomAccess, i3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final q f50527e = new q(new boolean[0], 0, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean[] f50528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50529d;

    q() {
        this(new boolean[10], 0, true);
    }

    private void k(int index, boolean element) {
        int i10;
        c();
        if (index < 0 || index > (i10 = this.f50529d)) {
            throw new IndexOutOfBoundsException(p(index));
        }
        boolean[] zArr = this.f50528c;
        if (i10 < zArr.length) {
            System.arraycopy(zArr, index, zArr, index + 1, i10 - index);
        } else {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, index);
            System.arraycopy(this.f50528c, index, zArr2, index + 1, this.f50529d - index);
            this.f50528c = zArr2;
        }
        this.f50528c[index] = element;
        this.f50529d++;
        ((AbstractList) this).modCount++;
    }

    public static q l() {
        return f50527e;
    }

    private void m(int index) {
        if (index < 0 || index >= this.f50529d) {
            throw new IndexOutOfBoundsException(p(index));
        }
    }

    private String p(int index) {
        return "Index:" + index + ", Size:" + this.f50529d;
    }

    @Override // androidx.datastore.preferences.protobuf.s1.a
    public boolean E(int index, boolean element) {
        c();
        m(index);
        boolean[] zArr = this.f50528c;
        boolean z10 = zArr[index];
        zArr[index] = element;
        return z10;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        c();
        s1.d(collection);
        if (!(collection instanceof q)) {
            return super.addAll(collection);
        }
        q qVar = (q) collection;
        int i10 = qVar.f50529d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f50529d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f50528c;
        if (i12 > zArr.length) {
            this.f50528c = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(qVar.f50528c, 0, this.f50528c, this.f50529d, qVar.f50529d);
        this.f50529d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int index, Boolean element) {
        k(index, element.booleanValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof q)) {
            return super.equals(o10);
        }
        q qVar = (q) o10;
        if (this.f50529d != qVar.f50529d) {
            return false;
        }
        boolean[] zArr = qVar.f50528c;
        for (int i10 = 0; i10 < this.f50529d; i10++) {
            if (this.f50528c[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iK = 1;
        for (int i10 = 0; i10 < this.f50529d; i10++) {
            iK = (iK * 31) + s1.k(this.f50528c[i10]);
        }
        return iK;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean element) {
        y0(element.booleanValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) element).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f50528c[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.s1.a
    public boolean j0(int index) {
        m(index);
        return this.f50528c[index];
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Boolean get(int index) {
        return Boolean.valueOf(j0(index));
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int index) {
        c();
        m(index);
        boolean[] zArr = this.f50528c;
        boolean z10 = zArr[index];
        int i10 = this.f50529d;
        if (index < i10 - 1) {
            System.arraycopy(zArr, index + 1, zArr, index, (i10 - index) - 1);
        }
        this.f50529d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int fromIndex, int toIndex) {
        c();
        if (toIndex < fromIndex) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f50528c;
        System.arraycopy(zArr, toIndex, zArr, fromIndex, this.f50529d - toIndex);
        this.f50529d -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Boolean set(int index, Boolean element) {
        return Boolean.valueOf(E(index, element.booleanValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f50529d;
    }

    @Override // androidx.datastore.preferences.protobuf.s1.a
    public void y0(boolean element) {
        c();
        int i10 = this.f50529d;
        boolean[] zArr = this.f50528c;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f50528c = zArr2;
        }
        boolean[] zArr3 = this.f50528c;
        int i11 = this.f50529d;
        this.f50529d = i11 + 1;
        zArr3[i11] = element;
    }

    private q(boolean[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f50528c = other;
        this.f50529d = size;
    }

    @Override // androidx.datastore.preferences.protobuf.s1.l
    /* JADX INFO: renamed from: b */
    public s1.l<Boolean> b2(int capacity) {
        if (capacity >= this.f50529d) {
            return new q(Arrays.copyOf(this.f50528c, capacity), this.f50529d, true);
        }
        throw new IllegalArgumentException();
    }
}
