package io.reactivex.subjects;

import androidx.compose.animation.core.z1;
import io.reactivex.k0;
import io.reactivex.n0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class h<T> extends k0<T> implements n0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final a[] f303823e = new a[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final a[] f303824f = new a[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    T f303827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Throwable f303828d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicBoolean f303826b = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<a<T>[]> f303825a = new AtomicReference<>(f303823e);

    static final class a<T> extends AtomicReference<h<T>> implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f303829b = -7650903191002190468L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final n0<? super T> f303830a;

        a(n0<? super T> n0Var, h<T> hVar) {
            this.f303830a = n0Var;
            lazySet(hVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            h<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.X1(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get() == null;
        }
    }

    h() {
    }

    @cj.f
    @cj.d
    public static <T> h<T> Q1() {
        return new h<>();
    }

    boolean P1(@cj.f a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f303825a.get();
            if (aVarArr == f303824f) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!z1.a(this.f303825a, aVarArr, aVarArr2));
        return true;
    }

    @cj.g
    public Throwable R1() {
        if (this.f303825a.get() == f303824f) {
            return this.f303828d;
        }
        return null;
    }

    @cj.g
    public T S1() {
        if (this.f303825a.get() == f303824f) {
            return this.f303827c;
        }
        return null;
    }

    public boolean T1() {
        return this.f303825a.get().length != 0;
    }

    public boolean U1() {
        return this.f303825a.get() == f303824f && this.f303828d != null;
    }

    public boolean V1() {
        return this.f303825a.get() == f303824f && this.f303827c != null;
    }

    int W1() {
        return this.f303825a.get().length;
    }

    void X1(@cj.f a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f303825a.get();
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
                aVarArr2 = f303823e;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!z1.a(this.f303825a, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.n0
    public void b(@cj.f T t10) {
        io.reactivex.internal.functions.b.g(t10, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f303826b.compareAndSet(false, true)) {
            this.f303827c = t10;
            for (a<T> aVar : this.f303825a.getAndSet(f303824f)) {
                aVar.f303830a.b(t10);
            }
        }
    }

    @Override // io.reactivex.n0
    public void d(@cj.f io.reactivex.disposables.c cVar) {
        if (this.f303825a.get() == f303824f) {
            cVar.dispose();
        }
    }

    @Override // io.reactivex.k0
    protected void d1(@cj.f n0<? super T> n0Var) {
        a<T> aVar = new a<>(n0Var, this);
        n0Var.d(aVar);
        if (P1(aVar)) {
            if (aVar.k()) {
                X1(aVar);
            }
        } else {
            Throwable th2 = this.f303828d;
            if (th2 != null) {
                n0Var.onError(th2);
            } else {
                n0Var.b(this.f303827c);
            }
        }
    }

    @Override // io.reactivex.n0
    public void onError(@cj.f Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f303826b.compareAndSet(false, true)) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f303828d = th2;
        for (a<T> aVar : this.f303825a.getAndSet(f303824f)) {
            aVar.f303830a.onError(th2);
        }
    }
}
