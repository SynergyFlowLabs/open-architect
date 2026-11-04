package io.reactivex.internal.operators.parallel;

import dj.r;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class d<T> extends io.reactivex.parallel.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.b<T> f302718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r<? super T> f302719b;

    static abstract class a<T> implements ej.a<T>, w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final r<? super T> f302720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        w f302721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f302722c;

        a(r<? super T> rVar) {
            this.f302720a = rVar;
        }

        @Override // org.reactivestreams.w
        public final void cancel() {
            this.f302721b.cancel();
        }

        @Override // org.reactivestreams.v
        public final void onNext(T t10) {
            if (!L(t10) && !this.f302722c) {
                this.f302721b.request(1L);
            }
        }

        @Override // org.reactivestreams.w
        public final void request(long j10) {
            this.f302721b.request(j10);
        }
    }

    static final class b<T> extends a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ej.a<? super T> f302723d;

        b(ej.a<? super T> aVar, r<? super T> rVar) {
            super(rVar);
            this.f302723d = aVar;
        }

        @Override // ej.a
        public boolean L(T t10) {
            if (!this.f302722c) {
                try {
                    if (this.f302720a.test(t10)) {
                        return this.f302723d.L(t10);
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    cancel();
                    onError(th2);
                }
            }
            return false;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f302721b, wVar)) {
                this.f302721b = wVar;
                this.f302723d.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (!this.f302722c) {
                this.f302722c = true;
                this.f302723d.onComplete();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f302722c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302722c = true;
                this.f302723d.onError(th2);
            }
        }
    }

    static final class c<T> extends a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final v<? super T> f302724d;

        c(v<? super T> vVar, r<? super T> rVar) {
            super(rVar);
            this.f302724d = vVar;
        }

        @Override // ej.a
        public boolean L(T t10) {
            if (!this.f302722c) {
                try {
                    if (this.f302720a.test(t10)) {
                        this.f302724d.onNext(t10);
                        return true;
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    cancel();
                    onError(th2);
                }
            }
            return false;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f302721b, wVar)) {
                this.f302721b = wVar;
                this.f302724d.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f302722c) {
                return;
            }
            this.f302722c = true;
            this.f302724d.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f302722c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302722c = true;
                this.f302724d.onError(th2);
            }
        }
    }

    public d(io.reactivex.parallel.b<T> bVar, r<? super T> rVar) {
        this.f302718a = bVar;
        this.f302719b = rVar;
    }

    @Override // io.reactivex.parallel.b
    public int F() {
        return this.f302718a.F();
    }

    @Override // io.reactivex.parallel.b
    public void Q(v<? super T>[] vVarArr) {
        if (U(vVarArr)) {
            int length = vVarArr.length;
            v<? super T>[] vVarArr2 = new v[length];
            for (int i10 = 0; i10 < length; i10++) {
                v<? super T> vVar = vVarArr[i10];
                if (vVar instanceof ej.a) {
                    vVarArr2[i10] = new b((ej.a) vVar, this.f302719b);
                } else {
                    vVarArr2[i10] = new c(vVar, this.f302719b);
                }
            }
            this.f302718a.Q(vVarArr2);
        }
    }
}
