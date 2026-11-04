package io.reactivex.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.u;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class b<R> extends io.reactivex.l<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.i f301042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final u<? extends R> f301043c;

    static final class a<R> extends AtomicReference<w> implements io.reactivex.q<R>, io.reactivex.f, w {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f301044e = -8948264376121066672L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super R> f301045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        u<? extends R> f301046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301047c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f301048d = new AtomicLong();

        a(v<? super R> vVar, u<? extends R> uVar) {
            this.f301045a = vVar;
            this.f301046b = uVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f301047c.dispose();
            io.reactivex.internal.subscriptions.j.b(this);
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301047c, cVar)) {
                this.f301047c = cVar;
                this.f301045a.l(this);
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            io.reactivex.internal.subscriptions.j.d(this, this.f301048d, wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            u<? extends R> uVar = this.f301046b;
            if (uVar == null) {
                this.f301045a.onComplete();
            } else {
                this.f301046b = null;
                uVar.e(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f301045a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(R r10) {
            this.f301045a.onNext(r10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.subscriptions.j.c(this, this.f301048d, j10);
        }
    }

    public b(io.reactivex.i iVar, u<? extends R> uVar) {
        this.f301042b = iVar;
        this.f301043c = uVar;
    }

    @Override // io.reactivex.l
    protected void k6(v<? super R> vVar) {
        this.f301042b.b(new a(vVar, this.f301043c));
    }
}
