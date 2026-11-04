package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f114817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f114818b = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    protected a(IBinder iBinder, String str) {
        this.f114817a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f114817a;
    }

    protected final Parcel i() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f114818b);
        return parcelObtain;
    }

    protected final void k(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f114817a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
