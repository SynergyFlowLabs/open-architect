package com.google.common.collect;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
public final class kb<K extends Comparable, V> implements h9<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h9<Comparable<?>, Object> f117580b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NavigableMap<u3<K>, c<K, V>> f117581a = b8.f0();

    class a implements h9<Comparable<?>, Object> {
        a() {
        }

        @Override // com.google.common.collect.h9
        public void a(f9<Comparable<?>> range) {
            com.google.common.base.j0.E(range);
        }

        @Override // com.google.common.collect.h9
        public f9<Comparable<?>> b() {
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.h9
        public h9<Comparable<?>, Object> c(f9<Comparable<?>> range) {
            com.google.common.base.j0.E(range);
            return this;
        }

        @Override // com.google.common.collect.h9
        public void clear() {
        }

        @Override // com.google.common.collect.h9
        public Map<f9<Comparable<?>>, Object> d() {
            return Collections.EMPTY_MAP;
        }

        @Override // com.google.common.collect.h9
        @fj.a
        public Map.Entry<f9<Comparable<?>>, Object> e(Comparable<?> key) {
            return null;
        }

        @Override // com.google.common.collect.h9
        public Map<f9<Comparable<?>>, Object> f() {
            return Collections.EMPTY_MAP;
        }

        @Override // com.google.common.collect.h9
        public void g(h9<Comparable<?>, ? extends Object> rangeMap) {
            if (!rangeMap.d().isEmpty()) {
                throw new IllegalArgumentException("Cannot putAll(nonEmptyRangeMap) into an empty subRangeMap");
            }
        }

        @Override // com.google.common.collect.h9
        public void h(f9<Comparable<?>> range, Object value) {
            com.google.common.base.j0.E(range);
            throw new IllegalArgumentException("Cannot insert range " + range + " into an empty subRangeMap");
        }

        @Override // com.google.common.collect.h9
        @fj.a
        public Object i(Comparable<?> key) {
            return null;
        }

        @Override // com.google.common.collect.h9
        public void j(f9<Comparable<?>> range, Object value) {
            com.google.common.base.j0.E(range);
            throw new IllegalArgumentException("Cannot insert range " + range + " into an empty subRangeMap");
        }
    }

    private final class b extends b8.a0<f9<K>, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterable<Map.Entry<f9<K>, V>> f117582a;

        b(Iterable<c<K, V>> entryIterable) {
            this.f117582a = entryIterable;
        }

        @Override // com.google.common.collect.b8.a0
        Iterator<Map.Entry<f9<K>, V>> a() {
            return this.f117582a.iterator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return get(key) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V get(@fj.a Object obj) {
            if (obj instanceof f9) {
                f9 f9Var = (f9) obj;
                c cVar = (c) kb.this.f117581a.get(f9Var.f117396a);
                if (cVar != null && cVar.getKey().equals(f9Var)) {
                    return (V) cVar.getValue();
                }
            }
            return null;
        }

        @Override // com.google.common.collect.b8.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return kb.this.f117581a.size();
        }
    }

    private static final class c<K extends Comparable, V> extends g<f9<K>, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f9<K> f117584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final V f117585b;

        c(u3<K> lowerBound, u3<K> upperBound, V value) {
            this(f9.k(lowerBound, upperBound), value);
        }

        public boolean a(K value) {
            return this.f117584a.i(value);
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f9<K> getKey() {
            return this.f117584a;
        }

        u3<K> e() {
            return (u3<K>) this.f117584a.f117396a;
        }

        u3<K> f() {
            return (u3<K>) this.f117584a.f117397b;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public V getValue() {
            return this.f117585b;
        }

        c(f9<K> range, V value) {
            this.f117584a = range;
            this.f117585b = value;
        }
    }

    private class d implements h9<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f9<K> f117586a;

        class a extends kb<K, V>.d.b {

            /* JADX INFO: renamed from: com.google.common.collect.kb$d$a$a, reason: collision with other inner class name */
            class C1063a extends com.google.common.collect.c<Map.Entry<f9<K>, V>> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Iterator f117589c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ a f117590d;

                C1063a(final a this$2, final Iterator val$backingItr) {
                    this.f117589c = val$backingItr;
                    this.f117590d = this$2;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.c
                @fj.a
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public Map.Entry<f9<K>, V> b() {
                    if (!this.f117589c.hasNext()) {
                        return (Map.Entry) c();
                    }
                    c cVar = (c) this.f117589c.next();
                    return cVar.f().compareTo(d.this.f117586a.f117396a) <= 0 ? (Map.Entry) c() : b8.O(cVar.getKey().s(d.this.f117586a), cVar.getValue());
                }
            }

            a() {
                super();
            }

            @Override // com.google.common.collect.kb.d.b
            Iterator<Map.Entry<f9<K>, V>> b() {
                return d.this.f117586a.u() ? p7.t() : new C1063a(this, kb.this.f117581a.headMap(d.this.f117586a.f117397b, false).descendingMap().values().iterator());
            }
        }

        class b extends AbstractMap<f9<K>, V> {

            class a extends b8.b0<f9<K>, V> {
                a(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.b8.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(@fj.a Object o10) {
                    return b.this.remove(o10) != null;
                }

                @Override // com.google.common.collect.z9.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> c10) {
                    return b.this.c(com.google.common.base.l0.h(com.google.common.base.l0.q(com.google.common.base.l0.n(c10)), b8.R()));
                }
            }

            /* JADX INFO: renamed from: com.google.common.collect.kb$d$b$b, reason: collision with other inner class name */
            class C1064b extends b8.s<f9<K>, V> {
                C1064b() {
                }

                @Override // com.google.common.collect.b8.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean isEmpty() {
                    return !iterator().hasNext();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<f9<K>, V>> iterator() {
                    return b.this.b();
                }

                @Override // com.google.common.collect.b8.s
                Map<f9<K>, V> l() {
                    return b.this;
                }

                @Override // com.google.common.collect.b8.s, com.google.common.collect.z9.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> c10) {
                    return b.this.c(com.google.common.base.l0.q(com.google.common.base.l0.n(c10)));
                }

                @Override // com.google.common.collect.b8.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return p7.Y(iterator());
                }
            }

            class c extends com.google.common.collect.c<Map.Entry<f9<K>, V>> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Iterator f117594c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ b f117595d;

                c(final b this$2, final Iterator val$backingItr) {
                    this.f117594c = val$backingItr;
                    this.f117595d = this$2;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.c
                @fj.a
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public Map.Entry<f9<K>, V> b() {
                    while (this.f117594c.hasNext()) {
                        c cVar = (c) this.f117594c.next();
                        if (cVar.e().compareTo(d.this.f117586a.f117397b) >= 0) {
                            return (Map.Entry) c();
                        }
                        if (cVar.f().compareTo(d.this.f117586a.f117396a) > 0) {
                            return b8.O(cVar.getKey().s(d.this.f117586a), cVar.getValue());
                        }
                    }
                    return (Map.Entry) c();
                }
            }

            /* JADX INFO: renamed from: com.google.common.collect.kb$d$b$d, reason: collision with other inner class name */
            class C1065d extends b8.q0<f9<K>, V> {
                C1065d(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.b8.q0, java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(Collection<?> c10) {
                    return b.this.c(com.google.common.base.l0.h(com.google.common.base.l0.n(c10), b8.Q0()));
                }

                @Override // com.google.common.collect.b8.q0, java.util.AbstractCollection, java.util.Collection
                public boolean retainAll(Collection<?> c10) {
                    return b.this.c(com.google.common.base.l0.h(com.google.common.base.l0.q(com.google.common.base.l0.n(c10)), b8.Q0()));
                }
            }

            b() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(com.google.common.base.k0<? super Map.Entry<f9<K>, V>> predicate) {
                ArrayList arrayListQ = x7.q();
                for (Map.Entry<f9<K>, V> entry : entrySet()) {
                    if (predicate.apply(entry)) {
                        arrayListQ.add(entry.getKey());
                    }
                }
                Iterator it = arrayListQ.iterator();
                while (it.hasNext()) {
                    kb.this.a((f9) it.next());
                }
                return !arrayListQ.isEmpty();
            }

            Iterator<Map.Entry<f9<K>, V>> b() {
                if (d.this.f117586a.u()) {
                    return p7.t();
                }
                return new c(this, kb.this.f117581a.tailMap((u3) com.google.common.base.b0.a((u3) kb.this.f117581a.floorKey(d.this.f117586a.f117396a), d.this.f117586a.f117396a), true).values().iterator());
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
                d.this.clear();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(@fj.a Object key) {
                return get(key) != null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Map.Entry<f9<K>, V>> entrySet() {
                return new C1064b();
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.AbstractMap, java.util.Map
            @fj.a
            public V get(@fj.a Object obj) {
                c cVar;
                try {
                    if (obj instanceof f9) {
                        f9 f9Var = (f9) obj;
                        if (d.this.f117586a.n(f9Var) && !f9Var.u()) {
                            if (f9Var.f117396a.compareTo(d.this.f117586a.f117396a) == 0) {
                                Map.Entry entryFloorEntry = kb.this.f117581a.floorEntry(f9Var.f117396a);
                                cVar = entryFloorEntry != null ? (c) entryFloorEntry.getValue() : null;
                            } else {
                                cVar = (c) kb.this.f117581a.get(f9Var.f117396a);
                            }
                            if (cVar != null && cVar.getKey().t(d.this.f117586a) && cVar.getKey().s(d.this.f117586a).equals(f9Var)) {
                                return (V) cVar.getValue();
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<f9<K>> keySet() {
                return new a(this);
            }

            @Override // java.util.AbstractMap, java.util.Map
            @fj.a
            public V remove(@fj.a Object obj) {
                V v10 = (V) get(obj);
                if (v10 == null) {
                    return null;
                }
                Objects.requireNonNull(obj);
                kb.this.a((f9) obj);
                return v10;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Collection<V> values() {
                return new C1065d(this);
            }
        }

        d(f9<K> subRange) {
            this.f117586a = subRange;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.h9
        public void a(f9<K> f9Var) {
            if (f9Var.t(this.f117586a)) {
                kb.this.a(f9Var.s(this.f117586a));
            }
        }

        @Override // com.google.common.collect.h9
        public f9<K> b() {
            u3 u3Var;
            Map.Entry entryFloorEntry = kb.this.f117581a.floorEntry(this.f117586a.f117396a);
            if (entryFloorEntry == null || ((c) entryFloorEntry.getValue()).f().compareTo(this.f117586a.f117396a) <= 0) {
                u3Var = (u3) kb.this.f117581a.ceilingKey(this.f117586a.f117396a);
                if (u3Var == null || u3Var.compareTo(this.f117586a.f117397b) >= 0) {
                    throw new NoSuchElementException();
                }
            } else {
                u3Var = this.f117586a.f117396a;
            }
            Map.Entry entryLowerEntry = kb.this.f117581a.lowerEntry(this.f117586a.f117397b);
            if (entryLowerEntry != null) {
                return f9.k(u3Var, ((c) entryLowerEntry.getValue()).f().compareTo(this.f117586a.f117397b) >= 0 ? this.f117586a.f117397b : ((c) entryLowerEntry.getValue()).f());
            }
            throw new NoSuchElementException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.h9
        public h9<K, V> c(f9<K> f9Var) {
            return !f9Var.t(this.f117586a) ? kb.this.q() : kb.this.c(f9Var.s(this.f117586a));
        }

        @Override // com.google.common.collect.h9
        public void clear() {
            kb.this.a(this.f117586a);
        }

        @Override // com.google.common.collect.h9
        public Map<f9<K>, V> d() {
            return new b();
        }

        @Override // com.google.common.collect.h9
        @fj.a
        public Map.Entry<f9<K>, V> e(K k10) {
            Map.Entry<f9<K>, V> entryE;
            if (!this.f117586a.i(k10) || (entryE = kb.this.e(k10)) == null) {
                return null;
            }
            return b8.O(entryE.getKey().s(this.f117586a), entryE.getValue());
        }

        @Override // com.google.common.collect.h9
        public boolean equals(@fj.a Object o10) {
            if (o10 instanceof h9) {
                return d().equals(((h9) o10).d());
            }
            return false;
        }

        @Override // com.google.common.collect.h9
        public Map<f9<K>, V> f() {
            return new a();
        }

        @Override // com.google.common.collect.h9
        public void g(h9<K, ? extends V> rangeMap) {
            if (rangeMap.d().isEmpty()) {
                return;
            }
            f9<K> f9VarB = rangeMap.b();
            com.google.common.base.j0.y(this.f117586a.n(f9VarB), "Cannot putAll rangeMap with span %s into a subRangeMap(%s)", f9VarB, this.f117586a);
            kb.this.g(rangeMap);
        }

        @Override // com.google.common.collect.h9
        public void h(f9<K> range, V value) {
            if (kb.this.f117581a.isEmpty() || !this.f117586a.n(range)) {
                j(range, value);
            } else {
                j(kb.this.o(range, com.google.common.base.j0.E(value)).s(this.f117586a), value);
            }
        }

        @Override // com.google.common.collect.h9
        public int hashCode() {
            return d().hashCode();
        }

        @Override // com.google.common.collect.h9
        @fj.a
        public V i(K k10) {
            if (this.f117586a.i(k10)) {
                return (V) kb.this.i(k10);
            }
            return null;
        }

        @Override // com.google.common.collect.h9
        public void j(f9<K> range, V value) {
            com.google.common.base.j0.y(this.f117586a.n(range), "Cannot put range %s into a subRangeMap(%s)", range, this.f117586a);
            kb.this.j(range, value);
        }

        @Override // com.google.common.collect.h9
        public String toString() {
            return d().toString();
        }
    }

    private kb() {
    }

    private static <K extends Comparable, V> f9<K> n(f9<K> f9Var, V v10, @fj.a Map.Entry<u3<K>, c<K, V>> entry) {
        return (entry != null && entry.getValue().getKey().t(f9Var) && entry.getValue().getValue().equals(v10)) ? (f9<K>) f9Var.E(entry.getValue().getKey()) : f9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public f9<K> o(f9<K> f9Var, V v10) {
        return n(n(f9Var, v10, this.f117581a.lowerEntry((u3<K>) f9Var.f117396a)), v10, this.f117581a.floorEntry((u3<K>) f9Var.f117397b));
    }

    public static <K extends Comparable, V> kb<K, V> p() {
        return new kb<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h9<K, V> q() {
        return f117580b;
    }

    private void r(u3<K> lowerBound, u3<K> upperBound, V value) {
        this.f117581a.put(lowerBound, new c<>(lowerBound, upperBound, value));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.common.collect.h9
    public void a(f9<K> f9Var) {
        if (f9Var.u()) {
            return;
        }
        Map.Entry<u3<K>, c<K, V>> entryLowerEntry = this.f117581a.lowerEntry((u3<K>) f9Var.f117396a);
        if (entryLowerEntry != null) {
            c<K, V> value = entryLowerEntry.getValue();
            if (value.f().compareTo(f9Var.f117396a) > 0) {
                if (value.f().compareTo(f9Var.f117397b) > 0) {
                    r(f9Var.f117397b, value.f(), entryLowerEntry.getValue().getValue());
                }
                r(value.e(), f9Var.f117396a, entryLowerEntry.getValue().getValue());
            }
        }
        Map.Entry<u3<K>, c<K, V>> entryLowerEntry2 = this.f117581a.lowerEntry((u3<K>) f9Var.f117397b);
        if (entryLowerEntry2 != null) {
            c<K, V> value2 = entryLowerEntry2.getValue();
            if (value2.f().compareTo(f9Var.f117397b) > 0) {
                r(f9Var.f117397b, value2.f(), entryLowerEntry2.getValue().getValue());
            }
        }
        this.f117581a.subMap((u3<K>) f9Var.f117396a, (u3<K>) f9Var.f117397b).clear();
    }

    @Override // com.google.common.collect.h9
    public f9<K> b() {
        Map.Entry<u3<K>, c<K, V>> entryFirstEntry = this.f117581a.firstEntry();
        Map.Entry<u3<K>, c<K, V>> entryLastEntry = this.f117581a.lastEntry();
        if (entryFirstEntry == null || entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return f9.k(entryFirstEntry.getValue().getKey().f117396a, entryLastEntry.getValue().getKey().f117397b);
    }

    @Override // com.google.common.collect.h9
    public h9<K, V> c(f9<K> subRange) {
        return subRange.equals(f9.a()) ? this : new d(subRange);
    }

    @Override // com.google.common.collect.h9
    public void clear() {
        this.f117581a.clear();
    }

    @Override // com.google.common.collect.h9
    public Map<f9<K>, V> d() {
        return new b(this.f117581a.values());
    }

    @Override // com.google.common.collect.h9
    @fj.a
    public Map.Entry<f9<K>, V> e(K key) {
        Map.Entry<u3<K>, c<K, V>> entryFloorEntry = this.f117581a.floorEntry(u3.o(key));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().a(key)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    @Override // com.google.common.collect.h9
    public boolean equals(@fj.a Object o10) {
        if (o10 instanceof h9) {
            return d().equals(((h9) o10).d());
        }
        return false;
    }

    @Override // com.google.common.collect.h9
    public Map<f9<K>, V> f() {
        return new b(this.f117581a.descendingMap().values());
    }

    @Override // com.google.common.collect.h9
    public void g(h9<K, ? extends V> rangeMap) {
        for (Map.Entry<f9<K>, ? extends V> entry : rangeMap.d().entrySet()) {
            j(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h9
    public void h(f9<K> range, V value) {
        if (this.f117581a.isEmpty()) {
            j(range, value);
        } else {
            j(o(range, com.google.common.base.j0.E(value)), value);
        }
    }

    @Override // com.google.common.collect.h9
    public int hashCode() {
        return d().hashCode();
    }

    @Override // com.google.common.collect.h9
    @fj.a
    public V i(K key) {
        Map.Entry<f9<K>, V> entryE = e(key);
        if (entryE == null) {
            return null;
        }
        return entryE.getValue();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.common.collect.h9
    public void j(f9<K> f9Var, V v10) {
        if (!f9Var.u()) {
            com.google.common.base.j0.E(v10);
            a(f9Var);
            this.f117581a.put((u3<K>) f9Var.f117396a, new c<>(f9Var, v10));
        }
    }

    @Override // com.google.common.collect.h9
    public String toString() {
        return this.f117581a.values().toString();
    }
}
