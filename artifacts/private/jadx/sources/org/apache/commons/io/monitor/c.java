package org.apache.commons.io.monitor;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f336717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<d> f336718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Thread f336719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ThreadFactory f336720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f336721e;

    public c() {
        this(10000L);
    }

    public void a(d dVar) {
        if (dVar != null) {
            this.f336718b.add(dVar);
        }
    }

    public long b() {
        return this.f336717a;
    }

    public Iterable<d> c() {
        return this.f336718b;
    }

    public void d(d dVar) {
        if (dVar != null) {
            while (this.f336718b.remove(dVar)) {
            }
        }
    }

    public synchronized void e(ThreadFactory threadFactory) {
        this.f336720d = threadFactory;
    }

    public synchronized void f() throws Exception {
        try {
            if (this.f336721e) {
                throw new IllegalStateException("Monitor is already running");
            }
            Iterator<d> it = this.f336718b.iterator();
            while (it.hasNext()) {
                it.next().m();
            }
            this.f336721e = true;
            ThreadFactory threadFactory = this.f336720d;
            if (threadFactory != null) {
                this.f336719c = threadFactory.newThread(this);
            } else {
                this.f336719c = new Thread(this);
            }
            this.f336719c.start();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void g() throws Exception {
        try {
            h(this.f336717a);
        } finally {
        }
    }

    public synchronized void h(long j10) throws Exception {
        try {
            if (!this.f336721e) {
                throw new IllegalStateException("Monitor is not running");
            }
            this.f336721e = false;
            try {
                this.f336719c.join(j10);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            Iterator<d> it = this.f336718b.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.f336721e) {
            Iterator<d> it = this.f336718b.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            if (!this.f336721e) {
                return;
            } else {
                try {
                    Thread.sleep(this.f336717a);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public c(long j10) {
        this.f336718b = new CopyOnWriteArrayList();
        this.f336719c = null;
        this.f336721e = false;
        this.f336717a = j10;
    }

    public c(long j10, d... dVarArr) {
        this(j10);
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                a(dVar);
            }
        }
    }
}
