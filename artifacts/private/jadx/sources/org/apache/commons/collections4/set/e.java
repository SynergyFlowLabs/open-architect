package org.apache.commons.collections4.set;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.collections4.iterators.u;

/* JADX INFO: loaded from: classes14.dex */
public class e<E> implements Set<E>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336287c = 5185069727540378940L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a<E> f336288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Set<E>> f336289b = new ArrayList();

    public interface a<E> extends Serializable {
        void U2(e<E> eVar, Set<E> set, Set<E> set2, Collection<E> collection);

        boolean h4(e<E> eVar, List<Set<E>> list, E e10);

        boolean w3(e<E> eVar, List<Set<E>> list, Collection<? extends E> collection);
    }

    public e() {
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e10) {
        a<E> aVar = this.f336288a;
        if (aVar != null) {
            return aVar.h4(this, this.f336289b, e10);
        }
        throw new UnsupportedOperationException("add() is not supported on CompositeSet without a SetMutator strategy");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        a<E> aVar = this.f336288a;
        if (aVar != null) {
            return aVar.w3(this, this.f336289b, collection);
        }
        throw new UnsupportedOperationException("addAll() is not supported on CompositeSet without a SetMutator strategy");
    }

    public synchronized void c(Set<E> set) {
        try {
            for (Set<E> set2 : l()) {
                Collection<E> collectionK = org.apache.commons.collections4.j.K(set2, set);
                if (collectionK.size() > 0) {
                    if (this.f336288a == null) {
                        throw new UnsupportedOperationException("Collision adding composited set with no SetMutator set");
                    }
                    k().U2(this, set2, set, collectionK);
                    if (org.apache.commons.collections4.j.K(set2, set).size() > 0) {
                        throw new IllegalArgumentException("Attempt to add illegal entry unresolved by SetMutator.resolveCollision()");
                    }
                }
            }
            this.f336289b.add(set);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        Iterator<Set<E>> it = this.f336289b.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        Iterator<Set<E>> it = this.f336289b.iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void d(Set<E> set, Set<E> set2) {
        c(set);
        c(set2);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (set.size() == size() && set.containsAll(this)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode += next == null ? 0 : next.hashCode();
        }
        return iHashCode;
    }

    public void i(Set<E>... setArr) {
        for (Set<E> set : setArr) {
            c(set);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        Iterator<Set<E>> it = this.f336289b.iterator();
        while (it.hasNext()) {
            if (!it.next().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        if (this.f336289b.isEmpty()) {
            return org.apache.commons.collections4.iterators.l.b();
        }
        u uVar = new u();
        Iterator<Set<E>> it = this.f336289b.iterator();
        while (it.hasNext()) {
            uVar.b(it.next().iterator());
        }
        return uVar;
    }

    protected a<E> k() {
        return this.f336288a;
    }

    public List<Set<E>> l() {
        return org.apache.commons.collections4.list.m.k(this.f336289b);
    }

    public void m(Set<E> set) {
        this.f336289b.remove(set);
    }

    public void n(a<E> aVar) {
        this.f336288a = aVar;
    }

    public Set<E> p() {
        return new HashSet(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        for (Set<E> set : l()) {
            if (set.contains(obj)) {
                return set.remove(obj);
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean zRemoveAll = false;
        if (collection.size() == 0) {
            return false;
        }
        Iterator<Set<E>> it = this.f336289b.iterator();
        while (it.hasNext()) {
            zRemoveAll |= it.next().removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        Iterator<Set<E>> it = this.f336289b.iterator();
        boolean zRetainAll = false;
        while (it.hasNext()) {
            zRetainAll |= it.next().retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        Iterator<Set<E>> it = this.f336289b.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // java.util.Set, java.util.Collection
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

    public e(Set<E> set) {
        c(set);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        }
        Iterator<Set<E>> it = this.f336289b.iterator();
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

    public e(Set<E>... setArr) {
        i(setArr);
    }
}
