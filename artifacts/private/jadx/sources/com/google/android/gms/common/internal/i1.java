package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i1 extends com.google.android.gms.internal.common.r implements q {
    public i1() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.r
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) com.google.android.gms.internal.common.s.a(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.s.b(parcel);
            xa(i12, strongBinder, bundle);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            Bundle bundle2 = (Bundle) com.google.android.gms.internal.common.s.a(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.s.b(parcel);
            v6(i13, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) com.google.android.gms.internal.common.s.a(parcel, zzk.CREATOR);
            com.google.android.gms.internal.common.s.b(parcel);
            w8(i14, strongBinder2, zzkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
