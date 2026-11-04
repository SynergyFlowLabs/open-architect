package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* JADX INFO: loaded from: classes4.dex */
public interface d0 extends IInterface {
    void P8(ProxyResponse proxyResponse) throws RemoteException;

    void v5(String str) throws RemoteException;
}
