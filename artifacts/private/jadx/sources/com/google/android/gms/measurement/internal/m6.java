package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class m6 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f110248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ n6 f110249b;

    m6(n6 n6Var, String str) {
        Objects.requireNonNull(n6Var);
        this.f110249b = n6Var;
        this.f110248a = str;
    }

    final /* synthetic */ String a() {
        return this.f110248a;
    }

    @Override // android.content.ServiceConnection
    @androidx.annotation.l0
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f110249b.f110284a.a().r().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.s0 s0VarK = com.google.android.gms.internal.measurement.r0.k(iBinder);
            if (s0VarK == null) {
                this.f110249b.f110284a.a().r().a("Install Referrer Service implementation was not found");
                return;
            }
            h7 h7Var = this.f110249b.f110284a;
            h7Var.a().w().a("Install Referrer Service connected");
            h7Var.b().t(new l6(this, s0VarK, this));
        } catch (RuntimeException e10) {
            this.f110249b.f110284a.a().r().b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    @androidx.annotation.l0
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f110249b.f110284a.a().w().a("Install Referrer Service disconnected");
    }
}
