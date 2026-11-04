package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class g1<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final T[] f299408b;

    static final class a<T> extends c<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f299409g = 2587302975077663557L;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final ej.a<? super T> f299410f;

        a(ej.a<? super T> aVar, T[] tArr) {
            super(tArr);
            this.f299410f = aVar;
        }

        @Override // io.reactivex.internal.operators.flowable.g1.c
        void a() {
            T[] tArr = this.f299414b;
            int length = tArr.length;
            ej.a<? super T> aVar = this.f299410f;
            for (int i10 = this.f299415c; i10 != length; i10++) {
                if (this.f299416d) {
                    return;
                }
                T t10 = tArr[i10];
                if (t10 == null) {
                    aVar.onError(new NullPointerException("array element is null"));
                    return;
                }
                aVar.L(t10);
            }
            if (this.f299416d) {
                return;
            }
            aVar.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.g1.c
        void b(long j10) {
            T[] tArr = this.f299414b;
            int length = tArr.length;
            int i10 = this.f299415c;
            ej.a<? super T> aVar = this.f299410f;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i10 == length) {
                        if (i10 == length) {
                            if (this.f299416d) {
                                return;
                            }
                            aVar.onComplete();
                            return;
                        } else {
                            j10 = get();
                            if (j11 == j10) {
                                break;
                            }
                        }
                    } else {
                        if (this.f299416d) {
                            return;
                        }
                        T t10 = tArr[i10];
                        if (t10 == null) {
                            aVar.onError(new NullPointerException("array element is null"));
                            return;
                        } else {
                            if (aVar.L(t10)) {
                                j11++;
                            }
                            i10++;
                        }
                    }
                }
                this.f299415c = i10;
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    static final class b<T> extends c<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f299411g = 2587302975077663557L;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299412f;

        b(org.reactivestreams.v<? super T> vVar, T[] tArr) {
            super(tArr);
            this.f299412f = vVar;
        }

        @Override // io.reactivex.internal.operators.flowable.g1.c
        void a() {
            T[] tArr = this.f299414b;
            int length = tArr.length;
            org.reactivestreams.v<? super T> vVar = this.f299412f;
            for (int i10 = this.f299415c; i10 != length; i10++) {
                if (this.f299416d) {
                    return;
                }
                T t10 = tArr[i10];
                if (t10 == null) {
                    vVar.onError(new NullPointerException("array element is null"));
                    return;
                }
                vVar.onNext(t10);
            }
            if (this.f299416d) {
                return;
            }
            vVar.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.g1.c
        void b(long j10) {
            T[] tArr = this.f299414b;
            int length = tArr.length;
            int i10 = this.f299415c;
            org.reactivestreams.v<? super T> vVar = this.f299412f;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i10 == length) {
                        if (i10 == length) {
                            if (this.f299416d) {
                                return;
                            }
                            vVar.onComplete();
                            return;
                        } else {
                            j10 = get();
                            if (j11 == j10) {
                                break;
                            }
                        }
                    } else {
                        if (this.f299416d) {
                            return;
                        }
                        T t10 = tArr[i10];
                        if (t10 == null) {
                            vVar.onError(new NullPointerException("array element is null"));
                            return;
                        } else {
                            vVar.onNext(t10);
                            j11++;
                            i10++;
                        }
                    }
                }
                this.f299415c = i10;
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    static abstract class c<T> extends io.reactivex.internal.subscriptions.d<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f299413e = -2252972430506210021L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T[] f299414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f299415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f299416d;

        c(T[] tArr) {
            this.f299414b = tArr;
        }

        abstract void a();

        abstract void b(long j10);

        @Override // org.reactivestreams.w
        public final void cancel() {
            this.f299416d = true;
        }

        @Override // ej.o
        public final void clear() {
            this.f299415c = this.f299414b.length;
        }

        @Override // ej.o
        public final boolean isEmpty() {
            return this.f299415c == this.f299414b.length;
        }

        @Override // ej.k
        public final int p(int i10) {
            return i10 & 1;
        }

        @Override // ej.o
        @cj.g
        public final T poll() {
            int i10 = this.f299415c;
            T[] tArr = this.f299414b;
            if (i10 == tArr.length) {
                return null;
            }
            this.f299415c = i10 + 1;
            return (T) io.reactivex.internal.functions.b.g(tArr[i10], "array element is null");
        }

        @Override // org.reactivestreams.w
        public final void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10) && io.reactivex.internal.util.d.a(this, j10) == 0) {
                if (j10 == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j10);
                }
            }
        }
    }

    public g1(T[] tArr) {
        this.f299408b = tArr;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        if (vVar instanceof ej.a) {
            vVar.l(new a((ej.a) vVar, this.f299408b));
        } else {
            vVar.l(new b(vVar, this.f299408b));
        }
    }
}
