package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends com.google.android.gms.internal.base.b implements j {
    public i() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // com.google.android.gms.internal.base.b
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        ModuleInstallStatusUpdate moduleInstallStatusUpdate = (ModuleInstallStatusUpdate) com.google.android.gms.internal.base.c.a(parcel, ModuleInstallStatusUpdate.CREATOR);
        com.google.android.gms.internal.base.c.b(parcel);
        Z7(moduleInstallStatusUpdate);
        return true;
    }
}
