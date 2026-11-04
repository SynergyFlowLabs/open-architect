package com.google.android.play.core.review.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
final class r implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f114959a;

    /* synthetic */ r(t tVar, s sVar) {
        this.f114959a = tVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f114959a.f114962b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f114959a.c().post(new p(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f114959a.f114962b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f114959a.c().post(new q(this));
    }
}
