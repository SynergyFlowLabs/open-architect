package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
abstract class q<R, C, V> implements oa<R, C, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Set<oa.a<R, C, V>> f117968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Collection<V> f117969b;

    class a extends eb<oa.a<R, C, V>, V> {
        a(Iterator backingIterator) {
            super(backingIterator);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.eb
        @b9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public V b(oa.a<R, C, V> cell) {
            return cell.getValue();
        }
    }

    class b extends AbstractSet<oa.a<R, C, V>> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            q.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            if (o10 instanceof oa.a) {
                oa.a aVar = (oa.a) o10;
                Map map = (Map) b8.p0(q.this.s(), aVar.b());
                if (map != null && b3.j(map.entrySet(), b8.O(aVar.a(), aVar.getValue()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<oa.a<R, C, V>> iterator() {
            return q.this.a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object o10) {
            if (o10 instanceof oa.a) {
                oa.a aVar = (oa.a) o10;
                Map map = (Map) b8.p0(q.this.s(), aVar.b());
                if (map != null && b3.k(map.entrySet(), b8.O(aVar.a(), aVar.getValue()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return q.this.size();
        }
    }

    class c extends AbstractCollection<V> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            q.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@fj.a Object o10) {
            return q.this.containsValue(o10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return q.this.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return q.this.size();
        }
    }

    q() {
    }

    @Override // com.google.common.collect.oa
    public void A0(oa<? extends R, ? extends C, ? extends V> table) {
        for (oa.a<? extends R, ? extends C, ? extends V> aVar : table.D0()) {
            e0(aVar.b(), aVar.a(), aVar.getValue());
        }
    }

    @Override // com.google.common.collect.oa
    public Set<oa.a<R, C, V>> D0() {
        Set<oa.a<R, C, V>> set = this.f117968a;
        if (set != null) {
            return set;
        }
        Set<oa.a<R, C, V>> setB = b();
        this.f117968a = setB;
        return setB;
    }

    @Override // com.google.common.collect.oa
    public Set<C> E0() {
        return a0().keySet();
    }

    @Override // com.google.common.collect.oa
    public boolean F0(@fj.a Object rowKey) {
        return b8.o0(s(), rowKey);
    }

    @Override // com.google.common.collect.oa
    public boolean M(@fj.a Object columnKey) {
        return b8.o0(a0(), columnKey);
    }

    abstract Iterator<oa.a<R, C, V>> a();

    Set<oa.a<R, C, V>> b() {
        return new b();
    }

    Collection<V> c() {
        return new c();
    }

    @Override // com.google.common.collect.oa
    public void clear() {
        p7.g(D0().iterator());
    }

    @Override // com.google.common.collect.oa
    public boolean containsValue(@fj.a Object value) {
        Iterator<Map<C, V>> it = s().values().iterator();
        while (it.hasNext()) {
            if (it.next().containsValue(value)) {
                return true;
            }
        }
        return false;
    }

    Iterator<V> d() {
        return new a(D0().iterator());
    }

    @Override // com.google.common.collect.oa
    @z7.a
    @fj.a
    public V e0(@b9 R rowKey, @b9 C columnKey, @b9 V value) {
        return J0(rowKey).put(columnKey, value);
    }

    @Override // com.google.common.collect.oa
    public boolean equals(@fj.a Object obj) {
        return bb.c(this, obj);
    }

    @Override // com.google.common.collect.oa
    public int hashCode() {
        return D0().hashCode();
    }

    @Override // com.google.common.collect.oa
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.oa
    public boolean n0(@fj.a Object rowKey, @fj.a Object columnKey) {
        Map map = (Map) b8.p0(s(), rowKey);
        return map != null && b8.o0(map, columnKey);
    }

    @Override // com.google.common.collect.oa
    @z7.a
    @fj.a
    public V remove(@fj.a Object obj, @fj.a Object obj2) {
        Map map = (Map) b8.p0(s(), obj);
        if (map == null) {
            return null;
        }
        return (V) b8.q0(map, obj2);
    }

    @Override // com.google.common.collect.oa
    public Set<R> t() {
        return s().keySet();
    }

    public String toString() {
        return s().toString();
    }

    @Override // com.google.common.collect.oa
    public Collection<V> values() {
        Collection<V> collectionC = this.f117969b;
        if (collectionC == null) {
            collectionC = c();
            this.f117969b = collectionC;
        }
        return collectionC;
    }

    @Override // com.google.common.collect.oa
    @fj.a
    public V w(@fj.a Object obj, @fj.a Object obj2) {
        Map map = (Map) b8.p0(s(), obj);
        if (map == null) {
            return null;
        }
        return (V) b8.p0(map, obj2);
    }
}
