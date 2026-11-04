package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

/* JADX INFO: loaded from: classes4.dex */
public final class h1 extends a implements IInterface {
    h1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(g1 g1Var, RegisterRequestParams registerRequestParams) throws RemoteException {
        Parcel parcelI = i();
        int i10 = n0.f108028b;
        parcelI.writeStrongBinder(g1Var);
        n0.d(parcelI, registerRequestParams);
        k(1, parcelI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(g1 g1Var, SignRequestParams signRequestParams) throws RemoteException {
        Parcel parcelI = i();
        int i10 = n0.f108028b;
        parcelI.writeStrongBinder(g1Var);
        n0.d(parcelI, signRequestParams);
        k(2, parcelI);
    }
}
