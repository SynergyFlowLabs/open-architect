package io.reactivex.internal.operators.parallel;

import androidx.compose.animation.core.z1;
import io.reactivex.q;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class p<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.parallel.b<List<T>> f302862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Comparator<? super T> f302863c;

    static final class a<T> extends AtomicReference<w> implements q<List<T>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f302864c = 6751017204873808094L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b<T> f302865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f302866b;

        a(b<T> bVar, int i10) {
            this.f302865a = bVar;
            this.f302866b = i10;
        }

        void a() {
            io.reactivex.internal.subscriptions.j.b(this);
        }

        @Override // org.reactivestreams.v
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(List<T> list) {
            this.f302865a.d(list, this.f302866b);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            io.reactivex.internal.subscriptions.j.o(this, wVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f302865a.c(th2);
        }
    }

    static final class b<T> extends AtomicInteger implements w {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f302867j = 3481980673745556697L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super T> f302868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a<T>[] f302869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List<T>[] f302870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int[] f302871d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Comparator<? super T> f302872e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f302874g;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f302873f = new AtomicLong();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicInteger f302875h = new AtomicInteger();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AtomicReference<Throwable> f302876i = new AtomicReference<>();

        b(v<? super T> vVar, int i10, Comparator<? super T> comparator) {
            this.f302868a = vVar;
            this.f302872e = comparator;
            a<T>[] aVarArr = new a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                aVarArr[i11] = new a<>(this, i11);
            }
            this.f302869b = aVarArr;
            this.f302870c = new List[i10];
            this.f302871d = new int[i10];
            this.f302875h.lazySet(i10);
        }

        void a() {
            for (a<T> aVar : this.f302869b) {
                aVar.a();
            }
        }

        void b() {
            int i10;
            if (getAndIncrement() != 0) {
                return;
            }
            v<? super T> vVar = this.f302868a;
            List<T>[] listArr = this.f302870c;
            int[] iArr = this.f302871d;
            int length = iArr.length;
            int i11 = 1;
            while (true) {
                long j10 = this.f302873f.get();
                long j11 = 0;
                while (true) {
                    i10 = 0;
                    if (j11 != j10) {
                        if (this.f302874g) {
                            Arrays.fill(listArr, (Object) null);
                            return;
                        }
                        Throwable th2 = this.f302876i.get();
                        if (th2 != null) {
                            a();
                            Arrays.fill(listArr, (Object) null);
                            vVar.onError(th2);
                            return;
                        }
                        int i12 = -1;
                        T t10 = null;
                        while (i10 < length) {
                            List<T> list = listArr[i10];
                            int i13 = iArr[i10];
                            if (list.size() != i13) {
                                if (t10 == null) {
                                    t10 = list.get(i13);
                                } else {
                                    T t11 = list.get(i13);
                                    try {
                                        if (this.f302872e.compare(t10, t11) > 0) {
                                            t10 = t11;
                                        }
                                    } catch (Throwable th3) {
                                        io.reactivex.exceptions.b.b(th3);
                                        a();
                                        Arrays.fill(listArr, (Object) null);
                                        if (!z1.a(this.f302876i, null, th3)) {
                                            io.reactivex.plugins.a.Y(th3);
                                        }
                                        vVar.onError(this.f302876i.get());
                                        return;
                                    }
                                }
                                i12 = i10;
                            }
                            i10++;
                        }
                        if (t10 == null) {
                            Arrays.fill(listArr, (Object) null);
                            vVar.onComplete();
                            return;
                        } else {
                            vVar.onNext(t10);
                            iArr[i12] = iArr[i12] + 1;
                            j11++;
                        }
                    }
                }
                if (j11 == j10) {
                    if (this.f302874g) {
                        Arrays.fill(listArr, (Object) null);
                        return;
                    }
                    Throwable th4 = this.f302876i.get();
                    if (th4 != null) {
                        a();
                        Arrays.fill(listArr, (Object) null);
                        vVar.onError(th4);
                        return;
                    } else {
                        while (true) {
                            if (i10 >= length) {
                                Arrays.fill(listArr, (Object) null);
                                vVar.onComplete();
                                return;
                            } else if (iArr[i10] != listArr[i10].size()) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f302873f.addAndGet(-j11);
                }
                int iAddAndGet = get();
                if (iAddAndGet == i11 && (iAddAndGet = addAndGet(-i11)) == 0) {
                    return;
                } else {
                    i11 = iAddAndGet;
                }
            }
        }

        void c(Throwable th2) {
            if (z1.a(this.f302876i, null, th2)) {
                b();
            } else if (th2 != this.f302876i.get()) {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f302874g) {
                return;
            }
            this.f302874g = true;
            a();
            if (getAndIncrement() == 0) {
                Arrays.fill(this.f302870c, (Object) null);
            }
        }

        void d(List<T> list, int i10) {
            this.f302870c[i10] = list;
            if (this.f302875h.decrementAndGet() == 0) {
                b();
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f302873f, j10);
                if (this.f302875h.get() == 0) {
                    b();
                }
            }
        }
    }

    public p(io.reactivex.parallel.b<List<T>> bVar, Comparator<? super T> comparator) {
        this.f302862b = bVar;
        this.f302863c = comparator;
    }

    @Override // io.reactivex.l
    protected void k6(v<? super T> vVar) {
        b bVar = new b(vVar, this.f302862b.F(), this.f302863c);
        vVar.l(bVar);
        this.f302862b.Q(bVar.f302869b);
    }
}
