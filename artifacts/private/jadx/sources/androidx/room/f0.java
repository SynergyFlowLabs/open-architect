package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public interface f0 extends IInterface {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final String f74813g1 = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    public static class a implements f0 {
        @Override // androidx.room.f0
        public void Nb(int i10, String[] strArr) throws RemoteException {
        }

        @Override // androidx.room.f0
        public int Xc(e0 e0Var, String str) throws RemoteException {
            return 0;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.f0
        public void lf(e0 e0Var, int i10) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f74814a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f74815b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f74816c = 3;

        private static class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f74817a;

            a(IBinder iBinder) {
                this.f74817a = iBinder;
            }

            @Override // androidx.room.f0
            public void Nb(int i10, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(f0.f74813g1);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStringArray(strArr);
                    this.f74817a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.f0
            public int Xc(e0 e0Var, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(f0.f74813g1);
                    parcelObtain.writeStrongInterface(e0Var);
                    parcelObtain.writeString(str);
                    this.f74817a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i10 = parcelObtain2.readInt();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return i10;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f74817a;
            }

            public String i() {
                return f0.f74813g1;
            }

            @Override // androidx.room.f0
            public void lf(e0 e0Var, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(f0.f74813g1);
                    parcelObtain.writeStrongInterface(e0Var);
                    parcelObtain.writeInt(i10);
                    this.f74817a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }
        }

        public b() {
            attachInterface(this, f0.f74813g1);
        }

        public static f0 i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f0.f74813g1);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f0)) ? new a(iBinder) : (f0) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = f0.f74813g1;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                int iXc = Xc(e0.b.i(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iXc);
            } else if (i10 == 2) {
                lf(e0.b.i(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                Nb(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    void Nb(int i10, String[] strArr) throws RemoteException;

    int Xc(e0 e0Var, String str) throws RemoteException;

    void lf(e0 e0Var, int i10) throws RemoteException;
}
