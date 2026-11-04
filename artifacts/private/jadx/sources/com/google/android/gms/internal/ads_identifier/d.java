package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.google.android.gms.internal.ads_identifier.f
    public final String h() throws RemoteException {
        Parcel parcelK = k(1, i());
        String string = parcelK.readString();
        parcelK.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads_identifier.f
    public final boolean m() throws RemoteException {
        Parcel parcelK = k(6, i());
        boolean zA = c.a(parcelK);
        parcelK.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads_identifier.f
    public final boolean q2(boolean z10) throws RemoteException {
        Parcel parcelI = i();
        int i10 = c.f107464a;
        int i11 = 7 >> 1;
        parcelI.writeInt(1);
        Parcel parcelK = k(2, parcelI);
        boolean zA = c.a(parcelK);
        parcelK.recycle();
        return zA;
    }
}
