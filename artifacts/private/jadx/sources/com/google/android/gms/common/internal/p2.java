package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p2 extends com.google.android.gms.internal.common.r implements q2 {
    public p2() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static q2 k(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof q2 ? (q2) iInterfaceQueryLocalInterface : new o2(iBinder);
    }

    @Override // com.google.android.gms.internal.common.r
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            com.google.android.gms.dynamic.d dVarM = m();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.s.e(parcel2, dVarM);
        } else {
            if (i10 != 2) {
                return false;
            }
            int iH = h();
            parcel2.writeNoException();
            parcel2.writeInt(iH);
        }
        return true;
    }
}
