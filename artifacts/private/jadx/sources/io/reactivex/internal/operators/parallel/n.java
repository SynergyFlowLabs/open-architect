package io.reactivex.internal.operators.parallel;

import androidx.compose.animation.core.z1;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class n<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.parallel.b<? extends T> f302824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.c<T, T, T> f302825c;

    static final class a<T> extends AtomicReference<w> implements q<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f302826e = -7954444275102466525L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b<T> f302827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.c<T, T, T> f302828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        T f302829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f302830d;

        a(b<T> bVar, dj.c<T, T, T> cVar) {
            this.f302827a = bVar;
            this.f302828b = cVar;
        }

        void a() {
            io.reactivex.internal.subscriptions.j.b(this);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            io.reactivex.internal.subscriptions.j.o(this, wVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f302830d) {
                return;
            }
            this.f302830d = true;
            this.f302827a.j(this.f302829c);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f302830d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302830d = true;
                this.f302827a.a(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f302830d) {
                return;
            }
            T t11 = this.f302829c;
            if (t11 == null) {
                this.f302829c = t10;
                return;
            }
            try {
                this.f302829c = (T) io.reactivex.internal.functions.b.g(this.f302828b.apply(t11, t10), "The reducer returned a null value");
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                get().cancel();
                onError(th2);
            }
        }
    }

    static final class b<T> extends io.reactivex.internal.subscriptions.f<T> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final long f302831v = -5370107872170712765L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final a<T>[] f302832m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final dj.c<T, T, T> f302833n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final AtomicReference<c<T>> f302834o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final AtomicInteger f302835s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final AtomicReference<Throwable> f302836t;

        b(v<? super T> vVar, int i10, dj.c<T, T, T> cVar) {
            super(vVar);
            this.f302834o = new AtomicReference<>();
            this.f302835s = new AtomicInteger();
            this.f302836t = new AtomicReference<>();
            a<T>[] aVarArr = new a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                aVarArr[i11] = new a<>(this, cVar);
            }
            this.f302832m = aVarArr;
            this.f302833n = cVar;
            this.f302835s.lazySet(i10);
        }

        void a(Throwable th2) {
            if (z1.a(this.f302836t, null, th2)) {
                cancel();
                this.f303450b.onError(th2);
            } else if (th2 != this.f302836t.get()) {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.internal.subscriptions.f, org.reactivestreams.w
        public void cancel() {
            for (a<T> aVar : this.f302832m) {
                aVar.a();
            }
        }

        c<T> i(T t10) {
            c<T> cVar;
            int iB;
            while (true) {
                cVar = this.f302834o.get();
                if (cVar == null) {
                    cVar = new c<>();
                    if (!z1.a(this.f302834o, null, cVar)) {
                        continue;
                    }
                }
                iB = cVar.b();
                if (iB >= 0) {
                    break;
                }
                z1.a(this.f302834o, cVar, null);
            }
            if (iB == 0) {
                cVar.f302838a = t10;
            } else {
                cVar.f302839b = t10;
            }
            if (!cVar.a()) {
                return null;
            }
            z1.a(this.f302834o, cVar, null);
            return cVar;
        }

        void j(T t10) {
            if (t10 != null) {
                while (true) {
                    c<T> cVarI = i(t10);
                    if (cVarI == null) {
                        break;
                    }
                    try {
                        t10 = (T) io.reactivex.internal.functions.b.g(this.f302833n.apply(cVarI.f302838a, cVarI.f302839b), "The reducer returned a null value");
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        a(th2);
                        return;
                    }
                }
            }
            if (this.f302835s.decrementAndGet() == 0) {
                c<T> cVar = this.f302834o.get();
                this.f302834o.lazySet(null);
                if (cVar != null) {
                    f(cVar.f302838a);
                } else {
                    this.f303450b.onComplete();
                }
            }
        }
    }

    static final class c<T> extends AtomicInteger {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f302837d = 473971317683868662L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        T f302838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        T f302839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicInteger f302840c = new AtomicInteger();

        c() {
        }

        boolean a() {
            return this.f302840c.incrementAndGet() == 2;
        }

        int b() {
            int i10;
            do {
                i10 = get();
                if (i10 >= 2) {
                    return -1;
                }
            } while (!compareAndSet(i10, i10 + 1));
            return i10;
        }
    }

    public n(io.reactivex.parallel.b<? extends T> bVar, dj.c<T, T, T> cVar) {
        this.f302824b = bVar;
        this.f302825c = cVar;
    }

    @Override // io.reactivex.l
    protected void k6(v<? super T> vVar) {
        b bVar = new b(vVar, this.f302824b.F(), this.f302825c);
        vVar.l(bVar);
        this.f302824b.Q(bVar.f302832m);
    }
}
