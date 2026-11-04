package com.planner5d.library;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.planner5d.library.services.backgroundexecutor.BackgroundExecutorMessageContainer;

/* JADX INFO: loaded from: classes.dex */
public interface d extends IInterface {

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public static final String f154014q2 = "com.planner5d.library.IBackgroundExecutorCommunicationCallback";

    public static class a implements d {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.planner5d.library.d
        public void w1(BackgroundExecutorMessageContainer message) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f154015a = 1;

        private static class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f154016a;

            a(IBinder remote) {
                this.f154016a = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f154016a;
            }

            public String i() {
                return d.f154014q2;
            }

            @Override // com.planner5d.library.d
            public void w1(BackgroundExecutorMessageContainer message) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.f154014q2);
                    c.d(parcelObtain, message, 0);
                    this.f154016a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, d.f154014q2);
        }

        public static d i(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(d.f154014q2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new a(obj) : (d) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code >= 1 && code <= 16777215) {
                data.enforceInterface(d.f154014q2);
            }
            if (code == 1598968902) {
                reply.writeString(d.f154014q2);
                return true;
            }
            if (code != 1) {
                return super.onTransact(code, data, reply, flags);
            }
            w1((BackgroundExecutorMessageContainer) c.c(data, BackgroundExecutorMessageContainer.CREATOR));
            reply.writeNoException();
            return true;
        }
    }

    public static class c {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> c10) {
            if (parcel.readInt() != 0) {
                return c10.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T value, int parcelableFlags) {
            if (value == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                value.writeToParcel(parcel, parcelableFlags);
            }
        }
    }

    void w1(BackgroundExecutorMessageContainer message) throws RemoteException;
}
