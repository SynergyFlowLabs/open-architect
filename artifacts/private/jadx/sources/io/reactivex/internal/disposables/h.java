package io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f298689a = -754898800686245608L;

    public h() {
    }

    public boolean a(io.reactivex.disposables.c cVar) {
        return d.d(this, cVar);
    }

    public boolean b(io.reactivex.disposables.c cVar) {
        return d.n(this, cVar);
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        d.b(this);
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return d.c(get());
    }

    public h(io.reactivex.disposables.c cVar) {
        lazySet(cVar);
    }
}
