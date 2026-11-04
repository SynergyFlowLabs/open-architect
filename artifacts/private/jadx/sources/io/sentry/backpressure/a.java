package io.sentry.backpressure;

import io.sentry.i1;
import io.sentry.l1;
import io.sentry.m1;
import io.sentry.n8;
import io.sentry.y7;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements b, Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f305142f = 10;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f305143g = 500;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f305144h = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f305145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i1 f305146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f305147c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private volatile Future<?> f305148d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f305149e = new io.sentry.util.a();

    public a(@NotNull n8 n8Var, @NotNull i1 i1Var) {
        this.f305145a = n8Var;
        this.f305146b = i1Var;
    }

    private boolean c() {
        return this.f305146b.L();
    }

    private void d(int i10) {
        l1 executorService = this.f305145a.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        m1 m1VarA = this.f305149e.a();
        try {
            try {
                this.f305148d = executorService.b(this, i10);
            } catch (RejectedExecutionException e10) {
                this.f305145a.getLogger().a(y7.WARNING, "Backpressure monitor reschedule task rejected", e10);
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.backpressure.b
    public int a() {
        return this.f305147c;
    }

    void b() {
        if (c()) {
            if (this.f305147c > 0) {
                this.f305145a.getLogger().c(y7.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.f305147c = 0;
        } else {
            int i10 = this.f305147c;
            if (i10 < 10) {
                this.f305147c = i10 + 1;
                this.f305145a.getLogger().c(y7.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.f305147c));
            }
        }
    }

    @Override // io.sentry.backpressure.b
    public void close() {
        Future<?> future = this.f305148d;
        if (future != null) {
            m1 m1VarA = this.f305149e.a();
            try {
                future.cancel(true);
                if (m1VarA != null) {
                    m1VarA.close();
                }
            } catch (Throwable th2) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        b();
        d(10000);
    }

    @Override // io.sentry.backpressure.b
    public void start() {
        d(500);
    }
}
