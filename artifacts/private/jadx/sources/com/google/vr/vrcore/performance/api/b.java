package com.google.vr.vrcore.performance.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.vr.sdk.deps.b0;

/* JADX INFO: loaded from: classes5.dex */
public interface b extends IInterface {

    public static abstract class a extends b0 implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f130073b = "com.google.vr.vrcore.performance.api.IThrottlingTriggerCallback";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f130074c = 1;

        /* JADX INFO: renamed from: com.google.vr.vrcore.performance.api.b$a$a, reason: collision with other inner class name */
        public static class C1429a extends com.google.vr.sdk.deps.a implements b {
            C1429a(IBinder iBinder) {
                super(iBinder, a.f130073b);
            }

            @Override // com.google.vr.vrcore.performance.api.b
            public void T3(float f10, long j10) throws RemoteException {
                Parcel parcelI = i();
                parcelI.writeFloat(f10);
                parcelI.writeLong(j10);
                p(1, parcelI);
            }
        }

        public a() {
            super(f130073b);
        }

        public static b p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f130073b);
            return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new C1429a(iBinder);
        }

        @Override // com.google.vr.sdk.deps.b0
        protected boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1) {
                return false;
            }
            T3(parcel.readFloat(), parcel.readLong());
            return true;
        }
    }

    void T3(float f10, long j10) throws RemoteException;
}
