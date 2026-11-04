package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class r<T> extends io.reactivex.internal.operators.flowable.a<T, T> implements io.reactivex.q<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final a[] f300026l = new a[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final a[] f300027m = new a[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f300028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f300029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicReference<a<T>[]> f300030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile long f300031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final b<T> f300032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    b<T> f300033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f300034i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Throwable f300035j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    volatile boolean f300036k;

    static final class a<T> extends AtomicInteger implements org.reactivestreams.w {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f300037g = 6770240836423125754L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final r<T> f300039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicLong f300040c = new AtomicLong();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        b<T> f300041d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f300042e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f300043f;

        a(org.reactivestreams.v<? super T> vVar, r<T> rVar) {
            this.f300038a = vVar;
            this.f300039b = rVar;
            this.f300041d = rVar.f300032g;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f300040c.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f300039b.Q8(this);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.b(this.f300040c, j10);
                this.f300039b.R8(this);
            }
        }
    }

    static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T[] f300044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile b<T> f300045b;

        b(int i10) {
            this.f300044a = (T[]) new Object[i10];
        }
    }

    public r(io.reactivex.l<T> lVar, int i10) {
        super(lVar);
        this.f300029d = i10;
        this.f300028c = new AtomicBoolean();
        b<T> bVar = new b<>(i10);
        this.f300032g = bVar;
        this.f300033h = bVar;
        this.f300030e = new AtomicReference<>(f300026l);
    }

    void M8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f300030e.get();
            if (aVarArr == f300027m) {
                return;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!androidx.compose.animation.core.z1.a(this.f300030e, aVarArr, aVarArr2));
    }

    long N8() {
        return this.f300031f;
    }

    boolean O8() {
        return this.f300030e.get().length != 0;
    }

    boolean P8() {
        return this.f300028c.get();
    }

    void Q8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f300030e.get();
            int length = aVarArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (aVarArr[i10] == aVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr2 = f300026l;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!androidx.compose.animation.core.z1.a(this.f300030e, aVarArr, aVarArr2));
    }

    void R8(a<T> aVar) {
        if (aVar.getAndIncrement() != 0) {
            return;
        }
        long j10 = aVar.f300043f;
        int i10 = aVar.f300042e;
        b<T> bVar = aVar.f300041d;
        AtomicLong atomicLong = aVar.f300040c;
        org.reactivestreams.v<? super T> vVar = aVar.f300038a;
        int i11 = this.f300029d;
        int iAddAndGet = 1;
        while (true) {
            boolean z10 = this.f300036k;
            boolean z11 = this.f300031f == j10;
            if (z10 && z11) {
                aVar.f300041d = null;
                Throwable th2 = this.f300035j;
                if (th2 != null) {
                    vVar.onError(th2);
                    return;
                } else {
                    vVar.onComplete();
                    return;
                }
            }
            if (!z11) {
                long j11 = atomicLong.get();
                if (j11 == Long.MIN_VALUE) {
                    aVar.f300041d = null;
                    return;
                } else if (j11 != j10) {
                    if (i10 == i11) {
                        bVar = bVar.f300045b;
                        i10 = 0;
                    }
                    vVar.onNext(bVar.f300044a[i10]);
                    i10++;
                    j10++;
                }
            }
            aVar.f300043f = j10;
            aVar.f300042e = i10;
            aVar.f300041d = bVar;
            iAddAndGet = aVar.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        a<T> aVar = new a<>(vVar, this);
        vVar.l(aVar);
        M8(aVar);
        if (this.f300028c.get() || !this.f300028c.compareAndSet(false, true)) {
            R8(aVar);
        } else {
            this.f299043b.j6(this);
        }
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public void l(org.reactivestreams.w wVar) {
        wVar.request(Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        this.f300036k = true;
        for (a<T> aVar : this.f300030e.getAndSet(f300027m)) {
            R8(aVar);
        }
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        if (this.f300036k) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f300035j = th2;
        this.f300036k = true;
        for (a<T> aVar : this.f300030e.getAndSet(f300027m)) {
            R8(aVar);
        }
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        int i10 = this.f300034i;
        if (i10 == this.f300029d) {
            b<T> bVar = new b<>(i10);
            bVar.f300044a[0] = t10;
            this.f300034i = 1;
            this.f300033h.f300045b = bVar;
            this.f300033h = bVar;
        } else {
            this.f300033h.f300044a[i10] = t10;
            this.f300034i = i10 + 1;
        }
        this.f300031f++;
        for (a<T> aVar : this.f300030e.get()) {
            R8(aVar);
        }
    }
}
