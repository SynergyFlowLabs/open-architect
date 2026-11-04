package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class m2 extends com.google.android.gms.internal.common.a implements o {
    m2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.o
    public final Account g() throws RemoteException {
        Parcel parcelI = i(2, p());
        Account account = (Account) com.google.android.gms.internal.common.s.a(parcelI, Account.CREATOR);
        parcelI.recycle();
        return account;
    }
}
