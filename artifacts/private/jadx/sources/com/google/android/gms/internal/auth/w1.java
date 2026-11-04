package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class w1 extends a implements y3 {
    w1(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // com.google.android.gms.internal.auth.y3
    public final Bundle E6(Account account) throws RemoteException {
        Parcel parcelI = i();
        v0.c(parcelI, account);
        Parcel parcelK = k(7, parcelI);
        Bundle bundle = (Bundle) v0.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.y3
    public final AccountChangeEventsResponse Hc(AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException {
        Parcel parcelI = i();
        v0.c(parcelI, accountChangeEventsRequest);
        Parcel parcelK = k(3, parcelI);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) v0.a(parcelK, AccountChangeEventsResponse.CREATOR);
        parcelK.recycle();
        return accountChangeEventsResponse;
    }

    @Override // com.google.android.gms.internal.auth.y3
    public final Bundle K7(String str) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeString(str);
        Parcel parcelK = k(8, parcelI);
        Bundle bundle = (Bundle) v0.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.y3
    public final Bundle sb(String str, Bundle bundle) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeString(str);
        v0.c(parcelI, bundle);
        Parcel parcelK = k(2, parcelI);
        Bundle bundle2 = (Bundle) v0.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.y3
    public final Bundle vc(Account account, String str, Bundle bundle) throws RemoteException {
        Parcel parcelI = i();
        v0.c(parcelI, account);
        parcelI.writeString(str);
        v0.c(parcelI, bundle);
        Parcel parcelK = k(5, parcelI);
        Bundle bundle2 = (Bundle) v0.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle2;
    }
}
