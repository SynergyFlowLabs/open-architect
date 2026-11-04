package io.reactivex.subjects;

import androidx.compose.animation.core.z1;
import io.reactivex.i0;
import io.reactivex.internal.observers.l;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class a<T> extends i<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final C2203a[] f303737d = new C2203a[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final C2203a[] f303738e = new C2203a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<C2203a<T>[]> f303739a = new AtomicReference<>(f303737d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Throwable f303740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    T f303741c;

    /* JADX INFO: renamed from: io.reactivex.subjects.a$a, reason: collision with other inner class name */
    static final class C2203a<T> extends l<T> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f303742k = 5629876084736248016L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final a<T> f303743j;

        C2203a(i0<? super T> i0Var, a<T> aVar) {
            super(i0Var);
            this.f303743j = aVar;
        }

        @Override // io.reactivex.internal.observers.l, io.reactivex.disposables.c
        public void dispose() {
            if (super.f()) {
                this.f303743j.s8(this);
            }
        }

        void onComplete() {
            if (k()) {
                return;
            }
            this.f298769b.onComplete();
        }

        void onError(Throwable th2) {
            if (k()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f298769b.onError(th2);
            }
        }
    }

    a() {
    }

    @cj.f
    @cj.d
    public static <T> a<T> n8() {
        return new a<>();
    }

    @Override // io.reactivex.b0
    protected void H5(i0<? super T> i0Var) {
        C2203a<T> c2203a = new C2203a<>(i0Var, this);
        i0Var.d(c2203a);
        if (m8(c2203a)) {
            if (c2203a.k()) {
                s8(c2203a);
                return;
            }
            return;
        }
        Throwable th2 = this.f303740b;
        if (th2 != null) {
            i0Var.onError(th2);
            return;
        }
        T t10 = this.f303741c;
        if (t10 != null) {
            c2203a.c(t10);
        } else {
            c2203a.onComplete();
        }
    }

    @Override // io.reactivex.i0
    public void d(io.reactivex.disposables.c cVar) {
        if (this.f303739a.get() == f303738e) {
            cVar.dispose();
        }
    }

    @Override // io.reactivex.subjects.i
    public Throwable h8() {
        if (this.f303739a.get() == f303738e) {
            return this.f303740b;
        }
        return null;
    }

    @Override // io.reactivex.subjects.i
    public boolean i8() {
        return this.f303739a.get() == f303738e && this.f303740b == null;
    }

    @Override // io.reactivex.subjects.i
    public boolean j8() {
        return this.f303739a.get().length != 0;
    }

    @Override // io.reactivex.subjects.i
    public boolean k8() {
        return this.f303739a.get() == f303738e && this.f303740b != null;
    }

    boolean m8(C2203a<T> c2203a) {
        C2203a<T>[] c2203aArr;
        C2203a[] c2203aArr2;
        do {
            c2203aArr = this.f303739a.get();
            if (c2203aArr == f303738e) {
                return false;
            }
            int length = c2203aArr.length;
            c2203aArr2 = new C2203a[length + 1];
            System.arraycopy(c2203aArr, 0, c2203aArr2, 0, length);
            c2203aArr2[length] = c2203a;
        } while (!z1.a(this.f303739a, c2203aArr, c2203aArr2));
        return true;
    }

    @cj.g
    public T o8() {
        if (this.f303739a.get() == f303738e) {
            return this.f303741c;
        }
        return null;
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        C2203a<T>[] c2203aArr = this.f303739a.get();
        C2203a<T>[] c2203aArr2 = f303738e;
        if (c2203aArr != c2203aArr2) {
            T t10 = this.f303741c;
            C2203a<T>[] andSet = this.f303739a.getAndSet(c2203aArr2);
            int i10 = 0;
            if (t10 == null) {
                int length = andSet.length;
                while (i10 < length) {
                    andSet[i10].onComplete();
                    i10++;
                }
            } else {
                int length2 = andSet.length;
                while (i10 < length2) {
                    andSet[i10].c(t10);
                    i10++;
                }
            }
        }
    }

    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C2203a<T>[] c2203aArr = this.f303739a.get();
        C2203a<T>[] c2203aArr2 = f303738e;
        if (c2203aArr == c2203aArr2) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f303741c = null;
        this.f303740b = th2;
        C2203a<T>[] andSet = this.f303739a.getAndSet(c2203aArr2);
        for (C2203a<T> c2203a : andSet) {
            c2203a.onError(th2);
        }
    }

    @Override // io.reactivex.i0
    public void onNext(T t10) {
        io.reactivex.internal.functions.b.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f303739a.get() == f303738e) {
            return;
        }
        this.f303741c = t10;
    }

    @Deprecated
    public Object[] p8() {
        T tO8 = o8();
        if (tO8 == null) {
            return new Object[0];
        }
        boolean z10 = !true;
        return new Object[]{tO8};
    }

    @Deprecated
    public T[] q8(T[] tArr) {
        T tO8 = o8();
        if (tO8 == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 1);
        }
        tArr[0] = tO8;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    public boolean r8() {
        return this.f303739a.get() == f303738e && this.f303741c != null;
    }

    void s8(C2203a<T> c2203a) {
        C2203a<T>[] c2203aArr;
        C2203a[] c2203aArr2;
        do {
            c2203aArr = this.f303739a.get();
            int length = c2203aArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (c2203aArr[i10] == c2203a) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                c2203aArr2 = f303737d;
            } else {
                C2203a[] c2203aArr3 = new C2203a[length - 1];
                System.arraycopy(c2203aArr, 0, c2203aArr3, 0, i10);
                System.arraycopy(c2203aArr, i10 + 1, c2203aArr3, i10, (length - i10) - 1);
                c2203aArr2 = c2203aArr3;
            }
        } while (!z1.a(this.f303739a, c2203aArr, c2203aArr2));
    }
}
