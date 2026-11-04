package io.reactivex.internal.operators.parallel;

import java.util.concurrent.Callable;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class a<T, C> extends io.reactivex.parallel.b<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.b<? extends T> f302693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends C> f302694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.b<? super C, ? super T> f302695c;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.parallel.a$a, reason: collision with other inner class name */
    static final class C2184a<T, C> extends io.reactivex.internal.subscribers.h<T, C> {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final long f302696w = -4767392946044436228L;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final dj.b<? super C, ? super T> f302697s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C f302698t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f302699v;

        C2184a(v<? super C> vVar, C c10, dj.b<? super C, ? super T> bVar) {
            super(vVar);
            this.f302698t = c10;
            this.f302697s = bVar;
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
            if (this.f302699v) {
                return;
            }
            this.f302699v = true;
            C c10 = this.f302698t;
            this.f302698t = null;
            f(c10);
        }

        @Override // io.reactivex.internal.subscribers.h, org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f302699v) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f302699v = true;
            this.f302698t = null;
            this.f303450b.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f302699v) {
                return;
            }
            try {
                this.f302697s.accept(this.f302698t, t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                cancel();
                onError(th2);
            }
        }
    }

    public a(io.reactivex.parallel.b<? extends T> bVar, Callable<? extends C> callable, dj.b<? super C, ? super T> bVar2) {
        this.f302693a = bVar;
        this.f302694b = callable;
        this.f302695c = bVar2;
    }

    @Override // io.reactivex.parallel.b
    public int F() {
        return this.f302693a.F();
    }

    @Override // io.reactivex.parallel.b
    public void Q(v<? super C>[] vVarArr) {
        if (U(vVarArr)) {
            int length = vVarArr.length;
            v<? super Object>[] vVarArr2 = new v[length];
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    vVarArr2[i10] = new C2184a(vVarArr[i10], io.reactivex.internal.functions.b.g(this.f302694b.call(), "The initialSupplier returned a null value"), this.f302695c);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    V(vVarArr, th2);
                    return;
                }
            }
            this.f302693a.Q(vVarArr2);
        }
    }

    void V(v<?>[] vVarArr, Throwable th2) {
        for (v<?> vVar : vVarArr) {
            io.reactivex.internal.subscriptions.g.c(th2, vVar);
        }
    }
}
