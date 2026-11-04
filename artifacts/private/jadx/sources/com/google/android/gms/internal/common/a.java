package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f107958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f107959b;

    protected a(IBinder iBinder, String str) {
        this.f107958a = iBinder;
        this.f107959b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f107958a;
    }

    protected final Parcel i(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f107958a.transact(i10, parcel, parcelObtain, 0);
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

    protected final void k(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f107958a.transact(1, parcel, parcelObtain, 0);
            parcelObtain.readException();
            parcel.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcel.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    protected final void n(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f107958a.transact(2, parcel, null, 1);
            parcel.recycle();
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }

    protected final Parcel p() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f107959b);
        return parcelObtain;
    }
}
