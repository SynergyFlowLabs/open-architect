package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class g2<T> extends io.reactivex.observables.a<T> implements ej.g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f301602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<b<T>> f301603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.g0<T> f301604c;

    static final class a<T> extends AtomicReference<Object> implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f301605b = -1100270633763673112L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301606a;

        a(io.reactivex.i0<? super T> i0Var) {
            this.f301606a = i0Var;
        }

        void a(b<T> bVar) {
            if (!compareAndSet(null, bVar)) {
                bVar.b(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            ((b) andSet).b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get() == this;
        }
    }

    static final class b<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final a[] f301607e = new a[0];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final a[] f301608f = new a[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReference<b<T>> f301609a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f301612d = new AtomicReference<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<a<T>[]> f301610b = new AtomicReference<>(f301607e);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicBoolean f301611c = new AtomicBoolean();

        b(AtomicReference<b<T>> atomicReference) {
            this.f301609a = atomicReference;
        }

        boolean a(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.f301610b.get();
                if (aVarArr == f301608f) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!androidx.compose.animation.core.z1.a(this.f301610b, aVarArr, aVarArr2));
            return true;
        }

        void b(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.f301610b.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (aVarArr[i10].equals(aVar)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = f301607e;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!androidx.compose.animation.core.z1.a(this.f301610b, aVarArr, aVarArr2));
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f301612d, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            AtomicReference<a<T>[]> atomicReference = this.f301610b;
            a<T>[] aVarArr = f301608f;
            if (atomicReference.getAndSet(aVarArr) != aVarArr) {
                androidx.compose.animation.core.z1.a(this.f301609a, this, null);
                io.reactivex.internal.disposables.d.b(this.f301612d);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301610b.get() == f301608f;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            androidx.compose.animation.core.z1.a(this.f301609a, this, null);
            for (a<T> aVar : this.f301610b.getAndSet(f301608f)) {
                aVar.f301606a.onComplete();
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            androidx.compose.animation.core.z1.a(this.f301609a, this, null);
            a<T>[] andSet = this.f301610b.getAndSet(f301608f);
            if (andSet.length == 0) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            for (a<T> aVar : andSet) {
                aVar.f301606a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            for (a<T> aVar : this.f301610b.get()) {
                aVar.f301606a.onNext(t10);
            }
        }
    }

    static final class c<T> implements io.reactivex.g0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference<b<T>> f301613a;

        c(AtomicReference<b<T>> atomicReference) {
            this.f301613a = atomicReference;
        }

        @Override // io.reactivex.g0
        public void a(io.reactivex.i0<? super T> i0Var) {
            a aVar = new a(i0Var);
            i0Var.d(aVar);
            while (true) {
                b<T> bVar = this.f301613a.get();
                if (bVar == null || bVar.k()) {
                    b<T> bVar2 = new b<>(this.f301613a);
                    if (androidx.compose.animation.core.z1.a(this.f301613a, bVar, bVar2)) {
                        bVar = bVar2;
                    } else {
                        continue;
                    }
                }
                if (bVar.a(aVar)) {
                    aVar.a(bVar);
                    return;
                }
            }
        }
    }

    private g2(io.reactivex.g0<T> g0Var, io.reactivex.g0<T> g0Var2, AtomicReference<b<T>> atomicReference) {
        this.f301604c = g0Var;
        this.f301602a = g0Var2;
        this.f301603b = atomicReference;
    }

    public static <T> io.reactivex.observables.a<T> s8(io.reactivex.g0<T> g0Var) {
        AtomicReference atomicReference = new AtomicReference();
        return io.reactivex.plugins.a.U(new g2(new c(atomicReference), g0Var, atomicReference));
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301604c.a(i0Var);
    }

    @Override // io.reactivex.observables.a
    public void l8(dj.g<? super io.reactivex.disposables.c> gVar) {
        b<T> bVar;
        while (true) {
            bVar = this.f301603b.get();
            if (bVar != null && !bVar.k()) {
                break;
            }
            b<T> bVar2 = new b<>(this.f301603b);
            if (androidx.compose.animation.core.z1.a(this.f301603b, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        boolean z10 = false;
        if (!bVar.f301611c.get() && bVar.f301611c.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            gVar.accept(bVar);
            if (z10) {
                this.f301602a.a(bVar);
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            throw io.reactivex.internal.util.k.f(th2);
        }
    }

    @Override // ej.g
    public io.reactivex.g0<T> source() {
        return this.f301602a;
    }
}
