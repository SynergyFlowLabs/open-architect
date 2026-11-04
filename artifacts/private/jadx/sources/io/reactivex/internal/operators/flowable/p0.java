package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class p0<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.g<? super T> f299962c;

    static final class a<T> extends io.reactivex.internal.subscribers.a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final dj.g<? super T> f299963f;

        a(ej.a<? super T> aVar, dj.g<? super T> gVar) {
            super(aVar);
            this.f299963f = gVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ej.a
        public boolean L(T t10) {
            boolean zL = this.f303326a.L((Object) t10);
            try {
                this.f299963f.accept(t10);
                return zL;
            } catch (Throwable th2) {
                c(th2);
                return zL;
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f303326a.onNext((Object) t10);
            if (this.f303330e == 0) {
                try {
                    this.f299963f.accept(t10);
                } catch (Throwable th2) {
                    c(th2);
                }
            }
        }

        @Override // ej.k
        public int p(int i10) {
            return d(i10);
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            T tPoll = this.f303328c.poll();
            if (tPoll != null) {
                this.f299963f.accept(tPoll);
            }
            return tPoll;
        }
    }

    static final class b<T> extends io.reactivex.internal.subscribers.b<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final dj.g<? super T> f299964f;

        b(org.reactivestreams.v<? super T> vVar, dj.g<? super T> gVar) {
            super(vVar);
            this.f299964f = gVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (!this.f303334d) {
                this.f303331a.onNext((Object) t10);
                if (this.f303335e == 0) {
                    try {
                        this.f299964f.accept(t10);
                    } catch (Throwable th2) {
                        c(th2);
                    }
                }
            }
        }

        @Override // ej.k
        public int p(int i10) {
            return d(i10);
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            T tPoll = this.f303333c.poll();
            if (tPoll != null) {
                this.f299964f.accept(tPoll);
            }
            return tPoll;
        }
    }

    public p0(io.reactivex.l<T> lVar, dj.g<? super T> gVar) {
        super(lVar);
        this.f299962c = gVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        if (vVar instanceof ej.a) {
            this.f299043b.j6(new a((ej.a) vVar, this.f299962c));
        } else {
            this.f299043b.j6(new b(vVar, this.f299962c));
        }
    }
}
