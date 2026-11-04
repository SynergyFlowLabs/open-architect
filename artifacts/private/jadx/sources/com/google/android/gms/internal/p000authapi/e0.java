package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends a implements IInterface {
    e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final void n(d0 d0Var, AuthorizationRequest authorizationRequest) throws RemoteException {
        Parcel parcelI = i();
        x.d(parcelI, d0Var);
        x.c(parcelI, authorizationRequest);
        k(1, parcelI);
    }
}
