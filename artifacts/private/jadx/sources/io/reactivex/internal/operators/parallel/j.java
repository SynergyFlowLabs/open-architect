package io.reactivex.internal.operators.parallel;

import io.reactivex.q;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class j<T, R> extends io.reactivex.parallel.b<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.b<T> f302780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends R> f302781b;

    static final class a<T, R> implements ej.a<T>, w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ej.a<? super R> f302782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends R> f302783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        w f302784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f302785d;

        a(ej.a<? super R> aVar, dj.o<? super T, ? extends R> oVar) {
            this.f302782a = aVar;
            this.f302783b = oVar;
        }

        @Override // ej.a
        public boolean L(T t10) {
            if (this.f302785d) {
                return false;
            }
            try {
                return this.f302782a.L(io.reactivex.internal.functions.b.g(this.f302783b.apply(t10), "The mapper returned a null value"));
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                cancel();
                onError(th2);
                return false;
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f302784c.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f302784c, wVar)) {
                this.f302784c = wVar;
                this.f302782a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f302785d) {
                return;
            }
            this.f302785d = true;
            this.f302782a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f302785d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302785d = true;
                this.f302782a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f302785d) {
                return;
            }
            try {
                this.f302782a.onNext(io.reactivex.internal.functions.b.g(this.f302783b.apply(t10), "The mapper returned a null value"));
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f302784c.request(j10);
        }
    }

    static final class b<T, R> implements q<T>, w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super R> f302786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends R> f302787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        w f302788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f302789d;

        b(v<? super R> vVar, dj.o<? super T, ? extends R> oVar) {
            this.f302786a = vVar;
            this.f302787b = oVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f302788c.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f302788c, wVar)) {
                this.f302788c = wVar;
                this.f302786a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f302789d) {
                return;
            }
            this.f302789d = true;
            this.f302786a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f302789d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302789d = true;
                this.f302786a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f302789d) {
                return;
            }
            try {
                this.f302786a.onNext(io.reactivex.internal.functions.b.g(this.f302787b.apply(t10), "The mapper returned a null value"));
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f302788c.request(j10);
        }
    }

    public j(io.reactivex.parallel.b<T> bVar, dj.o<? super T, ? extends R> oVar) {
        this.f302780a = bVar;
        this.f302781b = oVar;
    }

    @Override // io.reactivex.parallel.b
    public int F() {
        return this.f302780a.F();
    }

    @Override // io.reactivex.parallel.b
    public void Q(v<? super R>[] vVarArr) {
        if (U(vVarArr)) {
            int length = vVarArr.length;
            v<? super T>[] vVarArr2 = new v[length];
            for (int i10 = 0; i10 < length; i10++) {
                v<? super R> vVar = vVarArr[i10];
                if (vVar instanceof ej.a) {
                    vVarArr2[i10] = new a((ej.a) vVar, this.f302781b);
                } else {
                    vVarArr2[i10] = new b(vVar, this.f302781b);
                }
            }
            this.f302780a.Q(vVarArr2);
        }
    }
}
