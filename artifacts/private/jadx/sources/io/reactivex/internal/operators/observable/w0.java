package io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class w0<T, U> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.g0<? extends U>> f302500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f302501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f302502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f302503e;

    static final class a<T, U> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<U> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f302504f = -4606175640614850599L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f302505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T, U> f302506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f302507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile ej.o<U> f302508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f302509e;

        a(b<T, U> bVar, long j10) {
            this.f302505a = j10;
            this.f302506b = bVar;
        }

        public void a() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar) && (cVar instanceof ej.j)) {
                ej.j jVar = (ej.j) cVar;
                int iP = jVar.p(7);
                if (iP == 1) {
                    this.f302509e = iP;
                    this.f302508d = jVar;
                    this.f302507c = true;
                    this.f302506b.e();
                    return;
                }
                if (iP == 2) {
                    this.f302509e = iP;
                    this.f302508d = jVar;
                }
            }
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302507c = true;
            this.f302506b.e();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (!this.f302506b.f302520h.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            b<T, U> bVar = this.f302506b;
            if (!bVar.f302515c) {
                bVar.c();
            }
            this.f302507c = true;
            this.f302506b.e();
        }

        @Override // io.reactivex.i0
        public void onNext(U u10) {
            if (this.f302509e == 0) {
                this.f302506b.i(u10, this);
            } else {
                this.f302506b.e();
            }
        }
    }

    static final class b<T, U> extends AtomicInteger implements io.reactivex.disposables.c, io.reactivex.i0<T> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final long f302510t = -2117620485640801370L;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        static final a<?, ?>[] f302511v = new a[0];

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        static final a<?, ?>[] f302512w = new a[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super U> f302513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.g0<? extends U>> f302514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f302515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f302516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f302517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile ej.n<U> f302518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f302519g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final io.reactivex.internal.util.c f302520h = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f302521i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicReference<a<?, ?>[]> f302522j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        io.reactivex.disposables.c f302523k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        long f302524l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f302525m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f302526n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Queue<io.reactivex.g0<? extends U>> f302527o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f302528s;

        b(io.reactivex.i0<? super U> i0Var, dj.o<? super T, ? extends io.reactivex.g0<? extends U>> oVar, boolean z10, int i10, int i11) {
            this.f302513a = i0Var;
            this.f302514b = oVar;
            this.f302515c = z10;
            this.f302516d = i10;
            this.f302517e = i11;
            if (i10 != Integer.MAX_VALUE) {
                this.f302527o = new ArrayDeque(i10);
            }
            this.f302522j = new AtomicReference<>(f302511v);
        }

        boolean a(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.f302522j.get();
                if (aVarArr == f302512w) {
                    aVar.a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!androidx.compose.animation.core.z1.a(this.f302522j, aVarArr, aVarArr2));
            return true;
        }

        boolean b() {
            if (this.f302521i) {
                return true;
            }
            Throwable th2 = this.f302520h.get();
            if (this.f302515c || th2 == null) {
                return false;
            }
            c();
            Throwable thC = this.f302520h.c();
            if (thC != io.reactivex.internal.util.k.f303486a) {
                this.f302513a.onError(thC);
            }
            return true;
        }

        boolean c() {
            a<?, ?>[] andSet;
            this.f302523k.dispose();
            a<?, ?>[] aVarArr = this.f302522j.get();
            a<?, ?>[] aVarArr2 = f302512w;
            if (aVarArr == aVarArr2 || (andSet = this.f302522j.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.a();
            }
            return true;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302523k, cVar)) {
                this.f302523k = cVar;
                this.f302513a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            Throwable thC;
            if (this.f302521i) {
                return;
            }
            this.f302521i = true;
            if (!c() || (thC = this.f302520h.c()) == null || thC == io.reactivex.internal.util.k.f303486a) {
                return;
            }
            io.reactivex.plugins.a.Y(thC);
        }

        void e() {
            if (getAndIncrement() == 0) {
                f();
            }
        }

        /* JADX WARN: Code duplicated, block: B:123:0x0113 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:136:0x011d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x0115  */
        /* JADX WARN: Code duplicated, block: B:87:0x011b A[PHI: r4
          0x011b: PHI (r4v10 int) = (r4v8 int), (r4v11 int) binds: [B:73:0x00f4, B:86:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        void f() {
            int size;
            boolean z10;
            io.reactivex.i0<? super U> i0Var = this.f302513a;
            int iAddAndGet = 1;
            while (!b()) {
                ej.n<U> nVar = this.f302518f;
                if (nVar != null) {
                    while (!b()) {
                        U uPoll = nVar.poll();
                        if (uPoll != null) {
                            i0Var.onNext(uPoll);
                        }
                    }
                    return;
                }
                boolean z11 = this.f302519g;
                ej.n<U> nVar2 = this.f302518f;
                a<?, ?>[] aVarArr = this.f302522j.get();
                int length = aVarArr.length;
                int i10 = 0;
                if (this.f302516d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            size = this.f302527o.size();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    size = 0;
                }
                if (z11 && ((nVar2 == null || nVar2.isEmpty()) && length == 0 && size == 0)) {
                    Throwable thC = this.f302520h.c();
                    if (thC != io.reactivex.internal.util.k.f303486a) {
                        if (thC == null) {
                            i0Var.onComplete();
                            return;
                        } else {
                            i0Var.onError(thC);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j10 = this.f302525m;
                    int i11 = this.f302526n;
                    if (length <= i11 || aVarArr[i11].f302505a != j10) {
                        if (length <= i11) {
                            i11 = 0;
                        }
                        for (int i12 = 0; i12 < length && aVarArr[i11].f302505a != j10; i12++) {
                            i11++;
                            if (i11 == length) {
                                i11 = 0;
                            }
                        }
                        this.f302526n = i11;
                        this.f302525m = aVarArr[i11].f302505a;
                    }
                    int i13 = 0;
                    for (int i14 = 0; i14 < length; i14++) {
                        if (b()) {
                            return;
                        }
                        a<T, U> aVar = aVarArr[i11];
                        ej.o<U> oVar = aVar.f302508d;
                        if (oVar != null) {
                            do {
                                try {
                                    U uPoll2 = oVar.poll();
                                    if (uPoll2 == null) {
                                        z10 = aVar.f302507c;
                                        ej.o<U> oVar2 = aVar.f302508d;
                                        if (z10 && (oVar2 == null || oVar2.isEmpty())) {
                                            g(aVar);
                                            if (b()) {
                                                return;
                                            } else {
                                                i13++;
                                            }
                                        }
                                        i11++;
                                        if (i11 == length) {
                                            i11 = 0;
                                        }
                                    } else {
                                        i0Var.onNext(uPoll2);
                                    }
                                } catch (Throwable th3) {
                                    io.reactivex.exceptions.b.b(th3);
                                    aVar.a();
                                    this.f302520h.a(th3);
                                    if (b()) {
                                        return;
                                    }
                                    g(aVar);
                                    i13++;
                                    i11++;
                                    if (i11 == length) {
                                    }
                                }
                            } while (!b());
                            return;
                        }
                        z10 = aVar.f302507c;
                        ej.o<U> oVar3 = aVar.f302508d;
                        if (z10) {
                            g(aVar);
                            if (b()) {
                                return;
                            } else {
                                i13++;
                            }
                        }
                        i11++;
                        if (i11 == length) {
                            i11 = 0;
                        }
                    }
                    this.f302526n = i11;
                    this.f302525m = aVarArr[i11].f302505a;
                    i10 = i13;
                }
                if (i10 == 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (this.f302516d != Integer.MAX_VALUE) {
                    while (true) {
                        int i15 = i10 - 1;
                        if (i10 != 0) {
                            synchronized (this) {
                                try {
                                    io.reactivex.g0<? extends U> g0VarPoll = this.f302527o.poll();
                                    if (g0VarPoll == null) {
                                        this.f302528s--;
                                    } else {
                                        h(g0VarPoll);
                                    }
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                            i10 = i15;
                        }
                    }
                } else {
                    continue;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void g(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.f302522j.get();
                int length = aVarArr.length;
                if (length != 0) {
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
                        break;
                    }
                    if (length == 1) {
                        aVarArr2 = f302511v;
                    } else {
                        a<?, ?>[] aVarArr3 = new a[length - 1];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                        System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    break;
                }
            } while (!androidx.compose.animation.core.z1.a(this.f302522j, aVarArr, aVarArr2));
        }

        void h(io.reactivex.g0<? extends U> g0Var) {
            boolean z10;
            while (g0Var instanceof Callable) {
                if (!j((Callable) g0Var) || this.f302516d == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        g0Var = this.f302527o.poll();
                        if (g0Var == null) {
                            z10 = true;
                            this.f302528s--;
                        } else {
                            z10 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                    e();
                    return;
                }
            }
            long j10 = this.f302524l;
            this.f302524l = 1 + j10;
            a<T, U> aVar = new a<>(this, j10);
            if (a(aVar)) {
                g0Var.a(aVar);
            }
        }

        void i(U u10, a<T, U> aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f302513a.onNext(u10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                ej.o cVar = aVar.f302508d;
                if (cVar == null) {
                    cVar = new io.reactivex.internal.queue.c(this.f302517e);
                    aVar.f302508d = cVar;
                }
                cVar.offer(u10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            f();
        }

        boolean j(Callable<? extends U> callable) {
            try {
                U uCall = callable.call();
                if (uCall == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f302513a.onNext(uCall);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    ej.n<U> cVar = this.f302518f;
                    if (cVar == null) {
                        cVar = this.f302516d == Integer.MAX_VALUE ? new io.reactivex.internal.queue.c<>(this.f302517e) : new io.reactivex.internal.queue.b<>(this.f302516d);
                        this.f302518f = cVar;
                    }
                    if (!cVar.offer(uCall)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                f();
                return true;
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f302520h.a(th2);
                e();
                return true;
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302521i;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302519g) {
                return;
            }
            this.f302519g = true;
            e();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302519g) {
                io.reactivex.plugins.a.Y(th2);
            } else if (!this.f302520h.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302519g = true;
                e();
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f302519g) {
                return;
            }
            try {
                io.reactivex.g0<? extends U> g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302514b.apply(t10), "The mapper returned a null ObservableSource");
                if (this.f302516d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i10 = this.f302528s;
                            if (i10 == this.f302516d) {
                                this.f302527o.offer(g0Var);
                                return;
                            }
                            this.f302528s = i10 + 1;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                h(g0Var);
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f302523k.dispose();
                onError(th3);
            }
        }
    }

    public w0(io.reactivex.g0<T> g0Var, dj.o<? super T, ? extends io.reactivex.g0<? extends U>> oVar, boolean z10, int i10, int i11) {
        super(g0Var);
        this.f302500b = oVar;
        this.f302501c = z10;
        this.f302502d = i10;
        this.f302503e = i11;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super U> i0Var) {
        if (x2.b(this.f301291a, i0Var, this.f302500b)) {
            return;
        }
        this.f301291a.a(new b(i0Var, this.f302500b, this.f302501c, this.f302502d, this.f302503e));
    }
}
