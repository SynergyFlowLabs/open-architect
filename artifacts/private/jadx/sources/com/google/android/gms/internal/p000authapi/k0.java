package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k0 extends w implements l0 {
    public k0() {
        super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.w
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) x.a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) x.a(parcel, PendingIntent.CREATOR);
        x.b(parcel);
        y0(status, pendingIntent);
        return true;
    }
}
