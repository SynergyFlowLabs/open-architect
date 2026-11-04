package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends com.google.android.gms.internal.base.b implements e {
    public d() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.b
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 3:
                com.google.android.gms.internal.base.c.b(parcel);
                break;
            case 4:
                com.google.android.gms.internal.base.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                com.google.android.gms.internal.base.c.b(parcel);
                break;
            case 7:
                com.google.android.gms.internal.base.c.b(parcel);
                break;
            case 8:
                zak zakVar = (zak) com.google.android.gms.internal.base.c.a(parcel, zak.CREATOR);
                com.google.android.gms.internal.base.c.b(parcel);
                v9(zakVar);
                break;
            case 9:
                com.google.android.gms.internal.base.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
