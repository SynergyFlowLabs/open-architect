package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class j2 extends io.reactivex.b0<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f301806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f301807b;

    static final class a extends io.reactivex.internal.observers.b<Long> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f301808f = 396518478098735504L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.i0<? super Long> f301809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f301810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f301811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f301812e;

        a(io.reactivex.i0<? super Long> i0Var, long j10, long j11) {
            this.f301809b = i0Var;
            this.f301811d = j10;
            this.f301810c = j11;
        }

        @Override // ej.o
        @cj.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long poll() throws Exception {
            long j10 = this.f301811d;
            if (j10 != this.f301810c) {
                this.f301811d = 1 + j10;
                return Long.valueOf(j10);
            }
            lazySet(1);
            return null;
        }

        @Override // ej.o
        public void clear() {
            this.f301811d = this.f301810c;
            int i10 = 2 ^ 1;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            set(1);
        }

        @Override // ej.o
        public boolean isEmpty() {
            return this.f301811d == this.f301810c;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get() != 0;
        }

        @Override // ej.k
        public int p(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f301812e = true;
            return 1;
        }

        void run() {
            if (this.f301812e) {
                return;
            }
            io.reactivex.i0<? super Long> i0Var = this.f301809b;
            long j10 = this.f301810c;
            for (long j11 = this.f301811d; j11 != j10 && get() == 0; j11++) {
                i0Var.onNext(Long.valueOf(j11));
            }
            if (get() == 0) {
                lazySet(1);
                i0Var.onComplete();
            }
        }
    }

    public j2(long j10, long j11) {
        this.f301806a = j10;
        this.f301807b = j11;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super Long> i0Var) {
        long j10 = this.f301806a;
        a aVar = new a(i0Var, j10, this.f301807b + j10);
        i0Var.d(aVar);
        aVar.run();
    }
}
