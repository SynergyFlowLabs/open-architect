package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e7 extends x implements f7 {
    public e7() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    @Override // com.google.android.gms.internal.auth.x
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            return false;
        }
        Status status = (Status) v0.a(parcel, Status.CREATOR);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) v0.a(parcel, AccountChangeEventsResponse.CREATOR);
        v0.b(parcel);
        b4(status, accountChangeEventsResponse);
        return true;
    }
}
