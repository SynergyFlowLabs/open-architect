package io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class r4<T, D> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends D> f300090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super D, ? extends org.reactivestreams.u<? extends T>> f300091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.g<? super D> f300092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f300093e;

    static final class a<T, D> extends AtomicBoolean implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f300094f = 5904473792286235046L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final D f300096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.g<? super D> f300097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f300098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.w f300099e;

        a(org.reactivestreams.v<? super T> vVar, D d10, dj.g<? super D> gVar, boolean z10) {
            this.f300095a = vVar;
            this.f300096b = d10;
            this.f300097c = gVar;
            this.f300098d = z10;
        }

        void a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f300097c.accept(this.f300096b);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            a();
            this.f300099e.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300099e, wVar)) {
                this.f300099e = wVar;
                this.f300095a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (!this.f300098d) {
                this.f300095a.onComplete();
                this.f300099e.cancel();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f300097c.accept(this.f300096b);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f300095a.onError(th2);
                    return;
                }
            }
            this.f300099e.cancel();
            this.f300095a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (!this.f300098d) {
                this.f300095a.onError(th2);
                this.f300099e.cancel();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f300097c.accept(this.f300096b);
                } catch (Throwable th3) {
                    th = th3;
                    io.reactivex.exceptions.b.b(th);
                }
            }
            th = null;
            this.f300099e.cancel();
            if (th != null) {
                this.f300095a.onError(new io.reactivex.exceptions.a(th2, th));
            } else {
                this.f300095a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f300095a.onNext(t10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f300099e.request(j10);
        }
    }

    public r4(Callable<? extends D> callable, dj.o<? super D, ? extends org.reactivestreams.u<? extends T>> oVar, dj.g<? super D> gVar, boolean z10) {
        this.f300090b = callable;
        this.f300091c = oVar;
        this.f300092d = gVar;
        this.f300093e = z10;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        try {
            D dCall = this.f300090b.call();
            try {
                ((org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f300091c.apply(dCall), "The sourceSupplier returned a null Publisher")).e(new a(vVar, dCall, this.f300092d, this.f300093e));
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                try {
                    this.f300092d.accept(dCall);
                    io.reactivex.internal.subscriptions.g.c(th2, vVar);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    io.reactivex.internal.subscriptions.g.c(new io.reactivex.exceptions.a(th2, th3), vVar);
                }
            }
        } catch (Throwable th4) {
            io.reactivex.exceptions.b.b(th4);
            io.reactivex.internal.subscriptions.g.c(th4, vVar);
        }
    }
}
