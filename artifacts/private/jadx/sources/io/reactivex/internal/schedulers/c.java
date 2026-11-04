package io.reactivex.internal.schedulers;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes11.dex */
final class c implements Future<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.disposables.c f303195a;

    c(io.reactivex.disposables.c cVar) {
        this.f303195a = cVar;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        this.f303195a.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return null;
    }
}
