package io.reactivex.internal.subscribers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public final class f<T> extends AtomicReference<w> implements io.reactivex.q<T>, w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f303340b = -4875965440900746268L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f303341c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Queue<Object> f303342a;

    public f(Queue<Object> queue) {
        this.f303342a = queue;
    }

    public boolean a() {
        return get() == io.reactivex.internal.subscriptions.j.CANCELLED;
    }

    @Override // org.reactivestreams.w
    public void cancel() {
        if (io.reactivex.internal.subscriptions.j.b(this)) {
            this.f303342a.offer(f303341c);
        }
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public void l(w wVar) {
        if (io.reactivex.internal.subscriptions.j.n(this, wVar)) {
            this.f303342a.offer(io.reactivex.internal.util.q.z(this));
        }
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        this.f303342a.offer(io.reactivex.internal.util.q.k());
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        this.f303342a.offer(io.reactivex.internal.util.q.n(th2));
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        this.f303342a.offer(io.reactivex.internal.util.q.x(t10));
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
        get().request(j10);
    }
}
