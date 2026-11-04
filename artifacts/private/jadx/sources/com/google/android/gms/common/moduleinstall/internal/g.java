package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* JADX INFO: loaded from: classes4.dex */
public interface g extends IInterface {
    void Fd(Status status, @p0 ModuleAvailabilityResponse moduleAvailabilityResponse) throws RemoteException;

    void N2(Status status, @p0 ModuleInstallIntentResponse moduleInstallIntentResponse) throws RemoteException;

    void d8(Status status) throws RemoteException;

    void i7(Status status, @p0 ModuleInstallResponse moduleInstallResponse) throws RemoteException;
}
