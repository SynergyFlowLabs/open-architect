package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public interface b extends IInterface {
    public static final String O = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    public static class a implements b {
        @Override // androidx.core.app.unusedapprestrictions.b
        public void Zc(androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.unusedapprestrictions.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0378b extends Binder implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f47188a = 1;

        /* JADX INFO: renamed from: androidx.core.app.unusedapprestrictions.b$b$a */
        private static class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f47189a;

            a(IBinder iBinder) {
                this.f47189a = iBinder;
            }

            @Override // androidx.core.app.unusedapprestrictions.b
            public void Zc(androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.O);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f47189a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f47189a;
            }

            public String i() {
                return b.O;
            }
        }

        public AbstractBinderC0378b() {
            attachInterface(this, b.O);
        }

        public static b i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.O);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = b.O;
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
            Zc(androidx.core.app.unusedapprestrictions.a.b.i(parcel.readStrongBinder()));
            return true;
        }
    }

    void Zc(androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException;
}
