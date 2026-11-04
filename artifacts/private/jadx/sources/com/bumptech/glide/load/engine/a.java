package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f96369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f96370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l1
    final Map<com.bumptech.glide.load.g, d> f96371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<p<?>> f96372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p.a f96373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f96374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private volatile c f96375g;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0853a implements ThreadFactory {

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        class RunnableC0854a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f96376a;

            RunnableC0854a(Runnable runnable) {
                this.f96376a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f96376a.run();
            }
        }

        ThreadFactoryC0853a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new RunnableC0854a(runnable), "glide-active-resources");
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    @l1
    interface c {
        void a();
    }

    @l1
    static final class d extends WeakReference<p<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.load.g f96379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f96380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        v<?> f96381c;

        d(@NonNull com.bumptech.glide.load.g gVar, @NonNull p<?> pVar, @NonNull ReferenceQueue<? super p<?>> referenceQueue, boolean z10) {
            super(pVar, referenceQueue);
            this.f96379a = (com.bumptech.glide.load.g) com.bumptech.glide.util.k.d(gVar);
            this.f96381c = (pVar.e() && z10) ? (v) com.bumptech.glide.util.k.d(pVar.d()) : null;
            this.f96380b = pVar.e();
        }

        void a() {
            this.f96381c = null;
            clear();
        }
    }

    a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC0853a()));
    }

    synchronized void a(com.bumptech.glide.load.g gVar, p<?> pVar) {
        try {
            d dVarPut = this.f96371c.put(gVar, new d(gVar, pVar, this.f96372d, this.f96369a));
            if (dVarPut != null) {
                dVarPut.a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    void b() {
        while (!this.f96374f) {
            try {
                c((d) this.f96372d.remove());
                c cVar = this.f96375g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(@NonNull d dVar) {
        v<?> vVar;
        synchronized (this) {
            try {
                this.f96371c.remove(dVar.f96379a);
                if (dVar.f96380b && (vVar = dVar.f96381c) != null) {
                    this.f96373e.c(dVar.f96379a, new p<>(vVar, true, false, dVar.f96379a, this.f96373e));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    synchronized void d(com.bumptech.glide.load.g gVar) {
        try {
            d dVarRemove = this.f96371c.remove(gVar);
            if (dVarRemove != null) {
                dVarRemove.a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @p0
    synchronized p<?> e(com.bumptech.glide.load.g gVar) {
        try {
            d dVar = this.f96371c.get(gVar);
            if (dVar == null) {
                return null;
            }
            p<?> pVar = dVar.get();
            if (pVar == null) {
                c(dVar);
            }
            return pVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l1
    void f(c cVar) {
        this.f96375g = cVar;
    }

    void g(p.a aVar) {
        synchronized (aVar) {
            try {
                synchronized (this) {
                    this.f96373e = aVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @l1
    void h() {
        this.f96374f = true;
        Executor executor = this.f96370b;
        if (executor instanceof ExecutorService) {
            com.bumptech.glide.util.e.c((ExecutorService) executor);
        }
    }

    @l1
    a(boolean z10, Executor executor) {
        this.f96371c = new HashMap();
        this.f96372d = new ReferenceQueue<>();
        this.f96369a = z10;
        this.f96370b = executor;
        executor.execute(new b());
    }
}
