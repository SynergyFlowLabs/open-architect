package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s extends x implements t {
    public s() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.x
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                Status status = (Status) v0.a(parcel, Status.CREATOR);
                v0.b(parcel);
                V6(status);
                return true;
            case 2:
                Status status2 = (Status) v0.a(parcel, Status.CREATOR);
                zzw zzwVar = (zzw) v0.a(parcel, zzw.CREATOR);
                v0.b(parcel);
                g6(status2, zzwVar);
                return true;
            case 3:
                Status status3 = (Status) v0.a(parcel, Status.CREATOR);
                zzo zzoVar = (zzo) v0.a(parcel, zzo.CREATOR);
                v0.b(parcel);
                x8(status3, zzoVar);
                return true;
            case 4:
                j();
                return true;
            case 5:
                Status status4 = (Status) v0.a(parcel, Status.CREATOR);
                v0.b(parcel);
                z5(status4);
                return true;
            case 6:
                byte[] bArrCreateByteArray = parcel.createByteArray();
                v0.b(parcel);
                ma(bArrCreateByteArray);
                return true;
            case 7:
                DeviceMetaData deviceMetaData = (DeviceMetaData) v0.a(parcel, DeviceMetaData.CREATOR);
                v0.b(parcel);
                b2(deviceMetaData);
                return true;
            default:
                return false;
        }
    }
}
