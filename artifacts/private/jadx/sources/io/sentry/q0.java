package io.sentry;

import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class q0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private static volatile q0 f306559i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f306561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private volatile String f306562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f306563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f306564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Callable<InetAddress> f306565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ExecutorService f306566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f306557g = TimeUnit.HOURS.toMillis(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f306558h = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f306560j = new io.sentry.util.a();

    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f306567a;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryHostnameCache-");
            int i10 = this.f306567a;
            this.f306567a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private q0() {
        this(f306557g);
    }

    public static /* synthetic */ Void b(q0 q0Var) {
        q0Var.getClass();
        try {
            q0Var.f306562b = q0Var.f306565e.call().getCanonicalHostName();
            q0Var.f306563c = System.currentTimeMillis() + q0Var.f306561a;
            q0Var.f306564d.set(false);
            return null;
        } catch (Throwable th2) {
            q0Var.f306564d.set(false);
            throw th2;
        }
    }

    @NotNull
    public static q0 e() {
        if (f306559i == null) {
            m1 m1VarA = f306560j.a();
            try {
                if (f306559i == null) {
                    f306559i = new q0();
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
        return f306559i;
    }

    private void f() {
        this.f306563c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
    }

    private void h() {
        try {
            this.f306566f.submit(new Callable() { // from class: io.sentry.p0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return q0.b(this.f306004a);
                }
            }).get(f306558h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            f();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            f();
        }
    }

    void c() {
        this.f306566f.shutdown();
    }

    @Nullable
    public String d() {
        if (this.f306563c < System.currentTimeMillis() && this.f306564d.compareAndSet(false, true)) {
            h();
        }
        return this.f306562b;
    }

    boolean g() {
        return this.f306566f.isShutdown();
    }

    q0(long j10) {
        this(j10, new Callable() { // from class: io.sentry.o0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InetAddress.getLocalHost();
            }
        });
    }

    q0(long j10, @NotNull Callable<InetAddress> callable) {
        this.f306564d = new AtomicBoolean(false);
        this.f306566f = Executors.newSingleThreadExecutor(new b());
        this.f306561a = j10;
        this.f306565e = (Callable) io.sentry.util.y.c(callable, "getLocalhost is required");
        h();
    }
}
