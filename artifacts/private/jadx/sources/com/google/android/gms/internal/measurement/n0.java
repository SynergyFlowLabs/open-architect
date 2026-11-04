package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public class n0 implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f108692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f108693b;

    protected n0(IBinder iBinder, String str) {
        this.f108692a = iBinder;
        this.f108693b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f108692a;
    }

    protected final Parcel i(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f108692a.transact(i10, parcel, parcelObtain, 0);
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

    protected final Parcel k() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f108693b);
        return parcelObtain;
    }

    protected final void n(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f108692a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
            parcel.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcel.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    protected final void p(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f108692a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
