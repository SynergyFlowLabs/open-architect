package com.google.vr.vrcore.performance.api;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.vr.sdk.deps.b0;
import com.google.vr.sdk.deps.c1;

/* JADX INFO: loaded from: classes5.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.google.vr.vrcore.performance.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1427a extends b0 implements a {

        /* JADX INFO: renamed from: com.google.vr.vrcore.performance.api.a$a$a, reason: collision with other inner class name */
        public static class C1428a extends com.google.vr.sdk.deps.a implements a {
            C1428a(IBinder iBinder) {
                super(iBinder, "com.google.vr.vrcore.performance.api.IPerformanceService");
            }

            @Override // com.google.vr.vrcore.performance.api.a
            public long bf() throws RemoteException {
                Parcel parcelK = k(2, i());
                long j10 = parcelK.readLong();
                parcelK.recycle();
                return j10;
            }

            @Override // com.google.vr.vrcore.performance.api.a
            public void cc(TimestampedTemperature timestampedTemperature) throws RemoteException {
                Parcel parcelK = k(1, i());
                if (parcelK.readInt() != 0) {
                    timestampedTemperature.a(parcelK);
                }
                parcelK.recycle();
            }

            @Override // com.google.vr.vrcore.performance.api.a
            public void f4(ComponentName componentName) throws RemoteException {
                Parcel parcelI = i();
                c1.c(parcelI, componentName);
                n(4, parcelI);
            }

            @Override // com.google.vr.vrcore.performance.api.a
            public void jb(ComponentName componentName, b bVar, long j10, float f10, int i10) throws RemoteException {
                Parcel parcelI = i();
                c1.c(parcelI, componentName);
                c1.b(parcelI, bVar);
                parcelI.writeLong(j10);
                parcelI.writeFloat(f10);
                parcelI.writeInt(i10);
                n(3, parcelI);
            }
        }

        public static a p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.performance.api.IPerformanceService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C1428a(iBinder);
        }
    }

    long bf() throws RemoteException;

    void cc(TimestampedTemperature timestampedTemperature) throws RemoteException;

    void f4(ComponentName componentName) throws RemoteException;

    void jb(ComponentName componentName, b bVar, long j10, float f10, int i10) throws RemoteException;
}
