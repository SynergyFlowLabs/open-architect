package com.google.vr.vrcore.library.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.vr.sdk.deps.b0;
import com.google.vr.sdk.deps.c1;

/* JADX INFO: loaded from: classes5.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.google.vr.vrcore.library.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1419a extends b0 implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f130041b = "com.google.vr.vrcore.library.api.IGvrLayout";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f130042c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f130043d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f130044e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f130045f = 5;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f130046g = 6;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f130047h = 7;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f130048i = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f130049j = 9;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f130050k = 10;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f130051l = 11;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final int f130052m = 12;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final int f130053n = 13;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final int f130054o = 14;

        /* JADX INFO: renamed from: com.google.vr.vrcore.library.api.a$a$a, reason: collision with other inner class name */
        public static class C1420a extends com.google.vr.sdk.deps.a implements a {
            C1420a(IBinder iBinder) {
                super(iBinder, AbstractBinderC1419a.f130041b);
            }

            @Override // com.google.vr.vrcore.library.api.a
            public boolean H3(c cVar) throws RemoteException {
                Parcel parcelI = i();
                c1.b(parcelI, cVar);
                Parcel parcelK = k(14, parcelI);
                boolean zE = c1.e(parcelK);
                parcelK.recycle();
                return zE;
            }

            @Override // com.google.vr.vrcore.library.api.a
            public void N(boolean z10) throws RemoteException {
                Parcel parcelI = i();
                c1.d(parcelI, z10);
                n(11, parcelI);
            }

            @Override // com.google.vr.vrcore.library.api.a
            public void O4(c cVar) throws RemoteException {
                Parcel parcelI = i();
                c1.b(parcelI, cVar);
                n(13, parcelI);
            }

            @Override // com.google.vr.vrcore.library.api.a
            public long W2() throws RemoteException {
                Parcel parcelK = k(2, i());
                long j10 = parcelK.readLong();
                parcelK.recycle();
                return j10;
            }

            @Override // com.google.vr.vrcore.library.api.a
            public void cf(c cVar) throws RemoteException {
                Parcel parcelI = i();
                c1.b(parcelI, cVar);
                n(8, parcelI);
            }

            @Override // com.google.vr.vrcore.library.api.a
            public void d() throws RemoteException {
                n(5, i());
            }

            @Override // com.google.vr.vrcore.library.api.a
            public boolean ga(c cVar) throws RemoteException {
                Parcel parcelI = i();
                c1.b(parcelI, cVar);
                Parcel parcelK = k(10, parcelI);
                boolean zE = c1.e(parcelK);
                parcelK.recycle();
                return zE;
            }

            @Override // com.google.vr.vrcore.library.api.a
            public c getRootView() throws RemoteException {
                Parcel parcelK = k(3, i());
                c cVarP = c.a.p(parcelK.readStrongBinder());
                parcelK.recycle();
                return cVarP;
            }

            @Override // com.google.vr.vrcore.library.api.a
            public boolean i2(int i10) throws RemoteException {
                Parcel parcelI = i();
                parcelI.writeInt(i10);
                Parcel parcelK = k(9, parcelI);
                boolean zE = c1.e(parcelK);
                parcelK.recycle();
                return zE;
            }

            @Override // com.google.vr.vrcore.library.api.a
            public void l() throws RemoteException {
                n(6, i());
            }

            @Override // com.google.vr.vrcore.library.api.a
            public void onBackPressed() throws RemoteException {
                n(12, i());
            }

            @Override // com.google.vr.vrcore.library.api.a
            public b pf() throws RemoteException {
                Parcel parcelK = k(4, i());
                b bVarP = b.a.p(parcelK.readStrongBinder());
                parcelK.recycle();
                return bVarP;
            }

            @Override // com.google.vr.vrcore.library.api.a
            public void shutdown() throws RemoteException {
                n(7, i());
            }
        }

        public AbstractBinderC1419a() {
            super(f130041b);
        }

        public static a p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f130041b);
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C1420a(iBinder);
        }

        @Override // com.google.vr.sdk.deps.b0
        protected boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            switch (i10) {
                case 2:
                    long jW2 = W2();
                    parcel2.writeNoException();
                    parcel2.writeLong(jW2);
                    break;
                case 3:
                    c rootView = getRootView();
                    parcel2.writeNoException();
                    c1.b(parcel2, rootView);
                    break;
                case 4:
                    b bVarPf = pf();
                    parcel2.writeNoException();
                    c1.b(parcel2, bVarPf);
                    break;
                case 5:
                    d();
                    parcel2.writeNoException();
                    break;
                case 6:
                    l();
                    parcel2.writeNoException();
                    break;
                case 7:
                    shutdown();
                    parcel2.writeNoException();
                    break;
                case 8:
                    cf(c.a.p(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 9:
                    boolean zI2 = i2(parcel.readInt());
                    parcel2.writeNoException();
                    c1.d(parcel2, zI2);
                    break;
                case 10:
                    boolean zGa = ga(c.a.p(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    c1.d(parcel2, zGa);
                    break;
                case 11:
                    N(c1.e(parcel));
                    parcel2.writeNoException();
                    break;
                case 12:
                    onBackPressed();
                    parcel2.writeNoException();
                    break;
                case 13:
                    O4(c.a.p(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 14:
                    boolean zH3 = H3(c.a.p(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    c1.d(parcel2, zH3);
                    break;
                default:
                    return false;
            }
            return true;
        }
    }

    boolean H3(c cVar) throws RemoteException;

    void N(boolean z10) throws RemoteException;

    void O4(c cVar) throws RemoteException;

    long W2() throws RemoteException;

    void cf(c cVar) throws RemoteException;

    void d() throws RemoteException;

    boolean ga(c cVar) throws RemoteException;

    c getRootView() throws RemoteException;

    boolean i2(int i10) throws RemoteException;

    void l() throws RemoteException;

    void onBackPressed() throws RemoteException;

    b pf() throws RemoteException;

    void shutdown() throws RemoteException;
}
