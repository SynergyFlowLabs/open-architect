package io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class w<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> f300423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f300424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.internal.util.j f300425e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f300426a;

        static {
            int[] iArr = new int[io.reactivex.internal.util.j.values().length];
            f300426a = iArr;
            try {
                iArr[io.reactivex.internal.util.j.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f300426a[io.reactivex.internal.util.j.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static abstract class b<T, R> extends AtomicInteger implements io.reactivex.q<T>, f<R>, org.reactivestreams.w {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final long f300427m = -3511336836796789179L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> f300429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f300430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f300431d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.w f300432e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f300433f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ej.o<T> f300434g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f300435h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f300436i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f300438k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f300439l;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final e<R> f300428a = new e<>(this);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final io.reactivex.internal.util.c f300437j = new io.reactivex.internal.util.c();

        b(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10) {
            this.f300429b = oVar;
            this.f300430c = i10;
            this.f300431d = i10 - (i10 >> 2);
        }

        @Override // io.reactivex.internal.operators.flowable.w.f
        public final void b() {
            this.f300438k = false;
            d();
        }

        abstract void d();

        abstract void e();

        @Override // io.reactivex.q, org.reactivestreams.v
        public final void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300432e, wVar)) {
                this.f300432e = wVar;
                if (wVar instanceof ej.l) {
                    ej.l lVar = (ej.l) wVar;
                    int iP = lVar.p(7);
                    if (iP == 1) {
                        this.f300439l = iP;
                        this.f300434g = lVar;
                        this.f300435h = true;
                        e();
                        d();
                        return;
                    }
                    if (iP == 2) {
                        this.f300439l = iP;
                        this.f300434g = lVar;
                        e();
                        wVar.request(this.f300430c);
                        return;
                    }
                }
                this.f300434g = new io.reactivex.internal.queue.b(this.f300430c);
                e();
                wVar.request(this.f300430c);
            }
        }

        @Override // org.reactivestreams.v
        public final void onComplete() {
            this.f300435h = true;
            d();
        }

        @Override // org.reactivestreams.v
        public final void onNext(T t10) {
            if (this.f300439l == 2 || this.f300434g.offer(t10)) {
                d();
            } else {
                this.f300432e.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }
    }

    static final class c<T, R> extends b<T, R> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final long f300440s = -2945777694260521066L;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f300441n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final boolean f300442o;

        c(org.reactivestreams.v<? super R> vVar, dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10, boolean z10) {
            super(oVar, i10);
            this.f300441n = vVar;
            this.f300442o = z10;
        }

        @Override // io.reactivex.internal.operators.flowable.w.f
        public void a(Throwable th2) {
            if (!this.f300437j.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f300442o) {
                this.f300432e.cancel();
                this.f300435h = true;
            }
            this.f300438k = false;
            d();
        }

        @Override // io.reactivex.internal.operators.flowable.w.f
        public void c(R r10) {
            this.f300441n.onNext(r10);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f300436i) {
                return;
            }
            this.f300436i = true;
            this.f300428a.cancel();
            this.f300432e.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.w.b
        void d() {
            if (getAndIncrement() == 0) {
                while (!this.f300436i) {
                    if (!this.f300438k) {
                        boolean z10 = this.f300435h;
                        if (z10 && !this.f300442o && this.f300437j.get() != null) {
                            this.f300441n.onError(this.f300437j.c());
                            return;
                        }
                        try {
                            T tPoll = this.f300434g.poll();
                            boolean z11 = tPoll == null;
                            if (z10 && z11) {
                                Throwable thC = this.f300437j.c();
                                if (thC != null) {
                                    this.f300441n.onError(thC);
                                    return;
                                } else {
                                    this.f300441n.onComplete();
                                    return;
                                }
                            }
                            if (!z11) {
                                try {
                                    org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f300429b.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.f300439l != 1) {
                                        int i10 = this.f300433f + 1;
                                        if (i10 == this.f300431d) {
                                            this.f300433f = 0;
                                            this.f300432e.request(i10);
                                        } else {
                                            this.f300433f = i10;
                                        }
                                    }
                                    if (uVar instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) uVar).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (this.f300428a.f()) {
                                                this.f300441n.onNext(objCall);
                                            } else {
                                                this.f300438k = true;
                                                e<R> eVar = this.f300428a;
                                                eVar.h(new g(objCall, eVar));
                                            }
                                        } catch (Throwable th2) {
                                            io.reactivex.exceptions.b.b(th2);
                                            this.f300432e.cancel();
                                            this.f300437j.a(th2);
                                            this.f300441n.onError(this.f300437j.c());
                                            return;
                                        }
                                    } else {
                                        this.f300438k = true;
                                        uVar.e(this.f300428a);
                                    }
                                } catch (Throwable th3) {
                                    io.reactivex.exceptions.b.b(th3);
                                    this.f300432e.cancel();
                                    this.f300437j.a(th3);
                                    this.f300441n.onError(this.f300437j.c());
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            io.reactivex.exceptions.b.b(th4);
                            this.f300432e.cancel();
                            this.f300437j.a(th4);
                            this.f300441n.onError(this.f300437j.c());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        break;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.w.b
        void e() {
            this.f300441n.l(this);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (!this.f300437j.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300435h = true;
                d();
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f300428a.request(j10);
        }
    }

    static final class d<T, R> extends b<T, R> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final long f300443s = 7898995095634264146L;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f300444n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final AtomicInteger f300445o;

        d(org.reactivestreams.v<? super R> vVar, dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10) {
            super(oVar, i10);
            this.f300444n = vVar;
            this.f300445o = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.w.f
        public void a(Throwable th2) {
            if (!this.f300437j.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f300432e.cancel();
            if (getAndIncrement() == 0) {
                this.f300444n.onError(this.f300437j.c());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.w.f
        public void c(R r10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f300444n.onNext(r10);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.f300444n.onError(this.f300437j.c());
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (!this.f300436i) {
                this.f300436i = true;
                this.f300428a.cancel();
                this.f300432e.cancel();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.w.b
        void d() {
            if (this.f300445o.getAndIncrement() == 0) {
                while (!this.f300436i) {
                    if (!this.f300438k) {
                        boolean z10 = this.f300435h;
                        try {
                            T tPoll = this.f300434g.poll();
                            boolean z11 = tPoll == null;
                            if (z10 && z11) {
                                this.f300444n.onComplete();
                                return;
                            }
                            if (!z11) {
                                try {
                                    org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f300429b.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.f300439l != 1) {
                                        int i10 = this.f300433f + 1;
                                        if (i10 == this.f300431d) {
                                            this.f300433f = 0;
                                            this.f300432e.request(i10);
                                        } else {
                                            this.f300433f = i10;
                                        }
                                    }
                                    if (uVar instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) uVar).call();
                                            if (objCall != null) {
                                                if (!this.f300428a.f()) {
                                                    this.f300438k = true;
                                                    e<R> eVar = this.f300428a;
                                                    eVar.h(new g(objCall, eVar));
                                                } else if (get() == 0 && compareAndSet(0, 1)) {
                                                    this.f300444n.onNext(objCall);
                                                    if (!compareAndSet(1, 0)) {
                                                        this.f300444n.onError(this.f300437j.c());
                                                        return;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            io.reactivex.exceptions.b.b(th2);
                                            this.f300432e.cancel();
                                            this.f300437j.a(th2);
                                            this.f300444n.onError(this.f300437j.c());
                                            return;
                                        }
                                    } else {
                                        this.f300438k = true;
                                        uVar.e(this.f300428a);
                                    }
                                } catch (Throwable th3) {
                                    io.reactivex.exceptions.b.b(th3);
                                    this.f300432e.cancel();
                                    this.f300437j.a(th3);
                                    this.f300444n.onError(this.f300437j.c());
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            io.reactivex.exceptions.b.b(th4);
                            this.f300432e.cancel();
                            this.f300437j.a(th4);
                            this.f300444n.onError(this.f300437j.c());
                            return;
                        }
                    }
                    if (this.f300445o.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.w.b
        void e() {
            this.f300444n.l(this);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (!this.f300437j.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f300428a.cancel();
            if (getAndIncrement() == 0) {
                this.f300444n.onError(this.f300437j.c());
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f300428a.request(j10);
        }
    }

    static final class e<R> extends io.reactivex.internal.subscriptions.i implements io.reactivex.q<R> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f300446l = 897683679971470653L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final f<R> f300447j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        long f300448k;

        e(f<R> fVar) {
            super(false);
            this.f300447j = fVar;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            h(wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            long j10 = this.f300448k;
            if (j10 != 0) {
                this.f300448k = 0L;
                g(j10);
            }
            this.f300447j.b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            long j10 = this.f300448k;
            if (j10 != 0) {
                this.f300448k = 0L;
                g(j10);
            }
            this.f300447j.a(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(R r10) {
            this.f300448k++;
            this.f300447j.c(r10);
        }
    }

    interface f<T> {
        void a(Throwable th2);

        void b();

        void c(T t10);
    }

    static final class g<T> implements org.reactivestreams.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f300450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f300451c;

        g(T t10, org.reactivestreams.v<? super T> vVar) {
            this.f300450b = t10;
            this.f300449a = vVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (j10 <= 0 || this.f300451c) {
                return;
            }
            this.f300451c = true;
            org.reactivestreams.v<? super T> vVar = this.f300449a;
            vVar.onNext(this.f300450b);
            vVar.onComplete();
        }
    }

    public w(io.reactivex.l<T> lVar, dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10, io.reactivex.internal.util.j jVar) {
        super(lVar);
        this.f300423c = oVar;
        this.f300424d = i10;
        this.f300425e = jVar;
    }

    public static <T, R> org.reactivestreams.v<T> M8(org.reactivestreams.v<? super R> vVar, dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10, io.reactivex.internal.util.j jVar) {
        int i11 = a.f300426a[jVar.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? new d(vVar, oVar, i10) : new c(vVar, oVar, i10, true);
        }
        return new c(vVar, oVar, i10, false);
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        if (j3.b(this.f299043b, vVar, this.f300423c)) {
            return;
        }
        this.f299043b.e(M8(vVar, this.f300423c, this.f300424d, this.f300425e));
    }
}
