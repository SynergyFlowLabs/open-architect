package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.v0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends com.google.android.gms.internal.auth.a implements h {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.auth.account.h
    public final void E4(boolean z10) throws RemoteException {
        Parcel parcelI = i();
        int i10 = v0.f107852b;
        parcelI.writeInt(z10 ? 1 : 0);
        n(1, parcelI);
    }

    @Override // com.google.android.gms.auth.account.h
    public final void Me(e eVar, String str) throws RemoteException {
        Parcel parcelI = i();
        v0.d(parcelI, eVar);
        parcelI.writeString(str);
        n(2, parcelI);
    }

    @Override // com.google.android.gms.auth.account.h
    public final void Oe(e eVar, Account account) throws RemoteException {
        Parcel parcelI = i();
        v0.d(parcelI, eVar);
        v0.c(parcelI, account);
        n(3, parcelI);
    }
}
