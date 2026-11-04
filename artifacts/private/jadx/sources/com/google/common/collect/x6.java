package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
public class x6<K extends Comparable<?>, V> implements h9<K, V>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final x6<Comparable<?>, Object> f118272c = new x6<>(l6.F(), l6.F());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f118273d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient l6<f9<K>> f118274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient l6<V> f118275b;

    class a extends l6<f9<K>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f118276f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f118277g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ f9 f118278h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ x6 f118279i;

        a(final x6 this$0, final int val$len, final int val$off, final f9 val$range) {
            this.f118276f = val$len;
            this.f118277g = val$off;
            this.f118278h = val$range;
            this.f118279i = this$0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public f9<K> get(int index) {
            com.google.common.base.j0.C(index, this.f118276f);
            if (index != 0 && index != this.f118276f - 1) {
                return (f9) this.f118279i.f118274a.get(index + this.f118277g);
            }
            return ((f9) this.f118279i.f118274a.get(index + this.f118277g)).s(this.f118278h);
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f118276f;
        }

        @Override // com.google.common.collect.l6, com.google.common.collect.h6
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    class b extends x6<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f9 f118280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ x6 f118281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ x6 f118282g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(final x6 this$0, l6 ranges, l6 values, final f9 val$range, final x6 val$outer) {
            super(ranges, values);
            this.f118280e = val$range;
            this.f118281f = val$outer;
            this.f118282g = this$0;
        }

        @Override // com.google.common.collect.x6, com.google.common.collect.h9
        public /* bridge */ /* synthetic */ Map d() {
            return super.d();
        }

        @Override // com.google.common.collect.x6, com.google.common.collect.h9
        public /* bridge */ /* synthetic */ Map f() {
            return super.f();
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
        @Override // com.google.common.collect.x6, com.google.common.collect.h9
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public x6<K, V> c(f9<K> subRange) {
            return this.f118280e.t(subRange) ? this.f118281f.c(subRange.s(this.f118280e)) : x6.p();
        }

        @Override // com.google.common.collect.x6
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    @z7.f
    public static final class c<K extends Comparable<?>, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<Map.Entry<f9<K>, V>> f118283a = x7.q();

        public x6<K, V> a() {
            Collections.sort(this.f118283a, f9.C().C());
            l6.a aVar = new l6.a(this.f118283a.size());
            l6.a aVar2 = new l6.a(this.f118283a.size());
            for (int i10 = 0; i10 < this.f118283a.size(); i10++) {
                f9<K> key = this.f118283a.get(i10).getKey();
                if (i10 > 0) {
                    f9<K> key2 = this.f118283a.get(i10 - 1).getKey();
                    if (key.t(key2) && !key.s(key2).u()) {
                        throw new IllegalArgumentException("Overlapping ranges: range " + key2 + " overlaps with entry " + key);
                    }
                }
                aVar.a(key);
                aVar2.a(this.f118283a.get(i10).getValue());
            }
            return new x6<>(aVar.e(), aVar2.e());
        }

        @z7.a
        c<K, V> b(c<K, V> builder) {
            this.f118283a.addAll(builder.f118283a);
            return this;
        }

        @z7.a
        public c<K, V> c(f9<K> range, V value) {
            com.google.common.base.j0.E(range);
            com.google.common.base.j0.E(value);
            com.google.common.base.j0.u(!range.u(), "Range must not be empty, but was %s", range);
            this.f118283a.add(b8.O(range, value));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @z7.a
        public c<K, V> d(h9<K, ? extends V> rangeMap) {
            for (Map.Entry entry : rangeMap.d().entrySet()) {
                c((f9) entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    private static class d<K extends Comparable<?>, V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f118284b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n6<f9<K>, V> f118285a;

        d(n6<f9<K>, V> mapOfRanges) {
            this.f118285a = mapOfRanges;
        }

        Object a() {
            c cVar = new c();
            nb<Map.Entry<f9<K>, V>> it = this.f118285a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<f9<K>, V> next = it.next();
                cVar.c(next.getKey(), next.getValue());
            }
            return cVar.a();
        }

        Object readResolve() {
            return this.f118285a.isEmpty() ? x6.p() : a();
        }
    }

    x6(l6<f9<K>> ranges, l6<V> values) {
        this.f118274a = ranges;
        this.f118275b = values;
    }

    public static <K extends Comparable<?>, V> c<K, V> n() {
        return new c<>();
    }

    public static <K extends Comparable<?>, V> x6<K, V> o(h9<K, ? extends V> rangeMap) {
        if (rangeMap instanceof x6) {
            return (x6) rangeMap;
        }
        Map<f9<K>, ? extends V> mapD = rangeMap.d();
        l6.a aVar = new l6.a(mapD.size());
        l6.a aVar2 = new l6.a(mapD.size());
        for (Map.Entry entry : mapD.entrySet()) {
            aVar.a((f9) entry.getKey());
            aVar2.a(entry.getValue());
        }
        return new x6<>(aVar.e(), aVar2.e());
    }

    public static <K extends Comparable<?>, V> x6<K, V> p() {
        return (x6<K, V>) f118272c;
    }

    public static <K extends Comparable<?>, V> x6<K, V> q(f9<K> range, V value) {
        return new x6<>(l6.G(range), l6.G(value));
    }

    @com.google.common.annotations.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @d6
    public static <T, K extends Comparable<? super K>, V> Collector<T, ?, x6<K, V>> s(Function<? super T, f9<K>> keyFunction, Function<? super T, ? extends V> valueFunction) {
        return y2.Q(keyFunction, valueFunction);
    }

    @Override // com.google.common.collect.h9
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void a(f9<K> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h9
    public f9<K> b() {
        if (this.f118274a.isEmpty()) {
            throw new NoSuchElementException();
        }
        f9<K> f9Var = this.f118274a.get(0);
        l6<f9<K>> l6Var = this.f118274a;
        return f9.k(f9Var.f117396a, l6Var.get(l6Var.size() - 1).f117397b);
    }

    @Override // com.google.common.collect.h9
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h9
    @fj.a
    public Map.Entry<f9<K>, V> e(K key) {
        int iA = ea.a(this.f118274a, new w6(), u3.o(key), ea.c.f117369a, ea.b.f117365a);
        if (iA == -1) {
            return null;
        }
        f9<K> f9Var = this.f118274a.get(iA);
        if (f9Var.i(key)) {
            return b8.O(f9Var, this.f118275b.get(iA));
        }
        return null;
    }

    @Override // com.google.common.collect.h9
    public boolean equals(@fj.a Object o10) {
        if (o10 instanceof h9) {
            return d().equals(((h9) o10).d());
        }
        return false;
    }

    @Override // com.google.common.collect.h9
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void g(h9<K, ? extends V> rangeMap) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h9
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void h(f9<K> range, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h9
    public int hashCode() {
        return d().hashCode();
    }

    @Override // com.google.common.collect.h9
    @fj.a
    public V i(K key) {
        int iA = ea.a(this.f118274a, new w6(), u3.o(key), ea.c.f117369a, ea.b.f117365a);
        if (iA != -1 && this.f118274a.get(iA).i(key)) {
            return this.f118275b.get(iA);
        }
        return null;
    }

    @Override // com.google.common.collect.h9
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void j(f9<K> range, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h9
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public n6<f9<K>, V> f() {
        return this.f118274a.isEmpty() ? n6.q() : new c7(new r9(this.f118274a.U(), f9.C().E()), this.f118275b.U());
    }

    @Override // com.google.common.collect.h9
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public n6<f9<K>, V> d() {
        return this.f118274a.isEmpty() ? n6.q() : new c7(new r9(this.f118274a, f9.C()), this.f118275b);
    }

    @Override // com.google.common.collect.h9
    /* JADX INFO: renamed from: r */
    public x6<K, V> c(final f9<K> range) {
        if (((f9) com.google.common.base.j0.E(range)).u()) {
            return p();
        }
        if (this.f118274a.isEmpty() || range.n(b())) {
            return this;
        }
        l6<f9<K>> l6Var = this.f118274a;
        v6 v6Var = new v6();
        Comparable comparable = range.f117396a;
        ea.c cVar = ea.c.f117372d;
        ea.b bVar = ea.b.f117366b;
        int iA = ea.a(l6Var, v6Var, comparable, cVar, bVar);
        int iA2 = ea.a(this.f118274a, new w6(), range.f117397b, ea.c.f117369a, bVar);
        return iA >= iA2 ? p() : new b(this, new a(this, iA2 - iA, iA, range), this.f118275b.subList(iA, iA2), range, this);
    }

    @Override // com.google.common.collect.h9
    public String toString() {
        return d().toString();
    }

    Object writeReplace() {
        return new d(d());
    }
}
