package com.google.vr.vrcore.logging.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.vr.sdk.deps.b0;
import com.google.vr.sdk.deps.c1;

/* JADX INFO: loaded from: classes5.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.google.vr.vrcore.logging.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1425a extends b0 implements a {

        /* JADX INFO: renamed from: com.google.vr.vrcore.logging.api.a$a$a, reason: collision with other inner class name */
        public static class C1426a extends com.google.vr.sdk.deps.a implements a {
            C1426a(IBinder iBinder) {
                super(iBinder, "com.google.vr.vrcore.logging.api.IVrCoreLoggingService");
            }

            @Override // com.google.vr.vrcore.logging.api.a
            public void o6(VREventParcelable vREventParcelable) throws RemoteException {
                Parcel parcelI = i();
                c1.c(parcelI, vREventParcelable);
                p(2, parcelI);
            }
        }

        public static a p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.logging.api.IVrCoreLoggingService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C1426a(iBinder);
        }
    }

    void o6(VREventParcelable vREventParcelable) throws RemoteException;
}
