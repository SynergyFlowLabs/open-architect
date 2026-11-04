package org.apache.commons.collections4.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public abstract class g<K, V> extends org.apache.commons.collections4.map.a<K, V> {
    private h X;
    private h Y;
    private boolean Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private transient ReferenceQueue<Object> f336043p0;

    static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g<K, V> f336044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f336045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        b<K, V> f336046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        b<K, V> f336047d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        K f336048e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        K f336049f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        V f336050g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        V f336051h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f336052i;

        public a(g<K, V> gVar) {
            this.f336044a = gVar;
            this.f336045b = gVar.size() != 0 ? gVar.f335980c.length : 0;
            this.f336052i = gVar.f335982e;
        }

        private void b() {
            if (this.f336044a.f335982e != this.f336052i) {
                throw new ConcurrentModificationException();
            }
        }

        private boolean e() {
            return this.f336049f == null || this.f336051h == null;
        }

        protected b<K, V> c() {
            b();
            return this.f336047d;
        }

        protected b<K, V> d() {
            b();
            if (e() && !hasNext()) {
                throw new NoSuchElementException();
            }
            b<K, V> bVar = this.f336046c;
            this.f336047d = bVar;
            this.f336046c = bVar.a();
            this.f336048e = this.f336049f;
            this.f336050g = this.f336051h;
            this.f336049f = null;
            this.f336051h = null;
            return this.f336047d;
        }

        public boolean hasNext() {
            b();
            while (e()) {
                b<K, V> bVar = this.f336046c;
                int i10 = this.f336045b;
                while (bVar == null && i10 > 0) {
                    i10--;
                    bVar = (b) this.f336044a.f335980c[i10];
                }
                this.f336046c = bVar;
                this.f336045b = i10;
                if (bVar == null) {
                    this.f336048e = null;
                    this.f336050g = null;
                    return false;
                }
                this.f336049f = bVar.getKey();
                this.f336051h = bVar.getValue();
                if (e()) {
                    this.f336046c = this.f336046c.a();
                }
            }
            return true;
        }

        public void remove() {
            b();
            if (this.f336047d == null) {
                throw new IllegalStateException();
            }
            this.f336044a.remove(this.f336048e);
            this.f336047d = null;
            this.f336048e = null;
            this.f336050g = null;
            this.f336052i = this.f336044a.f335982e;
        }
    }

    protected static class b<K, V> extends org.apache.commons.collections4.map.a.c<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final g<K, V> f336053e;

        public b(g<K, V> gVar, org.apache.commons.collections4.map.a.c<K, V> cVar, int i10, K k10, V v10) {
            super(cVar, i10, null, null);
            this.f336053e = gVar;
            this.f335989c = c(((g) gVar).X, k10, i10);
            this.f335990d = c(((g) gVar).Y, v10, i10);
        }

        protected b<K, V> a() {
            return (b) this.f335987a;
        }

        boolean b(Reference<?> reference) {
            h hVar = ((g) this.f336053e).X;
            h hVar2 = h.HARD;
            boolean z10 = (hVar != hVar2 && this.f335989c == reference) || (((g) this.f336053e).Y != hVar2 && this.f335990d == reference);
            if (z10) {
                if (((g) this.f336053e).X != hVar2) {
                    ((Reference) this.f335989c).clear();
                }
                if (((g) this.f336053e).Y != hVar2) {
                    ((Reference) this.f335990d).clear();
                    return z10;
                }
                if (((g) this.f336053e).Z) {
                    this.f335990d = null;
                }
            }
            return z10;
        }

        protected <T> Object c(h hVar, T t10, int i10) {
            if (hVar == h.HARD) {
                return t10;
            }
            if (hVar == h.SOFT) {
                return new k(i10, t10, ((g) this.f336053e).f336043p0);
            }
            if (hVar == h.WEAK) {
                return new l(i10, t10, ((g) this.f336053e).f336043p0);
            }
            throw new Error();
        }

        @Override // org.apache.commons.collections4.map.a.c, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return key != null && value != null && this.f336053e.B(key, this.f335989c) && this.f336053e.C(value, getValue());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.apache.commons.collections4.map.a.c, java.util.Map.Entry, org.apache.commons.collections4.x
        public K getKey() {
            h hVar = ((g) this.f336053e).X;
            h hVar2 = h.HARD;
            K k10 = (K) this.f335989c;
            return hVar == hVar2 ? k10 : (K) ((Reference) k10).get();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.apache.commons.collections4.map.a.c, java.util.Map.Entry, org.apache.commons.collections4.x
        public V getValue() {
            h hVar = ((g) this.f336053e).Y;
            h hVar2 = h.HARD;
            V v10 = (V) this.f335990d;
            return hVar == hVar2 ? v10 : (V) ((Reference) v10).get();
        }

        @Override // org.apache.commons.collections4.map.a.c, java.util.Map.Entry
        public int hashCode() {
            return this.f336053e.M(getKey(), getValue());
        }

        @Override // org.apache.commons.collections4.map.a.c, java.util.Map.Entry
        public V setValue(V v10) {
            V value = getValue();
            if (((g) this.f336053e).Y != h.HARD) {
                ((Reference) this.f335990d).clear();
            }
            this.f335990d = c(((g) this.f336053e).Y, v10, this.f335988b);
            return value;
        }
    }

    static class c<K, V> extends org.apache.commons.collections4.map.a.C2387a<K, V> {
        protected c(org.apache.commons.collections4.map.a<K, V> aVar) {
            super(aVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return toArray(new Object[size()]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList(size());
            Iterator<Map.Entry<K, V>> it = iterator();
            while (it.hasNext()) {
                arrayList.add(new org.apache.commons.collections4.keyvalue.e(it.next()));
            }
            return (T[]) arrayList.toArray(tArr);
        }
    }

    static class d<K, V> extends a<K, V> implements Iterator<Map.Entry<K, V>> {
        public d(g<K, V> gVar) {
            super(gVar);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return d();
        }
    }

    static class e<K> extends org.apache.commons.collections4.map.a.f<K> {
        protected e(org.apache.commons.collections4.map.a<K, ?> aVar) {
            super(aVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return toArray(new Object[size()]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList(size());
            Iterator<K> it = iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            return (T[]) arrayList.toArray(tArr);
        }
    }

    static class f<K> extends a<K, Object> implements Iterator<K> {
        f(g<K, ?> gVar) {
            super(gVar);
        }

        @Override // java.util.Iterator
        public K next() {
            return d().getKey();
        }
    }

    /* JADX INFO: renamed from: org.apache.commons.collections4.map.g$g, reason: collision with other inner class name */
    static class C2390g<K, V> extends a<K, V> implements org.apache.commons.collections4.a0<K, V> {
        protected C2390g(g<K, V> gVar) {
            super(gVar);
        }

        @Override // org.apache.commons.collections4.a0
        public K getKey() {
            b<K, V> bVarC = c();
            if (bVarC != null) {
                return bVarC.getKey();
            }
            throw new IllegalStateException("getKey() can only be called after next() and before remove()");
        }

        @Override // org.apache.commons.collections4.a0
        public V getValue() {
            b<K, V> bVarC = c();
            if (bVarC != null) {
                return bVarC.getValue();
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        public K next() {
            return d().getKey();
        }

        @Override // org.apache.commons.collections4.a0
        public V setValue(V v10) {
            b<K, V> bVarC = c();
            if (bVarC != null) {
                return bVarC.setValue(v10);
            }
            throw new IllegalStateException("setValue() can only be called after next() and before remove()");
        }
    }

    public enum h {
        HARD(0),
        SOFT(1),
        WEAK(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f336058a;

        h(int i10) {
            this.f336058a = i10;
        }

        public static h b(int i10) {
            if (i10 == 0) {
                return HARD;
            }
            if (i10 == 1) {
                return SOFT;
            }
            if (i10 == 2) {
                return WEAK;
            }
            throw new IllegalArgumentException();
        }
    }

    static class i<V> extends org.apache.commons.collections4.map.a.h<V> {
        protected i(org.apache.commons.collections4.map.a<?, V> aVar) {
            super(aVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return toArray(new Object[size()]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList(size());
            Iterator<V> it = iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            return (T[]) arrayList.toArray(tArr);
        }
    }

    static class j<V> extends a<Object, V> implements Iterator<V> {
        j(g<?, V> gVar) {
            super(gVar);
        }

        @Override // java.util.Iterator
        public V next() {
            return d().getValue();
        }
    }

    static class k<T> extends SoftReference<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f336059a;

        public k(int i10, T t10, ReferenceQueue<? super T> referenceQueue) {
            super(t10, referenceQueue);
            this.f336059a = i10;
        }

        public int hashCode() {
            return this.f336059a;
        }
    }

    static class l<T> extends WeakReference<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f336060a;

        public l(int i10, T t10, ReferenceQueue<? super T> referenceQueue) {
            super(t10, referenceQueue);
            this.f336060a = i10;
        }

        public int hashCode() {
            return this.f336060a;
        }
    }

    protected g() {
    }

    @Override // org.apache.commons.collections4.map.a
    protected void A() {
        this.f336043p0 = new ReferenceQueue<>();
    }

    @Override // org.apache.commons.collections4.map.a
    protected boolean B(Object obj, Object obj2) {
        if (this.X != h.HARD) {
            obj2 = ((Reference) obj2).get();
        }
        if (obj != obj2 && !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.map.a
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public b<K, V> i(org.apache.commons.collections4.map.a.c<K, V> cVar, int i10, K k10, V v10) {
        return new b<>(this, cVar, i10, k10, v10);
    }

    protected int M(Object obj, Object obj2) {
        return (obj2 != null ? obj2.hashCode() : 0) ^ (obj == null ? 0 : obj.hashCode());
    }

    protected boolean O(h hVar) {
        return this.X == hVar;
    }

    protected void P() {
        Reference<? extends Object> referencePoll = this.f336043p0.poll();
        while (referencePoll != null) {
            Q(referencePoll);
            referencePoll = this.f336043p0.poll();
        }
    }

    protected void Q(Reference<?> reference) {
        int iZ = z(reference.hashCode(), this.f335980c.length);
        org.apache.commons.collections4.map.a.c<K, V> cVar = null;
        for (org.apache.commons.collections4.map.a.c<K, V> cVar2 = this.f335980c[iZ]; cVar2 != null; cVar2 = cVar2.f335987a) {
            if (((b) cVar2).b(reference)) {
                if (cVar == null) {
                    this.f335980c[iZ] = cVar2.f335987a;
                } else {
                    cVar.f335987a = cVar2.f335987a;
                }
                this.f335979b--;
                return;
            }
            cVar = cVar2;
        }
    }

    protected void S() {
        P();
    }

    @Override // org.apache.commons.collections4.map.a, org.apache.commons.collections4.s
    public org.apache.commons.collections4.a0<K, V> T() {
        return new C2390g(this);
    }

    protected void U() {
        P();
    }

    @Override // org.apache.commons.collections4.map.a, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        super.clear();
        while (this.f336043p0.poll() != null) {
        }
    }

    @Override // org.apache.commons.collections4.map.a, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public boolean containsKey(Object obj) {
        S();
        org.apache.commons.collections4.map.a.c<K, V> cVarW = w(obj);
        return (cVarW == null || cVarW.getValue() == null) ? false : true;
    }

    @Override // org.apache.commons.collections4.map.a, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public boolean containsValue(Object obj) {
        S();
        if (obj == null) {
            return false;
        }
        return super.containsValue(obj);
    }

    @Override // org.apache.commons.collections4.map.a, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f335983f == null) {
            this.f335983f = new c(this);
        }
        return this.f335983f;
    }

    @Override // org.apache.commons.collections4.map.a, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public V get(Object obj) {
        S();
        org.apache.commons.collections4.map.a.c<K, V> cVarW = w(obj);
        if (cVarW == null) {
            return null;
        }
        return cVarW.getValue();
    }

    @Override // org.apache.commons.collections4.map.a, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public boolean isEmpty() {
        S();
        return super.isEmpty();
    }

    @Override // org.apache.commons.collections4.map.a
    protected Iterator<Map.Entry<K, V>> j() {
        return new d(this);
    }

    @Override // org.apache.commons.collections4.map.a
    protected Iterator<K> k() {
        return new f(this);
    }

    @Override // org.apache.commons.collections4.map.a, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public Set<K> keySet() {
        if (this.f335984g == null) {
            this.f335984g = new e(this);
        }
        return this.f335984g;
    }

    @Override // org.apache.commons.collections4.map.a
    protected Iterator<V> l() {
        return new j(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.map.a
    protected void o(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.X = h.b(objectInputStream.readInt());
        this.Y = h.b(objectInputStream.readInt());
        this.Z = objectInputStream.readBoolean();
        this.f335978a = objectInputStream.readFloat();
        int i10 = objectInputStream.readInt();
        A();
        org.apache.commons.collections4.map.a.c<K, V>[] cVarArr = new org.apache.commons.collections4.map.a.c[i10];
        this.f335980c = cVarArr;
        this.f335981d = e(cVarArr.length, this.f335978a);
        while (true) {
            Object object = objectInputStream.readObject();
            if (object == null) {
                return;
            } else {
                put(object, objectInputStream.readObject());
            }
        }
    }

    @Override // org.apache.commons.collections4.map.a
    protected void p(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.X.f336058a);
        objectOutputStream.writeInt(this.Y.f336058a);
        objectOutputStream.writeBoolean(this.Z);
        objectOutputStream.writeFloat(this.f335978a);
        objectOutputStream.writeInt(this.f335980c.length);
        org.apache.commons.collections4.a0<K, V> a0VarT = T();
        while (a0VarT.hasNext()) {
            objectOutputStream.writeObject(a0VarT.next());
            objectOutputStream.writeObject(a0VarT.getValue());
        }
        objectOutputStream.writeObject(null);
    }

    @Override // org.apache.commons.collections4.map.a, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.n0
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("null keys not allowed");
        }
        if (v10 == null) {
            throw new NullPointerException("null values not allowed");
        }
        U();
        return (V) super.put(k10, v10);
    }

    @Override // org.apache.commons.collections4.map.a, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        U();
        return (V) super.remove(obj);
    }

    @Override // org.apache.commons.collections4.map.a, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public int size() {
        S();
        return super.size();
    }

    @Override // org.apache.commons.collections4.map.a, java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public Collection<V> values() {
        if (this.f335985h == null) {
            this.f335985h = new i(this);
        }
        return this.f335985h;
    }

    @Override // org.apache.commons.collections4.map.a
    protected org.apache.commons.collections4.map.a.c<K, V> w(Object obj) {
        if (obj == null) {
            return null;
        }
        return super.w(obj);
    }

    protected g(h hVar, h hVar2, int i10, float f10, boolean z10) {
        super(i10, f10);
        this.X = hVar;
        this.Y = hVar2;
        this.Z = z10;
    }
}
