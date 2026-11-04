package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends com.google.android.gms.internal.p000authapi.a implements IInterface {
    v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void n(u uVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelI = i();
        com.google.android.gms.internal.p000authapi.x.d(parcelI, uVar);
        com.google.android.gms.internal.p000authapi.x.c(parcelI, googleSignInOptions);
        k(com.planner5d.library.engine.input.f.b.f160733u1, parcelI);
    }

    public final void p(u uVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelI = i();
        com.google.android.gms.internal.p000authapi.x.d(parcelI, uVar);
        com.google.android.gms.internal.p000authapi.x.c(parcelI, googleSignInOptions);
        k(102, parcelI);
    }

    public final void s(u uVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelI = i();
        com.google.android.gms.internal.p000authapi.x.d(parcelI, uVar);
        com.google.android.gms.internal.p000authapi.x.c(parcelI, googleSignInOptions);
        k(101, parcelI);
    }
}
