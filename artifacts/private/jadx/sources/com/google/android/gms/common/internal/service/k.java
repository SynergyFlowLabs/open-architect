package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends com.google.android.gms.internal.base.b implements l {
    public k() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // com.google.android.gms.internal.base.b
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        int i12 = parcel.readInt();
        com.google.android.gms.internal.base.c.b(parcel);
        I6(i12);
        return true;
    }
}
