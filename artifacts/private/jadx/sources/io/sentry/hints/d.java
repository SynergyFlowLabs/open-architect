package io.sentry.hints;

import io.sentry.ILogger;
import io.sentry.y7;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public abstract class d implements f, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f305542a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f305543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ILogger f305544c;

    public d(long j10, @NotNull ILogger iLogger) {
        this.f305543b = j10;
        this.f305544c = iLogger;
    }

    @Override // io.sentry.hints.f
    public void a() {
        this.f305542a.countDown();
    }

    @Override // io.sentry.hints.i
    public boolean h() {
        try {
            return this.f305542a.await(this.f305543b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f305544c.a(y7.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e10);
            return false;
        }
    }
}
