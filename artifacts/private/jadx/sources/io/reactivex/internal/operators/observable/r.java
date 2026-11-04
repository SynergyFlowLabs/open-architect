package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class r<T> extends io.reactivex.internal.operators.observable.a<T, T> implements io.reactivex.i0<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final a[] f302209k = new a[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final a[] f302210l = new a[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicBoolean f302211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f302212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<a<T>[]> f302213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile long f302214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final b<T> f302215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    b<T> f302216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f302217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Throwable f302218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    volatile boolean f302219j;

    static final class a<T> extends AtomicInteger implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f302220g = 6770240836423125754L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final r<T> f302222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        b<T> f302223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f302224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f302225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f302226f;

        a(io.reactivex.i0<? super T> i0Var, r<T> rVar) {
            this.f302221a = i0Var;
            this.f302222b = rVar;
            this.f302223c = rVar.f302215f;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f302226f) {
                return;
            }
            this.f302226f = true;
            this.f302222b.l8(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302226f;
        }
    }

    static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T[] f302227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile b<T> f302228b;

        b(int i10) {
            this.f302227a = (T[]) new Object[i10];
        }
    }

    public r(io.reactivex.b0<T> b0Var, int i10) {
        super(b0Var);
        this.f302212c = i10;
        this.f302211b = new AtomicBoolean();
        b<T> bVar = new b<>(i10);
        this.f302215f = bVar;
        this.f302216g = bVar;
        this.f302213d = new AtomicReference<>(f302209k);
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        a<T> aVar = new a<>(i0Var, this);
        i0Var.d(aVar);
        h8(aVar);
        if (this.f302211b.get() || !this.f302211b.compareAndSet(false, true)) {
            m8(aVar);
        } else {
            this.f301291a.a(this);
        }
    }

    @Override // io.reactivex.i0
    public void d(io.reactivex.disposables.c cVar) {
    }

    void h8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f302213d.get();
            if (aVarArr == f302210l) {
                return;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!androidx.compose.animation.core.z1.a(this.f302213d, aVarArr, aVarArr2));
    }

    long i8() {
        return this.f302214e;
    }

    boolean j8() {
        return this.f302213d.get().length != 0;
    }

    boolean k8() {
        return this.f302211b.get();
    }

    void l8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f302213d.get();
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
                aVarArr2 = f302209k;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!androidx.compose.animation.core.z1.a(this.f302213d, aVarArr, aVarArr2));
    }

    void m8(a<T> aVar) {
        if (aVar.getAndIncrement() == 0) {
            long j10 = aVar.f302225e;
            int i10 = aVar.f302224d;
            b<T> bVar = aVar.f302223c;
            io.reactivex.i0<? super T> i0Var = aVar.f302221a;
            int i11 = this.f302212c;
            int iAddAndGet = 1;
            while (!aVar.f302226f) {
                boolean z10 = this.f302219j;
                boolean z11 = this.f302214e == j10;
                if (z10 && z11) {
                    aVar.f302223c = null;
                    Throwable th2 = this.f302218i;
                    if (th2 != null) {
                        i0Var.onError(th2);
                        return;
                    } else {
                        i0Var.onComplete();
                        return;
                    }
                }
                if (z11) {
                    aVar.f302225e = j10;
                    aVar.f302224d = i10;
                    aVar.f302223c = bVar;
                    iAddAndGet = aVar.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                    }
                } else {
                    if (i10 == i11) {
                        bVar = bVar.f302228b;
                        i10 = 0;
                    }
                    i0Var.onNext(bVar.f302227a[i10]);
                    i10++;
                    j10++;
                }
            }
            aVar.f302223c = null;
        }
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        this.f302219j = true;
        for (a<T> aVar : this.f302213d.getAndSet(f302210l)) {
            m8(aVar);
        }
    }

    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        this.f302218i = th2;
        this.f302219j = true;
        for (a<T> aVar : this.f302213d.getAndSet(f302210l)) {
            m8(aVar);
        }
    }

    @Override // io.reactivex.i0
    public void onNext(T t10) {
        int i10 = this.f302217h;
        boolean z10 = !false;
        if (i10 == this.f302212c) {
            b<T> bVar = new b<>(i10);
            bVar.f302227a[0] = t10;
            this.f302217h = 1;
            this.f302216g.f302228b = bVar;
            this.f302216g = bVar;
        } else {
            this.f302216g.f302227a[i10] = t10;
            this.f302217h = i10 + 1;
        }
        this.f302214e++;
        for (a<T> aVar : this.f302213d.get()) {
            m8(aVar);
        }
    }
}
