package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f108000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f108001b;

    protected a(IBinder iBinder, String str) {
        this.f108000a = iBinder;
        this.f108001b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f108000a;
    }

    protected final Parcel i() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f108001b);
        return parcelObtain;
    }

    protected final void k(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f108000a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
            parcel.recycle();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
