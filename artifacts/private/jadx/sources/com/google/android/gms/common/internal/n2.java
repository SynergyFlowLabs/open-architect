package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class n2 extends com.google.android.gms.internal.common.a implements p {
    n2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.p
    public final void cancel() throws RemoteException {
        n(2, p());
    }
}
