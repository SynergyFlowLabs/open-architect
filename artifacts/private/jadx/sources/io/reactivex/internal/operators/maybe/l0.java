package io.reactivex.internal.operators.maybe;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class l0<T> extends io.reactivex.s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Future<? extends T> f300879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f300880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f300881c;

    public l0(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.f300879a = future;
        this.f300880b = j10;
        this.f300881c = timeUnit;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        io.reactivex.disposables.c cVarB = io.reactivex.disposables.d.b();
        vVar.d(cVarB);
        if (cVarB.k()) {
            return;
        }
        try {
            long j10 = this.f300880b;
            T t10 = j10 <= 0 ? this.f300879a.get() : this.f300879a.get(j10, this.f300881c);
            if (cVarB.k()) {
                return;
            }
            if (t10 == null) {
                vVar.onComplete();
            } else {
                vVar.b(t10);
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof ExecutionException) {
                th = th.getCause();
            }
            io.reactivex.exceptions.b.b(th);
            if (cVarB.k()) {
                return;
            }
            vVar.onError(th);
        }
    }
}
