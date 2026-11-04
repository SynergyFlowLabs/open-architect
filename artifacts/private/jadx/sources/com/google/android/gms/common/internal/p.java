package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public interface p extends IInterface {

    public static abstract class a extends com.google.android.gms.internal.common.r implements p {
        public a() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        @NonNull
        public static p k(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return iInterfaceQueryLocalInterface instanceof p ? (p) iInterfaceQueryLocalInterface : new n2(iBinder);
        }

        @Override // com.google.android.gms.internal.common.r
        protected final boolean i(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 2) {
                return false;
            }
            cancel();
            return true;
        }
    }

    void cancel() throws RemoteException;
}
