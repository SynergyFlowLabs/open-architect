package io.reactivex.internal.operators.completable;

import androidx.compose.animation.core.z1;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends io.reactivex.c implements io.reactivex.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final a[] f298864e = new a[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final a[] f298865f = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f298866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<a[]> f298867b = new AtomicReference<>(f298864e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f298868c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Throwable f298869d;

    final class a extends AtomicBoolean implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f298870c = 8943152917179642732L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f298871a;

        a(io.reactivex.f fVar) {
            this.f298871a = fVar;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (compareAndSet(false, true)) {
                c.this.j1(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get();
        }
    }

    public c(io.reactivex.i iVar) {
        this.f298866a = iVar;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        a aVar = new a(fVar);
        fVar.d(aVar);
        if (i1(aVar)) {
            if (aVar.k()) {
                j1(aVar);
            }
            if (this.f298868c.compareAndSet(false, true)) {
                this.f298866a.b(this);
                return;
            }
            return;
        }
        Throwable th2 = this.f298869d;
        if (th2 != null) {
            fVar.onError(th2);
        } else {
            fVar.onComplete();
        }
    }

    @Override // io.reactivex.f
    public void d(io.reactivex.disposables.c cVar) {
    }

    boolean i1(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f298867b.get();
            if (aVarArr == f298865f) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!z1.a(this.f298867b, aVarArr, aVarArr2));
        return true;
    }

    void j1(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f298867b.get();
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
                aVarArr2 = f298864e;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!z1.a(this.f298867b, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.f
    public void onComplete() {
        for (a aVar : this.f298867b.getAndSet(f298865f)) {
            if (!aVar.get()) {
                aVar.f298871a.onComplete();
            }
        }
    }

    @Override // io.reactivex.f
    public void onError(Throwable th2) {
        this.f298869d = th2;
        for (a aVar : this.f298867b.getAndSet(f298865f)) {
            if (!aVar.get()) {
                aVar.f298871a.onError(th2);
            }
        }
    }
}
