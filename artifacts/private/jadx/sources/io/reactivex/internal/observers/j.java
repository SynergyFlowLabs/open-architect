package io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f, io.reactivex.disposables.c, dj.g<Throwable>, io.reactivex.observers.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f298757c = -4361286194466301354L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final dj.g<? super Throwable> f298758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.a f298759b;

    public j(dj.a aVar) {
        this.f298758a = this;
        this.f298759b = aVar;
    }

    @Override // io.reactivex.observers.g
    public boolean a() {
        return this.f298758a != this;
    }

    @Override // dj.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th2) {
        io.reactivex.plugins.a.Y(new io.reactivex.exceptions.d(th2));
    }

    @Override // io.reactivex.f
    public void d(io.reactivex.disposables.c cVar) {
        io.reactivex.internal.disposables.d.o(this, cVar);
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        io.reactivex.internal.disposables.d.b(this);
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return get() == io.reactivex.internal.disposables.d.DISPOSED;
    }

    @Override // io.reactivex.f
    public void onComplete() {
        try {
            this.f298759b.run();
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
        lazySet(io.reactivex.internal.disposables.d.DISPOSED);
    }

    @Override // io.reactivex.f
    public void onError(Throwable th2) {
        try {
            this.f298758a.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.exceptions.b.b(th3);
            io.reactivex.plugins.a.Y(th3);
        }
        lazySet(io.reactivex.internal.disposables.d.DISPOSED);
    }

    public j(dj.g<? super Throwable> gVar, dj.a aVar) {
        this.f298758a = gVar;
        this.f298759b = aVar;
    }
}
