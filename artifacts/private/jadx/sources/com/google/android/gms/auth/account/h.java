package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface h extends IInterface {
    void E4(boolean z10) throws RemoteException;

    void Me(e eVar, String str) throws RemoteException;

    void Oe(e eVar, Account account) throws RemoteException;
}
