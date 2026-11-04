package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY})
public interface b extends IInterface {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f9782z = "android$support$v4$os$IResultReceiver2".replace('$', '.');

    public static class a implements b {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.os.b
        public void j0(int i10, Bundle bundle) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.os.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0021b extends Binder implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f9783a = 1;

        /* JADX INFO: renamed from: android.support.v4.os.b$b$a */
        private static class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f9784a;

            a(IBinder iBinder) {
                this.f9784a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9784a;
            }

            public String i() {
                return b.f9782z;
            }

            @Override // android.support.v4.os.b
            public void j0(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9782z);
                    parcelObtain.writeInt(i10);
                    c.d(parcelObtain, bundle, 0);
                    this.f9784a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0021b() {
            attachInterface(this, b.f9782z);
        }

        public static b i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f9782z);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = b.f9782z;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            j0(parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
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

    void j0(int i10, Bundle bundle) throws RemoteException;
}
