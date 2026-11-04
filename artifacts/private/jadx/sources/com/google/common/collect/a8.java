package com.google.common.collect;

import com.google.common.collect.a8.j;
import com.google.common.collect.a8.n;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
class a8<K, V, E extends j<K, V, E>, S extends n<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f117011j = 1073741824;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f117012k = 65536;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f117013l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f117014m = 63;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f117015n = 16;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final g0<Object, Object, f> f117016o = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f117017s = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final transient int f117018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final transient int f117019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient n<K, V, E, S>[] f117020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f117021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final com.google.common.base.m<Object> f117022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient k<K, V, E, S> f117023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @a8.b
    @fj.a
    transient Set<K> f117024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @a8.b
    @fj.a
    transient Collection<V> f117025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @a8.b
    @fj.a
    transient Set<Map.Entry<K, V>> f117026i;

    class a implements g0<Object, Object, f> {
        a() {
        }

        @Override // com.google.common.collect.a8.g0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g0<Object, Object, f> a(ReferenceQueue<Object> queue, f entry) {
            return this;
        }

        @Override // com.google.common.collect.a8.g0
        public void clear() {
        }

        @Override // com.google.common.collect.a8.g0
        @fj.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public f b() {
            return null;
        }

        @Override // com.google.common.collect.a8.g0
        @fj.a
        public Object get() {
            return null;
        }
    }

    static final class a0<K> extends n<K, z7.a, z<K>, a0<K>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ReferenceQueue<K> f117027g;

        a0(a8<K, z7.a, z<K>, a0<K>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.f117027g = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.a8.n
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public z<K> a(j<K, z7.a, ?> entry) {
            return (z) entry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.a8.n
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public a0<K> Q() {
            return this;
        }

        @Override // com.google.common.collect.a8.n
        ReferenceQueue<K> o() {
            return this.f117027g;
        }

        @Override // com.google.common.collect.a8.n
        void w() {
            c(this.f117027g);
        }

        @Override // com.google.common.collect.a8.n
        void x() {
            i(this.f117027g);
        }
    }

    static abstract class b<K, V> extends w4<K, V> implements Serializable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f117028g = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final p f117029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final p f117030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final com.google.common.base.m<Object> f117031c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.google.common.base.m<Object> f117032d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f117033e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        transient ConcurrentMap<K, V> f117034f;

        b(p keyStrength, p valueStrength, com.google.common.base.m<Object> keyEquivalence, com.google.common.base.m<Object> valueEquivalence, int concurrencyLevel, ConcurrentMap<K, V> delegate) {
            this.f117029a = keyStrength;
            this.f117030b = valueStrength;
            this.f117031c = keyEquivalence;
            this.f117032d = valueEquivalence;
            this.f117033e = concurrencyLevel;
            this.f117034f = delegate;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.w4, com.google.common.collect.g5
        /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
        public ConcurrentMap<K, V> i1() {
            return this.f117034f;
        }

        @com.google.common.annotations.d
        void f1(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                }
                this.f117034f.put((K) object, (V) objectInputStream.readObject());
            }
        }

        @com.google.common.annotations.d
        z7 i1(ObjectInputStream in) throws IOException {
            return new z7().g(in.readInt()).j(this.f117029a).k(this.f117030b).h(this.f117031c).a(this.f117033e);
        }

        void k1(ObjectOutputStream out) throws IOException {
            out.writeInt(this.f117034f.size());
            for (Map.Entry<K, V> entry : this.f117034f.entrySet()) {
                out.writeObject(entry.getKey());
                out.writeObject(entry.getValue());
            }
            out.writeObject(null);
        }
    }

    static class b0<K, V> extends d<K, V, b0<K, V>> implements w<K, V, b0<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        private volatile V f117035b;

        static final class a<K, V> implements k<K, V, b0<K, V>, c0<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f117036a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) f117036a;
            }

            @Override // com.google.common.collect.a8.k
            public p c() {
                return p.f117072b;
            }

            @Override // com.google.common.collect.a8.k
            public p e() {
                return p.f117071a;
            }

            @Override // com.google.common.collect.a8.k
            @fj.a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public b0<K, V> d(c0<K, V> segment, b0<K, V> entry, @fj.a b0<K, V> newNext) {
                K key = entry.getKey();
                if (key == null) {
                    return null;
                }
                b0<K, V> b0VarF = f(segment, key, entry.f117041a, newNext);
                ((b0) b0VarF).f117035b = ((b0) entry).f117035b;
                return b0VarF;
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public b0<K, V> f(c0<K, V> segment, K key, int hash, @fj.a b0<K, V> next) {
                return next == null ? new b0<>(((c0) segment).f117040g, key, hash, null) : new b(((c0) segment).f117040g, key, hash, next, null);
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public c0<K, V> a(a8<K, V, b0<K, V>, c0<K, V>> map, int initialCapacity) {
                return new c0<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(c0<K, V> segment, b0<K, V> entry, V value) {
                ((b0) entry).f117035b = value;
            }
        }

        private static final class b<K, V> extends b0<K, V> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final b0<K, V> f117037c;

            /* synthetic */ b(ReferenceQueue referenceQueue, Object obj, int i10, b0 b0Var, a aVar) {
                this(referenceQueue, obj, i10, b0Var);
            }

            @Override // com.google.common.collect.a8.d, com.google.common.collect.a8.j
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b0<K, V> w() {
                return this.f117037c;
            }

            private b(ReferenceQueue<K> queue, K key, int hash, b0<K, V> next) {
                super(queue, key, hash, null);
                this.f117037c = next;
            }
        }

        /* synthetic */ b0(ReferenceQueue referenceQueue, Object obj, int i10, a aVar) {
            this(referenceQueue, obj, i10);
        }

        @Override // com.google.common.collect.a8.j
        @fj.a
        public final V getValue() {
            return this.f117035b;
        }

        private b0(ReferenceQueue<K> queue, K key, int hash) {
            super(queue, key, hash);
            this.f117035b = null;
        }
    }

    static abstract class c<K, V, E extends j<K, V, E>> implements j<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f117038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f117039b;

        c(K key, int hash) {
            this.f117038a = key;
            this.f117039b = hash;
        }

        @Override // com.google.common.collect.a8.j
        public final K getKey() {
            return this.f117038a;
        }

        @Override // com.google.common.collect.a8.j
        public final int l() {
            return this.f117039b;
        }

        @Override // com.google.common.collect.a8.j
        @fj.a
        public E w() {
            return null;
        }
    }

    static final class c0<K, V> extends n<K, V, b0<K, V>, c0<K, V>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ReferenceQueue<K> f117040g;

        c0(a8<K, V, b0<K, V>, c0<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.f117040g = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.a8.n
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public b0<K, V> a(j<K, V, ?> entry) {
            return (b0) entry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.a8.n
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public c0<K, V> Q() {
            return this;
        }

        @Override // com.google.common.collect.a8.n
        ReferenceQueue<K> o() {
            return this.f117040g;
        }

        @Override // com.google.common.collect.a8.n
        void w() {
            c(this.f117040g);
        }

        @Override // com.google.common.collect.a8.n
        void x() {
            i(this.f117040g);
        }
    }

    static abstract class d<K, V, E extends j<K, V, E>> extends WeakReference<K> implements j<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f117041a;

        d(ReferenceQueue<K> queue, K key, int hash) {
            super(key, queue);
            this.f117041a = hash;
        }

        @Override // com.google.common.collect.a8.j
        public final K getKey() {
            return get();
        }

        @Override // com.google.common.collect.a8.j
        public final int l() {
            return this.f117041a;
        }

        @fj.a
        public E w() {
            return null;
        }
    }

    static class d0<K, V> extends d<K, V, d0<K, V>> implements f0<K, V, d0<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile g0<K, V, d0<K, V>> f117042b;

        static final class a<K, V> implements k<K, V, d0<K, V>, e0<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f117043a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) f117043a;
            }

            @Override // com.google.common.collect.a8.k
            public p c() {
                return p.f117072b;
            }

            @Override // com.google.common.collect.a8.k
            public p e() {
                return p.f117072b;
            }

            @Override // com.google.common.collect.a8.k
            @fj.a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public d0<K, V> d(e0<K, V> segment, d0<K, V> entry, @fj.a d0<K, V> newNext) {
                K key = entry.getKey();
                if (key != null && !n.v(entry)) {
                    d0<K, V> d0VarF = f(segment, key, entry.f117041a, newNext);
                    ((d0) d0VarF).f117042b = ((d0) entry).f117042b.a(((e0) segment).f117047h, d0VarF);
                    return d0VarF;
                }
                return null;
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public d0<K, V> f(e0<K, V> segment, K key, int hash, @fj.a d0<K, V> next) {
                return next == null ? new d0<>(((e0) segment).f117046g, key, hash) : new b(((e0) segment).f117046g, key, hash, next);
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public e0<K, V> a(a8<K, V, d0<K, V>, e0<K, V>> map, int initialCapacity) {
                return new e0<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(e0<K, V> segment, d0<K, V> entry, V value) {
                g0 g0Var = ((d0) entry).f117042b;
                ((d0) entry).f117042b = new h0(((e0) segment).f117047h, value, entry);
                g0Var.clear();
            }
        }

        private static final class b<K, V> extends d0<K, V> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final d0<K, V> f117044c;

            b(ReferenceQueue<K> queue, K key, int hash, d0<K, V> next) {
                super(queue, key, hash);
                this.f117044c = next;
            }

            @Override // com.google.common.collect.a8.d, com.google.common.collect.a8.j
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public d0<K, V> w() {
                return this.f117044c;
            }
        }

        d0(ReferenceQueue<K> queue, K key, int hash) {
            super(queue, key, hash);
            this.f117042b = a8.o();
        }

        @Override // com.google.common.collect.a8.j
        public final V getValue() {
            return this.f117042b.get();
        }

        @Override // com.google.common.collect.a8.f0
        public final g0<K, V, d0<K, V>> k() {
            return this.f117042b;
        }
    }

    static final class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference<a8<?, ?, ?, ?>> f117045a;

        public e(a8<?, ?, ?, ?> map) {
            this.f117045a = new WeakReference<>(map);
        }

        @Override // java.lang.Runnable
        public void run() {
            a8<?, ?, ?, ?> a8Var = this.f117045a.get();
            if (a8Var == null) {
                throw new CancellationException();
            }
            for (n<?, ?, E, S> nVar : a8Var.f117020c) {
                nVar.O();
            }
        }
    }

    static final class e0<K, V> extends n<K, V, d0<K, V>, e0<K, V>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ReferenceQueue<K> f117046g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ReferenceQueue<V> f117047h;

        e0(a8<K, V, d0<K, V>, e0<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.f117046g = new ReferenceQueue<>();
            this.f117047h = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.a8.n
        public g0<K, V, d0<K, V>> A(j<K, V, ?> e10, V value) {
            return new h0(this.f117047h, value, a(e10));
        }

        @Override // com.google.common.collect.a8.n
        public void U(j<K, V, ?> e10, g0<K, V, ? extends j<K, V, ?>> valueReference) {
            d0<K, V> d0VarA = a(e10);
            g0 g0Var = ((d0) d0VarA).f117042b;
            ((d0) d0VarA).f117042b = valueReference;
            g0Var.clear();
        }

        @Override // com.google.common.collect.a8.n
        @fj.a
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public d0<K, V> a(@fj.a j<K, V, ?> entry) {
            return (d0) entry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.a8.n
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public e0<K, V> Q() {
            return this;
        }

        @Override // com.google.common.collect.a8.n
        ReferenceQueue<K> o() {
            return this.f117046g;
        }

        @Override // com.google.common.collect.a8.n
        ReferenceQueue<V> s() {
            return this.f117047h;
        }

        @Override // com.google.common.collect.a8.n
        public g0<K, V, d0<K, V>> t(j<K, V, ?> e10) {
            return a(e10).k();
        }

        @Override // com.google.common.collect.a8.n
        void w() {
            c(this.f117046g);
        }

        @Override // com.google.common.collect.a8.n
        void x() {
            i(this.f117046g);
            j(this.f117047h);
        }
    }

    static final class f implements j<Object, Object, f> {
        private f() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.a8.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f w() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.a8.j
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.a8.j
        public Object getValue() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.a8.j
        public int l() {
            throw new AssertionError();
        }
    }

    interface f0<K, V, E extends j<K, V, E>> extends j<K, V, E> {
        g0<K, V, E> k();
    }

    final class g extends a8<K, V, E, S>.i<Map.Entry<K, V>> {
        g() {
            super();
        }

        @Override // com.google.common.collect.a8.i, java.util.Iterator
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return d();
        }
    }

    interface g0<K, V, E extends j<K, V, E>> {
        g0<K, V, E> a(ReferenceQueue<V> queue, E entry);

        E b();

        void clear();

        @fj.a
        V get();
    }

    final class h extends AbstractSet<Map.Entry<K, V>> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a8.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o10) {
            Map.Entry entry;
            Object key;
            Object obj;
            return (o10 instanceof Map.Entry) && (key = (entry = (Map.Entry) o10).getKey()) != null && (obj = a8.this.get(key)) != null && a8.this.p().d(entry.getValue(), obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a8.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o10) {
            if (!(o10 instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o10;
            Object key = entry.getKey();
            return key != null && a8.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a8.this.size();
        }
    }

    static final class h0<K, V, E extends j<K, V, E>> extends WeakReference<V> implements g0<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @r9.m
        final E f117050a;

        h0(ReferenceQueue<V> queue, V referent, E entry) {
            super(referent, queue);
            this.f117050a = entry;
        }

        @Override // com.google.common.collect.a8.g0
        public g0<K, V, E> a(ReferenceQueue<V> queue, E entry) {
            return new h0(queue, get(), entry);
        }

        @Override // com.google.common.collect.a8.g0
        public E b() {
            return this.f117050a;
        }
    }

    abstract class i<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f117051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f117052b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        n<K, V, E, S> f117053c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.a
        AtomicReferenceArray<E> f117054d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @fj.a
        E f117055e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @fj.a
        a8<K, V, E, S>.i0 f117056f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @fj.a
        a8<K, V, E, S>.i0 f117057g;

        i() {
            this.f117051a = a8.this.f117020c.length - 1;
            b();
        }

        final void b() {
            this.f117056f = null;
            if (e() || f()) {
                return;
            }
            while (true) {
                int i10 = this.f117051a;
                if (i10 < 0) {
                    return;
                }
                n<K, V, E, S>[] nVarArr = a8.this.f117020c;
                this.f117051a = i10 - 1;
                n<K, V, E, S> nVar = nVarArr[i10];
                this.f117053c = nVar;
                if (nVar.f117065b != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f117053c.f117068e;
                    this.f117054d = atomicReferenceArray;
                    this.f117052b = atomicReferenceArray.length() - 1;
                    if (f()) {
                        return;
                    }
                }
            }
        }

        boolean c(E entry) {
            try {
                Object key = entry.getKey();
                Object objF = a8.this.f(entry);
                if (objF == null) {
                    this.f117053c.B();
                    return false;
                }
                this.f117056f = new i0(key, objF);
                this.f117053c.B();
                return true;
            } catch (Throwable th2) {
                this.f117053c.B();
                throw th2;
            }
        }

        a8<K, V, E, S>.i0 d() {
            a8<K, V, E, S>.i0 i0Var = this.f117056f;
            if (i0Var == null) {
                throw new NoSuchElementException();
            }
            this.f117057g = i0Var;
            b();
            return this.f117057g;
        }

        boolean e() {
            E e10 = this.f117055e;
            if (e10 != null) {
                while (true) {
                    this.f117055e = (E) e10.w();
                    E e11 = this.f117055e;
                    if (e11 == null) {
                        break;
                    }
                    if (c(e11)) {
                        return true;
                    }
                    e10 = this.f117055e;
                }
            }
            return false;
        }

        boolean f() {
            while (true) {
                int i10 = this.f117052b;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f117054d;
                this.f117052b = i10 - 1;
                E e10 = atomicReferenceArray.get(i10);
                this.f117055e = e10;
                if (e10 != null && (c(e10) || e())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f117056f != null;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            a3.e(this.f117057g != null);
            a8.this.remove(this.f117057g.getKey());
            this.f117057g = null;
        }
    }

    final class i0 extends com.google.common.collect.g<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f117059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        V f117060b;

        i0(K key, V value) {
            this.f117059a = key;
            this.f117060b = value;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public boolean equals(@fj.a Object object) {
            if (object instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) object;
                if (this.f117059a.equals(entry.getKey()) && this.f117060b.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public K getKey() {
            return this.f117059a;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public V getValue() {
            return this.f117060b;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public int hashCode() {
            return this.f117060b.hashCode() ^ this.f117059a.hashCode();
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = (V) a8.this.put(this.f117059a, v10);
            this.f117060b = v10;
            return v11;
        }
    }

    interface j<K, V, E extends j<K, V, E>> {
        K getKey();

        V getValue();

        int l();

        E w();
    }

    interface k<K, V, E extends j<K, V, E>, S extends n<K, V, E, S>> {
        S a(a8<K, V, E, S> map, int initialCapacity);

        void b(S segment, E entry, V value);

        p c();

        E d(S segment, E entry, @fj.a E newNext);

        p e();

        E f(S segment, K key, int hash, @fj.a E next);
    }

    final class l extends a8<K, V, E, S>.i<K> {
        l() {
            super();
        }

        @Override // com.google.common.collect.a8.i, java.util.Iterator
        public K next() {
            return d().getKey();
        }
    }

    final class m extends AbstractSet<K> {
        m() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a8.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o10) {
            return a8.this.containsKey(o10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a8.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o10) {
            return a8.this.remove(o10) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a8.this.size();
        }
    }

    static abstract class n<K, V, E extends j<K, V, E>, S extends n<K, V, E, S>> extends ReentrantLock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @r9.m
        final a8<K, V, E, S> f117064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile int f117065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f117066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f117067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @fj.a
        volatile AtomicReferenceArray<E> f117068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicInteger f117069f = new AtomicInteger();

        n(a8<K, V, E, S> map, int initialCapacity) {
            this.f117064a = map;
            u(y(initialCapacity));
        }

        static <K, V, E extends j<K, V, E>> boolean v(E entry) {
            return entry.getValue() == null;
        }

        g0<K, V, E> A(j<K, V, ?> entry, V value) {
            throw new AssertionError();
        }

        void B() {
            if ((this.f117069f.incrementAndGet() & 63) == 0) {
                O();
            }
        }

        @a8.a("this")
        void C() {
            P();
        }

        @fj.a
        V D(K k10, int i10, V v10, boolean z10) {
            lock();
            try {
                C();
                int i11 = this.f117065b + 1;
                if (i11 > this.f117067d) {
                    k();
                    i11 = this.f117065b + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f117068e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (j jVarW = e10; jVarW != null; jVarW = jVarW.w()) {
                    Object key = jVarW.getKey();
                    if (jVarW.l() == i10 && key != null && this.f117064a.f117022e.d(k10, key)) {
                        V v11 = (V) jVarW.getValue();
                        if (v11 == null) {
                            this.f117066c++;
                            S(jVarW, v10);
                            this.f117065b = this.f117065b;
                            unlock();
                            return null;
                        }
                        if (z10) {
                            unlock();
                            return v11;
                        }
                        this.f117066c++;
                        S(jVarW, v10);
                        unlock();
                        return v11;
                    }
                }
                this.f117066c++;
                j jVarF = this.f117064a.f117023f.f(Q(), k10, i10, e10);
                S(jVarF, v10);
                atomicReferenceArray.set(length, (E) jVarF);
                this.f117065b = i11;
                unlock();
                return null;
            } catch (Throwable th2) {
                unlock();
                throw th2;
            }
        }

        @z7.a
        boolean E(E e10, int i10) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f117068e;
                int length = i10 & (atomicReferenceArray.length() - 1);
                E e11 = atomicReferenceArray.get(length);
                for (j jVarW = e11; jVarW != null; jVarW = jVarW.w()) {
                    if (jVarW == e10) {
                        this.f117066c++;
                        j jVarJ = J(e11, jVarW);
                        int i11 = this.f117065b - 1;
                        atomicReferenceArray.set(length, (E) jVarJ);
                        this.f117065b = i11;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        @z7.a
        boolean F(K k10, int i10, g0<K, V, E> g0Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f117068e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                j jVarW = e10;
                while (jVarW != null) {
                    Object key = jVarW.getKey();
                    if (jVarW.l() == i10 && key != null && this.f117064a.f117022e.d(k10, key)) {
                        if (((f0) jVarW).k() != g0Var) {
                            unlock();
                            return false;
                        }
                        this.f117066c++;
                        j jVarJ = J(e10, jVarW);
                        int i11 = this.f117065b - 1;
                        atomicReferenceArray.set(length, (E) jVarJ);
                        this.f117065b = i11;
                        unlock();
                        return true;
                    }
                    jVarW = jVarW.w();
                }
                unlock();
                return false;
            } catch (Throwable th2) {
                unlock();
                throw th2;
            }
        }

        @z7.a
        @fj.a
        V G(Object obj, int i10) {
            lock();
            try {
                C();
                AtomicReferenceArray<E> atomicReferenceArray = this.f117068e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                j jVarW = e10;
                while (jVarW != null) {
                    Object key = jVarW.getKey();
                    if (jVarW.l() == i10 && key != null && this.f117064a.f117022e.d(obj, key)) {
                        V v10 = (V) jVarW.getValue();
                        if (v10 == null && !v(jVarW)) {
                            unlock();
                            return null;
                        }
                        this.f117066c++;
                        j jVarJ = J(e10, jVarW);
                        int i11 = this.f117065b - 1;
                        atomicReferenceArray.set(length, (E) jVarJ);
                        this.f117065b = i11;
                        unlock();
                        return v10;
                    }
                    jVarW = jVarW.w();
                }
                unlock();
                return null;
            } catch (Throwable th2) {
                unlock();
                throw th2;
            }
        }

        boolean H(Object obj, int i10, Object obj2) {
            lock();
            try {
                C();
                AtomicReferenceArray<E> atomicReferenceArray = this.f117068e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                j jVarW = e10;
                while (true) {
                    boolean z10 = false;
                    if (jVarW == null) {
                        return false;
                    }
                    Object key = jVarW.getKey();
                    if (jVarW.l() == i10 && key != null && this.f117064a.f117022e.d(obj, key)) {
                        if (this.f117064a.p().d(obj2, jVarW.getValue())) {
                            z10 = true;
                        } else if (!v(jVarW)) {
                            return false;
                        }
                        this.f117066c++;
                        j jVarJ = J(e10, jVarW);
                        int i11 = this.f117065b - 1;
                        atomicReferenceArray.set(length, (E) jVarJ);
                        this.f117065b = i11;
                        return z10;
                    }
                    jVarW = jVarW.w();
                }
            } finally {
                unlock();
            }
        }

        @a8.a("this")
        boolean I(E e10) {
            int iL = e10.l();
            AtomicReferenceArray<E> atomicReferenceArray = this.f117068e;
            int length = iL & (atomicReferenceArray.length() - 1);
            E e11 = atomicReferenceArray.get(length);
            for (j jVarW = e11; jVarW != null; jVarW = jVarW.w()) {
                if (jVarW == e10) {
                    this.f117066c++;
                    j jVarJ = J(e11, jVarW);
                    int i10 = this.f117065b - 1;
                    atomicReferenceArray.set(length, (E) jVarJ);
                    this.f117065b = i10;
                    return true;
                }
            }
            return false;
        }

        @a8.a("this")
        @fj.a
        E J(E e10, E e11) {
            int i10 = this.f117065b;
            E e12 = (E) e11.w();
            while (e10 != e11) {
                j jVarG = g(e10, e12);
                if (jVarG != null) {
                    e12 = (E) jVarG;
                } else {
                    i10--;
                }
                e10 = (E) e10.w();
            }
            this.f117065b = i10;
            return e12;
        }

        @fj.a
        E K(j<K, V, ?> jVar, j<K, V, ?> jVar2) {
            return (E) J(a(jVar), a(jVar2));
        }

        @z7.a
        boolean L(j<K, V, ?> entry) {
            return I(a(entry));
        }

        @fj.a
        V M(K k10, int i10, V v10) {
            lock();
            try {
                C();
                AtomicReferenceArray<E> atomicReferenceArray = this.f117068e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                j jVarW = e10;
                while (jVarW != null) {
                    Object key = jVarW.getKey();
                    if (jVarW.l() == i10 && key != null && this.f117064a.f117022e.d(k10, key)) {
                        V v11 = (V) jVarW.getValue();
                        if (v11 != null) {
                            this.f117066c++;
                            S(jVarW, v10);
                            unlock();
                            return v11;
                        }
                        if (v(jVarW)) {
                            this.f117066c++;
                            j jVarJ = J(e10, jVarW);
                            int i11 = this.f117065b - 1;
                            atomicReferenceArray.set(length, (E) jVarJ);
                            this.f117065b = i11;
                        }
                        unlock();
                        return null;
                    }
                    jVarW = jVarW.w();
                }
                unlock();
                return null;
            } catch (Throwable th2) {
                unlock();
                throw th2;
            }
        }

        boolean N(K k10, int i10, V v10, V v11) {
            lock();
            try {
                C();
                AtomicReferenceArray<E> atomicReferenceArray = this.f117068e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (j jVarW = e10; jVarW != null; jVarW = jVarW.w()) {
                    Object key = jVarW.getKey();
                    if (jVarW.l() == i10 && key != null && this.f117064a.f117022e.d(k10, key)) {
                        Object value = jVarW.getValue();
                        if (value != null) {
                            if (!this.f117064a.p().d(v10, value)) {
                                unlock();
                                return false;
                            }
                            this.f117066c++;
                            S(jVarW, v11);
                            unlock();
                            return true;
                        }
                        if (v(jVarW)) {
                            this.f117066c++;
                            j jVarJ = J(e10, jVarW);
                            int i11 = this.f117065b - 1;
                            atomicReferenceArray.set(length, (E) jVarJ);
                            this.f117065b = i11;
                        }
                        unlock();
                        return false;
                    }
                }
                unlock();
                return false;
            } catch (Throwable th2) {
                unlock();
                throw th2;
            }
        }

        void O() {
            P();
        }

        void P() {
            if (tryLock()) {
                try {
                    x();
                    this.f117069f.set(0);
                } finally {
                    unlock();
                }
            }
        }

        abstract S Q();

        void R(int i10, j<K, V, ?> jVar) {
            this.f117068e.set(i10, (E) a(jVar));
        }

        void S(E entry, V value) {
            this.f117064a.f117023f.b(Q(), entry, value);
        }

        void T(j<K, V, ?> entry, V value) {
            this.f117064a.f117023f.b(Q(), a(entry), value);
        }

        void U(j<K, V, ?> entry, g0<K, V, ? extends j<K, V, ?>> valueReference) {
            throw new AssertionError();
        }

        void V() {
            if (tryLock()) {
                try {
                    x();
                } finally {
                    unlock();
                }
            }
        }

        abstract E a(j<K, V, ?> entry);

        void b() {
            if (this.f117065b != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f117068e;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    w();
                    this.f117069f.set(0);
                    this.f117066c++;
                    this.f117065b = 0;
                    unlock();
                } catch (Throwable th2) {
                    unlock();
                    throw th2;
                }
            }
        }

        <T> void c(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        @z7.a
        boolean d(K k10, int i10, g0<K, V, ? extends j<K, V, ?>> g0Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f117068e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (j jVarW = e10; jVarW != null; jVarW = jVarW.w()) {
                    Object key = jVarW.getKey();
                    if (jVarW.l() == i10 && key != null && this.f117064a.f117022e.d(k10, key)) {
                        if (((f0) jVarW).k() != g0Var) {
                            unlock();
                            return false;
                        }
                        atomicReferenceArray.set(length, (E) J(e10, jVarW));
                        unlock();
                        return true;
                    }
                }
                unlock();
                return false;
            } catch (Throwable th2) {
                unlock();
                throw th2;
            }
        }

        boolean e(Object key, int hash) {
            try {
                boolean z10 = false;
                if (this.f117065b == 0) {
                    return false;
                }
                j jVarP = p(key, hash);
                if (jVarP != null && jVarP.getValue() != null) {
                    z10 = true;
                }
                return z10;
            } finally {
                B();
            }
        }

        @com.google.common.annotations.e
        boolean f(Object value) {
            try {
                if (this.f117065b != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f117068e;
                    int length = atomicReferenceArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        for (E eW = atomicReferenceArray.get(i10); eW != null; eW = eW.w()) {
                            V vQ = q(eW);
                            if (vQ != null && this.f117064a.p().d(value, vQ)) {
                                B();
                                int i11 = 0 >> 1;
                                return true;
                            }
                        }
                    }
                }
                B();
                return false;
            } catch (Throwable th2) {
                B();
                throw th2;
            }
        }

        @fj.a
        E g(E e10, E e11) {
            return (E) this.f117064a.f117023f.d(Q(), e10, e11);
        }

        E h(j<K, V, ?> jVar, @fj.a j<K, V, ?> jVar2) {
            return (E) this.f117064a.f117023f.d(Q(), a(jVar), a(jVar2));
        }

        @a8.a("this")
        void i(ReferenceQueue<K> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f117064a.k((j) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        @a8.a("this")
        void j(ReferenceQueue<V> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f117064a.l((g0) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        @a8.a("this")
        void k() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f117068e;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.f117065b;
            AtomicReferenceArray<E> atomicReferenceArrayY = y(length << 1);
            this.f117067d = (atomicReferenceArrayY.length() * 3) / 4;
            int length2 = atomicReferenceArrayY.length() - 1;
            for (int i11 = 0; i11 < length; i11++) {
                E eW = atomicReferenceArray.get(i11);
                if (eW != null) {
                    j jVarW = eW.w();
                    int iL = eW.l() & length2;
                    if (jVarW == null) {
                        atomicReferenceArrayY.set(iL, eW);
                    } else {
                        j jVar = eW;
                        while (jVarW != null) {
                            int iL2 = jVarW.l() & length2;
                            if (iL2 != iL) {
                                jVar = jVarW;
                                iL = iL2;
                            }
                            jVarW = jVarW.w();
                        }
                        atomicReferenceArrayY.set(iL, jVar);
                        while (eW != jVar) {
                            int iL3 = eW.l() & length2;
                            j jVarG = g(eW, (j) atomicReferenceArrayY.get(iL3));
                            if (jVarG != null) {
                                atomicReferenceArrayY.set(iL3, jVarG);
                            } else {
                                i10--;
                            }
                            eW = eW.w();
                        }
                    }
                }
            }
            this.f117068e = atomicReferenceArrayY;
            this.f117065b = i10;
        }

        @fj.a
        V l(Object obj, int i10) {
            try {
                j jVarP = p(obj, i10);
                if (jVarP == null) {
                    B();
                    return null;
                }
                V v10 = (V) jVarP.getValue();
                if (v10 == null) {
                    V();
                }
                B();
                return v10;
            } catch (Throwable th2) {
                B();
                throw th2;
            }
        }

        @fj.a
        E m(Object obj, int i10) {
            if (this.f117065b == 0) {
                return null;
            }
            for (E e10 = (E) n(i10); e10 != null; e10 = (E) e10.w()) {
                if (e10.l() == i10) {
                    Object key = e10.getKey();
                    if (key == null) {
                        V();
                    } else if (this.f117064a.f117022e.d(obj, key)) {
                        return e10;
                    }
                }
            }
            return null;
        }

        @fj.a
        E n(int hash) {
            AtomicReferenceArray<E> atomicReferenceArray = this.f117068e;
            return atomicReferenceArray.get(hash & (atomicReferenceArray.length() - 1));
        }

        ReferenceQueue<K> o() {
            throw new AssertionError();
        }

        @fj.a
        E p(Object obj, int i10) {
            return (E) m(obj, i10);
        }

        @fj.a
        V q(E e10) {
            if (e10.getKey() == null) {
                V();
                return null;
            }
            V v10 = (V) e10.getValue();
            if (v10 != null) {
                return v10;
            }
            V();
            return null;
        }

        @fj.a
        V r(j<K, V, ?> entry) {
            return q(a(entry));
        }

        ReferenceQueue<V> s() {
            throw new AssertionError();
        }

        g0<K, V, E> t(j<K, V, ?> entry) {
            throw new AssertionError();
        }

        void u(AtomicReferenceArray<E> newTable) {
            this.f117067d = (newTable.length() * 3) / 4;
            this.f117068e = newTable;
        }

        void w() {
        }

        @a8.a("this")
        void x() {
        }

        AtomicReferenceArray<E> y(int size) {
            return new AtomicReferenceArray<>(size);
        }

        E z(K k10, int i10, @fj.a j<K, V, ?> jVar) {
            return (E) this.f117064a.f117023f.f(Q(), k10, i10, a(jVar));
        }
    }

    private static final class o<K, V> extends b<K, V> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f117070h = 3;

        o(p keyStrength, p valueStrength, com.google.common.base.m<Object> keyEquivalence, com.google.common.base.m<Object> valueEquivalence, int concurrencyLevel, ConcurrentMap<K, V> delegate) {
            super(keyStrength, valueStrength, keyEquivalence, valueEquivalence, concurrencyLevel, delegate);
        }

        @com.google.common.annotations.d
        private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
            in.defaultReadObject();
            this.f117034f = i1(in).i();
            f1(in);
        }

        private Object readResolve() {
            return this.f117034f;
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            out.defaultWriteObject();
            k1(out);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f117071a = new a("STRONG", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final p f117072b = new b("WEAK", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ p[] f117073c = k();

        final enum a extends p {
            a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.collect.a8.p
            com.google.common.base.m<Object> l() {
                return com.google.common.base.m.c();
            }
        }

        final enum b extends p {
            b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.collect.a8.p
            com.google.common.base.m<Object> l() {
                return com.google.common.base.m.g();
            }
        }

        private p(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        private static /* synthetic */ p[] k() {
            return new p[]{f117071a, f117072b};
        }

        public static p valueOf(String name) {
            return (p) Enum.valueOf(p.class, name);
        }

        public static p[] values() {
            return (p[]) f117073c.clone();
        }

        abstract com.google.common.base.m<Object> l();

        /* synthetic */ p(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    static class q<K> extends c<K, z7.a, q<K>> implements w<K, z7.a, q<K>> {

        static final class a<K> implements k<K, z7.a, q<K>, r<K>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?> f117074a = new a<>();

            a() {
            }

            static <K> a<K> h() {
                return (a<K>) f117074a;
            }

            @Override // com.google.common.collect.a8.k
            public p c() {
                return p.f117071a;
            }

            @Override // com.google.common.collect.a8.k
            public p e() {
                return p.f117071a;
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public q<K> d(r<K> segment, q<K> entry, @fj.a q<K> newNext) {
                return f(segment, entry.f117038a, entry.f117039b, newNext);
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public q<K> f(r<K> segment, K key, int hash, @fj.a q<K> next) {
                return next == null ? new q<>(key, hash, null) : new b(key, hash, next);
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public r<K> a(a8<K, z7.a, q<K>, r<K>> map, int initialCapacity) {
                return new r<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(r<K> segment, q<K> entry, z7.a value) {
            }
        }

        private static final class b<K> extends q<K> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final q<K> f117075c;

            b(K key, int hash, q<K> next) {
                super(key, hash, null);
                this.f117075c = next;
            }

            @Override // com.google.common.collect.a8.c, com.google.common.collect.a8.j
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public q<K> w() {
                return this.f117075c;
            }

            @Override // com.google.common.collect.a8.q, com.google.common.collect.a8.j
            public /* bridge */ /* synthetic */ Object getValue() {
                return super.getValue();
            }
        }

        /* synthetic */ q(Object obj, int i10, a aVar) {
            this(obj, i10);
        }

        @Override // com.google.common.collect.a8.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z7.a getValue() {
            return z7.a.VALUE;
        }

        private q(K key, int hash) {
            super(key, hash);
        }
    }

    static final class r<K> extends n<K, z7.a, q<K>, r<K>> {
        r(a8<K, z7.a, q<K>, r<K>> map, int initialCapacity) {
            super(map, initialCapacity);
        }

        @Override // com.google.common.collect.a8.n
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public q<K> a(j<K, z7.a, ?> entry) {
            return (q) entry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.a8.n
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public r<K> Q() {
            return this;
        }
    }

    static class s<K, V> extends c<K, V, s<K, V>> implements w<K, V, s<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        private volatile V f117076c;

        static final class a<K, V> implements k<K, V, s<K, V>, t<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f117077a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) f117077a;
            }

            @Override // com.google.common.collect.a8.k
            public p c() {
                return p.f117071a;
            }

            @Override // com.google.common.collect.a8.k
            public p e() {
                return p.f117071a;
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public s<K, V> d(t<K, V> segment, s<K, V> entry, @fj.a s<K, V> newNext) {
                s<K, V> sVarF = f(segment, entry.f117038a, entry.f117039b, newNext);
                ((s) sVarF).f117076c = ((s) entry).f117076c;
                return sVarF;
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public s<K, V> f(t<K, V> segment, K key, int hash, @fj.a s<K, V> next) {
                return next == null ? new s<>(key, hash, null) : new b(key, hash, next);
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public t<K, V> a(a8<K, V, s<K, V>, t<K, V>> map, int initialCapacity) {
                return new t<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(t<K, V> segment, s<K, V> entry, V value) {
                ((s) entry).f117076c = value;
            }
        }

        private static final class b<K, V> extends s<K, V> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final s<K, V> f117078d;

            b(K key, int hash, s<K, V> next) {
                super(key, hash, null);
                this.f117078d = next;
            }

            @Override // com.google.common.collect.a8.c, com.google.common.collect.a8.j
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public s<K, V> w() {
                return this.f117078d;
            }
        }

        /* synthetic */ s(Object obj, int i10, a aVar) {
            this(obj, i10);
        }

        @Override // com.google.common.collect.a8.j
        @fj.a
        public final V getValue() {
            return this.f117076c;
        }

        private s(K key, int hash) {
            super(key, hash);
            this.f117076c = null;
        }
    }

    static final class t<K, V> extends n<K, V, s<K, V>, t<K, V>> {
        t(a8<K, V, s<K, V>, t<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
        }

        @Override // com.google.common.collect.a8.n
        @fj.a
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public s<K, V> a(@fj.a j<K, V, ?> entry) {
            return (s) entry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.a8.n
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public t<K, V> Q() {
            return this;
        }
    }

    static class u<K, V> extends c<K, V, u<K, V>> implements f0<K, V, u<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile g0<K, V, u<K, V>> f117079c;

        static final class a<K, V> implements k<K, V, u<K, V>, v<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f117080a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) f117080a;
            }

            @Override // com.google.common.collect.a8.k
            public p c() {
                return p.f117071a;
            }

            @Override // com.google.common.collect.a8.k
            public p e() {
                return p.f117072b;
            }

            @Override // com.google.common.collect.a8.k
            @fj.a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public u<K, V> d(v<K, V> segment, u<K, V> entry, @fj.a u<K, V> newNext) {
                if (n.v(entry)) {
                    return null;
                }
                u<K, V> uVarF = f(segment, entry.f117038a, entry.f117039b, newNext);
                ((u) uVarF).f117079c = ((u) entry).f117079c.a(((v) segment).f117082g, uVarF);
                return uVarF;
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public u<K, V> f(v<K, V> segment, K key, int hash, @fj.a u<K, V> next) {
                return next == null ? new u<>(key, hash, null) : new b(key, hash, next);
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public v<K, V> a(a8<K, V, u<K, V>, v<K, V>> map, int initialCapacity) {
                return new v<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(v<K, V> segment, u<K, V> entry, V value) {
                g0 g0Var = ((u) entry).f117079c;
                ((u) entry).f117079c = new h0(((v) segment).f117082g, value, entry);
                g0Var.clear();
            }
        }

        private static final class b<K, V> extends u<K, V> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final u<K, V> f117081d;

            b(K key, int hash, u<K, V> next) {
                super(key, hash, null);
                this.f117081d = next;
            }

            @Override // com.google.common.collect.a8.c, com.google.common.collect.a8.j
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public u<K, V> w() {
                return this.f117081d;
            }
        }

        /* synthetic */ u(Object obj, int i10, a aVar) {
            this(obj, i10);
        }

        @Override // com.google.common.collect.a8.j
        @fj.a
        public final V getValue() {
            return this.f117079c.get();
        }

        @Override // com.google.common.collect.a8.f0
        public final g0<K, V, u<K, V>> k() {
            return this.f117079c;
        }

        private u(K key, int hash) {
            super(key, hash);
            this.f117079c = a8.o();
        }
    }

    static final class v<K, V> extends n<K, V, u<K, V>, v<K, V>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ReferenceQueue<V> f117082g;

        v(a8<K, V, u<K, V>, v<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.f117082g = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.a8.n
        public g0<K, V, u<K, V>> A(j<K, V, ?> e10, V value) {
            return new h0(this.f117082g, value, a(e10));
        }

        @Override // com.google.common.collect.a8.n
        public void U(j<K, V, ?> e10, g0<K, V, ? extends j<K, V, ?>> valueReference) {
            u<K, V> uVarA = a(e10);
            g0 g0Var = ((u) uVarA).f117079c;
            ((u) uVarA).f117079c = valueReference;
            g0Var.clear();
        }

        @Override // com.google.common.collect.a8.n
        @fj.a
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public u<K, V> a(@fj.a j<K, V, ?> entry) {
            return (u) entry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.a8.n
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public v<K, V> Q() {
            return this;
        }

        @Override // com.google.common.collect.a8.n
        ReferenceQueue<V> s() {
            return this.f117082g;
        }

        @Override // com.google.common.collect.a8.n
        public g0<K, V, u<K, V>> t(j<K, V, ?> e10) {
            return a(e10).k();
        }

        @Override // com.google.common.collect.a8.n
        void w() {
            c(this.f117082g);
        }

        @Override // com.google.common.collect.a8.n
        void x() {
            j(this.f117082g);
        }
    }

    interface w<K, V, E extends j<K, V, E>> extends j<K, V, E> {
    }

    final class x extends a8<K, V, E, S>.i<V> {
        x() {
            super();
        }

        @Override // com.google.common.collect.a8.i, java.util.Iterator
        public V next() {
            return d().getValue();
        }
    }

    final class y extends AbstractCollection<V> {
        y() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a8.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object o10) {
            return a8.this.containsValue(o10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a8.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new x();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a8.this.size();
        }
    }

    static class z<K> extends d<K, z7.a, z<K>> implements w<K, z7.a, z<K>> {

        static final class a<K> implements k<K, z7.a, z<K>, a0<K>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?> f117085a = new a<>();

            a() {
            }

            static <K> a<K> h() {
                return (a<K>) f117085a;
            }

            @Override // com.google.common.collect.a8.k
            public p c() {
                return p.f117072b;
            }

            @Override // com.google.common.collect.a8.k
            public p e() {
                return p.f117071a;
            }

            @Override // com.google.common.collect.a8.k
            @fj.a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public z<K> d(a0<K> segment, z<K> entry, @fj.a z<K> newNext) {
                K key = entry.getKey();
                if (key == null) {
                    return null;
                }
                return f(segment, key, entry.f117041a, newNext);
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public z<K> f(a0<K> segment, K key, int hash, @fj.a z<K> next) {
                return next == null ? new z<>(((a0) segment).f117027g, key, hash, null) : new b(((a0) segment).f117027g, key, hash, next, null);
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public a0<K> a(a8<K, z7.a, z<K>, a0<K>> map, int initialCapacity) {
                return new a0<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.a8.k
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(a0<K> segment, z<K> entry, z7.a value) {
            }
        }

        private static final class b<K> extends z<K> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final z<K> f117086b;

            /* synthetic */ b(ReferenceQueue referenceQueue, Object obj, int i10, z zVar, a aVar) {
                this(referenceQueue, obj, i10, zVar);
            }

            @Override // com.google.common.collect.a8.d, com.google.common.collect.a8.j
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public z<K> w() {
                return this.f117086b;
            }

            @Override // com.google.common.collect.a8.z, com.google.common.collect.a8.j
            public /* bridge */ /* synthetic */ Object getValue() {
                return super.getValue();
            }

            private b(ReferenceQueue<K> queue, K key, int hash, z<K> next) {
                super(queue, key, hash, null);
                this.f117086b = next;
            }
        }

        /* synthetic */ z(ReferenceQueue referenceQueue, Object obj, int i10, a aVar) {
            this(referenceQueue, obj, i10);
        }

        @Override // com.google.common.collect.a8.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z7.a getValue() {
            return z7.a.VALUE;
        }

        private z(ReferenceQueue<K> queue, K key, int hash) {
            super(queue, key, hash);
        }
    }

    private a8(z7 builder, k<K, V, E, S> entryHelper) {
        this.f117021d = Math.min(builder.b(), 65536);
        this.f117022e = builder.d();
        this.f117023f = entryHelper;
        int iMin = Math.min(builder.c(), 1073741824);
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 1;
        while (i13 < this.f117021d) {
            i12++;
            i13 <<= 1;
        }
        this.f117019b = 32 - i12;
        this.f117018a = i13 - 1;
        this.f117020c = j(i13);
        int i14 = iMin / i13;
        while (i11 < (i13 * i14 < iMin ? i14 + 1 : i14)) {
            i11 <<= 1;
        }
        while (true) {
            n<K, V, E, S>[] nVarArr = this.f117020c;
            if (i10 >= nVarArr.length) {
                return;
            }
            nVarArr[i10] = c(i11);
            i10++;
        }
    }

    static <K, V> a8<K, V, ? extends j<K, V, ?>, ?> b(z7 builder) {
        p pVarE = builder.e();
        p pVar = p.f117071a;
        if (pVarE == pVar && builder.f() == pVar) {
            return new a8<>(builder, s.a.h());
        }
        if (builder.e() == pVar && builder.f() == p.f117072b) {
            return new a8<>(builder, u.a.h());
        }
        p pVarE2 = builder.e();
        p pVar2 = p.f117072b;
        if (pVarE2 == pVar2 && builder.f() == pVar) {
            return new a8<>(builder, b0.a.h());
        }
        if (builder.e() == pVar2 && builder.f() == pVar2) {
            return new a8<>(builder, d0.a.h());
        }
        throw new AssertionError();
    }

    static <K> a8<K, z7.a, ? extends j<K, z7.a, ?>, ?> d(z7 builder) {
        p pVarE = builder.e();
        p pVar = p.f117071a;
        if (pVarE == pVar && builder.f() == pVar) {
            return new a8<>(builder, q.a.h());
        }
        p pVarE2 = builder.e();
        p pVar2 = p.f117072b;
        if (pVarE2 == pVar2 && builder.f() == pVar) {
            return new a8<>(builder, z.a.h());
        }
        if (builder.f() == pVar2) {
            throw new IllegalArgumentException("Map cannot have both weak and dummy values");
        }
        throw new AssertionError();
    }

    static int m(int h10) {
        int i10 = h10 + ((h10 << 15) ^ (-12931));
        int i11 = i10 ^ (i10 >>> 10);
        int i12 = i11 + (i11 << 3);
        int i13 = i12 ^ (i12 >>> 6);
        int i14 = i13 + (i13 << 2) + (i13 << 14);
        return i14 ^ (i14 >>> 16);
    }

    static <K, V, E extends j<K, V, E>> g0<K, V, E> o() {
        return (g0<K, V, E>) f117016o;
    }

    @com.google.common.annotations.d
    private void readObject(ObjectInputStream in) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    @com.google.common.annotations.e
    E a(E e10, E e11) {
        return (E) n(e10.l()).g(e10, e11);
    }

    n<K, V, E, S> c(int initialCapacity) {
        return this.f117023f.a(this, initialCapacity);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (n<K, V, E, S> nVar : this.f117020c) {
            nVar.b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@fj.a Object key) {
        if (key == null) {
            return false;
        }
        int iG = g(key);
        return n(iG).e(key, iG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@fj.a Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        n<K, V, E, S>[] nVarArr = this.f117020c;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            int length = nVarArr.length;
            long j11 = 0;
            for (?? r10 = z10; r10 < length; r10++) {
                n<K, V, E, S> nVar = nVarArr[r10];
                int i11 = nVar.f117065b;
                AtomicReferenceArray<E> atomicReferenceArray = nVar.f117068e;
                for (?? r13 = z10; r13 < atomicReferenceArray.length(); r13++) {
                    E eW = atomicReferenceArray.get(r13);
                    while (eW != null) {
                        V vQ = nVar.q(eW);
                        boolean z11 = z10;
                        if (vQ != null && p().d(obj, vQ)) {
                            return true;
                        }
                        eW = eW.w();
                        z10 = z11;
                    }
                }
                j11 += (long) nVar.f117066c;
                z10 = z10;
            }
            boolean z12 = z10;
            if (j11 == j10) {
                return z12;
            }
            i10++;
            j10 = j11;
            z10 = z12;
        }
        return z10;
    }

    @fj.a
    E e(@fj.a Object obj) {
        if (obj == null) {
            int i10 = 1 >> 0;
            return null;
        }
        int iG = g(obj);
        return (E) n(iG).m(obj, iG);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f117026i;
        if (set != null) {
            return set;
        }
        h hVar = new h();
        this.f117026i = hVar;
        return hVar;
    }

    @fj.a
    V f(E e10) {
        if (e10.getKey() == null) {
            return null;
        }
        return (V) e10.getValue();
    }

    int g(Object key) {
        return m(this.f117022e.f(key));
    }

    @Override // java.util.AbstractMap, java.util.Map
    @fj.a
    public V get(@fj.a Object key) {
        if (key == null) {
            return null;
        }
        int iG = g(key);
        return n(iG).l(key, iG);
    }

    @com.google.common.annotations.e
    boolean h(j<K, V, ?> entry) {
        if (n(entry.l()).r(entry) == null) {
            return false;
        }
        int i10 = 3 << 1;
        return true;
    }

    @com.google.common.annotations.e
    p i() {
        return this.f117023f.c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        n<K, V, E, S>[] nVarArr = this.f117020c;
        long j10 = 0;
        for (int i10 = 0; i10 < nVarArr.length; i10++) {
            if (nVarArr[i10].f117065b != 0) {
                return false;
            }
            j10 += (long) nVarArr[i10].f117066c;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < nVarArr.length; i11++) {
            if (nVarArr[i11].f117065b != 0) {
                return false;
            }
            j10 -= (long) nVarArr[i11].f117066c;
        }
        return j10 == 0;
    }

    final n<K, V, E, S>[] j(int ssize) {
        return new n[ssize];
    }

    void k(E entry) {
        int iL = entry.l();
        n(iL).E(entry, iL);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f117024g;
        if (set != null) {
            return set;
        }
        m mVar = new m();
        this.f117024g = mVar;
        return mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void l(g0<K, V, E> g0Var) {
        j jVarB = g0Var.b();
        int iL = jVarB.l();
        n(iL).F(jVarB.getKey(), iL, g0Var);
    }

    n<K, V, E, S> n(int hash) {
        return this.f117020c[this.f117018a & (hash >>> this.f117019b)];
    }

    @com.google.common.annotations.e
    com.google.common.base.m<Object> p() {
        return this.f117023f.e().l();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @z7.a
    @fj.a
    public V put(K key, V value) {
        com.google.common.base.j0.E(key);
        com.google.common.base.j0.E(value);
        int iG = g(key);
        return n(iG).D(key, iG, value, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> m10) {
        for (Map.Entry<? extends K, ? extends V> entry : m10.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @z7.a
    @fj.a
    public V putIfAbsent(K key, V value) {
        com.google.common.base.j0.E(key);
        com.google.common.base.j0.E(value);
        int iG = g(key);
        return n(iG).D(key, iG, value, true);
    }

    @com.google.common.annotations.e
    p q() {
        return this.f117023f.e();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @z7.a
    @fj.a
    public V remove(@fj.a Object key) {
        if (key == null) {
            return null;
        }
        int iG = g(key);
        return n(iG).G(key, iG);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @z7.a
    public boolean replace(K key, @fj.a V oldValue, V newValue) {
        com.google.common.base.j0.E(key);
        com.google.common.base.j0.E(newValue);
        if (oldValue == null) {
            return false;
        }
        int iG = g(key);
        return n(iG).N(key, iG, oldValue, newValue);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j10 = 0;
        for (n<K, V, E, S> nVar : this.f117020c) {
            j10 += (long) nVar.f117065b;
        }
        return com.google.common.primitives.l.A(j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f117025h;
        if (collection != null) {
            return collection;
        }
        y yVar = new y();
        this.f117025h = yVar;
        return yVar;
    }

    Object writeReplace() {
        return new o(this.f117023f.c(), this.f117023f.e(), this.f117022e, this.f117023f.e().l(), this.f117021d, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @z7.a
    public boolean remove(@fj.a Object key, @fj.a Object value) {
        if (key != null && value != null) {
            int iG = g(key);
            return n(iG).H(key, iG, value);
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @z7.a
    @fj.a
    public V replace(K key, V value) {
        com.google.common.base.j0.E(key);
        com.google.common.base.j0.E(value);
        int iG = g(key);
        return n(iG).M(key, iG, value);
    }
}
