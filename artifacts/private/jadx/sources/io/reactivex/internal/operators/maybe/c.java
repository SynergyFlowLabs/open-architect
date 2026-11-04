package io.reactivex.internal.operators.maybe;

import androidx.compose.animation.core.z1;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class c<T> extends io.reactivex.s<T> implements io.reactivex.v<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final a[] f300699e = new a[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final a[] f300700f = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<io.reactivex.y<T>> f300701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<a<T>[]> f300702b = new AtomicReference<>(f300699e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    T f300703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Throwable f300704d;

    static final class a<T> extends AtomicReference<c<T>> implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f300705b = -5791853038359966195L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300706a;

        a(io.reactivex.v<? super T> vVar, c<T> cVar) {
            super(cVar);
            this.f300706a = vVar;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            c<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.h2(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get() == null;
        }
    }

    public c(io.reactivex.y<T> yVar) {
        this.f300701a = new AtomicReference<>(yVar);
    }

    @Override // io.reactivex.v
    public void b(T t10) {
        this.f300703c = t10;
        for (a<T> aVar : this.f300702b.getAndSet(f300700f)) {
            if (!aVar.k()) {
                aVar.f300706a.b(t10);
            }
        }
    }

    @Override // io.reactivex.v
    public void d(io.reactivex.disposables.c cVar) {
    }

    boolean g2(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f300702b.get();
            if (aVarArr == f300700f) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!z1.a(this.f300702b, aVarArr, aVarArr2));
        return true;
    }

    void h2(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f300702b.get();
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
                    aVarArr2 = f300699e;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } else {
                break;
            }
        } while (!z1.a(this.f300702b, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.v
    public void onComplete() {
        for (a<T> aVar : this.f300702b.getAndSet(f300700f)) {
            if (!aVar.k()) {
                aVar.f300706a.onComplete();
            }
        }
    }

    @Override // io.reactivex.v
    public void onError(Throwable th2) {
        this.f300704d = th2;
        for (a<T> aVar : this.f300702b.getAndSet(f300700f)) {
            if (!aVar.k()) {
                aVar.f300706a.onError(th2);
            }
        }
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        a<T> aVar = new a<>(vVar, this);
        vVar.d(aVar);
        if (g2(aVar)) {
            if (aVar.k()) {
                h2(aVar);
                return;
            }
            io.reactivex.y<T> andSet = this.f300701a.getAndSet(null);
            if (andSet != null) {
                andSet.a(this);
            }
        } else if (!aVar.k()) {
            Throwable th2 = this.f300704d;
            if (th2 != null) {
                vVar.onError(th2);
                return;
            }
            T t10 = this.f300703c;
            if (t10 != null) {
                vVar.b(t10);
                return;
            }
            vVar.onComplete();
        }
    }
}
