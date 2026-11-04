package io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public final class g<T> extends AtomicReference<w> implements io.reactivex.q<T>, w, io.reactivex.disposables.c, io.reactivex.observers.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f303343h = -7251123623727029452L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final dj.g<? super T> f303344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super Throwable> f303345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.a f303346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.g<? super w> f303347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f303348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f303349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f303350g;

    public g(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar, dj.g<? super w> gVar3, int i10) {
        this.f303344a = gVar;
        this.f303345b = gVar2;
        this.f303346c = aVar;
        this.f303347d = gVar3;
        this.f303348e = i10;
        this.f303350g = i10 - (i10 >> 2);
    }

    @Override // io.reactivex.observers.g
    public boolean a() {
        return this.f303345b != io.reactivex.internal.functions.a.f298695f;
    }

    @Override // org.reactivestreams.w
    public void cancel() {
        io.reactivex.internal.subscriptions.j.b(this);
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        cancel();
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return get() == io.reactivex.internal.subscriptions.j.CANCELLED;
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public void l(w wVar) {
        if (io.reactivex.internal.subscriptions.j.n(this, wVar)) {
            try {
                this.f303347d.accept(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                wVar.cancel();
                onError(th2);
            }
        }
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        w wVar = get();
        io.reactivex.internal.subscriptions.j jVar = io.reactivex.internal.subscriptions.j.CANCELLED;
        if (wVar != jVar) {
            lazySet(jVar);
            try {
                this.f303346c.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
        }
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        w wVar = get();
        io.reactivex.internal.subscriptions.j jVar = io.reactivex.internal.subscriptions.j.CANCELLED;
        if (wVar == jVar) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        lazySet(jVar);
        try {
            this.f303345b.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.exceptions.b.b(th3);
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(th2, th3));
        }
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        if (!k()) {
            try {
                this.f303344a.accept(t10);
                int i10 = this.f303349f + 1;
                if (i10 != this.f303350g) {
                    this.f303349f = i10;
                } else {
                    this.f303349f = 0;
                    get().request(this.f303350g);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                get().cancel();
                onError(th2);
            }
        }
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
        get().request(j10);
    }
}
