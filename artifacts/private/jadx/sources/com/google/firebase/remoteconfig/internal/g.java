package com.google.firebase.remoteconfig.internal;

import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@androidx.annotation.d
public class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final long f124521d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b0("ConfigCacheClient.class")
    private static final Map<String, g> f124522e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Executor f124523f = new androidx.media3.exoplayer.offline.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f124524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f124525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b0("this")
    @p0
    private Task<h> f124526c = null;

    private static class b<TResult> implements com.google.android.gms.tasks.g<TResult>, com.google.android.gms.tasks.f, com.google.android.gms.tasks.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CountDownLatch f124527a;

        private b() {
            this.f124527a = new CountDownLatch(1);
        }

        @Override // com.google.android.gms.tasks.e
        public void a() {
            this.f124527a.countDown();
        }

        @Override // com.google.android.gms.tasks.g
        public void b(TResult tresult) {
            this.f124527a.countDown();
        }

        public void c() throws InterruptedException {
            this.f124527a.await();
        }

        @Override // com.google.android.gms.tasks.f
        public void d(@NonNull Exception exc) {
            this.f124527a.countDown();
        }

        public boolean e(long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f124527a.await(j10, timeUnit);
        }
    }

    private g(Executor executor, v vVar) {
        this.f124524a = executor;
        this.f124525b = vVar;
    }

    public static /* synthetic */ Task a(g gVar, boolean z10, h hVar, Void r10) {
        if (z10) {
            gVar.m(hVar);
        } else {
            gVar.getClass();
        }
        return com.google.android.gms.tasks.n.g(hVar);
    }

    private static <TResult> TResult c(Task<TResult> task, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        b bVar = new b();
        Executor executor = f124523f;
        task.k(executor, bVar);
        task.h(executor, bVar);
        task.c(executor, bVar);
        if (!bVar.e(j10, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.u()) {
            return task.q();
        }
        throw new ExecutionException(task.p());
    }

    @l1
    public static synchronized void e() {
        f124522e.clear();
    }

    public static synchronized g j(Executor executor, v vVar) {
        String strC;
        Map<String, g> map;
        try {
            strC = vVar.c();
            map = f124522e;
            if (!map.containsKey(strC)) {
                map.put(strC, new g(executor, vVar));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map.get(strC);
    }

    private synchronized void m(h hVar) {
        try {
            this.f124526c = com.google.android.gms.tasks.n.g(hVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void d() {
        synchronized (this) {
            this.f124526c = com.google.android.gms.tasks.n.g(null);
        }
        this.f124525b.a();
    }

    public synchronized Task<h> f() {
        try {
            Task<h> task = this.f124526c;
            if (task == null || (task.t() && !this.f124526c.u())) {
                Executor executor = this.f124524a;
                final v vVar = this.f124525b;
                Objects.requireNonNull(vVar);
                this.f124526c = com.google.android.gms.tasks.n.d(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return vVar.e();
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f124526c;
    }

    @p0
    public h g() {
        return h(5L);
    }

    @l1
    @p0
    h h(long j10) {
        synchronized (this) {
            try {
                Task<h> task = this.f124526c;
                if (task == null || !task.u()) {
                    try {
                        return (h) c(f(), j10, TimeUnit.SECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                        return null;
                    }
                }
                return this.f124526c.q();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @l1
    @p0
    synchronized Task<h> i() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f124526c;
    }

    public Task<h> k(h hVar) {
        return l(hVar, true);
    }

    public Task<h> l(final h hVar, final boolean z10) {
        return com.google.android.gms.tasks.n.d(this.f124524a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f124515a.f124525b.f(hVar);
            }
        }).w(this.f124524a, new com.google.android.gms.tasks.k() { // from class: com.google.firebase.remoteconfig.internal.e
            @Override // com.google.android.gms.tasks.k
            public final Task a(Object obj) {
                return g.a(this.f124517a, z10, hVar, (Void) obj);
            }
        });
    }
}
