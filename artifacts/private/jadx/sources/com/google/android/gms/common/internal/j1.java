package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
final class j1 implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f106581a;

    j1(IBinder iBinder) {
        this.f106581a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f106581a;
    }

    @Override // com.google.android.gms.common.internal.r
    public final void c6(q qVar, @androidx.annotation.p0 GetServiceRequest getServiceRequest) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(qVar != null ? qVar.asBinder() : null);
            if (getServiceRequest != null) {
                parcelObtain.writeInt(1);
                e2.a(getServiceRequest, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f106581a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }
}
