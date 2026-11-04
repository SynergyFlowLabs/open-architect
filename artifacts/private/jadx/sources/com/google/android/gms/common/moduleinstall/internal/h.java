package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends com.google.android.gms.internal.base.a implements IInterface {
    h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void L(com.google.android.gms.common.api.internal.k kVar, j jVar) throws RemoteException {
        Parcel parcelI = i();
        com.google.android.gms.internal.base.c.d(parcelI, kVar);
        com.google.android.gms.internal.base.c.d(parcelI, jVar);
        n(6, parcelI);
    }

    public final void s(g gVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel parcelI = i();
        com.google.android.gms.internal.base.c.d(parcelI, gVar);
        com.google.android.gms.internal.base.c.c(parcelI, apiFeatureRequest);
        n(1, parcelI);
    }

    public final void u(g gVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel parcelI = i();
        com.google.android.gms.internal.base.c.d(parcelI, gVar);
        com.google.android.gms.internal.base.c.c(parcelI, apiFeatureRequest);
        n(3, parcelI);
    }

    public final void v(g gVar, ApiFeatureRequest apiFeatureRequest, j jVar) throws RemoteException {
        Parcel parcelI = i();
        com.google.android.gms.internal.base.c.d(parcelI, gVar);
        com.google.android.gms.internal.base.c.c(parcelI, apiFeatureRequest);
        com.google.android.gms.internal.base.c.d(parcelI, jVar);
        n(2, parcelI);
    }

    public final void w(com.google.android.gms.common.api.internal.k kVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel parcelI = i();
        com.google.android.gms.internal.base.c.d(parcelI, kVar);
        com.google.android.gms.internal.base.c.c(parcelI, apiFeatureRequest);
        n(4, parcelI);
    }
}
