package com.google.android.gms.internal.fido;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o0 extends b0 implements p0 {
    public o0() {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
    }

    @Override // com.google.android.gms.internal.fido.b0
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            int i12 = n0.f108028b;
            int i13 = parcel.readInt();
            n0.c(parcel);
            Z2(i13 != 0);
        } else {
            if (i10 != 2) {
                return false;
            }
            Status status = (Status) n0.a(parcel, Status.CREATOR);
            n0.c(parcel);
            g0(status);
        }
        parcel2.writeNoException();
        return true;
    }
}
