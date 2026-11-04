package io.reactivex.internal.operators.flowable;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class s4<T> extends io.reactivex.internal.operators.flowable.a<T, io.reactivex.l<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f300170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f300171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f300172e;

    static final class a<T> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w, Runnable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f300173h = -2365647875069161133L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super io.reactivex.l<T>> f300174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f300175b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicBoolean f300176c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f300177d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f300178e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        org.reactivestreams.w f300179f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.processors.h<T> f300180g;

        a(org.reactivestreams.v<? super io.reactivex.l<T>> vVar, long j10, int i10) {
            super(1);
            this.f300174a = vVar;
            this.f300175b = j10;
            this.f300176c = new AtomicBoolean();
            this.f300177d = i10;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f300176c.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300179f, wVar)) {
                this.f300179f = wVar;
                this.f300174a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            io.reactivex.processors.h<T> hVar = this.f300180g;
            if (hVar != null) {
                this.f300180g = null;
                hVar.onComplete();
            }
            this.f300174a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            io.reactivex.processors.h<T> hVar = this.f300180g;
            if (hVar != null) {
                this.f300180g = null;
                hVar.onError(th2);
            }
            this.f300174a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            long j10 = this.f300178e;
            io.reactivex.processors.h<T> hVarU8 = this.f300180g;
            if (j10 == 0) {
                getAndIncrement();
                hVarU8 = io.reactivex.processors.h.U8(this.f300177d, this);
                this.f300180g = hVarU8;
                this.f300174a.onNext(hVarU8);
            }
            long j11 = j10 + 1;
            hVarU8.onNext(t10);
            if (j11 != this.f300175b) {
                this.f300178e = j11;
                return;
            }
            this.f300178e = 0L;
            this.f300180g = null;
            hVarU8.onComplete();
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                this.f300179f.request(io.reactivex.internal.util.d.d(this.f300175b, j10));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.f300179f.cancel();
            }
        }
    }

    static final class b<T> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w, Runnable {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final long f300181t = 2428527070996323976L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super io.reactivex.l<T>> f300182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.queue.c<io.reactivex.processors.h<T>> f300183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f300184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f300185d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final ArrayDeque<io.reactivex.processors.h<T>> f300186e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicBoolean f300187f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicBoolean f300188g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicLong f300189h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicInteger f300190i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final int f300191j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        long f300192k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        long f300193l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        org.reactivestreams.w f300194m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        volatile boolean f300195n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Throwable f300196o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        volatile boolean f300197s;

        b(org.reactivestreams.v<? super io.reactivex.l<T>> vVar, long j10, long j11, int i10) {
            super(1);
            this.f300182a = vVar;
            this.f300184c = j10;
            this.f300185d = j11;
            this.f300183b = new io.reactivex.internal.queue.c<>(i10);
            this.f300186e = new ArrayDeque<>();
            this.f300187f = new AtomicBoolean();
            this.f300188g = new AtomicBoolean();
            this.f300189h = new AtomicLong();
            this.f300190i = new AtomicInteger();
            this.f300191j = i10;
        }

        boolean a(boolean z10, boolean z11, org.reactivestreams.v<?> vVar, io.reactivex.internal.queue.c<?> cVar) {
            if (this.f300197s) {
                cVar.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.f300196o;
            if (th2 != null) {
                cVar.clear();
                vVar.onError(th2);
                return true;
            }
            if (!z11) {
                return false;
            }
            vVar.onComplete();
            return true;
        }

        void b() {
            if (this.f300190i.getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.v<? super io.reactivex.l<T>> vVar = this.f300182a;
            io.reactivex.internal.queue.c<io.reactivex.processors.h<T>> cVar = this.f300183b;
            int i10 = 4 ^ 1;
            int iAddAndGet = 1;
            do {
                long j10 = this.f300189h.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z10 = this.f300195n;
                    io.reactivex.processors.h<T> hVarPoll = cVar.poll();
                    boolean z11 = hVarPoll == null;
                    if (a(z10, z11, vVar, cVar)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    vVar.onNext(hVarPoll);
                    j11++;
                }
                if (j11 == j10 && a(this.f300195n, cVar.isEmpty(), vVar, cVar)) {
                    return;
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f300189h.addAndGet(-j11);
                }
                iAddAndGet = this.f300190i.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f300197s = true;
            if (this.f300187f.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300194m, wVar)) {
                this.f300194m = wVar;
                this.f300182a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f300195n) {
                return;
            }
            Iterator<io.reactivex.processors.h<T>> it = this.f300186e.iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.f300186e.clear();
            this.f300195n = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300195n) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            Iterator<io.reactivex.processors.h<T>> it = this.f300186e.iterator();
            while (it.hasNext()) {
                it.next().onError(th2);
            }
            this.f300186e.clear();
            this.f300196o = th2;
            this.f300195n = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f300195n) {
                return;
            }
            long j10 = this.f300192k;
            if (j10 == 0 && !this.f300197s) {
                getAndIncrement();
                io.reactivex.processors.h<T> hVarU8 = io.reactivex.processors.h.U8(this.f300191j, this);
                this.f300186e.offer(hVarU8);
                this.f300183b.offer(hVarU8);
                b();
            }
            long j11 = j10 + 1;
            Iterator<io.reactivex.processors.h<T>> it = this.f300186e.iterator();
            while (it.hasNext()) {
                it.next().onNext(t10);
            }
            long j12 = this.f300193l + 1;
            if (j12 == this.f300184c) {
                this.f300193l = j12 - this.f300185d;
                io.reactivex.processors.h<T> hVarPoll = this.f300186e.poll();
                if (hVarPoll != null) {
                    hVarPoll.onComplete();
                }
            } else {
                this.f300193l = j12;
            }
            if (j11 == this.f300185d) {
                this.f300192k = 0L;
            } else {
                this.f300192k = j11;
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f300189h, j10);
                if (this.f300188g.get() || !this.f300188g.compareAndSet(false, true)) {
                    this.f300194m.request(io.reactivex.internal.util.d.d(this.f300185d, j10));
                } else {
                    this.f300194m.request(io.reactivex.internal.util.d.c(this.f300184c, io.reactivex.internal.util.d.d(this.f300185d, j10 - 1)));
                }
                b();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.f300194m.cancel();
            }
        }
    }

    static final class c<T> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w, Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f300198j = -8792836352386833856L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super io.reactivex.l<T>> f300199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f300200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f300201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicBoolean f300202d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicBoolean f300203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f300204f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f300205g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        org.reactivestreams.w f300206h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.reactivex.processors.h<T> f300207i;

        c(org.reactivestreams.v<? super io.reactivex.l<T>> vVar, long j10, long j11, int i10) {
            super(1);
            this.f300199a = vVar;
            this.f300200b = j10;
            this.f300201c = j11;
            this.f300202d = new AtomicBoolean();
            this.f300203e = new AtomicBoolean();
            this.f300204f = i10;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f300202d.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300206h, wVar)) {
                this.f300206h = wVar;
                this.f300199a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            io.reactivex.processors.h<T> hVar = this.f300207i;
            if (hVar != null) {
                this.f300207i = null;
                hVar.onComplete();
            }
            this.f300199a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            io.reactivex.processors.h<T> hVar = this.f300207i;
            if (hVar != null) {
                this.f300207i = null;
                hVar.onError(th2);
            }
            this.f300199a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            long j10 = this.f300205g;
            io.reactivex.processors.h<T> hVarU8 = this.f300207i;
            if (j10 == 0) {
                getAndIncrement();
                hVarU8 = io.reactivex.processors.h.U8(this.f300204f, this);
                this.f300207i = hVarU8;
                this.f300199a.onNext(hVarU8);
            }
            long j11 = j10 + 1;
            if (hVarU8 != null) {
                hVarU8.onNext(t10);
            }
            if (j11 == this.f300200b) {
                this.f300207i = null;
                hVarU8.onComplete();
            }
            if (j11 == this.f300201c) {
                this.f300205g = 0L;
            } else {
                this.f300205g = j11;
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                if (this.f300203e.get() || !this.f300203e.compareAndSet(false, true)) {
                    this.f300206h.request(io.reactivex.internal.util.d.d(this.f300201c, j10));
                } else {
                    this.f300206h.request(io.reactivex.internal.util.d.c(io.reactivex.internal.util.d.d(this.f300200b, j10), io.reactivex.internal.util.d.d(this.f300201c - this.f300200b, j10 - 1)));
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.f300206h.cancel();
            }
        }
    }

    public s4(io.reactivex.l<T> lVar, long j10, long j11, int i10) {
        super(lVar);
        this.f300170c = j10;
        this.f300171d = j11;
        this.f300172e = i10;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super io.reactivex.l<T>> vVar) {
        long j10 = this.f300171d;
        long j11 = this.f300170c;
        if (j10 == j11) {
            this.f299043b.j6(new a(vVar, this.f300170c, this.f300172e));
        } else if (j10 > j11) {
            this.f299043b.j6(new c(vVar, this.f300170c, this.f300171d, this.f300172e));
        } else {
            this.f299043b.j6(new b(vVar, this.f300170c, this.f300171d, this.f300172e));
        }
    }
}
