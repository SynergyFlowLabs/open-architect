package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f106640a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Handler f106647h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f106641b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.l1
    final ArrayList f106642c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f106643d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f106644e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicInteger f106645f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f106646g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f106648i = new Object();

    public t0(Looper looper, s0 s0Var) {
        this.f106640a = s0Var;
        this.f106647h = new com.google.android.gms.internal.base.q(looper, this);
    }

    public final void a() {
        this.f106644e = false;
        this.f106645f.incrementAndGet();
    }

    public final void b() {
        this.f106644e = true;
    }

    @androidx.annotation.l1
    public final void c(ConnectionResult connectionResult) {
        w.i(this.f106647h, "onConnectionFailure must only be called on the Handler thread");
        this.f106647h.removeMessages(1);
        synchronized (this.f106648i) {
            try {
                ArrayList<com.google.android.gms.common.api.l.c> arrayList = new ArrayList(this.f106643d);
                int i10 = this.f106645f.get();
                for (com.google.android.gms.common.api.l.c cVar : arrayList) {
                    if (this.f106644e && this.f106645f.get() == i10) {
                        if (this.f106643d.contains(cVar)) {
                            cVar.n(connectionResult);
                        }
                    }
                    return;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.l1
    public final void d(@androidx.annotation.p0 Bundle bundle) {
        w.i(this.f106647h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f106648i) {
            try {
                w.x(!this.f106646g);
                this.f106647h.removeMessages(1);
                this.f106646g = true;
                w.x(this.f106642c.isEmpty());
                ArrayList<com.google.android.gms.common.api.l.b> arrayList = new ArrayList(this.f106641b);
                int i10 = this.f106645f.get();
                for (com.google.android.gms.common.api.l.b bVar : arrayList) {
                    if (!this.f106644e || !this.f106640a.isConnected() || this.f106645f.get() != i10) {
                        break;
                        break;
                        break;
                    } else if (!this.f106642c.contains(bVar)) {
                        bVar.i(bundle);
                    }
                }
                this.f106642c.clear();
                this.f106646g = false;
            } finally {
            }
        }
    }

    @androidx.annotation.l1
    public final void e(int i10) {
        w.i(this.f106647h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f106647h.removeMessages(1);
        synchronized (this.f106648i) {
            try {
                this.f106646g = true;
                ArrayList<com.google.android.gms.common.api.l.b> arrayList = new ArrayList(this.f106641b);
                int i11 = this.f106645f.get();
                for (com.google.android.gms.common.api.l.b bVar : arrayList) {
                    if (!this.f106644e || this.f106645f.get() != i11) {
                        break;
                        break;
                    } else if (this.f106641b.contains(bVar)) {
                        bVar.k(i10);
                    }
                }
                this.f106642c.clear();
                this.f106646g = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(com.google.android.gms.common.api.l.b bVar) {
        w.r(bVar);
        synchronized (this.f106648i) {
            try {
                if (this.f106641b.contains(bVar)) {
                    String.valueOf(bVar);
                } else {
                    this.f106641b.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f106640a.isConnected()) {
            Handler handler = this.f106647h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void g(com.google.android.gms.common.api.l.c cVar) {
        w.r(cVar);
        synchronized (this.f106648i) {
            try {
                if (this.f106643d.contains(cVar)) {
                    String.valueOf(cVar);
                } else {
                    this.f106643d.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(com.google.android.gms.common.api.l.b bVar) {
        w.r(bVar);
        synchronized (this.f106648i) {
            try {
                if (!this.f106641b.remove(bVar)) {
                    String.valueOf(bVar);
                } else if (this.f106646g) {
                    this.f106642c.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i10, new Exception());
            int i11 = 3 << 0;
            return false;
        }
        com.google.android.gms.common.api.l.b bVar = (com.google.android.gms.common.api.l.b) message.obj;
        synchronized (this.f106648i) {
            try {
                if (this.f106644e && this.f106640a.isConnected() && this.f106641b.contains(bVar)) {
                    bVar.i(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    public final void i(com.google.android.gms.common.api.l.c cVar) {
        w.r(cVar);
        synchronized (this.f106648i) {
            try {
                if (!this.f106643d.remove(cVar)) {
                    String.valueOf(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean j(com.google.android.gms.common.api.l.b bVar) {
        boolean zContains;
        w.r(bVar);
        synchronized (this.f106648i) {
            try {
                zContains = this.f106641b.contains(bVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zContains;
    }

    public final boolean k(com.google.android.gms.common.api.l.c cVar) {
        boolean zContains;
        w.r(cVar);
        synchronized (this.f106648i) {
            try {
                zContains = this.f106643d.contains(cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zContains;
    }
}
