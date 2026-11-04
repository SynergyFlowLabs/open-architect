package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class t1<T, R> extends io.reactivex.s<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.y<? extends T>[] f300971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super Object[], ? extends R> f300972b;

    final class a implements dj.o<T, R> {
        a() {
        }

        @Override // dj.o
        public R apply(T t10) throws Exception {
            return (R) io.reactivex.internal.functions.b.g(t1.this.f300972b.apply(new Object[]{t10}), "The zipper returned a null value");
        }
    }

    static final class b<T, R> extends AtomicInteger implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f300974e = -5556924161382950569L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super R> f300975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super Object[], ? extends R> f300976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final c<T>[] f300977c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Object[] f300978d;

        b(io.reactivex.v<? super R> vVar, int i10, dj.o<? super Object[], ? extends R> oVar) {
            super(i10);
            this.f300975a = vVar;
            this.f300976b = oVar;
            c<T>[] cVarArr = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11] = new c<>(this, i11);
            }
            this.f300977c = cVarArr;
            this.f300978d = new Object[i10];
        }

        void a(int i10) {
            c<T>[] cVarArr = this.f300977c;
            int length = cVarArr.length;
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11].a();
            }
            while (true) {
                i10++;
                if (i10 >= length) {
                    return;
                } else {
                    cVarArr[i10].a();
                }
            }
        }

        void b(int i10) {
            if (getAndSet(0) > 0) {
                a(i10);
                this.f300975a.onComplete();
            }
        }

        void c(Throwable th2, int i10) {
            if (getAndSet(0) <= 0) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                a(i10);
                this.f300975a.onError(th2);
            }
        }

        void d(T t10, int i10) {
            this.f300978d[i10] = t10;
            if (decrementAndGet() == 0) {
                try {
                    this.f300975a.b(io.reactivex.internal.functions.b.g(this.f300976b.apply(this.f300978d), "The zipper returned a null value"));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f300975a.onError(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (c<T> cVar : this.f300977c) {
                    cVar.a();
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get() <= 0;
        }
    }

    static final class c<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f300979c = 3323743579927613702L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b<T, ?> f300980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f300981b;

        c(b<T, ?> bVar, int i10) {
            this.f300980a = bVar;
            this.f300981b = i10;
        }

        public void a() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300980a.d(t10, this.f300981b);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300980a.b(this.f300981b);
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300980a.c(th2, this.f300981b);
        }
    }

    public t1(io.reactivex.y<? extends T>[] yVarArr, dj.o<? super Object[], ? extends R> oVar) {
        this.f300971a = yVarArr;
        this.f300972b = oVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super R> vVar) {
        io.reactivex.y<? extends T>[] yVarArr = this.f300971a;
        int length = yVarArr.length;
        if (length == 1) {
            yVarArr[0].a(new v0.a(vVar, new a()));
            return;
        }
        b bVar = new b(vVar, length, this.f300972b);
        vVar.d(bVar);
        for (int i10 = 0; i10 < length && !bVar.k(); i10++) {
            io.reactivex.y<? extends T> yVar = yVarArr[i10];
            if (yVar == null) {
                bVar.c(new NullPointerException("One of the sources is null"), i10);
                return;
            }
            yVar.a(bVar.f300977c[i10]);
        }
    }
}
