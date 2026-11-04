package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
public interface b extends IInterface {

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final String f77394k1 = "androidx$work$multiprocess$IWorkManagerImpl".replace('$', '.');

    public static class a implements b {
        @Override // androidx.work.multiprocess.b
        public void I4(String name, byte[] request, c callback) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.b
        public void bb(String id2, c callback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void e2(String name, c callback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void i9(byte[] request, c callback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void k5(byte[] request, c callback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void r5(byte[] request, c callback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void r9(c callback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void s8(String tag, c callback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void ud(byte[] request, c callback) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.b
        public void ye(byte[] request, c callback) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: androidx.work.multiprocess.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0793b extends Binder implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f77395a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f77396b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f77397c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f77398d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f77399e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f77400f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f77401g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f77402h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f77403i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f77404j = 10;

        /* JADX INFO: renamed from: androidx.work.multiprocess.b$b$a */
        private static class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f77405a;

            a(IBinder remote) {
                this.f77405a = remote;
            }

            @Override // androidx.work.multiprocess.b
            public void I4(String name, byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f77394k1);
                    parcelObtain.writeString(name);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongInterface(callback);
                    this.f77405a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f77405a;
            }

            @Override // androidx.work.multiprocess.b
            public void bb(String id2, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f77394k1);
                    parcelObtain.writeString(id2);
                    parcelObtain.writeStrongInterface(callback);
                    this.f77405a.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.b
            public void e2(String name, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f77394k1);
                    parcelObtain.writeString(name);
                    parcelObtain.writeStrongInterface(callback);
                    this.f77405a.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String i() {
                return b.f77394k1;
            }

            @Override // androidx.work.multiprocess.b
            public void i9(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f77394k1);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongInterface(callback);
                    this.f77405a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.b
            public void k5(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f77394k1);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongInterface(callback);
                    this.f77405a.transact(9, parcelObtain, null, 1);
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.work.multiprocess.b
            public void r5(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f77394k1);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongInterface(callback);
                    int i10 = 6 & 3;
                    this.f77405a.transact(3, parcelObtain, null, 1);
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.work.multiprocess.b
            public void r9(c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f77394k1);
                    parcelObtain.writeStrongInterface(callback);
                    this.f77405a.transact(7, parcelObtain, null, 1);
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // androidx.work.multiprocess.b
            public void s8(String tag, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f77394k1);
                    parcelObtain.writeString(tag);
                    parcelObtain.writeStrongInterface(callback);
                    this.f77405a.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.b
            public void ud(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f77394k1);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongInterface(callback);
                    this.f77405a.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.b
            public void ye(byte[] request, c callback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f77394k1);
                    parcelObtain.writeByteArray(request);
                    parcelObtain.writeStrongInterface(callback);
                    this.f77405a.transact(10, parcelObtain, null, 1);
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }
        }

        public AbstractBinderC0793b() {
            attachInterface(this, b.f77394k1);
        }

        public static b i(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(b.f77394k1);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(obj) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            String str = b.f77394k1;
            if (code >= 1 && code <= 16777215) {
                data.enforceInterface(str);
            }
            if (code == 1598968902) {
                reply.writeString(str);
                return true;
            }
            switch (code) {
                case 1:
                    i9(data.createByteArray(), c.b.i(data.readStrongBinder()));
                    return true;
                case 2:
                    I4(data.readString(), data.createByteArray(), c.b.i(data.readStrongBinder()));
                    return true;
                case 3:
                    r5(data.createByteArray(), c.b.i(data.readStrongBinder()));
                    return true;
                case 4:
                    bb(data.readString(), c.b.i(data.readStrongBinder()));
                    return true;
                case 5:
                    s8(data.readString(), c.b.i(data.readStrongBinder()));
                    return true;
                case 6:
                    e2(data.readString(), c.b.i(data.readStrongBinder()));
                    return true;
                case 7:
                    r9(c.b.i(data.readStrongBinder()));
                    return true;
                case 8:
                    ud(data.createByteArray(), c.b.i(data.readStrongBinder()));
                    return true;
                case 9:
                    k5(data.createByteArray(), c.b.i(data.readStrongBinder()));
                    return true;
                case 10:
                    ye(data.createByteArray(), c.b.i(data.readStrongBinder()));
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void I4(String name, byte[] request, c callback) throws RemoteException;

    void bb(String id2, c callback) throws RemoteException;

    void e2(String name, c callback) throws RemoteException;

    void i9(byte[] request, c callback) throws RemoteException;

    void k5(byte[] request, c callback) throws RemoteException;

    void r5(byte[] request, c callback) throws RemoteException;

    void r9(c callback) throws RemoteException;

    void s8(String tag, c callback) throws RemoteException;

    void ud(byte[] request, c callback) throws RemoteException;

    void ye(byte[] request, c callback) throws RemoteException;
}
