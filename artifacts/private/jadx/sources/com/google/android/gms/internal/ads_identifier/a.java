package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f107462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f107463b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected a(IBinder iBinder, String str) {
        this.f107462a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f107462a;
    }

    protected final Parcel i() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f107463b);
        return parcelObtain;
    }

    protected final Parcel k(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f107462a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }
}
