package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class c0<T, R> extends io.reactivex.l<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.q0<T> f302914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> f302915c;

    static final class a<S, T> extends AtomicLong implements io.reactivex.n0<S>, io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f302916e = 7759721921468635667L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f302917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super S, ? extends org.reactivestreams.u<? extends T>> f302918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f302919c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f302920d;

        a(org.reactivestreams.v<? super T> vVar, dj.o<? super S, ? extends org.reactivestreams.u<? extends T>> oVar) {
            this.f302917a = vVar;
            this.f302918b = oVar;
        }

        @Override // io.reactivex.n0
        public void b(S s10) {
            try {
                ((org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f302918b.apply(s10), "the mapper returned a null Publisher")).e(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f302917a.onError(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f302920d.dispose();
            io.reactivex.internal.subscriptions.j.b(this.f302919c);
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            this.f302920d = cVar;
            this.f302917a.l(this);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.d(this.f302919c, this, wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f302917a.onComplete();
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f302917a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f302917a.onNext(t10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.subscriptions.j.c(this.f302919c, this, j10);
        }
    }

    public c0(io.reactivex.q0<T> q0Var, dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar) {
        this.f302914b = q0Var;
        this.f302915c = oVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        this.f302914b.f(new a(vVar, this.f302915c));
    }
}
