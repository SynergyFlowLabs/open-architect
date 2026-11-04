package io.reactivex.internal.operators.parallel;

import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class c<T> extends io.reactivex.parallel.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.b<T> f302704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super T> f302705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> f302706c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f302707a;

        static {
            int[] iArr = new int[io.reactivex.parallel.a.values().length];
            f302707a = iArr;
            try {
                iArr[io.reactivex.parallel.a.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f302707a[io.reactivex.parallel.a.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f302707a[io.reactivex.parallel.a.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static final class b<T> implements ej.a<T>, w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ej.a<? super T> f302708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.g<? super T> f302709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> f302710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        w f302711d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f302712e;

        b(ej.a<? super T> aVar, dj.g<? super T> gVar, dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> cVar) {
            this.f302708a = aVar;
            this.f302709b = gVar;
            this.f302710c = cVar;
        }

        @Override // ej.a
        public boolean L(T t10) {
            int i10;
            if (this.f302712e) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    this.f302709b.accept(t10);
                    return this.f302708a.L(t10);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    try {
                        j10++;
                        i10 = a.f302707a[((io.reactivex.parallel.a) io.reactivex.internal.functions.b.g(this.f302710c.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.b.b(th3);
                        cancel();
                        onError(new io.reactivex.exceptions.a(th2, th3));
                        return false;
                    }
                }
            } while (i10 == 1);
            if (i10 != 2) {
                int i11 = 6 >> 3;
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
            this.f302711d.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f302711d, wVar)) {
                this.f302711d = wVar;
                this.f302708a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f302712e) {
                return;
            }
            this.f302712e = true;
            this.f302708a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f302712e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302712e = true;
                this.f302708a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (L(t10) || this.f302712e) {
                return;
            }
            this.f302711d.request(1L);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f302711d.request(j10);
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.operators.parallel.c$c, reason: collision with other inner class name */
    static final class C2185c<T> implements ej.a<T>, w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super T> f302713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.g<? super T> f302714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> f302715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        w f302716d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f302717e;

        C2185c(v<? super T> vVar, dj.g<? super T> gVar, dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> cVar) {
            this.f302713a = vVar;
            this.f302714b = gVar;
            this.f302715c = cVar;
        }

        @Override // ej.a
        public boolean L(T t10) {
            int i10;
            if (this.f302717e) {
                return false;
            }
            long j10 = 0;
            do {
                try {
                    this.f302714b.accept(t10);
                    this.f302713a.onNext(t10);
                    return true;
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    try {
                        j10++;
                        i10 = a.f302707a[((io.reactivex.parallel.a) io.reactivex.internal.functions.b.g(this.f302715c.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
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
            this.f302716d.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f302716d, wVar)) {
                this.f302716d = wVar;
                this.f302713a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f302717e) {
                return;
            }
            this.f302717e = true;
            this.f302713a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f302717e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302717e = true;
                this.f302713a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (L(t10)) {
                return;
            }
            this.f302716d.request(1L);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f302716d.request(j10);
        }
    }

    public c(io.reactivex.parallel.b<T> bVar, dj.g<? super T> gVar, dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> cVar) {
        this.f302704a = bVar;
        this.f302705b = gVar;
        this.f302706c = cVar;
    }

    @Override // io.reactivex.parallel.b
    public int F() {
        return this.f302704a.F();
    }

    @Override // io.reactivex.parallel.b
    public void Q(v<? super T>[] vVarArr) {
        if (U(vVarArr)) {
            int length = vVarArr.length;
            v<? super T>[] vVarArr2 = new v[length];
            for (int i10 = 0; i10 < length; i10++) {
                v<? super T> vVar = vVarArr[i10];
                if (vVar instanceof ej.a) {
                    vVarArr2[i10] = new b((ej.a) vVar, this.f302705b, this.f302706c);
                } else {
                    vVarArr2[i10] = new C2185c(vVar, this.f302705b, this.f302706c);
                }
            }
            this.f302704a.Q(vVarArr2);
        }
    }
}
