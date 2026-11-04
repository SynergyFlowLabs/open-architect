package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i[] f298895a;

    static final class a extends AtomicInteger implements io.reactivex.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f298896e = -7965400327305809232L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f298897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.i[] f298898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f298899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f298900d = new io.reactivex.internal.disposables.h();

        a(io.reactivex.f fVar, io.reactivex.i[] iVarArr) {
            this.f298897a = fVar;
            this.f298898b = iVarArr;
        }

        void a() {
            if (!this.f298900d.k() && getAndIncrement() == 0) {
                io.reactivex.i[] iVarArr = this.f298898b;
                while (!this.f298900d.k()) {
                    int i10 = this.f298899c;
                    this.f298899c = i10 + 1;
                    if (i10 == iVarArr.length) {
                        this.f298897a.onComplete();
                        return;
                    } else {
                        iVarArr[i10].b(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            this.f298900d.a(cVar);
        }

        @Override // io.reactivex.f
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f298897a.onError(th2);
        }
    }

    public e(io.reactivex.i[] iVarArr) {
        this.f298895a = iVarArr;
    }

    @Override // io.reactivex.c
    public void J0(io.reactivex.f fVar) {
        a aVar = new a(fVar, this.f298895a);
        fVar.d(aVar.f298900d);
        aVar.a();
    }
}
