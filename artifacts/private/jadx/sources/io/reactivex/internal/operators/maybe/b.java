package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class b<T> extends io.reactivex.s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.reactivex.y<? extends T>[] f300680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterable<? extends io.reactivex.y<? extends T>> f300681b;

    static final class a<T> implements io.reactivex.v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicBoolean f300683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.disposables.b f300684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f300685d;

        a(io.reactivex.v<? super T> vVar, io.reactivex.disposables.b bVar, AtomicBoolean atomicBoolean) {
            this.f300682a = vVar;
            this.f300684c = bVar;
            this.f300683b = atomicBoolean;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            if (this.f300683b.compareAndSet(false, true)) {
                this.f300684c.b(this.f300685d);
                this.f300684c.dispose();
                this.f300682a.b(t10);
            }
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            this.f300685d = cVar;
            this.f300684c.c(cVar);
        }

        @Override // io.reactivex.v
        public void onComplete() {
            if (this.f300683b.compareAndSet(false, true)) {
                this.f300684c.b(this.f300685d);
                this.f300684c.dispose();
                this.f300682a.onComplete();
            }
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            if (!this.f300683b.compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f300684c.b(this.f300685d);
            this.f300684c.dispose();
            this.f300682a.onError(th2);
        }
    }

    public b(io.reactivex.y<? extends T>[] yVarArr, Iterable<? extends io.reactivex.y<? extends T>> iterable) {
        this.f300680a = yVarArr;
        this.f300681b = iterable;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        int length;
        io.reactivex.y<? extends T>[] yVarArr = this.f300680a;
        if (yVarArr == null) {
            yVarArr = new io.reactivex.y[8];
            try {
                length = 0;
                for (io.reactivex.y<? extends T> yVar : this.f300681b) {
                    if (yVar == null) {
                        io.reactivex.internal.disposables.e.f(new NullPointerException("One of the sources is null"), vVar);
                        return;
                    }
                    if (length == yVarArr.length) {
                        io.reactivex.y<? extends T>[] yVarArr2 = new io.reactivex.y[(length >> 2) + length];
                        System.arraycopy(yVarArr, 0, yVarArr2, 0, length);
                        yVarArr = yVarArr2;
                    }
                    int i10 = length + 1;
                    yVarArr[length] = yVar;
                    length = i10;
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.internal.disposables.e.f(th2, vVar);
                return;
            }
        } else {
            length = yVarArr.length;
        }
        io.reactivex.disposables.b bVar = new io.reactivex.disposables.b();
        vVar.d(bVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (int i11 = 0; i11 < length; i11++) {
            io.reactivex.y<? extends T> yVar2 = yVarArr[i11];
            if (bVar.k()) {
                return;
            }
            if (yVar2 == null) {
                bVar.dispose();
                NullPointerException nullPointerException = new NullPointerException("One of the MaybeSources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    vVar.onError(nullPointerException);
                    return;
                } else {
                    io.reactivex.plugins.a.Y(nullPointerException);
                    return;
                }
            }
            yVar2.a(new a(vVar, bVar, atomicBoolean));
        }
        if (length == 0) {
            vVar.onComplete();
        }
    }
}
