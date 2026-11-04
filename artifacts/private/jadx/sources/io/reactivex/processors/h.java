package io.reactivex.processors;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public final class h<T> extends c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.internal.queue.c<T> f303701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<Runnable> f303702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f303703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile boolean f303704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Throwable f303705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final AtomicReference<v<? super T>> f303706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    volatile boolean f303707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final AtomicBoolean f303708i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final io.reactivex.internal.subscriptions.c<T> f303709j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final AtomicLong f303710k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f303711l;

    final class a extends io.reactivex.internal.subscriptions.c<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f303712c = -4896760517184205454L;

        a() {
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (h.this.f303707h) {
                return;
            }
            h.this.f303707h = true;
            h.this.X8();
            h hVar = h.this;
            if (hVar.f303711l || hVar.f303709j.getAndIncrement() != 0) {
                return;
            }
            h.this.f303701b.clear();
            h.this.f303706g.lazySet(null);
        }

        @Override // ej.o
        public void clear() {
            h.this.f303701b.clear();
        }

        @Override // ej.o
        public boolean isEmpty() {
            return h.this.f303701b.isEmpty();
        }

        @Override // ej.k
        public int p(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            h.this.f303711l = true;
            return 2;
        }

        @Override // ej.o
        @cj.g
        public T poll() {
            return h.this.f303701b.poll();
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (j.p(j10)) {
                io.reactivex.internal.util.d.a(h.this.f303710k, j10);
                h.this.Y8();
            }
        }
    }

    h(int i10) {
        this(i10, null, true);
    }

    @cj.f
    @cj.d
    public static <T> h<T> S8() {
        return new h<>(l.Y());
    }

    @cj.f
    @cj.d
    public static <T> h<T> T8(int i10) {
        return new h<>(i10);
    }

    @cj.f
    @cj.d
    public static <T> h<T> U8(int i10, Runnable runnable) {
        io.reactivex.internal.functions.b.g(runnable, "onTerminate");
        return new h<>(i10, runnable);
    }

    @cj.f
    @cj.d
    public static <T> h<T> V8(int i10, Runnable runnable, boolean z10) {
        io.reactivex.internal.functions.b.g(runnable, "onTerminate");
        return new h<>(i10, runnable, z10);
    }

    @cj.f
    @cj.d
    public static <T> h<T> W8(boolean z10) {
        return new h<>(l.Y(), null, z10);
    }

    @Override // io.reactivex.processors.c
    @cj.g
    public Throwable M8() {
        if (this.f303704e) {
            return this.f303705f;
        }
        return null;
    }

    @Override // io.reactivex.processors.c
    public boolean N8() {
        return this.f303704e && this.f303705f == null;
    }

    @Override // io.reactivex.processors.c
    public boolean O8() {
        return this.f303706g.get() != null;
    }

    @Override // io.reactivex.processors.c
    public boolean P8() {
        return this.f303704e && this.f303705f != null;
    }

    boolean R8(boolean z10, boolean z11, boolean z12, v<? super T> vVar, io.reactivex.internal.queue.c<T> cVar) {
        if (this.f303707h) {
            cVar.clear();
            this.f303706g.lazySet(null);
            return true;
        }
        if (z11) {
            if (z10 && this.f303705f != null) {
                cVar.clear();
                this.f303706g.lazySet(null);
                vVar.onError(this.f303705f);
                return true;
            }
            if (z12) {
                Throwable th2 = this.f303705f;
                this.f303706g.lazySet(null);
                if (th2 != null) {
                    vVar.onError(th2);
                } else {
                    vVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    void X8() {
        Runnable andSet = this.f303702c.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    void Y8() {
        if (this.f303709j.getAndIncrement() != 0) {
            return;
        }
        v<? super T> vVar = this.f303706g.get();
        int iAddAndGet = 1;
        while (vVar == null) {
            iAddAndGet = this.f303709j.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                vVar = this.f303706g.get();
            }
        }
        if (this.f303711l) {
            Z8(vVar);
        } else {
            a9(vVar);
        }
    }

    void Z8(v<? super T> vVar) {
        io.reactivex.internal.queue.c<T> cVar = this.f303701b;
        boolean z10 = this.f303703d;
        int iAddAndGet = 1;
        while (!this.f303707h) {
            boolean z11 = this.f303704e;
            if (!z10 && z11 && this.f303705f != null) {
                cVar.clear();
                this.f303706g.lazySet(null);
                vVar.onError(this.f303705f);
                return;
            }
            vVar.onNext(null);
            if (z11) {
                this.f303706g.lazySet(null);
                Throwable th2 = this.f303705f;
                if (th2 != null) {
                    vVar.onError(th2);
                    return;
                } else {
                    vVar.onComplete();
                    return;
                }
            }
            iAddAndGet = this.f303709j.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        cVar.clear();
        this.f303706g.lazySet(null);
    }

    void a9(v<? super T> vVar) {
        io.reactivex.internal.queue.c<T> cVar = this.f303701b;
        boolean z10 = !this.f303703d;
        int iAddAndGet = 1;
        do {
            long j10 = this.f303710k.get();
            long j11 = 0;
            while (j10 != j11) {
                boolean z11 = this.f303704e;
                T tPoll = cVar.poll();
                boolean z12 = tPoll == null;
                if (R8(z10, z11, z12, vVar, cVar)) {
                    return;
                }
                if (z12) {
                    break;
                }
                vVar.onNext(tPoll);
                j11++;
            }
            if (j10 == j11 && R8(z10, this.f303704e, cVar.isEmpty(), vVar, cVar)) {
                return;
            }
            if (j11 != 0 && j10 != Long.MAX_VALUE) {
                this.f303710k.addAndGet(-j11);
            }
            iAddAndGet = this.f303709j.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // io.reactivex.l
    protected void k6(v<? super T> vVar) {
        if (this.f303708i.get() || !this.f303708i.compareAndSet(false, true)) {
            io.reactivex.internal.subscriptions.g.c(new IllegalStateException("This processor allows only a single Subscriber"), vVar);
            return;
        }
        vVar.l(this.f303709j);
        this.f303706g.set(vVar);
        if (this.f303707h) {
            this.f303706g.lazySet(null);
        } else {
            Y8();
        }
    }

    @Override // org.reactivestreams.v
    public void l(w wVar) {
        if (this.f303704e || this.f303707h) {
            wVar.cancel();
        } else {
            wVar.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        if (this.f303704e || this.f303707h) {
            return;
        }
        this.f303704e = true;
        X8();
        Y8();
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f303704e || this.f303707h) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f303705f = th2;
        this.f303704e = true;
        X8();
        Y8();
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        io.reactivex.internal.functions.b.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f303704e || this.f303707h) {
            return;
        }
        this.f303701b.offer(t10);
        Y8();
    }

    h(int i10, Runnable runnable) {
        this(i10, runnable, true);
    }

    h(int i10, Runnable runnable, boolean z10) {
        this.f303701b = new io.reactivex.internal.queue.c<>(io.reactivex.internal.functions.b.h(i10, "capacityHint"));
        this.f303702c = new AtomicReference<>(runnable);
        this.f303703d = z10;
        this.f303706g = new AtomicReference<>();
        this.f303708i = new AtomicBoolean();
        this.f303709j = new a();
        this.f303710k = new AtomicLong();
    }
}
