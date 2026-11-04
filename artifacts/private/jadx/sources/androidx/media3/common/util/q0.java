package androidx.media3.common.util;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class q0<R, E extends Exception> implements RunnableFuture<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f61612a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f61613b = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f61614c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private Exception f61615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private R f61616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private Thread f61617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f61618g;

    protected q0() {
    }

    @a1
    private R e() throws ExecutionException {
        if (this.f61618g) {
            throw new CancellationException();
        }
        if (this.f61615d == null) {
            return this.f61616e;
        }
        throw new ExecutionException(this.f61615d);
    }

    public final void a() {
        this.f61613b.c();
    }

    public final void b() {
        this.f61612a.c();
    }

    protected void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this.f61614c) {
            try {
                if (!this.f61618g && !this.f61613b.e()) {
                    this.f61618g = true;
                    c();
                    Thread thread = this.f61617f;
                    if (thread == null) {
                        this.f61612a.f();
                        this.f61613b.f();
                    } else if (z10) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @a1
    protected abstract R d() throws Exception;

    @Override // java.util.concurrent.Future
    @a1
    public final R get() throws ExecutionException, InterruptedException {
        this.f61613b.a();
        return e();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f61618g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f61613b.e();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f61614c) {
            try {
                if (this.f61618g) {
                    return;
                }
                this.f61617f = Thread.currentThread();
                this.f61612a.f();
                try {
                    try {
                        this.f61616e = d();
                        synchronized (this.f61614c) {
                            try {
                                this.f61613b.f();
                                this.f61617f = null;
                                Thread.interrupted();
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (Exception e10) {
                        this.f61615d = e10;
                        synchronized (this.f61614c) {
                            try {
                                this.f61613b.f();
                                this.f61617f = null;
                                Thread.interrupted();
                            } finally {
                            }
                        }
                    }
                } catch (Throwable th3) {
                    synchronized (this.f61614c) {
                        try {
                            this.f61613b.f();
                            this.f61617f = null;
                            Thread.interrupted();
                            throw th3;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // java.util.concurrent.Future
    @a1
    public final R get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f61613b.b(TimeUnit.MILLISECONDS.convert(j10, timeUnit))) {
            return e();
        }
        throw new TimeoutException();
    }
}
