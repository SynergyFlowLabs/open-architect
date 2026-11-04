package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f9251q = "android.support.customtabs.ICustomTabsService";

    public static class a implements b {
        @Override // android.support.customtabs.b
        public boolean K5(android.support.customtabs.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public Bundle N9(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.b
        public boolean S6(long j10) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean Xa(android.support.customtabs.a aVar, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean ab(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.b
        public boolean f2(android.support.customtabs.a aVar, int i10, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean o4(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean s2(android.support.customtabs.a aVar, Uri uri, int i10, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public int s7(android.support.customtabs.a aVar, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.b
        public boolean y7(android.support.customtabs.a aVar) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean ze(android.support.customtabs.a aVar, Uri uri) throws RemoteException {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.support.customtabs.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0006b extends Binder implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f9252a = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f9253b = 3;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f9254c = 10;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f9255d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f9256e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f9257f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f9258g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f9259h = 11;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f9260i = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f9261j = 9;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f9262k = 12;

        /* JADX INFO: renamed from: android.support.customtabs.b$b$a */
        private static class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f9263a;

            a(IBinder iBinder) {
                this.f9263a = iBinder;
            }

            @Override // android.support.customtabs.b
            public boolean K5(android.support.customtabs.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9251q);
                    parcelObtain.writeStrongInterface(aVar);
                    c.d(parcelObtain, uri, 0);
                    c.d(parcelObtain, bundle, 0);
                    parcelObtain.writeTypedList(list);
                    this.f9263a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    boolean z10 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    return z10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public Bundle N9(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9251q);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f9263a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) c.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean S6(long j10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9251q);
                    parcelObtain.writeLong(j10);
                    this.f9263a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    boolean z10 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z10;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.customtabs.b
            public boolean Xa(android.support.customtabs.a aVar, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9251q);
                    parcelObtain.writeStrongInterface(aVar);
                    c.d(parcelObtain, uri, 0);
                    c.d(parcelObtain, bundle, 0);
                    this.f9263a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean ab(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9251q);
                    parcelObtain.writeStrongInterface(aVar);
                    c.d(parcelObtain, bundle, 0);
                    this.f9263a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    boolean z10 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z10;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9263a;
            }

            @Override // android.support.customtabs.b
            public boolean f2(android.support.customtabs.a aVar, int i10, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9251q);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, uri, 0);
                    c.d(parcelObtain, bundle, 0);
                    this.f9263a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    boolean z10 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    return z10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String i() {
                return b.f9251q;
            }

            @Override // android.support.customtabs.b
            public boolean o4(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9251q);
                    parcelObtain.writeStrongInterface(aVar);
                    c.d(parcelObtain, bundle, 0);
                    this.f9263a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    boolean z10 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    return z10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean s2(android.support.customtabs.a aVar, Uri uri, int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9251q);
                    parcelObtain.writeStrongInterface(aVar);
                    c.d(parcelObtain, uri, 0);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    this.f9263a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    boolean z10 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z10;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.customtabs.b
            public int s7(android.support.customtabs.a aVar, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9251q);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f9263a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i10 = parcelObtain2.readInt();
                    parcelObtain2.recycle();
                    return i10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.b
            public boolean y7(android.support.customtabs.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9251q);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f9263a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    boolean z10 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z10;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.customtabs.b
            public boolean ze(android.support.customtabs.a aVar, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9251q);
                    parcelObtain.writeStrongInterface(aVar);
                    c.d(parcelObtain, uri, 0);
                    this.f9263a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    boolean z10 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    return z10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0006b() {
            attachInterface(this, b.f9251q);
        }

        public static b i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f9251q);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(b.f9251q);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(b.f9251q);
                return true;
            }
            switch (i10) {
                case 2:
                    boolean zS6 = S6(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zS6 ? 1 : 0);
                    return true;
                case 3:
                    boolean zY7 = y7(android.support.customtabs.a.b.i(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zY7 ? 1 : 0);
                    return true;
                case 4:
                    android.support.customtabs.a aVarI = android.support.customtabs.a.b.i(parcel.readStrongBinder());
                    Uri uri = (Uri) c.c(parcel, Uri.CREATOR);
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean zK5 = K5(aVarI, uri, (Bundle) c.c(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(zK5 ? 1 : 0);
                    return true;
                case 5:
                    Bundle bundleN9 = N9(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    c.d(parcel2, bundleN9, 1);
                    return true;
                case 6:
                    boolean zO4 = o4(android.support.customtabs.a.b.i(parcel.readStrongBinder()), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zO4 ? 1 : 0);
                    return true;
                case 7:
                    boolean zZe = ze(android.support.customtabs.a.b.i(parcel.readStrongBinder()), (Uri) c.c(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zZe ? 1 : 0);
                    return true;
                case 8:
                    int iS7 = s7(android.support.customtabs.a.b.i(parcel.readStrongBinder()), parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iS7);
                    return true;
                case 9:
                    boolean zF2 = f2(android.support.customtabs.a.b.i(parcel.readStrongBinder()), parcel.readInt(), (Uri) c.c(parcel, Uri.CREATOR), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zF2 ? 1 : 0);
                    return true;
                case 10:
                    boolean zAb = ab(android.support.customtabs.a.b.i(parcel.readStrongBinder()), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zAb ? 1 : 0);
                    return true;
                case 11:
                    boolean zXa = Xa(android.support.customtabs.a.b.i(parcel.readStrongBinder()), (Uri) c.c(parcel, Uri.CREATOR), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zXa ? 1 : 0);
                    return true;
                case 12:
                    boolean zS2 = s2(android.support.customtabs.a.b.i(parcel.readStrongBinder()), (Uri) c.c(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zS2 ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
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

    boolean K5(android.support.customtabs.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    Bundle N9(String str, Bundle bundle) throws RemoteException;

    boolean S6(long j10) throws RemoteException;

    boolean Xa(android.support.customtabs.a aVar, Uri uri, Bundle bundle) throws RemoteException;

    boolean ab(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException;

    boolean f2(android.support.customtabs.a aVar, int i10, Uri uri, Bundle bundle) throws RemoteException;

    boolean o4(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException;

    boolean s2(android.support.customtabs.a aVar, Uri uri, int i10, Bundle bundle) throws RemoteException;

    int s7(android.support.customtabs.a aVar, String str, Bundle bundle) throws RemoteException;

    boolean y7(android.support.customtabs.a aVar) throws RemoteException;

    boolean ze(android.support.customtabs.a aVar, Uri uri) throws RemoteException;
}
