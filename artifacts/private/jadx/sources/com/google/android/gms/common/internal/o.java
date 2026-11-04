package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public interface o extends IInterface {

    public static abstract class a extends com.google.android.gms.internal.common.r implements o {
        public a() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @NonNull
        public static o k(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof o ? (o) iInterfaceQueryLocalInterface : new m2(iBinder);
        }

        @Override // com.google.android.gms.internal.common.r
        protected final boolean i(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 2) {
                return false;
            }
            Account accountG = g();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.s.d(parcel2, accountG);
            return true;
        }
    }

    @NonNull
    Account g() throws RemoteException;
}
