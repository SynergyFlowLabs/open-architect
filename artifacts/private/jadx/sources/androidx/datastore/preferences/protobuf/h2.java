package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class h2 extends c<Long> implements s1.j, RandomAccess, i3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h2 f50379e = new h2(new long[0], 0, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f50380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50381d;

    h2() {
        this(new long[10], 0, true);
    }

    private void k(int index, long element) {
        int i10;
        c();
        if (index < 0 || index > (i10 = this.f50381d)) {
            throw new IndexOutOfBoundsException(p(index));
        }
        long[] jArr = this.f50380c;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, index, jArr, index + 1, i10 - index);
        } else {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, index);
            System.arraycopy(this.f50380c, index, jArr2, index + 1, this.f50381d - index);
            this.f50380c = jArr2;
        }
        this.f50380c[index] = element;
        this.f50381d++;
        ((AbstractList) this).modCount++;
    }

    public static h2 l() {
        return f50379e;
    }

    private void m(int index) {
        if (index < 0 || index >= this.f50381d) {
            throw new IndexOutOfBoundsException(p(index));
        }
    }

    private String p(int index) {
        return "Index:" + index + ", Size:" + this.f50381d;
    }

    @Override // androidx.datastore.preferences.protobuf.s1.j
    public void M0(long element) {
        c();
        int i10 = this.f50381d;
        long[] jArr = this.f50380c;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f50380c = jArr2;
        }
        long[] jArr3 = this.f50380c;
        int i11 = this.f50381d;
        this.f50381d = i11 + 1;
        jArr3[i11] = element;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        c();
        s1.d(collection);
        if (!(collection instanceof h2)) {
            return super.addAll(collection);
        }
        h2 h2Var = (h2) collection;
        int i10 = h2Var.f50381d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f50381d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f50380c;
        if (i12 > jArr.length) {
            this.f50380c = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(h2Var.f50380c, 0, this.f50380c, this.f50381d, h2Var.f50381d);
        this.f50381d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int index, Long element) {
        k(index, element.longValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof h2)) {
            return super.equals(o10);
        }
        h2 h2Var = (h2) o10;
        if (this.f50381d != h2Var.f50381d) {
            return false;
        }
        long[] jArr = h2Var.f50380c;
        for (int i10 = 0; i10 < this.f50381d; i10++) {
            if (this.f50380c[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.s1.j
    public long getLong(int index) {
        m(index);
        return this.f50380c[index];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iS = 1;
        for (int i10 = 0; i10 < this.f50381d; i10++) {
            iS = (iS * 31) + s1.s(this.f50380c[i10]);
        }
        return iS;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean add(Long element) {
        M0(element.longValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) element).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f50380c[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.s1.j
    public long k0(int index, long element) {
        c();
        m(index);
        long[] jArr = this.f50380c;
        long j10 = jArr[index];
        jArr[index] = element;
        return j10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Long get(int index) {
        return Long.valueOf(getLong(index));
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Long remove(int index) {
        c();
        m(index);
        long[] jArr = this.f50380c;
        long j10 = jArr[index];
        int i10 = this.f50381d;
        if (index < i10 - 1) {
            System.arraycopy(jArr, index + 1, jArr, index, (i10 - index) - 1);
        }
        this.f50381d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int fromIndex, int toIndex) {
        c();
        if (toIndex < fromIndex) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f50380c;
        System.arraycopy(jArr, toIndex, jArr, fromIndex, this.f50381d - toIndex);
        this.f50381d -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Long set(int index, Long element) {
        return Long.valueOf(k0(index, element.longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f50381d;
    }

    private h2(long[] other, int size, boolean isMutable) {
        super(isMutable);
        this.f50380c = other;
        this.f50381d = size;
    }

    @Override // androidx.datastore.preferences.protobuf.s1.l
    /* JADX INFO: renamed from: b */
    public s1.l<Long> b2(int capacity) {
        if (capacity >= this.f50381d) {
            return new h2(Arrays.copyOf(this.f50380c, capacity), this.f50381d, true);
        }
        throw new IllegalArgumentException();
    }
}
