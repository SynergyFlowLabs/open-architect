package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends a implements IInterface {
    d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(c1 c1Var, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) throws RemoteException {
        Parcel parcelI = i();
        int i10 = n0.f108028b;
        parcelI.writeStrongBinder(c1Var);
        n0.d(parcelI, publicKeyCredentialCreationOptions);
        k(1, parcelI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(c1 c1Var, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) throws RemoteException {
        Parcel parcelI = i();
        int i10 = n0.f108028b;
        parcelI.writeStrongBinder(c1Var);
        n0.d(parcelI, publicKeyCredentialRequestOptions);
        k(2, parcelI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(p0 p0Var) throws RemoteException {
        Parcel parcelI = i();
        int i10 = n0.f108028b;
        parcelI.writeStrongBinder(p0Var);
        k(3, parcelI);
    }
}
