package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.d
@a4
@com.google.common.annotations.b(emulated = true)
final class na {

    static final class b<K, V> extends k<K, Collection<V>> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f117831j = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @fj.a
        transient Set<Map.Entry<K, Collection<V>>> f117832h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @fj.a
        transient Collection<Collection<V>> f117833i;

        b(Map<K, Collection<V>> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        @Override // com.google.common.collect.na.k, java.util.Map
        public boolean containsValue(@fj.a Object o10) {
            return values().contains(o10);
        }

        @Override // com.google.common.collect.na.k, java.util.Map
        public Set<Map.Entry<K, Collection<V>>> entrySet() {
            Set<Map.Entry<K, Collection<V>>> set;
            synchronized (this.f117869b) {
                try {
                    if (this.f117832h == null) {
                        this.f117832h = new c(m().entrySet(), this.f117869b);
                    }
                    set = this.f117832h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.na.k, java.util.Map
        public Collection<Collection<V>> values() {
            Collection<Collection<V>> collection;
            synchronized (this.f117869b) {
                try {
                    if (this.f117833i == null) {
                        this.f117833i = new d(m().values(), this.f117869b);
                    }
                    collection = this.f117833i;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }

        @Override // com.google.common.collect.na.k, java.util.Map
        @fj.a
        public Collection<V> get(@fj.a Object key) {
            Collection<V> collectionA;
            synchronized (this.f117869b) {
                Collection collection = (Collection) super.get(key);
                collectionA = collection == null ? null : na.A(collection, this.f117869b);
            }
            return collectionA;
        }
    }

    static final class d<V> extends f<Collection<V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f117838e = 0;

        class a extends eb<Collection<V>, Collection<V>> {
            a(Iterator backingIterator) {
                super(backingIterator);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.eb
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Collection<V> b(Collection<V> from) {
                return na.A(from, d.this.f117869b);
            }
        }

        d(Collection<Collection<V>> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        @Override // com.google.common.collect.na.f, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Collection<V>> iterator() {
            return new a(super.iterator());
        }
    }

    static final class e<K, V> extends k<K, V> implements com.google.common.collect.w<K, V>, Serializable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f117840j = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @fj.a
        private transient Set<V> f117841h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @r9.j
        @fj.a
        private transient com.google.common.collect.w<V, K> f117842i;

        @Override // com.google.common.collect.w
        @fj.a
        public V L2(@b9 K key, @b9 V value) {
            V vL2;
            synchronized (this.f117869b) {
                try {
                    vL2 = i().L2(key, value);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return vL2;
        }

        @Override // com.google.common.collect.w
        public com.google.common.collect.w<V, K> Y2() {
            com.google.common.collect.w<V, K> wVar;
            synchronized (this.f117869b) {
                try {
                    if (this.f117842i == null) {
                        this.f117842i = new e(i().Y2(), this.f117869b, this);
                    }
                    wVar = this.f117842i;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return wVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.k
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.google.common.collect.w<K, V> m() {
            return (com.google.common.collect.w) super.m();
        }

        private e(com.google.common.collect.w<K, V> delegate, @fj.a Object mutex, @fj.a com.google.common.collect.w<V, K> inverse) {
            super(delegate, mutex);
            this.f117842i = inverse;
        }

        @Override // com.google.common.collect.na.k, java.util.Map
        public Set<V> values() {
            Set<V> set;
            synchronized (this.f117869b) {
                try {
                    if (this.f117841h == null) {
                        this.f117841h = na.u(i().values(), this.f117869b);
                    }
                    set = this.f117841h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }
    }

    @com.google.common.annotations.e
    static class f<E> extends p implements Collection<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f117843d = 0;

        @Override // java.util.Collection
        public boolean add(E e10) {
            boolean zAdd;
            synchronized (this.f117869b) {
                zAdd = p().add(e10);
            }
            return zAdd;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends E> c10) {
            boolean zAddAll;
            synchronized (this.f117869b) {
                try {
                    zAddAll = p().addAll(c10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zAddAll;
        }

        @Override // java.util.Collection
        public void clear() {
            synchronized (this.f117869b) {
                p().clear();
            }
        }

        public boolean contains(@fj.a Object o10) {
            boolean zContains;
            synchronized (this.f117869b) {
                zContains = p().contains(o10);
            }
            return zContains;
        }

        public boolean containsAll(Collection<?> c10) {
            boolean zContainsAll;
            synchronized (this.f117869b) {
                try {
                    zContainsAll = p().containsAll(c10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zContainsAll;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f117869b) {
                zIsEmpty = p().isEmpty();
            }
            return zIsEmpty;
        }

        public Iterator<E> iterator() {
            return p().iterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.p
        /* JADX INFO: renamed from: m */
        public Collection<E> m() {
            return (Collection) super.m();
        }

        public boolean remove(@fj.a Object o10) {
            boolean zRemove;
            synchronized (this.f117869b) {
                try {
                    zRemove = p().remove(o10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zRemove;
        }

        public boolean removeAll(Collection<?> c10) {
            boolean zRemoveAll;
            synchronized (this.f117869b) {
                zRemoveAll = p().removeAll(c10);
            }
            return zRemoveAll;
        }

        public boolean retainAll(Collection<?> c10) {
            boolean zRetainAll;
            synchronized (this.f117869b) {
                try {
                    zRetainAll = p().retainAll(c10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zRetainAll;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            synchronized (this.f117869b) {
                size = p().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.f117869b) {
                array = p().toArray();
            }
            return array;
        }

        private f(Collection<E> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f117869b) {
                tArr2 = (T[]) p().toArray(tArr);
            }
            return tArr2;
        }
    }

    static final class g<E> extends q<E> implements Deque<E> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f117844f = 0;

        g(Deque<E> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.Deque
        public void addFirst(E e10) {
            synchronized (this.f117869b) {
                m().addFirst(e10);
            }
        }

        @Override // java.util.Deque
        public void addLast(E e10) {
            synchronized (this.f117869b) {
                try {
                    m().addLast(e10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.Deque
        public Iterator<E> descendingIterator() {
            Iterator<E> itDescendingIterator;
            synchronized (this.f117869b) {
                try {
                    itDescendingIterator = m().descendingIterator();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return itDescendingIterator;
        }

        @Override // java.util.Deque
        public E getFirst() {
            E first;
            synchronized (this.f117869b) {
                first = m().getFirst();
            }
            return first;
        }

        @Override // java.util.Deque
        public E getLast() {
            E last;
            synchronized (this.f117869b) {
                try {
                    last = m().getLast();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return last;
        }

        @Override // java.util.Deque
        public boolean offerFirst(E e10) {
            boolean zOfferFirst;
            synchronized (this.f117869b) {
                zOfferFirst = m().offerFirst(e10);
            }
            return zOfferFirst;
        }

        @Override // java.util.Deque
        public boolean offerLast(E e10) {
            boolean zOfferLast;
            synchronized (this.f117869b) {
                zOfferLast = m().offerLast(e10);
            }
            return zOfferLast;
        }

        @Override // java.util.Deque
        @fj.a
        public E peekFirst() {
            E ePeekFirst;
            synchronized (this.f117869b) {
                try {
                    ePeekFirst = m().peekFirst();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return ePeekFirst;
        }

        @Override // java.util.Deque
        @fj.a
        public E peekLast() {
            E ePeekLast;
            synchronized (this.f117869b) {
                ePeekLast = m().peekLast();
            }
            return ePeekLast;
        }

        @Override // java.util.Deque
        @fj.a
        public E pollFirst() {
            E ePollFirst;
            synchronized (this.f117869b) {
                ePollFirst = m().pollFirst();
            }
            return ePollFirst;
        }

        @Override // java.util.Deque
        @fj.a
        public E pollLast() {
            E ePollLast;
            synchronized (this.f117869b) {
                try {
                    ePollLast = m().pollLast();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return ePollLast;
        }

        @Override // java.util.Deque
        public E pop() {
            E ePop;
            synchronized (this.f117869b) {
                try {
                    ePop = m().pop();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return ePop;
        }

        @Override // java.util.Deque
        public void push(E e10) {
            synchronized (this.f117869b) {
                m().push(e10);
            }
        }

        @Override // java.util.Deque
        public E removeFirst() {
            E eRemoveFirst;
            synchronized (this.f117869b) {
                eRemoveFirst = m().removeFirst();
            }
            return eRemoveFirst;
        }

        @Override // java.util.Deque
        public boolean removeFirstOccurrence(@fj.a Object o10) {
            boolean zRemoveFirstOccurrence;
            synchronized (this.f117869b) {
                zRemoveFirstOccurrence = m().removeFirstOccurrence(o10);
            }
            return zRemoveFirstOccurrence;
        }

        @Override // java.util.Deque
        public E removeLast() {
            E eRemoveLast;
            synchronized (this.f117869b) {
                eRemoveLast = m().removeLast();
            }
            return eRemoveLast;
        }

        @Override // java.util.Deque
        public boolean removeLastOccurrence(@fj.a Object o10) {
            boolean zRemoveLastOccurrence;
            synchronized (this.f117869b) {
                try {
                    zRemoveLastOccurrence = m().removeLastOccurrence(o10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zRemoveLastOccurrence;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.q
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Deque<E> p() {
            return (Deque) super.p();
        }
    }

    @com.google.common.annotations.c
    static final class h<K, V> extends p implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f117845d = 0;

        h(Map.Entry<K, V> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.Map.Entry
        public boolean equals(@fj.a Object obj) {
            boolean zEquals;
            synchronized (this.f117869b) {
                try {
                    zEquals = m().equals(obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zEquals;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            K key;
            synchronized (this.f117869b) {
                try {
                    key = m().getKey();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            V value;
            synchronized (this.f117869b) {
                try {
                    value = m().getValue();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int iHashCode;
            synchronized (this.f117869b) {
                try {
                    iHashCode = m().hashCode();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iHashCode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.p
        public Map.Entry<K, V> m() {
            return (Map.Entry) super.m();
        }

        @Override // java.util.Map.Entry
        public V setValue(V value) {
            V value2;
            synchronized (this.f117869b) {
                value2 = m().setValue(value);
            }
            return value2;
        }
    }

    static class i<E> extends f<E> implements List<E> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f117846e = 0;

        i(List<E> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.List
        public void add(int index, E element) {
            synchronized (this.f117869b) {
                m().add(index, element);
            }
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends E> c10) {
            boolean zAddAll;
            synchronized (this.f117869b) {
                try {
                    zAddAll = m().addAll(index, c10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zAddAll;
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(@fj.a Object o10) {
            boolean zEquals;
            if (o10 == this) {
                return true;
            }
            synchronized (this.f117869b) {
                zEquals = m().equals(o10);
            }
            return zEquals;
        }

        @Override // java.util.List
        public E get(int index) {
            E e10;
            synchronized (this.f117869b) {
                try {
                    e10 = m().get(index);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return e10;
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode;
            synchronized (this.f117869b) {
                iHashCode = m().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.List
        public int indexOf(@fj.a Object o10) {
            int iIndexOf;
            synchronized (this.f117869b) {
                iIndexOf = m().indexOf(o10);
            }
            return iIndexOf;
        }

        @Override // java.util.List
        public int lastIndexOf(@fj.a Object o10) {
            int iLastIndexOf;
            synchronized (this.f117869b) {
                try {
                    iLastIndexOf = m().lastIndexOf(o10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iLastIndexOf;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator() {
            return m().listIterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.f
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public List<E> p() {
            return (List) super.p();
        }

        @Override // java.util.List
        public E remove(int index) {
            E eRemove;
            synchronized (this.f117869b) {
                try {
                    eRemove = m().remove(index);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eRemove;
        }

        @Override // java.util.List
        public E set(int index, E element) {
            E e10;
            synchronized (this.f117869b) {
                e10 = m().set(index, element);
            }
            return e10;
        }

        @Override // java.util.List
        public List<E> subList(int fromIndex, int toIndex) {
            List<E> listJ;
            synchronized (this.f117869b) {
                try {
                    listJ = na.j(m().subList(fromIndex, toIndex), this.f117869b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return listJ;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator(int index) {
            return m().listIterator(index);
        }
    }

    static final class j<K, V> extends l<K, V> implements w7<K, V> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f117847j = 0;

        j(w7<K, V> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.l
        public w7<K, V> m() {
            return (w7) super.m();
        }

        @Override // com.google.common.collect.na.l, com.google.common.collect.k8, com.google.common.collect.y9
        public List<V> c(@fj.a Object key) {
            List<V> listC;
            synchronized (this.f117869b) {
                try {
                    listC = p().c(key);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return listC;
        }

        @Override // com.google.common.collect.na.l, com.google.common.collect.k8, com.google.common.collect.y9
        public List<V> d(K key, Iterable<? extends V> values) {
            List<V> listD;
            synchronized (this.f117869b) {
                try {
                    listD = p().d((Object) key, (Iterable) values);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return listD;
        }

        @Override // com.google.common.collect.na.l, com.google.common.collect.k8, com.google.common.collect.y9
        /* JADX INFO: renamed from: get */
        public List<V> x(K key) {
            List<V> listJ;
            synchronized (this.f117869b) {
                listJ = na.j(p().x((Object) key), this.f117869b);
            }
            return listJ;
        }
    }

    static class k<K, V> extends p implements Map<K, V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f117848g = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.a
        transient Set<K> f117849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @fj.a
        transient Collection<V> f117850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @fj.a
        transient Set<Map.Entry<K, V>> f117851f;

        k(Map<K, V> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.Map
        public void clear() {
            synchronized (this.f117869b) {
                m().clear();
            }
        }

        @Override // java.util.Map
        public boolean containsKey(@fj.a Object key) {
            boolean zContainsKey;
            synchronized (this.f117869b) {
                zContainsKey = m().containsKey(key);
            }
            return zContainsKey;
        }

        public boolean containsValue(@fj.a Object value) {
            boolean zContainsValue;
            synchronized (this.f117869b) {
                zContainsValue = m().containsValue(value);
            }
            return zContainsValue;
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.f117869b) {
                try {
                    if (this.f117851f == null) {
                        this.f117851f = na.u(m().entrySet(), this.f117869b);
                    }
                    set = this.f117851f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public boolean equals(@fj.a Object o10) {
            boolean zEquals;
            if (o10 == this) {
                return true;
            }
            synchronized (this.f117869b) {
                zEquals = m().equals(o10);
            }
            return zEquals;
        }

        @fj.a
        public V get(@fj.a Object key) {
            V v10;
            synchronized (this.f117869b) {
                try {
                    v10 = m().get(key);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return v10;
        }

        @Override // java.util.Map
        public int hashCode() {
            int iHashCode;
            synchronized (this.f117869b) {
                try {
                    iHashCode = m().hashCode();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iHashCode;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f117869b) {
                try {
                    zIsEmpty = m().isEmpty();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zIsEmpty;
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f117869b) {
                try {
                    if (this.f117849d == null) {
                        this.f117849d = na.u(m().keySet(), this.f117869b);
                    }
                    set = this.f117849d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.p
        public Map<K, V> m() {
            return (Map) super.m();
        }

        @Override // java.util.Map
        @fj.a
        public V put(K key, V value) {
            V vPut;
            synchronized (this.f117869b) {
                vPut = m().put(key, value);
            }
            return vPut;
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            synchronized (this.f117869b) {
                try {
                    m().putAll(map);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.Map
        @fj.a
        public V remove(@fj.a Object key) {
            V vRemove;
            synchronized (this.f117869b) {
                vRemove = m().remove(key);
            }
            return vRemove;
        }

        @Override // java.util.Map
        public int size() {
            int size;
            synchronized (this.f117869b) {
                size = m().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f117869b) {
                try {
                    if (this.f117850e == null) {
                        this.f117850e = na.h(m().values(), this.f117869b);
                    }
                    collection = this.f117850e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }
    }

    static class l<K, V> extends p implements k8<K, V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f117852i = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.a
        transient Set<K> f117853d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @fj.a
        transient Collection<V> f117854e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @fj.a
        transient Collection<Map.Entry<K, V>> f117855f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @fj.a
        transient Map<K, Collection<V>> f117856g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @fj.a
        transient q8<K> f117857h;

        l(k8<K, V> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        @Override // com.google.common.collect.k8
        public boolean I0(@fj.a Object key, @fj.a Object value) {
            boolean zI0;
            synchronized (this.f117869b) {
                try {
                    zI0 = m().I0(key, value);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zI0;
        }

        @Override // com.google.common.collect.k8
        public boolean R(k8<? extends K, ? extends V> multimap) {
            boolean zR;
            synchronized (this.f117869b) {
                zR = m().R(multimap);
            }
            return zR;
        }

        public Collection<V> c(@fj.a Object key) {
            Collection<V> collectionC;
            synchronized (this.f117869b) {
                try {
                    collectionC = m().c(key);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collectionC;
        }

        @Override // com.google.common.collect.k8
        public void clear() {
            synchronized (this.f117869b) {
                try {
                    m().clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.collect.k8
        public boolean containsKey(@fj.a Object key) {
            boolean zContainsKey;
            synchronized (this.f117869b) {
                try {
                    zContainsKey = m().containsKey(key);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zContainsKey;
        }

        @Override // com.google.common.collect.k8
        public boolean containsValue(@fj.a Object value) {
            boolean zContainsValue;
            synchronized (this.f117869b) {
                try {
                    zContainsValue = m().containsValue(value);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zContainsValue;
        }

        public Collection<V> d(@b9 K key, Iterable<? extends V> values) {
            Collection<V> collectionD;
            synchronized (this.f117869b) {
                try {
                    collectionD = m().d(key, values);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collectionD;
        }

        @Override // com.google.common.collect.k8, com.google.common.collect.w7
        public boolean equals(@fj.a Object o10) {
            boolean zEquals;
            if (o10 == this) {
                return true;
            }
            synchronized (this.f117869b) {
                try {
                    zEquals = m().equals(o10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zEquals;
        }

        /* JADX INFO: renamed from: get */
        public Collection<V> x(@b9 K key) {
            Collection<V> collectionA;
            synchronized (this.f117869b) {
                try {
                    collectionA = na.A(m().x(key), this.f117869b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collectionA;
        }

        @Override // com.google.common.collect.k8
        public int hashCode() {
            int iHashCode;
            synchronized (this.f117869b) {
                try {
                    iHashCode = m().hashCode();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.k8
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f117869b) {
                zIsEmpty = m().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // com.google.common.collect.k8, com.google.common.collect.y9
        /* JADX INFO: renamed from: k */
        public Collection<Map.Entry<K, V>> u() {
            Collection<Map.Entry<K, V>> collection;
            synchronized (this.f117869b) {
                try {
                    if (this.f117855f == null) {
                        this.f117855f = na.A(m().u(), this.f117869b);
                    }
                    collection = this.f117855f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }

        @Override // com.google.common.collect.k8
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f117869b) {
                try {
                    if (this.f117853d == null) {
                        this.f117853d = na.B(m().keySet(), this.f117869b);
                    }
                    set = this.f117853d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.k8
        public q8<K> keys() {
            q8<K> q8Var;
            synchronized (this.f117869b) {
                try {
                    if (this.f117857h == null) {
                        this.f117857h = na.n(m().keys(), this.f117869b);
                    }
                    q8Var = this.f117857h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return q8Var;
        }

        @Override // com.google.common.collect.k8, com.google.common.collect.w7
        public Map<K, Collection<V>> l() {
            Map<K, Collection<V>> map;
            synchronized (this.f117869b) {
                try {
                    if (this.f117856g == null) {
                        this.f117856g = new b(m().l(), this.f117869b);
                    }
                    map = this.f117856g;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return map;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.p
        public k8<K, V> m() {
            return (k8) super.m();
        }

        @Override // com.google.common.collect.k8
        public boolean put(@b9 K key, @b9 V value) {
            boolean zPut;
            synchronized (this.f117869b) {
                zPut = m().put(key, value);
            }
            return zPut;
        }

        @Override // com.google.common.collect.k8
        public boolean remove(@fj.a Object key, @fj.a Object value) {
            boolean zRemove;
            synchronized (this.f117869b) {
                try {
                    zRemove = m().remove(key, value);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zRemove;
        }

        @Override // com.google.common.collect.k8
        public int size() {
            int size;
            synchronized (this.f117869b) {
                size = m().size();
            }
            return size;
        }

        @Override // com.google.common.collect.k8
        public boolean v(@b9 K key, Iterable<? extends V> values) {
            boolean zV;
            synchronized (this.f117869b) {
                try {
                    zV = m().v(key, values);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zV;
        }

        @Override // com.google.common.collect.k8
        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f117869b) {
                try {
                    if (this.f117854e == null) {
                        this.f117854e = na.h(m().values(), this.f117869b);
                    }
                    collection = this.f117854e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }
    }

    static final class m<E> extends f<E> implements q8<E> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f117858g = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @fj.a
        transient Set<E> f117859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @fj.a
        transient Set<q8.a<E>> f117860f;

        m(q8<E> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        @Override // com.google.common.collect.q8
        public int H(@b9 E e10, int n10) {
            int iH;
            synchronized (this.f117869b) {
                iH = m().H(e10, n10);
            }
            return iH;
        }

        @Override // com.google.common.collect.q8
        public int P3(@fj.a Object o10) {
            int iP3;
            synchronized (this.f117869b) {
                try {
                    iP3 = m().P3(o10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iP3;
        }

        @Override // com.google.common.collect.q8
        public boolean Q2(@b9 E element, int oldCount, int newCount) {
            boolean zQ2;
            synchronized (this.f117869b) {
                zQ2 = m().Q2(element, oldCount, newCount);
            }
            return zQ2;
        }

        @Override // com.google.common.collect.q8
        public Set<q8.a<E>> entrySet() {
            Set<q8.a<E>> set;
            synchronized (this.f117869b) {
                try {
                    if (this.f117860f == null) {
                        this.f117860f = na.B(m().entrySet(), this.f117869b);
                    }
                    set = this.f117860f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // java.util.Collection, com.google.common.collect.q8
        public boolean equals(@fj.a Object o10) {
            boolean zEquals;
            if (o10 == this) {
                return true;
            }
            synchronized (this.f117869b) {
                zEquals = m().equals(o10);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.q8
        public int f0(@fj.a Object o10, int n10) {
            int iF0;
            synchronized (this.f117869b) {
                try {
                    iF0 = m().f0(o10, n10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iF0;
        }

        @Override // com.google.common.collect.q8
        public int g1(@b9 E element, int count) {
            int iG1;
            synchronized (this.f117869b) {
                try {
                    iG1 = m().g1(element, count);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iG1;
        }

        @Override // java.util.Collection, com.google.common.collect.q8
        public int hashCode() {
            int iHashCode;
            synchronized (this.f117869b) {
                try {
                    iHashCode = m().hashCode();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.q8
        public Set<E> o() {
            Set<E> set;
            synchronized (this.f117869b) {
                try {
                    if (this.f117859e == null) {
                        this.f117859e = na.B(m().o(), this.f117869b);
                    }
                    set = this.f117859e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.f
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public q8<E> p() {
            return (q8) super.p();
        }
    }

    static class p implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private static final long f117867c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f117868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f117869b;

        p(Object delegate, @fj.a Object mutex) {
            this.f117868a = com.google.common.base.j0.E(delegate);
            this.f117869b = mutex == null ? this : mutex;
        }

        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private void writeObject(ObjectOutputStream stream) throws IOException {
            synchronized (this.f117869b) {
                try {
                    stream.defaultWriteObject();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: i */
        Object m() {
            return this.f117868a;
        }

        public String toString() {
            String string;
            synchronized (this.f117869b) {
                string = this.f117868a.toString();
            }
            return string;
        }
    }

    static class q<E> extends f<E> implements Queue<E> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f117870e = 0;

        q(Queue<E> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.Queue
        public E element() {
            E eElement;
            synchronized (this.f117869b) {
                try {
                    eElement = p().element();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eElement;
        }

        @Override // java.util.Queue
        public boolean offer(E e10) {
            boolean zOffer;
            synchronized (this.f117869b) {
                try {
                    zOffer = p().offer(e10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zOffer;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.f
        public Queue<E> p() {
            return (Queue) super.p();
        }

        @Override // java.util.Queue
        @fj.a
        public E peek() {
            E ePeek;
            synchronized (this.f117869b) {
                try {
                    ePeek = p().peek();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return ePeek;
        }

        @Override // java.util.Queue
        @fj.a
        public E poll() {
            E ePoll;
            synchronized (this.f117869b) {
                try {
                    ePoll = p().poll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return ePoll;
        }

        @Override // java.util.Queue
        public E remove() {
            E eRemove;
            synchronized (this.f117869b) {
                try {
                    eRemove = p().remove();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eRemove;
        }
    }

    static final class r<E> extends i<E> implements RandomAccess {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f117871f = 0;

        r(List<E> list, @fj.a Object mutex) {
            super(list, mutex);
        }
    }

    static class s<E> extends f<E> implements Set<E> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f117872e = 0;

        s(Set<E> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        public boolean equals(@fj.a Object o10) {
            boolean zEquals;
            if (o10 == this) {
                return true;
            }
            synchronized (this.f117869b) {
                zEquals = p().equals(o10);
            }
            return zEquals;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int iHashCode;
            synchronized (this.f117869b) {
                try {
                    iHashCode = p().hashCode();
                } finally {
                }
            }
            return iHashCode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.f
        public Set<E> p() {
            return (Set) super.p();
        }
    }

    static class t<K, V> extends l<K, V> implements y9<K, V> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f117873k = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @fj.a
        transient Set<Map.Entry<K, V>> f117874j;

        t(y9<K, V> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.l
        public y9<K, V> m() {
            return (y9) super.m();
        }

        @Override // com.google.common.collect.na.l, com.google.common.collect.k8, com.google.common.collect.y9
        public Set<V> c(@fj.a Object key) {
            Set<V> setC;
            synchronized (this.f117869b) {
                try {
                    setC = p().c(key);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return setC;
        }

        @Override // com.google.common.collect.na.l, com.google.common.collect.k8, com.google.common.collect.y9
        public Set<V> d(K key, Iterable<? extends V> values) {
            Set<V> setD;
            synchronized (this.f117869b) {
                setD = p().d((Object) key, (Iterable) values);
            }
            return setD;
        }

        @Override // com.google.common.collect.na.l, com.google.common.collect.k8, com.google.common.collect.y9
        /* JADX INFO: renamed from: get */
        public Set<V> x(K key) {
            Set<V> setU;
            synchronized (this.f117869b) {
                setU = na.u(p().x((Object) key), this.f117869b);
            }
            return setU;
        }

        @Override // com.google.common.collect.na.l, com.google.common.collect.k8, com.google.common.collect.y9
        /* JADX INFO: renamed from: k */
        public Set<Map.Entry<K, V>> u() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.f117869b) {
                try {
                    if (this.f117874j == null) {
                        this.f117874j = na.u(p().u(), this.f117869b);
                    }
                    set = this.f117874j;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }
    }

    static class u<K, V> extends k<K, V> implements SortedMap<K, V> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f117875h = 0;

        u(SortedMap<K, V> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.SortedMap
        @fj.a
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator;
            synchronized (this.f117869b) {
                try {
                    comparator = m().comparator();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return comparator;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            K kFirstKey;
            synchronized (this.f117869b) {
                kFirstKey = m().firstKey();
            }
            return kFirstKey;
        }

        public SortedMap<K, V> headMap(K toKey) {
            SortedMap<K, V> sortedMapW;
            synchronized (this.f117869b) {
                sortedMapW = na.w(m().headMap(toKey), this.f117869b);
            }
            return sortedMapW;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            K kLastKey;
            synchronized (this.f117869b) {
                try {
                    kLastKey = m().lastKey();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return kLastKey;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.k
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public SortedMap<K, V> m() {
            return (SortedMap) super.m();
        }

        public SortedMap<K, V> subMap(K fromKey, K toKey) {
            SortedMap<K, V> sortedMapW;
            synchronized (this.f117869b) {
                try {
                    sortedMapW = na.w(m().subMap(fromKey, toKey), this.f117869b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return sortedMapW;
        }

        public SortedMap<K, V> tailMap(K fromKey) {
            SortedMap<K, V> sortedMapW;
            synchronized (this.f117869b) {
                sortedMapW = na.w(m().tailMap(fromKey), this.f117869b);
            }
            return sortedMapW;
        }
    }

    static class v<E> extends s<E> implements SortedSet<E> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f117876f = 0;

        v(SortedSet<E> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.SortedSet
        @fj.a
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator;
            synchronized (this.f117869b) {
                try {
                    comparator = m().comparator();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return comparator;
        }

        @Override // java.util.SortedSet
        public E first() {
            E eFirst;
            synchronized (this.f117869b) {
                try {
                    eFirst = m().first();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eFirst;
        }

        public SortedSet<E> headSet(E toElement) {
            SortedSet<E> sortedSetX;
            synchronized (this.f117869b) {
                try {
                    sortedSetX = na.x(m().headSet(toElement), this.f117869b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return sortedSetX;
        }

        @Override // java.util.SortedSet
        public E last() {
            E eLast;
            synchronized (this.f117869b) {
                eLast = m().last();
            }
            return eLast;
        }

        public SortedSet<E> subSet(E fromElement, E toElement) {
            SortedSet<E> sortedSetX;
            synchronized (this.f117869b) {
                sortedSetX = na.x(m().subSet(fromElement, toElement), this.f117869b);
            }
            return sortedSetX;
        }

        public SortedSet<E> tailSet(E fromElement) {
            SortedSet<E> sortedSetX;
            synchronized (this.f117869b) {
                sortedSetX = na.x(m().tailSet(fromElement), this.f117869b);
            }
            return sortedSetX;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.s
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SortedSet<E> p() {
            return (SortedSet) super.p();
        }
    }

    static final class x<R, C, V> extends p implements oa<R, C, V> {

        class a implements com.google.common.base.t<Map<C, V>, Map<C, V>> {
            a() {
            }

            @Override // com.google.common.base.t
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<C, V> apply(Map<C, V> t10) {
                return na.l(t10, x.this.f117869b);
            }
        }

        class b implements com.google.common.base.t<Map<R, V>, Map<R, V>> {
            b() {
            }

            @Override // com.google.common.base.t
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<R, V> apply(Map<R, V> t10) {
                return na.l(t10, x.this.f117869b);
            }
        }

        x(oa<R, C, V> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        @Override // com.google.common.collect.oa
        public void A0(oa<? extends R, ? extends C, ? extends V> table) {
            synchronized (this.f117869b) {
                m().A0(table);
            }
        }

        @Override // com.google.common.collect.oa
        public Set<oa.a<R, C, V>> D0() {
            Set<oa.a<R, C, V>> setU;
            synchronized (this.f117869b) {
                setU = na.u(m().D0(), this.f117869b);
            }
            return setU;
        }

        @Override // com.google.common.collect.oa
        public Set<C> E0() {
            Set<C> setU;
            synchronized (this.f117869b) {
                setU = na.u(m().E0(), this.f117869b);
            }
            return setU;
        }

        @Override // com.google.common.collect.oa
        public boolean F0(@fj.a Object rowKey) {
            boolean zF0;
            synchronized (this.f117869b) {
                try {
                    zF0 = m().F0(rowKey);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zF0;
        }

        @Override // com.google.common.collect.oa
        public Map<C, V> J0(@b9 R rowKey) {
            Map<C, V> mapL;
            synchronized (this.f117869b) {
                mapL = na.l(m().J0(rowKey), this.f117869b);
            }
            return mapL;
        }

        @Override // com.google.common.collect.oa
        public boolean M(@fj.a Object columnKey) {
            boolean zM;
            synchronized (this.f117869b) {
                zM = m().M(columnKey);
            }
            return zM;
        }

        @Override // com.google.common.collect.oa
        public Map<C, Map<R, V>> a0() {
            Map<C, Map<R, V>> mapL;
            synchronized (this.f117869b) {
                mapL = na.l(b8.D0(m().a0(), new b()), this.f117869b);
            }
            return mapL;
        }

        @Override // com.google.common.collect.oa
        public Map<R, V> c0(@b9 C columnKey) {
            Map<R, V> mapL;
            synchronized (this.f117869b) {
                mapL = na.l(m().c0(columnKey), this.f117869b);
            }
            return mapL;
        }

        @Override // com.google.common.collect.oa
        public void clear() {
            synchronized (this.f117869b) {
                m().clear();
            }
        }

        @Override // com.google.common.collect.oa
        public boolean containsValue(@fj.a Object value) {
            boolean zContainsValue;
            synchronized (this.f117869b) {
                zContainsValue = m().containsValue(value);
            }
            return zContainsValue;
        }

        @Override // com.google.common.collect.oa
        @fj.a
        public V e0(@b9 R rowKey, @b9 C columnKey, @b9 V value) {
            V vE0;
            synchronized (this.f117869b) {
                try {
                    vE0 = m().e0(rowKey, columnKey, value);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return vE0;
        }

        @Override // com.google.common.collect.oa
        public boolean equals(@fj.a Object obj) {
            boolean zEquals;
            if (this == obj) {
                return true;
            }
            synchronized (this.f117869b) {
                try {
                    zEquals = m().equals(obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zEquals;
        }

        @Override // com.google.common.collect.oa
        public int hashCode() {
            int iHashCode;
            synchronized (this.f117869b) {
                try {
                    iHashCode = m().hashCode();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.oa
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f117869b) {
                try {
                    zIsEmpty = m().isEmpty();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zIsEmpty;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.p
        public oa<R, C, V> m() {
            return (oa) super.m();
        }

        @Override // com.google.common.collect.oa
        public boolean n0(@fj.a Object rowKey, @fj.a Object columnKey) {
            boolean zN0;
            synchronized (this.f117869b) {
                try {
                    zN0 = m().n0(rowKey, columnKey);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zN0;
        }

        @Override // com.google.common.collect.oa
        @fj.a
        public V remove(@fj.a Object rowKey, @fj.a Object columnKey) {
            V vRemove;
            synchronized (this.f117869b) {
                vRemove = m().remove(rowKey, columnKey);
            }
            return vRemove;
        }

        @Override // com.google.common.collect.oa
        public Map<R, Map<C, V>> s() {
            Map<R, Map<C, V>> mapL;
            synchronized (this.f117869b) {
                try {
                    mapL = na.l(b8.D0(m().s(), new a()), this.f117869b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return mapL;
        }

        @Override // com.google.common.collect.oa
        public int size() {
            int size;
            synchronized (this.f117869b) {
                size = m().size();
            }
            return size;
        }

        @Override // com.google.common.collect.oa
        public Set<R> t() {
            Set<R> setU;
            synchronized (this.f117869b) {
                try {
                    setU = na.u(m().t(), this.f117869b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return setU;
        }

        @Override // com.google.common.collect.oa
        public Collection<V> values() {
            Collection<V> collectionH;
            synchronized (this.f117869b) {
                collectionH = na.h(m().values(), this.f117869b);
            }
            return collectionH;
        }

        @Override // com.google.common.collect.oa
        @fj.a
        public V w(@fj.a Object rowKey, @fj.a Object columnKey) {
            V vW;
            synchronized (this.f117869b) {
                vW = m().w(rowKey, columnKey);
            }
            return vW;
        }
    }

    private na() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Collection<E> A(Collection<E> collection, @fj.a Object mutex) {
        if (collection instanceof SortedSet) {
            return x((SortedSet) collection, mutex);
        }
        if (collection instanceof Set) {
            return u((Set) collection, mutex);
        }
        return collection instanceof List ? j((List) collection, mutex) : h(collection, mutex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Set<E> B(Set<E> set, @fj.a Object mutex) {
        return set instanceof SortedSet ? x((SortedSet) set, mutex) : u(set, mutex);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> com.google.common.collect.w<K, V> g(com.google.common.collect.w<K, V> wVar, @fj.a Object obj) {
        return ((wVar instanceof e) || (wVar instanceof f6)) ? wVar : new e(wVar, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Collection<E> h(Collection<E> collection, @fj.a Object mutex) {
        return new f(collection, mutex);
    }

    static <E> Deque<E> i(Deque<E> deque, @fj.a Object mutex) {
        return new g(deque, mutex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> List<E> j(List<E> list, @fj.a Object mutex) {
        return list instanceof RandomAccess ? new r(list, mutex) : new i(list, mutex);
    }

    static <K, V> w7<K, V> k(w7<K, V> multimap, @fj.a Object mutex) {
        return ((multimap instanceof j) || (multimap instanceof com.google.common.collect.v)) ? multimap : new j(multimap, mutex);
    }

    @com.google.common.annotations.e
    static <K, V> Map<K, V> l(Map<K, V> map, @fj.a Object mutex) {
        return new k(map, mutex);
    }

    static <K, V> k8<K, V> m(k8<K, V> multimap, @fj.a Object mutex) {
        return ((multimap instanceof l) || (multimap instanceof com.google.common.collect.v)) ? multimap : new l(multimap, mutex);
    }

    static <E> q8<E> n(q8<E> multiset, @fj.a Object mutex) {
        if (!(multiset instanceof m) && !(multiset instanceof t6)) {
            return new m(multiset, mutex);
        }
        return multiset;
    }

    @com.google.common.annotations.c
    static <K, V> NavigableMap<K, V> o(NavigableMap<K, V> navigableMap) {
        return p(navigableMap, null);
    }

    @com.google.common.annotations.c
    static <K, V> NavigableMap<K, V> p(NavigableMap<K, V> navigableMap, @fj.a Object mutex) {
        return new n(navigableMap, mutex);
    }

    @com.google.common.annotations.c
    static <E> NavigableSet<E> q(NavigableSet<E> navigableSet) {
        return r(navigableSet, null);
    }

    @com.google.common.annotations.c
    static <E> NavigableSet<E> r(NavigableSet<E> navigableSet, @fj.a Object mutex) {
        return new o(navigableSet, mutex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @com.google.common.annotations.c
    @fj.a
    public static <K, V> Map.Entry<K, V> s(@fj.a Map.Entry<K, V> entry, @fj.a Object mutex) {
        if (entry == null) {
            return null;
        }
        return new h(entry, mutex);
    }

    static <E> Queue<E> t(Queue<E> queue, @fj.a Object mutex) {
        return queue instanceof q ? queue : new q(queue, mutex);
    }

    @com.google.common.annotations.e
    static <E> Set<E> u(Set<E> set, @fj.a Object mutex) {
        return new s(set, mutex);
    }

    static <K, V> y9<K, V> v(y9<K, V> multimap, @fj.a Object mutex) {
        return ((multimap instanceof t) || (multimap instanceof com.google.common.collect.v)) ? multimap : new t(multimap, mutex);
    }

    static <K, V> SortedMap<K, V> w(SortedMap<K, V> sortedMap, @fj.a Object mutex) {
        return new u(sortedMap, mutex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> SortedSet<E> x(SortedSet<E> set, @fj.a Object mutex) {
        return new v(set, mutex);
    }

    static <K, V> ja<K, V> y(ja<K, V> multimap, @fj.a Object mutex) {
        return multimap instanceof w ? multimap : new w(multimap, mutex);
    }

    static <R, C, V> oa<R, C, V> z(oa<R, C, V> table, @fj.a Object mutex) {
        return new x(table, mutex);
    }

    static final class w<K, V> extends t<K, V> implements ja<K, V> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f117877l = 0;

        w(ja<K, V> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        @Override // com.google.common.collect.ja
        @fj.a
        public Comparator<? super V> Y() {
            Comparator<? super V> comparatorY;
            synchronized (this.f117869b) {
                comparatorY = p().Y();
            }
            return comparatorY;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.t
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public ja<K, V> p() {
            return (ja) super.p();
        }

        @Override // com.google.common.collect.na.t, com.google.common.collect.na.l, com.google.common.collect.k8, com.google.common.collect.y9
        public SortedSet<V> c(@fj.a Object key) {
            SortedSet<V> sortedSetC;
            synchronized (this.f117869b) {
                sortedSetC = p().c(key);
            }
            return sortedSetC;
        }

        @Override // com.google.common.collect.na.t, com.google.common.collect.na.l, com.google.common.collect.k8, com.google.common.collect.y9
        public SortedSet<V> d(K key, Iterable<? extends V> values) {
            SortedSet<V> sortedSetD;
            synchronized (this.f117869b) {
                try {
                    sortedSetD = p().d((Object) key, (Iterable) values);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return sortedSetD;
        }

        @Override // com.google.common.collect.na.t, com.google.common.collect.na.l, com.google.common.collect.k8, com.google.common.collect.y9
        /* JADX INFO: renamed from: get */
        public SortedSet<V> x(K key) {
            SortedSet<V> sortedSetX;
            synchronized (this.f117869b) {
                sortedSetX = na.x(p().x((Object) key), this.f117869b);
            }
            return sortedSetX;
        }
    }

    static final class c<K, V> extends s<Map.Entry<K, Collection<V>>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f117834f = 0;

        class a extends eb<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.na$c$a$a, reason: collision with other inner class name */
            class C1074a extends h5<K, Collection<V>> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Map.Entry f117836a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ a f117837b;

                C1074a(final a this$1, final Map.Entry val$entry) {
                    this.f117836a = val$entry;
                    this.f117837b = this$1;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.h5, com.google.common.collect.m5
                /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, Collection<V>> i1() {
                    return this.f117836a;
                }

                @Override // com.google.common.collect.h5, java.util.Map.Entry
                /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
                public Collection<V> getValue() {
                    return na.A((Collection) this.f117836a.getValue(), c.this.f117869b);
                }
            }

            a(Iterator backingIterator) {
                super(backingIterator);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.eb
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> b(final Map.Entry<K, Collection<V>> entry) {
                return new C1074a(this, entry);
            }
        }

        c(Set<Map.Entry<K, Collection<V>>> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        @Override // com.google.common.collect.na.f, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            boolean zP;
            synchronized (this.f117869b) {
                try {
                    zP = b8.p(p(), o10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zP;
        }

        @Override // com.google.common.collect.na.f, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> c10) {
            boolean zB;
            synchronized (this.f117869b) {
                zB = b3.b(p(), c10);
            }
            return zB;
        }

        @Override // com.google.common.collect.na.s, java.util.Collection, java.util.Set
        public boolean equals(@fj.a Object o10) {
            boolean zG;
            if (o10 == this) {
                return true;
            }
            synchronized (this.f117869b) {
                try {
                    zG = z9.g(p(), o10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zG;
        }

        @Override // com.google.common.collect.na.f, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            return new a(super.iterator());
        }

        @Override // com.google.common.collect.na.f, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object o10) {
            boolean zK0;
            synchronized (this.f117869b) {
                try {
                    zK0 = b8.k0(p(), o10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zK0;
        }

        @Override // com.google.common.collect.na.f, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c10) {
            boolean zU;
            synchronized (this.f117869b) {
                try {
                    zU = p7.U(p().iterator(), c10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zU;
        }

        @Override // com.google.common.collect.na.f, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> c10) {
            boolean zW;
            synchronized (this.f117869b) {
                zW = p7.W(p().iterator(), c10);
            }
            return zW;
        }

        @Override // com.google.common.collect.na.f, java.util.Collection, java.util.Set
        public Object[] toArray() {
            Object[] objArrL;
            synchronized (this.f117869b) {
                objArrL = x8.l(p());
            }
            return objArrL;
        }

        @Override // com.google.common.collect.na.f, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f117869b) {
                try {
                    tArr2 = (T[]) x8.m(p(), tArr);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return tArr2;
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.e
    static final class n<K, V> extends u<K, V> implements NavigableMap<K, V> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f117861l = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @fj.a
        transient NavigableSet<K> f117862i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @fj.a
        transient NavigableMap<K, V> f117863j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @fj.a
        transient NavigableSet<K> f117864k;

        n(NavigableMap<K, V> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> ceilingEntry(K key) {
            Map.Entry<K, V> entryS;
            synchronized (this.f117869b) {
                try {
                    entryS = na.s(p().ceilingEntry(key), this.f117869b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K ceilingKey(K key) {
            K kCeilingKey;
            synchronized (this.f117869b) {
                try {
                    kCeilingKey = p().ceilingKey(key);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return kCeilingKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            synchronized (this.f117869b) {
                try {
                    NavigableSet<K> navigableSet = this.f117862i;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<K> navigableSetR = na.r(p().descendingKeySet(), this.f117869b);
                    this.f117862i = navigableSetR;
                    return navigableSetR;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            synchronized (this.f117869b) {
                try {
                    NavigableMap<K, V> navigableMap = this.f117863j;
                    if (navigableMap != null) {
                        return navigableMap;
                    }
                    NavigableMap<K, V> navigableMapP = na.p(p().descendingMap(), this.f117869b);
                    this.f117863j = navigableMapP;
                    return navigableMapP;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> firstEntry() {
            Map.Entry<K, V> entryS;
            synchronized (this.f117869b) {
                try {
                    entryS = na.s(p().firstEntry(), this.f117869b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> floorEntry(K key) {
            Map.Entry<K, V> entryS;
            synchronized (this.f117869b) {
                try {
                    entryS = na.s(p().floorEntry(key), this.f117869b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K floorKey(K key) {
            K kFloorKey;
            synchronized (this.f117869b) {
                try {
                    kFloorKey = p().floorKey(key);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return kFloorKey;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K toKey, boolean inclusive) {
            NavigableMap<K, V> navigableMapP;
            synchronized (this.f117869b) {
                navigableMapP = na.p(p().headMap(toKey, inclusive), this.f117869b);
            }
            return navigableMapP;
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> higherEntry(K key) {
            Map.Entry<K, V> entryS;
            synchronized (this.f117869b) {
                entryS = na.s(p().higherEntry(key), this.f117869b);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K higherKey(K key) {
            K kHigherKey;
            synchronized (this.f117869b) {
                try {
                    kHigherKey = p().higherKey(key);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return kHigherKey;
        }

        @Override // com.google.common.collect.na.k, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> lastEntry() {
            Map.Entry<K, V> entryS;
            synchronized (this.f117869b) {
                try {
                    entryS = na.s(p().lastEntry(), this.f117869b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> lowerEntry(K key) {
            Map.Entry<K, V> entryS;
            synchronized (this.f117869b) {
                entryS = na.s(p().lowerEntry(key), this.f117869b);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K lowerKey(K key) {
            K kLowerKey;
            synchronized (this.f117869b) {
                try {
                    kLowerKey = p().lowerKey(key);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return kLowerKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            synchronized (this.f117869b) {
                try {
                    NavigableSet<K> navigableSet = this.f117864k;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<K> navigableSetR = na.r(p().navigableKeySet(), this.f117869b);
                    this.f117864k = navigableSetR;
                    return navigableSetR;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> pollFirstEntry() {
            Map.Entry<K, V> entryS;
            synchronized (this.f117869b) {
                entryS = na.s(p().pollFirstEntry(), this.f117869b);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> pollLastEntry() {
            Map.Entry<K, V> entryS;
            synchronized (this.f117869b) {
                try {
                    entryS = na.s(p().pollLastEntry(), this.f117869b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) {
            NavigableMap<K, V> navigableMapP;
            synchronized (this.f117869b) {
                navigableMapP = na.p(p().subMap(fromKey, fromInclusive, toKey, toInclusive), this.f117869b);
            }
            return navigableMapP;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K fromKey, boolean inclusive) {
            NavigableMap<K, V> navigableMapP;
            synchronized (this.f117869b) {
                try {
                    navigableMapP = na.p(p().tailMap(fromKey, inclusive), this.f117869b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return navigableMapP;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.u
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> m() {
            return (NavigableMap) super.m();
        }

        @Override // com.google.common.collect.na.u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(K toKey) {
            return headMap(toKey, false);
        }

        @Override // com.google.common.collect.na.u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(K fromKey, K toKey) {
            return subMap(fromKey, true, toKey, false);
        }

        @Override // com.google.common.collect.na.u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(K fromKey) {
            return tailMap(fromKey, true);
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.e
    static final class o<E> extends v<E> implements NavigableSet<E> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f117865h = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @fj.a
        transient NavigableSet<E> f117866g;

        o(NavigableSet<E> delegate, @fj.a Object mutex) {
            super(delegate, mutex);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.na.v
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<E> m() {
            return (NavigableSet) super.m();
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E ceiling(E e10) {
            E eCeiling;
            synchronized (this.f117869b) {
                try {
                    eCeiling = m().ceiling(e10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eCeiling;
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return m().descendingIterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            synchronized (this.f117869b) {
                try {
                    NavigableSet<E> navigableSet = this.f117866g;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<E> navigableSetR = na.r(m().descendingSet(), this.f117869b);
                    this.f117866g = navigableSetR;
                    return navigableSetR;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E floor(E e10) {
            E eFloor;
            synchronized (this.f117869b) {
                try {
                    eFloor = m().floor(e10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eFloor;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E toElement, boolean inclusive) {
            NavigableSet<E> navigableSetR;
            synchronized (this.f117869b) {
                try {
                    navigableSetR = na.r(m().headSet(toElement, inclusive), this.f117869b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return navigableSetR;
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E higher(E e10) {
            E eHigher;
            synchronized (this.f117869b) {
                eHigher = m().higher(e10);
            }
            return eHigher;
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E lower(E e10) {
            E eLower;
            synchronized (this.f117869b) {
                try {
                    eLower = m().lower(e10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eLower;
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E pollFirst() {
            E ePollFirst;
            synchronized (this.f117869b) {
                ePollFirst = m().pollFirst();
            }
            return ePollFirst;
        }

        @Override // java.util.NavigableSet
        @fj.a
        public E pollLast() {
            E ePollLast;
            synchronized (this.f117869b) {
                ePollLast = m().pollLast();
            }
            return ePollLast;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
            NavigableSet<E> navigableSetR;
            synchronized (this.f117869b) {
                try {
                    navigableSetR = na.r(m().subSet(fromElement, fromInclusive, toElement, toInclusive), this.f117869b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return navigableSetR;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
            NavigableSet<E> navigableSetR;
            synchronized (this.f117869b) {
                navigableSetR = na.r(m().tailSet(fromElement, inclusive), this.f117869b);
            }
            return navigableSetR;
        }

        @Override // com.google.common.collect.na.v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(E toElement) {
            return headSet(toElement, false);
        }

        @Override // com.google.common.collect.na.v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(E fromElement) {
            return tailSet(fromElement, true);
        }

        @Override // com.google.common.collect.na.v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(E fromElement, E toElement) {
            return subSet(fromElement, true, toElement, false);
        }
    }
}
