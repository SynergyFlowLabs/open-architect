package io.reactivex.internal.operators.maybe;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public final class x0<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.y<? extends T>[] f301004b;

    static final class a<T> extends ConcurrentLinkedQueue<T> implements d<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f301005c = -4025173261791142821L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f301006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicInteger f301007b = new AtomicInteger();

        a() {
        }

        @Override // io.reactivex.internal.operators.maybe.x0.d
        public void n() {
            poll();
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, ej.o
        public boolean offer(T t10) {
            this.f301007b.getAndIncrement();
            return super.offer(t10);
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.operators.maybe.x0.d, ej.o
        @cj.g
        public T poll() {
            T t10 = (T) super.poll();
            if (t10 != null) {
                this.f301006a++;
            }
            return t10;
        }

        @Override // ej.o
        public boolean r(T t10, T t11) {
            throw new UnsupportedOperationException();
        }

        @Override // io.reactivex.internal.operators.maybe.x0.d
        public int s() {
            return this.f301006a;
        }

        @Override // io.reactivex.internal.operators.maybe.x0.d
        public int t() {
            return this.f301007b.get();
        }
    }

    static final class b<T> extends io.reactivex.internal.subscriptions.c<T> implements io.reactivex.v<T> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f301008k = -660395290758764731L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f301009b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final d<Object> f301012e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f301014g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f301015h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f301016i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        long f301017j;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.disposables.b f301010c = new io.reactivex.disposables.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f301011d = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.util.c f301013f = new io.reactivex.internal.util.c();

        b(org.reactivestreams.v<? super T> vVar, int i10, d<Object> dVar) {
            this.f301009b = vVar;
            this.f301014g = i10;
            this.f301012e = dVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f301012e.offer(t10);
            c();
        }

        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f301016i) {
                f();
            } else {
                g();
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (!this.f301015h) {
                this.f301015h = true;
                this.f301010c.dispose();
                if (getAndIncrement() == 0) {
                    this.f301012e.clear();
                }
            }
        }

        @Override // ej.o
        public void clear() {
            this.f301012e.clear();
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            this.f301010c.c(cVar);
        }

        void f() {
            org.reactivestreams.v<? super T> vVar = this.f301009b;
            d<Object> dVar = this.f301012e;
            int iAddAndGet = 1;
            while (!this.f301015h) {
                Throwable th2 = this.f301013f.get();
                if (th2 != null) {
                    dVar.clear();
                    vVar.onError(th2);
                    return;
                }
                boolean z10 = dVar.t() == this.f301014g;
                if (!dVar.isEmpty()) {
                    vVar.onNext(null);
                }
                if (z10) {
                    vVar.onComplete();
                    return;
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            dVar.clear();
        }

        void g() {
            org.reactivestreams.v<? super T> vVar = this.f301009b;
            d<Object> dVar = this.f301012e;
            long j10 = this.f301017j;
            int iAddAndGet = 1;
            do {
                long j11 = this.f301011d.get();
                while (j10 != j11) {
                    if (this.f301015h) {
                        dVar.clear();
                        return;
                    }
                    if (this.f301013f.get() != null) {
                        dVar.clear();
                        vVar.onError(this.f301013f.c());
                        return;
                    } else {
                        if (dVar.s() == this.f301014g) {
                            vVar.onComplete();
                            return;
                        }
                        Object objPoll = dVar.poll();
                        if (objPoll == null) {
                            break;
                        } else if (objPoll != io.reactivex.internal.util.q.COMPLETE) {
                            vVar.onNext(objPoll);
                            j10++;
                        }
                    }
                }
                if (j10 == j11) {
                    if (this.f301013f.get() != null) {
                        dVar.clear();
                        vVar.onError(this.f301013f.c());
                        return;
                    } else {
                        while (dVar.peek() == io.reactivex.internal.util.q.COMPLETE) {
                            dVar.n();
                        }
                        if (dVar.s() == this.f301014g) {
                            vVar.onComplete();
                            return;
                        }
                    }
                }
                this.f301017j = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        boolean h() {
            return this.f301015h;
        }

        @Override // ej.o
        public boolean isEmpty() {
            return this.f301012e.isEmpty();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f301012e.offer(io.reactivex.internal.util.q.COMPLETE);
            c();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            if (!this.f301013f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f301010c.dispose();
            this.f301012e.offer(io.reactivex.internal.util.q.COMPLETE);
            c();
        }

        @Override // ej.k
        public int p(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f301016i = true;
            return 2;
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            T t10;
            do {
                t10 = (T) this.f301012e.poll();
            } while (t10 == io.reactivex.internal.util.q.COMPLETE);
            return t10;
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f301011d, j10);
                c();
            }
        }
    }

    static final class c<T> extends AtomicReferenceArray<T> implements d<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f301018c = -7969063454040569579L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicInteger f301019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f301020b;

        c(int i10) {
            super(i10);
            this.f301019a = new AtomicInteger();
        }

        @Override // ej.o
        public void clear() {
            while (poll() != null && !isEmpty()) {
            }
        }

        @Override // ej.o
        public boolean isEmpty() {
            return this.f301020b == t();
        }

        @Override // io.reactivex.internal.operators.maybe.x0.d
        public void n() {
            int i10 = this.f301020b;
            lazySet(i10, null);
            this.f301020b = i10 + 1;
        }

        @Override // ej.o
        public boolean offer(T t10) {
            io.reactivex.internal.functions.b.g(t10, "value is null");
            int andIncrement = this.f301019a.getAndIncrement();
            if (andIncrement >= length()) {
                return false;
            }
            lazySet(andIncrement, t10);
            return true;
        }

        @Override // io.reactivex.internal.operators.maybe.x0.d
        public T peek() {
            int i10 = this.f301020b;
            if (i10 != length()) {
                return get(i10);
            }
            int i11 = 5 & 0;
            return null;
        }

        @Override // io.reactivex.internal.operators.maybe.x0.d, java.util.Queue, ej.o
        @cj.g
        public T poll() {
            int i10 = this.f301020b;
            if (i10 == length()) {
                return null;
            }
            AtomicInteger atomicInteger = this.f301019a;
            do {
                T t10 = get(i10);
                if (t10 != null) {
                    this.f301020b = i10 + 1;
                    lazySet(i10, null);
                    return t10;
                }
            } while (atomicInteger.get() != i10);
            return null;
        }

        @Override // ej.o
        public boolean r(T t10, T t11) {
            throw new UnsupportedOperationException();
        }

        @Override // io.reactivex.internal.operators.maybe.x0.d
        public int s() {
            return this.f301020b;
        }

        @Override // io.reactivex.internal.operators.maybe.x0.d
        public int t() {
            return this.f301019a.get();
        }
    }

    interface d<T> extends ej.o<T> {
        void n();

        T peek();

        @Override // java.util.Queue, io.reactivex.internal.operators.maybe.x0.d, ej.o
        @cj.g
        T poll();

        int s();

        int t();
    }

    public x0(io.reactivex.y<? extends T>[] yVarArr) {
        this.f301004b = yVarArr;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        io.reactivex.y[] yVarArr = this.f301004b;
        int length = yVarArr.length;
        b bVar = new b(vVar, length, length <= io.reactivex.l.Y() ? new c(length) : new a());
        vVar.l(bVar);
        io.reactivex.internal.util.c cVar = bVar.f301013f;
        for (io.reactivex.y yVar : yVarArr) {
            if (bVar.h() || cVar.get() != null) {
                return;
            }
            yVar.a(bVar);
        }
    }
}
