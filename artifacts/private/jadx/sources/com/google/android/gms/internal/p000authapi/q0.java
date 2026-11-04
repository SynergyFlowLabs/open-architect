package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.k;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends a implements IInterface {
    q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void n(g0 g0Var, BeginSignInRequest beginSignInRequest) throws RemoteException {
        Parcel parcelI = i();
        x.d(parcelI, g0Var);
        x.c(parcelI, beginSignInRequest);
        k(1, parcelI);
    }

    public final void p(j0 j0Var, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str) throws RemoteException {
        Parcel parcelI = i();
        x.d(parcelI, j0Var);
        x.c(parcelI, getPhoneNumberHintIntentRequest);
        parcelI.writeString(str);
        k(4, parcelI);
    }

    public final void s(l0 l0Var, GetSignInIntentRequest getSignInIntentRequest) throws RemoteException {
        Parcel parcelI = i();
        x.d(parcelI, l0Var);
        x.c(parcelI, getSignInIntentRequest);
        k(3, parcelI);
    }

    public final void u(k kVar, String str) throws RemoteException {
        Parcel parcelI = i();
        x.d(parcelI, kVar);
        parcelI.writeString(str);
        k(2, parcelI);
    }
}
