package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class l8<K0, V0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f117609a = 8;

    class a extends k<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f117610b;

        a(final int val$expectedKeys) {
            this.f117610b = val$expectedKeys;
        }

        @Override // com.google.common.collect.l8.k
        <K, V> Map<K, Collection<V>> c() {
            return d9.d(this.f117610b);
        }
    }

    class b extends k<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f117611b;

        b(final int val$expectedKeys) {
            this.f117611b = val$expectedKeys;
        }

        @Override // com.google.common.collect.l8.k
        <K, V> Map<K, Collection<V>> c() {
            return d9.f(this.f117611b);
        }
    }

    class c extends k<K0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f117612b;

        c(final Comparator val$comparator) {
            this.f117612b = val$comparator;
        }

        @Override // com.google.common.collect.l8.k
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f117612b);
        }
    }

    class d extends k<K0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f117613b;

        d(final Class val$keyClass) {
            this.f117613b = val$keyClass;
        }

        @Override // com.google.common.collect.l8.k
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new EnumMap(this.f117613b);
        }
    }

    private static final class e<V> implements com.google.common.base.s0<List<V>>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f117614a;

        e(int expectedValuesPerKey) {
            this.f117614a = a3.b(expectedValuesPerKey, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.s0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f117614a);
        }
    }

    private static final class f<V extends Enum<V>> implements com.google.common.base.s0<Set<V>>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<V> f117615a;

        f(Class<V> clazz) {
            this.f117615a = (Class) com.google.common.base.j0.E(clazz);
        }

        @Override // com.google.common.base.s0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<V> get() {
            return EnumSet.noneOf(this.f117615a);
        }
    }

    private static final class g<V> implements com.google.common.base.s0<Set<V>>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f117616a;

        g(int expectedValuesPerKey) {
            this.f117616a = a3.b(expectedValuesPerKey, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.s0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<V> get() {
            return d9.e(this.f117616a);
        }
    }

    private static final class h<V> implements com.google.common.base.s0<Set<V>>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f117617a;

        h(int expectedValuesPerKey) {
            this.f117617a = a3.b(expectedValuesPerKey, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.s0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<V> get() {
            return d9.g(this.f117617a);
        }
    }

    private enum i implements com.google.common.base.s0<List<?>> {
        INSTANCE;

        public static <V> com.google.common.base.s0<List<V>> n() {
            return INSTANCE;
        }

        @Override // com.google.common.base.s0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public List<?> get() {
            return new LinkedList();
        }
    }

    public static abstract class j<K0, V0> extends l8<K0, V0> {
        j() {
            super(null);
        }

        @Override // com.google.common.collect.l8
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public abstract <K extends K0, V extends V0> w7<K, V> a();

        @Override // com.google.common.collect.l8
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public <K extends K0, V extends V0> w7<K, V> b(k8<? extends K, ? extends V> multimap) {
            return (w7) super.b(multimap);
        }
    }

    public static abstract class k<K0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f117620a = 2;

        class a extends j<K0, Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f117621b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k f117622c;

            a(final k this$0, final int val$expectedValuesPerKey) {
                this.f117621b = val$expectedValuesPerKey;
                this.f117622c = this$0;
            }

            @Override // com.google.common.collect.l8.j, com.google.common.collect.l8
            /* JADX INFO: renamed from: j */
            public <K extends K0, V> w7<K, V> a() {
                return n8.v(this.f117622c.c(), new e(this.f117621b));
            }
        }

        class b extends j<K0, Object> {
            b() {
            }

            @Override // com.google.common.collect.l8.j, com.google.common.collect.l8
            /* JADX INFO: renamed from: j */
            public <K extends K0, V> w7<K, V> a() {
                return n8.v(k.this.c(), i.n());
            }
        }

        class c extends l<K0, Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f117624b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k f117625c;

            c(final k this$0, final int val$expectedValuesPerKey) {
                this.f117624b = val$expectedValuesPerKey;
                this.f117625c = this$0;
            }

            @Override // com.google.common.collect.l8.l, com.google.common.collect.l8
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public <K extends K0, V> y9<K, V> a() {
                return n8.x(this.f117625c.c(), new g(this.f117624b));
            }
        }

        class d extends l<K0, Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f117626b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k f117627c;

            d(final k this$0, final int val$expectedValuesPerKey) {
                this.f117626b = val$expectedValuesPerKey;
                this.f117627c = this$0;
            }

            @Override // com.google.common.collect.l8.l, com.google.common.collect.l8
            /* JADX INFO: renamed from: j */
            public <K extends K0, V> y9<K, V> a() {
                return n8.x(this.f117627c.c(), new h(this.f117626b));
            }
        }

        class e extends m<K0, V0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Comparator f117628b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k f117629c;

            e(final k this$0, final Comparator val$comparator) {
                this.f117628b = val$comparator;
                this.f117629c = this$0;
            }

            @Override // com.google.common.collect.l8.m, com.google.common.collect.l8.l
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public <K extends K0, V extends V0> ja<K, V> a() {
                return n8.y(this.f117629c.c(), new n(this.f117628b));
            }
        }

        class f extends l<K0, V0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Class f117630b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k f117631c;

            f(final k this$0, final Class val$valueClass) {
                this.f117630b = val$valueClass;
                this.f117631c = this$0;
            }

            @Override // com.google.common.collect.l8.l, com.google.common.collect.l8
            /* JADX INFO: renamed from: j */
            public <K extends K0, V extends V0> y9<K, V> a() {
                return n8.x(this.f117631c.c(), new f(this.f117630b));
            }
        }

        k() {
        }

        public j<K0, Object> a() {
            return b(2);
        }

        public j<K0, Object> b(int expectedValuesPerKey) {
            a3.b(expectedValuesPerKey, "expectedValuesPerKey");
            return new a(this, expectedValuesPerKey);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> c();

        public <V0 extends Enum<V0>> l<K0, V0> d(Class<V0> valueClass) {
            com.google.common.base.j0.F(valueClass, "valueClass");
            return new f(this, valueClass);
        }

        public l<K0, Object> e() {
            return f(2);
        }

        public l<K0, Object> f(int expectedValuesPerKey) {
            a3.b(expectedValuesPerKey, "expectedValuesPerKey");
            return new c(this, expectedValuesPerKey);
        }

        public l<K0, Object> g() {
            return h(2);
        }

        public l<K0, Object> h(int expectedValuesPerKey) {
            a3.b(expectedValuesPerKey, "expectedValuesPerKey");
            return new d(this, expectedValuesPerKey);
        }

        public j<K0, Object> i() {
            return new b();
        }

        public m<K0, Comparable> j() {
            return k(a9.z());
        }

        public <V0> m<K0, V0> k(Comparator<V0> comparator) {
            com.google.common.base.j0.F(comparator, "comparator");
            return new e(this, comparator);
        }
    }

    public static abstract class l<K0, V0> extends l8<K0, V0> {
        l() {
            super(null);
        }

        @Override // com.google.common.collect.l8
        /* JADX INFO: renamed from: j */
        public abstract <K extends K0, V extends V0> y9<K, V> a();

        @Override // com.google.common.collect.l8
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public <K extends K0, V extends V0> y9<K, V> b(k8<? extends K, ? extends V> multimap) {
            return (y9) super.b(multimap);
        }
    }

    public static abstract class m<K0, V0> extends l<K0, V0> {
        m() {
        }

        @Override // com.google.common.collect.l8.l
        /* JADX INFO: renamed from: l */
        public abstract <K extends K0, V extends V0> ja<K, V> a();

        @Override // com.google.common.collect.l8.l
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public <K extends K0, V extends V0> ja<K, V> b(k8<? extends K, ? extends V> multimap) {
            return (ja) super.b(multimap);
        }
    }

    private static final class n<V> implements com.google.common.base.s0<SortedSet<V>>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Comparator<? super V> f117632a;

        n(Comparator<? super V> comparator) {
            this.f117632a = (Comparator) com.google.common.base.j0.E(comparator);
        }

        @Override // com.google.common.base.s0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SortedSet<V> get() {
            return new TreeSet(this.f117632a);
        }
    }

    /* synthetic */ l8(a aVar) {
        this();
    }

    public static <K0 extends Enum<K0>> k<K0> c(Class<K0> keyClass) {
        com.google.common.base.j0.E(keyClass);
        return new d(keyClass);
    }

    public static k<Object> d() {
        return e(8);
    }

    public static k<Object> e(int expectedKeys) {
        a3.b(expectedKeys, "expectedKeys");
        return new a(expectedKeys);
    }

    public static k<Object> f() {
        return g(8);
    }

    public static k<Object> g(int expectedKeys) {
        a3.b(expectedKeys, "expectedKeys");
        return new b(expectedKeys);
    }

    public static k<Comparable> h() {
        return i(a9.z());
    }

    public static <K0> k<K0> i(Comparator<K0> comparator) {
        com.google.common.base.j0.E(comparator);
        return new c(comparator);
    }

    public abstract <K extends K0, V extends V0> k8<K, V> a();

    public <K extends K0, V extends V0> k8<K, V> b(k8<? extends K, ? extends V> multimap) {
        k8<K, V> k8VarA = a();
        k8VarA.R(multimap);
        return k8VarA;
    }

    private l8() {
    }
}
