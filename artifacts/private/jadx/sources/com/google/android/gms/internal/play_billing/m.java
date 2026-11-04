package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends r implements o {
    m(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.o
    public final void B1(int i10, String str, Bundle bundle, h hVar) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(22);
        parcelI.writeString(str);
        t.c(parcelI, bundle);
        parcelI.writeStrongBinder(hVar);
        p(1901, parcelI);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int Cc(int i10, String str, String str2) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(i10);
        parcelI.writeString(str);
        parcelI.writeString(str2);
        Parcel parcelK = k(1, parcelI);
        int i11 = parcelK.readInt();
        parcelK.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Bundle F5(int i10, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(i10);
        parcelI.writeString(str);
        parcelI.writeString(str2);
        t.c(parcelI, bundle);
        t.c(parcelI, bundle2);
        Parcel parcelK = k(901, parcelI);
        Bundle bundle3 = (Bundle) t.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.o
    public final void H4(int i10, String str, Bundle bundle, f fVar) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(18);
        parcelI.writeString(str);
        t.c(parcelI, bundle);
        parcelI.writeStrongBinder(fVar);
        n(1301, parcelI);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Bundle H8(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(9);
        parcelI.writeString(str);
        parcelI.writeString(str2);
        t.c(parcelI, bundle);
        Parcel parcelK = k(902, parcelI);
        Bundle bundle2 = (Bundle) t.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Bundle L6(int i10, String str, String str2, String str3, String str4) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(3);
        parcelI.writeString(str);
        parcelI.writeString(str2);
        parcelI.writeString(str3);
        parcelI.writeString(null);
        Parcel parcelK = k(3, parcelI);
        Bundle bundle = (Bundle) t.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.o
    public final void La(int i10, String str, Bundle bundle, q qVar) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(12);
        parcelI.writeString(str);
        t.c(parcelI, bundle);
        parcelI.writeStrongBinder(qVar);
        n(1201, parcelI);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Bundle N5(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(9);
        parcelI.writeString(str);
        parcelI.writeString(str2);
        t.c(parcelI, bundle);
        Parcel parcelK = k(12, parcelI);
        Bundle bundle2 = (Bundle) t.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.o
    public final void N6(int i10, String str, Bundle bundle, ic icVar) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(21);
        parcelI.writeString(str);
        t.c(parcelI, bundle);
        parcelI.writeStrongBinder(icVar);
        p(1501, parcelI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.o
    public final void Re(int i10, String str, Bundle bundle, l lVar) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(22);
        parcelI.writeString(str);
        t.c(parcelI, bundle);
        parcelI.writeStrongBinder(lVar);
        p(1701, parcelI);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Bundle X4(int i10, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(i10);
        parcelI.writeString(str);
        parcelI.writeString(str2);
        parcelI.writeString(str3);
        t.c(parcelI, bundle);
        Parcel parcelK = k(11, parcelI);
        Bundle bundle2 = (Bundle) t.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int Y8(int i10, String str, String str2) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(3);
        parcelI.writeString(str);
        parcelI.writeString(str2);
        Parcel parcelK = k(5, parcelI);
        int i11 = parcelK.readInt();
        parcelK.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Bundle Z5(int i10, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(6);
        parcelI.writeString(str);
        parcelI.writeString(str2);
        parcelI.writeString(str3);
        t.c(parcelI, bundle);
        Parcel parcelK = k(9, parcelI);
        Bundle bundle2 = (Bundle) t.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Bundle e3(int i10, String str, String str2, String str3) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(3);
        parcelI.writeString(str);
        parcelI.writeString(str2);
        parcelI.writeString(str3);
        Parcel parcelK = k(4, parcelI);
        Bundle bundle = (Bundle) t.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Bundle eb(int i10, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(i10);
        parcelI.writeString(str);
        parcelI.writeString(str2);
        parcelI.writeString(str3);
        parcelI.writeString(null);
        t.c(parcelI, bundle);
        Parcel parcelK = k(8, parcelI);
        Bundle bundle2 = (Bundle) t.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.o
    public final void g4(int i10, String str, Bundle bundle, d dVar) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(21);
        parcelI.writeString(str);
        t.c(parcelI, bundle);
        parcelI.writeStrongBinder(dVar);
        p(1601, parcelI);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int i8(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(i10);
        parcelI.writeString(str);
        parcelI.writeString(str2);
        t.c(parcelI, bundle);
        Parcel parcelK = k(10, parcelI);
        int i11 = parcelK.readInt();
        parcelK.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Bundle ib(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(3);
        parcelI.writeString(str);
        parcelI.writeString(str2);
        t.c(parcelI, bundle);
        Parcel parcelK = k(2, parcelI);
        Bundle bundle2 = (Bundle) t.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.o
    public final void ie(int i10, String str, Bundle bundle, j jVar) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(21);
        parcelI.writeString(str);
        t.c(parcelI, bundle);
        parcelI.writeStrongBinder(jVar);
        p(1401, parcelI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.o
    public final void s5(int i10, String str, Bundle bundle, b bVar) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(22);
        parcelI.writeString(str);
        t.c(parcelI, bundle);
        parcelI.writeStrongBinder(bVar);
        p(1801, parcelI);
    }
}
