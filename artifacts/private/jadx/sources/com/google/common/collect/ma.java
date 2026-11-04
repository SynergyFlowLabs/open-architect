package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
class ma<R, C, V> extends q<R, C, V> implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f117684h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @w5
    final Map<R, Map<C, V>> f117685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @w5
    final com.google.common.base.s0<? extends Map<C, V>> f117686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Set<C> f117687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Map<R, Map<C, V>> f117688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient ma<R, C, V>.f f117689g;

    private class b implements Iterator<oa.a<R, C, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator<Map.Entry<R, Map<C, V>>> f117690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        Map.Entry<R, Map<C, V>> f117691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Iterator<Map.Entry<C, V>> f117692c;

        private b() {
            this.f117690a = ma.this.f117685c.entrySet().iterator();
            this.f117692c = p7.v();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public oa.a<R, C, V> next() {
            if (!this.f117692c.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.f117690a.next();
                this.f117691b = next;
                this.f117692c = next.getValue().entrySet().iterator();
            }
            Objects.requireNonNull(this.f117691b);
            Map.Entry<C, V> next2 = this.f117692c.next();
            return bb.d(this.f117691b.getKey(), next2.getKey(), next2.getValue());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f117690a.hasNext() || this.f117692c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f117692c.remove();
            Map.Entry<R, Map<C, V>> entry = this.f117691b;
            Objects.requireNonNull(entry);
            if (entry.getValue().isEmpty()) {
                this.f117690a.remove();
                this.f117691b = null;
            }
        }
    }

    private class c extends b8.r0<R, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final C f117694d;

        private class a extends z9.k<Map.Entry<R, V>> {
            private a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                c.this.d(com.google.common.base.l0.c());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@fj.a Object o10) {
                if (!(o10 instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) o10;
                return ma.this.h(entry.getKey(), c.this.f117694d, entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                c cVar = c.this;
                return !ma.this.M(cVar.f117694d);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, V>> iterator() {
                return new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@fj.a Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ma.this.m(entry.getKey(), c.this.f117694d, entry.getValue());
            }

            @Override // com.google.common.collect.z9.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> c10) {
                return c.this.d(com.google.common.base.l0.q(com.google.common.base.l0.n(c10)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<Map<C, V>> it = ma.this.f117685c.values().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    if (it.next().containsKey(c.this.f117694d)) {
                        i10++;
                    }
                }
                return i10;
            }
        }

        private class b extends com.google.common.collect.c<Map.Entry<R, V>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Iterator<Map.Entry<R, Map<C, V>>> f117697c;

            class a extends com.google.common.collect.g<R, V> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Map.Entry f117699a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ b f117700b;

                a(final b this$2, final Map.Entry val$entry) {
                    this.f117699a = val$entry;
                    this.f117700b = this$2;
                }

                @Override // com.google.common.collect.g, java.util.Map.Entry
                public R getKey() {
                    return (R) this.f117699a.getKey();
                }

                @Override // com.google.common.collect.g, java.util.Map.Entry
                public V getValue() {
                    return (V) ((Map) this.f117699a.getValue()).get(c.this.f117694d);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.g, java.util.Map.Entry
                public V setValue(V v10) {
                    return (V) u8.a(((Map) this.f117699a.getValue()).put(c.this.f117694d, com.google.common.base.j0.E(v10)));
                }
            }

            private b() {
                this.f117697c = ma.this.f117685c.entrySet().iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @fj.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Map.Entry<R, V> b() {
                while (this.f117697c.hasNext()) {
                    Map.Entry<R, Map<C, V>> next = this.f117697c.next();
                    if (next.getValue().containsKey(c.this.f117694d)) {
                        return new a(this, next);
                    }
                }
                return c();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ma$c$c, reason: collision with other inner class name */
        private class C1066c extends b8.b0<R, V> {
            C1066c() {
                super(c.this);
            }

            @Override // com.google.common.collect.b8.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@fj.a Object obj) {
                c cVar = c.this;
                return ma.this.n0(obj, cVar.f117694d);
            }

            @Override // com.google.common.collect.b8.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@fj.a Object obj) {
                c cVar = c.this;
                return ma.this.remove(obj, cVar.f117694d) != null;
            }

            @Override // com.google.common.collect.z9.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(final Collection<?> c10) {
                return c.this.d(b8.U(com.google.common.base.l0.q(com.google.common.base.l0.n(c10))));
            }
        }

        private class d extends b8.q0<R, V> {
            d() {
                super(c.this);
            }

            @Override // com.google.common.collect.b8.q0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@fj.a Object obj) {
                return obj != null && c.this.d(b8.T0(com.google.common.base.l0.m(obj)));
            }

            @Override // com.google.common.collect.b8.q0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(final Collection<?> c10) {
                return c.this.d(b8.T0(com.google.common.base.l0.n(c10)));
            }

            @Override // com.google.common.collect.b8.q0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(final Collection<?> c10) {
                return c.this.d(b8.T0(com.google.common.base.l0.q(com.google.common.base.l0.n(c10))));
            }
        }

        c(C c10) {
            this.f117694d = (C) com.google.common.base.j0.E(c10);
        }

        @Override // com.google.common.collect.b8.r0
        Set<Map.Entry<R, V>> a() {
            return new a();
        }

        @Override // com.google.common.collect.b8.r0
        /* JADX INFO: renamed from: b */
        Set<R> g() {
            return new C1066c();
        }

        @Override // com.google.common.collect.b8.r0
        Collection<V> c() {
            return new d();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return ma.this.n0(key, this.f117694d);
        }

        @z7.a
        boolean d(com.google.common.base.k0<? super Map.Entry<R, V>> predicate) {
            Iterator<Map.Entry<R, Map<C, V>>> it = ma.this.f117685c.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<R, Map<C, V>> next = it.next();
                Map<C, V> value = next.getValue();
                V v10 = value.get(this.f117694d);
                if (v10 != null && predicate.apply(b8.O(next.getKey(), v10))) {
                    value.remove(this.f117694d);
                    if (value.isEmpty()) {
                        it.remove();
                    }
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V get(@fj.a Object obj) {
            return (V) ma.this.w(obj, this.f117694d);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V put(R r10, V v10) {
            return (V) ma.this.e0(r10, this.f117694d, v10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V remove(@fj.a Object obj) {
            return (V) ma.this.remove(obj, this.f117694d);
        }
    }

    private class d extends com.google.common.collect.c<C> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Map<C, V> f117703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Iterator<Map<C, V>> f117704d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Iterator<Map.Entry<C, V>> f117705e;

        private d() {
            this.f117703c = ma.this.f117686d.get();
            this.f117704d = ma.this.f117685c.values().iterator();
            this.f117705e = p7.t();
        }

        @Override // com.google.common.collect.c
        @fj.a
        protected C b() {
            while (true) {
                if (this.f117705e.hasNext()) {
                    Map.Entry<C, V> next = this.f117705e.next();
                    if (!this.f117703c.containsKey(next.getKey())) {
                        this.f117703c.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else {
                    if (!this.f117704d.hasNext()) {
                        return c();
                    }
                    this.f117705e = this.f117704d.next().entrySet().iterator();
                }
            }
        }
    }

    private class e extends ma<R, C, V>.i<C> {
        private e() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object obj) {
            return ma.this.M(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<C> iterator() {
            return ma.this.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object obj) {
            boolean z10 = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = ma.this.f117685c.values().iterator();
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().remove(obj)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // com.google.common.collect.z9.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c10) {
            com.google.common.base.j0.E(c10);
            Iterator<Map<C, V>> it = ma.this.f117685c.values().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (p7.U(next.keySet().iterator(), c10)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // com.google.common.collect.z9.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> c10) {
            com.google.common.base.j0.E(c10);
            Iterator<Map<C, V>> it = ma.this.f117685c.values().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().retainAll(c10)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return p7.Y(iterator());
        }
    }

    private class f extends b8.r0<C, Map<R, V>> {

        private final class a extends ma<R, C, V>.i<Map.Entry<C, Map<R, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.ma$f$a$a, reason: collision with other inner class name */
            class C1067a implements com.google.common.base.t<C, Map<R, V>> {
                C1067a() {
                }

                @Override // com.google.common.base.t
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map<R, V> apply(C columnKey) {
                    return ma.this.c0(columnKey);
                }
            }

            private a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@fj.a Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (ma.this.M(entry.getKey())) {
                        Map<R, V> map = f.this.get(entry.getKey());
                        Objects.requireNonNull(map);
                        return map.equals(entry.getValue());
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                return b8.m(ma.this.E0(), new C1067a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@fj.a Object obj) {
                if (!contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                ma.this.l(((Map.Entry) obj).getKey());
                return true;
            }

            @Override // com.google.common.collect.z9.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> c10) {
                com.google.common.base.j0.E(c10);
                return z9.J(this, c10.iterator());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.z9.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> c10) {
                com.google.common.base.j0.E(c10);
                boolean z10 = false;
                for (Object obj : x7.s(ma.this.E0().iterator())) {
                    if (!c10.contains(b8.O(obj, ma.this.c0(obj)))) {
                        ma.this.l(obj);
                        z10 = true;
                    }
                }
                return z10;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return ma.this.E0().size();
            }
        }

        private class b extends b8.q0<C, Map<R, V>> {
            b() {
                super(f.this);
            }

            @Override // com.google.common.collect.b8.q0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@fj.a Object obj) {
                for (Map.Entry<C, Map<R, V>> entry : f.this.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        ma.this.l(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.b8.q0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> c10) {
                com.google.common.base.j0.E(c10);
                boolean z10 = false;
                for (Object obj : x7.s(ma.this.E0().iterator())) {
                    if (c10.contains(ma.this.c0(obj))) {
                        ma.this.l(obj);
                        z10 = true;
                    }
                }
                return z10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.b8.q0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> c10) {
                com.google.common.base.j0.E(c10);
                boolean z10 = false;
                int i10 = 4 ^ 0;
                for (Object obj : x7.s(ma.this.E0().iterator())) {
                    if (!c10.contains(ma.this.c0(obj))) {
                        ma.this.l(obj);
                        z10 = true;
                    }
                }
                return z10;
            }
        }

        private f() {
        }

        @Override // com.google.common.collect.b8.r0
        public Set<Map.Entry<C, Map<R, V>>> a() {
            return new a();
        }

        @Override // com.google.common.collect.b8.r0
        Collection<Map<R, V>> c() {
            return new b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return ma.this.M(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map<R, V> get(@fj.a Object key) {
            if (!ma.this.M(key)) {
                return null;
            }
            ma maVar = ma.this;
            Objects.requireNonNull(key);
            return maVar.c0(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map<R, V> remove(@fj.a Object key) {
            if (ma.this.M(key)) {
                return ma.this.l(key);
            }
            return null;
        }

        @Override // com.google.common.collect.b8.r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: keySet */
        public Set<C> h() {
            return ma.this.E0();
        }
    }

    class g extends b8.a0<C, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final R f117712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        Map<C, V> f117713b;

        class a implements Iterator<Map.Entry<C, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Iterator f117715a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f117716b;

            a(final g this$1, final Iterator val$iterator) {
                this.f117715a = val$iterator;
                this.f117716b = this$1;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<C, V> next() {
                return this.f117716b.e((Map.Entry) this.f117715a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f117715a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f117715a.remove();
                this.f117716b.c();
            }
        }

        class b extends h5<C, V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Map.Entry f117717a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f117718b;

            b(final g this$1, final Map.Entry val$entry) {
                this.f117717a = val$entry;
                this.f117718b = this$1;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.h5, com.google.common.collect.m5
            /* JADX INFO: renamed from: L0 */
            public Map.Entry<C, V> i1() {
                return this.f117717a;
            }

            @Override // com.google.common.collect.h5, java.util.Map.Entry
            public boolean equals(@fj.a Object object) {
                return N0(object);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.h5, java.util.Map.Entry
            public V setValue(V v10) {
                return (V) super.setValue(com.google.common.base.j0.E(v10));
            }
        }

        g(R r10) {
            this.f117712a = (R) com.google.common.base.j0.E(r10);
        }

        @Override // com.google.common.collect.b8.a0
        Iterator<Map.Entry<C, V>> a() {
            d();
            Map<C, V> map = this.f117713b;
            return map == null ? p7.v() : new a(this, map.entrySet().iterator());
        }

        @fj.a
        Map<C, V> b() {
            return ma.this.f117685c.get(this.f117712a);
        }

        void c() {
            d();
            Map<C, V> map = this.f117713b;
            if (map == null || !map.isEmpty()) {
                return;
            }
            ma.this.f117685c.remove(this.f117712a);
            this.f117713b = null;
        }

        @Override // com.google.common.collect.b8.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            d();
            Map<C, V> map = this.f117713b;
            if (map != null) {
                map.clear();
            }
            c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            Map<C, V> map;
            d();
            return (key == null || (map = this.f117713b) == null || !b8.o0(map, key)) ? false : true;
        }

        final void d() {
            Map<C, V> map = this.f117713b;
            if (map != null && (!map.isEmpty() || !ma.this.f117685c.containsKey(this.f117712a))) {
                return;
            }
            this.f117713b = b();
        }

        Map.Entry<C, V> e(final Map.Entry<C, V> entry) {
            return new b(this, entry);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V get(@fj.a Object obj) {
            Map<C, V> map;
            d();
            if (obj == null || (map = this.f117713b) == null) {
                return null;
            }
            return (V) b8.p0(map, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V put(C c10, V v10) {
            com.google.common.base.j0.E(c10);
            com.google.common.base.j0.E(v10);
            Map<C, V> map = this.f117713b;
            return (map == null || map.isEmpty()) ? (V) ma.this.e0(this.f117712a, c10, v10) : this.f117713b.put(c10, v10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V remove(@fj.a Object obj) {
            d();
            Map<C, V> map = this.f117713b;
            if (map == null) {
                return null;
            }
            V v10 = (V) b8.q0(map, obj);
            c();
            return v10;
        }

        @Override // com.google.common.collect.b8.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            d();
            Map<C, V> map = this.f117713b;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    class h extends b8.r0<R, Map<C, V>> {

        private final class a extends ma<R, C, V>.i<Map.Entry<R, Map<C, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.ma$h$a$a, reason: collision with other inner class name */
            class C1068a implements com.google.common.base.t<R, Map<C, V>> {
                C1068a() {
                }

                @Override // com.google.common.base.t
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map<C, V> apply(R rowKey) {
                    return ma.this.J0(rowKey);
                }
            }

            private a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@fj.a Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && b3.j(ma.this.f117685c.entrySet(), entry)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return b8.m(ma.this.f117685c.keySet(), new C1068a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@fj.a Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && ma.this.f117685c.entrySet().remove(entry)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return ma.this.f117685c.size();
            }
        }

        h() {
        }

        @Override // com.google.common.collect.b8.r0
        protected Set<Map.Entry<R, Map<C, V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return ma.this.F0(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map<C, V> get(@fj.a Object key) {
            if (!ma.this.F0(key)) {
                return null;
            }
            ma maVar = ma.this;
            Objects.requireNonNull(key);
            return maVar.J0(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map<C, V> remove(@fj.a Object key) {
            if (key == null) {
                return null;
            }
            return ma.this.f117685c.remove(key);
        }
    }

    private abstract class i<T> extends z9.k<T> {
        private i() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ma.this.f117685c.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return ma.this.f117685c.isEmpty();
        }
    }

    ma(Map<R, Map<C, V>> backingMap, com.google.common.base.s0<? extends Map<C, V>> factory) {
        this.f117685c = backingMap;
        this.f117686d = factory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h(@fj.a Object rowKey, @fj.a Object columnKey, @fj.a Object value) {
        return value != null && value.equals(w(rowKey, columnKey));
    }

    private Map<C, V> k(R rowKey) {
        Map<C, V> map = this.f117685c.get(rowKey);
        if (map != null) {
            return map;
        }
        Map<C, V> map2 = this.f117686d.get();
        this.f117685c.put(rowKey, map2);
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @z7.a
    public Map<R, V> l(@fj.a Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = this.f117685c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<R, Map<C, V>> next = it.next();
            V vRemove = next.getValue().remove(obj);
            if (vRemove != null) {
                linkedHashMap.put(next.getKey(), vRemove);
                if (next.getValue().isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(@fj.a Object rowKey, @fj.a Object columnKey, @fj.a Object value) {
        if (!h(rowKey, columnKey, value)) {
            return false;
        }
        remove(rowKey, columnKey);
        return true;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public Set<oa.a<R, C, V>> D0() {
        return super.D0();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public Set<C> E0() {
        Set<C> eVar = this.f117687e;
        if (eVar == null) {
            eVar = new e();
            this.f117687e = eVar;
        }
        return eVar;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public boolean F0(@fj.a Object rowKey) {
        return rowKey != null && b8.o0(this.f117685c, rowKey);
    }

    @Override // com.google.common.collect.oa
    public Map<C, V> J0(R rowKey) {
        return new g(rowKey);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public boolean M(@fj.a Object columnKey) {
        if (columnKey == null) {
            return false;
        }
        Iterator<Map<C, V>> it = this.f117685c.values().iterator();
        while (it.hasNext()) {
            if (b8.o0(it.next(), columnKey)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.q
    Iterator<oa.a<R, C, V>> a() {
        return new b();
    }

    @Override // com.google.common.collect.oa
    public Map<C, Map<R, V>> a0() {
        ma<R, C, V>.f fVar = this.f117689g;
        if (fVar == null) {
            fVar = new f();
            this.f117689g = fVar;
        }
        return fVar;
    }

    @Override // com.google.common.collect.oa
    public Map<R, V> c0(C columnKey) {
        return new c(columnKey);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public void clear() {
        this.f117685c.clear();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public boolean containsValue(@fj.a Object value) {
        return value != null && super.containsValue(value);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    @z7.a
    @fj.a
    public V e0(R rowKey, C columnKey, V value) {
        com.google.common.base.j0.E(rowKey);
        com.google.common.base.j0.E(columnKey);
        com.google.common.base.j0.E(value);
        return k(rowKey).put(columnKey, value);
    }

    Iterator<C> i() {
        return new d();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public boolean isEmpty() {
        return this.f117685c.isEmpty();
    }

    Map<R, Map<C, V>> j() {
        return new h();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public boolean n0(@fj.a Object rowKey, @fj.a Object columnKey) {
        return (rowKey == null || columnKey == null || !super.n0(rowKey, columnKey)) ? false : true;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    @z7.a
    @fj.a
    public V remove(@fj.a Object obj, @fj.a Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) b8.p0(this.f117685c, obj)) == null) {
            return null;
        }
        V v10 = (V) map.remove(obj2);
        if (map.isEmpty()) {
            this.f117685c.remove(obj);
        }
        return v10;
    }

    @Override // com.google.common.collect.oa
    public Map<R, Map<C, V>> s() {
        Map<R, Map<C, V>> map = this.f117688f;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> mapJ = j();
        this.f117688f = mapJ;
        return mapJ;
    }

    @Override // com.google.common.collect.oa
    public int size() {
        Iterator<Map<C, V>> it = this.f117685c.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public Set<R> t() {
        return s().keySet();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.oa
    @fj.a
    public V w(@fj.a Object obj, @fj.a Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return (V) super.w(obj, obj2);
    }
}
