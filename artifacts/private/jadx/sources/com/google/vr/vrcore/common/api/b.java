package com.google.vr.vrcore.common.api;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.vr.sdk.deps.b0;
import com.google.vr.sdk.deps.c1;

/* JADX INFO: loaded from: classes5.dex */
public interface b extends IInterface {

    public static abstract class a extends b0 implements b {

        /* JADX INFO: renamed from: com.google.vr.vrcore.common.api.b$a$a, reason: collision with other inner class name */
        public static class C1413a extends com.google.vr.sdk.deps.a implements b {
            C1413a(IBinder iBinder) {
                super(iBinder, "com.google.vr.vrcore.common.api.IDaydreamManager");
            }

            @Override // com.google.vr.vrcore.common.api.b
            public boolean B7(PendingIntent pendingIntent, ComponentName componentName) throws RemoteException {
                Parcel parcelI = i();
                c1.c(parcelI, pendingIntent);
                c1.c(parcelI, componentName);
                Parcel parcelK = k(7, parcelI);
                boolean zE = c1.e(parcelK);
                parcelK.recycle();
                return zE;
            }

            @Override // com.google.vr.vrcore.common.api.b
            public void Ha(PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelI = i();
                c1.c(parcelI, pendingIntent);
                p(5, parcelI);
            }

            @Override // com.google.vr.vrcore.common.api.b
            public boolean Ke(PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelI = i();
                c1.c(parcelI, pendingIntent);
                Parcel parcelK = k(10, parcelI);
                boolean zE = c1.e(parcelK);
                parcelK.recycle();
                return zE;
            }

            @Override // com.google.vr.vrcore.common.api.b
            public boolean Pe() throws RemoteException {
                Parcel parcelK = k(8, i());
                boolean zE = c1.e(parcelK);
                parcelK.recycle();
                return zE;
            }

            @Override // com.google.vr.vrcore.common.api.b
            public void S9() throws RemoteException {
                p(14, i());
            }

            @Override // com.google.vr.vrcore.common.api.b
            public int Uc(Bundle bundle, HeadTrackingState headTrackingState) throws RemoteException {
                Parcel parcelI = i();
                c1.c(parcelI, bundle);
                Parcel parcelK = k(16, parcelI);
                int i10 = parcelK.readInt();
                if (parcelK.readInt() != 0) {
                    headTrackingState.f(parcelK);
                }
                parcelK.recycle();
                return i10;
            }

            @Override // com.google.vr.vrcore.common.api.b
            public void Z6(byte[] bArr) throws RemoteException {
                Parcel parcelI = i();
                parcelI.writeByteArray(bArr);
                p(11, parcelI);
            }

            @Override // com.google.vr.vrcore.common.api.b
            public boolean hf(c cVar) throws RemoteException {
                Parcel parcelI = i();
                c1.b(parcelI, cVar);
                Parcel parcelK = k(9, parcelI);
                boolean zE = c1.e(parcelK);
                parcelK.recycle();
                return zE;
            }

            @Override // com.google.vr.vrcore.common.api.b
            public int ja(ComponentName componentName, int i10, PendingIntent pendingIntent, HeadTrackingState headTrackingState) throws RemoteException {
                Parcel parcelI = i();
                c1.c(parcelI, componentName);
                parcelI.writeInt(i10);
                c1.c(parcelI, pendingIntent);
                Parcel parcelK = k(13, parcelI);
                int i11 = parcelK.readInt();
                if (parcelK.readInt() != 0) {
                    headTrackingState.f(parcelK);
                }
                parcelK.recycle();
                return i11;
            }

            @Override // com.google.vr.vrcore.common.api.b
            public void k3() throws RemoteException {
                p(12, i());
            }

            @Override // com.google.vr.vrcore.common.api.b
            public boolean mb(ComponentName componentName) throws RemoteException {
                Parcel parcelI = i();
                c1.c(parcelI, componentName);
                Parcel parcelK = k(2, parcelI);
                boolean zE = c1.e(parcelK);
                parcelK.recycle();
                return zE;
            }

            @Override // com.google.vr.vrcore.common.api.b
            public boolean o3(Bundle bundle) throws RemoteException {
                Parcel parcelI = i();
                c1.c(parcelI, bundle);
                Parcel parcelK = k(17, parcelI);
                boolean zE = c1.e(parcelK);
                parcelK.recycle();
                return zE;
            }

            @Override // com.google.vr.vrcore.common.api.b
            public boolean p5(ComponentName componentName, com.google.vr.vrcore.common.api.a aVar) throws RemoteException {
                Parcel parcelI = i();
                c1.c(parcelI, componentName);
                c1.b(parcelI, aVar);
                Parcel parcelK = k(1, parcelI);
                boolean zE = c1.e(parcelK);
                parcelK.recycle();
                return zE;
            }

            @Override // com.google.vr.vrcore.common.api.b
            public int y5(ComponentName componentName, HeadTrackingState headTrackingState) throws RemoteException {
                Parcel parcelI = i();
                c1.c(parcelI, componentName);
                Parcel parcelK = k(3, parcelI);
                int i10 = parcelK.readInt();
                if (parcelK.readInt() != 0) {
                    headTrackingState.f(parcelK);
                }
                parcelK.recycle();
                return i10;
            }

            @Override // com.google.vr.vrcore.common.api.b
            public void z8() throws RemoteException {
                p(6, i());
            }
        }

        public static b p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IDaydreamManager");
            return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new C1413a(iBinder);
        }
    }

    boolean B7(PendingIntent pendingIntent, ComponentName componentName) throws RemoteException;

    void Ha(PendingIntent pendingIntent) throws RemoteException;

    boolean Ke(PendingIntent pendingIntent) throws RemoteException;

    boolean Pe() throws RemoteException;

    void S9() throws RemoteException;

    int Uc(Bundle bundle, HeadTrackingState headTrackingState) throws RemoteException;

    void Z6(byte[] bArr) throws RemoteException;

    boolean hf(c cVar) throws RemoteException;

    int ja(ComponentName componentName, int i10, PendingIntent pendingIntent, HeadTrackingState headTrackingState) throws RemoteException;

    void k3() throws RemoteException;

    boolean mb(ComponentName componentName) throws RemoteException;

    boolean o3(Bundle bundle) throws RemoteException;

    boolean p5(ComponentName componentName, com.google.vr.vrcore.common.api.a aVar) throws RemoteException;

    int y5(ComponentName componentName, HeadTrackingState headTrackingState) throws RemoteException;

    void z8() throws RemoteException;
}
