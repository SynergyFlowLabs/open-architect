package org.apache.commons.collections4.collection;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.iterators.l;
import org.apache.commons.collections4.iterators.u;
import org.apache.commons.collections4.list.m;

/* JADX INFO: loaded from: classes14.dex */
public class b<E> implements Collection<E>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f335599c = 8417515734108306801L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a<E> f335600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Collection<E>> f335601b = new ArrayList();

    public interface a<E> extends Serializable {
        boolean W2(b<E> bVar, List<Collection<E>> list, Collection<? extends E> collection);

        boolean k3(b<E> bVar, List<Collection<E>> list, E e10);

        boolean p2(b<E> bVar, List<Collection<E>> list, Object obj);
    }

    public b() {
    }

    @Override // java.util.Collection
    public boolean add(E e10) {
        a<E> aVar = this.f335600a;
        if (aVar != null) {
            return aVar.k3(this, this.f335601b, e10);
        }
        throw new UnsupportedOperationException("add() is not supported on CompositeCollection without a CollectionMutator strategy");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        a<E> aVar = this.f335600a;
        if (aVar != null) {
            return aVar.W2(this, this.f335601b, collection);
        }
        throw new UnsupportedOperationException("addAll() is not supported on CompositeCollection without a CollectionMutator strategy");
    }

    public void c(Collection<E> collection) {
        this.f335601b.add(collection);
    }

    @Override // java.util.Collection
    public void clear() {
        Iterator<Collection<E>> it = this.f335601b.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        Iterator<Collection<E>> it = this.f335601b.iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void d(Collection<E> collection, Collection<E> collection2) {
        this.f335601b.add(collection);
        this.f335601b.add(collection2);
    }

    public void i(Collection<E>... collectionArr) {
        this.f335601b.addAll(Arrays.asList(collectionArr));
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        Iterator<Collection<E>> it = this.f335601b.iterator();
        while (it.hasNext()) {
            if (!it.next().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        if (this.f335601b.isEmpty()) {
            return l.b();
        }
        u uVar = new u();
        Iterator<Collection<E>> it = this.f335601b.iterator();
        while (it.hasNext()) {
            uVar.b(it.next().iterator());
        }
        return uVar;
    }

    public List<Collection<E>> k() {
        return m.k(this.f335601b);
    }

    protected a<E> l() {
        return this.f335600a;
    }

    public void m(Collection<E> collection) {
        this.f335601b.remove(collection);
    }

    public void n(a<E> aVar) {
        this.f335600a = aVar;
    }

    public Collection<E> p() {
        return new ArrayList(this);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        a<E> aVar = this.f335600a;
        if (aVar != null) {
            return aVar.p2(this, this.f335601b, obj);
        }
        throw new UnsupportedOperationException("remove() is not supported on CompositeCollection without a CollectionMutator strategy");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean zRemoveAll = false;
        if (collection.size() == 0) {
            return false;
        }
        Iterator<Collection<E>> it = this.f335601b.iterator();
        while (it.hasNext()) {
            zRemoveAll |= it.next().removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        Iterator<Collection<E>> it = this.f335601b.iterator();
        boolean zRetainAll = false;
        while (it.hasNext()) {
            zRetainAll |= it.next().retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public int size() {
        Iterator<Collection<E>> it = this.f335601b.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    public b(Collection<E> collection) {
        c(collection);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        }
        Iterator<Collection<E>> it = this.f335601b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Iterator<E> it2 = it.next().iterator();
            while (it2.hasNext()) {
                tArr[i10] = it2.next();
                i10++;
            }
        }
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    public b(Collection<E> collection, Collection<E> collection2) {
        d(collection, collection2);
    }

    public b(Collection<E>... collectionArr) {
        i(collectionArr);
    }
}
