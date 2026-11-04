package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c0 extends w implements d0 {
    public c0() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.w
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) x.a(parcel, Status.CREATOR);
        AuthorizationResult authorizationResult = (AuthorizationResult) x.a(parcel, AuthorizationResult.CREATOR);
        x.b(parcel);
        Xe(status, authorizationResult);
        return true;
    }
}
