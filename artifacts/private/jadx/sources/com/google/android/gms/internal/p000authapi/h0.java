package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends a implements IInterface {
    h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void n(n0 n0Var, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) throws RemoteException {
        Parcel parcelI = i();
        x.d(parcelI, n0Var);
        x.c(parcelI, saveAccountLinkingTokenRequest);
        k(1, parcelI);
    }

    public final void p(p0 p0Var, SavePasswordRequest savePasswordRequest) throws RemoteException {
        Parcel parcelI = i();
        x.d(parcelI, p0Var);
        x.c(parcelI, savePasswordRequest);
        k(2, parcelI);
    }
}
