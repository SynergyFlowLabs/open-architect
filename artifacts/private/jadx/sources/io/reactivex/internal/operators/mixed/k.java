package io.reactivex.internal.operators.mixed;

import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.u;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class k<T, R> extends io.reactivex.l<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final y<T> f301174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends u<? extends R>> f301175c;

    static final class a<T, R> extends AtomicReference<w> implements io.reactivex.q<R>, v<T>, w {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f301176e = -8948264376121066672L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f301177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends u<? extends R>> f301178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f301180d = new AtomicLong();

        a(org.reactivestreams.v<? super R> vVar, dj.o<? super T, ? extends u<? extends R>> oVar) {
            this.f301177a = vVar;
            this.f301178b = oVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            try {
                ((u) io.reactivex.internal.functions.b.g(this.f301178b.apply(t10), "The mapper returned a null Publisher")).e(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301177a.onError(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f301179c.dispose();
            io.reactivex.internal.subscriptions.j.b(this);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301179c, cVar)) {
                this.f301179c = cVar;
                this.f301177a.l(this);
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            io.reactivex.internal.subscriptions.j.d(this, this.f301180d, wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f301177a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f301177a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(R r10) {
            this.f301177a.onNext(r10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.subscriptions.j.c(this, this.f301180d, j10);
        }
    }

    public k(y<T> yVar, dj.o<? super T, ? extends u<? extends R>> oVar) {
        this.f301174b = yVar;
        this.f301175c = oVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        this.f301174b.a(new a(vVar, this.f301175c));
    }
}
