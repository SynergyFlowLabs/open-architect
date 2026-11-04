package com.google.vr.sdk.deps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f127686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f127687b;

    protected a(IBinder iBinder, String str) {
        this.f127686a = iBinder;
        this.f127687b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f127686a;
    }

    protected Parcel i() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f127687b);
        return parcelObtain;
    }

    protected Parcel k(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f127686a.transact(i10, parcel, parcelObtain, 0);
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

    protected void n(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f127686a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
            parcel.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcel.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    protected void p(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f127686a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
