package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class b2<T, U> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends U> f299121c;

    static final class a<T, U> extends io.reactivex.internal.subscribers.a<T, U> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final dj.o<? super T, ? extends U> f299122f;

        a(ej.a<? super U> aVar, dj.o<? super T, ? extends U> oVar) {
            super(aVar);
            this.f299122f = oVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ej.a
        public boolean L(T t10) {
            if (this.f303329d) {
                return false;
            }
            try {
                return this.f303326a.L((Object) io.reactivex.internal.functions.b.g(this.f299122f.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                c(th2);
                return true;
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f303329d) {
                return;
            }
            if (this.f303330e != 0) {
                this.f303326a.onNext(null);
                return;
            }
            try {
                this.f303326a.onNext((Object) io.reactivex.internal.functions.b.g(this.f299122f.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // ej.k
        public int p(int i10) {
            return d(i10);
        }

        @Override // ej.o
        @cj.g
        public U poll() throws Exception {
            T tPoll = this.f303328c.poll();
            if (tPoll != null) {
                return (U) io.reactivex.internal.functions.b.g(this.f299122f.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    static final class b<T, U> extends io.reactivex.internal.subscribers.b<T, U> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final dj.o<? super T, ? extends U> f299123f;

        b(org.reactivestreams.v<? super U> vVar, dj.o<? super T, ? extends U> oVar) {
            super(vVar);
            this.f299123f = oVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f303334d) {
                return;
            }
            if (this.f303335e != 0) {
                this.f303331a.onNext(null);
                return;
            }
            try {
                this.f303331a.onNext((Object) io.reactivex.internal.functions.b.g(this.f299123f.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // ej.k
        public int p(int i10) {
            return d(i10);
        }

        @Override // ej.o
        @cj.g
        public U poll() throws Exception {
            T tPoll = this.f303333c.poll();
            if (tPoll != null) {
                return (U) io.reactivex.internal.functions.b.g(this.f299123f.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    public b2(io.reactivex.l<T> lVar, dj.o<? super T, ? extends U> oVar) {
        super(lVar);
        this.f299121c = oVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super U> vVar) {
        if (vVar instanceof ej.a) {
            this.f299043b.j6(new a((ej.a) vVar, this.f299121c));
        } else {
            this.f299043b.j6(new b(vVar, this.f299121c));
        }
    }
}
