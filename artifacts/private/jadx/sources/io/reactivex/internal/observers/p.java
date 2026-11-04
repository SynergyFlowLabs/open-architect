package io.reactivex.internal.observers;

import io.reactivex.i0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class p<T> extends AtomicReference<io.reactivex.disposables.c> implements i0<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f298778e = -4403180040475402120L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final dj.r<? super T> f298779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super Throwable> f298780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.a f298781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f298782d;

    public p(dj.r<? super T> rVar, dj.g<? super Throwable> gVar, dj.a aVar) {
        this.f298779a = rVar;
        this.f298780b = gVar;
        this.f298781c = aVar;
    }

    @Override // io.reactivex.i0
    public void d(io.reactivex.disposables.c cVar) {
        io.reactivex.internal.disposables.d.o(this, cVar);
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        io.reactivex.internal.disposables.d.b(this);
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return io.reactivex.internal.disposables.d.c(get());
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        if (this.f298782d) {
            return;
        }
        this.f298782d = true;
        try {
            this.f298781c.run();
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }

    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        if (this.f298782d) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f298782d = true;
        try {
            this.f298780b.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.exceptions.b.b(th3);
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(th2, th3));
        }
    }

    @Override // io.reactivex.i0
    public void onNext(T t10) {
        if (this.f298782d) {
            return;
        }
        try {
            if (this.f298779a.test(t10)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            dispose();
            onError(th2);
        }
    }
}
