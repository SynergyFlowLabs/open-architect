package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x3 extends i1 implements Future {
    protected x3() {
    }

    public boolean cancel(boolean z10) {
        return l().cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return l().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return l().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return l().isDone();
    }

    @Override // com.google.android.gms.internal.play_billing.i1
    protected /* bridge */ /* synthetic */ Object k() {
        throw null;
    }

    protected abstract Future l();

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return l().get(j10, timeUnit);
    }
}
