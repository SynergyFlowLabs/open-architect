package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class r0<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.g<? super T> f300046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.g<? super Throwable> f300047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final dj.a f300048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final dj.a f300049f;

    static final class a<T> extends io.reactivex.internal.subscribers.a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final dj.g<? super T> f300050f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final dj.g<? super Throwable> f300051g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final dj.a f300052h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final dj.a f300053i;

        a(ej.a<? super T> aVar, dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar2, dj.a aVar3) {
            super(aVar);
            this.f300050f = gVar;
            this.f300051g = gVar2;
            this.f300052h = aVar2;
            this.f300053i = aVar3;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ej.a
        public boolean L(T t10) {
            if (this.f303329d) {
                return false;
            }
            try {
                this.f300050f.accept(t10);
                return this.f303326a.L((Object) t10);
            } catch (Throwable th2) {
                c(th2);
                return false;
            }
        }

        @Override // io.reactivex.internal.subscribers.a, org.reactivestreams.v
        public void onComplete() {
            if (this.f303329d) {
                return;
            }
            try {
                this.f300052h.run();
                this.f303329d = true;
                this.f303326a.onComplete();
                try {
                    this.f300053i.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            } catch (Throwable th3) {
                c(th3);
            }
        }

        @Override // io.reactivex.internal.subscribers.a, org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f303329d) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f303329d = true;
            try {
                this.f300051g.accept(th2);
                this.f303326a.onError(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f303326a.onError(new io.reactivex.exceptions.a(th2, th3));
            }
            try {
                this.f300053i.run();
            } catch (Throwable th4) {
                io.reactivex.exceptions.b.b(th4);
                io.reactivex.plugins.a.Y(th4);
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
                this.f300050f.accept(t10);
                this.f303326a.onNext((Object) t10);
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
        public T poll() throws Exception {
            try {
                T tPoll = this.f303328c.poll();
                if (tPoll == null) {
                    if (this.f303330e == 1) {
                        this.f300052h.run();
                        this.f300053i.run();
                    }
                    return tPoll;
                }
                try {
                    this.f300050f.accept(tPoll);
                    this.f300053i.run();
                    return tPoll;
                } catch (Throwable th2) {
                    try {
                        io.reactivex.exceptions.b.b(th2);
                        try {
                            this.f300051g.accept(th2);
                            throw io.reactivex.internal.util.k.d(th2);
                        } catch (Throwable th3) {
                            throw new io.reactivex.exceptions.a(th2, th3);
                        }
                    } catch (Throwable th4) {
                        this.f300053i.run();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                io.reactivex.exceptions.b.b(th5);
                try {
                    this.f300051g.accept(th5);
                    throw io.reactivex.internal.util.k.d(th5);
                } catch (Throwable th6) {
                    throw new io.reactivex.exceptions.a(th5, th6);
                }
            }
        }
    }

    static final class b<T> extends io.reactivex.internal.subscribers.b<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final dj.g<? super T> f300054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final dj.g<? super Throwable> f300055g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final dj.a f300056h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final dj.a f300057i;

        b(org.reactivestreams.v<? super T> vVar, dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar, dj.a aVar2) {
            super(vVar);
            this.f300054f = gVar;
            this.f300055g = gVar2;
            this.f300056h = aVar;
            this.f300057i = aVar2;
        }

        @Override // io.reactivex.internal.subscribers.b, org.reactivestreams.v
        public void onComplete() {
            if (this.f303334d) {
                return;
            }
            try {
                this.f300056h.run();
                this.f303334d = true;
                this.f303331a.onComplete();
                try {
                    this.f300057i.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            } catch (Throwable th3) {
                c(th3);
            }
        }

        @Override // io.reactivex.internal.subscribers.b, org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f303334d) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f303334d = true;
            try {
                this.f300055g.accept(th2);
                this.f303331a.onError(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f303331a.onError(new io.reactivex.exceptions.a(th2, th3));
            }
            try {
                this.f300057i.run();
            } catch (Throwable th4) {
                io.reactivex.exceptions.b.b(th4);
                io.reactivex.plugins.a.Y(th4);
            }
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
                this.f300054f.accept(t10);
                this.f303331a.onNext((Object) t10);
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
        public T poll() throws Exception {
            try {
                T tPoll = this.f303333c.poll();
                if (tPoll == null) {
                    if (this.f303335e == 1) {
                        this.f300056h.run();
                        this.f300057i.run();
                    }
                    return tPoll;
                }
                try {
                    this.f300054f.accept(tPoll);
                    this.f300057i.run();
                    return tPoll;
                } catch (Throwable th2) {
                    try {
                        io.reactivex.exceptions.b.b(th2);
                        try {
                            this.f300055g.accept(th2);
                            throw io.reactivex.internal.util.k.d(th2);
                        } catch (Throwable th3) {
                            throw new io.reactivex.exceptions.a(th2, th3);
                        }
                    } catch (Throwable th4) {
                        this.f300057i.run();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                io.reactivex.exceptions.b.b(th5);
                try {
                    this.f300055g.accept(th5);
                    throw io.reactivex.internal.util.k.d(th5);
                } catch (Throwable th6) {
                    throw new io.reactivex.exceptions.a(th5, th6);
                }
            }
        }
    }

    public r0(io.reactivex.l<T> lVar, dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar, dj.a aVar2) {
        super(lVar);
        this.f300046c = gVar;
        this.f300047d = gVar2;
        this.f300048e = aVar;
        this.f300049f = aVar2;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        if (vVar instanceof ej.a) {
            this.f299043b.j6(new a((ej.a) vVar, this.f300046c, this.f300047d, this.f300048e, this.f300049f));
        } else {
            this.f299043b.j6(new b(vVar, this.f300046c, this.f300047d, this.f300048e, this.f300049f));
        }
    }
}
