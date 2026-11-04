package com.google.android.gms.internal.fido;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q0 extends b0 implements r0 {
    public q0() {
        super("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
    }

    @Override // com.google.android.gms.internal.fido.b0
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            ArrayList arrayListB = n0.b(parcel);
            n0.c(parcel);
            ub(arrayListB);
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
