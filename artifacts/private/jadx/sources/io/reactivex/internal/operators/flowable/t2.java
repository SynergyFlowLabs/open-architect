package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class t2 extends io.reactivex.l<Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f300234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f300235c;

    static abstract class a extends io.reactivex.internal.subscriptions.d<Integer> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f300236e = -2252972430506210021L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f300237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f300238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f300239d;

        a(int i10, int i11) {
            this.f300238c = i10;
            this.f300237b = i11;
        }

        abstract void a();

        @Override // ej.o
        @cj.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer poll() {
            int i10 = this.f300238c;
            if (i10 == this.f300237b) {
                return null;
            }
            this.f300238c = i10 + 1;
            return Integer.valueOf(i10);
        }

        abstract void c(long j10);

        @Override // org.reactivestreams.w
        public final void cancel() {
            this.f300239d = true;
        }

        @Override // ej.o
        public final void clear() {
            this.f300238c = this.f300237b;
        }

        @Override // ej.o
        public final boolean isEmpty() {
            return this.f300238c == this.f300237b;
        }

        @Override // ej.k
        public final int p(int i10) {
            return i10 & 1;
        }

        @Override // org.reactivestreams.w
        public final void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10) && io.reactivex.internal.util.d.a(this, j10) == 0) {
                if (j10 == Long.MAX_VALUE) {
                    a();
                } else {
                    c(j10);
                }
            }
        }
    }

    static final class b extends a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f300240g = 2587302975077663557L;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final ej.a<? super Integer> f300241f;

        b(ej.a<? super Integer> aVar, int i10, int i11) {
            super(i10, i11);
            this.f300241f = aVar;
        }

        @Override // io.reactivex.internal.operators.flowable.t2.a
        void a() {
            int i10 = this.f300237b;
            ej.a<? super Integer> aVar = this.f300241f;
            for (int i11 = this.f300238c; i11 != i10; i11++) {
                if (this.f300239d) {
                    return;
                }
                aVar.L(Integer.valueOf(i11));
            }
            if (this.f300239d) {
                return;
            }
            aVar.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.t2.a
        void c(long j10) {
            int i10 = this.f300237b;
            int i11 = this.f300238c;
            ej.a<? super Integer> aVar = this.f300241f;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i11 == i10) {
                        if (i11 == i10) {
                            if (this.f300239d) {
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
                        if (this.f300239d) {
                            return;
                        }
                        if (aVar.L(Integer.valueOf(i11))) {
                            j11++;
                        }
                        i11++;
                    }
                }
                this.f300238c = i11;
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    static final class c extends a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f300242g = 2587302975077663557L;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final org.reactivestreams.v<? super Integer> f300243f;

        c(org.reactivestreams.v<? super Integer> vVar, int i10, int i11) {
            super(i10, i11);
            this.f300243f = vVar;
        }

        @Override // io.reactivex.internal.operators.flowable.t2.a
        void a() {
            int i10 = this.f300237b;
            org.reactivestreams.v<? super Integer> vVar = this.f300243f;
            for (int i11 = this.f300238c; i11 != i10; i11++) {
                if (this.f300239d) {
                    return;
                }
                vVar.onNext(Integer.valueOf(i11));
            }
            if (this.f300239d) {
                return;
            }
            vVar.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.t2.a
        void c(long j10) {
            int i10 = this.f300237b;
            int i11 = this.f300238c;
            org.reactivestreams.v<? super Integer> vVar = this.f300243f;
            loop0: do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i11 == i10) {
                        if (i11 == i10) {
                            if (this.f300239d) {
                                break loop0;
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
                        if (this.f300239d) {
                            break loop0;
                        }
                        vVar.onNext(Integer.valueOf(i11));
                        j11++;
                        i11++;
                    }
                }
                this.f300238c = i11;
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public t2(int i10, int i11) {
        this.f300234b = i10;
        this.f300235c = i10 + i11;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super Integer> vVar) {
        if (vVar instanceof ej.a) {
            vVar.l(new b((ej.a) vVar, this.f300234b, this.f300235c));
        } else {
            vVar.l(new c(vVar, this.f300234b, this.f300235c));
        }
    }
}
