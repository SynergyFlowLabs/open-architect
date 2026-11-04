package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class y1 extends n0 implements a2 {
    y1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.a2
    public final void j() throws RemoteException {
        p(2, k());
    }
}
