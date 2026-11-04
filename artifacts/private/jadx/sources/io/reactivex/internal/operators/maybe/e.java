package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class e<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.y<? extends T>[] f300742b;

    static final class a<T> extends AtomicInteger implements io.reactivex.v<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f300743h = 3520831347801429610L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300744a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.y<? extends T>[] f300748e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f300749f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f300750g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicLong f300745b = new AtomicLong();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f300747d = new io.reactivex.internal.disposables.h();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<Object> f300746c = new AtomicReference<>(io.reactivex.internal.util.q.COMPLETE);

        a(org.reactivestreams.v<? super T> vVar, io.reactivex.y<? extends T>[] yVarArr) {
            this.f300744a = vVar;
            this.f300748e = yVarArr;
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f300746c;
            org.reactivestreams.v<? super T> vVar = this.f300744a;
            io.reactivex.internal.disposables.h hVar = this.f300747d;
            while (!hVar.k()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    if (obj != io.reactivex.internal.util.q.COMPLETE) {
                        long j10 = this.f300750g;
                        if (j10 != this.f300745b.get()) {
                            this.f300750g = j10 + 1;
                            atomicReference.lazySet(null);
                            vVar.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!hVar.k()) {
                        int i10 = this.f300749f;
                        io.reactivex.y<? extends T>[] yVarArr = this.f300748e;
                        if (i10 == yVarArr.length) {
                            vVar.onComplete();
                            return;
                        } else {
                            this.f300749f = i10 + 1;
                            yVarArr[i10].a(this);
                        }
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
            this.f300746c.lazySet(t10);
            a();
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f300747d.dispose();
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            this.f300747d.a(cVar);
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300746c.lazySet(io.reactivex.internal.util.q.COMPLETE);
            a();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300744a.onError(th2);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f300745b, j10);
                a();
            }
        }
    }

    public e(io.reactivex.y<? extends T>[] yVarArr) {
        this.f300742b = yVarArr;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        a aVar = new a(vVar, this.f300742b);
        vVar.l(aVar);
        aVar.a();
    }
}
