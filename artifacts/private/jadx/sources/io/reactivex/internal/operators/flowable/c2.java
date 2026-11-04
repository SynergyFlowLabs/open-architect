package io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class c2<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends R> f299165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.o<? super Throwable, ? extends R> f299166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Callable<? extends R> f299167e;

    static final class a<T, R> extends io.reactivex.internal.subscribers.t<T, R> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f299168k = 2757120512858778108L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final dj.o<? super T, ? extends R> f299169h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final dj.o<? super Throwable, ? extends R> f299170i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final Callable<? extends R> f299171j;

        a(org.reactivestreams.v<? super R> vVar, dj.o<? super T, ? extends R> oVar, dj.o<? super Throwable, ? extends R> oVar2, Callable<? extends R> callable) {
            super(vVar);
            this.f299169h = oVar;
            this.f299170i = oVar2;
            this.f299171j = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.v
        public void onComplete() {
            try {
                a(io.reactivex.internal.functions.b.g(this.f299171j.call(), "The onComplete publisher returned is null"));
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f303420a.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            try {
                a(io.reactivex.internal.functions.b.g(this.f299170i.apply(th2), "The onError publisher returned is null"));
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f303420a.onError(new io.reactivex.exceptions.a(th2, th3));
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            try {
                Object objG = io.reactivex.internal.functions.b.g(this.f299169h.apply(t10), "The onNext publisher returned is null");
                this.f303423d++;
                this.f303420a.onNext(objG);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f303420a.onError(th2);
            }
        }
    }

    public c2(io.reactivex.l<T> lVar, dj.o<? super T, ? extends R> oVar, dj.o<? super Throwable, ? extends R> oVar2, Callable<? extends R> callable) {
        super(lVar);
        this.f299165c = oVar;
        this.f299166d = oVar2;
        this.f299167e = callable;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        this.f299043b.j6(new a(vVar, this.f299165c, this.f299166d, this.f299167e));
    }
}
