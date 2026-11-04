package org.apache.commons.collections4.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.apache.commons.collections4.set.o;
import org.apache.commons.collections4.y;

/* JADX INFO: loaded from: classes14.dex */
public class j<E> extends c<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f335943f = 7196982186153478694L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<E> f335944e;

    static class a<E> extends org.apache.commons.collections4.iterators.c<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<E> f335945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private E f335946c;

        protected a(Iterator<E> it, Set<E> set) {
            super(it);
            this.f335946c = null;
            this.f335945b = set;
        }

        @Override // org.apache.commons.collections4.iterators.c, java.util.Iterator
        public E next() {
            E e10 = (E) super.next();
            this.f335946c = e10;
            return e10;
        }

        @Override // org.apache.commons.collections4.iterators.g, java.util.Iterator
        public void remove() {
            super.remove();
            this.f335945b.remove(this.f335946c);
            this.f335946c = null;
        }
    }

    static class b<E> extends org.apache.commons.collections4.iterators.d<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<E> f335947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private E f335948c;

        protected b(ListIterator<E> listIterator, Set<E> set) {
            super(listIterator);
            this.f335948c = null;
            this.f335947b = set;
        }

        @Override // org.apache.commons.collections4.iterators.d, java.util.ListIterator
        public void add(E e10) {
            if (!this.f335947b.contains(e10)) {
                super.add(e10);
                this.f335947b.add(e10);
            }
        }

        @Override // org.apache.commons.collections4.iterators.d, java.util.ListIterator, java.util.Iterator
        public E next() {
            E e10 = (E) super.next();
            this.f335948c = e10;
            return e10;
        }

        @Override // org.apache.commons.collections4.iterators.d, java.util.ListIterator
        public E previous() {
            E e10 = (E) super.previous();
            this.f335948c = e10;
            return e10;
        }

        @Override // org.apache.commons.collections4.iterators.d, java.util.ListIterator, java.util.Iterator
        public void remove() {
            super.remove();
            this.f335947b.remove(this.f335948c);
            this.f335948c = null;
        }

        @Override // org.apache.commons.collections4.iterators.d, java.util.ListIterator
        public void set(E e10) {
            throw new UnsupportedOperationException("ListIterator does not support set");
        }
    }

    protected j(List<E> list, Set<E> set) {
        super(list);
        if (set == null) {
            throw new NullPointerException("Set must not be null");
        }
        this.f335944e = set;
    }

    public static <E> j<E> m(List<E> list) {
        if (list == null) {
            throw new NullPointerException("List must not be null");
        }
        if (list.isEmpty()) {
            return new j<>(list, new HashSet());
        }
        ArrayList arrayList = new ArrayList(list);
        list.clear();
        j<E> jVar = new j<>(list, new HashSet());
        jVar.addAll(arrayList);
        return jVar;
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean add(E e10) {
        int size = size();
        add(size(), e10);
        return size != size();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return addAll(size(), collection);
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public void clear() {
        super.clear();
        this.f335944e.clear();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f335944e.contains(obj);
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean containsAll(Collection<?> collection) {
        return this.f335944e.containsAll(collection);
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.c
    public Iterator<E> iterator() {
        return new a(super.iterator(), this.f335944e);
    }

    public Set<E> k() {
        return o.k(this.f335944e);
    }

    protected Set<E> l(Set<E> set, List<E> list) {
        Set<E> hashSet;
        if (set.getClass().equals(HashSet.class)) {
            hashSet = new HashSet<>(list.size());
        } else {
            try {
                hashSet = (Set) set.getClass().newInstance();
            } catch (IllegalAccessException unused) {
                hashSet = new HashSet<>();
            } catch (InstantiationException unused2) {
                hashSet = new HashSet<>();
            }
        }
        hashSet.addAll(list);
        return hashSet;
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public ListIterator<E> listIterator() {
        return new b(super.listIterator(), this.f335944e);
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean remove(Object obj) {
        boolean zRemove = this.f335944e.remove(obj);
        if (zRemove) {
            super.remove(obj);
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
        boolean zRetainAll = this.f335944e.retainAll(collection);
        if (!zRetainAll) {
            return false;
        }
        if (this.f335944e.size() == 0) {
            super.clear();
            return zRetainAll;
        }
        super.retainAll(this.f335944e);
        return zRetainAll;
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public E set(int i10, E e10) {
        int iIndexOf = indexOf(e10);
        E e11 = (E) super.set(i10, e10);
        if (iIndexOf != -1 && iIndexOf != i10) {
            super.remove(iIndexOf);
        }
        this.f335944e.remove(e11);
        this.f335944e.add(e10);
        return e11;
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public List<E> subList(int i10, int i11) {
        List<E> listSubList = super.subList(i10, i11);
        return y.w(new j(listSubList, l(this.f335944e, listSubList)));
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        ArrayList arrayList = new ArrayList();
        for (E e10 : collection) {
            if (this.f335944e.add(e10)) {
                arrayList.add(e10);
            }
        }
        return super.addAll(i10, arrayList);
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new b(super.listIterator(i10), this.f335944e);
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public E remove(int i10) {
        E e10 = (E) super.remove(i10);
        this.f335944e.remove(e10);
        return e10;
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public void add(int i10, E e10) {
        if (this.f335944e.contains(e10)) {
            return;
        }
        super.add(i10, e10);
        this.f335944e.add(e10);
    }
}
