package io.reactivex.processors;

import androidx.compose.animation.core.z1;
import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public final class e<T> extends c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final a[] f303653d = new a[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final a[] f303654e = new a[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<a<T>[]> f303655b = new AtomicReference<>(f303654e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Throwable f303656c;

    static final class a<T> extends AtomicLong implements w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f303657c = 3562861878281475070L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super T> f303658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final e<T> f303659b;

        a(v<? super T> vVar, e<T> eVar) {
            this.f303658a = vVar;
            this.f303659b = eVar;
        }

        public boolean a() {
            return get() == Long.MIN_VALUE;
        }

        boolean b() {
            return get() == 0;
        }

        public void c() {
            if (get() != Long.MIN_VALUE) {
                this.f303658a.onComplete();
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f303659b.U8(this);
            }
        }

        public void d(Throwable th2) {
            if (get() != Long.MIN_VALUE) {
                this.f303658a.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        public void e(T t10) {
            long j10 = get();
            if (j10 == Long.MIN_VALUE) {
                return;
            }
            if (j10 != 0) {
                this.f303658a.onNext(t10);
                io.reactivex.internal.util.d.f(this, 1L);
            } else {
                cancel();
                this.f303658a.onError(new io.reactivex.exceptions.c("Could not emit value due to lack of requests"));
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (j.p(j10)) {
                io.reactivex.internal.util.d.b(this, j10);
            }
        }
    }

    e() {
    }

    @cj.f
    @cj.d
    public static <T> e<T> S8() {
        return new e<>();
    }

    @Override // io.reactivex.processors.c
    @cj.g
    public Throwable M8() {
        if (this.f303655b.get() == f303653d) {
            return this.f303656c;
        }
        return null;
    }

    @Override // io.reactivex.processors.c
    public boolean N8() {
        return this.f303655b.get() == f303653d && this.f303656c == null;
    }

    @Override // io.reactivex.processors.c
    public boolean O8() {
        return this.f303655b.get().length != 0;
    }

    @Override // io.reactivex.processors.c
    public boolean P8() {
        return this.f303655b.get() == f303653d && this.f303656c != null;
    }

    boolean R8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f303655b.get();
            int i10 = 4 ^ 0;
            if (aVarArr == f303653d) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!z1.a(this.f303655b, aVarArr, aVarArr2));
        return true;
    }

    public boolean T8(T t10) {
        if (t10 == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        a<T>[] aVarArr = this.f303655b.get();
        for (a<T> aVar : aVarArr) {
            if (aVar.b()) {
                return false;
            }
        }
        for (a<T> aVar2 : aVarArr) {
            aVar2.e(t10);
        }
        return true;
    }

    void U8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f303655b.get();
            if (aVarArr == f303653d || aVarArr == f303654e) {
                return;
            }
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
                aVarArr2 = f303654e;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!z1.a(this.f303655b, aVarArr, aVarArr2));
    }

    @Override // io.reactivex.l
    protected void k6(v<? super T> vVar) {
        a<T> aVar = new a<>(vVar, this);
        vVar.l(aVar);
        if (R8(aVar)) {
            if (aVar.a()) {
                U8(aVar);
            }
        } else {
            Throwable th2 = this.f303656c;
            if (th2 != null) {
                vVar.onError(th2);
            } else {
                vVar.onComplete();
            }
        }
    }

    @Override // org.reactivestreams.v
    public void l(w wVar) {
        if (this.f303655b.get() == f303653d) {
            wVar.cancel();
        } else {
            wVar.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        a<T>[] aVarArr = this.f303655b.get();
        a<T>[] aVarArr2 = f303653d;
        if (aVarArr == aVarArr2) {
            return;
        }
        a<T>[] andSet = this.f303655b.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            aVar.c();
        }
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        a<T>[] aVarArr = this.f303655b.get();
        a<T>[] aVarArr2 = f303653d;
        if (aVarArr == aVarArr2) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f303656c = th2;
        a<T>[] andSet = this.f303655b.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            aVar.d(th2);
        }
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        io.reactivex.internal.functions.b.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (a<T> aVar : this.f303655b.get()) {
            aVar.e(t10);
        }
    }
}
