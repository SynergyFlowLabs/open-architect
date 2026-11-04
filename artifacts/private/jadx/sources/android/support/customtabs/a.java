package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f9242p = "android.support.customtabs.ICustomTabsCallback";

    /* JADX INFO: renamed from: android.support.customtabs.a$a, reason: collision with other inner class name */
    public static class C0004a implements a {
        @Override // android.support.customtabs.a
        public void N7(int i10, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.a
        public Bundle R2(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.a
        public void af(Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.a
        public void ef(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.a
        public void fb(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.a
        public void l1(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.a
        public void o7(int i10, int i11, Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f9243a = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f9244b = 3;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f9245c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f9246d = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f9247e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f9248f = 7;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f9249g = 8;

        /* JADX INFO: renamed from: android.support.customtabs.a$b$a, reason: collision with other inner class name */
        private static class C0005a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f9250a;

            C0005a(IBinder iBinder) {
                this.f9250a = iBinder;
            }

            @Override // android.support.customtabs.a
            public void N7(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f9242p);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    this.f9250a.transact(2, parcelObtain, null, 1);
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.customtabs.a
            public Bundle R2(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f9242p);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f9250a.transact(7, parcelObtain, parcelObtain2, 0);
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

            @Override // android.support.customtabs.a
            public void af(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f9242p);
                    c.d(parcelObtain, bundle, 0);
                    int i10 = 0 << 4;
                    this.f9250a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9250a;
            }

            @Override // android.support.customtabs.a
            public void ef(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f9242p);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, uri, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    c.d(parcelObtain, bundle, 0);
                    int i11 = 2 << 6;
                    this.f9250a.transact(6, parcelObtain, null, 1);
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.customtabs.a
            public void fb(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f9242p);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    int i10 = 4 | 0;
                    this.f9250a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String i() {
                return a.f9242p;
            }

            @Override // android.support.customtabs.a
            public void l1(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f9242p);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f9250a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.customtabs.a
            public void o7(int i10, int i11, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f9242p);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    c.d(parcelObtain, bundle, 0);
                    this.f9250a.transact(8, parcelObtain, null, 1);
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }
        }

        public b() {
            attachInterface(this, a.f9242p);
        }

        public static a i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f9242p);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0005a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(a.f9242p);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(a.f9242p);
                return true;
            }
            switch (i10) {
                case 2:
                    N7(parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    break;
                case 3:
                    fb(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    break;
                case 4:
                    af((Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 5:
                    l1(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 6:
                    ef(parcel.readInt(), (Uri) c.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) c.c(parcel, Bundle.CREATOR));
                    break;
                case 7:
                    Bundle bundleR2 = R2(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    c.d(parcel2, bundleR2, 1);
                    break;
                case 8:
                    o7(parcel.readInt(), parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                    break;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
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

    void N7(int i10, Bundle bundle) throws RemoteException;

    Bundle R2(String str, Bundle bundle) throws RemoteException;

    void af(Bundle bundle) throws RemoteException;

    void ef(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException;

    void fb(String str, Bundle bundle) throws RemoteException;

    void l1(String str, Bundle bundle) throws RemoteException;

    void o7(int i10, int i11, Bundle bundle) throws RemoteException;
}
