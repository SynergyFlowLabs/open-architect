package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f5 extends com.google.android.gms.internal.measurement.o0 implements g5 {
    public f5() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.o0
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzoh.CREATOR);
        com.google.android.gms.internal.measurement.p0.f(parcel);
        Ib(arrayListCreateTypedArrayList);
        return true;
    }
}
