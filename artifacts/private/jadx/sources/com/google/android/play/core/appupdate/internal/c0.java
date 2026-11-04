package com.google.android.play.core.appupdate.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
final class c0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d0 f114821a;

    /* synthetic */ c0(d0 d0Var, b0 b0Var) {
        this.f114821a = d0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f114821a.f114824b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        d0 d0Var = this.f114821a;
        d0Var.c().post(new z(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f114821a.f114824b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        d0 d0Var = this.f114821a;
        d0Var.c().post(new a0(this));
    }
}
