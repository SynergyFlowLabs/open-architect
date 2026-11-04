package com.google.vr.vrcore.controller.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.vr.sdk.deps.b0;
import com.google.vr.sdk.deps.c1;

/* JADX INFO: loaded from: classes5.dex */
public interface h extends IInterface {

    public static abstract class a extends b0 implements h {

        /* JADX INFO: renamed from: com.google.vr.vrcore.controller.api.h$a$a, reason: collision with other inner class name */
        public static class C1416a extends com.google.vr.sdk.deps.a implements h {
            C1416a(IBinder iBinder) {
                super(iBinder, "com.google.vr.vrcore.controller.api.IControllerService");
            }

            @Override // com.google.vr.vrcore.controller.api.h
            public void F8(int i10, ControllerRequest controllerRequest) throws RemoteException {
                Parcel parcelI = i();
                parcelI.writeInt(i10);
                c1.c(parcelI, controllerRequest);
                n(11, parcelI);
            }

            @Override // com.google.vr.vrcore.controller.api.h
            public boolean W5(String str) throws RemoteException {
                Parcel parcelI = i();
                parcelI.writeString(str);
                Parcel parcelK = k(6, parcelI);
                boolean zE = c1.e(parcelK);
                parcelK.recycle();
                return zE;
            }

            @Override // com.google.vr.vrcore.controller.api.h
            public boolean Wc(i iVar) throws RemoteException {
                Parcel parcelI = i();
                c1.b(parcelI, iVar);
                Parcel parcelK = k(8, parcelI);
                boolean zE = c1.e(parcelK);
                parcelK.recycle();
                return zE;
            }

            @Override // com.google.vr.vrcore.controller.api.h
            public boolean c9(int i10, String str, g gVar) throws RemoteException {
                Parcel parcelI = i();
                parcelI.writeInt(i10);
                parcelI.writeString(str);
                c1.b(parcelI, gVar);
                Parcel parcelK = k(5, parcelI);
                boolean zE = c1.e(parcelK);
                parcelK.recycle();
                return zE;
            }

            @Override // com.google.vr.vrcore.controller.api.h
            public int db() throws RemoteException {
                Parcel parcelK = k(10, i());
                int i10 = parcelK.readInt();
                parcelK.recycle();
                return i10;
            }

            @Override // com.google.vr.vrcore.controller.api.h
            public int f0(int i10) throws RemoteException {
                Parcel parcelI = i();
                parcelI.writeInt(i10);
                Parcel parcelK = k(1, parcelI);
                int i11 = parcelK.readInt();
                parcelK.recycle();
                return i11;
            }

            @Override // com.google.vr.vrcore.controller.api.h
            public boolean v3(i iVar) throws RemoteException {
                Parcel parcelI = i();
                c1.b(parcelI, iVar);
                Parcel parcelK = k(9, parcelI);
                boolean zE = c1.e(parcelK);
                parcelK.recycle();
                return zE;
            }
        }

        public static h p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.controller.api.IControllerService");
            return iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new C1416a(iBinder);
        }
    }

    void F8(int i10, ControllerRequest controllerRequest) throws RemoteException;

    boolean W5(String str) throws RemoteException;

    boolean Wc(i iVar) throws RemoteException;

    boolean c9(int i10, String str, g gVar) throws RemoteException;

    int db() throws RemoteException;

    int f0(int i10) throws RemoteException;

    boolean v3(i iVar) throws RemoteException;
}
