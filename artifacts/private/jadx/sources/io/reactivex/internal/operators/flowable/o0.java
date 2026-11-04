package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class o0<T, K> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, K> f299908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.d<? super K, ? super K> f299909d;

    static final class a<T, K> extends io.reactivex.internal.subscribers.a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final dj.o<? super T, K> f299910f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final dj.d<? super K, ? super K> f299911g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        K f299912h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f299913i;

        a(ej.a<? super T> aVar, dj.o<? super T, K> oVar, dj.d<? super K, ? super K> dVar) {
            super(aVar);
            this.f299910f = oVar;
            this.f299911g = dVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ej.a
        public boolean L(T t10) {
            if (this.f303329d) {
                return false;
            }
            if (this.f303330e != 0) {
                return this.f303326a.L((Object) t10);
            }
            try {
                K kApply = this.f299910f.apply(t10);
                if (this.f299913i) {
                    boolean zTest = this.f299911g.test(this.f299912h, kApply);
                    this.f299912h = kApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.f299913i = true;
                    this.f299912h = kApply;
                }
                this.f303326a.onNext((Object) t10);
                return true;
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
            while (true) {
                T tPoll = this.f303328c.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f299910f.apply(tPoll);
                if (!this.f299913i) {
                    this.f299913i = true;
                    this.f299912h = kApply;
                    return tPoll;
                }
                if (!this.f299911g.test(this.f299912h, kApply)) {
                    this.f299912h = kApply;
                    return tPoll;
                }
                this.f299912h = kApply;
                if (this.f303330e != 1) {
                    this.f303327b.request(1L);
                }
            }
        }
    }

    static final class b<T, K> extends io.reactivex.internal.subscribers.b<T, T> implements ej.a<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final dj.o<? super T, K> f299914f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final dj.d<? super K, ? super K> f299915g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        K f299916h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f299917i;

        b(org.reactivestreams.v<? super T> vVar, dj.o<? super T, K> oVar, dj.d<? super K, ? super K> dVar) {
            super(vVar);
            this.f299914f = oVar;
            this.f299915g = dVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ej.a
        public boolean L(T t10) {
            if (this.f303334d) {
                return false;
            }
            if (this.f303335e != 0) {
                this.f303331a.onNext((Object) t10);
                return true;
            }
            try {
                K kApply = this.f299914f.apply(t10);
                if (this.f299917i) {
                    boolean zTest = this.f299915g.test(this.f299916h, kApply);
                    this.f299916h = kApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.f299917i = true;
                    this.f299916h = kApply;
                }
                this.f303331a.onNext((Object) t10);
                return true;
            } catch (Throwable th2) {
                c(th2);
                return true;
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (!L(t10)) {
                this.f303332b.request(1L);
            }
        }

        @Override // ej.k
        public int p(int i10) {
            return d(i10);
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.f303333c.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f299914f.apply(tPoll);
                if (!this.f299917i) {
                    this.f299917i = true;
                    this.f299916h = kApply;
                    return tPoll;
                }
                if (!this.f299915g.test(this.f299916h, kApply)) {
                    this.f299916h = kApply;
                    return tPoll;
                }
                this.f299916h = kApply;
                if (this.f303335e != 1) {
                    this.f303332b.request(1L);
                }
            }
        }
    }

    public o0(io.reactivex.l<T> lVar, dj.o<? super T, K> oVar, dj.d<? super K, ? super K> dVar) {
        super(lVar);
        this.f299908c = oVar;
        this.f299909d = dVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        if (vVar instanceof ej.a) {
            this.f299043b.j6(new a((ej.a) vVar, this.f299908c, this.f299909d));
        } else {
            this.f299043b.j6(new b(vVar, this.f299908c, this.f299909d));
        }
    }
}
