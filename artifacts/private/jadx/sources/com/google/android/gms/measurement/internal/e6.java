package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes4.dex */
final class e6 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qe f109906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f109907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f109908c;

    e6(qe qeVar) {
        com.google.android.gms.common.internal.w.r(qeVar);
        this.f109906a = qeVar;
    }

    @androidx.annotation.m1
    public final void a() {
        qe qeVar = this.f109906a;
        qeVar.O0();
        qeVar.b().h();
        if (this.f109907b) {
            return;
        }
        qeVar.d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f109908c = qeVar.E0().m();
        qeVar.a().w().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f109908c));
        this.f109907b = true;
    }

    @androidx.annotation.m1
    public final void b() {
        qe qeVar = this.f109906a;
        qeVar.O0();
        qeVar.b().h();
        qeVar.b().h();
        if (this.f109907b) {
            qeVar.a().w().a("Unregistering connectivity change receiver");
            this.f109907b = false;
            this.f109908c = false;
            try {
                qeVar.d().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f109906a.a().o().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    final /* synthetic */ qe c() {
        return this.f109906a;
    }

    @Override // android.content.BroadcastReceiver
    @androidx.annotation.l0
    public final void onReceive(Context context, Intent intent) {
        qe qeVar = this.f109906a;
        qeVar.O0();
        String action = intent.getAction();
        qeVar.a().w().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            qeVar.a().r().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zM = qeVar.E0().m();
        if (this.f109908c != zM) {
            this.f109908c = zM;
            qeVar.b().t(new d6(this, zM));
        }
    }
}
