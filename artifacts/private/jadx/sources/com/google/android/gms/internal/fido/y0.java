package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends a implements IInterface {
    y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(r0 r0Var, String str) throws RemoteException {
        Parcel parcelI = i();
        int i10 = n0.f108028b;
        parcelI.writeStrongBinder(r0Var);
        parcelI.writeString(str);
        k(4, parcelI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(x0 x0Var, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) throws RemoteException {
        Parcel parcelI = i();
        int i10 = n0.f108028b;
        parcelI.writeStrongBinder(x0Var);
        n0.d(parcelI, browserPublicKeyCredentialCreationOptions);
        k(1, parcelI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(x0 x0Var, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) throws RemoteException {
        Parcel parcelI = i();
        int i10 = n0.f108028b;
        parcelI.writeStrongBinder(x0Var);
        n0.d(parcelI, browserPublicKeyCredentialRequestOptions);
        k(2, parcelI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(p0 p0Var) throws RemoteException {
        Parcel parcelI = i();
        int i10 = n0.f108028b;
        parcelI.writeStrongBinder(p0Var);
        k(3, parcelI);
    }
}
