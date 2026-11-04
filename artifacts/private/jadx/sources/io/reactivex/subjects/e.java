package io.reactivex.subjects;

import androidx.compose.animation.core.z1;
import io.reactivex.i0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class e<T> extends i<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final a[] f303777c = new a[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final a[] f303778d = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<a<T>[]> f303779a = new AtomicReference<>(f303778d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Throwable f303780b;

    static final class a<T> extends AtomicBoolean implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f303781c = 3562861878281475070L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i0<? super T> f303782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final e<T> f303783b;

        a(i0<? super T> i0Var, e<T> eVar) {
            this.f303782a = i0Var;
            this.f303783b = eVar;
        }

        public void a() {
            if (get()) {
                return;
            }
            this.f303782a.onComplete();
        }

        public void b(Throwable th2) {
            if (get()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f303782a.onError(th2);
            }
        }

        public void c(T t10) {
            if (get()) {
                return;
            }
            this.f303782a.onNext(t10);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f303783b.o8(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get();
        }
    }

    e() {
    }

    @cj.f
    @cj.d
    public static <T> e<T> n8() {
        return new e<>();
    }

    @Override // io.reactivex.b0
    protected void H5(i0<? super T> i0Var) {
        a<T> aVar = new a<>(i0Var, this);
        i0Var.d(aVar);
        if (m8(aVar)) {
            if (aVar.k()) {
                o8(aVar);
            }
        } else {
            Throwable th2 = this.f303780b;
            if (th2 != null) {
                i0Var.onError(th2);
            } else {
                i0Var.onComplete();
            }
        }
    }

    @Override // io.reactivex.i0
    public void d(io.reactivex.disposables.c cVar) {
        if (this.f303779a.get() == f303777c) {
            cVar.dispose();
        }
    }

    @Override // io.reactivex.subjects.i
    @cj.g
    public Throwable h8() {
        if (this.f303779a.get() == f303777c) {
            return this.f303780b;
        }
        return null;
    }

    @Override // io.reactivex.subjects.i
    public boolean i8() {
        return this.f303779a.get() == f303777c && this.f303780b == null;
    }

    @Override // io.reactivex.subjects.i
    public boolean j8() {
        return this.f303779a.get().length != 0;
    }

    @Override // io.reactivex.subjects.i
    public boolean k8() {
        return this.f303779a.get() == f303777c && this.f303780b != null;
    }

    boolean m8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f303779a.get();
            if (aVarArr == f303777c) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!z1.a(this.f303779a, aVarArr, aVarArr2));
        return true;
    }

    void o8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f303779a.get();
            if (aVarArr != f303777c && aVarArr != f303778d) {
                int length = aVarArr.length;
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
                    aVarArr2 = f303778d;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            }
            return;
        } while (!z1.a(this.f303779a, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        a<T>[] aVarArr = this.f303779a.get();
        a<T>[] aVarArr2 = f303777c;
        if (aVarArr == aVarArr2) {
            return;
        }
        a<T>[] andSet = this.f303779a.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            aVar.a();
        }
    }

    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        a<T>[] aVarArr = this.f303779a.get();
        a<T>[] aVarArr2 = f303777c;
        if (aVarArr == aVarArr2) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f303780b = th2;
        a<T>[] andSet = this.f303779a.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            aVar.b(th2);
        }
    }

    @Override // io.reactivex.i0
    public void onNext(T t10) {
        io.reactivex.internal.functions.b.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (a<T> aVar : this.f303779a.get()) {
            aVar.c(t10);
        }
    }
}
