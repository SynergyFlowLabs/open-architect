package com.google.android.gms.internal.p001authapiphone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f107468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f107469b = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    protected a(IBinder iBinder, String str) {
        this.f107468a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f107468a;
    }

    protected final Parcel i() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f107469b);
        return parcelObtain;
    }

    protected final void k(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f107468a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
            parcel.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcel.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }
}
