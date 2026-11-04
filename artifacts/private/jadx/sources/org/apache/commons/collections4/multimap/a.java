package org.apache.commons.collections4.multimap;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.apache.commons.collections4.y;
import org.apache.commons.collections4.z;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a<K, V> extends org.apache.commons.collections4.multimap.b<K, V> implements z<K, V> {

    private class b extends org.apache.commons.collections4.multimap.b<K, V>.i implements List<V> {
        public b(K k10) {
            super(k10);
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            List<V> listC = c();
            if (listC == null) {
                listC = a.this.d();
                a.this.g().put(this.f336182a, listC);
            }
            listC.add(i10, v10);
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            List<V> listC = c();
            if (listC != null) {
                return listC.addAll(i10, collection);
            }
            List<V> listD = a.this.d();
            boolean zAddAll = listD.addAll(i10, collection);
            if (zAddAll) {
                a.this.g().put(this.f336182a, listD);
            }
            return zAddAll;
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            List<V> listC = c();
            if (listC == null) {
                return Collections.EMPTY_LIST.equals(obj);
            }
            if (obj instanceof List) {
                return y.g(listC, (List) obj);
            }
            return false;
        }

        @Override // java.util.List
        public V get(int i10) {
            return (V) y.b(c()).get(i10);
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            return y.d(c());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.apache.commons.collections4.multimap.b.i
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public List<V> c() {
            return a.this.g().get(this.f336182a);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return y.b(c()).indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return y.b(c()).lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            return new C2393a(this.f336182a);
        }

        @Override // java.util.List
        public V remove(int i10) {
            List listB = y.b(c());
            V v10 = (V) listB.remove(i10);
            if (listB.isEmpty()) {
                a.this.remove((Object) this.f336182a);
            }
            return v10;
        }

        @Override // java.util.List
        public V set(int i10, V v10) {
            return (V) y.b(c()).set(i10, v10);
        }

        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            return y.b(c()).subList(i10, i11);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            return new C2393a(this.f336182a, i10);
        }
    }

    protected a() {
    }

    @Override // org.apache.commons.collections4.multimap.b
    protected Map<K, List<V>> g() {
        return super.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.multimap.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public abstract List<V> d();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.apache.commons.collections4.multimap.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public List<V> i(K k10) {
        return new b(k10);
    }

    protected a(Map<K, ? extends List<V>> map) {
        super(map);
    }

    @Override // org.apache.commons.collections4.multimap.b, org.apache.commons.collections4.g0
    public List<V> get(K k10) {
        return i(k10);
    }

    @Override // org.apache.commons.collections4.multimap.b, org.apache.commons.collections4.g0
    public List<V> remove(Object obj) {
        return y.b(g().remove(obj));
    }

    /* JADX INFO: renamed from: org.apache.commons.collections4.multimap.a$a, reason: collision with other inner class name */
    private class C2393a implements ListIterator<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f336149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<V> f336150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ListIterator<V> f336151c;

        public C2393a(K k10) {
            this.f336149a = k10;
            List<V> listB = y.b(a.this.g().get(k10));
            this.f336150b = listB;
            this.f336151c = listB.listIterator();
        }

        @Override // java.util.ListIterator
        public void add(V v10) {
            if (a.this.g().get(this.f336149a) == null) {
                List<V> listD = a.this.d();
                a.this.g().put(this.f336149a, listD);
                this.f336150b = listD;
                this.f336151c = listD.listIterator();
            }
            this.f336151c.add(v10);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f336151c.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f336151c.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public V next() {
            return this.f336151c.next();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f336151c.nextIndex();
        }

        @Override // java.util.ListIterator
        public V previous() {
            return this.f336151c.previous();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f336151c.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f336151c.remove();
            if (this.f336150b.isEmpty()) {
                a.this.g().remove(this.f336149a);
            }
        }

        @Override // java.util.ListIterator
        public void set(V v10) {
            this.f336151c.set(v10);
        }

        public C2393a(K k10, int i10) {
            this.f336149a = k10;
            List<V> listB = y.b(a.this.g().get(k10));
            this.f336150b = listB;
            this.f336151c = listB.listIterator(i10);
        }
    }
}
