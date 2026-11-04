package io.reactivex.internal.operators.flowable;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public final class y4<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @cj.g
    final org.reactivestreams.u<?>[] f300551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @cj.g
    final Iterable<? extends org.reactivestreams.u<?>> f300552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final dj.o<? super Object[], R> f300553e;

    final class a implements dj.o<T, R> {
        a() {
        }

        @Override // dj.o
        public R apply(T t10) throws Exception {
            return (R) io.reactivex.internal.functions.b.g(y4.this.f300553e.apply(new Object[]{t10}), "The combiner returned a null value");
        }
    }

    static final class b<T, R> extends AtomicInteger implements ej.a<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f300555i = 1577321883966341961L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f300556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super Object[], R> f300557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final c[] f300558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceArray<Object> f300559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f300560e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f300561f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final io.reactivex.internal.util.c f300562g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f300563h;

        b(org.reactivestreams.v<? super R> vVar, dj.o<? super Object[], R> oVar, int i10) {
            this.f300556a = vVar;
            this.f300557b = oVar;
            c[] cVarArr = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11] = new c(this, i11);
            }
            this.f300558c = cVarArr;
            this.f300559d = new AtomicReferenceArray<>(i10);
            this.f300560e = new AtomicReference<>();
            this.f300561f = new AtomicLong();
            this.f300562g = new io.reactivex.internal.util.c();
        }

        @Override // ej.a
        public boolean L(T t10) {
            if (this.f300563h) {
                return false;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f300559d;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            objArr[0] = t10;
            int i10 = 0;
            while (i10 < length) {
                Object obj = atomicReferenceArray.get(i10);
                if (obj == null) {
                    return false;
                }
                i10++;
                objArr[i10] = obj;
            }
            try {
                io.reactivex.internal.util.l.f(this.f300556a, io.reactivex.internal.functions.b.g(this.f300557b.apply(objArr), "The combiner returned a null value"), this, this.f300562g);
                return true;
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                cancel();
                onError(th2);
                return false;
            }
        }

        void a(int i10) {
            c[] cVarArr = this.f300558c;
            for (int i11 = 0; i11 < cVarArr.length; i11++) {
                if (i11 != i10) {
                    cVarArr[i11].a();
                }
            }
        }

        void b(int i10, boolean z10) {
            if (!z10) {
                this.f300563h = true;
                io.reactivex.internal.subscriptions.j.b(this.f300560e);
                a(i10);
                io.reactivex.internal.util.l.b(this.f300556a, this, this.f300562g);
            }
        }

        void c(int i10, Throwable th2) {
            this.f300563h = true;
            io.reactivex.internal.subscriptions.j.b(this.f300560e);
            a(i10);
            io.reactivex.internal.util.l.d(this.f300556a, th2, this, this.f300562g);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            io.reactivex.internal.subscriptions.j.b(this.f300560e);
            for (c cVar : this.f300558c) {
                cVar.a();
            }
        }

        void d(int i10, Object obj) {
            this.f300559d.set(i10, obj);
        }

        void e(org.reactivestreams.u<?>[] uVarArr, int i10) {
            c[] cVarArr = this.f300558c;
            AtomicReference<org.reactivestreams.w> atomicReference = this.f300560e;
            for (int i11 = 0; i11 < i10 && atomicReference.get() != io.reactivex.internal.subscriptions.j.CANCELLED; i11++) {
                uVarArr[i11].e(cVarArr[i11]);
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.d(this.f300560e, this.f300561f, wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (!this.f300563h) {
                this.f300563h = true;
                a(-1);
                io.reactivex.internal.util.l.b(this.f300556a, this, this.f300562g);
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300563h) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f300563h = true;
            a(-1);
            io.reactivex.internal.util.l.d(this.f300556a, th2, this, this.f300562g);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (L(t10) || this.f300563h) {
                return;
            }
            this.f300560e.get().request(1L);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.subscriptions.j.c(this.f300560e, this.f300561f, j10);
        }
    }

    static final class c extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f300564d = 3256684027868224024L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b<?, ?> f300565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f300566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f300567c;

        c(b<?, ?> bVar, int i10) {
            this.f300565a = bVar;
            this.f300566b = i10;
        }

        void a() {
            io.reactivex.internal.subscriptions.j.b(this);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.o(this, wVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300565a.b(this.f300566b, this.f300567c);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300565a.c(this.f300566b, th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(Object obj) {
            if (!this.f300567c) {
                this.f300567c = true;
            }
            this.f300565a.d(this.f300566b, obj);
        }
    }

    public y4(@cj.f io.reactivex.l<T> lVar, @cj.f org.reactivestreams.u<?>[] uVarArr, dj.o<? super Object[], R> oVar) {
        super(lVar);
        this.f300551c = uVarArr;
        this.f300552d = null;
        this.f300553e = oVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        int length;
        org.reactivestreams.u<?>[] uVarArr = this.f300551c;
        if (uVarArr == null) {
            uVarArr = new org.reactivestreams.u[8];
            try {
                length = 0;
                for (org.reactivestreams.u<?> uVar : this.f300552d) {
                    if (length == uVarArr.length) {
                        uVarArr = (org.reactivestreams.u[]) Arrays.copyOf(uVarArr, (length >> 1) + length);
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
            new b2(this.f299043b, new a()).k6(vVar);
            return;
        }
        b bVar = new b(vVar, this.f300553e, length);
        vVar.l(bVar);
        bVar.e(uVarArr, length);
        this.f299043b.j6(bVar);
    }

    public y4(@cj.f io.reactivex.l<T> lVar, @cj.f Iterable<? extends org.reactivestreams.u<?>> iterable, @cj.f dj.o<? super Object[], R> oVar) {
        super(lVar);
        this.f300551c = null;
        this.f300552d = iterable;
        this.f300553e = oVar;
    }
}
