package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class l0<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.a0<R>> f299666c;

    static final class a<T, R> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f299667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.a0<R>> f299668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f299669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.w f299670d;

        a(org.reactivestreams.v<? super R> vVar, dj.o<? super T, ? extends io.reactivex.a0<R>> oVar) {
            this.f299667a = vVar;
            this.f299668b = oVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299670d.cancel();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299670d, wVar)) {
                this.f299670d = wVar;
                this.f299667a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299669c) {
                return;
            }
            this.f299669c = true;
            this.f299667a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299669c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f299669c = true;
                this.f299667a.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299669c) {
                if (t10 instanceof io.reactivex.a0) {
                    io.reactivex.a0 a0Var = (io.reactivex.a0) t10;
                    if (a0Var.g()) {
                        io.reactivex.plugins.a.Y(a0Var.d());
                    }
                }
                return;
            }
            try {
                io.reactivex.a0 a0Var2 = (io.reactivex.a0) io.reactivex.internal.functions.b.g(this.f299668b.apply(t10), "The selector returned a null Notification");
                if (a0Var2.g()) {
                    this.f299670d.cancel();
                    onError(a0Var2.d());
                } else if (!a0Var2.f()) {
                    this.f299667a.onNext((Object) a0Var2.e());
                } else {
                    this.f299670d.cancel();
                    onComplete();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f299670d.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f299670d.request(j10);
        }
    }

    public l0(io.reactivex.l<T> lVar, dj.o<? super T, ? extends io.reactivex.a0<R>> oVar) {
        super(lVar);
        this.f299666c = oVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        this.f299043b.j6(new a(vVar, this.f299666c));
    }
}
