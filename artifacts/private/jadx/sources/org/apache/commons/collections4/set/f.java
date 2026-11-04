package org.apache.commons.collections4.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.apache.commons.collections4.functors.z0;
import org.apache.commons.collections4.i0;

/* JADX INFO: loaded from: classes14.dex */
public class f<E> extends org.apache.commons.collections4.set.b<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f336290f = -228664372470420141L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<E> f336291e;

    static class b<E> extends org.apache.commons.collections4.iterators.c<E> implements i0<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Collection<E> f336292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private E f336293c;

        @Override // org.apache.commons.collections4.i0
        public boolean hasPrevious() {
            return ((ListIterator) b()).hasPrevious();
        }

        @Override // org.apache.commons.collections4.iterators.c, java.util.Iterator
        public E next() {
            E next = b().next();
            this.f336293c = next;
            return next;
        }

        @Override // org.apache.commons.collections4.i0
        public E previous() {
            E e10 = (E) ((ListIterator) b()).previous();
            this.f336293c = e10;
            return e10;
        }

        @Override // org.apache.commons.collections4.iterators.g, java.util.Iterator
        public void remove() {
            this.f336292b.remove(this.f336293c);
            b().remove();
            this.f336293c = null;
        }

        private b(ListIterator<E> listIterator, Collection<E> collection) {
            super(listIterator);
            this.f336292b = collection;
        }
    }

    public f() {
        super(new HashSet());
        this.f336291e = new ArrayList();
    }

    public static <E> f<E> m(List<E> list) {
        if (list == null) {
            throw new NullPointerException("List must not be null");
        }
        org.apache.commons.collections4.j.y(list, z0.c());
        return new f<>(new HashSet(list), list);
    }

    public static <E> f<E> n(Set<E> set) {
        return new f<>(set);
    }

    public static <E> f<E> p(Set<E> set, List<E> list) {
        if (set == null) {
            throw new NullPointerException("Set must not be null");
        }
        if (list == null) {
            throw new NullPointerException("List must not be null");
        }
        if (set.size() > 0 || list.size() > 0) {
            throw new IllegalArgumentException("Set and List must be empty");
        }
        return new f<>(set, list);
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean add(E e10) {
        if (!c().add(e10)) {
            return false;
        }
        this.f336291e.add(e10);
        return true;
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public void clear() {
        c().clear();
        this.f336291e.clear();
    }

    public E get(int i10) {
        return this.f336291e.get(i10);
    }

    public int indexOf(Object obj) {
        return this.f336291e.indexOf(obj);
    }

    public List<E> k() {
        return org.apache.commons.collections4.list.m.k(this.f336291e);
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public i0<E> iterator() {
        return new b(this.f336291e.listIterator(), c());
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean remove(Object obj) {
        boolean zRemove = c().remove(obj);
        if (zRemove) {
            this.f336291e.remove(obj);
        }
        return zRemove;
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean retainAll(Collection<?> collection) {
        boolean zRetainAll = c().retainAll(collection);
        if (!zRetainAll) {
            return false;
        }
        if (c().size() == 0) {
            this.f336291e.clear();
            return zRetainAll;
        }
        Iterator<E> it = this.f336291e.iterator();
        while (it.hasNext()) {
            if (!c().contains(it.next())) {
                it.remove();
            }
        }
        return zRetainAll;
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public Object[] toArray() {
        return this.f336291e.toArray();
    }

    @Override // org.apache.commons.collections4.collection.a
    public String toString() {
        return this.f336291e.toString();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f336291e.toArray(tArr);
    }

    protected f(Set<E> set) {
        super(set);
        this.f336291e = new ArrayList(set);
    }

    public void add(int i10, E e10) {
        if (!contains(e10)) {
            c().add(e10);
            this.f336291e.add(i10, e10);
        }
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (E e10 : collection) {
            if (!contains(e10)) {
                c().add(e10);
                arrayList.add(e10);
                z10 = true;
            }
        }
        if (z10) {
            this.f336291e.addAll(i10, arrayList);
        }
        return z10;
    }

    public E remove(int i10) {
        E eRemove = this.f336291e.remove(i10);
        remove(eRemove);
        return eRemove;
    }

    protected f(Set<E> set, List<E> list) {
        super(set);
        if (list == null) {
            throw new NullPointerException("List must not be null");
        }
        this.f336291e = list;
    }
}
