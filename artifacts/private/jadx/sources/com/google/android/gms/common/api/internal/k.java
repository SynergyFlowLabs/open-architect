package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public interface k extends IInterface {

    public static abstract class a extends com.google.android.gms.internal.base.b implements k {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @NonNull
        public static k s(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new c2(iBinder);
        }

        @Override // com.google.android.gms.internal.base.b
        protected final boolean p(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1) {
                return false;
            }
            Status status = (Status) com.google.android.gms.internal.base.c.a(parcel, Status.CREATOR);
            com.google.android.gms.internal.base.c.b(parcel);
            s6(status);
            return true;
        }
    }

    void s6(@NonNull Status status) throws RemoteException;
}
