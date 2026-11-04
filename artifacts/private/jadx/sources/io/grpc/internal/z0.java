package io.grpc.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public class z0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f290148g = Logger.getLogger(z0.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f290149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.common.base.q0 f290150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @gj.a("this")
    private Map<u.a, Executor> f290151c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @gj.a("this")
    private boolean f290152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @gj.a("this")
    private Throwable f290153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @gj.a("this")
    private long f290154f;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u.a f290155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f290156b;

        a(u.a aVar, long j10) {
            this.f290155a = aVar;
            this.f290156b = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f290155a.a(this.f290156b);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u.a f290157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f290158b;

        b(u.a aVar, Throwable th2) {
            this.f290157a = aVar;
            this.f290158b = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f290157a.onFailure(this.f290158b);
        }
    }

    public z0(long j10, com.google.common.base.q0 q0Var) {
        this.f290149a = j10;
        this.f290150b = q0Var;
    }

    private static Runnable b(u.a aVar, long j10) {
        return new a(aVar, j10);
    }

    private static Runnable c(u.a aVar, Throwable th2) {
        return new b(aVar, th2);
    }

    private static void e(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th2) {
            f290148g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
        }
    }

    public static void g(u.a aVar, Executor executor, Throwable th2) {
        e(executor, c(aVar, th2));
    }

    public void a(u.a aVar, Executor executor) {
        synchronized (this) {
            try {
                if (!this.f290152d) {
                    this.f290151c.put(aVar, executor);
                } else {
                    Throwable th2 = this.f290153e;
                    e(executor, th2 != null ? c(aVar, th2) : b(aVar, this.f290154f));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean d() {
        synchronized (this) {
            try {
                if (this.f290152d) {
                    return false;
                }
                this.f290152d = true;
                long jG = this.f290150b.g(TimeUnit.NANOSECONDS);
                this.f290154f = jG;
                Map<u.a, Executor> map = this.f290151c;
                this.f290151c = null;
                for (Map.Entry<u.a, Executor> entry : map.entrySet()) {
                    e(entry.getValue(), b(entry.getKey(), jG));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(Throwable th2) {
        synchronized (this) {
            try {
                if (this.f290152d) {
                    return;
                }
                this.f290152d = true;
                this.f290153e = th2;
                Map<u.a, Executor> map = this.f290151c;
                this.f290151c = null;
                for (Map.Entry<u.a, Executor> entry : map.entrySet()) {
                    g(entry.getKey(), entry.getValue(), th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public long h() {
        return this.f290149a;
    }
}
