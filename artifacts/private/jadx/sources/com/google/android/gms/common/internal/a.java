package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class a extends o.a {
    @androidx.annotation.p0
    @g6.a
    public static Account n(@NonNull o oVar) {
        if (oVar != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Account accountG = oVar.g();
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                return accountG;
            } catch (RemoteException unused) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th2;
            }
        }
        return null;
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.o
    @NonNull
    public final Account g() {
        throw null;
    }
}
