package org.apache.commons.collections4.bidimap;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.AbstractSet;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.collections4.a0;
import org.apache.commons.collections4.h0;
import org.apache.commons.collections4.i0;
import org.apache.commons.collections4.iterators.p;
import org.apache.commons.collections4.k0;
import org.apache.commons.collections4.x;

/* JADX INFO: loaded from: classes14.dex */
public class h<K extends Comparable<K>, V extends Comparable<V>> implements h0<K, V>, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f335553h = 721969328361807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient i<K, V>[] f335554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f335555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f335556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Set<K> f335557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient Set<V> f335558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f335559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient h<K, V>.d f335560g;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f335561a;

        static {
            int[] iArr = new int[b.values().length];
            f335561a = iArr;
            try {
                iArr[b.KEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f335561a[b.VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    enum b {
        KEY("key"),
        VALUE("value");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f335565a;

        b(String str) {
            this.f335565a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f335565a;
        }
    }

    class c extends h<K, V>.k<Map.Entry<K, V>> {
        c() {
            super(b.KEY);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object value = entry.getValue();
            i iVarC0 = h.this.c0(entry.getKey());
            return iVarC0 != null && iVarC0.getValue().equals(value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new m();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object value = entry.getValue();
            i iVarC0 = h.this.c0(entry.getKey());
            if (iVarC0 == null || !iVarC0.getValue().equals(value)) {
                return false;
            }
            h.this.D(iVarC0);
            return true;
        }
    }

    class d implements h0<V, K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Set<V> f335567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Set<K> f335568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set<Map.Entry<V, K>> f335569c;

        d() {
        }

        @Override // org.apache.commons.collections4.j0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public V firstKey() {
            if (h.this.f335555b == 0) {
                throw new NoSuchElementException("Map is empty");
            }
            h hVar = h.this;
            i[] iVarArr = hVar.f335554a;
            b bVar = b.VALUE;
            return (V) hVar.a0(iVarArr[bVar.ordinal()], bVar).getValue();
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public K get(Object obj) {
            return (K) h.this.w2(obj);
        }

        @Override // org.apache.commons.collections4.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public V w2(Object obj) {
            return (V) h.this.get(obj);
        }

        @Override // java.util.Map, org.apache.commons.collections4.n0
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        public boolean containsKey(Object obj) {
            return h.this.containsValue(obj);
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        public boolean containsValue(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // org.apache.commons.collections4.j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public V lastKey() {
            if (h.this.f335555b == 0) {
                throw new NoSuchElementException("Map is empty");
            }
            h hVar = h.this;
            i[] iVarArr = hVar.f335554a;
            b bVar = b.VALUE;
            return (V) hVar.S(iVarArr[bVar.ordinal()], bVar).getValue();
        }

        @Override // org.apache.commons.collections4.j0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public V C3(V v10) {
            h.u(v10);
            h hVar = h.this;
            b bVar = b.VALUE;
            i iVarH0 = hVar.h0(hVar.b0(v10, bVar), bVar);
            if (iVarH0 == null) {
                return null;
            }
            return (V) iVarH0.getValue();
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        public Set<Map.Entry<V, K>> entrySet() {
            if (this.f335569c == null) {
                this.f335569c = new e();
            }
            return this.f335569c;
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return h.this.A(obj, b.VALUE);
        }

        @Override // org.apache.commons.collections4.j0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public V E2(V v10) {
            h.u(v10);
            h hVar = h.this;
            b bVar = b.VALUE;
            i iVarJ0 = hVar.j0(hVar.b0(v10, bVar), bVar);
            if (iVarJ0 == null) {
                return null;
            }
            return (V) iVarJ0.getValue();
        }

        @Override // org.apache.commons.collections4.e, java.util.Map, org.apache.commons.collections4.n0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public K put(V v10, K k10) {
            K k11 = (K) get(v10);
            h.this.C(k10, v10);
            return k11;
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public K remove(Object obj) {
            return (K) h.this.N2(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return h.this.B(b.VALUE);
        }

        @Override // org.apache.commons.collections4.e
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public V N2(Object obj) {
            return (V) h.this.remove(obj);
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        public boolean isEmpty() {
            return h.this.isEmpty();
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        public Set<V> keySet() {
            if (this.f335567a == null) {
                this.f335567a = new j(b.VALUE);
            }
            return this.f335567a;
        }

        @Override // java.util.Map, org.apache.commons.collections4.n0
        public void putAll(Map<? extends V, ? extends K> map) {
            for (Map.Entry<? extends V, ? extends K> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        public int size() {
            return h.this.size();
        }

        public String toString() {
            return h.this.I(b.VALUE);
        }

        @Override // org.apache.commons.collections4.e
        public h0<K, V> N() {
            return h.this;
        }

        @Override // org.apache.commons.collections4.s
        public k0<V, K> T() {
            return isEmpty() ? p.b() : new g(b.VALUE);
        }

        @Override // java.util.Map, org.apache.commons.collections4.r
        public Set<K> values() {
            if (this.f335568b == null) {
                this.f335568b = new C2385h(b.VALUE);
            }
            return this.f335568b;
        }
    }

    class e extends h<K, V>.k<Map.Entry<V, K>> {
        e() {
            super(b.VALUE);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object value = entry.getValue();
            i iVarD0 = h.this.d0(entry.getKey());
            return iVarD0 != null && iVarD0.getKey().equals(value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<V, K>> iterator() {
            return new f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object value = entry.getValue();
            i iVarD0 = h.this.d0(entry.getKey());
            if (iVarD0 == null || !iVarD0.getKey().equals(value)) {
                return false;
            }
            h.this.D(iVarD0);
            int i10 = 7 | 1;
            return true;
        }
    }

    class f extends h<K, V>.l implements i0<Map.Entry<V, K>> {
        f() {
            super(b.VALUE);
        }

        private Map.Entry<V, K> d(i<K, V> iVar) {
            return new org.apache.commons.collections4.keyvalue.h(iVar.getValue(), iVar.getKey());
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<V, K> next() {
            return d(b());
        }

        @Override // org.apache.commons.collections4.i0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<V, K> previous() {
            return d(c());
        }
    }

    class g extends h<K, V>.l implements k0<V, K> {
        public g(b bVar) {
            super(bVar);
        }

        @Override // org.apache.commons.collections4.a0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public V getKey() {
            i<K, V> iVar = this.f335587b;
            if (iVar != null) {
                return (V) iVar.getValue();
            }
            throw new IllegalStateException("Iterator getKey() can only be called after next() and before remove()");
        }

        @Override // org.apache.commons.collections4.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public K getValue() {
            i<K, V> iVar = this.f335587b;
            if (iVar != null) {
                return (K) iVar.getKey();
            }
            throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public V next() {
            return (V) b().getValue();
        }

        @Override // org.apache.commons.collections4.k0, org.apache.commons.collections4.i0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public V previous() {
            return (V) c().getValue();
        }

        @Override // org.apache.commons.collections4.a0
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public K setValue(K k10) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: org.apache.commons.collections4.bidimap.h$h, reason: collision with other inner class name */
    class C2385h extends h<K, V>.k<K> {
        public C2385h(b bVar) {
            super(bVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            h.w(obj, b.KEY);
            return h.this.c0(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new n(this.f335584a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return h.this.G(obj) != null;
        }
    }

    static class i<K extends Comparable<K>, V extends Comparable<V>> implements Map.Entry<K, V>, x<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f335575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final V f335576b;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f335581g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final i<K, V>[] f335577c = new i[2];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final i<K, V>[] f335578d = new i[2];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final i<K, V>[] f335579e = new i[2];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean[] f335580f = {true, true};

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f335582h = false;

        i(K k10, V v10) {
            this.f335575a = k10;
            this.f335576b = v10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A(b bVar) {
            this.f335580f[bVar.ordinal()] = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B(i<K, V> iVar, b bVar) {
            this.f335577c[bVar.ordinal()] = iVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C(i<K, V> iVar, b bVar) {
            this.f335579e[bVar.ordinal()] = iVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D(b bVar) {
            this.f335580f[bVar.ordinal()] = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E(i<K, V> iVar, b bVar) {
            this.f335578d[bVar.ordinal()] = iVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G(i<K, V> iVar, b bVar) {
            boolean[] zArr = this.f335580f;
            int iOrdinal = bVar.ordinal();
            zArr[iOrdinal] = zArr[iOrdinal] ^ iVar.f335580f[bVar.ordinal()];
            boolean[] zArr2 = iVar.f335580f;
            int iOrdinal2 = bVar.ordinal();
            zArr2[iOrdinal2] = zArr2[iOrdinal2] ^ this.f335580f[bVar.ordinal()];
            boolean[] zArr3 = this.f335580f;
            int iOrdinal3 = bVar.ordinal();
            zArr3[iOrdinal3] = iVar.f335580f[bVar.ordinal()] ^ zArr3[iOrdinal3];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(i<K, V> iVar, b bVar) {
            this.f335580f[bVar.ordinal()] = iVar.f335580f[bVar.ordinal()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object q(b bVar) {
            int i10 = a.f335561a[bVar.ordinal()];
            if (i10 == 1) {
                return getKey();
            }
            int i11 = 3 & 2;
            if (i10 == 2) {
                return getValue();
            }
            throw new IllegalArgumentException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public i<K, V> s(b bVar) {
            return this.f335577c[bVar.ordinal()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public i<K, V> t(b bVar) {
            return this.f335579e[bVar.ordinal()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public i<K, V> u(b bVar) {
            return this.f335578d[bVar.ordinal()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean w(b bVar) {
            return this.f335580f[bVar.ordinal()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean x(b bVar) {
            return this.f335579e[bVar.ordinal()] != null && this.f335579e[bVar.ordinal()].f335577c[bVar.ordinal()] == this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean y(b bVar) {
            return !this.f335580f[bVar.ordinal()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean z(b bVar) {
            return this.f335579e[bVar.ordinal()] != null && this.f335579e[bVar.ordinal()].f335578d[bVar.ordinal()] == this;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public V setValue(V v10) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Map.Entry.setValue is not supported");
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return getKey().equals(entry.getKey()) && getValue().equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f335582h) {
                this.f335581g = getKey().hashCode() ^ getValue().hashCode();
                this.f335582h = true;
            }
            return this.f335581g;
        }

        @Override // java.util.Map.Entry, org.apache.commons.collections4.x
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f335575a;
        }

        @Override // java.util.Map.Entry, org.apache.commons.collections4.x
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public V getValue() {
            return this.f335576b;
        }
    }

    class j extends h<K, V>.k<V> {
        public j(b bVar) {
            super(bVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            h.w(obj, b.VALUE);
            return h.this.d0(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new g(this.f335584a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return h.this.H(obj) != null;
        }
    }

    abstract class k<E> extends AbstractSet<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b f335584a;

        k(b bVar) {
            this.f335584a = bVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.size();
        }
    }

    abstract class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f335586a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private i<K, V> f335588c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f335590e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        i<K, V> f335587b = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private i<K, V> f335589d = null;

        l(b bVar) {
            this.f335586a = bVar;
            this.f335590e = h.this.f335556c;
            this.f335588c = h.this.a0(h.this.f335554a[bVar.ordinal()], bVar);
        }

        protected i<K, V> b() {
            if (this.f335588c == null) {
                throw new NoSuchElementException();
            }
            if (h.this.f335556c != this.f335590e) {
                throw new ConcurrentModificationException();
            }
            i<K, V> iVar = this.f335588c;
            this.f335587b = iVar;
            this.f335589d = iVar;
            this.f335588c = h.this.h0(iVar, this.f335586a);
            return this.f335587b;
        }

        protected i<K, V> c() {
            if (this.f335589d == null) {
                throw new NoSuchElementException();
            }
            if (h.this.f335556c != this.f335590e) {
                throw new ConcurrentModificationException();
            }
            i<K, V> iVar = this.f335587b;
            this.f335588c = iVar;
            if (iVar == null) {
                this.f335588c = h.this.h0(this.f335589d, this.f335586a);
            }
            i<K, V> iVar2 = this.f335589d;
            this.f335587b = iVar2;
            this.f335589d = h.this.j0(iVar2, this.f335586a);
            return this.f335587b;
        }

        public final boolean hasNext() {
            return this.f335588c != null;
        }

        public boolean hasPrevious() {
            return this.f335589d != null;
        }

        public final void remove() {
            if (this.f335587b == null) {
                throw new IllegalStateException();
            }
            if (h.this.f335556c != this.f335590e) {
                throw new ConcurrentModificationException();
            }
            h.this.D(this.f335587b);
            this.f335590e++;
            this.f335587b = null;
            i<K, V> iVar = this.f335588c;
            if (iVar != null) {
                this.f335589d = h.this.j0(iVar, this.f335586a);
            } else {
                h hVar = h.this;
                this.f335589d = hVar.S(hVar.f335554a[this.f335586a.ordinal()], this.f335586a);
            }
        }
    }

    class m extends h<K, V>.l implements i0<Map.Entry<K, V>> {
        m() {
            super(b.KEY);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return b();
        }

        @Override // org.apache.commons.collections4.i0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> previous() {
            return c();
        }
    }

    class n extends h<K, V>.l implements k0<K, V> {
        n(b bVar) {
            super(bVar);
        }

        @Override // org.apache.commons.collections4.a0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            i<K, V> iVar = this.f335587b;
            if (iVar != null) {
                return (K) iVar.getKey();
            }
            throw new IllegalStateException("Iterator getKey() can only be called after next() and before remove()");
        }

        @Override // org.apache.commons.collections4.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public V getValue() {
            i<K, V> iVar = this.f335587b;
            if (iVar != null) {
                return (V) iVar.getValue();
            }
            throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
        }

        @Override // org.apache.commons.collections4.a0, java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public K next() {
            return (K) b().getKey();
        }

        @Override // org.apache.commons.collections4.k0, org.apache.commons.collections4.i0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public K previous() {
            return (K) c().getKey();
        }

        @Override // org.apache.commons.collections4.a0
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public V setValue(V v10) {
            throw new UnsupportedOperationException();
        }
    }

    public h() {
        this.f335555b = 0;
        this.f335556c = 0;
        this.f335560g = null;
        this.f335554a = new i[2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A(Object obj, b bVar) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() != size()) {
            return false;
        }
        if (this.f335555b > 0) {
            try {
                a0<?, ?> a0VarP = P(bVar);
                while (a0VarP.hasNext()) {
                    if (!a0VarP.getValue().equals(map.get(a0VarP.next()))) {
                        return false;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int B(b bVar) {
        int iHashCode = 0;
        if (this.f335555b > 0) {
            a0<?, ?> a0VarP = P(bVar);
            while (a0VarP.hasNext()) {
                iHashCode += a0VarP.next().hashCode() ^ a0VarP.getValue().hashCode();
            }
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(K k10, V v10) {
        v(k10, v10);
        G(k10);
        H(v10);
        i<K, V>[] iVarArr = this.f335554a;
        b bVar = b.KEY;
        i<K, V> iVarS = iVarArr[bVar.ordinal()];
        if (iVarS == null) {
            i<K, V> iVar = new i<>(k10, v10);
            this.f335554a[bVar.ordinal()] = iVar;
            this.f335554a[b.VALUE.ordinal()] = iVar;
            U();
            return;
        }
        while (true) {
            int iY = y(k10, iVarS.getKey());
            if (iY == 0) {
                throw new IllegalArgumentException("Cannot store a duplicate key (\"" + k10 + "\") in this Map");
            }
            if (iY < 0) {
                b bVar2 = b.KEY;
                if (iVarS.s(bVar2) == null) {
                    i<K, V> iVar2 = new i<>(k10, v10);
                    V(iVar2);
                    iVarS.B(iVar2, bVar2);
                    iVar2.C(iVarS, bVar2);
                    F(iVar2, bVar2);
                    U();
                    return;
                }
                iVarS = iVarS.s(bVar2);
            } else {
                b bVar3 = b.KEY;
                if (iVarS.u(bVar3) == null) {
                    i<K, V> iVar3 = new i<>(k10, v10);
                    V(iVar3);
                    iVarS.E(iVar3, bVar3);
                    iVar3.C(iVarS, bVar3);
                    F(iVar3, bVar3);
                    U();
                    return;
                }
                iVarS = iVarS.u(bVar3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(i<K, V> iVar) {
        int i10 = 7 & 0;
        for (b bVar : b.values()) {
            if (iVar.s(bVar) != null && iVar.u(bVar) != null) {
                s0(h0(iVar, bVar), iVar, bVar);
            }
            i<K, V> iVarS = iVar.s(bVar) != null ? iVar.s(bVar) : iVar.u(bVar);
            if (iVarS != null) {
                iVarS.C(iVar.t(bVar), bVar);
                if (iVar.t(bVar) == null) {
                    this.f335554a[bVar.ordinal()] = iVarS;
                } else if (iVar == iVar.t(bVar).s(bVar)) {
                    iVar.t(bVar).B(iVarS, bVar);
                } else {
                    iVar.t(bVar).E(iVarS, bVar);
                }
                iVar.B(null, bVar);
                iVar.E(null, bVar);
                iVar.C(null, bVar);
                if (W(iVar, bVar)) {
                    E(iVarS, bVar);
                }
            } else if (iVar.t(bVar) == null) {
                this.f335554a[bVar.ordinal()] = null;
            } else {
                if (W(iVar, bVar)) {
                    E(iVar, bVar);
                }
                if (iVar.t(bVar) != null) {
                    if (iVar == iVar.t(bVar).s(bVar)) {
                        iVar.t(bVar).B(null, bVar);
                    } else {
                        iVar.t(bVar).E(null, bVar);
                    }
                    iVar.C(null, bVar);
                }
            }
        }
        r0();
    }

    private void E(i<K, V> iVar, b bVar) {
        while (iVar != this.f335554a[bVar.ordinal()] && W(iVar, bVar)) {
            if (iVar.x(bVar)) {
                i<K, V> iVarR = R(Q(iVar, bVar), bVar);
                if (X(iVarR, bVar)) {
                    e0(iVarR, bVar);
                    f0(Q(iVar, bVar), bVar);
                    p0(Q(iVar, bVar), bVar);
                    iVarR = R(Q(iVar, bVar), bVar);
                }
                if (W(O(iVarR, bVar), bVar) && W(R(iVarR, bVar), bVar)) {
                    f0(iVarR, bVar);
                    iVar = Q(iVar, bVar);
                } else {
                    if (W(R(iVarR, bVar), bVar)) {
                        e0(O(iVarR, bVar), bVar);
                        f0(iVarR, bVar);
                        q0(iVarR, bVar);
                        iVarR = R(Q(iVar, bVar), bVar);
                    }
                    z(Q(iVar, bVar), iVarR, bVar);
                    e0(Q(iVar, bVar), bVar);
                    e0(R(iVarR, bVar), bVar);
                    p0(Q(iVar, bVar), bVar);
                    iVar = this.f335554a[bVar.ordinal()];
                }
            } else {
                i<K, V> iVarO = O(Q(iVar, bVar), bVar);
                if (X(iVarO, bVar)) {
                    e0(iVarO, bVar);
                    f0(Q(iVar, bVar), bVar);
                    q0(Q(iVar, bVar), bVar);
                    iVarO = O(Q(iVar, bVar), bVar);
                }
                if (W(R(iVarO, bVar), bVar) && W(O(iVarO, bVar), bVar)) {
                    f0(iVarO, bVar);
                    iVar = Q(iVar, bVar);
                } else {
                    if (W(O(iVarO, bVar), bVar)) {
                        e0(R(iVarO, bVar), bVar);
                        f0(iVarO, bVar);
                        p0(iVarO, bVar);
                        iVarO = O(Q(iVar, bVar), bVar);
                    }
                    z(Q(iVar, bVar), iVarO, bVar);
                    e0(Q(iVar, bVar), bVar);
                    e0(O(iVarO, bVar), bVar);
                    q0(Q(iVar, bVar), bVar);
                    iVar = this.f335554a[bVar.ordinal()];
                }
            }
        }
        e0(iVar, bVar);
    }

    private void F(i<K, V> iVar, b bVar) {
        f0(iVar, bVar);
        while (iVar != null && iVar != this.f335554a[bVar.ordinal()] && X(iVar.t(bVar), bVar)) {
            if (iVar.x(bVar)) {
                i<K, V> iVarR = R(L(iVar, bVar), bVar);
                if (X(iVarR, bVar)) {
                    e0(Q(iVar, bVar), bVar);
                    e0(iVarR, bVar);
                    f0(L(iVar, bVar), bVar);
                    iVar = L(iVar, bVar);
                } else {
                    if (iVar.z(bVar)) {
                        iVar = Q(iVar, bVar);
                        p0(iVar, bVar);
                    }
                    e0(Q(iVar, bVar), bVar);
                    f0(L(iVar, bVar), bVar);
                    if (L(iVar, bVar) != null) {
                        q0(L(iVar, bVar), bVar);
                    }
                }
            } else {
                i<K, V> iVarO = O(L(iVar, bVar), bVar);
                if (X(iVarO, bVar)) {
                    e0(Q(iVar, bVar), bVar);
                    e0(iVarO, bVar);
                    f0(L(iVar, bVar), bVar);
                    iVar = L(iVar, bVar);
                } else {
                    if (iVar.x(bVar)) {
                        iVar = Q(iVar, bVar);
                        q0(iVar, bVar);
                    }
                    e0(Q(iVar, bVar), bVar);
                    f0(L(iVar, bVar), bVar);
                    if (L(iVar, bVar) != null) {
                        p0(L(iVar, bVar), bVar);
                    }
                }
            }
        }
        e0(this.f335554a[bVar.ordinal()], bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V G(Object obj) {
        i<K, V> iVarC0 = c0(obj);
        if (iVarC0 == null) {
            return null;
        }
        D(iVarC0);
        return (V) iVarC0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K H(Object obj) {
        i<K, V> iVarD0 = d0(obj);
        if (iVarD0 == null) {
            return null;
        }
        D(iVarD0);
        return (K) iVarD0.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String I(b bVar) {
        int i10 = this.f335555b;
        if (i10 == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 32);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        a0<?, ?> a0VarP = P(bVar);
        boolean zHasNext = a0VarP.hasNext();
        while (zHasNext) {
            Object next = a0VarP.next();
            Object value = a0VarP.getValue();
            if (next == this) {
                next = "(this Map)";
            }
            sb2.append(next);
            sb2.append('=');
            if (value == this) {
                value = "(this Map)";
            }
            sb2.append(value);
            zHasNext = a0VarP.hasNext();
            if (zHasNext) {
                sb2.append(", ");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    private i<K, V> L(i<K, V> iVar, b bVar) {
        return Q(Q(iVar, bVar), bVar);
    }

    private i<K, V> O(i<K, V> iVar, b bVar) {
        if (iVar == null) {
            return null;
        }
        return iVar.s(bVar);
    }

    private a0<?, ?> P(b bVar) {
        int i10 = a.f335561a[bVar.ordinal()];
        if (i10 == 1) {
            return new n(b.KEY);
        }
        if (i10 == 2) {
            return new g(b.VALUE);
        }
        throw new IllegalArgumentException();
    }

    private i<K, V> Q(i<K, V> iVar, b bVar) {
        if (iVar == null) {
            return null;
        }
        return iVar.t(bVar);
    }

    private i<K, V> R(i<K, V> iVar, b bVar) {
        if (iVar == null) {
            return null;
        }
        return iVar.u(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i<K, V> S(i<K, V> iVar, b bVar) {
        if (iVar != null) {
            while (iVar.u(bVar) != null) {
                iVar = iVar.u(bVar);
            }
        }
        return iVar;
    }

    private void U() {
        g0();
        this.f335555b++;
    }

    private void V(i<K, V> iVar) throws IllegalArgumentException {
        i<K, V> iVarS = this.f335554a[b.VALUE.ordinal()];
        while (true) {
            int iY = y(iVar.getValue(), iVarS.getValue());
            if (iY == 0) {
                throw new IllegalArgumentException("Cannot store a duplicate value (\"" + iVar.q(b.VALUE) + "\") in this Map");
            }
            if (iY < 0) {
                b bVar = b.VALUE;
                if (iVarS.s(bVar) == null) {
                    iVarS.B(iVar, bVar);
                    iVar.C(iVarS, bVar);
                    F(iVar, bVar);
                    return;
                }
                iVarS = iVarS.s(bVar);
            } else {
                b bVar2 = b.VALUE;
                if (iVarS.u(bVar2) == null) {
                    iVarS.E(iVar, bVar2);
                    iVar.C(iVarS, bVar2);
                    F(iVar, bVar2);
                    return;
                }
                iVarS = iVarS.u(bVar2);
            }
        }
    }

    private static boolean W(i<?, ?> iVar, b bVar) {
        return iVar == null || iVar.w(bVar);
    }

    private static boolean X(i<?, ?> iVar, b bVar) {
        return iVar != null && iVar.y(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i<K, V> a0(i<K, V> iVar, b bVar) {
        if (iVar != null) {
            while (iVar.s(bVar) != null) {
                iVar = iVar.s(bVar);
            }
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends Comparable<T>> i<K, V> b0(Object obj, b bVar) {
        i<K, V> iVarS = this.f335554a[bVar.ordinal()];
        while (iVarS != null) {
            int iY = y((Comparable) obj, (Comparable) iVarS.q(bVar));
            if (iY == 0) {
                return iVarS;
            }
            iVarS = iY < 0 ? iVarS.s(bVar) : iVarS.u(bVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i<K, V> c0(Object obj) {
        return b0(obj, b.KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i<K, V> d0(Object obj) {
        return b0(obj, b.VALUE);
    }

    private static void e0(i<?, ?> iVar, b bVar) {
        if (iVar != null) {
            iVar.A(bVar);
        }
    }

    private static void f0(i<?, ?> iVar, b bVar) {
        if (iVar != null) {
            iVar.D(bVar);
        }
    }

    private void g0() {
        this.f335556c++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i<K, V> h0(i<K, V> iVar, b bVar) {
        if (iVar == null) {
            return null;
        }
        if (iVar.u(bVar) != null) {
            return a0(iVar.u(bVar), bVar);
        }
        i<K, V> iVarT = iVar.t(bVar);
        while (true) {
            i<K, V> iVar2 = iVar;
            iVar = iVarT;
            if (iVar == null || iVar2 != iVar.u(bVar)) {
                break;
            }
            iVarT = iVar.t(bVar);
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i<K, V> j0(i<K, V> iVar, b bVar) {
        if (iVar == null) {
            return null;
        }
        if (iVar.s(bVar) != null) {
            return S(iVar.s(bVar), bVar);
        }
        i<K, V> iVarT = iVar.t(bVar);
        while (true) {
            i<K, V> iVar2 = iVar;
            iVar = iVarT;
            if (iVar == null || iVar2 != iVar.s(bVar)) {
                break;
            }
            iVarT = iVar.t(bVar);
        }
        return iVar;
    }

    private void p0(i<K, V> iVar, b bVar) {
        i<K, V> iVarU = iVar.u(bVar);
        iVar.E(iVarU.s(bVar), bVar);
        if (iVarU.s(bVar) != null) {
            iVarU.s(bVar).C(iVar, bVar);
        }
        iVarU.C(iVar.t(bVar), bVar);
        if (iVar.t(bVar) == null) {
            this.f335554a[bVar.ordinal()] = iVarU;
        } else if (iVar.t(bVar).s(bVar) == iVar) {
            iVar.t(bVar).B(iVarU, bVar);
        } else {
            iVar.t(bVar).E(iVarU, bVar);
        }
        iVarU.B(iVar, bVar);
        iVar.C(iVarU, bVar);
    }

    private void q0(i<K, V> iVar, b bVar) {
        i<K, V> iVarS = iVar.s(bVar);
        iVar.B(iVarS.u(bVar), bVar);
        if (iVarS.u(bVar) != null) {
            iVarS.u(bVar).C(iVar, bVar);
        }
        iVarS.C(iVar.t(bVar), bVar);
        if (iVar.t(bVar) == null) {
            this.f335554a[bVar.ordinal()] = iVarS;
        } else if (iVar.t(bVar).u(bVar) == iVar) {
            iVar.t(bVar).E(iVarS, bVar);
        } else {
            iVar.t(bVar).B(iVarS, bVar);
        }
        iVarS.E(iVar, bVar);
        iVar.C(iVarS, bVar);
    }

    private void r0() {
        g0();
        this.f335555b--;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f335554a = new i[2];
        int i10 = objectInputStream.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            put((Comparable) objectInputStream.readObject(), (Comparable) objectInputStream.readObject());
        }
    }

    private void s0(i<K, V> iVar, i<K, V> iVar2, b bVar) {
        i<K, V> iVarT = iVar.t(bVar);
        i iVarS = iVar.s(bVar);
        i iVarU = iVar.u(bVar);
        i<K, V> iVarT2 = iVar2.t(bVar);
        i iVarS2 = iVar2.s(bVar);
        i iVarU2 = iVar2.u(bVar);
        boolean z10 = false;
        boolean z11 = iVar.t(bVar) != null && iVar == iVar.t(bVar).s(bVar);
        if (iVar2.t(bVar) != null && iVar2 == iVar2.t(bVar).s(bVar)) {
            z10 = true;
        }
        if (iVar == iVarT2) {
            iVar.C(iVar2, bVar);
            if (z10) {
                iVar2.B(iVar, bVar);
                iVar2.E(iVarU, bVar);
            } else {
                iVar2.E(iVar, bVar);
                iVar2.B(iVarS, bVar);
            }
        } else {
            iVar.C(iVarT2, bVar);
            if (iVarT2 != null) {
                if (z10) {
                    iVarT2.B(iVar, bVar);
                } else {
                    iVarT2.E(iVar, bVar);
                }
            }
            iVar2.B(iVarS, bVar);
            iVar2.E(iVarU, bVar);
        }
        if (iVar2 == iVarT) {
            iVar2.C(iVar, bVar);
            if (z11) {
                iVar.B(iVar2, bVar);
                iVar.E(iVarU2, bVar);
            } else {
                iVar.E(iVar2, bVar);
                iVar.B(iVarS2, bVar);
            }
        } else {
            iVar2.C(iVarT, bVar);
            if (iVarT != null) {
                if (z11) {
                    iVarT.B(iVar2, bVar);
                } else {
                    iVarT.E(iVar2, bVar);
                }
            }
            iVar.B(iVarS2, bVar);
            iVar.E(iVarU2, bVar);
        }
        if (iVar.s(bVar) != null) {
            iVar.s(bVar).C(iVar, bVar);
        }
        if (iVar.u(bVar) != null) {
            iVar.u(bVar).C(iVar, bVar);
        }
        if (iVar2.s(bVar) != null) {
            iVar2.s(bVar).C(iVar2, bVar);
        }
        if (iVar2.u(bVar) != null) {
            iVar2.u(bVar).C(iVar2, bVar);
        }
        iVar.G(iVar2, bVar);
        if (this.f335554a[bVar.ordinal()] == iVar) {
            this.f335554a[bVar.ordinal()] = iVar2;
        } else {
            if (this.f335554a[bVar.ordinal()] == iVar2) {
                this.f335554a[bVar.ordinal()] = iVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Object obj) {
        w(obj, b.KEY);
    }

    private static void v(Object obj, Object obj2) {
        u(obj);
        x(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void w(Object obj, b bVar) {
        if (obj == null) {
            throw new NullPointerException(bVar + " cannot be null");
        }
        if (obj instanceof Comparable) {
            return;
        }
        throw new ClassCastException(bVar + " must be Comparable");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private static void x(Object obj) {
        w(obj, b.VALUE);
    }

    private static <T extends Comparable<T>> int y(T t10, T t11) {
        return t10.compareTo(t11);
    }

    private void z(i<K, V> iVar, i<K, V> iVar2, b bVar) {
        if (iVar2 != null) {
            if (iVar == null) {
                iVar2.A(bVar);
            } else {
                iVar2.p(iVar, bVar);
            }
        }
    }

    @Override // org.apache.commons.collections4.j0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public K firstKey() {
        if (this.f335555b == 0) {
            throw new NoSuchElementException("Map is empty");
        }
        i<K, V>[] iVarArr = this.f335554a;
        b bVar = b.KEY;
        return (K) a0(iVarArr[bVar.ordinal()], bVar).getKey();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public V get(Object obj) {
        u(obj);
        i<K, V> iVarC0 = c0(obj);
        if (iVarC0 == null) {
            return null;
        }
        return (V) iVarC0.getValue();
    }

    @Override // org.apache.commons.collections4.e
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public K w2(Object obj) {
        x(obj);
        i<K, V> iVarD0 = d0(obj);
        if (iVarD0 == null) {
            return null;
        }
        return (K) iVarD0.getKey();
    }

    @Override // org.apache.commons.collections4.j0
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public K lastKey() {
        if (this.f335555b == 0) {
            throw new NoSuchElementException("Map is empty");
        }
        i<K, V>[] iVarArr = this.f335554a;
        b bVar = b.KEY;
        return (K) S(iVarArr[bVar.ordinal()], bVar).getKey();
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        g0();
        this.f335555b = 0;
        this.f335554a[b.KEY.ordinal()] = null;
        this.f335554a[b.VALUE.ordinal()] = null;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean containsKey(Object obj) {
        u(obj);
        return c0(obj) != null;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean containsValue(Object obj) {
        x(obj);
        return d0(obj) != null;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f335559f == null) {
            this.f335559f = new c();
        }
        return this.f335559f;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return A(obj, b.KEY);
    }

    @Override // java.util.Map
    public int hashCode() {
        return B(b.KEY);
    }

    @Override // org.apache.commons.collections4.j0
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public K C3(K k10) {
        u(k10);
        i<K, V> iVarH0 = h0(c0(k10), b.KEY);
        if (iVarH0 == null) {
            return null;
        }
        return (K) iVarH0.getKey();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean isEmpty() {
        return this.f335555b == 0;
    }

    @Override // org.apache.commons.collections4.j0
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public K E2(K k10) {
        u(k10);
        i<K, V> iVarJ0 = j0(c0(k10), b.KEY);
        if (iVarJ0 == null) {
            return null;
        }
        return (K) iVarJ0.getKey();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Set<K> keySet() {
        if (this.f335557d == null) {
            this.f335557d = new C2385h(b.KEY);
        }
        return this.f335557d;
    }

    @Override // org.apache.commons.collections4.e, java.util.Map, org.apache.commons.collections4.n0
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        V v11 = (V) get(k10);
        C(k10, v10);
        return v11;
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public V remove(Object obj) {
        return (V) G(obj);
    }

    @Override // org.apache.commons.collections4.e
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public K N2(Object obj) {
        return (K) H(obj);
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public int size() {
        return this.f335555b;
    }

    public String toString() {
        return I(b.KEY);
    }

    @Override // org.apache.commons.collections4.e
    public h0<V, K> N() {
        if (this.f335560g == null) {
            this.f335560g = new d();
        }
        return this.f335560g;
    }

    @Override // org.apache.commons.collections4.s
    public k0<K, V> T() {
        return isEmpty() ? p.b() : new n(b.KEY);
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public Set<V> values() {
        if (this.f335558e == null) {
            this.f335558e = new j(b.KEY);
        }
        return this.f335558e;
    }

    public h(Map<? extends K, ? extends V> map) {
        this();
        putAll(map);
    }
}
