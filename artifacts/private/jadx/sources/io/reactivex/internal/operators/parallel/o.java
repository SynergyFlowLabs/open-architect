package io.reactivex.internal.operators.parallel;

import io.reactivex.j0;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class o<T> extends io.reactivex.parallel.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.parallel.b<? extends T> f302841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final j0 f302842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f302843c;

    static abstract class a<T> extends AtomicInteger implements q<T>, w, Runnable {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f302844k = 9222303586456402150L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f302845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f302846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.queue.b<T> f302847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final j0.c f302848d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        w f302849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f302850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Throwable f302851g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicLong f302852h = new AtomicLong();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f302853i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f302854j;

        a(int i10, io.reactivex.internal.queue.b<T> bVar, j0.c cVar) {
            this.f302845a = i10;
            this.f302847c = bVar;
            this.f302846b = i10 - (i10 >> 2);
            this.f302848d = cVar;
        }

        final void a() {
            if (getAndIncrement() == 0) {
                this.f302848d.b(this);
            }
        }

        @Override // org.reactivestreams.w
        public final void cancel() {
            if (this.f302853i) {
                return;
            }
            this.f302853i = true;
            this.f302849e.cancel();
            this.f302848d.dispose();
            if (getAndIncrement() == 0) {
                this.f302847c.clear();
            }
        }

        @Override // org.reactivestreams.v
        public final void onComplete() {
            if (this.f302850f) {
                return;
            }
            this.f302850f = true;
            a();
        }

        @Override // org.reactivestreams.v
        public final void onError(Throwable th2) {
            if (this.f302850f) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f302851g = th2;
            this.f302850f = true;
            a();
        }

        @Override // org.reactivestreams.v
        public final void onNext(T t10) {
            if (this.f302850f) {
                return;
            }
            if (this.f302847c.offer(t10)) {
                a();
            } else {
                this.f302849e.cancel();
                onError(new io.reactivex.exceptions.c("Queue is full?!"));
            }
        }

        @Override // org.reactivestreams.w
        public final void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f302852h, j10);
                a();
            }
        }
    }

    final class b implements io.reactivex.internal.schedulers.o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super T>[] f302855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final v<T>[] f302856b;

        b(v<? super T>[] vVarArr, v<T>[] vVarArr2) {
            this.f302855a = vVarArr;
            this.f302856b = vVarArr2;
        }

        @Override // io.reactivex.internal.schedulers.o.a
        public void a(int i10, j0.c cVar) {
            o.this.V(i10, this.f302855a, this.f302856b, cVar);
        }
    }

    static final class c<T> extends a<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final long f302858m = 1075119423897941642L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final ej.a<? super T> f302859l;

        c(ej.a<? super T> aVar, int i10, io.reactivex.internal.queue.b<T> bVar, j0.c cVar) {
            super(i10, bVar, cVar);
            this.f302859l = aVar;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f302849e, wVar)) {
                this.f302849e = wVar;
                this.f302859l.l(this);
                wVar.request(this.f302845a);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2;
            int i10 = this.f302854j;
            io.reactivex.internal.queue.b<T> bVar = this.f302847c;
            ej.a<? super T> aVar = this.f302859l;
            int i11 = this.f302846b;
            int iAddAndGet = 1;
            while (true) {
                long j10 = this.f302852h.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f302853i) {
                        bVar.clear();
                        return;
                    }
                    boolean z10 = this.f302850f;
                    if (z10 && (th2 = this.f302851g) != null) {
                        bVar.clear();
                        aVar.onError(th2);
                        this.f302848d.dispose();
                        return;
                    }
                    T tPoll = bVar.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        aVar.onComplete();
                        this.f302848d.dispose();
                        return;
                    } else {
                        if (z11) {
                            break;
                        }
                        if (aVar.L(tPoll)) {
                            j11++;
                        }
                        i10++;
                        if (i10 == i11) {
                            this.f302849e.request(i10);
                            i10 = 0;
                        }
                    }
                }
                if (j11 == j10) {
                    if (this.f302853i) {
                        bVar.clear();
                        return;
                    }
                    if (this.f302850f) {
                        Throwable th3 = this.f302851g;
                        if (th3 != null) {
                            bVar.clear();
                            aVar.onError(th3);
                            this.f302848d.dispose();
                            return;
                        } else if (bVar.isEmpty()) {
                            aVar.onComplete();
                            this.f302848d.dispose();
                            return;
                        }
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f302852h.addAndGet(-j11);
                }
                int i12 = get();
                if (i12 == iAddAndGet) {
                    this.f302854j = i10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i12;
                }
            }
        }
    }

    static final class d<T> extends a<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final long f302860m = 1075119423897941642L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final v<? super T> f302861l;

        d(v<? super T> vVar, int i10, io.reactivex.internal.queue.b<T> bVar, j0.c cVar) {
            super(i10, bVar, cVar);
            this.f302861l = vVar;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f302849e, wVar)) {
                this.f302849e = wVar;
                this.f302861l.l(this);
                wVar.request(this.f302845a);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2;
            int i10 = this.f302854j;
            io.reactivex.internal.queue.b<T> bVar = this.f302847c;
            v<? super T> vVar = this.f302861l;
            int i11 = this.f302846b;
            int iAddAndGet = 1;
            while (true) {
                long j10 = this.f302852h.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f302853i) {
                        bVar.clear();
                        return;
                    }
                    boolean z10 = this.f302850f;
                    if (z10 && (th2 = this.f302851g) != null) {
                        bVar.clear();
                        vVar.onError(th2);
                        this.f302848d.dispose();
                        return;
                    }
                    T tPoll = bVar.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        vVar.onComplete();
                        this.f302848d.dispose();
                        return;
                    } else {
                        if (z11) {
                            break;
                        }
                        vVar.onNext(tPoll);
                        j11++;
                        i10++;
                        if (i10 == i11) {
                            this.f302849e.request(i10);
                            i10 = 0;
                        }
                    }
                }
                if (j11 == j10) {
                    if (this.f302853i) {
                        bVar.clear();
                        return;
                    }
                    if (this.f302850f) {
                        Throwable th3 = this.f302851g;
                        if (th3 != null) {
                            bVar.clear();
                            vVar.onError(th3);
                            this.f302848d.dispose();
                            return;
                        } else if (bVar.isEmpty()) {
                            vVar.onComplete();
                            this.f302848d.dispose();
                            return;
                        }
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f302852h.addAndGet(-j11);
                }
                int i12 = get();
                if (i12 == iAddAndGet) {
                    this.f302854j = i10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i12;
                }
            }
        }
    }

    public o(io.reactivex.parallel.b<? extends T> bVar, j0 j0Var, int i10) {
        this.f302841a = bVar;
        this.f302842b = j0Var;
        this.f302843c = i10;
    }

    @Override // io.reactivex.parallel.b
    public int F() {
        return this.f302841a.F();
    }

    @Override // io.reactivex.parallel.b
    public void Q(v<? super T>[] vVarArr) {
        if (U(vVarArr)) {
            int length = vVarArr.length;
            v<T>[] vVarArr2 = new v[length];
            Object obj = this.f302842b;
            if (obj instanceof io.reactivex.internal.schedulers.o) {
                ((io.reactivex.internal.schedulers.o) obj).a(length, new b(vVarArr, vVarArr2));
            } else {
                for (int i10 = 0; i10 < length; i10++) {
                    V(i10, vVarArr, vVarArr2, this.f302842b.c());
                }
            }
            this.f302841a.Q(vVarArr2);
        }
    }

    void V(int i10, v<? super T>[] vVarArr, v<T>[] vVarArr2, j0.c cVar) {
        v<? super T> vVar = vVarArr[i10];
        io.reactivex.internal.queue.b bVar = new io.reactivex.internal.queue.b(this.f302843c);
        if (vVar instanceof ej.a) {
            vVarArr2[i10] = new c((ej.a) vVar, this.f302843c, bVar, cVar);
        } else {
            vVarArr2[i10] = new d(vVar, this.f302843c, bVar, cVar);
        }
    }
}
