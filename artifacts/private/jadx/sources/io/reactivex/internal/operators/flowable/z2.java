package io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class z2<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.flowables.a<T> f300605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f300606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f300607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f300608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.j0 f300609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    a f300610g;

    static final class a extends AtomicReference<io.reactivex.disposables.c> implements Runnable, dj.g<io.reactivex.disposables.c> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f300611f = -4552101107598366241L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final z2<?> f300612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f300613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f300614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f300615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f300616e;

        a(z2<?> z2Var) {
            this.f300612a = z2Var;
        }

        @Override // dj.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(io.reactivex.disposables.c cVar) throws Exception {
            io.reactivex.internal.disposables.d.d(this, cVar);
            synchronized (this.f300612a) {
                try {
                    if (this.f300616e) {
                        ((io.reactivex.internal.disposables.g) this.f300612a.f300605b).b(cVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f300612a.O8(this);
        }
    }

    static final class b<T> extends AtomicBoolean implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f300617e = -7419642935409022375L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final z2<T> f300619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final a f300620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.w f300621d;

        b(org.reactivestreams.v<? super T> vVar, z2<T> z2Var, a aVar) {
            this.f300618a = vVar;
            this.f300619b = z2Var;
            this.f300620c = aVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f300621d.cancel();
            if (compareAndSet(false, true)) {
                this.f300619b.M8(this.f300620c);
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300621d, wVar)) {
                this.f300621d = wVar;
                this.f300618a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f300619b.N8(this.f300620c);
                this.f300618a.onComplete();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300619b.N8(this.f300620c);
                this.f300618a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f300618a.onNext(t10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f300621d.request(j10);
        }
    }

    public z2(io.reactivex.flowables.a<T> aVar) {
        this(aVar, 1, 0L, TimeUnit.NANOSECONDS, io.reactivex.schedulers.b.i());
    }

    void M8(a aVar) {
        synchronized (this) {
            try {
                a aVar2 = this.f300610g;
                if (aVar2 != null && aVar2 == aVar) {
                    long j10 = aVar.f300614c - 1;
                    aVar.f300614c = j10;
                    if (j10 == 0 && aVar.f300615d) {
                        if (this.f300607d == 0) {
                            O8(aVar);
                            return;
                        }
                        io.reactivex.internal.disposables.h hVar = new io.reactivex.internal.disposables.h();
                        aVar.f300613b = hVar;
                        hVar.a(this.f300609f.f(aVar, this.f300607d, this.f300608e));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void N8(a aVar) {
        synchronized (this) {
            try {
                a aVar2 = this.f300610g;
                if (aVar2 != null && aVar2 == aVar) {
                    this.f300610g = null;
                    io.reactivex.disposables.c cVar = aVar.f300613b;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                }
                long j10 = aVar.f300614c - 1;
                aVar.f300614c = j10;
                if (j10 == 0) {
                    io.reactivex.flowables.a<T> aVar3 = this.f300605b;
                    if (aVar3 instanceof io.reactivex.disposables.c) {
                        ((io.reactivex.disposables.c) aVar3).dispose();
                    } else if (aVar3 instanceof io.reactivex.internal.disposables.g) {
                        ((io.reactivex.internal.disposables.g) aVar3).b(aVar.get());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void O8(a aVar) {
        synchronized (this) {
            try {
                if (aVar.f300614c == 0 && aVar == this.f300610g) {
                    this.f300610g = null;
                    io.reactivex.disposables.c cVar = aVar.get();
                    io.reactivex.internal.disposables.d.b(aVar);
                    io.reactivex.flowables.a<T> aVar2 = this.f300605b;
                    if (aVar2 instanceof io.reactivex.disposables.c) {
                        ((io.reactivex.disposables.c) aVar2).dispose();
                    } else if (aVar2 instanceof io.reactivex.internal.disposables.g) {
                        if (cVar == null) {
                            aVar.f300616e = true;
                        } else {
                            ((io.reactivex.internal.disposables.g) aVar2).b(cVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        a aVar;
        boolean z10;
        io.reactivex.disposables.c cVar;
        synchronized (this) {
            try {
                aVar = this.f300610g;
                if (aVar == null) {
                    aVar = new a(this);
                    this.f300610g = aVar;
                }
                long j10 = aVar.f300614c;
                if (j10 == 0 && (cVar = aVar.f300613b) != null) {
                    cVar.dispose();
                }
                long j11 = j10 + 1;
                aVar.f300614c = j11;
                if (aVar.f300615d || j11 != this.f300606c) {
                    z10 = false;
                } else {
                    z10 = true;
                    aVar.f300615d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f300605b.j6(new b(vVar, this, aVar));
        if (z10) {
            this.f300605b.Q8(aVar);
        }
    }

    public z2(io.reactivex.flowables.a<T> aVar, int i10, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        this.f300605b = aVar;
        this.f300606c = i10;
        this.f300607d = j10;
        this.f300608e = timeUnit;
        this.f300609f = j0Var;
    }
}
