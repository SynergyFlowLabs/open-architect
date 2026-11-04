package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f9268u = "android.support.customtabs.trusted.ITrustedWebActivityCallback";

    /* JADX INFO: renamed from: android.support.customtabs.trusted.a$a, reason: collision with other inner class name */
    public static class C0008a implements a {
        @Override // android.support.customtabs.trusted.a
        public void Ye(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f9269a = 2;

        /* JADX INFO: renamed from: android.support.customtabs.trusted.a$b$a, reason: collision with other inner class name */
        private static class C0009a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f9270a;

            C0009a(IBinder iBinder) {
                this.f9270a = iBinder;
            }

            @Override // android.support.customtabs.trusted.a
            public void Ye(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f9268u);
                    parcelObtain.writeString(str);
                    c.d(parcelObtain, bundle, 0);
                    this.f9270a.transact(2, parcelObtain, parcelObtain2, 0);
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
                return this.f9270a;
            }

            public String i() {
                return a.f9268u;
            }
        }

        public b() {
            attachInterface(this, a.f9268u);
        }

        public static a i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f9268u);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0009a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(a.f9268u);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(a.f9268u);
                return true;
            }
            if (i10 != 2) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            Ye(parcel.readString(), (Bundle) c.c(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
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

    void Ye(String str, Bundle bundle) throws RemoteException;
}
