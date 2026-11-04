package com.google.android.gms.cloudmessaging;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
interface b extends IInterface {
    public static final String L1 = "com.google.android.gms.iid.IMessengerCompat";
    public static final int M1 = 1;

    public static class a extends Binder implements b {
        @Override // android.os.IInterface
        @NonNull
        public IBinder asBinder() {
            throw null;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, @NonNull Parcel parcel, @p0 Parcel parcel2, int i11) throws RemoteException {
            throw null;
        }

        @Override // com.google.android.gms.cloudmessaging.b
        public void zc(@NonNull Message message) throws RemoteException {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.cloudmessaging.b$b, reason: collision with other inner class name */
    public static class C0964b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IBinder f105758a;

        C0964b(@NonNull IBinder iBinder) {
            this.f105758a = iBinder;
        }

        @Override // android.os.IInterface
        @NonNull
        public IBinder asBinder() {
            return this.f105758a;
        }

        @Override // com.google.android.gms.cloudmessaging.b
        public void zc(@NonNull Message message) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(b.L1);
            parcelObtain.writeInt(1);
            message.writeToParcel(parcelObtain, 0);
            try {
                this.f105758a.transact(1, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        }
    }

    void zc(@NonNull Message message) throws RemoteException;
}
