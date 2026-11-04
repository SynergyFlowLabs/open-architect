package io.reactivex.internal.operators.flowable;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class z4<T, R> extends io.reactivex.l<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<? extends T>[] f300645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Iterable<? extends org.reactivestreams.u<? extends T>> f300646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.o<? super Object[], ? extends R> f300647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f300648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f300649f;

    static final class a<T, R> extends AtomicInteger implements org.reactivestreams.w {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f300650i = -2434867452883857743L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f300651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T, R>[] f300652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.o<? super Object[], ? extends R> f300653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f300654d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.util.c f300655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f300656f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f300657g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Object[] f300658h;

        a(org.reactivestreams.v<? super R> vVar, dj.o<? super Object[], ? extends R> oVar, int i10, int i11, boolean z10) {
            this.f300651a = vVar;
            this.f300653c = oVar;
            this.f300656f = z10;
            b<T, R>[] bVarArr = new b[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                bVarArr[i12] = new b<>(this, i11);
            }
            this.f300658h = new Object[i10];
            this.f300652b = bVarArr;
            this.f300654d = new AtomicLong();
            this.f300655e = new io.reactivex.internal.util.c();
        }

        void a() {
            for (b<T, R> bVar : this.f300652b) {
                bVar.cancel();
            }
        }

        void b() {
            long j10;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.v<? super R> vVar = this.f300651a;
            b<T, R>[] bVarArr = this.f300652b;
            int length = bVarArr.length;
            Object[] objArr = this.f300658h;
            int iAddAndGet = 1;
            do {
                long j11 = this.f300654d.get();
                long j12 = 0;
                while (true) {
                    if (j11 == j12) {
                        j10 = 0;
                        break;
                    }
                    if (this.f300657g) {
                        return;
                    }
                    if (!this.f300656f && this.f300655e.get() != null) {
                        a();
                        vVar.onError(this.f300655e.c());
                        return;
                    }
                    boolean z10 = false;
                    for (int i10 = 0; i10 < length; i10++) {
                        b<T, R> bVar = bVarArr[i10];
                        if (objArr[i10] == null) {
                            try {
                                boolean z11 = bVar.f300665f;
                                ej.o<T> oVar = bVar.f300663d;
                                T tPoll = oVar != null ? oVar.poll() : null;
                                boolean z12 = tPoll == null;
                                if (z11 && z12) {
                                    a();
                                    if (this.f300655e.get() != null) {
                                        vVar.onError(this.f300655e.c());
                                        return;
                                    } else {
                                        vVar.onComplete();
                                        return;
                                    }
                                }
                                if (z12) {
                                    z10 = true;
                                } else {
                                    objArr[i10] = tPoll;
                                }
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                this.f300655e.a(th2);
                                if (!this.f300656f) {
                                    a();
                                    vVar.onError(this.f300655e.c());
                                    return;
                                }
                            }
                        }
                    }
                    j10 = 0;
                    if (z10) {
                        break;
                    }
                    try {
                        vVar.onNext((Object) io.reactivex.internal.functions.b.g(this.f300653c.apply(objArr.clone()), "The zipper returned a null value"));
                        j12++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.b.b(th3);
                        a();
                        this.f300655e.a(th3);
                        vVar.onError(this.f300655e.c());
                        return;
                    }
                }
                if (j11 == j12) {
                    if (this.f300657g) {
                        return;
                    }
                    if (!this.f300656f && this.f300655e.get() != null) {
                        a();
                        vVar.onError(this.f300655e.c());
                        return;
                    }
                    for (int i11 = 0; i11 < length; i11++) {
                        b<T, R> bVar2 = bVarArr[i11];
                        if (objArr[i11] == null) {
                            try {
                                boolean z13 = bVar2.f300665f;
                                ej.o<T> oVar2 = bVar2.f300663d;
                                T tPoll2 = oVar2 != null ? oVar2.poll() : null;
                                boolean z14 = tPoll2 == null;
                                if (z13 && z14) {
                                    a();
                                    if (this.f300655e.get() != null) {
                                        vVar.onError(this.f300655e.c());
                                        return;
                                    } else {
                                        vVar.onComplete();
                                        return;
                                    }
                                }
                                if (!z14) {
                                    objArr[i11] = tPoll2;
                                }
                            } catch (Throwable th4) {
                                io.reactivex.exceptions.b.b(th4);
                                this.f300655e.a(th4);
                                if (!this.f300656f) {
                                    a();
                                    vVar.onError(this.f300655e.c());
                                    return;
                                }
                            }
                        }
                    }
                }
                if (j12 != j10) {
                    for (b<T, R> bVar3 : bVarArr) {
                        bVar3.request(j12);
                    }
                    if (j11 != Long.MAX_VALUE) {
                        this.f300654d.addAndGet(-j12);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        void c(b<T, R> bVar, Throwable th2) {
            if (!this.f300655e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                bVar.f300665f = true;
                b();
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f300657g) {
                return;
            }
            this.f300657g = true;
            a();
        }

        void d(org.reactivestreams.u<? extends T>[] uVarArr, int i10) {
            b<T, R>[] bVarArr = this.f300652b;
            for (int i11 = 0; i11 < i10 && !this.f300657g; i11++) {
                if (!this.f300656f && this.f300655e.get() != null) {
                    return;
                }
                uVarArr[i11].e(bVarArr[i11]);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f300654d, j10);
                b();
            }
        }
    }

    static final class b<T, R> extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f300659h = -4627193790118206028L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<T, R> f300660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f300661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f300662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ej.o<T> f300663d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f300664e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f300665f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f300666g;

        b(a<T, R> aVar, int i10) {
            this.f300660a = aVar;
            this.f300661b = i10;
            this.f300662c = i10 - (i10 >> 2);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            io.reactivex.internal.subscriptions.j.b(this);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.n(this, wVar)) {
                if (wVar instanceof ej.l) {
                    ej.l lVar = (ej.l) wVar;
                    int iP = lVar.p(7);
                    if (iP == 1) {
                        this.f300666g = iP;
                        this.f300663d = lVar;
                        this.f300665f = true;
                        this.f300660a.b();
                        return;
                    }
                    if (iP == 2) {
                        this.f300666g = iP;
                        this.f300663d = lVar;
                        wVar.request(this.f300661b);
                        return;
                    }
                }
                this.f300663d = new io.reactivex.internal.queue.b(this.f300661b);
                wVar.request(this.f300661b);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300665f = true;
            this.f300660a.b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300660a.c(this, th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f300666g != 2) {
                this.f300663d.offer(t10);
            }
            this.f300660a.b();
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (this.f300666g != 1) {
                long j11 = this.f300664e + j10;
                if (j11 < this.f300662c) {
                    this.f300664e = j11;
                } else {
                    this.f300664e = 0L;
                    get().request(j11);
                }
            }
        }
    }

    public z4(org.reactivestreams.u<? extends T>[] uVarArr, Iterable<? extends org.reactivestreams.u<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f300645b = uVarArr;
        this.f300646c = iterable;
        this.f300647d = oVar;
        this.f300648e = i10;
        this.f300649f = z10;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super R> vVar) {
        int length;
        org.reactivestreams.u<? extends T>[] uVarArr = this.f300645b;
        if (uVarArr == null) {
            uVarArr = new org.reactivestreams.u[8];
            length = 0;
            for (org.reactivestreams.u<? extends T> uVar : this.f300646c) {
                if (length == uVarArr.length) {
                    org.reactivestreams.u<? extends T>[] uVarArr2 = new org.reactivestreams.u[(length >> 2) + length];
                    System.arraycopy(uVarArr, 0, uVarArr2, 0, length);
                    uVarArr = uVarArr2;
                }
                uVarArr[length] = uVar;
                length++;
            }
        } else {
            length = uVarArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            io.reactivex.internal.subscriptions.g.b(vVar);
            return;
        }
        a aVar = new a(vVar, this.f300647d, i10, this.f300648e, this.f300649f);
        vVar.l(aVar);
        aVar.d(uVarArr, i10);
    }
}
