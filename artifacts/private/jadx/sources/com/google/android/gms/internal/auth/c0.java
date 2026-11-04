package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c0 extends x implements d0 {
    public c0() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.x
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            ProxyResponse proxyResponse = (ProxyResponse) v0.a(parcel, ProxyResponse.CREATOR);
            v0.b(parcel);
            P8(proxyResponse);
        } else {
            if (i10 != 2) {
                return false;
            }
            String string = parcel.readString();
            v0.b(parcel);
            v5(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
