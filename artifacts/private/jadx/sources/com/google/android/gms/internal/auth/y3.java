package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* JADX INFO: loaded from: classes4.dex */
public interface y3 extends IInterface {
    @fj.h
    Bundle E6(Account account) throws RemoteException;

    AccountChangeEventsResponse Hc(AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException;

    Bundle K7(String str) throws RemoteException;

    Bundle sb(String str, Bundle bundle) throws RemoteException;

    @fj.h
    Bundle vc(Account account, String str, Bundle bundle) throws RemoteException;
}
