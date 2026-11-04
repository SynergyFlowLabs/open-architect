package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l4 extends b0 implements m4 {
    public l4() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.b0
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzl zzlVar = (zzl) c1.a(parcel, zzl.CREATOR);
            c1.d(parcel);
            s3(zzlVar);
        } else {
            if (i10 != 2) {
                return false;
            }
            j();
        }
        return true;
    }
}
