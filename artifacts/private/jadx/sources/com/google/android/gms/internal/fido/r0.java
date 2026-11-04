package com.google.android.gms.internal.fido;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface r0 extends IInterface {
    void g0(Status status) throws RemoteException;

    void ub(List list) throws RemoteException;
}
