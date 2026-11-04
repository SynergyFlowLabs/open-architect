package com.android.volley;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.l1;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public class m extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<s<?>> f89465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f89466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f89467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f89468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f89469e = false;

    public m(BlockingQueue<s<?>> blockingQueue, l lVar, f fVar, w wVar) {
        this.f89465a = blockingQueue;
        this.f89466b = lVar;
        this.f89467c = fVar;
        this.f89468d = wVar;
    }

    @e.b(14)
    private void a(s<?> sVar) {
        TrafficStats.setThreadStatsTag(sVar.getTrafficStatsTag());
    }

    private void b(s<?> sVar, a0 a0Var) {
        this.f89468d.c(sVar, sVar.parseNetworkError(a0Var));
    }

    private void c() throws InterruptedException {
        d(this.f89465a.take());
    }

    @l1
    void d(s<?> sVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        sVar.sendEvent(3);
        try {
            try {
                try {
                    sVar.addMarker("network-queue-take");
                    if (sVar.isCanceled()) {
                        sVar.finish("network-discard-cancelled");
                        sVar.notifyListenerResponseNotUsable();
                        sVar.sendEvent(4);
                        return;
                    }
                    a(sVar);
                    o oVarA = this.f89466b.a(sVar);
                    sVar.addMarker("network-http-complete");
                    if (oVarA.f89474e && sVar.hasHadResponseDelivered()) {
                        sVar.finish("not-modified");
                        sVar.notifyListenerResponseNotUsable();
                        sVar.sendEvent(4);
                        return;
                    }
                    v<?> networkResponse = sVar.parseNetworkResponse(oVarA);
                    sVar.addMarker("network-parse-complete");
                    if (sVar.shouldCache() && networkResponse.f89655b != null) {
                        this.f89467c.b(sVar.getCacheKey(), networkResponse.f89655b);
                        sVar.addMarker("network-cache-written");
                    }
                    sVar.markDelivered();
                    this.f89468d.a(sVar, networkResponse);
                    sVar.notifyListenerResponseReceived(networkResponse);
                    sVar.sendEvent(4);
                } catch (Exception e10) {
                    b0.d(e10, "Unhandled exception %s", e10.toString());
                    a0 a0Var = new a0(e10);
                    a0Var.b(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    this.f89468d.c(sVar, a0Var);
                    sVar.notifyListenerResponseNotUsable();
                    sVar.sendEvent(4);
                }
            } catch (a0 e11) {
                e11.b(SystemClock.elapsedRealtime() - jElapsedRealtime);
                b(sVar, e11);
                sVar.notifyListenerResponseNotUsable();
                sVar.sendEvent(4);
            }
        } catch (Throwable th2) {
            sVar.sendEvent(4);
            throw th2;
        }
    }

    public void e() {
        this.f89469e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f89469e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                b0.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
