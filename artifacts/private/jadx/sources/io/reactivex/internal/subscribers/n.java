package io.reactivex.internal.subscribers;

/* JADX INFO: loaded from: classes11.dex */
public abstract class n<T, U, V> extends r implements io.reactivex.q<T>, io.reactivex.internal.util.u<U, V> {
    protected final org.reactivestreams.v<? super V> B3;
    protected final ej.n<U> C3;
    protected volatile boolean D3;
    protected volatile boolean E3;
    protected Throwable F3;

    public n(org.reactivestreams.v<? super V> vVar, ej.n<U> nVar) {
        this.B3 = vVar;
        this.C3 = nVar;
    }

    @Override // io.reactivex.internal.util.u
    public final int a(int i10) {
        return this.f303416s.addAndGet(i10);
    }

    @Override // io.reactivex.internal.util.u
    public final boolean b() {
        return this.f303416s.getAndIncrement() == 0;
    }

    @Override // io.reactivex.internal.util.u
    public final boolean c() {
        return this.E3;
    }

    @Override // io.reactivex.internal.util.u
    public final long d(long j10) {
        return this.f303401l3.addAndGet(-j10);
    }

    @Override // io.reactivex.internal.util.u
    public final boolean e() {
        return this.D3;
    }

    @Override // io.reactivex.internal.util.u
    public final Throwable error() {
        return this.F3;
    }

    public boolean f(org.reactivestreams.v<? super V> vVar, U u10) {
        return false;
    }

    public final boolean g() {
        return this.f303416s.get() == 0 && this.f303416s.compareAndSet(0, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (b() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void h(U r8, boolean r9, io.reactivex.disposables.c r10) {
        /*
            r7 = this;
            org.reactivestreams.v<? super V> r0 = r7.B3
            r6 = 2
            ej.n<U> r1 = r7.C3
            r6 = 4
            boolean r2 = r7.g()
            if (r2 == 0) goto L51
            r6 = 0
            java.util.concurrent.atomic.AtomicLong r2 = r7.f303401l3
            r6 = 3
            long r2 = r2.get()
            r4 = 0
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r6 = 4
            if (r4 == 0) goto L3e
            boolean r8 = r7.f(r0, r8)
            if (r8 == 0) goto L34
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L34
            r2 = 1
            r2 = 1
            r7.d(r2)
        L34:
            r8 = -1
            int r8 = r7.a(r8)
            r6 = 6
            if (r8 != 0) goto L5e
            r6 = 4
            goto L5c
        L3e:
            r6 = 1
            r10.dispose()
            io.reactivex.exceptions.c r7 = new io.reactivex.exceptions.c
            r6 = 1
            java.lang.String r8 = "mesC dsr  nquudftieeutor ceestflo foot labku "
            java.lang.String r8 = "Could not emit buffer due to lack of requests"
            r6 = 3
            r7.<init>(r8)
            r0.onError(r7)
            return
        L51:
            r6 = 5
            r1.offer(r8)
            boolean r8 = r7.b()
            r6 = 3
            if (r8 != 0) goto L5e
        L5c:
            r6 = 7
            return
        L5e:
            io.reactivex.internal.util.v.e(r1, r0, r9, r10, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.subscribers.n.h(java.lang.Object, boolean, io.reactivex.disposables.c):void");
    }

    protected final void i(U u10, boolean z10, io.reactivex.disposables.c cVar) {
        org.reactivestreams.v<? super V> vVar = this.B3;
        ej.n<U> nVar = this.C3;
        if (g()) {
            long j10 = this.f303401l3.get();
            if (j10 == 0) {
                this.D3 = true;
                cVar.dispose();
                vVar.onError(new io.reactivex.exceptions.c("Could not emit buffer due to lack of requests"));
                return;
            } else if (nVar.isEmpty()) {
                if (f(vVar, u10) && j10 != Long.MAX_VALUE) {
                    d(1L);
                }
                if (a(-1) == 0) {
                    return;
                }
            } else {
                nVar.offer(u10);
            }
        } else {
            nVar.offer(u10);
            if (!b()) {
                return;
            }
        }
        io.reactivex.internal.util.v.e(nVar, vVar, z10, cVar, this);
    }

    public final void j(long j10) {
        if (io.reactivex.internal.subscriptions.j.p(j10)) {
            io.reactivex.internal.util.d.a(this.f303401l3, j10);
        }
    }

    @Override // io.reactivex.internal.util.u
    public final long requested() {
        return this.f303401l3.get();
    }
}
