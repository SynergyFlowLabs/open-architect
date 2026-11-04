package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class rc implements ServiceConnection, com.google.android.gms.common.internal.f.a, com.google.android.gms.common.internal.f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f110452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile q5 f110453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ xc f110454c;

    protected rc(xc xcVar) {
        Objects.requireNonNull(xcVar);
        this.f110454c = xcVar;
    }

    @androidx.annotation.m1
    public final void a(Intent intent) {
        xc xcVar = this.f110454c;
        xcVar.h();
        Context contextD = xcVar.f110184a.d();
        com.google.android.gms.common.stats.a aVarB = com.google.android.gms.common.stats.a.b();
        synchronized (this) {
            try {
                if (this.f110452a) {
                    this.f110454c.f110184a.a().w().a("Connection attempt already in progress");
                    return;
                }
                xc xcVar2 = this.f110454c;
                xcVar2.f110184a.a().w().a("Using local app measurement service");
                this.f110452a = true;
                aVarB.a(contextD, intent, xcVar2.M(), 129);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.m1
    public final void b() {
        if (this.f110453b != null && (this.f110453b.isConnected() || this.f110453b.f())) {
            this.f110453b.d();
        }
        this.f110453b = null;
    }

    @androidx.annotation.m1
    public final void c() {
        xc xcVar = this.f110454c;
        xcVar.h();
        Context contextD = xcVar.f110184a.d();
        synchronized (this) {
            try {
                if (this.f110452a) {
                    this.f110454c.f110184a.a().w().a("Connection attempt already in progress");
                    return;
                }
                if (this.f110453b != null && (this.f110453b.f() || this.f110453b.isConnected())) {
                    this.f110454c.f110184a.a().w().a("Already awaiting connection attempt");
                    return;
                }
                this.f110453b = new q5(contextD, Looper.getMainLooper(), this, this);
                this.f110454c.f110184a.a().w().a("Connecting to remote service");
                this.f110452a = true;
                com.google.android.gms.common.internal.w.r(this.f110453b);
                this.f110453b.x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void d(boolean z10) {
        this.f110452a = false;
    }

    @Override // com.google.android.gms.common.internal.f.a
    @androidx.annotation.l0
    public final void i(Bundle bundle) {
        this.f110454c.f110184a.b().o();
        synchronized (this) {
            try {
                try {
                    com.google.android.gms.common.internal.w.r(this.f110453b);
                    this.f110454c.f110184a.b().t(new mc(this, (d5) this.f110453b.M()));
                } catch (DeadObjectException | IllegalStateException unused) {
                    this.f110453b = null;
                    this.f110452a = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.f.a
    @androidx.annotation.l0
    public final void k(int i10) {
        h7 h7Var = this.f110454c.f110184a;
        h7Var.b().o();
        h7Var.a().v().a("Service connection suspended");
        h7Var.b().t(new nc(this));
    }

    @Override // com.google.android.gms.common.internal.f.b
    @androidx.annotation.l0
    public final void n(@NonNull ConnectionResult connectionResult) {
        xc xcVar = this.f110454c;
        xcVar.f110184a.b().o();
        w5 w5VarY = xcVar.f110184a.y();
        if (w5VarY != null) {
            w5VarY.w().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            try {
                this.f110452a = false;
                this.f110453b = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f110454c.f110184a.b().t(new qc(this, connectionResult));
    }

    @Override // android.content.ServiceConnection
    @androidx.annotation.l0
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f110454c.f110184a.b().o();
        synchronized (this) {
            try {
                if (iBinder == null) {
                    this.f110452a = false;
                    this.f110454c.f110184a.a().o().a("Service connected with null binder");
                    return;
                }
                d5 a5Var = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        a5Var = iInterfaceQueryLocalInterface instanceof d5 ? (d5) iInterfaceQueryLocalInterface : new a5(iBinder);
                        this.f110454c.f110184a.a().w().a("Bound to IMeasurementService interface");
                    } else {
                        this.f110454c.f110184a.a().o().b("Got binder with a wrong descriptor", interfaceDescriptor);
                    }
                } catch (RemoteException unused) {
                    this.f110454c.f110184a.a().o().a("Service connect failed to get IMeasurementService");
                }
                if (a5Var == null) {
                    this.f110452a = false;
                    try {
                        com.google.android.gms.common.stats.a aVarB = com.google.android.gms.common.stats.a.b();
                        xc xcVar = this.f110454c;
                        aVarB.c(xcVar.f110184a.d(), xcVar.M());
                    } catch (IllegalArgumentException unused2) {
                    }
                } else {
                    this.f110454c.f110184a.b().t(new jc(this, a5Var));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    @androidx.annotation.l0
    public final void onServiceDisconnected(ComponentName componentName) {
        h7 h7Var = this.f110454c.f110184a;
        h7Var.b().o();
        h7Var.a().v().a("Service disconnected");
        h7Var.b().t(new kc(this, componentName));
    }
}
