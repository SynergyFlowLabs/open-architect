package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class l3<E> extends c<E> implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final l3<Object> f50449e = new l3<>(new Object[0], 0, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private E[] f50450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50451d;

    l3() {
        this(new Object[10], 0, true);
    }

    private static <E> E[] d(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> l3<E> i() {
        return (l3<E>) f50449e;
    }

    private void k(int index) {
        if (index < 0 || index >= this.f50451d) {
            throw new IndexOutOfBoundsException(l(index));
        }
    }

    private String l(int index) {
        return "Index:" + index + ", Size:" + this.f50451d;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        c();
        int i10 = this.f50451d;
        E[] eArr = this.f50450c;
        if (i10 == eArr.length) {
            this.f50450c = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f50450c;
        int i11 = this.f50451d;
        this.f50451d = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        k(index);
        return this.f50450c[index];
    }

    @Override // androidx.datastore.preferences.protobuf.s1.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public l3<E> b2(int capacity) {
        if (capacity >= this.f50451d) {
            return new l3<>(Arrays.copyOf(this.f50450c, capacity), this.f50451d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int index) {
        c();
        k(index);
        E[] eArr = this.f50450c;
        E e10 = eArr[index];
        int i10 = this.f50451d;
        if (index < i10 - 1) {
            System.arraycopy(eArr, index + 1, eArr, index, (i10 - index) - 1);
        }
        this.f50451d--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        c();
        k(index);
        E[] eArr = this.f50450c;
        E e10 = eArr[index];
        eArr[index] = element;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f50451d;
    }

    private l3(E[] array, int size, boolean isMutable) {
        super(isMutable);
        this.f50450c = array;
        this.f50451d = size;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f50451d)) {
            E[] eArr = this.f50450c;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) d(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f50450c, 0, eArr2, 0, i10);
                System.arraycopy(this.f50450c, i10, eArr2, i10 + 1, this.f50451d - i10);
                this.f50450c = eArr2;
            }
            this.f50450c[i10] = e10;
            this.f50451d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(l(i10));
    }
}
