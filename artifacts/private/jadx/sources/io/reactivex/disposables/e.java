package io.reactivex.disposables;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
final class e extends AtomicReference<Future<?>> implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f298661b = 6545242830671168775L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f298662a;

    e(Future<?> future, boolean z10) {
        super(future);
        this.f298662a = z10;
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        Future<?> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.cancel(this.f298662a);
        }
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        Future<?> future = get();
        return future == null || future.isDone();
    }
}
