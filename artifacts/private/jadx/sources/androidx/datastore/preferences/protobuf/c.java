package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
abstract class c<E> extends AbstractList<E> implements s1.l<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final int f50033b = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50034a;

    c() {
        this(true);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        c();
        return super.add(e10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> c10) {
        c();
        return super.addAll(c10);
    }

    protected void c() {
        if (!this.f50034a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        c();
        super.clear();
    }

    @Override // androidx.datastore.preferences.protobuf.s1.l
    public final void e1() {
        if (this.f50034a) {
            this.f50034a = false;
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o10) {
        if (o10 == this) {
            return true;
        }
        if (!(o10 instanceof List)) {
            return false;
        }
        if (!(o10 instanceof RandomAccess)) {
            return super.equals(o10);
        }
        List list = (List) o10;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        c();
        return (E) super.remove(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> c10) {
        c();
        return super.removeAll(c10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> c10) {
        c();
        return super.retainAll(c10);
    }

    public boolean s1() {
        return this.f50034a;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        c();
        return (E) super.set(i10, e10);
    }

    c(boolean isMutable) {
        this.f50034a = isMutable;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        c();
        super.add(index, element);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> c10) {
        c();
        return super.addAll(index, c10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object o10) {
        c();
        int iIndexOf = indexOf(o10);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }
}
