package com.facebook.ppml.receiver;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.facebook.ppml.receiver.a$a, reason: collision with other inner class name */
    public static class C0916a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.facebook.ppml.receiver.a
        public int e9(Bundle eventsBundle) throws RemoteException {
            return 0;
        }
    }

    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f101738a = "com.facebook.ppml.receiver.IReceiverService";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f101739b = 1;

        /* JADX INFO: renamed from: com.facebook.ppml.receiver.a$b$a, reason: collision with other inner class name */
        private static class C0917a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static a f101740b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f101741a;

            C0917a(IBinder remote) {
                this.f101741a = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f101741a;
            }

            @Override // com.facebook.ppml.receiver.a
            public int e9(Bundle eventsBundle) throws RemoteException {
                int iE9;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f101738a);
                    if (eventsBundle != null) {
                        parcelObtain.writeInt(1);
                        eventsBundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f101741a.transact(1, parcelObtain, parcelObtain2, 0) || b.k() == null) {
                        parcelObtain2.readException();
                        iE9 = parcelObtain2.readInt();
                    } else {
                        iE9 = b.k().e9(eventsBundle);
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return iE9;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            public String i() {
                return b.f101738a;
            }
        }

        public b() {
            attachInterface(this, f101738a);
        }

        public static a i(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(f101738a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0917a(obj) : (a) iInterfaceQueryLocalInterface;
        }

        public static a k() {
            return C0917a.f101740b;
        }

        public static boolean n(a impl) {
            if (C0917a.f101740b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            C0917a.f101740b = impl;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code != 1) {
                if (code != 1598968902) {
                    return super.onTransact(code, data, reply, flags);
                }
                reply.writeString(f101738a);
                return true;
            }
            data.enforceInterface(f101738a);
            int iE9 = e9(data.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(data) : null);
            reply.writeNoException();
            reply.writeInt(iE9);
            return true;
        }
    }

    int e9(Bundle eventsBundle) throws RemoteException;
}
