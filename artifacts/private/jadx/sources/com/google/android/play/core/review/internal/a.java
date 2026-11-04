package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f114944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f114945b = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    protected a(IBinder iBinder, String str) {
        this.f114944a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f114944a;
    }

    protected final Parcel i() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f114945b);
        return parcelObtain;
    }

    protected final void k(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f114944a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
