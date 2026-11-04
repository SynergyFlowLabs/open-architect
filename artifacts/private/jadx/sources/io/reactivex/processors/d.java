package io.reactivex.processors;

import androidx.compose.animation.core.z1;
import ej.o;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
@cj.b(cj.a.FULL)
@cj.h("none")
public final class d<T> extends c<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final a[] f303635n = new a[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final a[] f303636o = new a[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicInteger f303637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<w> f303638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<a<T>[]> f303639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicBoolean f303640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f303641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f303642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f303643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    volatile o<T> f303644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    volatile boolean f303645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    volatile Throwable f303646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f303647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f303648m;

    static final class a<T> extends AtomicLong implements w {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f303649d = -363282618957264509L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super T> f303650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d<T> f303651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f303652c;

        a(v<? super T> vVar, d<T> dVar) {
            this.f303650a = vVar;
            this.f303651b = dVar;
        }

        void a() {
            if (get() != Long.MIN_VALUE) {
                this.f303650a.onComplete();
            }
        }

        void b(Throwable th2) {
            if (get() != Long.MIN_VALUE) {
                this.f303650a.onError(th2);
            }
        }

        void c(T t10) {
            if (get() != Long.MIN_VALUE) {
                this.f303652c++;
                this.f303650a.onNext(t10);
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f303651b.Y8(this);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            long j11;
            long j12;
            if (j.p(j10)) {
                do {
                    j11 = get();
                    if (j11 == Long.MIN_VALUE) {
                        return;
                    }
                    j12 = Long.MAX_VALUE;
                    if (j11 == Long.MAX_VALUE) {
                        return;
                    }
                    long j13 = j11 + j10;
                    if (j13 >= 0) {
                        j12 = j13;
                    }
                } while (!compareAndSet(j11, j12));
                this.f303651b.W8();
            }
        }
    }

    d(int i10, boolean z10) {
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        this.f303641f = i10;
        this.f303642g = i10 - (i10 >> 2);
        this.f303637b = new AtomicInteger();
        this.f303639d = new AtomicReference<>(f303635n);
        this.f303638c = new AtomicReference<>();
        this.f303643h = z10;
        this.f303640e = new AtomicBoolean();
    }

    @cj.f
    @cj.d
    public static <T> d<T> S8() {
        return new d<>(l.Y(), false);
    }

    @cj.f
    @cj.d
    public static <T> d<T> T8(int i10) {
        return new d<>(i10, false);
    }

    @cj.f
    @cj.d
    public static <T> d<T> U8(int i10, boolean z10) {
        return new d<>(i10, z10);
    }

    @cj.f
    @cj.d
    public static <T> d<T> V8(boolean z10) {
        return new d<>(l.Y(), z10);
    }

    @Override // io.reactivex.processors.c
    public Throwable M8() {
        if (this.f303640e.get()) {
            return this.f303646k;
        }
        return null;
    }

    @Override // io.reactivex.processors.c
    public boolean N8() {
        return this.f303640e.get() && this.f303646k == null;
    }

    @Override // io.reactivex.processors.c
    public boolean O8() {
        return this.f303639d.get().length != 0;
    }

    @Override // io.reactivex.processors.c
    public boolean P8() {
        return this.f303640e.get() && this.f303646k != null;
    }

    boolean R8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f303639d.get();
            if (aVarArr == f303636o) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!z1.a(this.f303639d, aVarArr, aVarArr2));
        return true;
    }

    void W8() {
        T tPoll;
        if (this.f303637b.getAndIncrement() != 0) {
            return;
        }
        AtomicReference<a<T>[]> atomicReference = this.f303639d;
        int i10 = this.f303647l;
        int i11 = this.f303642g;
        int i12 = this.f303648m;
        int iAddAndGet = 1;
        while (true) {
            o<T> oVar = this.f303644i;
            if (oVar != null) {
                a<T>[] aVarArr = atomicReference.get();
                if (aVarArr.length != 0) {
                    int i13 = 0;
                    long jMin = -1;
                    for (a<T> aVar : aVarArr) {
                        long j10 = aVar.get();
                        if (j10 >= 0) {
                            jMin = jMin == -1 ? j10 - aVar.f303652c : Math.min(jMin, j10 - aVar.f303652c);
                        }
                    }
                    int i14 = i10;
                    while (true) {
                        if (jMin > 0) {
                            a<T>[] aVarArr2 = atomicReference.get();
                            if (aVarArr2 == f303636o) {
                                oVar.clear();
                                return;
                            }
                            if (aVarArr == aVarArr2) {
                                boolean z10 = this.f303645j;
                                try {
                                    tPoll = oVar.poll();
                                } catch (Throwable th2) {
                                    io.reactivex.exceptions.b.b(th2);
                                    j.b(this.f303638c);
                                    this.f303646k = th2;
                                    this.f303645j = true;
                                    tPoll = null;
                                    z10 = true;
                                }
                                boolean z11 = tPoll == null;
                                if (z10 && z11) {
                                    Throwable th3 = this.f303646k;
                                    if (th3 != null) {
                                        a<T>[] andSet = atomicReference.getAndSet(f303636o);
                                        int length = andSet.length;
                                        while (i13 < length) {
                                            andSet[i13].b(th3);
                                            i13++;
                                        }
                                        return;
                                    }
                                    a<T>[] andSet2 = atomicReference.getAndSet(f303636o);
                                    int length2 = andSet2.length;
                                    while (i13 < length2) {
                                        andSet2[i13].a();
                                        i13++;
                                    }
                                    return;
                                }
                                if (!z11) {
                                    for (a<T> aVar2 : aVarArr) {
                                        aVar2.c(tPoll);
                                    }
                                    jMin--;
                                    if (i12 != 1 && (i14 = i14 + 1) == i11) {
                                        this.f303638c.get().request(i11);
                                        i14 = 0;
                                    }
                                }
                            }
                            i10 = i14;
                        }
                        if (jMin == 0) {
                            a<T>[] aVarArr3 = atomicReference.get();
                            a<T>[] aVarArr4 = f303636o;
                            if (aVarArr3 == aVarArr4) {
                                oVar.clear();
                                return;
                            }
                            if (aVarArr != aVarArr3) {
                                i10 = i14;
                            } else if (this.f303645j && oVar.isEmpty()) {
                                Throwable th4 = this.f303646k;
                                if (th4 != null) {
                                    a<T>[] andSet3 = atomicReference.getAndSet(aVarArr4);
                                    int length3 = andSet3.length;
                                    while (i13 < length3) {
                                        andSet3[i13].b(th4);
                                        i13++;
                                    }
                                    return;
                                }
                                a<T>[] andSet4 = atomicReference.getAndSet(aVarArr4);
                                int length4 = andSet4.length;
                                while (i13 < length4) {
                                    andSet4[i13].a();
                                    i13++;
                                }
                                return;
                            }
                        }
                        i10 = i14;
                    }
                }
            }
            iAddAndGet = this.f303637b.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    public boolean X8(T t10) {
        if (this.f303640e.get()) {
            return false;
        }
        io.reactivex.internal.functions.b.g(t10, "offer called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f303648m != 0 || !this.f303644i.offer(t10)) {
            return false;
        }
        W8();
        return true;
    }

    void Y8(a<T> aVar) {
        while (true) {
            a<T>[] aVarArr = this.f303639d.get();
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
            if (length != 1) {
                a[] aVarArr2 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr2, i10, (length - i10) - 1);
                if (z1.a(this.f303639d, aVarArr, aVarArr2)) {
                    return;
                }
            } else if (this.f303643h) {
                if (z1.a(this.f303639d, aVarArr, f303636o)) {
                    j.b(this.f303638c);
                    this.f303640e.set(true);
                    return;
                }
            } else if (z1.a(this.f303639d, aVarArr, f303635n)) {
                return;
            }
        }
    }

    public void Z8() {
        if (j.n(this.f303638c, io.reactivex.internal.subscriptions.g.INSTANCE)) {
            this.f303644i = new io.reactivex.internal.queue.b(this.f303641f);
        }
    }

    public void a9() {
        if (j.n(this.f303638c, io.reactivex.internal.subscriptions.g.INSTANCE)) {
            this.f303644i = new io.reactivex.internal.queue.c(this.f303641f);
        }
    }

    @Override // io.reactivex.l
    protected void k6(v<? super T> vVar) {
        Throwable th2;
        a<T> aVar = new a<>(vVar, this);
        vVar.l(aVar);
        if (R8(aVar)) {
            if (aVar.get() == Long.MIN_VALUE) {
                Y8(aVar);
                return;
            } else {
                W8();
                return;
            }
        }
        if ((this.f303640e.get() || !this.f303643h) && (th2 = this.f303646k) != null) {
            vVar.onError(th2);
        } else {
            vVar.onComplete();
        }
    }

    @Override // org.reactivestreams.v
    public void l(w wVar) {
        if (j.n(this.f303638c, wVar)) {
            if (wVar instanceof ej.l) {
                ej.l lVar = (ej.l) wVar;
                int iP = lVar.p(3);
                if (iP == 1) {
                    this.f303648m = iP;
                    this.f303644i = lVar;
                    this.f303645j = true;
                    W8();
                    return;
                }
                if (iP == 2) {
                    this.f303648m = iP;
                    this.f303644i = lVar;
                    wVar.request(this.f303641f);
                    return;
                }
            }
            this.f303644i = new io.reactivex.internal.queue.b(this.f303641f);
            wVar.request(this.f303641f);
        }
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        if (this.f303640e.compareAndSet(false, true)) {
            this.f303645j = true;
            W8();
        }
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f303640e.compareAndSet(false, true)) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f303646k = th2;
        this.f303645j = true;
        W8();
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        if (this.f303640e.get()) {
            return;
        }
        if (this.f303648m == 0) {
            io.reactivex.internal.functions.b.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (!this.f303644i.offer(t10)) {
                j.b(this.f303638c);
                onError(new io.reactivex.exceptions.c());
                return;
            }
        }
        W8();
    }
}
