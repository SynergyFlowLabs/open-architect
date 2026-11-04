package io.reactivex.internal.operators.flowable;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class m<T, C extends Collection<? super T>> extends io.reactivex.internal.operators.flowable.a<T, C> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f299722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f299723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Callable<C> f299724e;

    static final class a<T, C extends Collection<? super T>> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super C> f299725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Callable<C> f299726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f299727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        C f299728d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.w f299729e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f299730f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f299731g;

        a(org.reactivestreams.v<? super C> vVar, int i10, Callable<C> callable) {
            this.f299725a = vVar;
            this.f299727c = i10;
            this.f299726b = callable;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299729e.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299729e, wVar)) {
                this.f299729e = wVar;
                this.f299725a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299730f) {
                return;
            }
            this.f299730f = true;
            C c10 = this.f299728d;
            if (c10 != null && !c10.isEmpty()) {
                this.f299725a.onNext(c10);
            }
            this.f299725a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299730f) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f299730f = true;
                this.f299725a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299730f) {
                return;
            }
            C c10 = this.f299728d;
            if (c10 == null) {
                try {
                    c10 = (C) io.reactivex.internal.functions.b.g(this.f299726b.call(), "The bufferSupplier returned a null buffer");
                    this.f299728d = c10;
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    cancel();
                    onError(th2);
                    return;
                }
            }
            c10.add(t10);
            int i10 = this.f299731g + 1;
            if (i10 != this.f299727c) {
                this.f299731g = i10;
                return;
            }
            this.f299731g = 0;
            this.f299728d = null;
            this.f299725a.onNext(c10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                this.f299729e.request(io.reactivex.internal.util.d.d(j10, this.f299727c));
            }
        }
    }

    static final class b<T, C extends Collection<? super T>> extends AtomicLong implements io.reactivex.q<T>, org.reactivestreams.w, dj.e {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f299732l = -7370244972039324525L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super C> f299733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Callable<C> f299734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f299735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f299736d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        org.reactivestreams.w f299739g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f299740h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f299741i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f299742j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        long f299743k;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicBoolean f299738f = new AtomicBoolean();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final ArrayDeque<C> f299737e = new ArrayDeque<>();

        b(org.reactivestreams.v<? super C> vVar, int i10, int i11, Callable<C> callable) {
            this.f299733a = vVar;
            this.f299735c = i10;
            this.f299736d = i11;
            this.f299734b = callable;
        }

        @Override // dj.e
        public boolean a() {
            return this.f299742j;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299742j = true;
            this.f299739g.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299739g, wVar)) {
                this.f299739g = wVar;
                this.f299733a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299740h) {
                return;
            }
            this.f299740h = true;
            long j10 = this.f299743k;
            if (j10 != 0) {
                io.reactivex.internal.util.d.e(this, j10);
            }
            io.reactivex.internal.util.v.g(this.f299733a, this.f299737e, this, this);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299740h) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f299740h = true;
            this.f299737e.clear();
            this.f299733a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299740h) {
                return;
            }
            ArrayDeque<C> arrayDeque = this.f299737e;
            int i10 = this.f299741i;
            int i11 = i10 + 1;
            if (i10 == 0) {
                try {
                    arrayDeque.offer((C) ((Collection) io.reactivex.internal.functions.b.g(this.f299734b.call(), "The bufferSupplier returned a null buffer")));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    cancel();
                    onError(th2);
                    return;
                }
            }
            C cPeek = arrayDeque.peek();
            if (cPeek != null && cPeek.size() + 1 == this.f299735c) {
                arrayDeque.poll();
                cPeek.add(t10);
                this.f299743k++;
                this.f299733a.onNext(cPeek);
            }
            Iterator<C> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().add(t10);
            }
            if (i11 == this.f299736d) {
                i11 = 0;
            }
            this.f299741i = i11;
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (!io.reactivex.internal.subscriptions.j.p(j10) || io.reactivex.internal.util.v.i(j10, this.f299733a, this.f299737e, this, this)) {
                return;
            }
            if (this.f299738f.get() || !this.f299738f.compareAndSet(false, true)) {
                this.f299739g.request(io.reactivex.internal.util.d.d(this.f299736d, j10));
            } else {
                this.f299739g.request(io.reactivex.internal.util.d.c(this.f299735c, io.reactivex.internal.util.d.d(this.f299736d, j10 - 1)));
            }
        }
    }

    static final class c<T, C extends Collection<? super T>> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f299744i = -5616169793639412593L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super C> f299745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Callable<C> f299746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f299747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f299748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C f299749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        org.reactivestreams.w f299750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f299751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f299752h;

        c(org.reactivestreams.v<? super C> vVar, int i10, int i11, Callable<C> callable) {
            this.f299745a = vVar;
            this.f299747c = i10;
            this.f299748d = i11;
            this.f299746b = callable;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299750f.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299750f, wVar)) {
                this.f299750f = wVar;
                this.f299745a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299751g) {
                return;
            }
            this.f299751g = true;
            C c10 = this.f299749e;
            this.f299749e = null;
            if (c10 != null) {
                this.f299745a.onNext(c10);
            }
            this.f299745a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299751g) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f299751g = true;
            this.f299749e = null;
            this.f299745a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299751g) {
                return;
            }
            C c10 = this.f299749e;
            int i10 = this.f299752h;
            int i11 = i10 + 1;
            if (i10 == 0) {
                try {
                    c10 = (C) io.reactivex.internal.functions.b.g(this.f299746b.call(), "The bufferSupplier returned a null buffer");
                    this.f299749e = c10;
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    cancel();
                    onError(th2);
                    return;
                }
            }
            if (c10 != null) {
                c10.add(t10);
                if (c10.size() == this.f299747c) {
                    this.f299749e = null;
                    this.f299745a.onNext(c10);
                }
            }
            if (i11 == this.f299748d) {
                i11 = 0;
            }
            this.f299752h = i11;
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    this.f299750f.request(io.reactivex.internal.util.d.d(this.f299748d, j10));
                    return;
                }
                this.f299750f.request(io.reactivex.internal.util.d.c(io.reactivex.internal.util.d.d(j10, this.f299747c), io.reactivex.internal.util.d.d(this.f299748d - this.f299747c, j10 - 1)));
            }
        }
    }

    public m(io.reactivex.l<T> lVar, int i10, int i11, Callable<C> callable) {
        super(lVar);
        this.f299722c = i10;
        this.f299723d = i11;
        this.f299724e = callable;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super C> vVar) {
        int i10 = this.f299722c;
        int i11 = this.f299723d;
        if (i10 == i11) {
            this.f299043b.j6(new a(vVar, i10, this.f299724e));
        } else if (i11 > i10) {
            this.f299043b.j6(new c(vVar, this.f299722c, this.f299723d, this.f299724e));
        } else {
            this.f299043b.j6(new b(vVar, this.f299722c, this.f299723d, this.f299724e));
        }
    }
}
