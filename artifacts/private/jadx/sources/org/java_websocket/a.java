package org.java_websocket;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f337800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f337801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ScheduledExecutorService f337802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ScheduledFuture<?> f337803f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.slf4j.c f337799b = org.slf4j.e.k(a.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f337804g = TimeUnit.SECONDS.toNanos(60);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f337805h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f337806i = new Object();

    /* JADX INFO: renamed from: org.java_websocket.a$a, reason: collision with other inner class name */
    class RunnableC2416a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ArrayList<f> f337807a = new ArrayList<>();

        RunnableC2416a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jNanoTime;
            this.f337807a.clear();
            try {
                this.f337807a.addAll(a.this.Q());
                synchronized (a.this.f337806i) {
                    jNanoTime = (long) (System.nanoTime() - (a.this.f337804g * 1.5d));
                }
                Iterator<f> it = this.f337807a.iterator();
                while (it.hasNext()) {
                    a.this.O(it.next(), jNanoTime);
                }
            } catch (Exception unused) {
            }
            this.f337807a.clear();
        }
    }

    private void N() {
        ScheduledExecutorService scheduledExecutorService = this.f337802e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f337802e = null;
        }
        ScheduledFuture<?> scheduledFuture = this.f337803f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f337803f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(f fVar, long j10) {
        if (fVar instanceof i) {
            i iVar = (i) fVar;
            if (iVar.A() < j10) {
                this.f337799b.b0("Closing connection due to no pong received: {}", iVar);
                iVar.J(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
            } else if (iVar.isOpen()) {
                iVar.m();
            } else {
                this.f337799b.b0("Trying to ping a non open connection: {}", iVar);
            }
        }
    }

    private void T() {
        N();
        this.f337802e = Executors.newSingleThreadScheduledExecutor(new org.java_websocket.util.d("connectionLostChecker"));
        RunnableC2416a runnableC2416a = new RunnableC2416a();
        ScheduledExecutorService scheduledExecutorService = this.f337802e;
        long j10 = this.f337804g;
        this.f337803f = scheduledExecutorService.scheduleAtFixedRate(runnableC2416a, j10, j10, TimeUnit.NANOSECONDS);
    }

    public int P() {
        int seconds;
        synchronized (this.f337806i) {
            seconds = (int) TimeUnit.NANOSECONDS.toSeconds(this.f337804g);
        }
        return seconds;
    }

    protected abstract Collection<f> Q();

    public boolean R() {
        return this.f337801d;
    }

    public boolean S() {
        return this.f337800c;
    }

    public void U(int i10) {
        synchronized (this.f337806i) {
            try {
                long nanos = TimeUnit.SECONDS.toNanos(i10);
                this.f337804g = nanos;
                if (nanos <= 0) {
                    this.f337799b.J("Connection lost timer stopped");
                    N();
                    return;
                }
                if (this.f337805h) {
                    this.f337799b.J("Connection lost timer restarted");
                    try {
                        for (f fVar : new ArrayList(Q())) {
                            if (fVar instanceof i) {
                                ((i) fVar).Q();
                            }
                        }
                    } catch (Exception e10) {
                        this.f337799b.c("Exception during connection lost restart", e10);
                    }
                    T();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void V(boolean z10) {
        this.f337801d = z10;
    }

    public void W(boolean z10) {
        this.f337800c = z10;
    }

    protected void X() {
        synchronized (this.f337806i) {
            try {
                if (this.f337804g <= 0) {
                    this.f337799b.J("Connection lost timer deactivated");
                    return;
                }
                this.f337799b.J("Connection lost timer started");
                this.f337805h = true;
                T();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void Y() {
        synchronized (this.f337806i) {
            try {
                if (this.f337802e != null || this.f337803f != null) {
                    this.f337805h = false;
                    this.f337799b.J("Connection lost timer stopped");
                    N();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
