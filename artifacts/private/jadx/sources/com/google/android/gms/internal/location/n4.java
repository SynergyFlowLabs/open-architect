package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n4 extends b0 implements o4 {
    public n4() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.location.b0
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            String[] strArrCreateStringArray = parcel.createStringArray();
            c1.d(parcel);
            vf(i12, strArrCreateStringArray);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            String[] strArrCreateStringArray2 = parcel.createStringArray();
            c1.d(parcel);
            f9(i13, strArrCreateStringArray2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            PendingIntent pendingIntent = (PendingIntent) c1.a(parcel, PendingIntent.CREATOR);
            c1.d(parcel);
            J4(i14, pendingIntent);
        }
        return true;
    }
}
