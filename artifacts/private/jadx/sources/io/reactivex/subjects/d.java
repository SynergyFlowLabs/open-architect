package io.reactivex.subjects;

import androidx.compose.animation.core.z1;
import io.reactivex.s;
import io.reactivex.v;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class d<T> extends s<T> implements v<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final a[] f303769e = new a[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final a[] f303770f = new a[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    T f303773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Throwable f303774d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicBoolean f303772b = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<a<T>[]> f303771a = new AtomicReference<>(f303769e);

    static final class a<T> extends AtomicReference<d<T>> implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f303775b = -7650903191002190468L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super T> f303776a;

        a(v<? super T> vVar, d<T> dVar) {
            this.f303776a = vVar;
            lazySet(dVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            d<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.p2(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get() == null;
        }
    }

    d() {
    }

    @cj.f
    @cj.d
    public static <T> d<T> h2() {
        return new d<>();
    }

    @Override // io.reactivex.v
    public void b(T t10) {
        io.reactivex.internal.functions.b.g(t10, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f303772b.compareAndSet(false, true)) {
            this.f303773c = t10;
            for (a<T> aVar : this.f303771a.getAndSet(f303770f)) {
                aVar.f303776a.b(t10);
            }
        }
    }

    @Override // io.reactivex.v
    public void d(io.reactivex.disposables.c cVar) {
        if (this.f303771a.get() == f303770f) {
            cVar.dispose();
        }
    }

    boolean g2(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f303771a.get();
            if (aVarArr == f303770f) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!z1.a(this.f303771a, aVarArr, aVarArr2));
        return true;
    }

    @cj.g
    public Throwable i2() {
        if (this.f303771a.get() == f303770f) {
            return this.f303774d;
        }
        return null;
    }

    @cj.g
    public T j2() {
        if (this.f303771a.get() == f303770f) {
            return this.f303773c;
        }
        return null;
    }

    public boolean k2() {
        return this.f303771a.get() == f303770f && this.f303773c == null && this.f303774d == null;
    }

    public boolean l2() {
        if (this.f303771a.get().length == 0) {
            return false;
        }
        int i10 = 3 & 1;
        return true;
    }

    public boolean m2() {
        return this.f303771a.get() == f303770f && this.f303774d != null;
    }

    public boolean n2() {
        return this.f303771a.get() == f303770f && this.f303773c != null;
    }

    int o2() {
        return this.f303771a.get().length;
    }

    @Override // io.reactivex.v
    public void onComplete() {
        if (this.f303772b.compareAndSet(false, true)) {
            for (a<T> aVar : this.f303771a.getAndSet(f303770f)) {
                aVar.f303776a.onComplete();
            }
        }
    }

    @Override // io.reactivex.v
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f303772b.compareAndSet(false, true)) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f303774d = th2;
        for (a<T> aVar : this.f303771a.getAndSet(f303770f)) {
            aVar.f303776a.onError(th2);
        }
    }

    void p2(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f303771a.get();
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
                aVarArr2 = f303769e;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!z1.a(this.f303771a, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.s
    protected void s1(v<? super T> vVar) {
        a<T> aVar = new a<>(vVar, this);
        vVar.d(aVar);
        if (g2(aVar)) {
            if (aVar.k()) {
                p2(aVar);
                return;
            }
            return;
        }
        Throwable th2 = this.f303774d;
        if (th2 != null) {
            vVar.onError(th2);
            return;
        }
        T t10 = this.f303773c;
        if (t10 == null) {
            vVar.onComplete();
        } else {
            vVar.b(t10);
        }
    }
}
