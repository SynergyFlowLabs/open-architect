package org.apache.commons.collections4.map;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.k0;
import org.apache.commons.collections4.p0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class d<K, V> extends org.apache.commons.collections4.map.a<K, V> implements org.apache.commons.collections4.j0<K, V> {
    transient c<K, V> X;

    protected static class a<K, V> extends AbstractC2389d<K, V> implements org.apache.commons.collections4.i0<Map.Entry<K, V>>, p0<Map.Entry<K, V>> {
        protected a(d<K, V> dVar) {
            super(dVar);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return super.c();
        }

        @Override // org.apache.commons.collections4.i0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> previous() {
            return super.d();
        }
    }

    protected static class b<K> extends AbstractC2389d<K, Object> implements org.apache.commons.collections4.i0<K>, p0<K> {
        protected b(d<K, ?> dVar) {
            super(dVar);
        }

        @Override // java.util.Iterator
        public K next() {
            return super.c().getKey();
        }

        @Override // org.apache.commons.collections4.i0
        public K previous() {
            return super.d().getKey();
        }
    }

    protected static class c<K, V> extends org.apache.commons.collections4.map.a.c<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected c<K, V> f336015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected c<K, V> f336016f;

        protected c(org.apache.commons.collections4.map.a.c<K, V> cVar, int i10, Object obj, V v10) {
            super(cVar, i10, obj, v10);
        }
    }

    /* JADX INFO: renamed from: org.apache.commons.collections4.map.d$d, reason: collision with other inner class name */
    protected static abstract class AbstractC2389d<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final d<K, V> f336017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected c<K, V> f336018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected c<K, V> f336019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected int f336020d;

        protected AbstractC2389d(d<K, V> dVar) {
            this.f336017a = dVar;
            this.f336019c = dVar.X.f336016f;
            this.f336020d = dVar.f335982e;
        }

        protected c<K, V> b() {
            return this.f336018b;
        }

        protected c<K, V> c() {
            d<K, V> dVar = this.f336017a;
            if (dVar.f335982e != this.f336020d) {
                throw new ConcurrentModificationException();
            }
            c<K, V> cVar = this.f336019c;
            if (cVar == dVar.X) {
                throw new NoSuchElementException("No next() entry in the iteration");
            }
            this.f336018b = cVar;
            this.f336019c = cVar.f336016f;
            return cVar;
        }

        protected c<K, V> d() {
            d<K, V> dVar = this.f336017a;
            if (dVar.f335982e != this.f336020d) {
                throw new ConcurrentModificationException();
            }
            c<K, V> cVar = this.f336019c.f336015e;
            if (cVar == dVar.X) {
                throw new NoSuchElementException("No previous() entry in the iteration");
            }
            this.f336019c = cVar;
            this.f336018b = cVar;
            return cVar;
        }

        public boolean hasNext() {
            return this.f336019c != this.f336017a.X;
        }

        public boolean hasPrevious() {
            return this.f336019c.f336015e != this.f336017a.X;
        }

        public void remove() {
            c<K, V> cVar = this.f336018b;
            if (cVar == null) {
                throw new IllegalStateException("remove() can only be called once after next()");
            }
            d<K, V> dVar = this.f336017a;
            if (dVar.f335982e != this.f336020d) {
                throw new ConcurrentModificationException();
            }
            dVar.remove(cVar.getKey());
            this.f336018b = null;
            this.f336020d = this.f336017a.f335982e;
        }

        public void reset() {
            this.f336018b = null;
            this.f336019c = this.f336017a.X.f336016f;
        }

        public String toString() {
            if (this.f336018b == null) {
                return "Iterator[]";
            }
            return "Iterator[" + this.f336018b.getKey() + "=" + this.f336018b.getValue() + "]";
        }
    }

    protected static class e<K, V> extends AbstractC2389d<K, V> implements k0<K, V>, p0<K> {
        protected e(d<K, V> dVar) {
            super(dVar);
        }

        @Override // org.apache.commons.collections4.a0
        public K getKey() {
            c<K, V> cVarB = b();
            if (cVarB != null) {
                return cVarB.getKey();
            }
            throw new IllegalStateException("getKey() can only be called after next() and before remove()");
        }

        @Override // org.apache.commons.collections4.a0
        public V getValue() {
            c<K, V> cVarB = b();
            if (cVarB != null) {
                return cVarB.getValue();
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public K next() {
            return super.c().getKey();
        }

        @Override // org.apache.commons.collections4.k0, org.apache.commons.collections4.i0
        public K previous() {
            return super.d().getKey();
        }

        @Override // org.apache.commons.collections4.a0
        public V setValue(V v10) {
            c<K, V> cVarB = b();
            if (cVarB != null) {
                return cVarB.setValue(v10);
            }
            throw new IllegalStateException("setValue() can only be called after next() and before remove()");
        }
    }

    protected static class f<V> extends AbstractC2389d<Object, V> implements org.apache.commons.collections4.i0<V>, p0<V> {
        protected f(d<?, V> dVar) {
            super(dVar);
        }

        @Override // java.util.Iterator
        public V next() {
            return super.c().getValue();
        }

        @Override // org.apache.commons.collections4.i0
        public V previous() {
            return super.d().getValue();
        }
    }

    protected d() {
    }

    @Override // org.apache.commons.collections4.map.a
    protected void A() {
        c<K, V> cVarI = i(null, -1, null, null);
        this.X = cVarI;
        cVarI.f336016f = cVarI;
        cVarI.f336015e = cVarI;
    }

    @Override // org.apache.commons.collections4.j0
    public K C3(Object obj) {
        c<K, V> cVar;
        c<K, V> cVarW = w(obj);
        if (cVarW != null && (cVar = cVarW.f336016f) != this.X) {
            return cVar.getKey();
        }
        return null;
    }

    @Override // org.apache.commons.collections4.map.a
    protected void D(org.apache.commons.collections4.map.a.c<K, V> cVar, int i10, org.apache.commons.collections4.map.a.c<K, V> cVar2) {
        c cVar3 = (c) cVar;
        c<K, V> cVar4 = cVar3.f336015e;
        cVar4.f336016f = cVar3.f336016f;
        cVar3.f336016f.f336015e = cVar4;
        cVar3.f336016f = null;
        cVar3.f336015e = null;
        super.D(cVar, i10, cVar2);
    }

    @Override // org.apache.commons.collections4.j0
    public K E2(Object obj) {
        c<K, V> cVar;
        c<K, V> cVarW = w(obj);
        if (cVarW == null || (cVar = cVarW.f336015e) == this.X) {
            return null;
        }
        return cVar.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.map.a
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public c<K, V> i(org.apache.commons.collections4.map.a.c<K, V> cVar, int i10, K k10, V v10) {
        return new c<>(cVar, i10, h(k10), v10);
    }

    protected c<K, V> I(c<K, V> cVar) {
        return cVar.f336016f;
    }

    protected c<K, V> J(c<K, V> cVar) {
        return cVar.f336015e;
    }

    protected c<K, V> K(int i10) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Index " + i10 + " is less than zero");
        }
        int i11 = this.f335979b;
        if (i10 >= i11) {
            throw new IndexOutOfBoundsException("Index " + i10 + " is invalid for size " + this.f335979b);
        }
        if (i10 >= i11 / 2) {
            c<K, V> cVar = this.X;
            while (i11 > i10) {
                cVar = cVar.f336015e;
                i11--;
            }
            return cVar;
        }
        c<K, V> cVar2 = this.X.f336016f;
        for (int i12 = 0; i12 < i10; i12++) {
            cVar2 = cVar2.f336016f;
        }
        return cVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.map.a
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public c<K, V> w(Object obj) {
        return (c) super.w(obj);
    }

    @Override // org.apache.commons.collections4.map.a
    protected void b(org.apache.commons.collections4.map.a.c<K, V> cVar, int i10) {
        c<K, V> cVar2 = (c) cVar;
        c<K, V> cVar3 = this.X;
        cVar2.f336016f = cVar3;
        cVar2.f336015e = cVar3.f336015e;
        cVar3.f336015e.f336016f = cVar2;
        cVar3.f336015e = cVar2;
        this.f335980c[i10] = cVar2;
    }

    @Override // org.apache.commons.collections4.map.a, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        super.clear();
        c<K, V> cVar = this.X;
        cVar.f336016f = cVar;
        cVar.f336015e = cVar;
    }

    @Override // org.apache.commons.collections4.map.a, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public boolean containsValue(Object obj) {
        if (obj == null) {
            c<K, V> cVar = this.X;
            do {
                cVar = cVar.f336016f;
                if (cVar != this.X) {
                }
            } while (cVar.getValue() != null);
            return true;
        }
        c<K, V> cVar2 = this.X;
        do {
            cVar2 = cVar2.f336016f;
            if (cVar2 != this.X) {
            }
        } while (!C(obj, cVar2.getValue()));
        return true;
        return false;
    }

    @Override // org.apache.commons.collections4.j0
    public K firstKey() {
        if (this.f335979b != 0) {
            return this.X.f336016f.getKey();
        }
        throw new NoSuchElementException("Map is empty");
    }

    @Override // org.apache.commons.collections4.map.a
    protected Iterator<Map.Entry<K, V>> j() {
        return size() == 0 ? org.apache.commons.collections4.iterators.o.b() : new a(this);
    }

    @Override // org.apache.commons.collections4.map.a
    protected Iterator<K> k() {
        return size() == 0 ? org.apache.commons.collections4.iterators.o.b() : new b(this);
    }

    @Override // org.apache.commons.collections4.map.a
    protected Iterator<V> l() {
        return size() == 0 ? org.apache.commons.collections4.iterators.o.b() : new f(this);
    }

    @Override // org.apache.commons.collections4.j0
    public K lastKey() {
        if (this.f335979b != 0) {
            return this.X.f336015e.getKey();
        }
        throw new NoSuchElementException("Map is empty");
    }

    protected d(int i10, float f10, int i11) {
        super(i10, f10, i11);
    }

    @Override // org.apache.commons.collections4.map.a, org.apache.commons.collections4.s
    public k0<K, V> T() {
        return this.f335979b == 0 ? org.apache.commons.collections4.iterators.p.b() : new e(this);
    }

    protected d(int i10) {
        super(i10);
    }

    protected d(int i10, float f10) {
        super(i10, f10);
    }

    protected d(Map<? extends K, ? extends V> map) {
        super(map);
    }
}
