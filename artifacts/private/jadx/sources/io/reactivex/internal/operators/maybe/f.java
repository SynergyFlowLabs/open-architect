package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class f<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.y<? extends T>[] f300767b;

    static final class a<T> extends AtomicInteger implements io.reactivex.v<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f300768i = 3520831347801429610L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300769a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.y<? extends T>[] f300773e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f300775g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f300776h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicLong f300770b = new AtomicLong();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f300772d = new io.reactivex.internal.disposables.h();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<Object> f300771c = new AtomicReference<>(io.reactivex.internal.util.q.COMPLETE);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.util.c f300774f = new io.reactivex.internal.util.c();

        a(org.reactivestreams.v<? super T> vVar, io.reactivex.y<? extends T>[] yVarArr) {
            this.f300769a = vVar;
            this.f300773e = yVarArr;
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f300771c;
            org.reactivestreams.v<? super T> vVar = this.f300769a;
            io.reactivex.internal.disposables.h hVar = this.f300772d;
            while (!hVar.k()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    if (obj != io.reactivex.internal.util.q.COMPLETE) {
                        long j10 = this.f300776h;
                        if (j10 != this.f300770b.get()) {
                            this.f300776h = j10 + 1;
                            atomicReference.lazySet(null);
                            vVar.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!hVar.k()) {
                        int i10 = this.f300775g;
                        io.reactivex.y<? extends T>[] yVarArr = this.f300773e;
                        if (i10 == yVarArr.length) {
                            if (this.f300774f.get() != null) {
                                vVar.onError(this.f300774f.c());
                                return;
                            } else {
                                vVar.onComplete();
                                return;
                            }
                        }
                        this.f300775g = i10 + 1;
                        yVarArr[i10].a(this);
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300771c.lazySet(t10);
            a();
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f300772d.dispose();
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            this.f300772d.a(cVar);
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300771c.lazySet(io.reactivex.internal.util.q.COMPLETE);
            a();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300771c.lazySet(io.reactivex.internal.util.q.COMPLETE);
            if (this.f300774f.a(th2)) {
                a();
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f300770b, j10);
                a();
            }
        }
    }

    public f(io.reactivex.y<? extends T>[] yVarArr) {
        this.f300767b = yVarArr;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        a aVar = new a(vVar, this.f300767b);
        vVar.l(aVar);
        aVar.a();
    }
}
