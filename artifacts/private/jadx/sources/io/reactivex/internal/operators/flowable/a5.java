package io.reactivex.internal.operators.flowable;

import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class a5<T, U, V> extends io.reactivex.internal.operators.flowable.a<T, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Iterable<U> f299083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.c<? super T, ? super U, ? extends V> f299084d;

    static final class a<T, U, V> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super V> f299085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Iterator<U> f299086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.c<? super T, ? super U, ? extends V> f299087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.w f299088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f299089e;

        a(org.reactivestreams.v<? super V> vVar, Iterator<U> it, dj.c<? super T, ? super U, ? extends V> cVar) {
            this.f299085a = vVar;
            this.f299086b = it;
            this.f299087c = cVar;
        }

        void a(Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            this.f299089e = true;
            this.f299088d.cancel();
            this.f299085a.onError(th2);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299088d.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299088d, wVar)) {
                this.f299088d = wVar;
                this.f299085a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299089e) {
                return;
            }
            this.f299089e = true;
            this.f299085a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299089e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f299089e = true;
                this.f299085a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299089e) {
                return;
            }
            try {
                try {
                    this.f299085a.onNext(io.reactivex.internal.functions.b.g(this.f299087c.apply(t10, io.reactivex.internal.functions.b.g(this.f299086b.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (this.f299086b.hasNext()) {
                            return;
                        }
                        this.f299089e = true;
                        this.f299088d.cancel();
                        this.f299085a.onComplete();
                    } catch (Throwable th2) {
                        a(th2);
                    }
                } catch (Throwable th3) {
                    a(th3);
                }
            } catch (Throwable th4) {
                a(th4);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f299088d.request(j10);
        }
    }

    public a5(io.reactivex.l<T> lVar, Iterable<U> iterable, dj.c<? super T, ? super U, ? extends V> cVar) {
        super(lVar);
        this.f299083c = iterable;
        this.f299084d = cVar;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super V> vVar) {
        try {
            Iterator it = (Iterator) io.reactivex.internal.functions.b.g(this.f299083c.iterator(), "The iterator returned by other is null");
            try {
                if (it.hasNext()) {
                    this.f299043b.j6(new a(vVar, it, this.f299084d));
                } else {
                    io.reactivex.internal.subscriptions.g.b(vVar);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.internal.subscriptions.g.c(th2, vVar);
            }
        } catch (Throwable th3) {
            io.reactivex.exceptions.b.b(th3);
            io.reactivex.internal.subscriptions.g.c(th3, vVar);
        }
    }
}
