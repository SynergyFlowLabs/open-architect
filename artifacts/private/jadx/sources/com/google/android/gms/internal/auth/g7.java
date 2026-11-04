package com.google.android.gms.internal.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g7 extends x implements h7 {
    public g7() {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }

    @Override // com.google.android.gms.internal.auth.x
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            return false;
        }
        Status status = (Status) v0.a(parcel, Status.CREATOR);
        Bundle bundle = (Bundle) v0.a(parcel, Bundle.CREATOR);
        v0.b(parcel);
        g1(status, bundle);
        return true;
    }
}
