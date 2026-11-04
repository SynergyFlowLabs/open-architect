package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public class r implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f109293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f109294b;

    protected r(IBinder iBinder, String str) {
        this.f109293a = iBinder;
        this.f109294b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f109293a;
    }

    protected final Parcel i() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f109294b);
        return parcelObtain;
    }

    protected final Parcel k(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f109293a.transact(i10, parcel, parcelObtain, 0);
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

    protected final void n(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f109293a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
            parcel.recycle();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void p(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f109293a.transact(i10, parcel, null, 1);
            parcel.recycle();
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }
}
