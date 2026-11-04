package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class x4<T, U, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.c<? super T, ? super U, ? extends R> f300519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final org.reactivestreams.u<? extends U> f300520d;

    final class a implements io.reactivex.q<U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b<T, U, R> f300521a;

        a(b<T, U, R> bVar) {
            this.f300521a = bVar;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (this.f300521a.b(wVar)) {
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300521a.a(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(U u10) {
            this.f300521a.lazySet(u10);
        }
    }

    static final class b<T, U, R> extends AtomicReference<U> implements ej.a<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f300523f = -312246233408980075L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f300524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.c<? super T, ? super U, ? extends R> f300525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f300526c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f300527d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f300528e = new AtomicReference<>();

        b(org.reactivestreams.v<? super R> vVar, dj.c<? super T, ? super U, ? extends R> cVar) {
            this.f300524a = vVar;
            this.f300525b = cVar;
        }

        @Override // ej.a
        public boolean L(T t10) {
            U u10 = get();
            if (u10 != null) {
                try {
                    this.f300524a.onNext(io.reactivex.internal.functions.b.g(this.f300525b.apply(t10, u10), "The combiner returned a null value"));
                    return true;
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    cancel();
                    this.f300524a.onError(th2);
                }
            }
            return false;
        }

        public void a(Throwable th2) {
            io.reactivex.internal.subscriptions.j.b(this.f300526c);
            this.f300524a.onError(th2);
        }

        public boolean b(org.reactivestreams.w wVar) {
            return io.reactivex.internal.subscriptions.j.n(this.f300528e, wVar);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            io.reactivex.internal.subscriptions.j.b(this.f300526c);
            io.reactivex.internal.subscriptions.j.b(this.f300528e);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.d(this.f300526c, this.f300527d, wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            io.reactivex.internal.subscriptions.j.b(this.f300528e);
            this.f300524a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            io.reactivex.internal.subscriptions.j.b(this.f300528e);
            this.f300524a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (L(t10)) {
                return;
            }
            this.f300526c.get().request(1L);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.subscriptions.j.c(this.f300526c, this.f300527d, j10);
        }
    }

    public x4(io.reactivex.l<T> lVar, dj.c<? super T, ? super U, ? extends R> cVar, org.reactivestreams.u<? extends U> uVar) {
        super(lVar);
        this.f300519c = cVar;
        this.f300520d = uVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        io.reactivex.subscribers.e eVar = new io.reactivex.subscribers.e(vVar);
        b bVar = new b(eVar, this.f300519c);
        eVar.l(bVar);
        this.f300520d.e(new a(bVar));
        this.f299043b.j6(bVar);
    }
}
