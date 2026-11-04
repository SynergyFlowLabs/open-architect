package io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class n1<T, K, V> extends io.reactivex.internal.operators.flowable.a<T, io.reactivex.flowables.b<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends K> f299844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.o<? super T, ? extends V> f299845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f299846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f299847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final dj.o<? super dj.g<Object>, ? extends Map<K, Object>> f299848g;

    static final class a<K, V> implements dj.g<c<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Queue<c<K, V>> f299849a;

        a(Queue<c<K, V>> queue) {
            this.f299849a = queue;
        }

        @Override // dj.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(c<K, V> cVar) {
            this.f299849a.offer(cVar);
        }
    }

    public static final class b<T, K, V> extends io.reactivex.internal.subscriptions.c<io.reactivex.flowables.b<K, V>> implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final long f299850v = -3688291656102519502L;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        static final Object f299851w = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.v<? super io.reactivex.flowables.b<K, V>> f299852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.o<? super T, ? extends K> f299853c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final dj.o<? super T, ? extends V> f299854d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f299855e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f299856f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Map<Object, c<K, V>> f299857g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final io.reactivex.internal.queue.c<io.reactivex.flowables.b<K, V>> f299858h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final Queue<c<K, V>> f299859i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        org.reactivestreams.w f299860j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicBoolean f299861k = new AtomicBoolean();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final AtomicLong f299862l = new AtomicLong();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final AtomicInteger f299863m = new AtomicInteger(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Throwable f299864n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        volatile boolean f299865o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f299866s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f299867t;

        public b(org.reactivestreams.v<? super io.reactivex.flowables.b<K, V>> vVar, dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2, int i10, boolean z10, Map<Object, c<K, V>> map, Queue<c<K, V>> queue) {
            this.f299852b = vVar;
            this.f299853c = oVar;
            this.f299854d = oVar2;
            this.f299855e = i10;
            this.f299856f = z10;
            this.f299857g = map;
            this.f299859i = queue;
            this.f299858h = new io.reactivex.internal.queue.c<>(i10);
        }

        private void h() {
            if (this.f299859i != null) {
                int i10 = 0;
                while (true) {
                    c<K, V> cVarPoll = this.f299859i.poll();
                    if (cVarPoll == null) {
                        break;
                    }
                    cVarPoll.onComplete();
                    i10++;
                }
                if (i10 != 0) {
                    this.f299863m.addAndGet(-i10);
                }
            }
        }

        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f299867t) {
                i();
            } else {
                j();
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f299861k.compareAndSet(false, true)) {
                h();
                if (this.f299863m.decrementAndGet() == 0) {
                    this.f299860j.cancel();
                }
            }
        }

        @Override // ej.o
        public void clear() {
            this.f299858h.clear();
        }

        public void f(K k10) {
            if (k10 == null) {
                k10 = (K) f299851w;
            }
            this.f299857g.remove(k10);
            if (this.f299863m.decrementAndGet() == 0) {
                this.f299860j.cancel();
                if (getAndIncrement() == 0) {
                    this.f299858h.clear();
                }
            }
        }

        boolean g(boolean z10, boolean z11, org.reactivestreams.v<?> vVar, io.reactivex.internal.queue.c<?> cVar) {
            if (this.f299861k.get()) {
                cVar.clear();
                return true;
            }
            if (this.f299856f) {
                if (z10 && z11) {
                    Throwable th2 = this.f299864n;
                    if (th2 != null) {
                        vVar.onError(th2);
                    } else {
                        vVar.onComplete();
                    }
                    return true;
                }
            } else if (z10) {
                Throwable th3 = this.f299864n;
                if (th3 != null) {
                    cVar.clear();
                    vVar.onError(th3);
                    return true;
                }
                if (z11) {
                    vVar.onComplete();
                    return true;
                }
            }
            return false;
        }

        void i() {
            Throwable th2;
            io.reactivex.internal.queue.c<io.reactivex.flowables.b<K, V>> cVar = this.f299858h;
            org.reactivestreams.v<? super io.reactivex.flowables.b<K, V>> vVar = this.f299852b;
            int iAddAndGet = 1;
            while (!this.f299861k.get()) {
                boolean z10 = this.f299865o;
                if (z10 && !this.f299856f && (th2 = this.f299864n) != null) {
                    cVar.clear();
                    vVar.onError(th2);
                    return;
                }
                vVar.onNext(null);
                if (z10) {
                    Throwable th3 = this.f299864n;
                    if (th3 != null) {
                        vVar.onError(th3);
                        return;
                    } else {
                        vVar.onComplete();
                        return;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            cVar.clear();
        }

        @Override // ej.o
        public boolean isEmpty() {
            return this.f299858h.isEmpty();
        }

        void j() {
            io.reactivex.internal.queue.c<io.reactivex.flowables.b<K, V>> cVar = this.f299858h;
            org.reactivestreams.v<? super io.reactivex.flowables.b<K, V>> vVar = this.f299852b;
            int iAddAndGet = 1;
            loop0: do {
                long j10 = this.f299862l.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z10 = this.f299865o;
                    io.reactivex.flowables.b<K, V> bVarPoll = cVar.poll();
                    boolean z11 = bVarPoll == null;
                    if (g(z10, z11, vVar, cVar)) {
                        break loop0;
                    }
                    if (z11) {
                        break;
                    }
                    vVar.onNext(bVarPoll);
                    j11++;
                }
                if (j11 == j10 && g(this.f299865o, cVar.isEmpty(), vVar, cVar)) {
                    break;
                }
                if (j11 != 0) {
                    if (j10 != Long.MAX_VALUE) {
                        this.f299862l.addAndGet(-j11);
                    }
                    this.f299860j.request(j11);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // ej.o
        @cj.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public io.reactivex.flowables.b<K, V> poll() {
            return this.f299858h.poll();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299860j, wVar)) {
                this.f299860j = wVar;
                this.f299852b.l(this);
                wVar.request(this.f299855e);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299866s) {
                return;
            }
            Iterator<c<K, V>> it = this.f299857g.values().iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.f299857g.clear();
            Queue<c<K, V>> queue = this.f299859i;
            if (queue != null) {
                queue.clear();
            }
            this.f299866s = true;
            this.f299865o = true;
            c();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299866s) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f299866s = true;
            Iterator<c<K, V>> it = this.f299857g.values().iterator();
            while (it.hasNext()) {
                it.next().onError(th2);
            }
            this.f299857g.clear();
            Queue<c<K, V>> queue = this.f299859i;
            if (queue != null) {
                queue.clear();
            }
            this.f299864n = th2;
            this.f299865o = true;
            c();
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
        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            boolean z10;
            c cVar;
            if (this.f299866s) {
                return;
            }
            io.reactivex.internal.queue.c<io.reactivex.flowables.b<K, V>> cVar2 = this.f299858h;
            try {
                K kApply = this.f299853c.apply(t10);
                Object obj = kApply != null ? kApply : f299851w;
                c<K, V> cVar3 = this.f299857g.get(obj);
                if (cVar3 != null) {
                    z10 = false;
                    cVar = cVar3;
                } else {
                    if (this.f299861k.get()) {
                        return;
                    }
                    c cVarN8 = c.N8(kApply, this.f299855e, this, this.f299856f);
                    this.f299857g.put(obj, cVarN8);
                    this.f299863m.getAndIncrement();
                    z10 = true;
                    cVar = cVarN8;
                }
                try {
                    cVar.onNext(io.reactivex.internal.functions.b.g(this.f299854d.apply(t10), "The valueSelector returned null"));
                    h();
                    if (z10) {
                        cVar2.offer(cVar);
                        c();
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f299860j.cancel();
                    onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f299860j.cancel();
                onError(th3);
            }
        }

        @Override // ej.k
        public int p(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f299867t = true;
            return 2;
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f299862l, j10);
                c();
            }
        }
    }

    static final class c<K, T> extends io.reactivex.flowables.b<K, T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final d<T, K> f299868c;

        protected c(K k10, d<T, K> dVar) {
            super(k10);
            this.f299868c = dVar;
        }

        public static <T, K> c<K, T> N8(K k10, int i10, b<?, K, T> bVar, boolean z10) {
            return new c<>(k10, new d(i10, bVar, k10, z10));
        }

        @Override // io.reactivex.l
        protected void k6(org.reactivestreams.v<? super T> vVar) {
            this.f299868c.e(vVar);
        }

        public void onComplete() {
            this.f299868c.onComplete();
        }

        public void onError(Throwable th2) {
            this.f299868c.onError(th2);
        }

        public void onNext(T t10) {
            this.f299868c.onNext(t10);
        }
    }

    static final class d<T, K> extends io.reactivex.internal.subscriptions.c<T> implements org.reactivestreams.u<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final long f299869n = -3852313036005250360L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final K f299870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.queue.c<T> f299871c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final b<?, K, T> f299872d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f299873e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f299875g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Throwable f299876h;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f299880l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f299881m;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f299874f = new AtomicLong();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicBoolean f299877i = new AtomicBoolean();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.v<? super T>> f299878j = new AtomicReference<>();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicBoolean f299879k = new AtomicBoolean();

        d(int i10, b<?, K, T> bVar, K k10, boolean z10) {
            this.f299871c = new io.reactivex.internal.queue.c<>(i10);
            this.f299872d = bVar;
            this.f299870b = k10;
            this.f299873e = z10;
        }

        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f299880l) {
                g();
            } else {
                h();
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f299877i.compareAndSet(false, true)) {
                this.f299872d.f(this.f299870b);
            }
        }

        @Override // ej.o
        public void clear() {
            this.f299871c.clear();
        }

        @Override // org.reactivestreams.u
        public void e(org.reactivestreams.v<? super T> vVar) {
            if (!this.f299879k.compareAndSet(false, true)) {
                io.reactivex.internal.subscriptions.g.c(new IllegalStateException("Only one Subscriber allowed!"), vVar);
                return;
            }
            vVar.l(this);
            this.f299878j.lazySet(vVar);
            c();
        }

        boolean f(boolean z10, boolean z11, org.reactivestreams.v<? super T> vVar, boolean z12) {
            if (this.f299877i.get()) {
                this.f299871c.clear();
                return true;
            }
            if (z10) {
                if (!z12) {
                    Throwable th2 = this.f299876h;
                    if (th2 != null) {
                        this.f299871c.clear();
                        vVar.onError(th2);
                        return true;
                    }
                    if (z11) {
                        vVar.onComplete();
                        return true;
                    }
                } else if (z11) {
                    Throwable th3 = this.f299876h;
                    if (th3 != null) {
                        vVar.onError(th3);
                    } else {
                        vVar.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }

        void g() {
            Throwable th2;
            io.reactivex.internal.queue.c<T> cVar = this.f299871c;
            org.reactivestreams.v<? super T> vVar = this.f299878j.get();
            int iAddAndGet = 1;
            while (true) {
                if (vVar != null) {
                    if (this.f299877i.get()) {
                        cVar.clear();
                        return;
                    }
                    boolean z10 = this.f299875g;
                    if (z10 && !this.f299873e && (th2 = this.f299876h) != null) {
                        cVar.clear();
                        vVar.onError(th2);
                        return;
                    }
                    vVar.onNext(null);
                    if (z10) {
                        Throwable th3 = this.f299876h;
                        if (th3 != null) {
                            vVar.onError(th3);
                            return;
                        } else {
                            vVar.onComplete();
                            return;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (vVar == null) {
                    vVar = this.f299878j.get();
                }
            }
        }

        void h() {
            io.reactivex.internal.queue.c<T> cVar = this.f299871c;
            boolean z10 = this.f299873e;
            org.reactivestreams.v<? super T> vVar = this.f299878j.get();
            int iAddAndGet = 1;
            while (true) {
                if (vVar != null) {
                    long j10 = this.f299874f.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        boolean z11 = this.f299875g;
                        T tPoll = cVar.poll();
                        boolean z12 = tPoll == null;
                        if (f(z11, z12, vVar, z10)) {
                            return;
                        }
                        if (z12) {
                            break;
                        }
                        vVar.onNext(tPoll);
                        j11++;
                    }
                    if (j11 == j10 && f(this.f299875g, cVar.isEmpty(), vVar, z10)) {
                        return;
                    }
                    if (j11 != 0) {
                        if (j10 != Long.MAX_VALUE) {
                            this.f299874f.addAndGet(-j11);
                        }
                        this.f299872d.f299860j.request(j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (vVar == null) {
                    vVar = this.f299878j.get();
                }
            }
        }

        @Override // ej.o
        public boolean isEmpty() {
            return this.f299871c.isEmpty();
        }

        public void onComplete() {
            this.f299875g = true;
            c();
        }

        public void onError(Throwable th2) {
            this.f299876h = th2;
            this.f299875g = true;
            c();
        }

        public void onNext(T t10) {
            this.f299871c.offer(t10);
            c();
        }

        @Override // ej.k
        public int p(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f299880l = true;
            return 2;
        }

        @Override // ej.o
        @cj.g
        public T poll() {
            T tPoll = this.f299871c.poll();
            if (tPoll != null) {
                this.f299881m++;
                return tPoll;
            }
            int i10 = this.f299881m;
            if (i10 == 0) {
                return null;
            }
            this.f299881m = 0;
            this.f299872d.f299860j.request(i10);
            return null;
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f299874f, j10);
                c();
            }
        }
    }

    public n1(io.reactivex.l<T> lVar, dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2, int i10, boolean z10, dj.o<? super dj.g<Object>, ? extends Map<K, Object>> oVar3) {
        super(lVar);
        this.f299844c = oVar;
        this.f299845d = oVar2;
        this.f299846e = i10;
        this.f299847f = z10;
        this.f299848g = oVar3;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super io.reactivex.flowables.b<K, V>> vVar) {
        Exception exc;
        Map<K, Object> concurrentHashMap;
        ConcurrentLinkedQueue concurrentLinkedQueue;
        try {
            if (this.f299848g == null) {
                try {
                    concurrentHashMap = new ConcurrentHashMap<>();
                    concurrentLinkedQueue = null;
                } catch (Exception e10) {
                    exc = e10;
                    io.reactivex.exceptions.b.b(exc);
                    vVar.l(io.reactivex.internal.util.h.INSTANCE);
                    vVar.onError(exc);
                    return;
                }
            } else {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                concurrentHashMap = this.f299848g.apply(new a(concurrentLinkedQueue));
            }
            this.f299043b.j6(new b(vVar, this.f299844c, this.f299845d, this.f299846e, this.f299847f, concurrentHashMap, concurrentLinkedQueue));
        } catch (Exception e11) {
            exc = e11;
        }
    }
}
