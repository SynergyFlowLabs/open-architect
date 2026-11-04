package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public interface u extends IInterface {
    void Y6(Status status) throws RemoteException;

    void t7(Status status) throws RemoteException;

    void va(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException;
}
