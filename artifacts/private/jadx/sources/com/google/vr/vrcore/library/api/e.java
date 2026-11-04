package com.google.vr.vrcore.library.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.vr.sdk.deps.b0;

/* JADX INFO: loaded from: classes5.dex */
public interface e extends IInterface {

    public static abstract class a extends b0 implements e {

        /* JADX INFO: renamed from: com.google.vr.vrcore.library.api.e$a$a, reason: collision with other inner class name */
        public static class C1424a extends com.google.vr.sdk.deps.a implements e {
            C1424a(IBinder iBinder) {
                super(iBinder, "com.google.vr.vrcore.library.api.IVrNativeLibraryLoader");
            }

            @Override // com.google.vr.vrcore.library.api.e
            public long J2() throws RemoteException {
                Parcel parcelK = k(4, i());
                long j10 = parcelK.readLong();
                parcelK.recycle();
                return j10;
            }

            @Override // com.google.vr.vrcore.library.api.e
            public long Se(int i10, int i11, int i12) throws RemoteException {
                Parcel parcelI = i();
                parcelI.writeInt(i10);
                parcelI.writeInt(i11);
                parcelI.writeInt(i12);
                Parcel parcelK = k(2, parcelI);
                long j10 = parcelK.readLong();
                parcelK.recycle();
                return j10;
            }

            @Override // com.google.vr.vrcore.library.api.e
            public long zd(String str, String str2) throws RemoteException {
                Parcel parcelI = i();
                parcelI.writeString(str);
                parcelI.writeString(str2);
                Parcel parcelK = k(5, parcelI);
                long j10 = parcelK.readLong();
                parcelK.recycle();
                return j10;
            }
        }

        public static e p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IVrNativeLibraryLoader");
            return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new C1424a(iBinder);
        }
    }

    long J2() throws RemoteException;

    long Se(int i10, int i11, int i12) throws RemoteException;

    long zd(String str, String str2) throws RemoteException;
}
