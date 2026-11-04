package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class j2 extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f106582g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f106583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile Handler f106584i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h2 f106585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.common.stats.a f106586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f106587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f106588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private volatile Executor f106589n;

    j2(Context context, Looper looper, @androidx.annotation.p0 Executor executor) {
        h2 h2Var = new h2(this, null);
        this.f106585j = h2Var;
        this.f106583h = context.getApplicationContext();
        this.f106584i = new com.google.android.gms.internal.common.x(looper, h2Var);
        this.f106586k = com.google.android.gms.common.stats.a.b();
        this.f106587l = 5000L;
        this.f106588m = 300000L;
        this.f106589n = executor;
    }

    @Override // com.google.android.gms.common.internal.l
    protected final ConnectionResult m(f2 f2Var, ServiceConnection serviceConnection, String str, @androidx.annotation.p0 Executor executor) {
        ConnectionResult connectionResultD;
        w.s(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f106582g) {
            try {
                g2 g2Var = (g2) this.f106582g.get(f2Var);
                if (executor == null) {
                    executor = this.f106589n;
                }
                if (g2Var == null) {
                    g2Var = new g2(this, f2Var);
                    g2Var.e(serviceConnection, serviceConnection, str);
                    connectionResultD = g2.d(g2Var, str, executor);
                    this.f106582g.put(f2Var, g2Var);
                } else {
                    this.f106584i.removeMessages(0, f2Var);
                    if (g2Var.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + f2Var.toString());
                    }
                    g2Var.e(serviceConnection, serviceConnection, str);
                    int iA = g2Var.a();
                    if (iA == 1) {
                        serviceConnection.onServiceConnected(g2Var.b(), g2Var.c());
                    } else if (iA == 2) {
                        connectionResultD = g2.d(g2Var, str, executor);
                    }
                    connectionResultD = null;
                }
                if (g2Var.j()) {
                    return ConnectionResult.f105824i3;
                }
                if (connectionResultD == null) {
                    connectionResultD = new ConnectionResult(-1);
                }
                return connectionResultD;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.l
    protected final void n(f2 f2Var, ServiceConnection serviceConnection, String str) {
        w.s(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f106582g) {
            try {
                g2 g2Var = (g2) this.f106582g.get(f2Var);
                if (g2Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + f2Var.toString());
                }
                if (!g2Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + f2Var.toString());
                }
                g2Var.f(serviceConnection, str);
                if (g2Var.i()) {
                    this.f106584i.sendMessageDelayed(this.f106584i.obtainMessage(0, f2Var), this.f106587l);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void u(@androidx.annotation.p0 Executor executor) {
        synchronized (this.f106582g) {
            try {
                this.f106589n = executor;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void v(Looper looper) {
        synchronized (this.f106582g) {
            try {
                this.f106584i = new com.google.android.gms.internal.common.x(looper, this.f106585j);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
