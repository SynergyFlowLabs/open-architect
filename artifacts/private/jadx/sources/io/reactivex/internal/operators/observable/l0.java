package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class l0<T, K> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, K> f301893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.d<? super K, ? super K> f301894c;

    static final class a<T, K> extends io.reactivex.internal.observers.a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final dj.o<? super T, K> f301895f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final dj.d<? super K, ? super K> f301896g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        K f301897h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f301898i;

        a(io.reactivex.i0<? super T> i0Var, dj.o<? super T, K> oVar, dj.d<? super K, ? super K> dVar) {
            super(i0Var);
            this.f301895f = oVar;
            this.f301896g = dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        
            if (r1 != false) goto L13;
         */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.i0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onNext(T r5) {
            /*
                r4 = this;
                java.lang.String r3 = "Androeed.ru"
                boolean r0 = r4.f298739d
                r3 = 5
                if (r0 == 0) goto L8
                goto L2d
            L8:
                int r0 = r4.f298740e
                if (r0 == 0) goto L13
                io.reactivex.i0<? super R> r4 = r4.f298736a
                r4.onNext(r5)
                r3 = 7
                return
            L13:
                dj.o<? super T, K> r0 = r4.f301895f     // Catch: java.lang.Throwable -> L2f
                r3 = 3
                java.lang.Object r0 = r0.apply(r5)     // Catch: java.lang.Throwable -> L2f
                r3 = 2
                boolean r1 = r4.f301898i     // Catch: java.lang.Throwable -> L2f
                if (r1 == 0) goto L31
                dj.d<? super K, ? super K> r1 = r4.f301896g     // Catch: java.lang.Throwable -> L2f
                r3 = 0
                K r2 = r4.f301897h     // Catch: java.lang.Throwable -> L2f
                boolean r1 = r1.test(r2, r0)     // Catch: java.lang.Throwable -> L2f
                r4.f301897h = r0     // Catch: java.lang.Throwable -> L2f
                r3 = 4
                if (r1 == 0) goto L36
            L2d:
                r3 = 4
                return
            L2f:
                r5 = move-exception
                goto L3d
            L31:
                r1 = 1
                r4.f301898i = r1     // Catch: java.lang.Throwable -> L2f
                r4.f301897h = r0     // Catch: java.lang.Throwable -> L2f
            L36:
                io.reactivex.i0<? super R> r4 = r4.f298736a
                r3 = 2
                r4.onNext(r5)
                return
            L3d:
                r3 = 6
                r4.c(r5)
                r3 = 4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.l0.a.onNext(java.lang.Object):void");
        }

        @Override // ej.k
        public int p(int i10) {
            return e(i10);
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.f298738c.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f301895f.apply(tPoll);
                if (!this.f301898i) {
                    this.f301898i = true;
                    this.f301897h = kApply;
                    return tPoll;
                }
                if (!this.f301896g.test(this.f301897h, kApply)) {
                    this.f301897h = kApply;
                    return tPoll;
                }
                this.f301897h = kApply;
            }
        }
    }

    public l0(io.reactivex.g0<T> g0Var, dj.o<? super T, K> oVar, dj.d<? super K, ? super K> dVar) {
        super(g0Var);
        this.f301893b = oVar;
        this.f301894c = dVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f301893b, this.f301894c));
    }
}
