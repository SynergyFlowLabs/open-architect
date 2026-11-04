package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public interface e0 extends IInterface {

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final String f74800f1 = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    public static class a implements e0 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.e0
        public void p2(String[] strArr) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f74801a = 1;

        private static class a implements e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f74802a;

            a(IBinder iBinder) {
                this.f74802a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f74802a;
            }

            public String i() {
                return e0.f74800f1;
            }

            @Override // androidx.room.e0
            public void p2(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(e0.f74800f1);
                    parcelObtain.writeStringArray(strArr);
                    int i10 = 7 >> 1;
                    this.f74802a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, e0.f74800f1);
        }

        public static e0 i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(e0.f74800f1);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e0)) ? new a(iBinder) : (e0) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = e0.f74800f1;
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
            p2(parcel.createStringArray());
            return true;
        }
    }

    void p2(String[] strArr) throws RemoteException;
}
