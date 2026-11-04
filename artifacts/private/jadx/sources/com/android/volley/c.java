package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class c extends t {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f89385w = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private final com.android.volley.a f89386m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.android.volley.b f89387n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ExecutorService f89388o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ScheduledExecutorService f89389p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ExecutorService f89390q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private h f89391r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c0 f89392s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List<s<?>> f89393t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile boolean f89394u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Object f89395v;

    class a implements Runnable {

        /* JADX INFO: renamed from: com.android.volley.c$a$a, reason: collision with other inner class name */
        class C0831a implements com.android.volley.a.b {
            C0831a() {
            }

            @Override // com.android.volley.a.b
            public void a() {
                c.this.B();
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f89386m.c(new C0831a());
        }
    }

    class b implements Runnable {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.B();
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.h().initialize();
            c.this.f89388o.execute(new a());
        }
    }

    /* JADX INFO: renamed from: com.android.volley.c$c, reason: collision with other inner class name */
    class C0832c implements Comparator<Runnable> {
        C0832c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Runnable runnable, Runnable runnable2) {
            if (!(runnable instanceof u)) {
                return runnable2 instanceof u ? -1 : 0;
            }
            if (runnable2 instanceof u) {
                return ((u) runnable).a((u) runnable2);
            }
            return 1;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.android.volley.b f89401b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private com.android.volley.a f89400a = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private com.android.volley.f f89402c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private h f89403d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private w f89404e = null;

        class a extends h {

            /* JADX INFO: renamed from: com.android.volley.c$d$a$a, reason: collision with other inner class name */
            class ThreadFactoryC0833a implements ThreadFactory {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f89406a;

                ThreadFactoryC0833a(String str) {
                    this.f89406a = str;
                }

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(@NonNull Runnable runnable) {
                    Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                    threadNewThread.setName("Volley-" + this.f89406a);
                    return threadNewThread;
                }
            }

            a() {
            }

            private ThreadPoolExecutor d(int i10, String str, BlockingQueue<Runnable> blockingQueue) {
                return new ThreadPoolExecutor(0, i10, 60L, TimeUnit.SECONDS, blockingQueue, e(str));
            }

            private ThreadFactory e(String str) {
                return new ThreadFactoryC0833a(str);
            }

            @Override // com.android.volley.c.h
            public ExecutorService a(BlockingQueue<Runnable> blockingQueue) {
                return d(4, "BlockingExecutor", blockingQueue);
            }

            @Override // com.android.volley.c.h
            public ExecutorService b(BlockingQueue<Runnable> blockingQueue) {
                return d(1, "Non-BlockingExecutor", blockingQueue);
            }

            @Override // com.android.volley.c.h
            public ScheduledExecutorService c() {
                return new ScheduledThreadPoolExecutor(0, e("ScheduledExecutor"));
            }
        }

        public d(com.android.volley.b bVar) {
            if (bVar == null) {
                throw new IllegalArgumentException("Network cannot be null");
            }
            this.f89401b = bVar;
        }

        private h b() {
            return new a();
        }

        public c a() {
            com.android.volley.f fVar = this.f89402c;
            if (fVar == null && this.f89400a == null) {
                throw new IllegalArgumentException("You must set one of the cache objects");
            }
            if (fVar == null) {
                this.f89402c = new l(null);
            }
            if (this.f89404e == null) {
                this.f89404e = new com.android.volley.j(new Handler(Looper.getMainLooper()));
            }
            if (this.f89403d == null) {
                this.f89403d = b();
            }
            return new c(this.f89402c, this.f89401b, this.f89400a, this.f89404e, this.f89403d, null);
        }

        public d c(com.android.volley.a aVar) {
            this.f89400a = aVar;
            return this;
        }

        public d d(com.android.volley.f fVar) {
            this.f89402c = fVar;
            return this;
        }

        public d e(h hVar) {
            this.f89403d = hVar;
            return this;
        }

        public d f(w wVar) {
            this.f89404e = wVar;
            return this;
        }
    }

    private class e<T> extends u<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        com.android.volley.f.a f89408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f89409c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                c.this.n(eVar.f89653a);
            }
        }

        e(s<T> sVar, com.android.volley.f.a aVar, long j10) {
            super(sVar);
            this.f89408b = aVar;
            this.f89409c = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f89653a.addMarker("cache-hit");
            s<T> sVar = this.f89653a;
            com.android.volley.f.a aVar = this.f89408b;
            v<T> networkResponse = sVar.parseNetworkResponse(new o(200, aVar.f89433a, false, 0L, aVar.f89440h));
            this.f89653a.addMarker("cache-hit-parsed");
            if (!this.f89408b.d(this.f89409c)) {
                c.this.i().a(this.f89653a, networkResponse);
                return;
            }
            this.f89653a.addMarker("cache-hit-refresh-needed");
            this.f89653a.setCacheEntry(this.f89408b);
            networkResponse.f89657d = true;
            if (c.this.f89392s.c(this.f89653a)) {
                c.this.i().a(this.f89653a, networkResponse);
            } else {
                c.this.i().b(this.f89653a, networkResponse, new a());
            }
        }
    }

    private class f<T> extends u<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        v<?> f89412b;

        class a implements com.android.volley.a.b {
            a() {
            }

            @Override // com.android.volley.a.b
            public void a() {
                f fVar = f.this;
                c.this.y(fVar.f89653a, fVar.f89412b, true);
            }
        }

        f(s<T> sVar, v<?> vVar) {
            super(sVar);
            this.f89412b = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f89386m != null) {
                c.this.f89386m.e(this.f89653a.getCacheKey(), this.f89412b.f89655b, new a());
                return;
            }
            c.this.h().b(this.f89653a.getCacheKey(), this.f89412b.f89655b);
            int i10 = 1 << 1;
            c.this.y(this.f89653a, this.f89412b, true);
        }
    }

    private class g<T> extends u<T> {

        class a implements com.android.volley.a.InterfaceC0828a {
            a() {
            }

            @Override // com.android.volley.a.InterfaceC0828a
            public void a(com.android.volley.f.a aVar) {
                g gVar = g.this;
                c.this.A(aVar, gVar.f89653a);
            }
        }

        g(s<T> sVar) {
            super(sVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f89653a.isCanceled()) {
                this.f89653a.finish("cache-discard-canceled");
                return;
            }
            this.f89653a.addMarker("cache-queue-take");
            if (c.this.f89386m != null) {
                c.this.f89386m.b(this.f89653a.getCacheKey(), new a());
            } else {
                c.this.A(c.this.h().get(this.f89653a.getCacheKey()), this.f89653a);
            }
        }
    }

    public static abstract class h {
        public abstract ExecutorService a(BlockingQueue<Runnable> blockingQueue);

        public abstract ExecutorService b(BlockingQueue<Runnable> blockingQueue);

        public abstract ScheduledExecutorService c();
    }

    private class i<T> extends u<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        o f89417b;

        i(s<T> sVar, o oVar) {
            super(sVar);
            this.f89417b = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            v<T> networkResponse = this.f89653a.parseNetworkResponse(this.f89417b);
            this.f89653a.addMarker("network-parse-complete");
            if (!this.f89653a.shouldCache() || networkResponse.f89655b == null) {
                c.this.y(this.f89653a, networkResponse, false);
            } else if (c.this.f89386m != null) {
                c.this.f89388o.execute(c.this.new f(this.f89653a, networkResponse));
            } else {
                c.this.f89390q.execute(c.this.new f(this.f89653a, networkResponse));
            }
        }
    }

    private class j<T> extends u<T> {

        class a implements com.android.volley.b.InterfaceC0829b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f89420a;

            a(long j10) {
                this.f89420a = j10;
            }

            @Override // com.android.volley.b.InterfaceC0829b
            public void a(a0 a0Var) {
                a0Var.b(SystemClock.elapsedRealtime() - this.f89420a);
                ExecutorService executorService = c.this.f89390q;
                j jVar = j.this;
                executorService.execute(c.this.new k(jVar.f89653a, a0Var));
            }

            @Override // com.android.volley.b.InterfaceC0829b
            public void b(o oVar) {
                j.this.f89653a.addMarker("network-http-complete");
                if (oVar.f89474e && j.this.f89653a.hasHadResponseDelivered()) {
                    j.this.f89653a.finish("not-modified");
                    j.this.f89653a.notifyListenerResponseNotUsable();
                } else {
                    ExecutorService executorService = c.this.f89390q;
                    j jVar = j.this;
                    executorService.execute(c.this.new i(jVar.f89653a, oVar));
                }
            }
        }

        j(s<T> sVar) {
            super(sVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f89653a.isCanceled()) {
                this.f89653a.finish("network-discard-cancelled");
                this.f89653a.notifyListenerResponseNotUsable();
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f89653a.addMarker("network-queue-take");
                c.this.f89387n.e(this.f89653a, new a(jElapsedRealtime));
            }
        }
    }

    private class k<T> extends u<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a0 f89422b;

        k(s<T> sVar, a0 a0Var) {
            super(sVar);
            this.f89422b = a0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.i().c(this.f89653a, this.f89653a.parseNetworkError(this.f89422b));
            this.f89653a.notifyListenerResponseNotUsable();
        }
    }

    private static class l implements com.android.volley.f {
        private l() {
        }

        @Override // com.android.volley.f
        public void a(String str, boolean z10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.f
        public void b(String str, com.android.volley.f.a aVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.f
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.f
        public com.android.volley.f.a get(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.f
        public void initialize() {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.f
        public void remove(String str) {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ l(a aVar) {
            this();
        }
    }

    /* synthetic */ c(com.android.volley.f fVar, com.android.volley.b bVar, com.android.volley.a aVar, w wVar, h hVar, a aVar2) {
        this(fVar, bVar, aVar, wVar, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(com.android.volley.f.a aVar, s<?> sVar) {
        if (aVar == null) {
            sVar.addMarker("cache-miss");
            if (this.f89392s.c(sVar)) {
                return;
            }
            n(sVar);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!aVar.b(jCurrentTimeMillis)) {
            this.f89390q.execute(new e(sVar, aVar, jCurrentTimeMillis));
            return;
        }
        sVar.addMarker("cache-hit-expired");
        sVar.setCacheEntry(aVar);
        if (this.f89392s.c(sVar)) {
            return;
        }
        n(sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        ArrayList arrayList;
        synchronized (this.f89395v) {
            try {
                arrayList = new ArrayList(this.f89393t);
                this.f89393t.clear();
                this.f89394u = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d((s) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(s<?> sVar, v<?> vVar, boolean z10) {
        if (z10) {
            sVar.addMarker("network-cache-written");
        }
        sVar.markDelivered();
        i().a(sVar, vVar);
        sVar.notifyListenerResponseReceived(vVar);
    }

    private static PriorityBlockingQueue<Runnable> z() {
        return new PriorityBlockingQueue<>(11, new C0832c());
    }

    @Override // com.android.volley.t
    <T> void d(s<T> sVar) {
        if (!this.f89394u) {
            synchronized (this.f89395v) {
                try {
                    if (!this.f89394u) {
                        this.f89393t.add(sVar);
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (!sVar.shouldCache()) {
            n(sVar);
        } else if (this.f89386m != null) {
            this.f89388o.execute(new g(sVar));
        } else {
            this.f89390q.execute(new g(sVar));
        }
    }

    @Override // com.android.volley.t
    <T> void n(s<T> sVar) {
        this.f89388o.execute(new j(sVar));
    }

    @Override // com.android.volley.t
    public void o() {
        p();
        this.f89388o = this.f89391r.b(z());
        this.f89390q = this.f89391r.a(z());
        this.f89389p = this.f89391r.c();
        this.f89387n.f(this.f89390q);
        this.f89387n.g(this.f89388o);
        this.f89387n.h(this.f89389p);
        if (this.f89386m != null) {
            this.f89388o.execute(new a());
        } else {
            this.f89390q.execute(new b());
        }
    }

    @Override // com.android.volley.t
    public void p() {
        ExecutorService executorService = this.f89388o;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f89388o = null;
        }
        ExecutorService executorService2 = this.f89390q;
        if (executorService2 != null) {
            executorService2.shutdownNow();
            this.f89390q = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.f89389p;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f89389p = null;
        }
    }

    private c(com.android.volley.f fVar, com.android.volley.b bVar, @p0 com.android.volley.a aVar, w wVar, h hVar) {
        super(fVar, bVar, 0, wVar);
        this.f89392s = new c0(this);
        this.f89393t = new ArrayList();
        this.f89394u = false;
        this.f89395v = new Object[0];
        this.f89386m = aVar;
        this.f89387n = bVar;
        this.f89391r = hVar;
    }
}
