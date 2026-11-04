package io.reactivex.internal.observers;

import io.reactivex.i0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class u<T> extends AtomicReference<io.reactivex.disposables.c> implements i0<T>, io.reactivex.disposables.c, io.reactivex.observers.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f298795e = -7251123623727029452L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final dj.g<? super T> f298796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super Throwable> f298797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.a f298798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.g<? super io.reactivex.disposables.c> f298799d;

    public u(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar, dj.g<? super io.reactivex.disposables.c> gVar3) {
        this.f298796a = gVar;
        this.f298797b = gVar2;
        this.f298798c = aVar;
        this.f298799d = gVar3;
    }

    @Override // io.reactivex.observers.g
    public boolean a() {
        return this.f298797b != io.reactivex.internal.functions.a.f298695f;
    }

    @Override // io.reactivex.i0
    public void d(io.reactivex.disposables.c cVar) {
        if (io.reactivex.internal.disposables.d.o(this, cVar)) {
            try {
                this.f298799d.accept(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                cVar.dispose();
                onError(th2);
            }
        }
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        io.reactivex.internal.disposables.d.b(this);
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return get() == io.reactivex.internal.disposables.d.DISPOSED;
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        if (!k()) {
            lazySet(io.reactivex.internal.disposables.d.DISPOSED);
            try {
                this.f298798c.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
        }
    }

    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        if (k()) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        lazySet(io.reactivex.internal.disposables.d.DISPOSED);
        try {
            this.f298797b.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.exceptions.b.b(th3);
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(th2, th3));
        }
    }

    @Override // io.reactivex.i0
    public void onNext(T t10) {
        if (k()) {
            return;
        }
        try {
            this.f298796a.accept(t10);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            get().dispose();
            onError(th2);
        }
    }
}
