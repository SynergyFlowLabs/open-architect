package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m0 extends w implements n0 {
    public m0() {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.w
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) x.a(parcel, Status.CREATOR);
        SaveAccountLinkingTokenResult saveAccountLinkingTokenResult = (SaveAccountLinkingTokenResult) x.a(parcel, SaveAccountLinkingTokenResult.CREATOR);
        x.b(parcel);
        L2(status, saveAccountLinkingTokenResult);
        return true;
    }
}
