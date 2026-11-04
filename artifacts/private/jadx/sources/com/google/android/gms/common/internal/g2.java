package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class g2 implements ServiceConnection, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f106552a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f106553b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f106554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private IBinder f106555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f2 f106556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ComponentName f106557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ j2 f106558g;

    public g2(j2 j2Var, f2 f2Var) {
        this.f106558g = j2Var;
        this.f106556e = f2Var;
    }

    static /* bridge */ /* synthetic */ ConnectionResult d(g2 g2Var, String str, Executor executor) {
        try {
            Intent intentA = r1.a(g2Var.f106558g.f106583h, g2Var.f106556e);
            g2Var.f106553b = 3;
            StrictMode.VmPolicy vmPolicyA = com.google.android.gms.common.util.h0.a();
            try {
                j2 j2Var = g2Var.f106558g;
                boolean zE = j2Var.f106586k.e(j2Var.f106583h, str, intentA, g2Var, 4225, executor);
                g2Var.f106554c = zE;
                if (zE) {
                    g2Var.f106558g.f106584i.sendMessageDelayed(g2Var.f106558g.f106584i.obtainMessage(1, g2Var.f106556e), g2Var.f106558g.f106588m);
                    ConnectionResult connectionResult = ConnectionResult.f105824i3;
                    StrictMode.setVmPolicy(vmPolicyA);
                    return connectionResult;
                }
                g2Var.f106553b = 2;
                try {
                    j2 j2Var2 = g2Var.f106558g;
                    j2Var2.f106586k.c(j2Var2.f106583h, g2Var);
                } catch (IllegalArgumentException unused) {
                }
                ConnectionResult connectionResult2 = new ConnectionResult(16);
                StrictMode.setVmPolicy(vmPolicyA);
                return connectionResult2;
            } catch (Throwable th2) {
                StrictMode.setVmPolicy(vmPolicyA);
                throw th2;
            }
        } catch (p1 e10) {
            return e10.f106620a;
        }
    }

    public final int a() {
        return this.f106553b;
    }

    public final ComponentName b() {
        return this.f106557f;
    }

    @androidx.annotation.p0
    public final IBinder c() {
        return this.f106555d;
    }

    public final void e(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f106552a.put(serviceConnection, serviceConnection2);
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f106552a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f106558g.f106584i.removeMessages(1, this.f106556e);
        j2 j2Var = this.f106558g;
        j2Var.f106586k.c(j2Var.f106583h, this);
        this.f106554c = false;
        this.f106553b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f106552a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f106552a.isEmpty();
    }

    public final boolean j() {
        return this.f106554c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f106558g.f106582g) {
            try {
                this.f106558g.f106584i.removeMessages(1, this.f106556e);
                this.f106555d = iBinder;
                this.f106557f = componentName;
                Iterator it = this.f106552a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f106553b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f106558g.f106582g) {
            try {
                this.f106558g.f106584i.removeMessages(1, this.f106556e);
                this.f106555d = null;
                this.f106557f = componentName;
                Iterator it = this.f106552a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f106553b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
