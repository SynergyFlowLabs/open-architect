package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.reactivex.i[] f298834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterable<? extends io.reactivex.i> f298835b;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.completable.a$a, reason: collision with other inner class name */
    static final class C2122a implements io.reactivex.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicBoolean f298836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.disposables.b f298837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.f f298838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f298839d;

        C2122a(AtomicBoolean atomicBoolean, io.reactivex.disposables.b bVar, io.reactivex.f fVar) {
            this.f298836a = atomicBoolean;
            this.f298837b = bVar;
            this.f298838c = fVar;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            this.f298839d = cVar;
            this.f298837b.c(cVar);
        }

        @Override // io.reactivex.f
        public void onComplete() {
            if (this.f298836a.compareAndSet(false, true)) {
                this.f298837b.b(this.f298839d);
                this.f298837b.dispose();
                this.f298838c.onComplete();
            }
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            if (!this.f298836a.compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f298837b.b(this.f298839d);
            this.f298837b.dispose();
            this.f298838c.onError(th2);
        }
    }

    public a(io.reactivex.i[] iVarArr, Iterable<? extends io.reactivex.i> iterable) {
        this.f298834a = iVarArr;
        this.f298835b = iterable;
    }

    @Override // io.reactivex.c
    public void J0(io.reactivex.f fVar) {
        int length;
        io.reactivex.i[] iVarArr = this.f298834a;
        if (iVarArr == null) {
            iVarArr = new io.reactivex.i[8];
            try {
                length = 0;
                for (io.reactivex.i iVar : this.f298835b) {
                    if (iVar == null) {
                        io.reactivex.internal.disposables.e.e(new NullPointerException("One of the sources is null"), fVar);
                        return;
                    }
                    if (length == iVarArr.length) {
                        io.reactivex.i[] iVarArr2 = new io.reactivex.i[(length >> 2) + length];
                        System.arraycopy(iVarArr, 0, iVarArr2, 0, length);
                        iVarArr = iVarArr2;
                    }
                    int i10 = length + 1;
                    iVarArr[length] = iVar;
                    length = i10;
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.internal.disposables.e.e(th2, fVar);
                return;
            }
        } else {
            length = iVarArr.length;
        }
        io.reactivex.disposables.b bVar = new io.reactivex.disposables.b();
        fVar.d(bVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (int i11 = 0; i11 < length; i11++) {
            io.reactivex.i iVar2 = iVarArr[i11];
            if (bVar.k()) {
                return;
            }
            if (iVar2 == null) {
                Throwable nullPointerException = new NullPointerException("One of the sources is null");
                if (!atomicBoolean.compareAndSet(false, true)) {
                    io.reactivex.plugins.a.Y(nullPointerException);
                    return;
                } else {
                    bVar.dispose();
                    fVar.onError(nullPointerException);
                    return;
                }
            }
            iVar2.b(new C2122a(atomicBoolean, bVar, fVar));
        }
        if (length == 0) {
            fVar.onComplete();
        }
    }
}
