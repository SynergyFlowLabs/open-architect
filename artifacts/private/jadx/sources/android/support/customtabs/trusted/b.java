package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f9271x = "android.support.customtabs.trusted.ITrustedWebActivityService";

    public static class a implements b {
        @Override // android.support.customtabs.trusted.b
        public Bundle Ac() throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.trusted.b
        public int Id() throws RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle Oa() throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle Od(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle Y9(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.trusted.b
        public void be(Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle j4(Bundle bundle) throws RemoteException {
            return null;
        }
    }

    /* JADX INFO: renamed from: android.support.customtabs.trusted.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0010b extends Binder implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f9272a = 6;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f9273b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f9274c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f9275d = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f9276e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f9277f = 7;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f9278g = 9;

        /* JADX INFO: renamed from: android.support.customtabs.trusted.b$b$a */
        private static class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f9279a;

            a(IBinder iBinder) {
                this.f9279a = iBinder;
            }

            @Override // android.support.customtabs.trusted.b
            public Bundle Ac() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9271x);
                    this.f9279a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    Bundle bundle = (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                    parcelObtain2.recycle();
                    return bundle;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.b
            public int Id() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9271x);
                    this.f9279a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i10 = parcelObtain2.readInt();
                    parcelObtain2.recycle();
                    return i10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.b
            public Bundle Oa() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9271x);
                    this.f9279a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    Bundle bundle = (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return bundle;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.customtabs.trusted.b
            public Bundle Od(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9271x);
                    c.d(parcelObtain, bundle, 0);
                    this.f9279a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    Bundle bundle2 = (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return bundle2;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.customtabs.trusted.b
            public Bundle Y9(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9271x);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f9279a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9279a;
            }

            @Override // android.support.customtabs.trusted.b
            public void be(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9271x);
                    c.d(parcelObtain, bundle, 0);
                    this.f9279a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String i() {
                return b.f9271x;
            }

            @Override // android.support.customtabs.trusted.b
            public Bundle j4(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9271x);
                    c.d(parcelObtain, bundle, 0);
                    this.f9279a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    Bundle bundle2 = (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                    parcelObtain2.recycle();
                    return bundle2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0010b() {
            attachInterface(this, b.f9271x);
        }

        public static b i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f9271x);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(b.f9271x);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(b.f9271x);
                return true;
            }
            switch (i10) {
                case 2:
                    Bundle bundleJ4 = j4((Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    c.d(parcel2, bundleJ4, 1);
                    break;
                case 3:
                    be((Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 4:
                    int iId = Id();
                    parcel2.writeNoException();
                    parcel2.writeInt(iId);
                    break;
                case 5:
                    Bundle bundleAc = Ac();
                    parcel2.writeNoException();
                    c.d(parcel2, bundleAc, 1);
                    break;
                case 6:
                    Bundle bundleOd = Od((Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    c.d(parcel2, bundleOd, 1);
                    break;
                case 7:
                    Bundle bundleOa = Oa();
                    parcel2.writeNoException();
                    c.d(parcel2, bundleOa, 1);
                    break;
                case 8:
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
                case 9:
                    Bundle bundleY9 = Y9(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    c.d(parcel2, bundleY9, 1);
                    break;
            }
            return true;
        }
    }

    public static class c {
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

    Bundle Ac() throws RemoteException;

    int Id() throws RemoteException;

    Bundle Oa() throws RemoteException;

    Bundle Od(Bundle bundle) throws RemoteException;

    Bundle Y9(String str, Bundle bundle, IBinder iBinder) throws RemoteException;

    void be(Bundle bundle) throws RemoteException;

    Bundle j4(Bundle bundle) throws RemoteException;
}
