package com.google.vr.vrcore.library.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.vr.sdk.deps.b0;
import com.google.vr.sdk.deps.c1;

/* JADX INFO: loaded from: classes5.dex */
public interface b extends IInterface {

    public static abstract class a extends b0 implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f130055b = "com.google.vr.vrcore.library.api.IGvrUiLayout";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f130056c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f130057d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f130058e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f130059f = 5;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f130060g = 6;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f130061h = 7;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f130062i = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f130063j = 9;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f130064k = 10;

        /* JADX INFO: renamed from: com.google.vr.vrcore.library.api.b$a$a, reason: collision with other inner class name */
        public static class C1421a extends com.google.vr.sdk.deps.a implements b {
            C1421a(IBinder iBinder) {
                super(iBinder, a.f130055b);
            }

            @Override // com.google.vr.vrcore.library.api.b
            public void N4(boolean z10) throws RemoteException {
                Parcel parcelI = i();
                c1.d(parcelI, z10);
                n(8, parcelI);
            }

            @Override // com.google.vr.vrcore.library.api.b
            public void Nc(c cVar) throws RemoteException {
                Parcel parcelI = i();
                c1.b(parcelI, cVar);
                n(7, parcelI);
            }

            @Override // com.google.vr.vrcore.library.api.b
            public void O2(c cVar) throws RemoteException {
                Parcel parcelI = i();
                c1.b(parcelI, cVar);
                n(5, parcelI);
            }

            @Override // com.google.vr.vrcore.library.api.b
            public void Q5(c cVar) throws RemoteException {
                Parcel parcelI = i();
                c1.b(parcelI, cVar);
                n(9, parcelI);
            }

            @Override // com.google.vr.vrcore.library.api.b
            public void d1(boolean z10) throws RemoteException {
                Parcel parcelI = i();
                c1.d(parcelI, z10);
                n(6, parcelI);
            }

            @Override // com.google.vr.vrcore.library.api.b
            public c getRootView() throws RemoteException {
                Parcel parcelK = k(2, i());
                c cVarP = c.a.p(parcelK.readStrongBinder());
                parcelK.recycle();
                return cVarP;
            }

            @Override // com.google.vr.vrcore.library.api.b
            public boolean isEnabled() throws RemoteException {
                Parcel parcelK = k(4, i());
                boolean zE = c1.e(parcelK);
                parcelK.recycle();
                return zE;
            }

            @Override // com.google.vr.vrcore.library.api.b
            public void p9(String str) throws RemoteException {
                Parcel parcelI = i();
                parcelI.writeString(str);
                n(10, parcelI);
            }

            @Override // com.google.vr.vrcore.library.api.b
            public void setEnabled(boolean z10) throws RemoteException {
                Parcel parcelI = i();
                c1.d(parcelI, z10);
                n(3, parcelI);
            }
        }

        public a() {
            super(f130055b);
        }

        public static b p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f130055b);
            return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new C1421a(iBinder);
        }

        @Override // com.google.vr.sdk.deps.b0
        protected boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            switch (i10) {
                case 2:
                    c rootView = getRootView();
                    parcel2.writeNoException();
                    c1.b(parcel2, rootView);
                    break;
                case 3:
                    setEnabled(c1.e(parcel));
                    parcel2.writeNoException();
                    break;
                case 4:
                    boolean zIsEnabled = isEnabled();
                    parcel2.writeNoException();
                    c1.d(parcel2, zIsEnabled);
                    break;
                case 5:
                    O2(c.a.p(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 6:
                    d1(c1.e(parcel));
                    parcel2.writeNoException();
                    break;
                case 7:
                    Nc(c.a.p(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 8:
                    N4(c1.e(parcel));
                    parcel2.writeNoException();
                    break;
                case 9:
                    Q5(c.a.p(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 10:
                    p9(parcel.readString());
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
            return true;
        }
    }

    void N4(boolean z10) throws RemoteException;

    void Nc(c cVar) throws RemoteException;

    void O2(c cVar) throws RemoteException;

    void Q5(c cVar) throws RemoteException;

    void d1(boolean z10) throws RemoteException;

    c getRootView() throws RemoteException;

    boolean isEnabled() throws RemoteException;

    void p9(String str) throws RemoteException;

    void setEnabled(boolean z10) throws RemoteException;
}
