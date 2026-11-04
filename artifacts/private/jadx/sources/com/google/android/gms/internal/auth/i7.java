package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class i7 extends a implements IInterface {
    i7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void p(com.google.android.gms.common.api.internal.k kVar, zzbw zzbwVar) throws RemoteException {
        Parcel parcelI = i();
        v0.d(parcelI, kVar);
        v0.c(parcelI, zzbwVar);
        n(2, parcelI);
    }

    public final void s(f7 f7Var, AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException {
        Parcel parcelI = i();
        v0.d(parcelI, f7Var);
        v0.c(parcelI, accountChangeEventsRequest);
        n(4, parcelI);
    }

    public final void u(h7 h7Var, Account account, String str, Bundle bundle) throws RemoteException {
        Parcel parcelI = i();
        v0.d(parcelI, h7Var);
        v0.c(parcelI, account);
        parcelI.writeString(str);
        v0.c(parcelI, bundle);
        n(1, parcelI);
    }

    public final void v(d7 d7Var, Account account) throws RemoteException {
        Parcel parcelI = i();
        v0.d(parcelI, d7Var);
        v0.c(parcelI, account);
        n(6, parcelI);
    }

    public final void w(d7 d7Var, String str) throws RemoteException {
        Parcel parcelI = i();
        v0.d(parcelI, d7Var);
        parcelI.writeString(str);
        n(3, parcelI);
    }
}
