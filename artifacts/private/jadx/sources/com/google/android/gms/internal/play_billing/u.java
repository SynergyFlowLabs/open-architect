package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends r implements w {
    u(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.w
    public final void y9(String str, String str2, y yVar) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeString(str);
        parcelI.writeString(str2);
        int i10 = t.f109331a;
        parcelI.writeStrongBinder(yVar);
        p(1, parcelI);
    }
}
