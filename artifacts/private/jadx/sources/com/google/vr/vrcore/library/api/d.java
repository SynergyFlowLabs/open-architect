package com.google.vr.vrcore.library.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.vr.sdk.deps.b0;
import com.google.vr.sdk.deps.c1;

/* JADX INFO: loaded from: classes5.dex */
public interface d extends IInterface {

    public static abstract class a extends b0 implements d {

        /* JADX INFO: renamed from: com.google.vr.vrcore.library.api.d$a$a, reason: collision with other inner class name */
        public static class C1423a extends com.google.vr.sdk.deps.a implements d {
            C1423a(IBinder iBinder) {
                super(iBinder, "com.google.vr.vrcore.library.api.IVrCreator");
            }

            @Override // com.google.vr.vrcore.library.api.d
            public com.google.vr.vrcore.library.api.a Vb(c cVar, c cVar2) throws RemoteException {
                Parcel parcelI = i();
                c1.b(parcelI, cVar);
                c1.b(parcelI, cVar2);
                int i10 = 5 ^ 5;
                Parcel parcelK = k(5, parcelI);
                com.google.vr.vrcore.library.api.a aVarP = com.google.vr.vrcore.library.api.a.AbstractBinderC1419a.p(parcelK.readStrongBinder());
                parcelK.recycle();
                return aVarP;
            }

            @Override // com.google.vr.vrcore.library.api.d
            public e cd(c cVar, c cVar2) throws RemoteException {
                Parcel parcelI = i();
                c1.b(parcelI, cVar);
                c1.b(parcelI, cVar2);
                Parcel parcelK = k(4, parcelI);
                e eVarP = e.a.p(parcelK.readStrongBinder());
                parcelK.recycle();
                return eVarP;
            }
        }

        public static d p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IVrCreator");
            return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new C1423a(iBinder);
        }
    }

    com.google.vr.vrcore.library.api.a Vb(c cVar, c cVar2) throws RemoteException;

    e cd(c cVar, c cVar2) throws RemoteException;
}
