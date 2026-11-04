package com.google.android.play.core.review.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.review.internal.f
    public final void sf(String str, Bundle bundle, h hVar) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeString(str);
        int i10 = c.f114946a;
        parcelI.writeInt(1);
        bundle.writeToParcel(parcelI, 0);
        parcelI.writeStrongBinder(hVar);
        int i11 = 6 << 2;
        k(2, parcelI);
    }
}
