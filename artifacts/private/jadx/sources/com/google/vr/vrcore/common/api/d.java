package com.google.vr.vrcore.common.api;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.vr.sdk.deps.b0;
import com.google.vr.sdk.deps.c1;

/* JADX INFO: loaded from: classes5.dex */
public interface d extends IInterface {

    public static abstract class a extends b0 implements d {

        /* JADX INFO: renamed from: com.google.vr.vrcore.common.api.d$a$a, reason: collision with other inner class name */
        public static class C1415a extends com.google.vr.sdk.deps.a implements d {
            C1415a(IBinder iBinder) {
                super(iBinder, "com.google.vr.vrcore.common.api.IVrCoreSdkService");
            }

            @Override // com.google.vr.vrcore.common.api.d
            public com.google.vr.vrcore.logging.api.a H7() throws RemoteException {
                Parcel parcelK = k(4, i());
                com.google.vr.vrcore.logging.api.a aVarP = com.google.vr.vrcore.logging.api.a.AbstractBinderC1425a.p(parcelK.readStrongBinder());
                parcelK.recycle();
                return aVarP;
            }

            @Override // com.google.vr.vrcore.common.api.d
            public boolean f0(int i10) throws RemoteException {
                Parcel parcelI = i();
                parcelI.writeInt(i10);
                boolean z10 = false | true;
                Parcel parcelK = k(1, parcelI);
                boolean zE = c1.e(parcelK);
                parcelK.recycle();
                return zE;
            }

            @Override // com.google.vr.vrcore.common.api.d
            public b h9() throws RemoteException {
                Parcel parcelK = k(2, i());
                b bVarP = b.a.p(parcelK.readStrongBinder());
                parcelK.recycle();
                return bVarP;
            }

            @Override // com.google.vr.vrcore.common.api.d
            public boolean q6(ComponentName componentName, Bundle bundle) throws RemoteException {
                Parcel parcelI = i();
                c1.c(parcelI, componentName);
                c1.c(parcelI, bundle);
                int i10 = 4 & 3;
                Parcel parcelK = k(3, parcelI);
                boolean zE = c1.e(parcelK);
                parcelK.recycle();
                return zE;
            }
        }

        public static d p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IVrCoreSdkService");
            return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new C1415a(iBinder);
        }
    }

    com.google.vr.vrcore.logging.api.a H7() throws RemoteException;

    boolean f0(int i10) throws RemoteException;

    b h9() throws RemoteException;

    boolean q6(ComponentName componentName, Bundle bundle) throws RemoteException;
}
