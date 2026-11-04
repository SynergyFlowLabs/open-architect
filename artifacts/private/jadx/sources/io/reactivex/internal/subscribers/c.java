package io.reactivex.internal.subscribers;

import java.util.concurrent.CountDownLatch;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c<T> extends CountDownLatch implements io.reactivex.q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    T f303336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Throwable f303337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    w f303338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f303339d;

    public c() {
        super(1);
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.e.b();
                await();
            } catch (InterruptedException e10) {
                w wVar = this.f303338c;
                this.f303338c = io.reactivex.internal.subscriptions.j.CANCELLED;
                if (wVar != null) {
                    wVar.cancel();
                }
                throw io.reactivex.internal.util.k.f(e10);
            }
        }
        Throwable th2 = this.f303337b;
        if (th2 == null) {
            return this.f303336a;
        }
        throw io.reactivex.internal.util.k.f(th2);
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public final void l(w wVar) {
        if (io.reactivex.internal.subscriptions.j.q(this.f303338c, wVar)) {
            this.f303338c = wVar;
            if (this.f303339d) {
                return;
            }
            wVar.request(Long.MAX_VALUE);
            if (this.f303339d) {
                this.f303338c = io.reactivex.internal.subscriptions.j.CANCELLED;
                wVar.cancel();
            }
        }
    }

    @Override // org.reactivestreams.v
    public final void onComplete() {
        countDown();
    }
}
