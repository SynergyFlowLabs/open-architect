package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public interface a extends IInterface {
    public static final String N = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

    /* JADX INFO: renamed from: androidx.core.app.unusedapprestrictions.a$a, reason: collision with other inner class name */
    public static class C0376a implements a {
        @Override // androidx.core.app.unusedapprestrictions.a
        public void Ab(boolean z10, boolean z11) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f47186a = 1;

        /* JADX INFO: renamed from: androidx.core.app.unusedapprestrictions.a$b$a, reason: collision with other inner class name */
        private static class C0377a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f47187a;

            C0377a(IBinder iBinder) {
                this.f47187a = iBinder;
            }

            @Override // androidx.core.app.unusedapprestrictions.a
            public void Ab(boolean z10, boolean z11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.N);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    this.f47187a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f47187a;
            }

            public String i() {
                return a.N;
            }
        }

        public b() {
            attachInterface(this, a.N);
        }

        public static a i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.N);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0377a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = a.N;
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
            Ab(parcel.readInt() != 0, parcel.readInt() != 0);
            return true;
        }
    }

    void Ab(boolean z10, boolean z11) throws RemoteException;
}
