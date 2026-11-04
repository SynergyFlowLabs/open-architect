package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class i2 extends io.reactivex.b0<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f301715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f301716b;

    static final class a extends io.reactivex.internal.observers.b<Integer> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f301717f = 396518478098735504L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.i0<? super Integer> f301718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f301719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f301720d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f301721e;

        a(io.reactivex.i0<? super Integer> i0Var, long j10, long j11) {
            this.f301718b = i0Var;
            this.f301720d = j10;
            this.f301719c = j11;
        }

        @Override // ej.o
        @cj.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer poll() throws Exception {
            long j10 = this.f301720d;
            if (j10 != this.f301719c) {
                this.f301720d = 1 + j10;
                return Integer.valueOf((int) j10);
            }
            lazySet(1);
            return null;
        }

        @Override // ej.o
        public void clear() {
            this.f301720d = this.f301719c;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            set(1);
        }

        @Override // ej.o
        public boolean isEmpty() {
            return this.f301720d == this.f301719c;
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
            this.f301721e = true;
            return 1;
        }

        void run() {
            if (this.f301721e) {
                return;
            }
            io.reactivex.i0<? super Integer> i0Var = this.f301718b;
            long j10 = this.f301719c;
            for (long j11 = this.f301720d; j11 != j10 && get() == 0; j11++) {
                i0Var.onNext(Integer.valueOf((int) j11));
            }
            if (get() == 0) {
                lazySet(1);
                i0Var.onComplete();
            }
        }
    }

    public i2(int i10, int i11) {
        this.f301715a = i10;
        this.f301716b = ((long) i10) + ((long) i11);
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super Integer> i0Var) {
        a aVar = new a(i0Var, this.f301715a, this.f301716b);
        i0Var.d(aVar);
        aVar.run();
    }
}
