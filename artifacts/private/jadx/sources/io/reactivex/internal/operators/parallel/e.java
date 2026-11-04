package io.reactivex.internal.operators.parallel;

import dj.r;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class e<T> extends io.reactivex.parallel.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.b<T> f302725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r<? super T> f302726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> f302727c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f302728a;

        static {
            int[] iArr = new int[io.reactivex.parallel.a.values().length];
            f302728a = iArr;
            try {
                iArr[io.reactivex.parallel.a.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f302728a[io.reactivex.parallel.a.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f302728a[io.reactivex.parallel.a.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static abstract class b<T> implements ej.a<T>, w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final r<? super T> f302729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> f302730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        w f302731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f302732d;

        b(r<? super T> rVar, dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> cVar) {
            this.f302729a = rVar;
            this.f302730b = cVar;
        }

        @Override // org.reactivestreams.w
        public final void cancel() {
            this.f302731c.cancel();
        }

        @Override // org.reactivestreams.v
        public final void onNext(T t10) {
            if (L(t10) || this.f302732d) {
                return;
            }
            this.f302731c.request(1L);
        }

        @Override // org.reactivestreams.w
        public final void request(long j10) {
            this.f302731c.request(j10);
        }
    }

    static final class c<T> extends b<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final ej.a<? super T> f302733e;

        c(ej.a<? super T> aVar, r<? super T> rVar, dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> cVar) {
            super(rVar, cVar);
            this.f302733e = aVar;
        }

        @Override // ej.a
        public boolean L(T t10) {
            int i10;
            if (!this.f302732d) {
                long j10 = 0;
                do {
                    try {
                        return this.f302729a.test(t10) && this.f302733e.L(t10);
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        try {
                            j10++;
                            i10 = a.f302728a[((io.reactivex.parallel.a) io.reactivex.internal.functions.b.g(this.f302730b.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
                        } catch (Throwable th3) {
                            io.reactivex.exceptions.b.b(th3);
                            cancel();
                            onError(new io.reactivex.exceptions.a(th2, th3));
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
            return false;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f302731c, wVar)) {
                this.f302731c = wVar;
                this.f302733e.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f302732d) {
                return;
            }
            this.f302732d = true;
            this.f302733e.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f302732d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302732d = true;
                this.f302733e.onError(th2);
            }
        }
    }

    static final class d<T> extends b<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final v<? super T> f302734e;

        d(v<? super T> vVar, r<? super T> rVar, dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> cVar) {
            super(rVar, cVar);
            this.f302734e = vVar;
        }

        @Override // ej.a
        public boolean L(T t10) {
            int i10;
            if (!this.f302732d) {
                long j10 = 0;
                do {
                    try {
                        if (!this.f302729a.test(t10)) {
                            return false;
                        }
                        this.f302734e.onNext(t10);
                        return true;
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        try {
                            j10++;
                            i10 = a.f302728a[((io.reactivex.parallel.a) io.reactivex.internal.functions.b.g(this.f302730b.apply(Long.valueOf(j10), th2), "The errorHandler returned a null item")).ordinal()];
                        } catch (Throwable th3) {
                            io.reactivex.exceptions.b.b(th3);
                            cancel();
                            onError(new io.reactivex.exceptions.a(th2, th3));
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
            return false;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f302731c, wVar)) {
                this.f302731c = wVar;
                this.f302734e.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f302732d) {
                return;
            }
            this.f302732d = true;
            this.f302734e.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f302732d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302732d = true;
                this.f302734e.onError(th2);
            }
        }
    }

    public e(io.reactivex.parallel.b<T> bVar, r<? super T> rVar, dj.c<? super Long, ? super Throwable, io.reactivex.parallel.a> cVar) {
        this.f302725a = bVar;
        this.f302726b = rVar;
        this.f302727c = cVar;
    }

    @Override // io.reactivex.parallel.b
    public int F() {
        return this.f302725a.F();
    }

    @Override // io.reactivex.parallel.b
    public void Q(v<? super T>[] vVarArr) {
        if (U(vVarArr)) {
            int length = vVarArr.length;
            v<? super T>[] vVarArr2 = new v[length];
            for (int i10 = 0; i10 < length; i10++) {
                v<? super T> vVar = vVarArr[i10];
                if (vVar instanceof ej.a) {
                    vVarArr2[i10] = new c((ej.a) vVar, this.f302726b, this.f302727c);
                } else {
                    vVarArr2[i10] = new d(vVar, this.f302726b, this.f302727c);
                }
            }
            this.f302725a.Q(vVarArr2);
        }
    }
}
