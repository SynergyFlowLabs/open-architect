package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f0 extends w implements g0 {
    public f0() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.w
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) x.a(parcel, Status.CREATOR);
        BeginSignInResult beginSignInResult = (BeginSignInResult) x.a(parcel, BeginSignInResult.CREATOR);
        x.b(parcel);
        t9(status, beginSignInResult);
        return true;
    }
}
