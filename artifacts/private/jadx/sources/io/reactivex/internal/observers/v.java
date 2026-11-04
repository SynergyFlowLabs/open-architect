package io.reactivex.internal.observers;

import io.reactivex.i0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class v<T, U, V> extends x implements i0<T>, io.reactivex.internal.util.r<U, V> {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    protected final i0<? super V> f298800l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    protected final ej.n<U> f298801m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    protected volatile boolean f298802n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    protected volatile boolean f298803o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    protected Throwable f298804p3;

    public v(i0<? super V> i0Var, ej.n<U> nVar) {
        this.f298800l3 = i0Var;
        this.f298801m3 = nVar;
    }

    @Override // io.reactivex.internal.util.r
    public final int a(int i10) {
        return this.f298831s.addAndGet(i10);
    }

    @Override // io.reactivex.internal.util.r
    public final boolean b() {
        return this.f298831s.getAndIncrement() == 0;
    }

    @Override // io.reactivex.internal.util.r
    public final boolean c() {
        return this.f298803o3;
    }

    @Override // io.reactivex.internal.util.r
    public final boolean e() {
        return this.f298802n3;
    }

    @Override // io.reactivex.internal.util.r
    public final Throwable error() {
        return this.f298804p3;
    }

    @Override // io.reactivex.internal.util.r
    public void f(i0<? super V> i0Var, U u10) {
    }

    public final boolean g() {
        return this.f298831s.get() == 0 && this.f298831s.compareAndSet(0, 1);
    }

    protected final void h(U u10, boolean z10, io.reactivex.disposables.c cVar) {
        i0<? super V> i0Var = this.f298800l3;
        ej.n<U> nVar = this.f298801m3;
        if (this.f298831s.get() == 0 && this.f298831s.compareAndSet(0, 1)) {
            f(i0Var, u10);
            if (a(-1) == 0) {
                return;
            }
        } else {
            nVar.offer(u10);
            if (!b()) {
                return;
            }
        }
        io.reactivex.internal.util.v.d(nVar, i0Var, z10, cVar, this);
    }

    protected final void i(U u10, boolean z10, io.reactivex.disposables.c cVar) {
        i0<? super V> i0Var = this.f298800l3;
        ej.n<U> nVar = this.f298801m3;
        if (this.f298831s.get() != 0 || !this.f298831s.compareAndSet(0, 1)) {
            nVar.offer(u10);
            if (!b()) {
                return;
            }
        } else if (nVar.isEmpty()) {
            f(i0Var, u10);
            if (a(-1) == 0) {
                return;
            }
        } else {
            nVar.offer(u10);
        }
        io.reactivex.internal.util.v.d(nVar, i0Var, z10, cVar, this);
    }
}
