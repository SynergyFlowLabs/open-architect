package io.reactivex.processors;

import androidx.compose.animation.core.z1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public final class a<T> extends c<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final C2199a[] f303609e = new C2199a[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final C2199a[] f303610f = new C2199a[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<C2199a<T>[]> f303611b = new AtomicReference<>(f303609e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Throwable f303612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    T f303613d;

    /* JADX INFO: renamed from: io.reactivex.processors.a$a, reason: collision with other inner class name */
    static final class C2199a<T> extends io.reactivex.internal.subscriptions.f<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final long f303614n = 5629876084736248016L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final a<T> f303615m;

        C2199a(v<? super T> vVar, a<T> aVar) {
            super(vVar);
            this.f303615m = aVar;
        }

        @Override // io.reactivex.internal.subscriptions.f, org.reactivestreams.w
        public void cancel() {
            if (super.h()) {
                this.f303615m.X8(this);
            }
        }

        void onComplete() {
            if (!g()) {
                this.f303450b.onComplete();
            }
        }

        void onError(Throwable th2) {
            if (g()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f303450b.onError(th2);
            }
        }
    }

    a() {
    }

    @cj.f
    @cj.d
    public static <T> a<T> S8() {
        return new a<>();
    }

    @Override // io.reactivex.processors.c
    @cj.g
    public Throwable M8() {
        if (this.f303611b.get() == f303610f) {
            return this.f303612c;
        }
        return null;
    }

    @Override // io.reactivex.processors.c
    public boolean N8() {
        return this.f303611b.get() == f303610f && this.f303612c == null;
    }

    @Override // io.reactivex.processors.c
    public boolean O8() {
        return this.f303611b.get().length != 0;
    }

    @Override // io.reactivex.processors.c
    public boolean P8() {
        return this.f303611b.get() == f303610f && this.f303612c != null;
    }

    boolean R8(C2199a<T> c2199a) {
        C2199a<T>[] c2199aArr;
        C2199a[] c2199aArr2;
        do {
            c2199aArr = this.f303611b.get();
            if (c2199aArr == f303610f) {
                return false;
            }
            int length = c2199aArr.length;
            c2199aArr2 = new C2199a[length + 1];
            System.arraycopy(c2199aArr, 0, c2199aArr2, 0, length);
            c2199aArr2[length] = c2199a;
        } while (!z1.a(this.f303611b, c2199aArr, c2199aArr2));
        return true;
    }

    @cj.g
    public T T8() {
        if (this.f303611b.get() == f303610f) {
            return this.f303613d;
        }
        return null;
    }

    @Deprecated
    public Object[] U8() {
        T tT8 = T8();
        return tT8 != null ? new Object[]{tT8} : new Object[0];
    }

    @Deprecated
    public T[] V8(T[] tArr) {
        T tT8 = T8();
        if (tT8 == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 1);
        }
        tArr[0] = tT8;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    public boolean W8() {
        return this.f303611b.get() == f303610f && this.f303613d != null;
    }

    void X8(C2199a<T> c2199a) {
        C2199a<T>[] c2199aArr;
        C2199a[] c2199aArr2;
        do {
            c2199aArr = this.f303611b.get();
            int length = c2199aArr.length;
            if (length != 0) {
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (c2199aArr[i10] == c2199a) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    break;
                }
                if (length == 1) {
                    c2199aArr2 = f303609e;
                } else {
                    C2199a[] c2199aArr3 = new C2199a[length - 1];
                    System.arraycopy(c2199aArr, 0, c2199aArr3, 0, i10);
                    System.arraycopy(c2199aArr, i10 + 1, c2199aArr3, i10, (length - i10) - 1);
                    c2199aArr2 = c2199aArr3;
                }
            } else {
                break;
            }
        } while (!z1.a(this.f303611b, c2199aArr, c2199aArr2));
    }

    @Override // io.reactivex.l
    protected void k6(v<? super T> vVar) {
        C2199a<T> c2199a = new C2199a<>(vVar, this);
        vVar.l(c2199a);
        if (R8(c2199a)) {
            if (c2199a.g()) {
                X8(c2199a);
                return;
            }
            return;
        }
        Throwable th2 = this.f303612c;
        if (th2 != null) {
            vVar.onError(th2);
            return;
        }
        T t10 = this.f303613d;
        if (t10 != null) {
            c2199a.f(t10);
        } else {
            c2199a.onComplete();
        }
    }

    @Override // org.reactivestreams.v
    public void l(w wVar) {
        if (this.f303611b.get() == f303610f) {
            wVar.cancel();
        } else {
            wVar.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        C2199a<T>[] c2199aArr = this.f303611b.get();
        C2199a<T>[] c2199aArr2 = f303610f;
        if (c2199aArr == c2199aArr2) {
            return;
        }
        T t10 = this.f303613d;
        C2199a<T>[] andSet = this.f303611b.getAndSet(c2199aArr2);
        int i10 = 0;
        if (t10 == null) {
            int length = andSet.length;
            while (i10 < length) {
                andSet[i10].onComplete();
                i10++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i10 < length2) {
            andSet[i10].f(t10);
            i10++;
        }
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C2199a<T>[] c2199aArr = this.f303611b.get();
        C2199a<T>[] c2199aArr2 = f303610f;
        if (c2199aArr == c2199aArr2) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f303613d = null;
        this.f303612c = th2;
        C2199a<T>[] andSet = this.f303611b.getAndSet(c2199aArr2);
        for (C2199a<T> c2199a : andSet) {
            c2199a.onError(th2);
        }
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        io.reactivex.internal.functions.b.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f303611b.get() == f303610f) {
            return;
        }
        this.f303613d = t10;
    }
}
