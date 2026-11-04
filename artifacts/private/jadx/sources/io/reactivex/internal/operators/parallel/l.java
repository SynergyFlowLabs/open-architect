package io.reactivex.internal.operators.parallel;

import dj.q;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class l<T> extends io.reactivex.parallel.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.b<T> f302804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super T> f302805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.g<? super T> f302806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.g<? super Throwable> f302807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final dj.a f302808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final dj.a f302809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final dj.g<? super w> f302810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final q f302811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final dj.a f302812i;

    static final class a<T> implements io.reactivex.q<T>, w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super T> f302813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l<T> f302814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        w f302815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f302816d;

        a(v<? super T> vVar, l<T> lVar) {
            this.f302813a = vVar;
            this.f302814b = lVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            try {
                this.f302814b.f302812i.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
            this.f302815c.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f302815c, wVar)) {
                this.f302815c = wVar;
                try {
                    this.f302814b.f302810g.accept(wVar);
                    this.f302813a.l(this);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    wVar.cancel();
                    this.f302813a.l(io.reactivex.internal.subscriptions.g.INSTANCE);
                    onError(th2);
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f302816d) {
                return;
            }
            this.f302816d = true;
            try {
                this.f302814b.f302808e.run();
                this.f302813a.onComplete();
                try {
                    this.f302814b.f302809f.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f302813a.onError(th3);
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f302816d) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f302816d = true;
            try {
                this.f302814b.f302807d.accept(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                th2 = new io.reactivex.exceptions.a(th2, th3);
            }
            this.f302813a.onError(th2);
            try {
                this.f302814b.f302809f.run();
            } catch (Throwable th4) {
                io.reactivex.exceptions.b.b(th4);
                io.reactivex.plugins.a.Y(th4);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f302816d) {
                return;
            }
            try {
                this.f302814b.f302805b.accept(t10);
                this.f302813a.onNext(t10);
                try {
                    this.f302814b.f302806c.accept(t10);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                onError(th3);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            try {
                this.f302814b.f302811h.accept(j10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
            this.f302815c.request(j10);
        }
    }

    public l(io.reactivex.parallel.b<T> bVar, dj.g<? super T> gVar, dj.g<? super T> gVar2, dj.g<? super Throwable> gVar3, dj.a aVar, dj.a aVar2, dj.g<? super w> gVar4, q qVar, dj.a aVar3) {
        this.f302804a = bVar;
        this.f302805b = (dj.g) io.reactivex.internal.functions.b.g(gVar, "onNext is null");
        this.f302806c = (dj.g) io.reactivex.internal.functions.b.g(gVar2, "onAfterNext is null");
        this.f302807d = (dj.g) io.reactivex.internal.functions.b.g(gVar3, "onError is null");
        this.f302808e = (dj.a) io.reactivex.internal.functions.b.g(aVar, "onComplete is null");
        this.f302809f = (dj.a) io.reactivex.internal.functions.b.g(aVar2, "onAfterTerminated is null");
        this.f302810g = (dj.g) io.reactivex.internal.functions.b.g(gVar4, "onSubscribe is null");
        this.f302811h = (q) io.reactivex.internal.functions.b.g(qVar, "onRequest is null");
        this.f302812i = (dj.a) io.reactivex.internal.functions.b.g(aVar3, "onCancel is null");
    }

    @Override // io.reactivex.parallel.b
    public int F() {
        return this.f302804a.F();
    }

    @Override // io.reactivex.parallel.b
    public void Q(v<? super T>[] vVarArr) {
        if (U(vVarArr)) {
            int length = vVarArr.length;
            v<? super T>[] vVarArr2 = new v[length];
            for (int i10 = 0; i10 < length; i10++) {
                vVarArr2[i10] = new a(vVarArr[i10], this);
            }
            this.f302804a.Q(vVarArr2);
        }
    }
}
