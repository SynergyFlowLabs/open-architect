package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
public interface c extends IInterface {

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final String f77406l1 = "androidx$work$multiprocess$IWorkManagerImplCallback".replace('$', '.');

    public static class a implements c {
        @Override // androidx.work.multiprocess.c
        public void W7(byte[] response) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.c
        public void sd(String error) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f77407a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f77408b = 2;

        private static class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f77409a;

            a(IBinder remote) {
                this.f77409a = remote;
            }

            @Override // androidx.work.multiprocess.c
            public void W7(byte[] response) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f77406l1);
                    parcelObtain.writeByteArray(response);
                    this.f77409a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f77409a;
            }

            public String i() {
                return c.f77406l1;
            }

            @Override // androidx.work.multiprocess.c
            public void sd(String error) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f77406l1);
                    parcelObtain.writeString(error);
                    int i10 = 5 | 2;
                    this.f77409a.transact(2, parcelObtain, null, 1);
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }
        }

        public b() {
            attachInterface(this, c.f77406l1);
        }

        public static c i(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(c.f77406l1);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new a(obj) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            String str = c.f77406l1;
            if (code >= 1 && code <= 16777215) {
                data.enforceInterface(str);
            }
            if (code == 1598968902) {
                reply.writeString(str);
                return true;
            }
            if (code == 1) {
                W7(data.createByteArray());
            } else {
                if (code != 2) {
                    return super.onTransact(code, data, reply, flags);
                }
                sd(data.readString());
            }
            return true;
        }
    }

    void W7(byte[] response) throws RemoteException;

    void sd(String error) throws RemoteException;
}
