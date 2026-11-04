package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends com.google.android.gms.internal.base.a implements IInterface {
    j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void s(TelemetryData telemetryData) throws RemoteException {
        Parcel parcelI = i();
        com.google.android.gms.internal.base.c.c(parcelI, telemetryData);
        p(1, parcelI);
    }
}
