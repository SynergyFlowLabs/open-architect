package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class u2 extends io.reactivex.l<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f300311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f300312c;

    static abstract class a extends io.reactivex.internal.subscriptions.d<Long> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f300313e = -2252972430506210021L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f300314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f300315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f300316d;

        a(long j10, long j11) {
            this.f300315c = j10;
            this.f300314b = j11;
        }

        abstract void a();

        @Override // ej.o
        @cj.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Long poll() {
            long j10 = this.f300315c;
            if (j10 == this.f300314b) {
                return null;
            }
            this.f300315c = 1 + j10;
            return Long.valueOf(j10);
        }

        abstract void c(long j10);

        @Override // org.reactivestreams.w
        public final void cancel() {
            this.f300316d = true;
        }

        @Override // ej.o
        public final void clear() {
            this.f300315c = this.f300314b;
        }

        @Override // ej.o
        public final boolean isEmpty() {
            return this.f300315c == this.f300314b;
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
                    return;
                }
                c(j10);
            }
        }
    }

    static final class b extends a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f300317g = 2587302975077663557L;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final ej.a<? super Long> f300318f;

        b(ej.a<? super Long> aVar, long j10, long j11) {
            super(j10, j11);
            this.f300318f = aVar;
        }

        @Override // io.reactivex.internal.operators.flowable.u2.a
        void a() {
            long j10 = this.f300314b;
            ej.a<? super Long> aVar = this.f300318f;
            for (long j11 = this.f300315c; j11 != j10; j11++) {
                if (this.f300316d) {
                    return;
                }
                aVar.L(Long.valueOf(j11));
            }
            if (this.f300316d) {
                return;
            }
            aVar.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.u2.a
        void c(long j10) {
            long j11 = this.f300314b;
            long j12 = this.f300315c;
            ej.a<? super Long> aVar = this.f300318f;
            loop0: do {
                long j13 = 0;
                while (true) {
                    if (j13 == j10 || j12 == j11) {
                        if (j12 == j11) {
                            if (this.f300316d) {
                                break loop0;
                            }
                            aVar.onComplete();
                            return;
                        } else {
                            j10 = get();
                            if (j13 == j10) {
                                break;
                            }
                        }
                    } else {
                        if (this.f300316d) {
                            break loop0;
                        }
                        if (aVar.L(Long.valueOf(j12))) {
                            j13++;
                        }
                        j12++;
                    }
                }
                this.f300315c = j12;
                j10 = addAndGet(-j13);
            } while (j10 != 0);
        }
    }

    static final class c extends a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f300319g = 2587302975077663557L;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final org.reactivestreams.v<? super Long> f300320f;

        c(org.reactivestreams.v<? super Long> vVar, long j10, long j11) {
            super(j10, j11);
            this.f300320f = vVar;
        }

        @Override // io.reactivex.internal.operators.flowable.u2.a
        void a() {
            long j10 = this.f300314b;
            org.reactivestreams.v<? super Long> vVar = this.f300320f;
            for (long j11 = this.f300315c; j11 != j10; j11++) {
                if (this.f300316d) {
                }
                vVar.onNext(Long.valueOf(j11));
            }
            if (!this.f300316d) {
                vVar.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.u2.a
        void c(long j10) {
            long j11 = this.f300314b;
            long j12 = this.f300315c;
            org.reactivestreams.v<? super Long> vVar = this.f300320f;
            loop0: do {
                long j13 = 0;
                while (true) {
                    if (j13 == j10 || j12 == j11) {
                        if (j12 == j11) {
                            if (this.f300316d) {
                                break loop0;
                            }
                            vVar.onComplete();
                            return;
                        } else {
                            j10 = get();
                            if (j13 == j10) {
                                break;
                            }
                        }
                    } else {
                        if (this.f300316d) {
                            break loop0;
                        }
                        vVar.onNext(Long.valueOf(j12));
                        j13++;
                        j12++;
                    }
                }
                this.f300315c = j12;
                j10 = addAndGet(-j13);
            } while (j10 != 0);
        }
    }

    public u2(long j10, long j11) {
        this.f300311b = j10;
        this.f300312c = j10 + j11;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super Long> vVar) {
        if (vVar instanceof ej.a) {
            vVar.l(new b((ej.a) vVar, this.f300311b, this.f300312c));
        } else {
            vVar.l(new c(vVar, this.f300311b, this.f300312c));
        }
    }
}
