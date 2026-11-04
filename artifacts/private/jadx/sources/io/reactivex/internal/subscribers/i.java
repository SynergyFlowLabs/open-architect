package io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public final class i<T> extends AtomicReference<w> implements io.reactivex.q<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f303354e = -4403180040475402120L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final dj.r<? super T> f303355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super Throwable> f303356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.a f303357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f303358d;

    public i(dj.r<? super T> rVar, dj.g<? super Throwable> gVar, dj.a aVar) {
        this.f303355a = rVar;
        this.f303356b = gVar;
        this.f303357c = aVar;
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        io.reactivex.internal.subscriptions.j.b(this);
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return get() == io.reactivex.internal.subscriptions.j.CANCELLED;
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public void l(w wVar) {
        io.reactivex.internal.subscriptions.j.o(this, wVar, Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        if (this.f303358d) {
            return;
        }
        this.f303358d = true;
        try {
            this.f303357c.run();
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        if (this.f303358d) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f303358d = true;
        try {
            this.f303356b.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.exceptions.b.b(th3);
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(th2, th3));
        }
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        if (!this.f303358d) {
            try {
                if (!this.f303355a.test(t10)) {
                    dispose();
                    onComplete();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                dispose();
                onError(th2);
            }
        }
    }
}
