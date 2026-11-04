package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends a implements IInterface {
    e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void p(d0 d0Var) throws RemoteException {
        Parcel parcelI = i();
        v0.d(parcelI, d0Var);
        n(3, parcelI);
    }

    public final void s(d0 d0Var, ProxyRequest proxyRequest) throws RemoteException {
        Parcel parcelI = i();
        v0.d(parcelI, d0Var);
        v0.c(parcelI, proxyRequest);
        n(1, parcelI);
    }
}
