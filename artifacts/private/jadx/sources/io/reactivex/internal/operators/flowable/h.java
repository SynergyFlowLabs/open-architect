package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class h<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<? extends T>[] f299444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Iterable<? extends org.reactivestreams.u<? extends T>> f299445c;

    static final class a<T> implements org.reactivestreams.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T>[] f299447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicInteger f299448c = new AtomicInteger();

        a(org.reactivestreams.v<? super T> vVar, int i10) {
            this.f299446a = vVar;
            this.f299447b = new b[i10];
        }

        public void a(org.reactivestreams.u<? extends T>[] uVarArr) {
            b<T>[] bVarArr = this.f299447b;
            int length = bVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                bVarArr[i10] = new b<>(this, i11, this.f299446a);
                i10 = i11;
            }
            this.f299448c.lazySet(0);
            this.f299446a.l(this);
            for (int i12 = 0; i12 < length && this.f299448c.get() == 0; i12++) {
                uVarArr[i12].e(bVarArr[i12]);
            }
        }

        public boolean b(int i10) {
            int i11 = 0;
            if (this.f299448c.get() != 0 || !this.f299448c.compareAndSet(0, i10)) {
                return false;
            }
            b<T>[] bVarArr = this.f299447b;
            int length = bVarArr.length;
            while (i11 < length) {
                int i12 = i11 + 1;
                if (i12 != i10) {
                    bVarArr[i11].cancel();
                }
                i11 = i12;
            }
            return true;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f299448c.get() != -1) {
                this.f299448c.lazySet(-1);
                for (b<T> bVar : this.f299447b) {
                    bVar.cancel();
                }
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                int i10 = this.f299448c.get();
                if (i10 > 0) {
                    this.f299447b[i10 - 1].request(j10);
                } else if (i10 == 0) {
                    for (b<T> bVar : this.f299447b) {
                        bVar.request(j10);
                    }
                }
            }
        }
    }

    static final class b<T> extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f299449f = -1185974347409665484L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<T> f299450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f299451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f299453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f299454e = new AtomicLong();

        b(a<T> aVar, int i10, org.reactivestreams.v<? super T> vVar) {
            this.f299450a = aVar;
            this.f299451b = i10;
            this.f299452c = vVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            io.reactivex.internal.subscriptions.j.b(this);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.d(this, this.f299454e, wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299453d) {
                this.f299452c.onComplete();
            } else if (!this.f299450a.b(this.f299451b)) {
                get().cancel();
            } else {
                this.f299453d = true;
                this.f299452c.onComplete();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299453d) {
                this.f299452c.onError(th2);
            } else if (this.f299450a.b(this.f299451b)) {
                this.f299453d = true;
                this.f299452c.onError(th2);
            } else {
                get().cancel();
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299453d) {
                this.f299452c.onNext(t10);
            } else if (!this.f299450a.b(this.f299451b)) {
                get().cancel();
            } else {
                this.f299453d = true;
                this.f299452c.onNext(t10);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.subscriptions.j.c(this, this.f299454e, j10);
        }
    }

    public h(org.reactivestreams.u<? extends T>[] uVarArr, Iterable<? extends org.reactivestreams.u<? extends T>> iterable) {
        this.f299444b = uVarArr;
        this.f299445c = iterable;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        int length;
        org.reactivestreams.u<? extends T>[] uVarArr = this.f299444b;
        if (uVarArr == null) {
            uVarArr = new org.reactivestreams.u[8];
            try {
                length = 0;
                for (org.reactivestreams.u<? extends T> uVar : this.f299445c) {
                    if (uVar == null) {
                        io.reactivex.internal.subscriptions.g.c(new NullPointerException("One of the sources is null"), vVar);
                        return;
                    }
                    if (length == uVarArr.length) {
                        org.reactivestreams.u<? extends T>[] uVarArr2 = new org.reactivestreams.u[(length >> 2) + length];
                        System.arraycopy(uVarArr, 0, uVarArr2, 0, length);
                        uVarArr = uVarArr2;
                    }
                    int i10 = length + 1;
                    uVarArr[length] = uVar;
                    length = i10;
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.internal.subscriptions.g.c(th2, vVar);
                return;
            }
        } else {
            length = uVarArr.length;
        }
        if (length == 0) {
            io.reactivex.internal.subscriptions.g.b(vVar);
        } else if (length == 1) {
            uVarArr[0].e(vVar);
        } else {
            new a(vVar, length).a(uVarArr);
        }
    }
}
