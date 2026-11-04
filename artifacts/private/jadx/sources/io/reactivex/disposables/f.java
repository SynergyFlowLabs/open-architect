package io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
abstract class f<T> extends AtomicReference<T> implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f298663a = 6537757548749041217L;

    f(T t10) {
        super(io.reactivex.internal.functions.b.g(t10, "value is null"));
    }

    protected abstract void a(@cj.f T t10);

    @Override // io.reactivex.disposables.c
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // io.reactivex.disposables.c
    public final boolean k() {
        return get() == null;
    }
}
