package io.sentry;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
abstract class y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f307125e = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i1 f307126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ILogger f307127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f307128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue<String> f307129d;

    private static final class a implements io.sentry.hints.e, io.sentry.hints.k, io.sentry.hints.p, io.sentry.hints.i, io.sentry.hints.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f307130a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f307131b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CountDownLatch f307132c = new CountDownLatch(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f307133d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final ILogger f307134e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final String f307135f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final Queue<String> f307136g;

        public a(long j10, @NotNull ILogger iLogger, @NotNull String str, @NotNull Queue<String> queue) {
            this.f307133d = j10;
            this.f307135f = str;
            this.f307136g = queue;
            this.f307134e = iLogger;
        }

        @Override // io.sentry.hints.g
        public void a() {
            this.f307136g.add(this.f307135f);
        }

        @Override // io.sentry.hints.p
        public boolean b() {
            return this.f307131b;
        }

        @Override // io.sentry.hints.k
        public boolean c() {
            return this.f307130a;
        }

        @Override // io.sentry.hints.p
        public void d(boolean z10) {
            this.f307131b = z10;
            this.f307132c.countDown();
        }

        @Override // io.sentry.hints.k
        public void e(boolean z10) {
            this.f307130a = z10;
        }

        @Override // io.sentry.hints.i
        public boolean h() {
            try {
                return this.f307132c.await(this.f307133d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                this.f307134e.a(y7.ERROR, "Exception while awaiting on lock.", e10);
                return false;
            }
        }
    }

    y(@NotNull i1 i1Var, @NotNull ILogger iLogger, long j10, int i10) {
        this.f307126a = i1Var;
        this.f307127b = iLogger;
        this.f307128c = j10;
        this.f307129d = ba.k(new j(i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean c(String str);

    public void d(@NotNull File file) {
        try {
            ILogger iLogger = this.f307127b;
            y7 y7Var = y7.DEBUG;
            iLogger.c(y7Var, "Processing dir. %s", file.getAbsolutePath());
            if (!file.exists()) {
                this.f307127b.c(y7.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file.getAbsolutePath());
                return;
            }
            if (!file.isDirectory()) {
                this.f307127b.c(y7.ERROR, "Cache dir %s is not a directory.", file.getAbsolutePath());
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                this.f307127b.c(y7.ERROR, "Cache dir %s is null.", file.getAbsolutePath());
                return;
            }
            File[] fileArrListFiles2 = file.listFiles(new FilenameFilter() { // from class: io.sentry.x
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    return this.f307119a.c(str);
                }
            });
            this.f307127b.c(y7Var, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles2 != null ? fileArrListFiles2.length : 0), file.getAbsolutePath());
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    String absolutePath = file2.getAbsolutePath();
                    if (this.f307129d.contains(absolutePath)) {
                        this.f307127b.c(y7.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                    } else {
                        io.sentry.transport.a0 a0VarI0 = this.f307126a.i0();
                        if (a0VarI0 != null && a0VarI0.j(o.All)) {
                            this.f307127b.c(y7.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                            return;
                        } else {
                            this.f307127b.c(y7.DEBUG, "Processing file: %s", absolutePath);
                            e(file2, io.sentry.util.n.e(new a(this.f307128c, this.f307127b, absolutePath, this.f307129d)));
                            Thread.sleep(f307125e);
                        }
                    }
                } else {
                    this.f307127b.c(y7.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                }
            }
        } catch (Throwable th2) {
            this.f307127b.b(y7.ERROR, th2, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    protected abstract void e(@NotNull File file, @NotNull n0 n0Var);
}
