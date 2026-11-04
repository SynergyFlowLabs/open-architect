package io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public class u<T> extends AtomicInteger implements io.reactivex.q<T>, w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f303424g = -4945028590049415624L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.reactivestreams.v<? super T> f303425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.internal.util.c f303426b = new io.reactivex.internal.util.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicLong f303427c = new AtomicLong();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReference<w> f303428d = new AtomicReference<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicBoolean f303429e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f303430f;

    public u(org.reactivestreams.v<? super T> vVar) {
        this.f303425a = vVar;
    }

    @Override // org.reactivestreams.w
    public void cancel() {
        if (this.f303430f) {
            return;
        }
        io.reactivex.internal.subscriptions.j.b(this.f303428d);
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public void l(w wVar) {
        if (this.f303429e.compareAndSet(false, true)) {
            this.f303425a.l(this);
            io.reactivex.internal.subscriptions.j.d(this.f303428d, this.f303427c, wVar);
        } else {
            wVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        this.f303430f = true;
        io.reactivex.internal.util.l.b(this.f303425a, this, this.f303426b);
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        this.f303430f = true;
        io.reactivex.internal.util.l.d(this.f303425a, th2, this, this.f303426b);
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        io.reactivex.internal.util.l.f(this.f303425a, t10, this, this.f303426b);
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
        if (j10 > 0) {
            io.reactivex.internal.subscriptions.j.c(this.f303428d, this.f303427c, j10);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j10));
    }
}
