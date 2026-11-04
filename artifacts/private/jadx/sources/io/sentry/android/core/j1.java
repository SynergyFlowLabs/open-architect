package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.ILogger;
import io.sentry.y7;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class j1 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f304358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.y0 f304359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ILogger f304360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f304361d;

    private static final class a implements io.sentry.hints.e, io.sentry.hints.k, io.sentry.hints.p, io.sentry.hints.i, io.sentry.hints.b, io.sentry.hints.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f304362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f304363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private CountDownLatch f304364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f304365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final ILogger f304366e;

        public a(long j10, @NotNull ILogger iLogger) {
            reset();
            this.f304365d = j10;
            this.f304366e = (ILogger) io.sentry.util.y.c(iLogger, "ILogger is required.");
        }

        @Override // io.sentry.hints.p
        public boolean b() {
            return this.f304363b;
        }

        @Override // io.sentry.hints.k
        public boolean c() {
            return this.f304362a;
        }

        @Override // io.sentry.hints.p
        public void d(boolean z10) {
            this.f304363b = z10;
            this.f304364c.countDown();
        }

        @Override // io.sentry.hints.k
        public void e(boolean z10) {
            this.f304362a = z10;
        }

        @Override // io.sentry.hints.i
        public boolean h() {
            try {
                return this.f304364c.await(this.f304365d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                this.f304366e.a(y7.ERROR, "Exception while awaiting on lock.", e10);
                return false;
            }
        }

        @Override // io.sentry.hints.j
        public void reset() {
            this.f304364c = new CountDownLatch(1);
            this.f304362a = false;
            this.f304363b = false;
        }
    }

    j1(String str, io.sentry.y0 y0Var, @NotNull ILogger iLogger, long j10) {
        super(str);
        this.f304358a = str;
        this.f304359b = (io.sentry.y0) io.sentry.util.y.c(y0Var, "Envelope sender is required.");
        this.f304360c = (ILogger) io.sentry.util.y.c(iLogger, "Logger is required.");
        this.f304361d = j10;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i10, @Nullable String str) {
        if (str == null || i10 != 8) {
            return;
        }
        this.f304360c.c(y7.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i10), this.f304358a, str);
        io.sentry.n0 n0VarE = io.sentry.util.n.e(new a(this.f304361d, this.f304360c));
        this.f304359b.a(this.f304358a + File.separator + str, n0VarE);
    }
}
