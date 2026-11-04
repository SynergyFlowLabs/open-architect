package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface c extends IInterface {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f9264r = "android.support.customtabs.IPostMessageService";

    public static class a implements c {
        @Override // android.support.customtabs.c
        public void Ad(android.support.customtabs.a aVar, String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.c
        public void h3(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f9265a = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f9266b = 3;

        private static class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f9267a;

            a(IBinder iBinder) {
                this.f9267a = iBinder;
            }

            @Override // android.support.customtabs.c
            public void Ad(android.support.customtabs.a aVar, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f9264r);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    C0007c.d(parcelObtain, bundle, 0);
                    this.f9267a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9267a;
            }

            @Override // android.support.customtabs.c
            public void h3(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.f9264r);
                    parcelObtain.writeStrongInterface(aVar);
                    C0007c.d(parcelObtain, bundle, 0);
                    this.f9267a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            public String i() {
                return c.f9264r;
            }
        }

        public b() {
            attachInterface(this, c.f9264r);
        }

        public static c i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.f9264r);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(c.f9264r);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(c.f9264r);
                return true;
            }
            if (i10 == 2) {
                h3(android.support.customtabs.a.b.i(parcel.readStrongBinder()), (Bundle) C0007c.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                Ad(android.support.customtabs.a.b.i(parcel.readStrongBinder()), parcel.readString(), (Bundle) C0007c.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: android.support.customtabs.c$c, reason: collision with other inner class name */
    public static class C0007c {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    void Ad(android.support.customtabs.a aVar, String str, Bundle bundle) throws RemoteException;

    void h3(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException;
}
