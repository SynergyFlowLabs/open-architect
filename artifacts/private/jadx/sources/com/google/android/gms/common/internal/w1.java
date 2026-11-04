package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.l1
public final class w1 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f106660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f106661b;

    public w1(f fVar, int i10) {
        this.f106661b = fVar;
        this.f106660a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            f.m0(this.f106661b, 16);
            return;
        }
        synchronized (this.f106661b.f106533n) {
            try {
                f fVar = this.f106661b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                fVar.f106534o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof r)) ? new j1(iBinder) : (r) iInterfaceQueryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f106661b.n0(0, null, this.f106660a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f106661b.f106533n) {
            this.f106661b.f106534o = null;
        }
        f fVar = this.f106661b;
        int i10 = this.f106660a;
        Handler handler = fVar.f106531l;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
