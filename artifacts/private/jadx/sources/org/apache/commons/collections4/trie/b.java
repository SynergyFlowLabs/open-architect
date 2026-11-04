package org.apache.commons.collections4.trie;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.collections4.k0;

/* JADX INFO: loaded from: classes14.dex */
abstract class b<K, V> extends org.apache.commons.collections4.trie.a<K, V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f336315i = 5155253417231339498L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient j<K, V> f336316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile transient Set<K> f336317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile transient Collection<V> f336318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile transient Set<Map.Entry<K, V>> f336319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient int f336320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected transient int f336321h;

    /* JADX INFO: renamed from: org.apache.commons.collections4.trie.b$b, reason: collision with other inner class name */
    private class C2401b extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: org.apache.commons.collections4.trie.b$b$a */
        private class a extends b<K, V>.k<Map.Entry<K, V>> {
            private a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return c();
            }
        }

        private C2401b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            j<K, V> jVarP;
            return (obj instanceof Map.Entry) && (jVarP = b.this.p(((Map.Entry) obj).getKey())) != null && jVarP.equals(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry) || !contains(obj)) {
                return false;
            }
            b.this.remove(((Map.Entry) obj).getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b.this.size();
        }
    }

    private class c extends AbstractSet<K> {

        private class a extends b<K, V>.k<K> {
            private a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return c().getKey();
            }
        }

        private c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return b.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size = size();
            b.this.remove(obj);
            return size != size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b.this.size();
        }
    }

    private final class d extends b<K, V>.g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b<K, V>.e f336326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private j<K, V> f336327f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f336328g;

        private final class a extends b<K, V>.k<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final K f336330e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final int f336331f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final int f336332g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f336333h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private j<K, V> f336334i;

            a(j<K, V> jVar, K k10, int i10, int i11) {
                super();
                this.f336334i = jVar;
                this.f336368b = b.this.n(jVar);
                this.f336330e = k10;
                this.f336331f = i10;
                this.f336332g = i11;
            }

            @Override // org.apache.commons.collections4.trie.b.k
            protected j<K, V> b(j<K, V> jVar) {
                return b.this.B(jVar, this.f336334i);
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                j<K, V> jVarC = c();
                if (this.f336333h) {
                    this.f336368b = null;
                }
                return jVarC;
            }

            @Override // org.apache.commons.collections4.trie.b.k, java.util.Iterator
            public void remove() {
                j<K, V> jVar = this.f336334i;
                int i10 = jVar.f336362d;
                boolean z10 = this.f336369c == jVar;
                super.remove();
                if (i10 != this.f336334i.f336362d || z10) {
                    this.f336334i = b.this.K(this.f336330e, this.f336331f, this.f336332g);
                }
                if (this.f336332g >= this.f336334i.f336362d) {
                    this.f336333h = true;
                }
            }
        }

        /* JADX INFO: renamed from: org.apache.commons.collections4.trie.b$d$b, reason: collision with other inner class name */
        private final class C2402b implements Iterator<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final j<K, V> f336336a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f336337b = 0;

            public C2402b(j<K, V> jVar) {
                this.f336336a = jVar;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                int i10 = this.f336337b;
                if (i10 != 0) {
                    throw new NoSuchElementException();
                }
                this.f336337b = i10 + 1;
                return this.f336336a;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f336337b == 0;
            }

            @Override // java.util.Iterator
            public void remove() {
                int i10 = this.f336337b;
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                this.f336337b = i10 + 1;
                b.this.D(this.f336336a);
            }
        }

        public d(b<K, V>.e eVar) {
            super(eVar);
            this.f336328g = 0;
            this.f336326e = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // org.apache.commons.collections4.trie.b.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            b bVar = b.this;
            if (bVar.f336321h != this.f336328g) {
                this.f336327f = bVar.K(((e) this.f336326e).f336339c, ((e) this.f336326e).f336340d, ((e) this.f336326e).f336341e);
                this.f336328g = b.this.f336321h;
            }
            if (this.f336327f == null) {
                return Collections.EMPTY_SET.iterator();
            }
            int i10 = ((e) this.f336326e).f336341e;
            j<K, V> jVar = this.f336327f;
            return i10 > jVar.f336362d ? new C2402b(jVar) : new a(jVar, ((e) this.f336326e).f336339c, ((e) this.f336326e).f336340d, ((e) this.f336326e).f336341e);
        }

        @Override // org.apache.commons.collections4.trie.b.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f336326e.o();
        }
    }

    private class e extends b<K, V>.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final K f336339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f336340d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f336341e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private K f336342f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private K f336343g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private transient int f336344h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f336345i;

        /* JADX INFO: Access modifiers changed from: private */
        public int o() {
            Map.Entry<K, V> next;
            if (this.f336345i == -1 || b.this.f336321h != this.f336344h) {
                Iterator<Map.Entry<K, V>> it = super.entrySet().iterator();
                this.f336345i = 0;
                if (it.hasNext()) {
                    next = it.next();
                    this.f336345i = 1;
                } else {
                    next = null;
                }
                K key = next == null ? null : next.getKey();
                this.f336342f = key;
                if (key != null) {
                    j<K, V> jVarC = b.this.C((j) next);
                    this.f336342f = jVarC == null ? null : jVarC.getKey();
                }
                this.f336343g = this.f336342f;
                while (it.hasNext()) {
                    this.f336345i++;
                    next = it.next();
                }
                K key2 = next == null ? null : next.getKey();
                this.f336343g = key2;
                if (key2 != null) {
                    j<K, V> jVarZ = b.this.z((j) next);
                    this.f336343g = jVarZ != null ? jVarZ.getKey() : null;
                }
                this.f336344h = b.this.f336321h;
            }
            return this.f336345i;
        }

        @Override // org.apache.commons.collections4.trie.b.h
        protected Set<Map.Entry<K, V>> a() {
            return new d(this);
        }

        @Override // org.apache.commons.collections4.trie.b.h
        protected SortedMap<K, V> b(K k10, boolean z10, K k11, boolean z11) {
            return new f(k10, z10, k11, z11);
        }

        @Override // org.apache.commons.collections4.trie.b.h
        public K c() {
            return this.f336342f;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterator<Map.Entry<K, V>> it = b.this.entrySet().iterator();
            Set<K> setKeySet = keySet();
            while (it.hasNext()) {
                if (setKeySet.contains(it.next().getKey())) {
                    it.remove();
                }
            }
        }

        @Override // org.apache.commons.collections4.trie.b.h
        public K d() {
            return this.f336343g;
        }

        @Override // org.apache.commons.collections4.trie.b.h
        protected boolean e(K k10, boolean z10) {
            return b.this.f().g(this.f336339c, this.f336340d, this.f336341e, k10);
        }

        @Override // org.apache.commons.collections4.trie.b.h
        protected boolean f(K k10) {
            return b.this.f().g(this.f336339c, this.f336340d, this.f336341e, k10);
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            o();
            K k10 = this.f336342f;
            j<K, V> jVarL = k10 == null ? b.this.l() : b.this.t(k10);
            K key = jVarL != null ? jVarL.getKey() : null;
            if (jVarL == null || !b.this.f().g(this.f336339c, this.f336340d, this.f336341e, key)) {
                throw new NoSuchElementException();
            }
            return key;
        }

        @Override // org.apache.commons.collections4.trie.b.h
        protected boolean g(K k10) {
            return f(k10);
        }

        @Override // org.apache.commons.collections4.trie.b.h
        protected boolean h(K k10, boolean z10) {
            return b.this.f().g(this.f336339c, this.f336340d, this.f336341e, k10);
        }

        @Override // org.apache.commons.collections4.trie.b.h
        public boolean i() {
            return false;
        }

        @Override // org.apache.commons.collections4.trie.b.h
        public boolean j() {
            return false;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            o();
            K k10 = this.f336343g;
            j<K, V> jVarX = k10 == null ? b.this.x() : b.this.y(k10);
            K key = jVarX != null ? jVarX.getKey() : null;
            if (jVarX == null || !b.this.f().g(this.f336339c, this.f336340d, this.f336341e, key)) {
                throw new NoSuchElementException();
            }
            return key;
        }

        private e(K k10, int i10, int i11) {
            super();
            this.f336342f = null;
            this.f336343g = null;
            this.f336344h = 0;
            this.f336345i = -1;
            this.f336339c = k10;
            this.f336340d = i10;
            this.f336341e = i11;
        }
    }

    private class f extends b<K, V>.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final K f336347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final K f336348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f336349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f336350f;

        protected f(b bVar, K k10, K k11) {
            this(k10, true, k11, false);
        }

        @Override // org.apache.commons.collections4.trie.b.h
        protected Set<Map.Entry<K, V>> a() {
            return new g(this);
        }

        @Override // org.apache.commons.collections4.trie.b.h
        protected SortedMap<K, V> b(K k10, boolean z10, K k11, boolean z11) {
            return new f(k10, z10, k11, z11);
        }

        @Override // org.apache.commons.collections4.trie.b.h
        public K c() {
            return this.f336347c;
        }

        @Override // org.apache.commons.collections4.trie.b.h
        public K d() {
            return this.f336348d;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            j<K, V> jVarJ;
            K k10 = this.f336347c;
            if (k10 == null) {
                jVarJ = b.this.l();
            } else {
                jVarJ = this.f336349e ? b.this.j(k10) : b.this.t(k10);
            }
            K key = jVarJ != null ? jVarJ.getKey() : null;
            if (jVarJ == null || !(this.f336348d == null || h(key, false))) {
                throw new NoSuchElementException();
            }
            return key;
        }

        @Override // org.apache.commons.collections4.trie.b.h
        public boolean i() {
            return this.f336349e;
        }

        @Override // org.apache.commons.collections4.trie.b.h
        public boolean j() {
            return this.f336350f;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            j<K, V> jVarM;
            K k10 = this.f336348d;
            if (k10 == null) {
                jVarM = b.this.x();
            } else {
                jVarM = this.f336350f ? b.this.m(k10) : b.this.y(k10);
            }
            K key = jVarM != null ? jVarM.getKey() : null;
            if (jVarM == null || !(this.f336347c == null || e(key, false))) {
                throw new NoSuchElementException();
            }
            return key;
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected f(K k10, boolean z10, K k11, boolean z11) {
            super();
            if (k10 == 0 && k11 == 0) {
                throw new IllegalArgumentException("must have a from or to!");
            }
            if (k10 != 0 && k11 != 0 && b.this.f().compare(k10, k11) > 0) {
                throw new IllegalArgumentException("fromKey > toKey");
            }
            this.f336347c = k10;
            this.f336349e = z10;
            this.f336348d = k11;
            this.f336350f = z11;
        }
    }

    private class g extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b<K, V>.h f336352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private transient int f336353b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private transient int f336354c;

        private final class a extends b<K, V>.k<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final K f336356e;

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                j<K, V> jVar = this.f336368b;
                if (jVar == null || org.apache.commons.collections4.trie.a.d(jVar.f336313a, this.f336356e)) {
                    throw new NoSuchElementException();
                }
                return c();
            }

            @Override // org.apache.commons.collections4.trie.b.k, java.util.Iterator
            public boolean hasNext() {
                j<K, V> jVar = this.f336368b;
                return (jVar == null || org.apache.commons.collections4.trie.a.d(jVar.f336313a, this.f336356e)) ? false : true;
            }

            private a(j<K, V> jVar, j<K, V> jVar2) {
                super(jVar);
                this.f336356e = jVar2 != null ? jVar2.getKey() : null;
            }
        }

        public g(b<K, V>.h hVar) {
            if (hVar == null) {
                throw new NullPointerException("delegate");
            }
            this.f336352a = hVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            j<K, V> jVarP;
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            return this.f336352a.f((K) key) && (jVarP = b.this.p(key)) != null && org.apache.commons.collections4.trie.a.d(jVarP.getValue(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return !iterator().hasNext();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            K kC = this.f336352a.c();
            K kD = this.f336352a.d();
            return new a(kC == null ? b.this.l() : b.this.j(kC), kD != null ? b.this.j(kD) : null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            j<K, V> jVarP;
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            if (!this.f336352a.f((K) key) || (jVarP = b.this.p(key)) == null || !org.apache.commons.collections4.trie.a.d(jVarP.getValue(), entry.getValue())) {
                return false;
            }
            b.this.D(jVarP);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            if (this.f336353b == -1 || this.f336354c != b.this.f336321h) {
                this.f336353b = 0;
                Iterator<Map.Entry<K, V>> it = iterator();
                while (it.hasNext()) {
                    this.f336353b++;
                    it.next();
                }
                this.f336354c = b.this.f336321h;
            }
            return this.f336353b;
        }
    }

    private abstract class h extends AbstractMap<K, V> implements SortedMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile transient Set<Map.Entry<K, V>> f336358a;

        private h() {
        }

        protected abstract Set<Map.Entry<K, V>> a();

        protected abstract SortedMap<K, V> b(K k10, boolean z10, K k11, boolean z11);

        protected abstract K c();

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return b.this.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (f(b.this.c(obj))) {
                return b.this.containsKey(obj);
            }
            int i10 = 5 | 0;
            return false;
        }

        protected abstract K d();

        protected boolean e(K k10, boolean z10) {
            Object objC = c();
            boolean zI = i();
            int iCompare = b.this.f().compare(k10, objC);
            if (zI || z10) {
                return iCompare >= 0;
            }
            return iCompare > 0;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            if (this.f336358a == null) {
                this.f336358a = a();
            }
            return this.f336358a;
        }

        protected boolean f(K k10) {
            return (c() == null || e(k10, false)) && (d() == null || h(k10, false));
        }

        protected boolean g(K k10) {
            return (c() == null || e(k10, false)) && (d() == null || h(k10, true));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            if (f(b.this.c(obj))) {
                return (V) b.this.get(obj);
            }
            return null;
        }

        protected boolean h(K k10, boolean z10) {
            Object objD = d();
            boolean zJ = j();
            int iCompare = b.this.f().compare(k10, objD);
            if (zJ || z10) {
                return iCompare <= 0;
            }
            return iCompare < 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(K k10) {
            if (g(k10)) {
                return b(c(), i(), k10, j());
            }
            throw new IllegalArgumentException("ToKey is out of range: " + k10);
        }

        protected abstract boolean i();

        protected abstract boolean j();

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k10, V v10) {
            if (f(k10)) {
                return (V) b.this.put(k10, v10);
            }
            throw new IllegalArgumentException("Key is out of range: " + k10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            if (f(b.this.c(obj))) {
                return (V) b.this.remove(obj);
            }
            return null;
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(K k10, K k11) {
            if (!g(k10)) {
                throw new IllegalArgumentException("FromKey is out of range: " + k10);
            }
            if (g(k11)) {
                return b(k10, i(), k11, j());
            }
            throw new IllegalArgumentException("ToKey is out of range: " + k11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(K k10) {
            if (g(k10)) {
                return b(k10, i(), d(), j());
            }
            throw new IllegalArgumentException("FromKey is out of range: " + k10);
        }
    }

    private static class i<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private E f336360a;

        private i() {
        }

        public E a() {
            return this.f336360a;
        }

        public void b(E e10) {
            this.f336360a = e10;
        }
    }

    protected static class j<K, V> extends org.apache.commons.collections4.trie.a.AbstractC2400a<K, V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f336361i = 4596023148184140013L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected int f336362d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected j<K, V> f336363e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected j<K, V> f336364f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected j<K, V> f336365g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected j<K, V> f336366h;

        public j(K k10, V v10, int i10) {
            super(k10, v10);
            this.f336362d = i10;
            this.f336363e = null;
            this.f336364f = this;
            this.f336365g = null;
            this.f336366h = this;
        }

        public boolean b() {
            return this.f336313a == null;
        }

        public boolean c() {
            return !d();
        }

        public boolean d() {
            return (this.f336364f == this || this.f336365g == this) ? false : true;
        }

        @Override // org.apache.commons.collections4.trie.a.AbstractC2400a
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.f336362d == -1) {
                sb2.append("RootEntry(");
            } else {
                sb2.append("Entry(");
            }
            sb2.append("key=");
            sb2.append(getKey());
            sb2.append(" [");
            sb2.append(this.f336362d);
            sb2.append("], ");
            sb2.append("value=");
            sb2.append(getValue());
            sb2.append(", ");
            j<K, V> jVar = this.f336363e;
            if (jVar == null) {
                sb2.append("parent=");
                sb2.append(AbstractJsonLexerKt.NULL);
            } else if (jVar.f336362d == -1) {
                sb2.append("parent=");
                sb2.append(org.slf4j.c.Y2);
            } else {
                sb2.append("parent=");
                sb2.append(this.f336363e.getKey());
                sb2.append(" [");
                sb2.append(this.f336363e.f336362d);
                sb2.append("]");
            }
            sb2.append(", ");
            j<K, V> jVar2 = this.f336364f;
            if (jVar2 == null) {
                sb2.append("left=");
                sb2.append(AbstractJsonLexerKt.NULL);
            } else if (jVar2.f336362d == -1) {
                sb2.append("left=");
                sb2.append(org.slf4j.c.Y2);
            } else {
                sb2.append("left=");
                sb2.append(this.f336364f.getKey());
                sb2.append(" [");
                sb2.append(this.f336364f.f336362d);
                sb2.append("]");
            }
            sb2.append(", ");
            j<K, V> jVar3 = this.f336365g;
            if (jVar3 == null) {
                sb2.append("right=");
                sb2.append(AbstractJsonLexerKt.NULL);
            } else if (jVar3.f336362d == -1) {
                sb2.append("right=");
                sb2.append(org.slf4j.c.Y2);
            } else {
                sb2.append("right=");
                sb2.append(this.f336365g.getKey());
                sb2.append(" [");
                sb2.append(this.f336365g.f336362d);
                sb2.append("]");
            }
            sb2.append(", ");
            j<K, V> jVar4 = this.f336366h;
            if (jVar4 != null) {
                if (jVar4.f336362d == -1) {
                    sb2.append("predecessor=");
                    sb2.append(org.slf4j.c.Y2);
                } else {
                    sb2.append("predecessor=");
                    sb2.append(this.f336366h.getKey());
                    sb2.append(" [");
                    sb2.append(this.f336366h.f336362d);
                    sb2.append("]");
                }
            }
            sb2.append(")");
            return sb2.toString();
        }
    }

    private class l extends b<K, V>.k<K> implements k0<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected j<K, V> f336371e;

        private l() {
            super();
        }

        @Override // org.apache.commons.collections4.trie.b.k
        protected j<K, V> c() {
            j<K, V> jVarC = super.c();
            this.f336371e = jVarC;
            return jVarC;
        }

        protected j<K, V> d() {
            int i10 = this.f336367a;
            b bVar = b.this;
            if (i10 != bVar.f336321h) {
                throw new ConcurrentModificationException();
            }
            j<K, V> jVar = this.f336371e;
            if (jVar == null) {
                throw new NoSuchElementException();
            }
            this.f336371e = bVar.C(jVar);
            this.f336368b = this.f336369c;
            this.f336369c = jVar;
            return jVar;
        }

        @Override // org.apache.commons.collections4.a0
        public K getKey() {
            j<K, V> jVar = this.f336369c;
            if (jVar != null) {
                return jVar.getKey();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.commons.collections4.a0
        public V getValue() {
            j<K, V> jVar = this.f336369c;
            if (jVar != null) {
                return jVar.getValue();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.commons.collections4.k0, org.apache.commons.collections4.i0
        public boolean hasPrevious() {
            return this.f336371e != null;
        }

        @Override // java.util.Iterator, org.apache.commons.collections4.a0
        public K next() {
            return c().getKey();
        }

        @Override // org.apache.commons.collections4.k0, org.apache.commons.collections4.i0
        public K previous() {
            return d().getKey();
        }

        @Override // org.apache.commons.collections4.a0
        public V setValue(V v10) {
            j<K, V> jVar = this.f336369c;
            if (jVar != null) {
                return jVar.setValue(v10);
            }
            throw new IllegalStateException();
        }
    }

    private class m extends AbstractCollection<V> {

        private class a extends b<K, V>.k<V> {
            private a() {
                super();
            }

            @Override // java.util.Iterator
            public V next() {
                return c().getValue();
            }
        }

        private m() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            b.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return b.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            Iterator<V> it = iterator();
            while (it.hasNext()) {
                if (org.apache.commons.collections4.trie.a.d(it.next(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return b.this.size();
        }
    }

    protected b(org.apache.commons.collections4.trie.c<? super K> cVar) {
        super(cVar);
        this.f336316c = new j<>(null, null, -1);
        this.f336320g = 0;
        this.f336321h = 0;
    }

    private void E(j<K, V> jVar) {
        if (jVar == this.f336316c) {
            throw new IllegalArgumentException("Cannot delete root Entry!");
        }
        if (!jVar.c()) {
            throw new IllegalArgumentException(jVar + " is not an external Entry!");
        }
        j<K, V> jVar2 = jVar.f336363e;
        j<K, V> jVar3 = jVar.f336364f;
        if (jVar3 == jVar) {
            jVar3 = jVar.f336365g;
        }
        if (jVar2.f336364f == jVar) {
            jVar2.f336364f = jVar3;
        } else {
            jVar2.f336365g = jVar3;
        }
        if (jVar3.f336362d > jVar2.f336362d) {
            jVar3.f336363e = jVar2;
        } else {
            jVar3.f336366h = jVar2;
        }
    }

    private void F(j<K, V> jVar) {
        if (jVar == this.f336316c) {
            throw new IllegalArgumentException("Cannot delete root Entry!");
        }
        if (!jVar.d()) {
            throw new IllegalArgumentException(jVar + " is not an internal Entry!");
        }
        j<K, V> jVar2 = jVar.f336366h;
        jVar2.f336362d = jVar.f336362d;
        j<K, V> jVar3 = jVar2.f336363e;
        j<K, V> jVar4 = jVar2.f336364f;
        if (jVar4 == jVar) {
            jVar4 = jVar2.f336365g;
        }
        if (jVar2.f336366h == jVar2 && jVar3 != jVar) {
            jVar2.f336366h = jVar3;
        }
        if (jVar3.f336364f == jVar2) {
            jVar3.f336364f = jVar4;
        } else {
            jVar3.f336365g = jVar4;
        }
        if (jVar4.f336362d > jVar3.f336362d) {
            jVar4.f336363e = jVar3;
        }
        j<K, V> jVar5 = jVar.f336364f;
        if (jVar5.f336363e == jVar) {
            jVar5.f336363e = jVar2;
        }
        j<K, V> jVar6 = jVar.f336365g;
        if (jVar6.f336363e == jVar) {
            jVar6.f336363e = jVar2;
        }
        j<K, V> jVar7 = jVar.f336363e;
        if (jVar7.f336364f == jVar) {
            jVar7.f336364f = jVar2;
        } else {
            jVar7.f336365g = jVar2;
        }
        jVar2.f336363e = jVar7;
        j<K, V> jVar8 = jVar.f336364f;
        jVar2.f336364f = jVar8;
        jVar2.f336365g = jVar.f336365g;
        if (w(jVar8, jVar2)) {
            jVar2.f336364f.f336366h = jVar2;
        }
        if (w(jVar2.f336365g, jVar2)) {
            jVar2.f336365g.f336366h = jVar2;
        }
    }

    private boolean I(j<K, V> jVar, int i10, K k10, int i11, i<Map.Entry<K, V>> iVar) {
        int i12 = jVar.f336362d;
        if (i12 <= i10) {
            if (jVar.b()) {
                return true;
            }
            iVar.b(jVar);
            return false;
        }
        if (g(k10, i12, i11)) {
            if (I(jVar.f336365g, jVar.f336362d, k10, i11, iVar)) {
                return I(jVar.f336364f, jVar.f336362d, k10, i11, iVar);
            }
        } else if (I(jVar.f336364f, jVar.f336362d, k10, i11, iVar)) {
            return I(jVar.f336365g, jVar.f336362d, k10, i11, iVar);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f336316c = new j<>(null, null, -1);
        int i10 = objectInputStream.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private SortedMap<K, V> s(K k10, int i10, int i11) {
        int i12 = i10 + i11;
        if (i12 <= h(k10)) {
            return i12 == 0 ? this : new e(k10, i10, i11);
        }
        throw new IllegalArgumentException(i10 + " + " + i11 + " > " + h(k10));
    }

    private void u() {
        this.f336321h++;
    }

    static boolean w(j<?, ?> jVar, j<?, ?> jVar2) {
        return (jVar == null || jVar.f336362d > jVar2.f336362d || jVar.b()) ? false : true;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    j<K, V> A(j<K, V> jVar, j<K, V> jVar2, j<K, V> jVar3) {
        j<K, V> jVar4;
        j<K, V> jVar5;
        if (jVar2 == null || jVar != jVar2.f336366h) {
            while (!jVar.f336364f.b() && jVar2 != (jVar4 = jVar.f336364f)) {
                if (w(jVar4, jVar)) {
                    return jVar.f336364f;
                }
                jVar = jVar.f336364f;
            }
        }
        if (jVar.b() || (jVar5 = jVar.f336365g) == null) {
            return null;
        }
        if (jVar2 != jVar5) {
            return w(jVar5, jVar) ? jVar.f336365g : A(jVar.f336365g, jVar2, jVar3);
        }
        while (true) {
            j<K, V> jVar6 = jVar.f336363e;
            j<K, V> jVar7 = jVar6.f336365g;
            if (jVar != jVar7) {
                if (jVar == jVar3 || jVar7 == null) {
                    return null;
                }
                if (jVar2 != jVar7 && w(jVar7, jVar6)) {
                    return jVar.f336363e.f336365g;
                }
                j<K, V> jVar8 = jVar.f336363e;
                j<K, V> jVar9 = jVar8.f336365g;
                if (jVar9 == jVar8) {
                    return null;
                }
                return A(jVar9, jVar2, jVar3);
            }
            if (jVar == jVar3) {
                return null;
            }
            jVar = jVar6;
        }
    }

    j<K, V> B(j<K, V> jVar, j<K, V> jVar2) {
        return jVar == null ? l() : A(jVar.f336366h, jVar, jVar2);
    }

    j<K, V> C(j<K, V> jVar) {
        j<K, V> jVar2;
        j<K, V> jVar3 = jVar.f336366h;
        if (jVar3 == null) {
            throw new IllegalArgumentException("must have come from somewhere!");
        }
        if (jVar3.f336365g == jVar) {
            return w(jVar3.f336364f, jVar3) ? jVar.f336366h.f336364f : o(jVar.f336366h.f336364f);
        }
        while (true) {
            jVar2 = jVar3.f336363e;
            if (jVar2 == null || jVar3 != jVar2.f336364f) {
                break;
            }
            jVar3 = jVar2;
        }
        if (jVar2 == null) {
            return null;
        }
        if (!w(jVar2.f336364f, jVar2)) {
            return o(jVar3.f336363e.f336364f);
        }
        j<K, V> jVar4 = jVar3.f336363e.f336364f;
        j<K, V> jVar5 = this.f336316c;
        if (jVar4 != jVar5) {
            return jVar4;
        }
        if (jVar5.b()) {
            return null;
        }
        return this.f336316c;
    }

    @Override // org.apache.commons.collections4.j0
    public K C3(K k10) {
        j<K, V> jVarZ;
        k10.getClass();
        j<K, V> jVarP = p(k10);
        if (jVarP == null || (jVarZ = z(jVarP)) == null) {
            return null;
        }
        return jVarZ.getKey();
    }

    V D(j<K, V> jVar) {
        if (jVar != this.f336316c) {
            if (jVar.d()) {
                F(jVar);
            } else {
                E(jVar);
            }
        }
        k();
        return jVar.a(null, null);
    }

    @Override // org.apache.commons.collections4.j0
    public K E2(K k10) {
        j<K, V> jVarC;
        k10.getClass();
        j<K, V> jVarP = p(k10);
        if (jVarP == null || (jVarC = C(jVarP)) == null) {
            return null;
        }
        return jVarC.getKey();
    }

    public Map.Entry<K, V> G(K k10) {
        int iH = h(k10);
        i<Map.Entry<K, V>> iVar = new i<>();
        if (I(this.f336316c.f336364f, -1, k10, iH, iVar)) {
            return null;
        }
        return iVar.a();
    }

    public K H(K k10) {
        Map.Entry<K, V> entryG = G(k10);
        if (entryG == null) {
            return null;
        }
        return entryG.getKey();
    }

    public V J(K k10) {
        Map.Entry<K, V> entryG = G(k10);
        if (entryG == null) {
            return null;
        }
        return entryG.getValue();
    }

    j<K, V> K(K k10, int i10, int i11) {
        j<K, V> jVar;
        j<K, V> jVar2 = this.f336316c;
        j<K, V> jVar3 = jVar2.f336364f;
        while (true) {
            j<K, V> jVar4 = jVar3;
            jVar = jVar2;
            jVar2 = jVar4;
            int i12 = jVar2.f336362d;
            if (i12 <= jVar.f336362d || i11 <= i12) {
                break;
            }
            jVar3 = !g(k10, i12 + i10, i10 + i11) ? jVar2.f336364f : jVar2.f336365g;
        }
        if (jVar2.b()) {
            jVar2 = jVar;
        }
        if (jVar2.b()) {
            return null;
        }
        int i13 = i10 + i11;
        if (jVar2 == this.f336316c && h(jVar2.getKey()) < i13) {
            return null;
        }
        boolean zG = g(k10, i13 - 1, i13);
        K k11 = jVar2.f336313a;
        if (zG != g(k11, i11 - 1, h(k11))) {
            return null;
        }
        int iA = f().a(k10, i10, i11, jVar2.f336313a, 0, h(jVar2.getKey()));
        if (iA < 0 || iA >= i11) {
            return jVar2;
        }
        return null;
    }

    @Override // org.apache.commons.collections4.y0
    public SortedMap<K, V> a3(K k10) {
        return s(k10, 0, h(k10));
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        j<K, V> jVar = this.f336316c;
        jVar.f336313a = null;
        jVar.f336362d = -1;
        jVar.f336314b = null;
        jVar.f336363e = null;
        jVar.f336364f = jVar;
        jVar.f336365g = null;
        jVar.f336366h = jVar;
        this.f336320g = 0;
        u();
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return f();
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        K kC = c(obj);
        j<K, V> jVarQ = q(kC, h(kC));
        return !jVarQ.b() && e(kC, jVarQ.f336313a);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f336319f == null) {
            this.f336319f = new C2401b();
        }
        return this.f336319f;
    }

    @Override // java.util.SortedMap, org.apache.commons.collections4.j0
    public K firstKey() {
        if (size() != 0) {
            return l().getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public V get(Object obj) {
        j<K, V> jVarP = p(obj);
        if (jVarP != null) {
            return jVarP.getValue();
        }
        return null;
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k10) {
        return new f(this, null, k10);
    }

    j<K, V> i(j<K, V> jVar, int i10) {
        j<K, V> jVar2;
        int i11;
        j<K, V> jVar3 = this.f336316c;
        j<K, V> jVar4 = jVar3.f336364f;
        while (true) {
            j<K, V> jVar5 = jVar4;
            jVar2 = jVar3;
            jVar3 = jVar5;
            int i12 = jVar3.f336362d;
            i11 = jVar.f336362d;
            if (i12 >= i11 || i12 <= jVar2.f336362d) {
                break;
            }
            jVar4 = !g(jVar.f336313a, i12, i10) ? jVar3.f336364f : jVar3.f336365g;
        }
        jVar.f336366h = jVar;
        if (g(jVar.f336313a, i11, i10)) {
            jVar.f336364f = jVar3;
            jVar.f336365g = jVar;
        } else {
            jVar.f336364f = jVar;
            jVar.f336365g = jVar3;
        }
        jVar.f336363e = jVar2;
        int i13 = jVar3.f336362d;
        if (i13 >= jVar.f336362d) {
            jVar3.f336363e = jVar;
        }
        int i14 = jVar2.f336362d;
        if (i13 <= i14) {
            jVar3.f336366h = jVar;
        }
        if (jVar2 == this.f336316c || !g(jVar.f336313a, i14, i10)) {
            jVar2.f336364f = jVar;
            return jVar;
        }
        jVar2.f336365g = jVar;
        return jVar;
    }

    j<K, V> j(K k10) {
        int iH = h(k10);
        if (iH == 0) {
            return !this.f336316c.b() ? this.f336316c : l();
        }
        j<K, V> jVarQ = q(k10, iH);
        if (!e(k10, jVarQ.f336313a)) {
            int iA = a(k10, jVarQ.f336313a);
            if (org.apache.commons.collections4.trie.c.h(iA)) {
                j<K, V> jVar = new j<>(k10, null, iA);
                i(jVar, iH);
                v();
                j<K, V> jVarZ = z(jVar);
                D(jVar);
                this.f336321h -= 2;
                return jVarZ;
            }
            if (org.apache.commons.collections4.trie.c.e(iA)) {
                return !this.f336316c.b() ? this.f336316c : l();
            }
            if (!org.apache.commons.collections4.trie.c.d(iA)) {
                throw new IllegalStateException("invalid lookup: " + k10);
            }
        }
        return jVarQ;
    }

    void k() {
        this.f336320g--;
        u();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap, org.apache.commons.collections4.r
    public Set<K> keySet() {
        if (this.f336317d == null) {
            this.f336317d = new c();
        }
        return this.f336317d;
    }

    j<K, V> l() {
        if (isEmpty()) {
            return null;
        }
        return n(this.f336316c);
    }

    @Override // java.util.SortedMap, org.apache.commons.collections4.j0
    public K lastKey() {
        j<K, V> jVarX = x();
        if (jVarX != null) {
            return jVarX.getKey();
        }
        throw new NoSuchElementException();
    }

    j<K, V> m(K k10) {
        int iH = h(k10);
        int i10 = 6 >> 0;
        if (iH == 0) {
            if (this.f336316c.b()) {
                return null;
            }
            return this.f336316c;
        }
        j<K, V> jVarQ = q(k10, iH);
        if (!e(k10, jVarQ.f336313a)) {
            int iA = a(k10, jVarQ.f336313a);
            if (org.apache.commons.collections4.trie.c.h(iA)) {
                j<K, V> jVar = new j<>(k10, null, iA);
                i(jVar, iH);
                v();
                j<K, V> jVarC = C(jVar);
                D(jVar);
                this.f336321h -= 2;
                return jVarC;
            }
            if (org.apache.commons.collections4.trie.c.e(iA)) {
                if (this.f336316c.b()) {
                    return null;
                }
                return this.f336316c;
            }
            if (!org.apache.commons.collections4.trie.c.d(iA)) {
                throw new IllegalStateException("invalid lookup: " + k10);
            }
        }
        return jVarQ;
    }

    j<K, V> n(j<K, V> jVar) {
        while (true) {
            j<K, V> jVar2 = jVar.f336364f;
            if (jVar2.b()) {
                jVar2 = jVar.f336365g;
            }
            if (jVar2.f336362d <= jVar.f336362d) {
                return jVar2;
            }
            jVar = jVar2;
        }
    }

    j<K, V> o(j<K, V> jVar) {
        if (jVar.f336365g == null) {
            return null;
        }
        while (true) {
            j<K, V> jVar2 = jVar.f336365g;
            if (jVar2.f336362d <= jVar.f336362d) {
                return jVar2;
            }
            jVar = jVar2;
        }
    }

    j<K, V> p(Object obj) {
        K kC = c(obj);
        if (kC == null) {
            return null;
        }
        j<K, V> jVarQ = q(kC, h(kC));
        if (jVarQ.b() || !e(kC, jVarQ.f336313a)) {
            return null;
        }
        return jVarQ;
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.n0
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("Key cannot be null");
        }
        int iH = h(k10);
        if (iH == 0) {
            if (this.f336316c.b()) {
                v();
            } else {
                u();
            }
            return this.f336316c.a(k10, v10);
        }
        j<K, V> jVarQ = q(k10, iH);
        if (e(k10, jVarQ.f336313a)) {
            if (jVarQ.b()) {
                v();
            } else {
                u();
            }
            return jVarQ.a(k10, v10);
        }
        int iA = a(k10, jVarQ.f336313a);
        if (!org.apache.commons.collections4.trie.c.f(iA)) {
            if (org.apache.commons.collections4.trie.c.h(iA)) {
                i(new j<>(k10, v10, iA), iH);
                v();
                return null;
            }
            if (org.apache.commons.collections4.trie.c.e(iA)) {
                if (this.f336316c.b()) {
                    v();
                } else {
                    u();
                }
                return this.f336316c.a(k10, v10);
            }
            if (org.apache.commons.collections4.trie.c.d(iA) && jVarQ != this.f336316c) {
                u();
                return jVarQ.a(k10, v10);
            }
        }
        throw new IllegalArgumentException("Failed to put: " + k10 + " -> " + v10 + ", " + iA);
    }

    j<K, V> q(K k10, int i10) {
        j<K, V> jVar = this.f336316c;
        j<K, V> jVar2 = jVar.f336364f;
        while (true) {
            j<K, V> jVar3 = jVar2;
            j<K, V> jVar4 = jVar;
            jVar = jVar3;
            int i11 = jVar.f336362d;
            if (i11 <= jVar4.f336362d) {
                return jVar;
            }
            jVar2 = !g(k10, i11, i10) ? jVar.f336364f : jVar.f336365g;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        K kC = c(obj);
        int iH = h(kC);
        j<K, V> jVar = this.f336316c;
        j<K, V> jVar2 = jVar.f336364f;
        while (true) {
            j<K, V> jVar3 = jVar2;
            j<K, V> jVar4 = jVar;
            jVar = jVar3;
            int i10 = jVar.f336362d;
            if (i10 <= jVar4.f336362d) {
                break;
            }
            jVar2 = !g(kC, i10, iH) ? jVar.f336364f : jVar.f336365g;
        }
        if (jVar.b() || !e(kC, jVar.f336313a)) {
            return null;
        }
        return D(jVar);
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.r
    public int size() {
        return this.f336320g;
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k10, K k11) {
        return new f(this, k10, k11);
    }

    j<K, V> t(K k10) {
        int iH = h(k10);
        if (iH == 0) {
            if (this.f336316c.b()) {
                return l();
            }
            if (size() > 1) {
                return z(this.f336316c);
            }
            return null;
        }
        j<K, V> jVarQ = q(k10, iH);
        if (e(k10, jVarQ.f336313a)) {
            return z(jVarQ);
        }
        int iA = a(k10, jVarQ.f336313a);
        if (org.apache.commons.collections4.trie.c.h(iA)) {
            j<K, V> jVar = new j<>(k10, null, iA);
            i(jVar, iH);
            v();
            j<K, V> jVarZ = z(jVar);
            D(jVar);
            this.f336321h -= 2;
            return jVarZ;
        }
        if (org.apache.commons.collections4.trie.c.e(iA)) {
            if (!this.f336316c.b()) {
                return l();
            }
            if (size() > 1) {
                return z(l());
            }
            return null;
        }
        if (org.apache.commons.collections4.trie.c.d(iA)) {
            return z(jVarQ);
        }
        throw new IllegalStateException("invalid lookup: " + k10);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k10) {
        return new f(this, k10, null);
    }

    void v() {
        this.f336320g++;
        u();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap, org.apache.commons.collections4.r
    public Collection<V> values() {
        if (this.f336318e == null) {
            this.f336318e = new m();
        }
        return this.f336318e;
    }

    j<K, V> x() {
        return o(this.f336316c.f336364f);
    }

    j<K, V> y(K k10) {
        int iH = h(k10);
        if (iH == 0) {
            return null;
        }
        j<K, V> jVarQ = q(k10, iH);
        if (e(k10, jVarQ.f336313a)) {
            return C(jVarQ);
        }
        int iA = a(k10, jVarQ.f336313a);
        if (org.apache.commons.collections4.trie.c.h(iA)) {
            j<K, V> jVar = new j<>(k10, null, iA);
            i(jVar, iH);
            v();
            j<K, V> jVarC = C(jVar);
            D(jVar);
            this.f336321h -= 2;
            return jVarC;
        }
        if (org.apache.commons.collections4.trie.c.e(iA)) {
            return null;
        }
        if (org.apache.commons.collections4.trie.c.d(iA)) {
            return C(jVarQ);
        }
        throw new IllegalStateException("invalid lookup: " + k10);
    }

    j<K, V> z(j<K, V> jVar) {
        return jVar == null ? l() : A(jVar.f336366h, jVar, null);
    }

    @Override // org.apache.commons.collections4.s
    public k0<K, V> T() {
        return new l();
    }

    abstract class k<E> implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected int f336367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected j<K, V> f336368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected j<K, V> f336369c;

        protected k() {
            this.f336367a = b.this.f336321h;
            this.f336368b = b.this.z(null);
        }

        protected j<K, V> b(j<K, V> jVar) {
            return b.this.z(jVar);
        }

        protected j<K, V> c() {
            if (this.f336367a != b.this.f336321h) {
                throw new ConcurrentModificationException();
            }
            j<K, V> jVar = this.f336368b;
            if (jVar == null) {
                throw new NoSuchElementException();
            }
            this.f336368b = b(jVar);
            this.f336369c = jVar;
            return jVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f336368b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            j<K, V> jVar = this.f336369c;
            if (jVar == null) {
                throw new IllegalStateException();
            }
            int i10 = this.f336367a;
            b bVar = b.this;
            if (i10 != bVar.f336321h) {
                throw new ConcurrentModificationException();
            }
            this.f336369c = null;
            bVar.D(jVar);
            this.f336367a = b.this.f336321h;
        }

        protected k(j<K, V> jVar) {
            this.f336367a = b.this.f336321h;
            this.f336368b = jVar;
        }
    }

    protected b(org.apache.commons.collections4.trie.c<? super K> cVar, Map<? extends K, ? extends V> map) {
        super(cVar);
        this.f336316c = new j<>(null, null, -1);
        this.f336320g = 0;
        this.f336321h = 0;
        putAll(map);
    }
}
