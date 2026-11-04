package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f extends com.google.android.gms.internal.base.b implements g {
    public f() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // com.google.android.gms.internal.base.b
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Status status = (Status) com.google.android.gms.internal.base.c.a(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) com.google.android.gms.internal.base.c.a(parcel, ModuleAvailabilityResponse.CREATOR);
            com.google.android.gms.internal.base.c.b(parcel);
            Fd(status, moduleAvailabilityResponse);
        } else if (i10 == 2) {
            Status status2 = (Status) com.google.android.gms.internal.base.c.a(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) com.google.android.gms.internal.base.c.a(parcel, ModuleInstallResponse.CREATOR);
            com.google.android.gms.internal.base.c.b(parcel);
            i7(status2, moduleInstallResponse);
        } else if (i10 == 3) {
            Status status3 = (Status) com.google.android.gms.internal.base.c.a(parcel, Status.CREATOR);
            ModuleInstallIntentResponse moduleInstallIntentResponse = (ModuleInstallIntentResponse) com.google.android.gms.internal.base.c.a(parcel, ModuleInstallIntentResponse.CREATOR);
            com.google.android.gms.internal.base.c.b(parcel);
            N2(status3, moduleInstallIntentResponse);
        } else {
            if (i10 != 4) {
                return false;
            }
            Status status4 = (Status) com.google.android.gms.internal.base.c.a(parcel, Status.CREATOR);
            com.google.android.gms.internal.base.c.b(parcel);
            d8(status4);
        }
        return true;
    }
}
