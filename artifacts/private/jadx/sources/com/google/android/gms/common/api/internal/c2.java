package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class c2 extends com.google.android.gms.internal.base.a implements k {
    c2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // com.google.android.gms.common.api.internal.k
    public final void s6(Status status) throws RemoteException {
        throw null;
    }
}
