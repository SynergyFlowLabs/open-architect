package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class a4<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f299076c;

    static final class a<T> extends AtomicBoolean implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f299077f = -5636543848937116287L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f299079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f299080c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.w f299081d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f299082e;

        a(org.reactivestreams.v<? super T> vVar, long j10) {
            this.f299078a = vVar;
            this.f299079b = j10;
            this.f299082e = j10;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299081d.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299081d, wVar)) {
                this.f299081d = wVar;
                if (this.f299079b != 0) {
                    this.f299078a.l(this);
                    return;
                }
                wVar.cancel();
                this.f299080c = true;
                io.reactivex.internal.subscriptions.g.b(this.f299078a);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (!this.f299080c) {
                this.f299080c = true;
                this.f299078a.onComplete();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299080c) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f299080c = true;
            this.f299081d.cancel();
            this.f299078a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (!this.f299080c) {
                long j10 = this.f299082e;
                long j11 = j10 - 1;
                this.f299082e = j11;
                if (j10 > 0) {
                    boolean z10 = j11 == 0;
                    this.f299078a.onNext(t10);
                    if (z10) {
                        this.f299081d.cancel();
                        onComplete();
                    }
                }
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                if (get() || !compareAndSet(false, true) || j10 < this.f299079b) {
                    this.f299081d.request(j10);
                } else {
                    this.f299081d.request(Long.MAX_VALUE);
                }
            }
        }
    }

    public a4(io.reactivex.l<T> lVar, long j10) {
        super(lVar);
        this.f299076c = j10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f299076c));
    }
}
