package com.android.volley;

import android.os.Process;
import androidx.annotation.l1;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public class g extends Thread {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f89441g = b0.f89376b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<s<?>> f89442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue<s<?>> f89443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f89444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f89445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f89446e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c0 f89447f;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f89448a;

        a(s sVar) {
            this.f89448a = sVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                g.this.f89443b.put(this.f89448a);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public g(BlockingQueue<s<?>> blockingQueue, BlockingQueue<s<?>> blockingQueue2, f fVar, w wVar) {
        this.f89442a = blockingQueue;
        this.f89443b = blockingQueue2;
        this.f89444c = fVar;
        this.f89445d = wVar;
        this.f89447f = new c0(this, blockingQueue2, wVar);
    }

    private void b() throws InterruptedException {
        c(this.f89442a.take());
    }

    @l1
    void c(s<?> sVar) throws InterruptedException {
        sVar.addMarker("cache-queue-take");
        sVar.sendEvent(1);
        try {
            if (sVar.isCanceled()) {
                sVar.finish("cache-discard-canceled");
                sVar.sendEvent(2);
                return;
            }
            f.a aVar = this.f89444c.get(sVar.getCacheKey());
            if (aVar == null) {
                sVar.addMarker("cache-miss");
                if (!this.f89447f.c(sVar)) {
                    this.f89443b.put(sVar);
                }
                sVar.sendEvent(2);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.b(jCurrentTimeMillis)) {
                sVar.addMarker("cache-hit-expired");
                sVar.setCacheEntry(aVar);
                if (!this.f89447f.c(sVar)) {
                    this.f89443b.put(sVar);
                }
                sVar.sendEvent(2);
                return;
            }
            sVar.addMarker("cache-hit");
            v<?> networkResponse = sVar.parseNetworkResponse(new o(aVar.f89433a, aVar.f89439g));
            sVar.addMarker("cache-hit-parsed");
            if (!networkResponse.b()) {
                sVar.addMarker("cache-parsing-failed");
                this.f89444c.a(sVar.getCacheKey(), true);
                sVar.setCacheEntry(null);
                if (!this.f89447f.c(sVar)) {
                    this.f89443b.put(sVar);
                }
                sVar.sendEvent(2);
                return;
            }
            if (aVar.d(jCurrentTimeMillis)) {
                sVar.addMarker("cache-hit-refresh-needed");
                sVar.setCacheEntry(aVar);
                networkResponse.f89657d = true;
                if (this.f89447f.c(sVar)) {
                    this.f89445d.a(sVar, networkResponse);
                } else {
                    this.f89445d.b(sVar, networkResponse, new a(sVar));
                }
            } else {
                this.f89445d.a(sVar, networkResponse);
            }
            sVar.sendEvent(2);
        } catch (Throwable th2) {
            sVar.sendEvent(2);
            throw th2;
        }
    }

    public void d() {
        this.f89446e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f89441g) {
            b0.f("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f89444c.initialize();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f89446e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                b0.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
