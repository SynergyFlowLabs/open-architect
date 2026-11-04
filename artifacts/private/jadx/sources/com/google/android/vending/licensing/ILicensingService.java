package com.google.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface ILicensingService extends IInterface {

    public static abstract class a extends Binder implements ILicensingService {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f114982a = "com.android.vending.licensing.ILicensingService";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f114983b = 1;

        /* JADX INFO: renamed from: com.google.android.vending.licensing.ILicensingService$a$a, reason: collision with other inner class name */
        private static class C1005a implements ILicensingService {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f114984a;

            C1005a(IBinder iBinder) {
                this.f114984a = iBinder;
            }

            @Override // com.google.android.vending.licensing.ILicensingService
            public void R6(long j10, String str, e eVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f114982a);
                    parcelObtain.writeLong(j10);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.f114984a.transact(1, parcelObtain, null, 1);
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f114984a;
            }

            public String i() {
                return a.f114982a;
            }
        }

        public a() {
            attachInterface(this, f114982a);
        }

        public static ILicensingService i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f114982a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ILicensingService)) ? new C1005a(iBinder) : (ILicensingService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(f114982a);
                R6(parcel.readLong(), parcel.readString(), e.a.i(parcel.readStrongBinder()));
                return true;
            }
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString(f114982a);
            return true;
        }
    }

    void R6(long j10, String str, e eVar) throws RemoteException;
}
