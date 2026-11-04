package io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public final class v<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.q<T>, io.reactivex.disposables.c, w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f303431c = -8612022020200669122L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.reactivestreams.v<? super T> f303432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<w> f303433b = new AtomicReference<>();

    public v(org.reactivestreams.v<? super T> vVar) {
        this.f303432a = vVar;
    }

    public void a(io.reactivex.disposables.c cVar) {
        io.reactivex.internal.disposables.d.n(this, cVar);
    }

    @Override // org.reactivestreams.w
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        io.reactivex.internal.subscriptions.j.b(this.f303433b);
        io.reactivex.internal.disposables.d.b(this);
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return this.f303433b.get() == io.reactivex.internal.subscriptions.j.CANCELLED;
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public void l(w wVar) {
        if (io.reactivex.internal.subscriptions.j.n(this.f303433b, wVar)) {
            this.f303432a.l(this);
        }
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        io.reactivex.internal.disposables.d.b(this);
        this.f303432a.onComplete();
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        io.reactivex.internal.disposables.d.b(this);
        this.f303432a.onError(th2);
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        this.f303432a.onNext(t10);
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
        if (io.reactivex.internal.subscriptions.j.p(j10)) {
            this.f303433b.get().request(j10);
        }
    }
}
