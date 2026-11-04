package io.reactivex.internal.operators.flowable;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class i1<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Future<? extends T> f299518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f299519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f299520d;

    public i1(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.f299518b = future;
        this.f299519c = j10;
        this.f299520d = timeUnit;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        io.reactivex.internal.subscriptions.f fVar = new io.reactivex.internal.subscriptions.f(vVar);
        vVar.l(fVar);
        try {
            TimeUnit timeUnit = this.f299520d;
            T t10 = timeUnit != null ? this.f299518b.get(this.f299519c, timeUnit) : this.f299518b.get();
            if (t10 == null) {
                vVar.onError(new NullPointerException("The future returned null"));
            } else {
                fVar.f(t10);
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            if (fVar.g()) {
                return;
            }
            vVar.onError(th2);
        }
    }
}
