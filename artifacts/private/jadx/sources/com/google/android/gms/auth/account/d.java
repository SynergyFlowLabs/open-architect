package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.v0;
import com.google.android.gms.internal.auth.x;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends x implements e {
    public d() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.x
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            int i12 = v0.f107852b;
            int i13 = parcel.readInt();
            v0.b(parcel);
            t3(i13 != 0);
        } else {
            Account account = (Account) v0.a(parcel, Account.CREATOR);
            v0.b(parcel);
            Q4(account);
        }
        return true;
    }
}
