package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.a.b;
import com.google.android.a.c;

/* JADX INFO: loaded from: classes4.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.google.android.finsky.externalreferrer.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0959a extends b implements a {

        /* JADX INFO: renamed from: com.google.android.finsky.externalreferrer.a$a$a, reason: collision with other inner class name */
        public static class C0960a extends com.google.android.a.a implements a {
            C0960a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // com.google.android.finsky.externalreferrer.a
            public final Bundle Y2(Bundle bundle) throws RemoteException {
                Parcel parcelI = i();
                c.b(parcelI, bundle);
                Parcel parcelK = k(parcelI);
                Bundle bundle2 = (Bundle) c.a(parcelK, Bundle.CREATOR);
                parcelK.recycle();
                return bundle2;
            }
        }

        public static a k(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C0960a(iBinder);
        }

        @Override // com.google.android.a.b
        protected final boolean i(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i10 != 1) {
                return false;
            }
            Bundle bundleY2 = Y2((Bundle) c.a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            c.c(parcel2, bundleY2);
            return true;
        }
    }

    Bundle Y2(Bundle bundle) throws RemoteException;
}
