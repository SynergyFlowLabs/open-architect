package io.reactivex.internal.operators.observable;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class e1<T> extends io.reactivex.b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Future<? extends T> f301501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f301502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f301503c;

    public e1(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.f301501a = future;
        this.f301502b = j10;
        this.f301503c = timeUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        io.reactivex.internal.observers.l lVar = new io.reactivex.internal.observers.l(i0Var);
        i0Var.d(lVar);
        if (lVar.k()) {
            return;
        }
        try {
            TimeUnit timeUnit = this.f301503c;
            lVar.c(io.reactivex.internal.functions.b.g(timeUnit != null ? this.f301501a.get(this.f301502b, timeUnit) : this.f301501a.get(), "Future returned null"));
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            if (lVar.k()) {
                return;
            }
            i0Var.onError(th2);
        }
    }
}
