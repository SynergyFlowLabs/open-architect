package com.google.vr.vrcore.common.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.vr.sdk.deps.b0;
import com.google.vr.sdk.deps.c1;

/* JADX INFO: loaded from: classes5.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.google.vr.vrcore.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1411a extends b0 implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f129951b = "com.google.vr.vrcore.common.api.IDaydreamListener";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f129952c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f129953d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f129954e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f129955f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f129956g = 5;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f129957h = 6;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f129958i = 7;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f129959j = 8;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f129960k = 9;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f129961l = 10;

        /* JADX INFO: renamed from: com.google.vr.vrcore.common.api.a$a$a, reason: collision with other inner class name */
        public static class C1412a extends com.google.vr.sdk.deps.a implements a {
            C1412a(IBinder iBinder) {
                super(iBinder, AbstractBinderC1411a.f129951b);
            }

            @Override // com.google.vr.vrcore.common.api.a
            public void C9() throws RemoteException {
                p(4, i());
            }

            @Override // com.google.vr.vrcore.common.api.a
            public void F3(int i10, long j10) throws RemoteException {
                Parcel parcelI = i();
                parcelI.writeInt(i10);
                parcelI.writeLong(j10);
                p(3, parcelI);
            }

            @Override // com.google.vr.vrcore.common.api.a
            public int G8() throws RemoteException {
                Parcel parcelK = k(1, i());
                int i10 = parcelK.readInt();
                parcelK.recycle();
                return i10;
            }

            @Override // com.google.vr.vrcore.common.api.a
            public HeadTrackingState Ld() throws RemoteException {
                Parcel parcelK = k(2, i());
                HeadTrackingState headTrackingState = (HeadTrackingState) c1.a(parcelK, HeadTrackingState.CREATOR);
                parcelK.recycle();
                return headTrackingState;
            }

            @Override // com.google.vr.vrcore.common.api.a
            public void M7() throws RemoteException {
                p(5, i());
            }

            @Override // com.google.vr.vrcore.common.api.a
            public void Wa(float f10, float f11, float f12, float f13) throws RemoteException {
                Parcel parcelI = i();
                parcelI.writeFloat(f10);
                parcelI.writeFloat(f11);
                parcelI.writeFloat(f12);
                parcelI.writeFloat(f13);
                p(8, parcelI);
            }

            @Override // com.google.vr.vrcore.common.api.a
            public void Xd(int i10, long j10, int i11) throws RemoteException {
                Parcel parcelI = i();
                parcelI.writeInt(i10);
                parcelI.writeLong(j10);
                parcelI.writeInt(i11);
                p(10, parcelI);
            }

            @Override // com.google.vr.vrcore.common.api.a
            public void e5() throws RemoteException {
                p(7, i());
            }

            @Override // com.google.vr.vrcore.common.api.a
            public void e8(HeadTrackingState headTrackingState) throws RemoteException {
                Parcel parcelI = i();
                c1.c(parcelI, headTrackingState);
                p(6, parcelI);
            }

            @Override // com.google.vr.vrcore.common.api.a
            public void je(float f10, float f11, float f12) throws RemoteException {
                Parcel parcelI = i();
                parcelI.writeFloat(f10);
                parcelI.writeFloat(f11);
                parcelI.writeFloat(f12);
                p(9, parcelI);
            }
        }

        public AbstractBinderC1411a() {
            super(f129951b);
        }

        public static a p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f129951b);
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C1412a(iBinder);
        }

        @Override // com.google.vr.sdk.deps.b0
        protected boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            switch (i10) {
                case 1:
                    int iG8 = G8();
                    parcel2.writeNoException();
                    parcel2.writeInt(iG8);
                    return true;
                case 2:
                    HeadTrackingState headTrackingStateLd = Ld();
                    parcel2.writeNoException();
                    c1.f(parcel2, headTrackingStateLd);
                    return true;
                case 3:
                    F3(parcel.readInt(), parcel.readLong());
                    return true;
                case 4:
                    C9();
                    return true;
                case 5:
                    M7();
                    return true;
                case 6:
                    e8((HeadTrackingState) c1.a(parcel, HeadTrackingState.CREATOR));
                    return true;
                case 7:
                    e5();
                    return true;
                case 8:
                    Wa(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                    return true;
                case 9:
                    je(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                    return true;
                case 10:
                    Xd(parcel.readInt(), parcel.readLong(), parcel.readInt());
                    return true;
                default:
                    return false;
            }
        }
    }

    void C9() throws RemoteException;

    void F3(int i10, long j10) throws RemoteException;

    int G8() throws RemoteException;

    HeadTrackingState Ld() throws RemoteException;

    void M7() throws RemoteException;

    void Wa(float f10, float f11, float f12, float f13) throws RemoteException;

    void Xd(int i10, long j10, int i11) throws RemoteException;

    void e5() throws RemoteException;

    void e8(HeadTrackingState headTrackingState) throws RemoteException;

    void je(float f10, float f11, float f12) throws RemoteException;
}
