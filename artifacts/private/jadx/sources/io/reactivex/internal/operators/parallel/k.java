package io.reactivex.internal.operators.parallel;

import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class k<T, R> extends io.reactivex.parallel.b<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.b<T> f302790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends R> f302791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> f302792c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f302793a;

        static {
            int[] iArr = new int[io.reactivex.parallel.a.values().length];
            f302793a = iArr;
            try {
                iArr[io.reactivex.parallel.a.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f302793a[io.reactivex.parallel.a.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f302793a[io.reactivex.parallel.a.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static final class b<T, R> implements ej.a<T>, w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ej.a<? super R> f302794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends R> f302795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> f302796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        w f302797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f302798e;

        b(ej.a<? super R> aVar, dj.o<? super T, ? extends R> oVar, dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> cVar) {
            this.f302794a = aVar;
            this.f302795b = oVar;
            this.f302796c = cVar;
        }

        @Override // ej.a
        public boolean L(T t10) {
            int i10;
            if (this.f302798e) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    return this.f302794a.L(io.reactivex.internal.functions.b.g(this.f302795b.apply(t10), "The mapper returned a null value"));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    try {
                        j10++;
                        i10 = a.f302793a[((io.reactivex.parallel.a) io.reactivex.internal.functions.b.g(this.f302796c.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.b.b(th3);
                        cancel();
                        onError(new io.reactivex.exceptions.a(th2, th3));
                        return false;
                    }
                }
            } while (i10 == 1);
            if (i10 != 2) {
                int i11 = 7 ^ 3;
                if (i10 != 3) {
                    cancel();
                    onError(th2);
                    return false;
                }
                cancel();
                onComplete();
            }
            return false;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f302797d.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f302797d, wVar)) {
                this.f302797d = wVar;
                this.f302794a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f302798e) {
                return;
            }
            this.f302798e = true;
            this.f302794a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f302798e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302798e = true;
                this.f302794a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (L(t10) || this.f302798e) {
                return;
            }
            this.f302797d.request(1L);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f302797d.request(j10);
        }
    }

    static final class c<T, R> implements ej.a<T>, w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super R> f302799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends R> f302800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> f302801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        w f302802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f302803e;

        c(v<? super R> vVar, dj.o<? super T, ? extends R> oVar, dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> cVar) {
            this.f302799a = vVar;
            this.f302800b = oVar;
            this.f302801c = cVar;
        }

        @Override // ej.a
        public boolean L(T t10) {
            int i10;
            if (this.f302803e) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    this.f302799a.onNext(io.reactivex.internal.functions.b.g(this.f302800b.apply(t10), "The mapper returned a null value"));
                    return true;
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    try {
                        j10++;
                        i10 = a.f302793a[((io.reactivex.parallel.a) io.reactivex.internal.functions.b.g(this.f302801c.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.b.b(th3);
                        cancel();
                        onError(new io.reactivex.exceptions.a(th2, th3));
                        return false;
                    }
                }
            } while (i10 == 1);
            if (i10 != 2) {
                if (i10 != 3) {
                    cancel();
                    onError(th2);
                    return false;
                }
                cancel();
                onComplete();
            }
            return false;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f302802d.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f302802d, wVar)) {
                this.f302802d = wVar;
                this.f302799a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f302803e) {
                return;
            }
            this.f302803e = true;
            this.f302799a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f302803e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302803e = true;
                this.f302799a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (L(t10) || this.f302803e) {
                return;
            }
            this.f302802d.request(1L);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f302802d.request(j10);
        }
    }

    public k(io.reactivex.parallel.b<T> bVar, dj.o<? super T, ? extends R> oVar, dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> cVar) {
        this.f302790a = bVar;
        this.f302791b = oVar;
        this.f302792c = cVar;
    }

    @Override // io.reactivex.parallel.b
    public int F() {
        return this.f302790a.F();
    }

    @Override // io.reactivex.parallel.b
    public void Q(v<? super R>[] vVarArr) {
        if (U(vVarArr)) {
            int length = vVarArr.length;
            v<? super T>[] vVarArr2 = new v[length];
            for (int i10 = 0; i10 < length; i10++) {
                v<? super R> vVar = vVarArr[i10];
                if (vVar instanceof ej.a) {
                    vVarArr2[i10] = new b((ej.a) vVar, this.f302791b, this.f302792c);
                } else {
                    vVarArr2[i10] = new c(vVar, this.f302791b, this.f302792c);
                }
            }
            this.f302790a.Q(vVarArr2);
        }
    }
}
