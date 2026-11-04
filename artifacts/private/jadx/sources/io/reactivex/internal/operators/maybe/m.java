package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class m<T, U> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<U> f300887b;

    static final class a<T, U> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b<T> f300888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.u<U> f300889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f300890c;

        a(io.reactivex.v<? super T> vVar, org.reactivestreams.u<U> uVar) {
            this.f300888a = new b<>(vVar);
            this.f300889b = uVar;
        }

        void a() {
            this.f300889b.e(this.f300888a);
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300890c = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300888a.f300893b = t10;
            a();
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300890c, cVar)) {
                this.f300890c = cVar;
                this.f300888a.f300892a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300890c.dispose();
            this.f300890c = io.reactivex.internal.disposables.d.DISPOSED;
            io.reactivex.internal.subscriptions.j.b(this.f300888a);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300888a.get() == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300890c = io.reactivex.internal.disposables.d.DISPOSED;
            a();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300890c = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300888a.f300894c = th2;
            a();
        }
    }

    static final class b<T> extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f300891d = -1215060610805418006L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        T f300893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Throwable f300894c;

        b(io.reactivex.v<? super T> vVar) {
            this.f300892a = vVar;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.o(this, wVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            Throwable th2 = this.f300894c;
            if (th2 != null) {
                this.f300892a.onError(th2);
                return;
            }
            T t10 = this.f300893b;
            if (t10 != null) {
                this.f300892a.b(t10);
            } else {
                this.f300892a.onComplete();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            Throwable th3 = this.f300894c;
            if (th3 == null) {
                this.f300892a.onError(th2);
            } else {
                this.f300892a.onError(new io.reactivex.exceptions.a(th3, th2));
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(Object obj) {
            org.reactivestreams.w wVar = get();
            io.reactivex.internal.subscriptions.j jVar = io.reactivex.internal.subscriptions.j.CANCELLED;
            if (wVar != jVar) {
                lazySet(jVar);
                wVar.cancel();
                onComplete();
            }
        }
    }

    public m(io.reactivex.y<T> yVar, org.reactivestreams.u<U> uVar) {
        super(yVar);
        this.f300887b = uVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300667a.a(new a(vVar, this.f300887b));
    }
}
