package com.planner5d.library;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.planner5d.library.services.backgroundexecutor.BackgroundExecutorMessageContainer;

/* JADX INFO: loaded from: classes.dex */
public interface c extends IInterface {

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public static final String f148357o2 = "com.planner5d.library.IBackgroundExecutorCommunication";

    public static class a implements c {
        @Override // com.planner5d.library.c
        public long D2() throws RemoteException {
            return 0L;
        }

        @Override // com.planner5d.library.c
        public void E2(BackgroundExecutorMessageContainer message) throws RemoteException {
        }

        @Override // com.planner5d.library.c
        public void S3(d callback) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.planner5d.library.c
        public void sa(e callback) throws RemoteException {
        }

        @Override // com.planner5d.library.c
        public void uf(BackgroundExecutorMessageContainer message) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f148358a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f148359b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f148360c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f148361d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f148362e = 5;

        private static class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f148363a;

            a(IBinder remote) {
                this.f148363a = remote;
            }

            @Override // com.planner5d.library.c
            public long D2() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f148357o2);
                    this.f148363a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    long j10 = parcelObtain2.readLong();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return j10;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // com.planner5d.library.c
            public void E2(BackgroundExecutorMessageContainer message) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f148357o2);
                    C1516c.d(parcelObtain, message, 0);
                    this.f148363a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.planner5d.library.c
            public void S3(d callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f148357o2);
                    parcelObtain.writeStrongInterface(callback);
                    this.f148363a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f148363a;
            }

            public String i() {
                return c.f148357o2;
            }

            @Override // com.planner5d.library.c
            public void sa(e callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f148357o2);
                    parcelObtain.writeStrongInterface(callback);
                    this.f148363a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // com.planner5d.library.c
            public void uf(BackgroundExecutorMessageContainer message) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f148357o2);
                    C1516c.d(parcelObtain, message, 0);
                    this.f148363a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, c.f148357o2);
        }

        public static c i(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(c.f148357o2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new a(obj) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code >= 1 && code <= 16777215) {
                data.enforceInterface(c.f148357o2);
            }
            if (code == 1598968902) {
                reply.writeString(c.f148357o2);
                return true;
            }
            if (code == 1) {
                E2((BackgroundExecutorMessageContainer) C1516c.c(data, BackgroundExecutorMessageContainer.CREATOR));
                reply.writeNoException();
            } else if (code == 2) {
                S3(d.b.i(data.readStrongBinder()));
                reply.writeNoException();
            } else if (code == 3) {
                sa(e.b.i(data.readStrongBinder()));
                reply.writeNoException();
            } else if (code == 4) {
                uf((BackgroundExecutorMessageContainer) C1516c.c(data, BackgroundExecutorMessageContainer.CREATOR));
                reply.writeNoException();
            } else {
                if (code != 5) {
                    return super.onTransact(code, data, reply, flags);
                }
                long jD2 = D2();
                reply.writeNoException();
                reply.writeLong(jD2);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.c$c, reason: collision with other inner class name */
    public static class C1516c {
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

    long D2() throws RemoteException;

    void E2(BackgroundExecutorMessageContainer message) throws RemoteException;

    void S3(d callback) throws RemoteException;

    void sa(e callback) throws RemoteException;

    void uf(BackgroundExecutorMessageContainer message) throws RemoteException;
}
