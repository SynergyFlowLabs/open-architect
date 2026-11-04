package io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends AtomicReference<dj.f> implements io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f298681a = 5718521705281392066L;

    public b(dj.f fVar) {
        super(fVar);
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        dj.f andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            try {
                andSet.cancel();
            } catch (Exception e10) {
                io.reactivex.exceptions.b.b(e10);
                io.reactivex.plugins.a.Y(e10);
            }
        }
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return get() == null;
    }
}
