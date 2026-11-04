package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes14.dex */
public abstract class d<T> implements k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExecutorService f337084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f337085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Future<T> f337086c;

    private class a implements Callable<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ExecutorService f337087a;

        a(ExecutorService executorService) {
            this.f337087a = executorService;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            try {
                T t10 = (T) d.this.g();
                ExecutorService executorService = this.f337087a;
                if (executorService != null) {
                    executorService.shutdown();
                }
                return t10;
            } catch (Throwable th2) {
                ExecutorService executorService2 = this.f337087a;
                if (executorService2 != null) {
                    executorService2.shutdown();
                }
                throw th2;
            }
        }
    }

    protected d() {
        this(null);
    }

    private ExecutorService a() {
        return Executors.newFixedThreadPool(f());
    }

    private Callable<T> b(ExecutorService executorService) {
        return new a(executorService);
    }

    protected final synchronized ExecutorService c() {
        return this.f337085b;
    }

    public final synchronized ExecutorService d() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f337084a;
    }

    public synchronized Future<T> e() {
        Future<T> future;
        future = this.f337086c;
        if (future == null) {
            throw new IllegalStateException("start() must be called first!");
        }
        return future;
    }

    protected int f() {
        return 1;
    }

    protected abstract T g() throws Exception;

    @Override // org.apache.commons.lang3.concurrent.k
    public T get() throws j {
        try {
            return e().get();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw new j(e10);
        } catch (ExecutionException e11) {
            m.g(e11);
            return null;
        }
    }

    public synchronized boolean h() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f337086c != null;
    }

    public final synchronized void i(ExecutorService executorService) {
        try {
            if (h()) {
                throw new IllegalStateException("Cannot set ExecutorService after start()!");
            }
            this.f337084a = executorService;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean j() {
        ExecutorService executorServiceA;
        try {
            if (h()) {
                return false;
            }
            ExecutorService executorServiceD = d();
            this.f337085b = executorServiceD;
            if (executorServiceD == null) {
                executorServiceA = a();
                this.f337085b = executorServiceA;
            } else {
                executorServiceA = null;
            }
            this.f337086c = this.f337085b.submit(b(executorServiceA));
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected d(ExecutorService executorService) {
        i(executorService);
    }
}
