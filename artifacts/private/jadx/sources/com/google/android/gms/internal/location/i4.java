package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i4 extends b0 implements j4 {
    public i4() {
        super("com.google.android.gms.location.internal.IBooleanStatusCallback");
    }

    @Override // com.google.android.gms.internal.location.b0
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) c1.a(parcel, Status.CREATOR);
        boolean z10 = parcel.readInt() != 0;
        c1.d(parcel);
        e1(status, z10);
        return true;
    }
}
