package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
public interface a extends IInterface {

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final String f77390j1 = "androidx$work$multiprocess$IListenableWorkerImpl".replace('$', '.');

    /* JADX INFO: renamed from: androidx.work.multiprocess.a$a, reason: collision with other inner class name */
    public static class C0791a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.a
        public void f3(byte[] request, c callback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.a
        public void v7(byte[] request, c callback) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f77391a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f77392b = 2;

        /* JADX INFO: renamed from: androidx.work.multiprocess.a$b$a, reason: collision with other inner class name */
        private static class C0792a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f77393a;

            C0792a(IBinder remote) {
                this.f77393a = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f77393a;
            }

            @Override // androidx.work.multiprocess.a
            public void f3(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f77390j1);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongInterface(callback);
                    this.f77393a.transact(1, parcelObtain, null, 1);
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            public String i() {
                return a.f77390j1;
            }

            @Override // androidx.work.multiprocess.a
            public void v7(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f77390j1);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongInterface(callback);
                    this.f77393a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, a.f77390j1);
        }

        public static a i(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(a.f77390j1);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0792a(obj) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            String str = a.f77390j1;
            if (code >= 1 && code <= 16777215) {
                data.enforceInterface(str);
            }
            if (code == 1598968902) {
                reply.writeString(str);
                return true;
            }
            if (code == 1) {
                f3(data.createByteArray(), c.b.i(data.readStrongBinder()));
            } else {
                if (code != 2) {
                    return super.onTransact(code, data, reply, flags);
                }
                v7(data.createByteArray(), c.b.i(data.readStrongBinder()));
            }
            return true;
        }
    }

    void f3(byte[] request, c callback) throws RemoteException;

    void v7(byte[] request, c callback) throws RemoteException;
}
