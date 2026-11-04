package com.google.android.gms.internal.fido;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w0 extends b0 implements x0 {
    public w0() {
        super("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
    }

    @Override // com.google.android.gms.internal.fido.b0
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) n0.a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) n0.a(parcel, PendingIntent.CREATOR);
        n0.c(parcel);
        t(status, pendingIntent);
        return true;
    }
}
