package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class m2<T> extends io.reactivex.internal.operators.flowable.a<T, T> implements dj.g<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.g<? super T> f299766c;

    static final class a<T> extends AtomicLong implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f299767e = -6246093802440953054L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.g<? super T> f299769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.w f299770c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f299771d;

        a(org.reactivestreams.v<? super T> vVar, dj.g<? super T> gVar) {
            this.f299768a = vVar;
            this.f299769b = gVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299770c.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299770c, wVar)) {
                this.f299770c = wVar;
                this.f299768a.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299771d) {
                return;
            }
            this.f299771d = true;
            this.f299768a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299771d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f299771d = true;
                this.f299768a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299771d) {
                return;
            }
            if (get() != 0) {
                this.f299768a.onNext(t10);
                io.reactivex.internal.util.d.e(this, 1L);
                return;
            }
            try {
                this.f299769b.accept(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this, j10);
            }
        }
    }

    public m2(io.reactivex.l<T> lVar) {
        super(lVar);
        this.f299766c = this;
    }

    @Override // dj.g
    public void accept(T t10) {
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f299766c));
    }

    public m2(io.reactivex.l<T> lVar, dj.g<? super T> gVar) {
        super(lVar);
        this.f299766c = gVar;
    }
}
