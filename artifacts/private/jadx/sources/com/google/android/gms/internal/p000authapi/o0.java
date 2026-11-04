package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o0 extends w implements p0 {
    public o0() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.w
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) x.a(parcel, Status.CREATOR);
        SavePasswordResult savePasswordResult = (SavePasswordResult) x.a(parcel, SavePasswordResult.CREATOR);
        x.b(parcel);
        j8(status, savePasswordResult);
        return true;
    }
}
