package com.google.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface e extends IInterface {

    public static abstract class a extends Binder implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f115018a = "com.android.vending.licensing.ILicenseResultListener";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f115019b = 1;

        /* JADX INFO: renamed from: com.google.android.vending.licensing.e$a$a, reason: collision with other inner class name */
        private static class C1006a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f115020a;

            C1006a(IBinder iBinder) {
                this.f115020a = iBinder;
            }

            @Override // com.google.android.vending.licensing.e
            public void a5(int i10, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f115018a);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f115020a.transact(1, parcelObtain, null, 1);
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f115020a;
            }

            public String i() {
                return a.f115018a;
            }
        }

        public a() {
            attachInterface(this, f115018a);
        }

        public static e i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f115018a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) ? new C1006a(iBinder) : (e) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(f115018a);
                a5(parcel.readInt(), parcel.readString(), parcel.readString());
                return true;
            }
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString(f115018a);
            return true;
        }
    }

    void a5(int i10, String str, String str2) throws RemoteException;
}
