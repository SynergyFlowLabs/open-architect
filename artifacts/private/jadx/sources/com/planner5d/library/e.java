package com.planner5d.library;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.planner5d.library.services.backgroundexecutor.BackgroundExecutorThrowableContainer;

/* JADX INFO: loaded from: classes.dex */
public interface e extends IInterface {

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public static final String f160556r2 = "com.planner5d.library.IBackgroundExecutorCommunicationCrashCallback";

    public static class a implements e {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.planner5d.library.e
        public void ed(BackgroundExecutorThrowableContainer crash) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f160557a = 1;

        private static class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f160558a;

            a(IBinder remote) {
                this.f160558a = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f160558a;
            }

            @Override // com.planner5d.library.e
            public void ed(BackgroundExecutorThrowableContainer crash) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e.f160556r2);
                    c.d(parcelObtain, crash, 0);
                    this.f160558a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String i() {
                return e.f160556r2;
            }
        }

        public b() {
            attachInterface(this, e.f160556r2);
        }

        public static e i(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(e.f160556r2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) ? new a(obj) : (e) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code >= 1 && code <= 16777215) {
                data.enforceInterface(e.f160556r2);
            }
            if (code == 1598968902) {
                reply.writeString(e.f160556r2);
                return true;
            }
            if (code != 1) {
                return super.onTransact(code, data, reply, flags);
            }
            ed((BackgroundExecutorThrowableContainer) c.c(data, BackgroundExecutorThrowableContainer.CREATOR));
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

    void ed(BackgroundExecutorThrowableContainer crash) throws RemoteException;
}
