package io.reactivex.internal.operators.parallel;

import java.util.concurrent.Callable;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class m<T, R> extends io.reactivex.parallel.b<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.b<? extends T> f302817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<R> f302818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.c<R, ? super T, R> f302819c;

    static final class a<T, R> extends io.reactivex.internal.subscribers.h<T, R> {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final long f302820w = 8200530050639449080L;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final dj.c<R, ? super T, R> f302821s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        R f302822t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f302823v;

        a(v<? super R> vVar, R r10, dj.c<R, ? super T, R> cVar) {
            super(vVar);
            this.f302822t = r10;
            this.f302821s = cVar;
        }

        @Override // io.reactivex.internal.subscribers.h, io.reactivex.internal.subscriptions.f, org.reactivestreams.w
        public void cancel() {
            super.cancel();
            this.f303352m.cancel();
        }

        @Override // io.reactivex.internal.subscribers.h, io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f303352m, wVar)) {
                this.f303352m = wVar;
                this.f303450b.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.subscribers.h, org.reactivestreams.v
        public void onComplete() {
            if (!this.f302823v) {
                this.f302823v = true;
                R r10 = this.f302822t;
                this.f302822t = null;
                f(r10);
            }
        }

        @Override // io.reactivex.internal.subscribers.h, org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f302823v) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f302823v = true;
            this.f302822t = null;
            this.f303450b.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (!this.f302823v) {
                try {
                    this.f302822t = (R) io.reactivex.internal.functions.b.g(this.f302821s.apply(this.f302822t, t10), "The reducer returned a null value");
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    cancel();
                    onError(th2);
                }
            }
        }
    }

    public m(io.reactivex.parallel.b<? extends T> bVar, Callable<R> callable, dj.c<R, ? super T, R> cVar) {
        this.f302817a = bVar;
        this.f302818b = callable;
        this.f302819c = cVar;
    }

    @Override // io.reactivex.parallel.b
    public int F() {
        return this.f302817a.F();
    }

    @Override // io.reactivex.parallel.b
    public void Q(v<? super R>[] vVarArr) {
        if (U(vVarArr)) {
            int length = vVarArr.length;
            v<? super Object>[] vVarArr2 = new v[length];
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    vVarArr2[i10] = new a(vVarArr[i10], io.reactivex.internal.functions.b.g(this.f302818b.call(), "The initialSupplier returned a null value"), this.f302819c);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    V(vVarArr, th2);
                    return;
                }
            }
            this.f302817a.Q(vVarArr2);
        }
    }

    void V(v<?>[] vVarArr, Throwable th2) {
        for (v<?> vVar : vVarArr) {
            io.reactivex.internal.subscriptions.g.c(th2, vVar);
        }
    }
}
