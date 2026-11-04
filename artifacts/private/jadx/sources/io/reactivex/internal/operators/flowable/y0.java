package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class y0<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.r<? super T> f300534c;

    static final class a<T> extends io.reactivex.internal.subscribers.a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final dj.r<? super T> f300535f;

        a(ej.a<? super T> aVar, dj.r<? super T> rVar) {
            super(aVar);
            this.f300535f = rVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ej.a
        public boolean L(T t10) {
            if (this.f303329d) {
                return false;
            }
            if (this.f303330e != 0) {
                return this.f303326a.L(null);
            }
            try {
                return this.f300535f.test(t10) && this.f303326a.L((Object) t10);
            } catch (Throwable th2) {
                c(th2);
                return true;
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (L(t10)) {
                return;
            }
            this.f303327b.request(1L);
        }

        @Override // ej.k
        public int p(int i10) {
            return d(i10);
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            ej.l<T> lVar = this.f303328c;
            dj.r<? super T> rVar = this.f300535f;
            while (true) {
                T tPoll = lVar.poll();
                if (tPoll == null) {
                    return null;
                }
                if (rVar.test(tPoll)) {
                    return tPoll;
                }
                if (this.f303330e == 2) {
                    lVar.request(1L);
                }
            }
        }
    }

    static final class b<T> extends io.reactivex.internal.subscribers.b<T, T> implements ej.a<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final dj.r<? super T> f300536f;

        b(org.reactivestreams.v<? super T> vVar, dj.r<? super T> rVar) {
            super(vVar);
            this.f300536f = rVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ej.a
        public boolean L(T t10) {
            if (this.f303334d) {
                return false;
            }
            if (this.f303335e != 0) {
                this.f303331a.onNext(null);
                return true;
            }
            try {
                boolean zTest = this.f300536f.test(t10);
                if (zTest) {
                    this.f303331a.onNext((Object) t10);
                }
                return zTest;
            } catch (Throwable th2) {
                c(th2);
                return true;
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (L(t10)) {
                return;
            }
            this.f303332b.request(1L);
        }

        @Override // ej.k
        public int p(int i10) {
            return d(i10);
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            ej.l<T> lVar = this.f303333c;
            dj.r<? super T> rVar = this.f300536f;
            while (true) {
                T tPoll = lVar.poll();
                if (tPoll == null) {
                    return null;
                }
                if (rVar.test(tPoll)) {
                    return tPoll;
                }
                if (this.f303335e == 2) {
                    lVar.request(1L);
                }
            }
        }
    }

    public y0(io.reactivex.l<T> lVar, dj.r<? super T> rVar) {
        super(lVar);
        this.f300534c = rVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        if (vVar instanceof ej.a) {
            this.f299043b.j6(new a((ej.a) vVar, this.f300534c));
        } else {
            this.f299043b.j6(new b(vVar, this.f300534c));
        }
    }
}
