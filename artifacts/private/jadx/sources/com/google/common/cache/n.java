package com.google.common.cache;

import com.google.common.base.q0;
import com.google.common.base.w0;
import com.google.common.collect.b8;
import com.google.common.collect.n6;
import com.google.common.collect.z6;
import com.google.common.collect.z9;
import com.google.common.util.concurrent.a2;
import com.google.common.util.concurrent.d3;
import com.google.common.util.concurrent.f3;
import com.google.common.util.concurrent.h1;
import com.google.common.util.concurrent.m2;
import com.google.common.util.concurrent.p0;
import com.google.common.util.concurrent.t1;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b(emulated = true)
class n<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    static final int H1 = 3;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    static final int f116821g3 = 16;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    static final Logger f116822h3 = Logger.getLogger(n.class.getName());

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    static final a0<Object, Object> f116823i3 = new a();

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    static final Queue<?> f116824j3 = new b();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final int f116825p0 = 1073741824;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    static final int f116826p1 = 65536;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    static final int f116827p2 = 63;

    @a8.b
    @r9.j
    @fj.a
    Set<K> X;

    @a8.b
    @r9.j
    @fj.a
    Collection<V> Y;

    @a8.b
    @r9.j
    @fj.a
    Set<Map.Entry<K, V>> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f116828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f116829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final r<K, V>[] f116830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f116831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final com.google.common.base.m<Object> f116832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final com.google.common.base.m<Object> f116833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final t f116834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final t f116835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final long f116836i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final com.google.common.cache.c0<K, V> f116837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final long f116838k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final long f116839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final long f116840m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Queue<com.google.common.cache.a0<K, V>> f116841n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final com.google.common.cache.w<K, V> f116842o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final w0 f116843s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final f f116844t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final com.google.common.cache.a.b f116845v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @fj.a
    final com.google.common.cache.g<? super K, V> f116846w;

    class a implements a0<Object, Object> {
        a() {
        }

        @Override // com.google.common.cache.n.a0
        public int a() {
            return 0;
        }

        @Override // com.google.common.cache.n.a0
        @fj.a
        public com.google.common.cache.u<Object, Object> b() {
            return null;
        }

        @Override // com.google.common.cache.n.a0
        public void c(Object newValue) {
        }

        @Override // com.google.common.cache.n.a0
        public boolean d() {
            return false;
        }

        @Override // com.google.common.cache.n.a0
        @fj.a
        public Object e() {
            return null;
        }

        @Override // com.google.common.cache.n.a0
        public a0<Object, Object> f(ReferenceQueue<Object> queue, @fj.a Object value, com.google.common.cache.u<Object, Object> entry) {
            return this;
        }

        @Override // com.google.common.cache.n.a0
        @fj.a
        public Object get() {
            return null;
        }

        @Override // com.google.common.cache.n.a0
        public boolean isActive() {
            return false;
        }
    }

    interface a0<K, V> {
        int a();

        @fj.a
        com.google.common.cache.u<K, V> b();

        void c(@fj.a V newValue);

        boolean d();

        V e() throws ExecutionException;

        a0<K, V> f(ReferenceQueue<V> queue, @fj.a V value, com.google.common.cache.u<K, V> entry);

        @fj.a
        V get();

        boolean isActive();
    }

    class b extends AbstractQueue<Object> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return z6.G().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object o10) {
            return true;
        }

        @Override // java.util.Queue
        @fj.a
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        @fj.a
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    }

    final class b0 extends AbstractCollection<V> {
        b0() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() throws Throwable {
            n.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object o10) {
            return n.this.containsValue(o10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return n.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return n.this.size();
        }
    }

    abstract class c<T> extends AbstractSet<T> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() throws Throwable {
            n.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return n.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return n.this.size();
        }
    }

    static final class c0<K, V> extends e0<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile long f116849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @r9.m
        com.google.common.cache.u<K, V> f116850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @r9.m
        com.google.common.cache.u<K, V> f116851f;

        c0(ReferenceQueue<K> queue, K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
            super(queue, key, hash, next);
            this.f116849d = Long.MAX_VALUE;
            this.f116850e = n.C();
            this.f116851f = n.C();
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public void D(com.google.common.cache.u<K, V> next) {
            this.f116850e = next;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public void n(com.google.common.cache.u<K, V> previous) {
            this.f116851f = previous;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public void r(long time) {
            this.f116849d = time;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public com.google.common.cache.u<K, V> t() {
            return this.f116851f;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public com.google.common.cache.u<K, V> x() {
            return this.f116850e;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public long z() {
            return this.f116849d;
        }
    }

    static abstract class d<K, V> implements com.google.common.cache.u<K, V> {
        d() {
        }

        @Override // com.google.common.cache.u
        public void D(com.google.common.cache.u<K, V> next) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public void E(com.google.common.cache.u<K, V> next) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public void H(com.google.common.cache.u<K, V> previous) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public a0<K, V> k() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public int l() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public void n(com.google.common.cache.u<K, V> previous) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public com.google.common.cache.u<K, V> o() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public void p(a0<K, V> valueReference) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public long q() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public void r(long time) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public void s(long time) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public com.google.common.cache.u<K, V> t() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public com.google.common.cache.u<K, V> v() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public com.google.common.cache.u<K, V> w() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public com.google.common.cache.u<K, V> x() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public long z() {
            throw new UnsupportedOperationException();
        }
    }

    static final class d0<K, V> extends e0<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile long f116852d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @r9.m
        com.google.common.cache.u<K, V> f116853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @r9.m
        com.google.common.cache.u<K, V> f116854f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile long f116855g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @r9.m
        com.google.common.cache.u<K, V> f116856h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @r9.m
        com.google.common.cache.u<K, V> f116857i;

        d0(ReferenceQueue<K> queue, K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
            super(queue, key, hash, next);
            this.f116852d = Long.MAX_VALUE;
            this.f116853e = n.C();
            this.f116854f = n.C();
            this.f116855g = Long.MAX_VALUE;
            this.f116856h = n.C();
            this.f116857i = n.C();
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public void D(com.google.common.cache.u<K, V> next) {
            this.f116853e = next;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public void E(com.google.common.cache.u<K, V> next) {
            this.f116856h = next;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public void H(com.google.common.cache.u<K, V> previous) {
            this.f116857i = previous;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public void n(com.google.common.cache.u<K, V> previous) {
            this.f116854f = previous;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public com.google.common.cache.u<K, V> o() {
            return this.f116857i;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public long q() {
            return this.f116855g;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public void r(long time) {
            this.f116852d = time;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public void s(long time) {
            this.f116855g = time;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public com.google.common.cache.u<K, V> t() {
            return this.f116854f;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public com.google.common.cache.u<K, V> v() {
            return this.f116856h;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public com.google.common.cache.u<K, V> x() {
            return this.f116853e;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public long z() {
            return this.f116852d;
        }
    }

    static final class e<K, V> extends AbstractQueue<com.google.common.cache.u<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.google.common.cache.u<K, V> f116858a = new a();

        class a extends d<K, V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @r9.m
            com.google.common.cache.u<K, V> f116859a = this;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @r9.m
            com.google.common.cache.u<K, V> f116860b = this;

            a() {
            }

            @Override // com.google.common.cache.n.d, com.google.common.cache.u
            public void D(com.google.common.cache.u<K, V> next) {
                this.f116859a = next;
            }

            @Override // com.google.common.cache.n.d, com.google.common.cache.u
            public void n(com.google.common.cache.u<K, V> previous) {
                this.f116860b = previous;
            }

            @Override // com.google.common.cache.n.d, com.google.common.cache.u
            public void r(long time) {
            }

            @Override // com.google.common.cache.n.d, com.google.common.cache.u
            public com.google.common.cache.u<K, V> t() {
                return this.f116860b;
            }

            @Override // com.google.common.cache.n.d, com.google.common.cache.u
            public com.google.common.cache.u<K, V> x() {
                return this.f116859a;
            }

            @Override // com.google.common.cache.n.d, com.google.common.cache.u
            public long z() {
                return Long.MAX_VALUE;
            }
        }

        class b extends com.google.common.collect.l<com.google.common.cache.u<K, V>> {
            b(com.google.common.cache.u firstOrNull) {
                super(firstOrNull);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.l
            @fj.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public com.google.common.cache.u<K, V> b(com.google.common.cache.u<K, V> previous) {
                com.google.common.cache.u<K, V> uVarX = previous.x();
                if (uVarX == e.this.f116858a) {
                    return null;
                }
                return uVarX;
            }
        }

        e() {
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean offer(com.google.common.cache.u<K, V> entry) {
            n.b(entry.t(), entry.x());
            n.b(this.f116858a.t(), entry);
            n.b(entry, this.f116858a);
            return true;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.cache.u<K, V> uVarX = this.f116858a.x();
            while (true) {
                com.google.common.cache.u<K, V> uVar = this.f116858a;
                if (uVarX == uVar) {
                    uVar.D(uVar);
                    com.google.common.cache.u<K, V> uVar2 = this.f116858a;
                    uVar2.n(uVar2);
                    return;
                } else {
                    com.google.common.cache.u<K, V> uVarX2 = uVarX.x();
                    n.D(uVarX);
                    uVarX = uVarX2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object o10) {
            return ((com.google.common.cache.u) o10).x() != q.INSTANCE;
        }

        @Override // java.util.Queue
        @fj.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.u<K, V> peek() {
            com.google.common.cache.u<K, V> uVarX = this.f116858a.x();
            if (uVarX == this.f116858a) {
                return null;
            }
            return uVarX;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f116858a.x() == this.f116858a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<com.google.common.cache.u<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.Queue
        @fj.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.u<K, V> poll() {
            com.google.common.cache.u<K, V> uVarX = this.f116858a.x();
            if (uVarX == this.f116858a) {
                return null;
            }
            remove(uVarX);
            return uVarX;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        @z7.a
        public boolean remove(Object o10) {
            com.google.common.cache.u uVar = (com.google.common.cache.u) o10;
            com.google.common.cache.u<K, V> uVarT = uVar.t();
            com.google.common.cache.u<K, V> uVarX = uVar.x();
            n.b(uVarT, uVarX);
            n.D(uVar);
            return uVarX != q.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i10 = 0;
            for (com.google.common.cache.u<K, V> uVarX = this.f116858a.x(); uVarX != this.f116858a; uVarX = uVarX.x()) {
                i10++;
            }
            return i10;
        }
    }

    static class e0<K, V> extends WeakReference<K> implements com.google.common.cache.u<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f116863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        final com.google.common.cache.u<K, V> f116864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile a0<K, V> f116865c;

        e0(ReferenceQueue<K> queue, K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
            super(key, queue);
            this.f116865c = n.Q();
            this.f116863a = hash;
            this.f116864b = next;
        }

        public void D(com.google.common.cache.u<K, V> next) {
            throw new UnsupportedOperationException();
        }

        public void E(com.google.common.cache.u<K, V> next) {
            throw new UnsupportedOperationException();
        }

        public void H(com.google.common.cache.u<K, V> previous) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public K getKey() {
            return get();
        }

        @Override // com.google.common.cache.u
        public a0<K, V> k() {
            return this.f116865c;
        }

        @Override // com.google.common.cache.u
        public int l() {
            return this.f116863a;
        }

        public void n(com.google.common.cache.u<K, V> previous) {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.u<K, V> o() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public void p(a0<K, V> valueReference) {
            this.f116865c = valueReference;
        }

        public long q() {
            throw new UnsupportedOperationException();
        }

        public void r(long time) {
            throw new UnsupportedOperationException();
        }

        public void s(long time) {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.u<K, V> t() {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.u<K, V> v() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.u
        public com.google.common.cache.u<K, V> w() {
            return this.f116864b;
        }

        public com.google.common.cache.u<K, V> x() {
            throw new UnsupportedOperationException();
        }

        public long z() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f116866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f116867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f116868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final f f116869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final f f116870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final f f116871f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final f f116872g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final f f116873h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f116874i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f116875j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f116876k = 4;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final f[] f116877l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ f[] f116878m;

        final enum a extends f {
            a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.n.f
            <K, V> com.google.common.cache.u<K, V> q(r<K, V> segment, K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
                return new w(key, hash, next);
            }
        }

        final enum b extends f {
            b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.n.f
            <K, V> com.google.common.cache.u<K, V> n(r<K, V> segment, com.google.common.cache.u<K, V> original, com.google.common.cache.u<K, V> newNext, K key) {
                com.google.common.cache.u<K, V> uVarN = super.n(segment, original, newNext, key);
                l(original, uVarN);
                return uVarN;
            }

            @Override // com.google.common.cache.n.f
            <K, V> com.google.common.cache.u<K, V> q(r<K, V> segment, K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
                return new u(key, hash, next);
            }
        }

        final enum c extends f {
            c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.n.f
            <K, V> com.google.common.cache.u<K, V> n(r<K, V> segment, com.google.common.cache.u<K, V> original, com.google.common.cache.u<K, V> newNext, K key) {
                com.google.common.cache.u<K, V> uVarN = super.n(segment, original, newNext, key);
                o(original, uVarN);
                return uVarN;
            }

            @Override // com.google.common.cache.n.f
            <K, V> com.google.common.cache.u<K, V> q(r<K, V> segment, K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
                return new y(key, hash, next);
            }
        }

        final enum d extends f {
            d(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.n.f
            <K, V> com.google.common.cache.u<K, V> n(r<K, V> segment, com.google.common.cache.u<K, V> original, com.google.common.cache.u<K, V> newNext, K key) {
                com.google.common.cache.u<K, V> uVarN = super.n(segment, original, newNext, key);
                l(original, uVarN);
                o(original, uVarN);
                return uVarN;
            }

            @Override // com.google.common.cache.n.f
            <K, V> com.google.common.cache.u<K, V> q(r<K, V> segment, K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
                return new v(key, hash, next);
            }
        }

        final enum e extends f {
            e(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.n.f
            <K, V> com.google.common.cache.u<K, V> q(r<K, V> segment, K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
                return new e0(segment.f116939h, key, hash, next);
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.n$f$f, reason: collision with other inner class name */
        final enum C1051f extends f {
            C1051f(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.n.f
            <K, V> com.google.common.cache.u<K, V> n(r<K, V> segment, com.google.common.cache.u<K, V> original, com.google.common.cache.u<K, V> newNext, K key) {
                com.google.common.cache.u<K, V> uVarN = super.n(segment, original, newNext, key);
                l(original, uVarN);
                return uVarN;
            }

            @Override // com.google.common.cache.n.f
            <K, V> com.google.common.cache.u<K, V> q(r<K, V> segment, K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
                return new c0(segment.f116939h, key, hash, next);
            }
        }

        final enum g extends f {
            g(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.n.f
            <K, V> com.google.common.cache.u<K, V> n(r<K, V> segment, com.google.common.cache.u<K, V> original, com.google.common.cache.u<K, V> newNext, K key) {
                com.google.common.cache.u<K, V> uVarN = super.n(segment, original, newNext, key);
                o(original, uVarN);
                return uVarN;
            }

            @Override // com.google.common.cache.n.f
            <K, V> com.google.common.cache.u<K, V> q(r<K, V> segment, K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
                return new g0(segment.f116939h, key, hash, next);
            }
        }

        final enum h extends f {
            h(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.n.f
            <K, V> com.google.common.cache.u<K, V> n(r<K, V> segment, com.google.common.cache.u<K, V> original, com.google.common.cache.u<K, V> newNext, K key) {
                com.google.common.cache.u<K, V> uVarN = super.n(segment, original, newNext, key);
                l(original, uVarN);
                o(original, uVarN);
                return uVarN;
            }

            @Override // com.google.common.cache.n.f
            <K, V> com.google.common.cache.u<K, V> q(r<K, V> segment, K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
                return new d0(segment.f116939h, key, hash, next);
            }
        }

        static {
            a aVar = new a("STRONG", 0);
            f116866a = aVar;
            b bVar = new b("STRONG_ACCESS", 1);
            f116867b = bVar;
            c cVar = new c("STRONG_WRITE", 2);
            f116868c = cVar;
            d dVar = new d("STRONG_ACCESS_WRITE", 3);
            f116869d = dVar;
            e eVar = new e("WEAK", 4);
            f116870e = eVar;
            C1051f c1051f = new C1051f("WEAK_ACCESS", 5);
            f116871f = c1051f;
            g gVar = new g("WEAK_WRITE", 6);
            f116872g = gVar;
            h hVar = new h("WEAK_ACCESS_WRITE", 7);
            f116873h = hVar;
            f116878m = k();
            f116877l = new f[]{aVar, bVar, cVar, dVar, eVar, c1051f, gVar, hVar};
        }

        private f(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        private static /* synthetic */ f[] k() {
            return new f[]{f116866a, f116867b, f116868c, f116869d, f116870e, f116871f, f116872g, f116873h};
        }

        /* JADX WARN: Multi-variable type inference failed */
        static f p(t tVar, boolean z10, boolean z11) {
            return f116877l[((tVar == t.f116949c ? (char) 4 : (char) 0) | (z10 ? 1 : 0) ? 1 : 0) | (z11 ? 2 : 0)];
        }

        public static f valueOf(String name) {
            return (f) Enum.valueOf(f.class, name);
        }

        public static f[] values() {
            return (f[]) f116878m.clone();
        }

        <K, V> void l(com.google.common.cache.u<K, V> original, com.google.common.cache.u<K, V> newEntry) {
            newEntry.r(original.z());
            n.b(original.t(), newEntry);
            n.b(newEntry, original.x());
            n.D(original);
        }

        <K, V> com.google.common.cache.u<K, V> n(r<K, V> segment, com.google.common.cache.u<K, V> original, com.google.common.cache.u<K, V> newNext, K key) {
            return q(segment, key, original.l(), newNext);
        }

        <K, V> void o(com.google.common.cache.u<K, V> original, com.google.common.cache.u<K, V> newEntry) {
            newEntry.s(original.q());
            n.c(original.o(), newEntry);
            n.c(newEntry, original.v());
            n.E(original);
        }

        abstract <K, V> com.google.common.cache.u<K, V> q(r<K, V> segment, K key, int hash, @fj.a com.google.common.cache.u<K, V> next);

        /* synthetic */ f(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    static class f0<K, V> extends WeakReference<V> implements a0<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.google.common.cache.u<K, V> f116879a;

        f0(ReferenceQueue<V> queue, V referent, com.google.common.cache.u<K, V> entry) {
            super(referent, queue);
            this.f116879a = entry;
        }

        @Override // com.google.common.cache.n.a0
        public int a() {
            return 1;
        }

        @Override // com.google.common.cache.n.a0
        public com.google.common.cache.u<K, V> b() {
            return this.f116879a;
        }

        @Override // com.google.common.cache.n.a0
        public void c(V newValue) {
        }

        @Override // com.google.common.cache.n.a0
        public boolean d() {
            return false;
        }

        @Override // com.google.common.cache.n.a0
        public V e() {
            return get();
        }

        @Override // com.google.common.cache.n.a0
        public a0<K, V> f(ReferenceQueue<V> queue, V value, com.google.common.cache.u<K, V> entry) {
            return new f0(queue, value, entry);
        }

        @Override // com.google.common.cache.n.a0
        public boolean isActive() {
            return true;
        }
    }

    final class g extends n<K, V>.i<Map.Entry<K, V>> {
        g() {
            super();
        }

        @Override // com.google.common.cache.n.i, java.util.Iterator
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return d();
        }
    }

    static final class g0<K, V> extends e0<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile long f116881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @r9.m
        com.google.common.cache.u<K, V> f116882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @r9.m
        com.google.common.cache.u<K, V> f116883f;

        g0(ReferenceQueue<K> queue, K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
            super(queue, key, hash, next);
            this.f116881d = Long.MAX_VALUE;
            this.f116882e = n.C();
            this.f116883f = n.C();
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public void E(com.google.common.cache.u<K, V> next) {
            this.f116882e = next;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public void H(com.google.common.cache.u<K, V> previous) {
            this.f116883f = previous;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public com.google.common.cache.u<K, V> o() {
            return this.f116883f;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public long q() {
            return this.f116881d;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public void s(long time) {
            this.f116881d = time;
        }

        @Override // com.google.common.cache.n.e0, com.google.common.cache.u
        public com.google.common.cache.u<K, V> v() {
            return this.f116882e;
        }
    }

    final class h extends n<K, V>.c<Map.Entry<K, V>> {
        h() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o10) {
            Map.Entry entry;
            Object key;
            if ((o10 instanceof Map.Entry) && (key = (entry = (Map.Entry) o10).getKey()) != null) {
                Object obj = n.this.get(key);
                return obj != null && n.this.f116833f.d(entry.getValue(), obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o10) {
            Map.Entry entry;
            Object key;
            return (o10 instanceof Map.Entry) && (key = (entry = (Map.Entry) o10).getKey()) != null && n.this.remove(key, entry.getValue());
        }
    }

    static final class h0<K, V> extends s<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f116885b;

        h0(ReferenceQueue<V> queue, V referent, com.google.common.cache.u<K, V> entry, int weight) {
            super(queue, referent, entry);
            this.f116885b = weight;
        }

        @Override // com.google.common.cache.n.s, com.google.common.cache.n.a0
        public int a() {
            return this.f116885b;
        }

        @Override // com.google.common.cache.n.s, com.google.common.cache.n.a0
        public a0<K, V> f(ReferenceQueue<V> queue, V value, com.google.common.cache.u<K, V> entry) {
            return new h0(queue, value, entry, this.f116885b);
        }
    }

    abstract class i<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f116886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f116887b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        r<K, V> f116888c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.a
        AtomicReferenceArray<com.google.common.cache.u<K, V>> f116889d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @fj.a
        com.google.common.cache.u<K, V> f116890e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @fj.a
        n<K, V>.l0 f116891f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @fj.a
        n<K, V>.l0 f116892g;

        i() {
            this.f116886a = n.this.f116830c.length - 1;
            b();
        }

        final void b() {
            this.f116891f = null;
            if (!e() && !f()) {
                while (true) {
                    int i10 = this.f116886a;
                    if (i10 < 0) {
                        break;
                    }
                    r<K, V>[] rVarArr = n.this.f116830c;
                    this.f116886a = i10 - 1;
                    r<K, V> rVar = rVarArr[i10];
                    this.f116888c = rVar;
                    if (rVar.f116933b != 0) {
                        AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116888c.f116937f;
                        this.f116889d = atomicReferenceArray;
                        this.f116887b = atomicReferenceArray.length() - 1;
                        if (f()) {
                            break;
                        }
                    }
                }
            }
        }

        boolean c(com.google.common.cache.u<K, V> entry) {
            try {
                long jA = n.this.f116843s.a();
                K key = entry.getKey();
                Object objQ = n.this.q(entry, jA);
                if (objQ == null) {
                    this.f116888c.G();
                    return false;
                }
                this.f116891f = new l0(key, objQ);
                this.f116888c.G();
                return true;
            } catch (Throwable th2) {
                this.f116888c.G();
                throw th2;
            }
        }

        n<K, V>.l0 d() {
            n<K, V>.l0 l0Var = this.f116891f;
            if (l0Var == null) {
                throw new NoSuchElementException();
            }
            this.f116892g = l0Var;
            b();
            return this.f116892g;
        }

        boolean e() {
            com.google.common.cache.u<K, V> uVar = this.f116890e;
            if (uVar != null) {
                while (true) {
                    this.f116890e = uVar.w();
                    com.google.common.cache.u<K, V> uVar2 = this.f116890e;
                    if (uVar2 == null) {
                        break;
                    }
                    if (c(uVar2)) {
                        return true;
                    }
                    uVar = this.f116890e;
                }
            }
            return false;
        }

        boolean f() {
            while (true) {
                int i10 = this.f116887b;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116889d;
                this.f116887b = i10 - 1;
                com.google.common.cache.u<K, V> uVar = atomicReferenceArray.get(i10);
                this.f116890e = uVar;
                if (uVar != null && (c(uVar) || e())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f116891f != null;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.j0.g0(this.f116892g != null);
            n.this.remove(this.f116892g.getKey());
            this.f116892g = null;
        }
    }

    static final class i0<K, V> extends x<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f116894b;

        i0(V referent, int weight) {
            super(referent);
            this.f116894b = weight;
        }

        @Override // com.google.common.cache.n.x, com.google.common.cache.n.a0
        public int a() {
            return this.f116894b;
        }
    }

    final class j extends n<K, V>.i<K> {
        j() {
            super();
        }

        @Override // com.google.common.cache.n.i, java.util.Iterator
        public K next() {
            return d().getKey();
        }
    }

    static final class j0<K, V> extends f0<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f116896b;

        j0(ReferenceQueue<V> queue, V referent, com.google.common.cache.u<K, V> entry, int weight) {
            super(queue, referent, entry);
            this.f116896b = weight;
        }

        @Override // com.google.common.cache.n.f0, com.google.common.cache.n.a0
        public int a() {
            return this.f116896b;
        }

        @Override // com.google.common.cache.n.f0, com.google.common.cache.n.a0
        public a0<K, V> f(ReferenceQueue<V> queue, V value, com.google.common.cache.u<K, V> entry) {
            return new j0(queue, value, entry, this.f116896b);
        }
    }

    final class k extends n<K, V>.c<K> {
        k() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o10) {
            return n.this.containsKey(o10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o10) {
            return n.this.remove(o10) != null;
        }
    }

    static final class k0<K, V> extends AbstractQueue<com.google.common.cache.u<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.google.common.cache.u<K, V> f116898a = new a();

        class a extends d<K, V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @r9.m
            com.google.common.cache.u<K, V> f116899a = this;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @r9.m
            com.google.common.cache.u<K, V> f116900b = this;

            a() {
            }

            @Override // com.google.common.cache.n.d, com.google.common.cache.u
            public void E(com.google.common.cache.u<K, V> next) {
                this.f116899a = next;
            }

            @Override // com.google.common.cache.n.d, com.google.common.cache.u
            public void H(com.google.common.cache.u<K, V> previous) {
                this.f116900b = previous;
            }

            @Override // com.google.common.cache.n.d, com.google.common.cache.u
            public com.google.common.cache.u<K, V> o() {
                return this.f116900b;
            }

            @Override // com.google.common.cache.n.d, com.google.common.cache.u
            public long q() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.n.d, com.google.common.cache.u
            public void s(long time) {
            }

            @Override // com.google.common.cache.n.d, com.google.common.cache.u
            public com.google.common.cache.u<K, V> v() {
                return this.f116899a;
            }
        }

        class b extends com.google.common.collect.l<com.google.common.cache.u<K, V>> {
            b(com.google.common.cache.u firstOrNull) {
                super(firstOrNull);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.l
            @fj.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public com.google.common.cache.u<K, V> b(com.google.common.cache.u<K, V> previous) {
                com.google.common.cache.u<K, V> uVarV = previous.v();
                if (uVarV == k0.this.f116898a) {
                    return null;
                }
                return uVarV;
            }
        }

        k0() {
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean offer(com.google.common.cache.u<K, V> entry) {
            n.c(entry.o(), entry.v());
            n.c(this.f116898a.o(), entry);
            n.c(entry, this.f116898a);
            return true;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.cache.u<K, V> uVarV = this.f116898a.v();
            while (true) {
                com.google.common.cache.u<K, V> uVar = this.f116898a;
                if (uVarV == uVar) {
                    uVar.E(uVar);
                    com.google.common.cache.u<K, V> uVar2 = this.f116898a;
                    uVar2.H(uVar2);
                    return;
                } else {
                    com.google.common.cache.u<K, V> uVarV2 = uVarV.v();
                    n.E(uVarV);
                    uVarV = uVarV2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object o10) {
            return ((com.google.common.cache.u) o10).v() != q.INSTANCE;
        }

        @Override // java.util.Queue
        @fj.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.u<K, V> peek() {
            com.google.common.cache.u<K, V> uVarV = this.f116898a.v();
            if (uVarV == this.f116898a) {
                return null;
            }
            return uVarV;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f116898a.v() == this.f116898a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<com.google.common.cache.u<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.Queue
        @fj.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.u<K, V> poll() {
            com.google.common.cache.u<K, V> uVarV = this.f116898a.v();
            if (uVarV == this.f116898a) {
                return null;
            }
            remove(uVarV);
            return uVarV;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        @z7.a
        public boolean remove(Object o10) {
            com.google.common.cache.u uVar = (com.google.common.cache.u) o10;
            com.google.common.cache.u<K, V> uVarO = uVar.o();
            com.google.common.cache.u<K, V> uVarV = uVar.v();
            n.c(uVarO, uVarV);
            n.E(uVar);
            if (uVarV == q.INSTANCE) {
                return false;
            }
            int i10 = 7 << 1;
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i10 = 0;
            for (com.google.common.cache.u<K, V> uVarV = this.f116898a.v(); uVarV != this.f116898a; uVarV = uVarV.v()) {
                i10++;
            }
            return i10;
        }
    }

    static final class l<K, V> extends p<K, V> implements com.google.common.cache.m<K, V>, Serializable {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final long f116903s = 1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @fj.a
        transient com.google.common.cache.m<K, V> f116904o;

        l(n<K, V> cache) {
            super(cache);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f116904o = (com.google.common.cache.m<K, V>) N0().b(this.f116928l);
        }

        private Object readResolve() {
            return this.f116904o;
        }

        @Override // com.google.common.cache.m
        public void G0(K key) {
            this.f116904o.G0(key);
        }

        @Override // com.google.common.cache.m, com.google.common.base.t
        public V apply(K key) {
            return this.f116904o.apply(key);
        }

        @Override // com.google.common.cache.m
        public V get(K key) throws ExecutionException {
            return this.f116904o.get(key);
        }

        @Override // com.google.common.cache.m
        public V v0(K key) {
            return this.f116904o.v0(key);
        }

        @Override // com.google.common.cache.m
        public n6<K, V> z0(Iterable<? extends K> keys) throws ExecutionException {
            return this.f116904o.z0(keys);
        }
    }

    final class l0 implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f116905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        V f116906b;

        l0(K key, V value) {
            this.f116905a = key;
            this.f116906b = value;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@fj.a Object object) {
            if (object instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) object;
                if (this.f116905a.equals(entry.getKey()) && this.f116906b.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f116905a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f116906b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f116906b.hashCode() ^ this.f116905a.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = (V) n.this.put(this.f116905a, v10);
            this.f116906b = v10;
            return v11;
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    static class m<K, V> implements a0<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile a0<K, V> f116908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final m2<V> f116909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final q0 f116910c;

        public m() {
            this(n.Q());
        }

        public static /* synthetic */ Object g(m mVar, Object obj) {
            mVar.l(obj);
            return obj;
        }

        private t1<V> i(Throwable t10) {
            return h1.n(t10);
        }

        @Override // com.google.common.cache.n.a0
        public int a() {
            return this.f116908a.a();
        }

        @Override // com.google.common.cache.n.a0
        public com.google.common.cache.u<K, V> b() {
            return null;
        }

        @Override // com.google.common.cache.n.a0
        public void c(@fj.a V newValue) {
            if (newValue != null) {
                l(newValue);
            } else {
                this.f116908a = n.Q();
            }
        }

        @Override // com.google.common.cache.n.a0
        public boolean d() {
            return true;
        }

        @Override // com.google.common.cache.n.a0
        public V e() throws ExecutionException {
            return (V) f3.f(this.f116909b);
        }

        @Override // com.google.common.cache.n.a0
        public a0<K, V> f(ReferenceQueue<V> queue, @fj.a V value, com.google.common.cache.u<K, V> entry) {
            return this;
        }

        @Override // com.google.common.cache.n.a0
        public V get() {
            return this.f116908a.get();
        }

        public long h() {
            return this.f116910c.g(TimeUnit.NANOSECONDS);
        }

        @Override // com.google.common.cache.n.a0
        public boolean isActive() {
            return this.f116908a.isActive();
        }

        public a0<K, V> j() {
            return this.f116908a;
        }

        public t1<V> k(K key, com.google.common.cache.g<? super K, V> loader) {
            try {
                this.f116910c.k();
                V v10 = this.f116908a.get();
                if (v10 == null) {
                    V vD = loader.d(key);
                    return l(vD) ? this.f116909b : h1.o(vD);
                }
                t1<V> t1VarF = loader.f(key, v10);
                return t1VarF == null ? h1.o(null) : h1.z(t1VarF, new com.google.common.base.t() { // from class: com.google.common.cache.o
                    @Override // com.google.common.base.t
                    public final Object apply(Object obj) {
                        return n.m.g(this.f116969a, obj);
                    }
                }, a2.c());
            } catch (Throwable th2) {
                t1<V> t1VarI = m(th2) ? this.f116909b : i(th2);
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return t1VarI;
            }
        }

        @z7.a
        public boolean l(@fj.a V newValue) {
            return this.f116909b.B(newValue);
        }

        @z7.a
        public boolean m(Throwable t10) {
            return this.f116909b.C(t10);
        }

        public m(a0<K, V> oldValue) {
            this.f116909b = m2.F();
            this.f116910c = q0.e();
            this.f116908a = oldValue;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.n$n, reason: collision with other inner class name */
    static class C1052n<K, V> extends o<K, V> implements com.google.common.cache.m<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f116911c = 1;

        C1052n(com.google.common.cache.d<? super K, ? super V> builder, com.google.common.cache.g<? super K, V> loader) {
            super(new n(builder, (com.google.common.cache.g) com.google.common.base.j0.E(loader)), null);
        }

        private void readObject(ObjectInputStream in) throws InvalidObjectException {
            throw new InvalidObjectException("Use LoadingSerializationProxy");
        }

        @Override // com.google.common.cache.m
        public void G0(K key) {
            this.f116913a.L(key);
        }

        @Override // com.google.common.cache.m, com.google.common.base.t
        public final V apply(K key) {
            return v0(key);
        }

        @Override // com.google.common.cache.m
        public V get(K key) throws ExecutionException {
            return this.f116913a.s(key);
        }

        @Override // com.google.common.cache.m
        @z7.a
        public V v0(K key) {
            try {
                return get(key);
            } catch (ExecutionException e10) {
                throw new d3(e10.getCause());
            }
        }

        @Override // com.google.common.cache.n.o
        Object writeReplace() {
            return new l(this.f116913a);
        }

        @Override // com.google.common.cache.m
        public n6<K, V> z0(Iterable<? extends K> keys) throws ExecutionException {
            return this.f116913a.m(keys);
        }
    }

    static class o<K, V> implements com.google.common.cache.c<K, V>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f116912b = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final n<K, V> f116913a;

        class a extends com.google.common.cache.g<Object, V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Callable f116914a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f116915b;

            a(final o this$0, final Callable val$valueLoader) {
                this.f116914a = val$valueLoader;
                this.f116915b = this$0;
            }

            @Override // com.google.common.cache.g
            public V d(Object obj) throws Exception {
                return (V) this.f116914a.call();
            }
        }

        /* synthetic */ o(n nVar, a aVar) {
            this(nVar);
        }

        private void readObject(ObjectInputStream in) throws InvalidObjectException {
            throw new InvalidObjectException("Use ManualSerializationProxy");
        }

        @Override // com.google.common.cache.c
        public void D(Object key) {
            com.google.common.base.j0.E(key);
            this.f116913a.remove(key);
        }

        @Override // com.google.common.cache.c
        public void L() throws Throwable {
            this.f116913a.clear();
        }

        @Override // com.google.common.cache.c
        public V O(K key, final Callable<? extends V> valueLoader) throws ExecutionException {
            com.google.common.base.j0.E(valueLoader);
            return this.f116913a.l(key, new a(this, valueLoader));
        }

        @Override // com.google.common.cache.c
        @fj.a
        public V h0(Object key) {
            return this.f116913a.p(key);
        }

        @Override // com.google.common.cache.c
        public void i0(Iterable<?> keys) {
            this.f116913a.u(keys);
        }

        @Override // com.google.common.cache.c
        public ConcurrentMap<K, V> l() {
            return this.f116913a;
        }

        @Override // com.google.common.cache.c
        public void p0() {
            this.f116913a.a();
        }

        @Override // com.google.common.cache.c
        public void put(K key, V value) {
            this.f116913a.put(key, value);
        }

        @Override // com.google.common.cache.c
        public void putAll(Map<? extends K, ? extends V> m10) {
            this.f116913a.putAll(m10);
        }

        @Override // com.google.common.cache.c
        public n6<K, V> s0(Iterable<?> keys) {
            return this.f116913a.n(keys);
        }

        @Override // com.google.common.cache.c
        public long size() {
            return this.f116913a.y();
        }

        @Override // com.google.common.cache.c
        public com.google.common.cache.h t0() {
            com.google.common.cache.a.C1048a c1048a = new com.google.common.cache.a.C1048a();
            c1048a.g(this.f116913a.f116845v);
            for (r<K, V> rVar : this.f116913a.f116830c) {
                c1048a.g(rVar.f116945n);
            }
            return c1048a.f();
        }

        Object writeReplace() {
            return new p(this.f116913a);
        }

        o(com.google.common.cache.d<? super K, ? super V> builder) {
            this(new n(builder, null));
        }

        private o(n<K, V> localCache) {
            this.f116913a = localCache;
        }
    }

    static class p<K, V> extends com.google.common.cache.j<K, V> implements Serializable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final long f116916n = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final t f116917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final t f116918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final com.google.common.base.m<Object> f116919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.google.common.base.m<Object> f116920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f116921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final long f116922f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final long f116923g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final com.google.common.cache.c0<K, V> f116924h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final int f116925i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final com.google.common.cache.w<? super K, ? super V> f116926j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @fj.a
        final w0 f116927k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final com.google.common.cache.g<? super K, V> f116928l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @fj.a
        transient com.google.common.cache.c<K, V> f116929m;

        p(n<K, V> cache) {
            this(cache.f116834g, cache.f116835h, cache.f116832e, cache.f116833f, cache.f116839l, cache.f116838k, cache.f116836i, cache.f116837j, cache.f116831d, cache.f116842o, cache.f116843s, cache.f116846w);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f116929m = (com.google.common.cache.c<K, V>) N0().a();
        }

        private Object readResolve() {
            return this.f116929m;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.j, com.google.common.collect.m5
        /* JADX INFO: renamed from: L0 */
        public com.google.common.cache.c<K, V> i1() {
            return this.f116929m;
        }

        com.google.common.cache.d<K, V> N0() {
            com.google.common.cache.d<K, V> dVar = (com.google.common.cache.d<K, V>) com.google.common.cache.d.F().K(this.f116917a).L(this.f116918b).B(this.f116919c).P(this.f116920d).e(this.f116925i).J(this.f116926j);
            dVar.f116763a = false;
            long j10 = this.f116921e;
            if (j10 > 0) {
                dVar.h(j10, TimeUnit.NANOSECONDS);
            }
            long j11 = this.f116922f;
            if (j11 > 0) {
                dVar.f(j11, TimeUnit.NANOSECONDS);
            }
            com.google.common.cache.c0 c0Var = this.f116924h;
            if (c0Var != com.google.common.cache.d.f.INSTANCE) {
                dVar.S(c0Var);
                long j12 = this.f116923g;
                if (j12 != -1) {
                    dVar.E(j12);
                }
            } else {
                long j13 = this.f116923g;
                if (j13 != -1) {
                    dVar.D(j13);
                }
            }
            w0 w0Var = this.f116927k;
            if (w0Var != null) {
                dVar.N(w0Var);
            }
            return dVar;
        }

        private p(t keyStrength, t valueStrength, com.google.common.base.m<Object> keyEquivalence, com.google.common.base.m<Object> valueEquivalence, long expireAfterWriteNanos, long expireAfterAccessNanos, long maxWeight, com.google.common.cache.c0<K, V> weigher, int concurrencyLevel, com.google.common.cache.w<? super K, ? super V> removalListener, w0 ticker, com.google.common.cache.g<? super K, V> loader) {
            this.f116917a = keyStrength;
            this.f116918b = valueStrength;
            this.f116919c = keyEquivalence;
            this.f116920d = valueEquivalence;
            this.f116921e = expireAfterWriteNanos;
            this.f116922f = expireAfterAccessNanos;
            this.f116923g = maxWeight;
            this.f116924h = weigher;
            this.f116925i = concurrencyLevel;
            this.f116926j = removalListener;
            this.f116927k = (ticker == w0.b() || ticker == com.google.common.cache.d.f116761x) ? null : ticker;
            this.f116928l = loader;
        }
    }

    private enum q implements com.google.common.cache.u<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.u
        public void D(com.google.common.cache.u<Object, Object> next) {
        }

        @Override // com.google.common.cache.u
        public void E(com.google.common.cache.u<Object, Object> next) {
        }

        @Override // com.google.common.cache.u
        public void H(com.google.common.cache.u<Object, Object> previous) {
        }

        @Override // com.google.common.cache.u
        @fj.a
        public Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.u
        @fj.a
        public a0<Object, Object> k() {
            return null;
        }

        @Override // com.google.common.cache.u
        public int l() {
            return 0;
        }

        @Override // com.google.common.cache.u
        public void n(com.google.common.cache.u<Object, Object> previous) {
        }

        @Override // com.google.common.cache.u
        public com.google.common.cache.u<Object, Object> o() {
            return this;
        }

        @Override // com.google.common.cache.u
        public void p(a0<Object, Object> valueReference) {
        }

        @Override // com.google.common.cache.u
        public long q() {
            return 0L;
        }

        @Override // com.google.common.cache.u
        public void r(long time) {
        }

        @Override // com.google.common.cache.u
        public void s(long time) {
        }

        @Override // com.google.common.cache.u
        public com.google.common.cache.u<Object, Object> t() {
            return this;
        }

        @Override // com.google.common.cache.u
        public com.google.common.cache.u<Object, Object> v() {
            return this;
        }

        @Override // com.google.common.cache.u
        @fj.a
        public com.google.common.cache.u<Object, Object> w() {
            return null;
        }

        @Override // com.google.common.cache.u
        public com.google.common.cache.u<Object, Object> x() {
            return this;
        }

        @Override // com.google.common.cache.u
        public long z() {
            return 0L;
        }
    }

    static class r<K, V> extends ReentrantLock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @r9.m
        final n<K, V> f116932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile int f116933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @a8.a("this")
        long f116934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f116935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @fj.a
        volatile AtomicReferenceArray<com.google.common.cache.u<K, V>> f116937f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final long f116938g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @fj.a
        final ReferenceQueue<K> f116939h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @fj.a
        final ReferenceQueue<V> f116940i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final Queue<com.google.common.cache.u<K, V>> f116941j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicInteger f116942k = new AtomicInteger();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @a8.a("this")
        final Queue<com.google.common.cache.u<K, V>> f116943l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @a8.a("this")
        final Queue<com.google.common.cache.u<K, V>> f116944m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final com.google.common.cache.a.b f116945n;

        r(n<K, V> map, int initialCapacity, long maxSegmentWeight, com.google.common.cache.a.b statsCounter) {
            this.f116932a = map;
            this.f116938g = maxSegmentWeight;
            this.f116945n = (com.google.common.cache.a.b) com.google.common.base.j0.E(statsCounter);
            z(F(initialCapacity));
            this.f116939h = map.U() ? new ReferenceQueue<>() : null;
            this.f116940i = map.V() ? new ReferenceQueue<>() : null;
            this.f116941j = map.S() ? new ConcurrentLinkedQueue<>() : n.g();
            this.f116943l = map.X() ? new k0<>() : n.g();
            this.f116944m = map.S() ? new e<>() : n.g();
        }

        public static /* synthetic */ void a(r rVar, Object obj, int i10, m mVar, t1 t1Var) {
            rVar.getClass();
            try {
                rVar.t(obj, i10, mVar, t1Var);
            } catch (Throwable th2) {
                n.f116822h3.log(Level.WARNING, "Exception thrown during refresh", th2);
                mVar.m(th2);
            }
        }

        @fj.a
        m<K, V> A(K k10, int i10, boolean z10) {
            lock();
            try {
                long jA = this.f116932a.f116843s.a();
                I(jA);
                AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116937f;
                int length = (atomicReferenceArray.length() - 1) & i10;
                com.google.common.cache.u<K, V> uVar = (com.google.common.cache.u) atomicReferenceArray.get(length);
                for (com.google.common.cache.u uVarW = uVar; uVarW != null; uVarW = uVarW.w()) {
                    Object key = uVarW.getKey();
                    if (uVarW.l() == i10 && key != null && this.f116932a.f116832e.d(k10, key)) {
                        a0<K, V> a0VarK = uVarW.k();
                        if (!a0VarK.d() && (!z10 || jA - uVarW.q() >= this.f116932a.f116840m)) {
                            this.f116935d++;
                            m<K, V> mVar = new m<>(a0VarK);
                            uVarW.p(mVar);
                            unlock();
                            H();
                            return mVar;
                        }
                        unlock();
                        H();
                        return null;
                    }
                }
                this.f116935d++;
                m<K, V> mVar2 = new m<>();
                com.google.common.cache.u<K, V> uVarE = E(k10, i10, uVar);
                uVarE.p(mVar2);
                atomicReferenceArray.set(length, uVarE);
                unlock();
                H();
                return mVar2;
            } catch (Throwable th2) {
                unlock();
                H();
                throw th2;
            }
        }

        t1<V> B(final K key, final int hash, final m<K, V> loadingValueReference, com.google.common.cache.g<? super K, V> loader) {
            final t1<V> t1VarK = loadingValueReference.k(key, loader);
            t1VarK.m0(new Runnable() { // from class: com.google.common.cache.p
                @Override // java.lang.Runnable
                public final void run() {
                    n.r.a(this.f116970a, key, hash, loadingValueReference, t1VarK);
                }
            }, a2.c());
            return t1VarK;
        }

        V C(K key, int hash, m<K, V> loadingValueReference, com.google.common.cache.g<? super K, V> loader) throws ExecutionException {
            return t(key, hash, loadingValueReference, loadingValueReference.k(key, loader));
        }

        V D(K key, int hash, com.google.common.cache.g<? super K, V> loader) throws ExecutionException {
            m<K, V> mVar;
            boolean z10;
            a0<K, V> a0VarK;
            V vC;
            int i10 = hash;
            lock();
            try {
                long jA = this.f116932a.f116843s.a();
                I(jA);
                int i11 = this.f116933b - 1;
                AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116937f;
                int length = i10 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.u<K, V> uVar = atomicReferenceArray.get(length);
                com.google.common.cache.u<K, V> uVarE = uVar;
                while (true) {
                    mVar = null;
                    if (uVarE == null) {
                        z10 = true;
                        a0VarK = null;
                        break;
                    }
                    long j10 = jA;
                    K key2 = uVarE.getKey();
                    if (uVarE.l() == i10 && key2 != null && this.f116932a.f116832e.d(key, key2)) {
                        a0VarK = uVarE.k();
                        if (!a0VarK.d()) {
                            V v10 = a0VarK.get();
                            if (v10 == null) {
                                n(key2, i10, v10, a0VarK.a(), com.google.common.cache.v.f116979c);
                                i10 = hash;
                            } else {
                                if (!this.f116932a.v(uVarE, j10)) {
                                    M(uVarE, j10);
                                    this.f116945n.a(1);
                                    unlock();
                                    H();
                                    return v10;
                                }
                                i10 = hash;
                                n(key2, i10, v10, a0VarK.a(), com.google.common.cache.v.f116980d);
                            }
                            this.f116943l.remove(uVarE);
                            this.f116944m.remove(uVarE);
                            this.f116933b = i11;
                            z10 = true;
                            break;
                        }
                        z10 = false;
                        break;
                    }
                    uVarE = uVarE.w();
                    jA = j10;
                }
                if (z10) {
                    mVar = new m<>();
                    if (uVarE == null) {
                        uVarE = E(key, i10, uVar);
                        uVarE.p(mVar);
                        atomicReferenceArray.set(length, uVarE);
                    } else {
                        uVarE.p(mVar);
                    }
                }
                unlock();
                H();
                if (!z10) {
                    return g0(uVarE, key, a0VarK);
                }
                try {
                    synchronized (uVarE) {
                        vC = C(key, i10, mVar, loader);
                    }
                    this.f116945n.d(1);
                    return vC;
                } catch (Throwable th2) {
                    this.f116945n.d(1);
                    throw th2;
                }
            } catch (Throwable th3) {
                unlock();
                H();
                throw th3;
            }
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
        @a8.a("this")
        com.google.common.cache.u<K, V> E(K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
            return this.f116932a.f116844t.q(this, com.google.common.base.j0.E(key), hash, next);
        }

        AtomicReferenceArray<com.google.common.cache.u<K, V>> F(int size) {
            return new AtomicReferenceArray<>(size);
        }

        void G() {
            if ((this.f116942k.incrementAndGet() & 63) == 0) {
                b();
            }
        }

        void H() {
            a0();
        }

        @a8.a("this")
        void I(long now) {
            Z(now);
        }

        @z7.a
        @fj.a
        V J(K key, int hash, V value, boolean onlyIfAbsent) {
            com.google.common.cache.u<K, V> uVar;
            int i10;
            lock();
            try {
                long jA = this.f116932a.f116843s.a();
                I(jA);
                if (this.f116933b + 1 > this.f116936e) {
                    p();
                }
                AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116937f;
                int length = hash & (atomicReferenceArray.length() - 1);
                com.google.common.cache.u<K, V> uVar2 = atomicReferenceArray.get(length);
                com.google.common.cache.u<K, V> uVarW = uVar2;
                while (uVarW != null) {
                    K key2 = uVarW.getKey();
                    if (uVarW.l() == hash && key2 != null && this.f116932a.f116832e.d(key, key2)) {
                        a0<K, V> a0VarK = uVarW.k();
                        V v10 = a0VarK.get();
                        if (v10 != null) {
                            long j10 = jA;
                            com.google.common.cache.u<K, V> uVar3 = uVarW;
                            if (onlyIfAbsent) {
                                M(uVar3, j10);
                                return v10;
                            }
                            this.f116935d++;
                            n(key, hash, v10, a0VarK.a(), com.google.common.cache.v.f116978b);
                            c0(uVar3, key, value, j10);
                            o(uVar3);
                            return v10;
                        }
                        this.f116935d++;
                        if (a0VarK.isActive()) {
                            n(key, hash, v10, a0VarK.a(), com.google.common.cache.v.f116979c);
                            com.google.common.cache.u<K, V> uVar4 = uVarW;
                            c0(uVar4, key, value, jA);
                            i10 = this.f116933b;
                            uVar = uVar4;
                        } else {
                            com.google.common.cache.u<K, V> uVar5 = uVarW;
                            c0(uVar5, key, value, jA);
                            uVar = uVar5;
                            i10 = this.f116933b + 1;
                        }
                        this.f116933b = i10;
                        o(uVar);
                        return null;
                    }
                    long j11 = jA;
                    uVarW = uVarW.w();
                    jA = j11;
                }
                this.f116935d++;
                com.google.common.cache.u<K, V> uVarE = E(key, hash, uVar2);
                c0(uVarE, key, value, jA);
                atomicReferenceArray.set(length, uVarE);
                this.f116933b++;
                o(uVarE);
                return null;
            } finally {
                unlock();
                H();
            }
        }

        @z7.a
        boolean K(com.google.common.cache.u<K, V> entry, int hash) throws Throwable {
            r<K, V> rVar;
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116937f;
                int length = (atomicReferenceArray.length() - 1) & hash;
                com.google.common.cache.u<K, V> uVar = atomicReferenceArray.get(length);
                com.google.common.cache.u<K, V> uVarW = uVar;
                while (uVarW != null) {
                    if (uVarW == entry) {
                        this.f116935d++;
                        rVar = this;
                        com.google.common.cache.u<K, V> uVarW2 = rVar.W(uVar, uVarW, uVarW.getKey(), hash, uVarW.k().get(), uVarW.k(), com.google.common.cache.v.f116979c);
                        int i10 = rVar.f116933b - 1;
                        atomicReferenceArray.set(length, uVarW2);
                        rVar.f116933b = i10;
                        rVar.unlock();
                        rVar.H();
                        return true;
                    }
                    rVar = this;
                    int i11 = hash;
                    try {
                        uVarW = uVarW.w();
                        this = rVar;
                        hash = i11;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    th = th2;
                    Throwable th3 = th;
                    rVar.unlock();
                    rVar.H();
                    throw th3;
                }
                r<K, V> rVar2 = this;
                rVar2.unlock();
                rVar2.H();
                return false;
            } catch (Throwable th4) {
                th = th4;
                rVar = this;
            }
        }

        @z7.a
        boolean L(K key, int hash, a0<K, V> valueReference) throws Throwable {
            r<K, V> rVar;
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116937f;
                int length = (atomicReferenceArray.length() - 1) & hash;
                com.google.common.cache.u<K, V> uVar = atomicReferenceArray.get(length);
                com.google.common.cache.u<K, V> uVarW = uVar;
                while (uVarW != null) {
                    K key2 = uVarW.getKey();
                    if (uVarW.l() == hash && key2 != null && this.f116932a.f116832e.d(key, key2)) {
                        if (uVarW.k() != valueReference) {
                            r<K, V> rVar2 = this;
                            rVar2.unlock();
                            if (!rVar2.isHeldByCurrentThread()) {
                                rVar2.H();
                            }
                            return false;
                        }
                        this.f116935d++;
                        rVar = this;
                        com.google.common.cache.u<K, V> uVarW2 = rVar.W(uVar, uVarW, key2, hash, valueReference.get(), valueReference, com.google.common.cache.v.f116979c);
                        int i10 = rVar.f116933b - 1;
                        atomicReferenceArray.set(length, uVarW2);
                        rVar.f116933b = i10;
                        rVar.unlock();
                        if (!rVar.isHeldByCurrentThread()) {
                            rVar.H();
                        }
                        return true;
                    }
                    rVar = this;
                    int i11 = hash;
                    a0<K, V> a0Var = valueReference;
                    try {
                        uVarW = uVarW.w();
                        this = rVar;
                        hash = i11;
                        valueReference = a0Var;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    th = th2;
                    Throwable th3 = th;
                    rVar.unlock();
                    if (rVar.isHeldByCurrentThread()) {
                        throw th3;
                    }
                    rVar.H();
                    throw th3;
                }
                r<K, V> rVar3 = this;
                rVar3.unlock();
                if (!rVar3.isHeldByCurrentThread()) {
                    rVar3.H();
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                rVar = this;
            }
        }

        @a8.a("this")
        void M(com.google.common.cache.u<K, V> entry, long now) {
            if (this.f116932a.I()) {
                entry.r(now);
            }
            this.f116944m.add(entry);
        }

        void N(com.google.common.cache.u<K, V> entry, long now) {
            if (this.f116932a.I()) {
                entry.r(now);
            }
            this.f116941j.add(entry);
        }

        @a8.a("this")
        void O(com.google.common.cache.u<K, V> entry, int weight, long now) {
            k();
            this.f116934c += (long) weight;
            if (this.f116932a.I()) {
                entry.r(now);
            }
            if (this.f116932a.K()) {
                entry.s(now);
            }
            this.f116944m.add(entry);
            this.f116943l.add(entry);
        }

        @z7.a
        @fj.a
        V P(K k10, int i10, com.google.common.cache.g<? super K, V> gVar, boolean z10) {
            m<K, V> mVarA = A(k10, i10, z10);
            if (mVarA == null) {
                return null;
            }
            t1<V> t1VarB = B(k10, i10, mVarA, gVar);
            if (t1VarB.isDone()) {
                try {
                    return (V) f3.f(t1VarB);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        @fj.a
        V Q(Object key, int hash) throws Throwable {
            r<K, V> rVar;
            Throwable th2;
            com.google.common.cache.v vVar;
            lock();
            try {
                I(this.f116932a.f116843s.a());
                AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116937f;
                int length = (atomicReferenceArray.length() - 1) & hash;
                com.google.common.cache.u<K, V> uVar = atomicReferenceArray.get(length);
                com.google.common.cache.u<K, V> uVarW = uVar;
                while (uVarW != null) {
                    K key2 = uVarW.getKey();
                    if (uVarW.l() == hash && key2 != null && this.f116932a.f116832e.d(key, key2)) {
                        a0<K, V> a0VarK = uVarW.k();
                        V v10 = a0VarK.get();
                        if (v10 == null) {
                            if (!a0VarK.isActive()) {
                                break;
                            }
                            vVar = com.google.common.cache.v.f116979c;
                        } else {
                            try {
                                vVar = com.google.common.cache.v.f116977a;
                            } catch (Throwable th3) {
                                th2 = th3;
                                rVar = this;
                            }
                        }
                        com.google.common.cache.v vVar2 = vVar;
                        this.f116935d++;
                        rVar = this;
                        com.google.common.cache.u<K, V> uVarW2 = rVar.W(uVar, uVarW, key2, hash, v10, a0VarK, vVar2);
                        int i10 = rVar.f116933b - 1;
                        atomicReferenceArray.set(length, uVarW2);
                        rVar.f116933b = i10;
                        rVar.unlock();
                        rVar.H();
                        return v10;
                    }
                    rVar = this;
                    int i11 = hash;
                    try {
                        uVarW = uVarW.w();
                        this = rVar;
                        hash = i11;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    th = th4;
                    th2 = th;
                    rVar.unlock();
                    rVar.H();
                    throw th2;
                }
                r<K, V> rVar2 = this;
                rVar2.unlock();
                rVar2.H();
                return null;
            } catch (Throwable th5) {
                th = th5;
                rVar = this;
            }
        }

        boolean R(Object key, int hash, Object value) throws Throwable {
            r<K, V> rVar;
            Throwable th2;
            com.google.common.cache.v vVar;
            lock();
            try {
                I(this.f116932a.f116843s.a());
                AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116937f;
                int length = (atomicReferenceArray.length() - 1) & hash;
                com.google.common.cache.u<K, V> uVar = atomicReferenceArray.get(length);
                com.google.common.cache.u<K, V> uVarW = uVar;
                while (uVarW != null) {
                    K key2 = uVarW.getKey();
                    if (uVarW.l() == hash && key2 != null && this.f116932a.f116832e.d(key, key2)) {
                        a0<K, V> a0VarK = uVarW.k();
                        V v10 = a0VarK.get();
                        if (!this.f116932a.f116833f.d(value, v10)) {
                            if (v10 != null || !a0VarK.isActive()) {
                                break;
                                break;
                            }
                            vVar = com.google.common.cache.v.f116979c;
                        } else {
                            try {
                                vVar = com.google.common.cache.v.f116977a;
                            } catch (Throwable th3) {
                                th2 = th3;
                                rVar = this;
                            }
                        }
                        com.google.common.cache.v vVar2 = vVar;
                        this.f116935d++;
                        rVar = this;
                        com.google.common.cache.u<K, V> uVarW2 = rVar.W(uVar, uVarW, key2, hash, v10, a0VarK, vVar2);
                        int i10 = rVar.f116933b - 1;
                        atomicReferenceArray.set(length, uVarW2);
                        rVar.f116933b = i10;
                        boolean z10 = vVar2 == com.google.common.cache.v.f116977a;
                        rVar.unlock();
                        rVar.H();
                        return z10;
                    }
                    rVar = this;
                    int i11 = hash;
                    try {
                        uVarW = uVarW.w();
                        this = rVar;
                        hash = i11;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    th = th4;
                    th2 = th;
                    rVar.unlock();
                    rVar.H();
                    throw th2;
                }
                r<K, V> rVar2 = this;
                rVar2.unlock();
                rVar2.H();
                return false;
            } catch (Throwable th5) {
                th = th5;
                rVar = this;
            }
        }

        @a8.a("this")
        void S(com.google.common.cache.u<K, V> entry) {
            n(entry.getKey(), entry.l(), entry.k().get(), entry.k().a(), com.google.common.cache.v.f116979c);
            this.f116943l.remove(entry);
            this.f116944m.remove(entry);
        }

        @z7.a
        @com.google.common.annotations.e
        @a8.a("this")
        boolean T(com.google.common.cache.u<K, V> entry, int hash, com.google.common.cache.v cause) {
            AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116937f;
            int length = (atomicReferenceArray.length() - 1) & hash;
            com.google.common.cache.u<K, V> uVar = atomicReferenceArray.get(length);
            for (com.google.common.cache.u<K, V> uVarW = uVar; uVarW != null; uVarW = uVarW.w()) {
                if (uVarW == entry) {
                    this.f116935d++;
                    com.google.common.cache.u<K, V> uVarW2 = W(uVar, uVarW, uVarW.getKey(), hash, uVarW.k().get(), uVarW.k(), cause);
                    int i10 = this.f116933b - 1;
                    atomicReferenceArray.set(length, uVarW2);
                    this.f116933b = i10;
                    return true;
                }
            }
            return false;
        }

        @a8.a("this")
        @fj.a
        com.google.common.cache.u<K, V> U(com.google.common.cache.u<K, V> first, com.google.common.cache.u<K, V> entry) {
            int i10 = this.f116933b;
            com.google.common.cache.u<K, V> uVarW = entry.w();
            while (first != entry) {
                com.google.common.cache.u<K, V> uVarI = i(first, uVarW);
                if (uVarI != null) {
                    uVarW = uVarI;
                } else {
                    S(first);
                    i10--;
                }
                first = first.w();
            }
            this.f116933b = i10;
            return uVarW;
        }

        @z7.a
        boolean V(K key, int hash, m<K, V> valueReference) {
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116937f;
                int length = (atomicReferenceArray.length() - 1) & hash;
                com.google.common.cache.u<K, V> uVar = atomicReferenceArray.get(length);
                com.google.common.cache.u<K, V> uVarW = uVar;
                while (uVarW != null) {
                    K key2 = uVarW.getKey();
                    if (uVarW.l() == hash && key2 != null && this.f116932a.f116832e.d(key, key2)) {
                        if (uVarW.k() != valueReference) {
                            break;
                        }
                        if (valueReference.isActive()) {
                            uVarW.p(valueReference.j());
                        } else {
                            atomicReferenceArray.set(length, U(uVar, uVarW));
                        }
                        unlock();
                        H();
                        return true;
                    }
                    uVarW = uVarW.w();
                }
                unlock();
                H();
                return false;
            } catch (Throwable th2) {
                unlock();
                H();
                throw th2;
            }
        }

        @a8.a("this")
        @fj.a
        com.google.common.cache.u<K, V> W(com.google.common.cache.u<K, V> first, com.google.common.cache.u<K, V> entry, @fj.a K key, int hash, V value, a0<K, V> valueReference, com.google.common.cache.v cause) {
            n(key, hash, value, valueReference.a(), cause);
            this.f116943l.remove(entry);
            this.f116944m.remove(entry);
            if (!valueReference.d()) {
                return U(first, entry);
            }
            valueReference.c(null);
            return first;
        }

        @fj.a
        V X(K key, int hash, V newValue) {
            lock();
            try {
                long jA = this.f116932a.f116843s.a();
                I(jA);
                AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116937f;
                int length = hash & (atomicReferenceArray.length() - 1);
                com.google.common.cache.u<K, V> uVar = atomicReferenceArray.get(length);
                com.google.common.cache.u<K, V> uVarW = uVar;
                while (uVarW != null) {
                    K key2 = uVarW.getKey();
                    if (uVarW.l() == hash && key2 != null && this.f116932a.f116832e.d(key, key2)) {
                        long j10 = jA;
                        a0<K, V> a0VarK = uVarW.k();
                        V v10 = a0VarK.get();
                        if (v10 != null) {
                            com.google.common.cache.u<K, V> uVar2 = uVarW;
                            this.f116935d++;
                            n(key, hash, v10, a0VarK.a(), com.google.common.cache.v.f116978b);
                            c0(uVar2, key, newValue, j10);
                            o(uVar2);
                            unlock();
                            H();
                            return v10;
                        }
                        if (!a0VarK.isActive()) {
                            break;
                        }
                        this.f116935d++;
                        com.google.common.cache.u<K, V> uVarW2 = W(uVar, uVarW, key2, hash, v10, a0VarK, com.google.common.cache.v.f116979c);
                        int i10 = this.f116933b - 1;
                        atomicReferenceArray.set(length, uVarW2);
                        this.f116933b = i10;
                        break;
                    }
                    com.google.common.cache.u<K, V> uVar3 = uVar;
                    long j11 = jA;
                    uVarW = uVarW.w();
                    uVar = uVar3;
                    jA = j11;
                }
                unlock();
                H();
                return null;
            } catch (Throwable th2) {
                unlock();
                H();
                throw th2;
            }
        }

        boolean Y(K key, int hash, V oldValue, V newValue) {
            int i10 = hash;
            lock();
            try {
                long jA = this.f116932a.f116843s.a();
                I(jA);
                AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116937f;
                int length = i10 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.u<K, V> uVar = atomicReferenceArray.get(length);
                com.google.common.cache.u<K, V> uVarW = uVar;
                while (uVarW != null) {
                    com.google.common.cache.u<K, V> uVar2 = uVarW;
                    K key2 = uVar2.getKey();
                    if (uVar2.l() == i10 && key2 != null && this.f116932a.f116832e.d(key, key2)) {
                        long j10 = jA;
                        a0<K, V> a0VarK = uVar2.k();
                        V v10 = a0VarK.get();
                        if (v10 != null) {
                            if (!this.f116932a.f116833f.d(oldValue, v10)) {
                                M(uVar2, j10);
                                break;
                            }
                            this.f116935d++;
                            n(key, hash, v10, a0VarK.a(), com.google.common.cache.v.f116978b);
                            c0(uVar2, key, newValue, j10);
                            o(uVar2);
                            unlock();
                            H();
                            return true;
                        }
                        if (!a0VarK.isActive()) {
                            break;
                        }
                        this.f116935d++;
                        com.google.common.cache.u<K, V> uVarW2 = W(uVar, uVar2, key2, i10, v10, a0VarK, com.google.common.cache.v.f116979c);
                        int i11 = this.f116933b - 1;
                        atomicReferenceArray.set(length, uVarW2);
                        this.f116933b = i11;
                        break;
                    }
                    com.google.common.cache.u<K, V> uVar3 = uVar;
                    long j11 = jA;
                    uVarW = uVar2.w();
                    uVar = uVar3;
                    i10 = hash;
                    jA = j11;
                }
                unlock();
                H();
                return false;
            } catch (Throwable th2) {
                unlock();
                H();
                throw th2;
            }
        }

        void Z(long now) {
            if (tryLock()) {
                try {
                    l();
                    q(now);
                    this.f116942k.set(0);
                } finally {
                    unlock();
                }
            }
        }

        void a0() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.f116932a.F();
        }

        void b() {
            Z(this.f116932a.f116843s.a());
            a0();
        }

        V b0(com.google.common.cache.u<K, V> entry, K key, int hash, V oldValue, long now, com.google.common.cache.g<? super K, V> loader) {
            if (this.f116932a.M() && now - entry.q() > this.f116932a.f116840m && !entry.k().d()) {
                int i10 = 2 & 1;
                V vP = P(key, hash, loader, true);
                if (vP != null) {
                    return vP;
                }
            }
            return oldValue;
        }

        void c() throws Throwable {
            r<K, V> rVar;
            if (this.f116933b == 0) {
                return;
            }
            lock();
            try {
                I(this.f116932a.f116843s.a());
                AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116937f;
                for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                    com.google.common.cache.u<K, V> uVarW = atomicReferenceArray.get(i10);
                    while (uVarW != null) {
                        if (uVarW.k().isActive()) {
                            K key = uVarW.getKey();
                            V v10 = uVarW.k().get();
                            rVar = this;
                            try {
                                rVar.n(key, uVarW.l(), v10, uVarW.k().a(), (key == null || v10 == null) ? com.google.common.cache.v.f116979c : com.google.common.cache.v.f116977a);
                            } catch (Throwable th2) {
                                th = th2;
                                rVar.unlock();
                                rVar.H();
                                throw th;
                            }
                        } else {
                            rVar = this;
                        }
                        uVarW = uVarW.w();
                        this = rVar;
                    }
                }
                rVar = this;
                for (int i11 = 0; i11 < atomicReferenceArray.length(); i11++) {
                    atomicReferenceArray.set(i11, null);
                }
                rVar.e();
                rVar.f116943l.clear();
                rVar.f116944m.clear();
                rVar.f116942k.set(0);
                rVar.f116935d++;
                rVar.f116933b = 0;
                rVar.unlock();
                rVar.H();
            } catch (Throwable th3) {
                th = th3;
                rVar = this;
            }
        }

        @a8.a("this")
        void c0(com.google.common.cache.u<K, V> entry, K key, V value, long now) {
            a0<K, V> a0VarK = entry.k();
            int iB = this.f116932a.f116837j.b(key, value);
            com.google.common.base.j0.h0(iB >= 0, "Weights must be non-negative");
            entry.p(this.f116932a.f116835h.n(this, entry, value, iB));
            O(entry, iB, now);
            a0VarK.c(value);
        }

        void d() {
            while (this.f116939h.poll() != null) {
            }
        }

        @z7.a
        boolean d0(K key, int hash, m<K, V> oldValueReference, V newValue) {
            lock();
            try {
                long jA = this.f116932a.f116843s.a();
                I(jA);
                int i10 = this.f116933b + 1;
                if (i10 > this.f116936e) {
                    p();
                    i10 = this.f116933b + 1;
                }
                AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116937f;
                int length = hash & (atomicReferenceArray.length() - 1);
                com.google.common.cache.u<K, V> uVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.u<K, V> uVarW = uVar; uVarW != null; uVarW = uVarW.w()) {
                    K key2 = uVarW.getKey();
                    if (uVarW.l() == hash && key2 != null && this.f116932a.f116832e.d(key, key2)) {
                        a0<K, V> a0VarK = uVarW.k();
                        V v10 = a0VarK.get();
                        if (oldValueReference != a0VarK && (v10 != null || a0VarK == n.f116823i3)) {
                            n(key, hash, newValue, 0, com.google.common.cache.v.f116978b);
                            return false;
                        }
                        this.f116935d++;
                        if (oldValueReference.isActive()) {
                            n(key, hash, v10, oldValueReference.a(), v10 == null ? com.google.common.cache.v.f116979c : com.google.common.cache.v.f116978b);
                            i10--;
                        }
                        com.google.common.cache.u<K, V> uVar2 = uVarW;
                        c0(uVar2, key, newValue, jA);
                        this.f116933b = i10;
                        o(uVar2);
                        return true;
                    }
                }
                this.f116935d++;
                com.google.common.cache.u<K, V> uVarE = E(key, hash, uVar);
                c0(uVarE, key, newValue, jA);
                atomicReferenceArray.set(length, uVarE);
                this.f116933b = i10;
                o(uVarE);
                return true;
            } finally {
                unlock();
                H();
            }
        }

        void e() {
            if (this.f116932a.U()) {
                d();
            }
            if (this.f116932a.V()) {
                f();
            }
        }

        void e0() {
            if (tryLock()) {
                try {
                    l();
                } finally {
                    unlock();
                }
            }
        }

        void f() {
            while (this.f116940i.poll() != null) {
            }
        }

        void f0(long now) {
            if (tryLock()) {
                try {
                    q(now);
                } finally {
                    unlock();
                }
            }
        }

        boolean g(Object key, int hash) {
            try {
                if (this.f116933b == 0) {
                    G();
                    return false;
                }
                com.google.common.cache.u<K, V> uVarW = w(key, hash, this.f116932a.f116843s.a());
                if (uVarW == null) {
                    G();
                    return false;
                }
                boolean z10 = uVarW.k().get() != null;
                G();
                return z10;
            } catch (Throwable th2) {
                G();
                throw th2;
            }
        }

        V g0(com.google.common.cache.u<K, V> e10, K key, a0<K, V> valueReference) throws ExecutionException {
            if (!valueReference.d()) {
                throw new AssertionError();
            }
            com.google.common.base.j0.x0(!Thread.holdsLock(e10), "Recursive load of: %s", key);
            try {
                V vE = valueReference.e();
                if (vE != null) {
                    N(e10, this.f116932a.f116843s.a());
                    this.f116945n.d(1);
                    return vE;
                }
                throw new com.google.common.cache.g.c("CacheLoader returned null for key " + key + ".");
            } catch (Throwable th2) {
                this.f116945n.d(1);
                throw th2;
            }
        }

        @com.google.common.annotations.e
        boolean h(Object value) {
            try {
                if (this.f116933b != 0) {
                    long jA = this.f116932a.f116843s.a();
                    AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116937f;
                    int length = atomicReferenceArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        for (com.google.common.cache.u<K, V> uVarW = atomicReferenceArray.get(i10); uVarW != null; uVarW = uVarW.w()) {
                            V vX = x(uVarW, jA);
                            if (vX != null && this.f116932a.f116833f.d(value, vX)) {
                                G();
                                return true;
                            }
                        }
                    }
                }
                G();
                return false;
            } catch (Throwable th2) {
                G();
                throw th2;
            }
        }

        @a8.a("this")
        @fj.a
        com.google.common.cache.u<K, V> i(com.google.common.cache.u<K, V> original, com.google.common.cache.u<K, V> newNext) {
            K key = original.getKey();
            if (key == null) {
                return null;
            }
            a0<K, V> a0VarK = original.k();
            V v10 = a0VarK.get();
            if (v10 == null && a0VarK.isActive()) {
                return null;
            }
            com.google.common.cache.u<K, V> uVarN = this.f116932a.f116844t.n(this, original, newNext, key);
            uVarN.p(a0VarK.f(this.f116940i, v10, uVarN));
            return uVarN;
        }

        @a8.a("this")
        void j() throws Throwable {
            int i10 = 0;
            do {
                Reference<? extends K> referencePoll = this.f116939h.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f116932a.G((com.google.common.cache.u) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        @a8.a("this")
        void k() {
            while (true) {
                com.google.common.cache.u<K, V> uVarPoll = this.f116941j.poll();
                if (uVarPoll == null) {
                    return;
                }
                if (this.f116944m.contains(uVarPoll)) {
                    this.f116944m.add(uVarPoll);
                }
            }
        }

        @a8.a("this")
        void l() throws Throwable {
            if (this.f116932a.U()) {
                j();
            }
            if (this.f116932a.V()) {
                m();
            }
        }

        @a8.a("this")
        void m() throws Throwable {
            int i10 = 0;
            do {
                Reference<? extends V> referencePoll = this.f116940i.poll();
                if (referencePoll == null) {
                    break;
                }
                this.f116932a.H((a0) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        @a8.a("this")
        void n(@fj.a K key, int hash, @fj.a V value, int weight, com.google.common.cache.v cause) {
            this.f116934c -= (long) weight;
            if (cause.l()) {
                this.f116945n.b();
            }
            if (this.f116932a.f116841n != n.f116824j3) {
                this.f116932a.f116841n.offer(com.google.common.cache.a0.a(key, value, cause));
            }
        }

        @a8.a("this")
        void o(com.google.common.cache.u<K, V> newest) {
            if (this.f116932a.h()) {
                k();
                if (newest.k().a() > this.f116938g && !T(newest, newest.l(), com.google.common.cache.v.f116981e)) {
                    throw new AssertionError();
                }
                while (this.f116934c > this.f116938g) {
                    com.google.common.cache.u<K, V> uVarY = y();
                    if (!T(uVarY, uVarY.l(), com.google.common.cache.v.f116981e)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        @a8.a("this")
        void p() {
            AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116937f;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.f116933b;
            AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArrayF = F(length << 1);
            this.f116936e = (atomicReferenceArrayF.length() * 3) / 4;
            int length2 = atomicReferenceArrayF.length() - 1;
            for (int i11 = 0; i11 < length; i11++) {
                com.google.common.cache.u<K, V> uVarW = atomicReferenceArray.get(i11);
                if (uVarW != null) {
                    com.google.common.cache.u<K, V> uVarW2 = uVarW.w();
                    int iL = uVarW.l() & length2;
                    if (uVarW2 == null) {
                        atomicReferenceArrayF.set(iL, uVarW);
                    } else {
                        com.google.common.cache.u<K, V> uVar = uVarW;
                        while (uVarW2 != null) {
                            int iL2 = uVarW2.l() & length2;
                            if (iL2 != iL) {
                                uVar = uVarW2;
                                iL = iL2;
                            }
                            uVarW2 = uVarW2.w();
                        }
                        atomicReferenceArrayF.set(iL, uVar);
                        while (uVarW != uVar) {
                            int iL3 = uVarW.l() & length2;
                            com.google.common.cache.u<K, V> uVarI = i(uVarW, atomicReferenceArrayF.get(iL3));
                            if (uVarI != null) {
                                atomicReferenceArrayF.set(iL3, uVarI);
                            } else {
                                S(uVarW);
                                i10--;
                            }
                            uVarW = uVarW.w();
                        }
                    }
                }
            }
            this.f116937f = atomicReferenceArrayF;
            this.f116933b = i10;
        }

        @a8.a("this")
        void q(long now) {
            com.google.common.cache.u<K, V> uVarPeek;
            com.google.common.cache.u<K, V> uVarPeek2;
            k();
            do {
                uVarPeek = this.f116943l.peek();
                if (uVarPeek == null || !this.f116932a.v(uVarPeek, now)) {
                    do {
                        uVarPeek2 = this.f116944m.peek();
                        if (uVarPeek2 == null || !this.f116932a.v(uVarPeek2, now)) {
                            return;
                        }
                    } while (T(uVarPeek2, uVarPeek2.l(), com.google.common.cache.v.f116980d));
                    throw new AssertionError();
                }
            } while (T(uVarPeek, uVarPeek.l(), com.google.common.cache.v.f116980d));
            throw new AssertionError();
        }

        @fj.a
        V r(Object key, int hash) throws Throwable {
            r<K, V> rVar;
            try {
                if (this.f116933b != 0) {
                    long jA = this.f116932a.f116843s.a();
                    com.google.common.cache.u<K, V> uVarW = w(key, hash, jA);
                    if (uVarW == null) {
                        G();
                        return null;
                    }
                    V v10 = uVarW.k().get();
                    try {
                        if (v10 != null) {
                            N(uVarW, jA);
                            V vB0 = b0(uVarW, uVarW.getKey(), hash, v10, jA, this.f116932a.f116846w);
                            G();
                            return vB0;
                        }
                        rVar = this;
                        rVar.e0();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    Throwable th3 = th;
                    G();
                    throw th3;
                }
                rVar = this;
                rVar.G();
                return null;
            } catch (Throwable th4) {
                th = th4;
            }
        }

        @z7.a
        V s(K key, int hash, com.google.common.cache.g<? super K, V> loader) throws Throwable {
            r<K, V> rVar;
            K k10;
            com.google.common.cache.u<K, V> uVarU;
            com.google.common.base.j0.E(key);
            com.google.common.base.j0.E(loader);
            try {
                try {
                    try {
                        if (this.f116933b != 0 && (uVarU = u(key, hash)) != null) {
                            long jA = this.f116932a.f116843s.a();
                            V vX = x(uVarU, jA);
                            if (vX != null) {
                                N(uVarU, jA);
                                this.f116945n.a(1);
                                V vB0 = b0(uVarU, key, hash, vX, jA, loader);
                                G();
                                return vB0;
                            }
                            rVar = this;
                            k10 = key;
                            a0<K, V> a0VarK = uVarU.k();
                            if (a0VarK.d()) {
                                V vG0 = rVar.g0(uVarU, k10, a0VarK);
                                rVar.G();
                                return vG0;
                            }
                            ExecutionException executionException = e;
                            Throwable cause = executionException.getCause();
                            if (cause instanceof Error) {
                                throw new p0((Error) cause);
                            }
                            if (cause instanceof RuntimeException) {
                                throw new d3(cause);
                            }
                            throw executionException;
                        }
                        rVar = this;
                        k10 = key;
                        V vD = rVar.D(k10, hash, loader);
                        rVar.G();
                        return vD;
                    } catch (ExecutionException e10) {
                        e = e10;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    G();
                    throw th3;
                }
            } catch (ExecutionException e11) {
                e = e11;
            } catch (Throwable th4) {
                th = th4;
                Throwable th5 = th;
                G();
                throw th5;
            }
        }

        @z7.a
        V t(K k10, int i10, m<K, V> mVar, t1<V> t1Var) throws Throwable {
            V v10;
            try {
                v10 = (V) f3.f(t1Var);
                try {
                    if (v10 != null) {
                        this.f116945n.c(mVar.h());
                        d0(k10, i10, mVar, v10);
                        return v10;
                    }
                    throw new com.google.common.cache.g.c("CacheLoader returned null for key " + k10 + ".");
                } catch (Throwable th2) {
                    th = th2;
                    if (v10 == null) {
                        this.f116945n.e(mVar.h());
                        V(k10, i10, mVar);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                v10 = null;
            }
        }

        @fj.a
        com.google.common.cache.u<K, V> u(Object key, int hash) {
            for (com.google.common.cache.u<K, V> uVarV = v(hash); uVarV != null; uVarV = uVarV.w()) {
                if (uVarV.l() == hash) {
                    K key2 = uVarV.getKey();
                    if (key2 == null) {
                        e0();
                    } else if (this.f116932a.f116832e.d(key, key2)) {
                        return uVarV;
                    }
                }
            }
            return null;
        }

        com.google.common.cache.u<K, V> v(int hash) {
            AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = this.f116937f;
            return atomicReferenceArray.get(hash & (atomicReferenceArray.length() - 1));
        }

        @fj.a
        com.google.common.cache.u<K, V> w(Object key, int hash, long now) {
            com.google.common.cache.u<K, V> uVarU = u(key, hash);
            if (uVarU == null) {
                return null;
            }
            if (!this.f116932a.v(uVarU, now)) {
                return uVarU;
            }
            f0(now);
            return null;
        }

        V x(com.google.common.cache.u<K, V> entry, long now) {
            if (entry.getKey() == null) {
                e0();
                return null;
            }
            V v10 = entry.k().get();
            if (v10 == null) {
                e0();
                return null;
            }
            if (!this.f116932a.v(entry, now)) {
                return v10;
            }
            f0(now);
            return null;
        }

        @a8.a("this")
        com.google.common.cache.u<K, V> y() {
            for (com.google.common.cache.u<K, V> uVar : this.f116944m) {
                if (uVar.k().a() > 0) {
                    return uVar;
                }
            }
            throw new AssertionError();
        }

        void z(AtomicReferenceArray<com.google.common.cache.u<K, V>> newTable) {
            this.f116936e = (newTable.length() * 3) / 4;
            if (!this.f116932a.f()) {
                int i10 = this.f116936e;
                if (i10 == this.f116938g) {
                    this.f116936e = i10 + 1;
                }
            }
            this.f116937f = newTable;
        }
    }

    static class s<K, V> extends SoftReference<V> implements a0<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.google.common.cache.u<K, V> f116946a;

        s(ReferenceQueue<V> queue, V referent, com.google.common.cache.u<K, V> entry) {
            super(referent, queue);
            this.f116946a = entry;
        }

        public int a() {
            return 1;
        }

        @Override // com.google.common.cache.n.a0
        public com.google.common.cache.u<K, V> b() {
            return this.f116946a;
        }

        @Override // com.google.common.cache.n.a0
        public void c(V newValue) {
        }

        @Override // com.google.common.cache.n.a0
        public boolean d() {
            return false;
        }

        @Override // com.google.common.cache.n.a0
        public V e() {
            return get();
        }

        public a0<K, V> f(ReferenceQueue<V> queue, V value, com.google.common.cache.u<K, V> entry) {
            return new s(queue, value, entry);
        }

        @Override // com.google.common.cache.n.a0
        public boolean isActive() {
            return true;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f116947a = new a("STRONG", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final t f116948b = new b("SOFT", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f116949c = new c("WEAK", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ t[] f116950d = k();

        final enum a extends t {
            a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.n.t
            com.google.common.base.m<Object> l() {
                return com.google.common.base.m.c();
            }

            @Override // com.google.common.cache.n.t
            <K, V> a0<K, V> n(r<K, V> segment, com.google.common.cache.u<K, V> entry, V value, int weight) {
                return weight == 1 ? new x(value) : new i0(value, weight);
            }
        }

        final enum b extends t {
            b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.n.t
            com.google.common.base.m<Object> l() {
                return com.google.common.base.m.g();
            }

            @Override // com.google.common.cache.n.t
            <K, V> a0<K, V> n(r<K, V> segment, com.google.common.cache.u<K, V> entry, V value, int weight) {
                return weight == 1 ? new s(segment.f116940i, value, entry) : new h0(segment.f116940i, value, entry, weight);
            }
        }

        final enum c extends t {
            c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.n.t
            com.google.common.base.m<Object> l() {
                return com.google.common.base.m.g();
            }

            @Override // com.google.common.cache.n.t
            <K, V> a0<K, V> n(r<K, V> segment, com.google.common.cache.u<K, V> entry, V value, int weight) {
                return weight == 1 ? new f0(segment.f116940i, value, entry) : new j0(segment.f116940i, value, entry, weight);
            }
        }

        private t(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        private static /* synthetic */ t[] k() {
            return new t[]{f116947a, f116948b, f116949c};
        }

        public static t valueOf(String name) {
            return (t) Enum.valueOf(t.class, name);
        }

        public static t[] values() {
            return (t[]) f116950d.clone();
        }

        abstract com.google.common.base.m<Object> l();

        abstract <K, V> a0<K, V> n(r<K, V> segment, com.google.common.cache.u<K, V> entry, V value, int weight);

        /* synthetic */ t(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    static final class u<K, V> extends w<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile long f116951e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @r9.m
        com.google.common.cache.u<K, V> f116952f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @r9.m
        com.google.common.cache.u<K, V> f116953g;

        u(K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
            super(key, hash, next);
            this.f116951e = Long.MAX_VALUE;
            this.f116952f = n.C();
            this.f116953g = n.C();
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public void D(com.google.common.cache.u<K, V> next) {
            this.f116952f = next;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public void n(com.google.common.cache.u<K, V> previous) {
            this.f116953g = previous;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public void r(long time) {
            this.f116951e = time;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public com.google.common.cache.u<K, V> t() {
            return this.f116953g;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public com.google.common.cache.u<K, V> x() {
            return this.f116952f;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public long z() {
            return this.f116951e;
        }
    }

    static final class v<K, V> extends w<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile long f116954e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @r9.m
        com.google.common.cache.u<K, V> f116955f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @r9.m
        com.google.common.cache.u<K, V> f116956g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile long f116957h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @r9.m
        com.google.common.cache.u<K, V> f116958i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @r9.m
        com.google.common.cache.u<K, V> f116959j;

        v(K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
            super(key, hash, next);
            this.f116954e = Long.MAX_VALUE;
            this.f116955f = n.C();
            this.f116956g = n.C();
            this.f116957h = Long.MAX_VALUE;
            this.f116958i = n.C();
            this.f116959j = n.C();
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public void D(com.google.common.cache.u<K, V> next) {
            this.f116955f = next;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public void E(com.google.common.cache.u<K, V> next) {
            this.f116958i = next;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public void H(com.google.common.cache.u<K, V> previous) {
            this.f116959j = previous;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public void n(com.google.common.cache.u<K, V> previous) {
            this.f116956g = previous;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public com.google.common.cache.u<K, V> o() {
            return this.f116959j;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public long q() {
            return this.f116957h;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public void r(long time) {
            this.f116954e = time;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public void s(long time) {
            this.f116957h = time;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public com.google.common.cache.u<K, V> t() {
            return this.f116956g;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public com.google.common.cache.u<K, V> v() {
            return this.f116958i;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public com.google.common.cache.u<K, V> x() {
            return this.f116955f;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public long z() {
            return this.f116954e;
        }
    }

    static class w<K, V> extends d<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f116960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f116961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        final com.google.common.cache.u<K, V> f116962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile a0<K, V> f116963d = n.Q();

        w(K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
            this.f116960a = key;
            this.f116961b = hash;
            this.f116962c = next;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public K getKey() {
            return this.f116960a;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public a0<K, V> k() {
            return this.f116963d;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public int l() {
            return this.f116961b;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public void p(a0<K, V> valueReference) {
            this.f116963d = valueReference;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public com.google.common.cache.u<K, V> w() {
            return this.f116962c;
        }
    }

    static class x<K, V> implements a0<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final V f116964a;

        x(V referent) {
            this.f116964a = referent;
        }

        @Override // com.google.common.cache.n.a0
        public int a() {
            return 1;
        }

        @Override // com.google.common.cache.n.a0
        public com.google.common.cache.u<K, V> b() {
            return null;
        }

        @Override // com.google.common.cache.n.a0
        public void c(V newValue) {
        }

        @Override // com.google.common.cache.n.a0
        public boolean d() {
            return false;
        }

        @Override // com.google.common.cache.n.a0
        public V e() {
            return get();
        }

        @Override // com.google.common.cache.n.a0
        public a0<K, V> f(ReferenceQueue<V> queue, V value, com.google.common.cache.u<K, V> entry) {
            return this;
        }

        @Override // com.google.common.cache.n.a0
        public V get() {
            return this.f116964a;
        }

        @Override // com.google.common.cache.n.a0
        public boolean isActive() {
            return true;
        }
    }

    static final class y<K, V> extends w<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile long f116965e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @r9.m
        com.google.common.cache.u<K, V> f116966f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @r9.m
        com.google.common.cache.u<K, V> f116967g;

        y(K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
            super(key, hash, next);
            this.f116965e = Long.MAX_VALUE;
            this.f116966f = n.C();
            this.f116967g = n.C();
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public void E(com.google.common.cache.u<K, V> next) {
            this.f116966f = next;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public void H(com.google.common.cache.u<K, V> previous) {
            this.f116967g = previous;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public com.google.common.cache.u<K, V> o() {
            return this.f116967g;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public long q() {
            return this.f116965e;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public void s(long time) {
            this.f116965e = time;
        }

        @Override // com.google.common.cache.n.d, com.google.common.cache.u
        public com.google.common.cache.u<K, V> v() {
            return this.f116966f;
        }
    }

    final class z extends n<K, V>.i<V> {
        z() {
            super();
        }

        @Override // com.google.common.cache.n.i, java.util.Iterator
        public V next() {
            return d().getValue();
        }
    }

    n(com.google.common.cache.d<? super K, ? super V> dVar, @fj.a com.google.common.cache.g<? super K, V> gVar) {
        this.f116831d = Math.min(dVar.l(), 65536);
        t tVarQ = dVar.q();
        this.f116834g = tVarQ;
        this.f116835h = dVar.x();
        this.f116832e = dVar.p();
        this.f116833f = dVar.w();
        long jR = dVar.r();
        this.f116836i = jR;
        this.f116837j = (com.google.common.cache.c0<K, V>) dVar.y();
        this.f116838k = dVar.m();
        this.f116839l = dVar.n();
        this.f116840m = dVar.s();
        com.google.common.cache.d.e eVar = (com.google.common.cache.w<K, V>) dVar.t();
        this.f116842o = eVar;
        this.f116841n = eVar == com.google.common.cache.d.e.INSTANCE ? g() : new ConcurrentLinkedQueue<>();
        this.f116843s = dVar.v(J());
        this.f116844t = f.p(tVarQ, R(), W());
        this.f116845v = dVar.u().get();
        this.f116846w = gVar;
        int iMin = Math.min(dVar.o(), 1073741824);
        if (h() && !f()) {
            iMin = (int) Math.min(iMin, jR);
        }
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 1;
        while (i13 < this.f116831d && (!h() || ((long) i13) * 20 <= this.f116836i)) {
            i12++;
            i13 <<= 1;
        }
        this.f116829b = 32 - i12;
        this.f116828a = i13 - 1;
        this.f116830c = A(i13);
        int i14 = iMin / i13;
        while (i11 < (i14 * i13 < iMin ? i14 + 1 : i14)) {
            i11 <<= 1;
        }
        if (h()) {
            long j10 = this.f116836i;
            long j11 = i13;
            long j12 = (j10 / j11) + 1;
            long j13 = j10 % j11;
            while (true) {
                r<K, V>[] rVarArr = this.f116830c;
                if (i10 >= rVarArr.length) {
                    return;
                }
                if (i10 == j13) {
                    j12--;
                }
                rVarArr[i10] = e(i11, j12, dVar.u().get());
                i10++;
            }
        } else {
            while (true) {
                r<K, V>[] rVarArr2 = this.f116830c;
                if (i10 >= rVarArr2.length) {
                    return;
                }
                rVarArr2[i10] = e(i11, -1L, dVar.u().get());
                i10++;
            }
        }
    }

    static <K, V> com.google.common.cache.u<K, V> C() {
        return q.INSTANCE;
    }

    static <K, V> void D(com.google.common.cache.u<K, V> nulled) {
        com.google.common.cache.u<K, V> uVarC = C();
        nulled.D(uVarC);
        nulled.n(uVarC);
    }

    static <K, V> void E(com.google.common.cache.u<K, V> nulled) {
        com.google.common.cache.u<K, V> uVarC = C();
        nulled.E(uVarC);
        nulled.H(uVarC);
    }

    static int O(int h10) {
        int i10 = h10 + ((h10 << 15) ^ (-12931));
        int i11 = i10 ^ (i10 >>> 10);
        int i12 = i11 + (i11 << 3);
        int i13 = i12 ^ (i12 >>> 6);
        int i14 = i13 + (i13 << 2) + (i13 << 14);
        return i14 ^ (i14 >>> 16);
    }

    static <K, V> a0<K, V> Q() {
        return (a0<K, V>) f116823i3;
    }

    static <K, V> void b(com.google.common.cache.u<K, V> previous, com.google.common.cache.u<K, V> next) {
        previous.D(next);
        next.n(previous);
    }

    static <K, V> void c(com.google.common.cache.u<K, V> previous, com.google.common.cache.u<K, V> next) {
        previous.E(next);
        next.H(previous);
    }

    static <E> Queue<E> g() {
        return (Queue<E>) f116824j3;
    }

    final r<K, V>[] A(int ssize) {
        return new r[ssize];
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
    @com.google.common.annotations.e
    a0<K, V> B(com.google.common.cache.u<K, V> entry, V value, int weight) {
        return this.f116835h.n(P(entry.l()), entry, com.google.common.base.j0.E(value), weight);
    }

    void F() {
        while (true) {
            com.google.common.cache.a0<K, V> a0VarPoll = this.f116841n.poll();
            if (a0VarPoll == null) {
                return;
            }
            try {
                this.f116842o.b(a0VarPoll);
            } catch (Throwable th2) {
                f116822h3.log(Level.WARNING, "Exception thrown by removal listener", th2);
            }
        }
    }

    void G(com.google.common.cache.u<K, V> entry) throws Throwable {
        int iL = entry.l();
        P(iL).K(entry, iL);
    }

    void H(a0<K, V> valueReference) throws Throwable {
        com.google.common.cache.u<K, V> uVarB = valueReference.b();
        int iL = uVarB.l();
        P(iL).L(uVarB.getKey(), iL, valueReference);
    }

    boolean I() {
        return j();
    }

    boolean J() {
        return K() || I();
    }

    boolean K() {
        if (!k() && !M()) {
            return false;
        }
        return true;
    }

    void L(K key) {
        int iT = t(com.google.common.base.j0.E(key));
        P(iT).P(key, iT, this.f116846w, false);
    }

    boolean M() {
        return this.f116840m > 0;
    }

    r<K, V> P(int hash) {
        return this.f116830c[this.f116828a & (hash >>> this.f116829b)];
    }

    boolean R() {
        return S() || I();
    }

    boolean S() {
        return j() || h();
    }

    boolean U() {
        return this.f116834g != t.f116947a;
    }

    boolean V() {
        return this.f116835h != t.f116947a;
    }

    boolean W() {
        return X() || K();
    }

    boolean X() {
        return k();
    }

    public void a() {
        for (r<K, V> rVar : this.f116830c) {
            rVar.b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() throws Throwable {
        for (r<K, V> rVar : this.f116830c) {
            rVar.c();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@fj.a Object key) {
        if (key == null) {
            return false;
        }
        int iT = t(key);
        return P(iT).g(key, iT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@fj.a Object obj) {
        int i10 = 0;
        if (obj == null) {
            return false;
        }
        long jA = this.f116843s.a();
        r<K, V>[] rVarArr = this.f116830c;
        long j10 = -1;
        int i11 = 0;
        while (i11 < 3) {
            int length = rVarArr.length;
            long j11 = 0;
            Object[] objArr = i10 == true ? 1 : 0;
            int i12 = i10 == true ? 1 : 0;
            while (i12 < length) {
                r<K, V> rVar = rVarArr[i12];
                int i13 = rVar.f116933b;
                AtomicReferenceArray<com.google.common.cache.u<K, V>> atomicReferenceArray = rVar.f116937f;
                int i14 = i10;
                while (i14 < atomicReferenceArray.length()) {
                    com.google.common.cache.u<K, V> uVarW = atomicReferenceArray.get(i14);
                    while (uVarW != null) {
                        r<K, V>[] rVarArr2 = rVarArr;
                        V vX = rVar.x(uVarW, jA);
                        com.google.common.cache.u<K, V> uVar = uVarW;
                        if (vX != null && this.f116833f.d(obj, vX)) {
                            return true;
                        }
                        uVarW = uVar.w();
                        rVarArr = rVarArr2;
                    }
                    i14++;
                }
                j11 += (long) rVar.f116935d;
                i12++;
                i10 = i14;
            }
            boolean z10 = i10;
            r<K, V>[] rVarArr3 = rVarArr;
            if (j11 == j10) {
                return z10;
            }
            i11++;
            j10 = j11;
            i10 = z10 ? 1 : 0;
            rVarArr = rVarArr3;
        }
        Object[] objArr2 = i10 == true ? 1 : 0;
        return i10 == true ? 1 : 0;
    }

    @com.google.common.annotations.e
    com.google.common.cache.u<K, V> d(com.google.common.cache.u<K, V> original, com.google.common.cache.u<K, V> newNext) {
        return P(original.l()).i(original, newNext);
    }

    r<K, V> e(int initialCapacity, long maxSegmentWeight, com.google.common.cache.a.b statsCounter) {
        return new r<>(this, initialCapacity, maxSegmentWeight, statsCounter);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @com.google.common.annotations.c
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.Z;
        if (set != null) {
            return set;
        }
        h hVar = new h();
        this.Z = hVar;
        return hVar;
    }

    boolean f() {
        return this.f116837j != com.google.common.cache.d.f.INSTANCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @z7.a
    @fj.a
    public V get(@fj.a Object key) {
        if (key == null) {
            return null;
        }
        int iT = t(key);
        return P(iT).r(key, iT);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @fj.a
    public V getOrDefault(@fj.a Object key, @fj.a V defaultValue) {
        V v10 = get(key);
        return v10 != null ? v10 : defaultValue;
    }

    boolean h() {
        return this.f116836i >= 0;
    }

    boolean i() {
        if (!k() && !j()) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        r<K, V>[] rVarArr = this.f116830c;
        long j10 = 0;
        for (r<K, V> rVar : rVarArr) {
            if (rVar.f116933b != 0) {
                return false;
            }
            j10 += (long) rVar.f116935d;
        }
        if (j10 == 0) {
            return true;
        }
        for (r<K, V> rVar2 : rVarArr) {
            if (rVar2.f116933b != 0) {
                return false;
            }
            j10 -= (long) rVar2.f116935d;
        }
        return j10 == 0;
    }

    boolean j() {
        if (this.f116838k <= 0) {
            return false;
        }
        int i10 = 4 | 1;
        return true;
    }

    boolean k() {
        return this.f116839l > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.X;
        if (set != null) {
            return set;
        }
        k kVar = new k();
        this.X = kVar;
        return kVar;
    }

    @z7.a
    V l(K key, com.google.common.cache.g<? super K, V> loader) throws ExecutionException {
        int iT = t(com.google.common.base.j0.E(key));
        return P(iT).s(key, iT, loader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    n6<K, V> m(Iterable<? extends K> keys) throws ExecutionException {
        LinkedHashMap linkedHashMapC0 = b8.c0();
        LinkedHashSet linkedHashSetA = z9.A();
        int i10 = 0;
        int i11 = 0;
        for (K k10 : keys) {
            Object obj = get(k10);
            if (!linkedHashMapC0.containsKey(k10)) {
                linkedHashMapC0.put(k10, obj);
                if (obj == null) {
                    i11++;
                    linkedHashSetA.add(k10);
                } else {
                    i10++;
                }
            }
        }
        try {
            if (!linkedHashSetA.isEmpty()) {
                try {
                    Map mapX = x(Collections.unmodifiableSet(linkedHashSetA), this.f116846w);
                    for (Object obj2 : linkedHashSetA) {
                        Object obj3 = mapX.get(obj2);
                        if (obj3 == null) {
                            throw new com.google.common.cache.g.c("loadAll failed to return a value for " + obj2);
                        }
                        linkedHashMapC0.put(obj2, obj3);
                    }
                } catch (com.google.common.cache.g.e unused) {
                    for (Object obj4 : linkedHashSetA) {
                        i11--;
                        linkedHashMapC0.put(obj4, l(obj4, this.f116846w));
                    }
                }
            }
            n6<K, V> n6VarG = n6.g(linkedHashMapC0);
            this.f116845v.a(i10);
            this.f116845v.d(i11);
            return n6VarG;
        } catch (Throwable th2) {
            this.f116845v.a(i10);
            this.f116845v.d(i11);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    n6<K, V> n(Iterable<?> keys) {
        n6.b bVarB = n6.b();
        int i10 = 0;
        int i11 = 0;
        for (Object obj : keys) {
            V v10 = get(obj);
            if (v10 == null) {
                i11++;
            } else {
                bVarB.i(obj, v10);
                i10++;
            }
        }
        this.f116845v.a(i10);
        this.f116845v.d(i11);
        return bVarB.c();
    }

    @fj.a
    com.google.common.cache.u<K, V> o(@fj.a Object key) {
        if (key == null) {
            return null;
        }
        int iT = t(key);
        return P(iT).u(key, iT);
    }

    @fj.a
    public V p(Object key) throws Throwable {
        int iT = t(com.google.common.base.j0.E(key));
        V vR = P(iT).r(key, iT);
        if (vR == null) {
            this.f116845v.d(1);
            return vR;
        }
        this.f116845v.a(1);
        return vR;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @z7.a
    @fj.a
    public V put(K key, V value) {
        com.google.common.base.j0.E(key);
        com.google.common.base.j0.E(value);
        int iT = t(key);
        return P(iT).J(key, iT, value, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> m10) {
        for (Map.Entry<? extends K, ? extends V> entry : m10.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @fj.a
    public V putIfAbsent(K key, V value) {
        com.google.common.base.j0.E(key);
        com.google.common.base.j0.E(value);
        int iT = t(key);
        return P(iT).J(key, iT, value, true);
    }

    @fj.a
    V q(com.google.common.cache.u<K, V> entry, long now) {
        V v10;
        if (entry.getKey() == null || (v10 = entry.k().get()) == null || v(entry, now)) {
            return null;
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @z7.a
    @fj.a
    public V remove(@fj.a Object key) {
        if (key == null) {
            return null;
        }
        int iT = t(key);
        return P(iT).Q(key, iT);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @z7.a
    public boolean replace(K key, @fj.a V oldValue, V newValue) {
        com.google.common.base.j0.E(key);
        com.google.common.base.j0.E(newValue);
        if (oldValue == null) {
            return false;
        }
        int iT = t(key);
        return P(iT).Y(key, iT, oldValue, newValue);
    }

    V s(K key) throws ExecutionException {
        return l(key, this.f116846w);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return com.google.common.primitives.l.A(y());
    }

    int t(@fj.a Object key) {
        return O(this.f116832e.f(key));
    }

    void u(Iterable<?> keys) {
        Iterator<?> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    boolean v(com.google.common.cache.u<K, V> entry, long now) {
        com.google.common.base.j0.E(entry);
        if (!j() || now - entry.z() < this.f116838k) {
            return k() && now - entry.q() >= this.f116839l;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.Y;
        if (collection != null) {
            return collection;
        }
        b0 b0Var = new b0();
        this.Y = b0Var;
        return b0Var;
    }

    @com.google.common.annotations.e
    boolean w(com.google.common.cache.u<K, V> entry, long now) {
        return P(entry.l()).x(entry, now) != null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ce  */
    @fj.a
    Map<K, V> x(Set<? extends K> set, com.google.common.cache.g<? super K, V> gVar) throws Throwable {
        com.google.common.base.j0.E(gVar);
        com.google.common.base.j0.E(set);
        q0 q0VarC = q0.c();
        boolean z10 = true;
        boolean z11 = false;
        try {
            try {
                try {
                    try {
                        try {
                            Map<? super K, V> mapE = gVar.e(set);
                            if (mapE == null) {
                                this.f116845v.e(q0VarC.g(TimeUnit.NANOSECONDS));
                                throw new com.google.common.cache.g.c(gVar + " returned null map from loadAll");
                            }
                            q0VarC.l();
                            for (Map.Entry<K, V> entry : mapE.entrySet()) {
                                K key = entry.getKey();
                                V value = entry.getValue();
                                if (key == null || value == null) {
                                    z11 = true;
                                } else {
                                    put(key, value);
                                }
                            }
                            if (!z11) {
                                this.f116845v.c(q0VarC.g(TimeUnit.NANOSECONDS));
                                return mapE;
                            }
                            this.f116845v.e(q0VarC.g(TimeUnit.NANOSECONDS));
                            throw new com.google.common.cache.g.c(gVar + " returned null keys or values from loadAll");
                        } catch (RuntimeException e10) {
                            throw new d3(e10);
                        }
                    } catch (InterruptedException e11) {
                        Thread.currentThread().interrupt();
                        throw new ExecutionException(e11);
                    }
                } catch (Error e12) {
                    throw new p0(e12);
                }
            } catch (com.google.common.cache.g.e e13) {
                try {
                    throw e13;
                } catch (Throwable th2) {
                    th = th2;
                    if (!z10) {
                        this.f116845v.e(q0VarC.g(TimeUnit.NANOSECONDS));
                    }
                    throw th;
                }
            } catch (Exception e14) {
                throw new ExecutionException(e14);
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
            if (!z10) {
                this.f116845v.e(q0VarC.g(TimeUnit.NANOSECONDS));
            }
            throw th;
        }
    }

    long y() {
        long jMax = 0;
        for (r<K, V> rVar : this.f116830c) {
            jMax += (long) Math.max(0, rVar.f116933b);
        }
        return jMax;
    }

    @com.google.common.annotations.e
    com.google.common.cache.u<K, V> z(K key, int hash, @fj.a com.google.common.cache.u<K, V> next) {
        r<K, V> rVarP = P(hash);
        rVarP.lock();
        try {
            return rVarP.E(key, hash, next);
        } finally {
            rVarP.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @z7.a
    public boolean remove(@fj.a Object key, @fj.a Object value) {
        if (key != null && value != null) {
            int iT = t(key);
            return P(iT).R(key, iT, value);
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @z7.a
    @fj.a
    public V replace(K key, V value) {
        com.google.common.base.j0.E(key);
        com.google.common.base.j0.E(value);
        int iT = t(key);
        return P(iT).X(key, iT, value);
    }
}
