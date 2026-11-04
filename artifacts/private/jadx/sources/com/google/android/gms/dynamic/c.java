package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public interface c extends IInterface {

    public static abstract class a extends com.google.android.gms.internal.common.r implements c {
        public a() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @NonNull
        public static c k(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new r(iBinder);
        }

        @Override // com.google.android.gms.internal.common.r
        protected final boolean i(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) throws RemoteException {
            switch (i10) {
                case 2:
                    d dVarQ = q();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.s.e(parcel2, dVarQ);
                    break;
                case 3:
                    Bundle bundleM = m();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.s.d(parcel2, bundleM);
                    break;
                case 4:
                    int iG = g();
                    parcel2.writeNoException();
                    parcel2.writeInt(iG);
                    break;
                case 5:
                    c cVarJ = j();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.s.e(parcel2, cVarJ);
                    break;
                case 6:
                    d dVarR = R();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.s.e(parcel2, dVarR);
                    break;
                case 7:
                    boolean zX = X();
                    parcel2.writeNoException();
                    int i12 = com.google.android.gms.internal.common.s.f107994b;
                    parcel2.writeInt(zX ? 1 : 0);
                    break;
                case 8:
                    String strT = T();
                    parcel2.writeNoException();
                    parcel2.writeString(strT);
                    break;
                case 9:
                    c cVarC = c();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.s.e(parcel2, cVarC);
                    break;
                case 10:
                    int iH = h();
                    parcel2.writeNoException();
                    parcel2.writeInt(iH);
                    break;
                case 11:
                    boolean zY = Y();
                    parcel2.writeNoException();
                    int i13 = com.google.android.gms.internal.common.s.f107994b;
                    parcel2.writeInt(zY ? 1 : 0);
                    break;
                case 12:
                    d dVarF = f();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.s.e(parcel2, dVarF);
                    break;
                case 13:
                    boolean zX0 = x0();
                    parcel2.writeNoException();
                    int i14 = com.google.android.gms.internal.common.s.f107994b;
                    parcel2.writeInt(zX0 ? 1 : 0);
                    break;
                case 14:
                    boolean zB0 = B0();
                    parcel2.writeNoException();
                    int i15 = com.google.android.gms.internal.common.s.f107994b;
                    parcel2.writeInt(zB0 ? 1 : 0);
                    break;
                case 15:
                    boolean zU0 = U0();
                    parcel2.writeNoException();
                    int i16 = com.google.android.gms.internal.common.s.f107994b;
                    parcel2.writeInt(zU0 ? 1 : 0);
                    break;
                case 16:
                    boolean zB1 = b1();
                    parcel2.writeNoException();
                    int i17 = com.google.android.gms.internal.common.s.f107994b;
                    parcel2.writeInt(zB1 ? 1 : 0);
                    break;
                case 17:
                    boolean zM0 = M0();
                    parcel2.writeNoException();
                    int i18 = com.google.android.gms.internal.common.s.f107994b;
                    parcel2.writeInt(zM0 ? 1 : 0);
                    break;
                case 18:
                    boolean zQ0 = Q0();
                    parcel2.writeNoException();
                    int i19 = com.google.android.gms.internal.common.s.f107994b;
                    parcel2.writeInt(zQ0 ? 1 : 0);
                    break;
                case 19:
                    boolean zO1 = o1();
                    parcel2.writeNoException();
                    int i20 = com.google.android.gms.internal.common.s.f107994b;
                    parcel2.writeInt(zO1 ? 1 : 0);
                    break;
                case 20:
                    d dVarK = d.a.k(parcel.readStrongBinder());
                    com.google.android.gms.internal.common.s.b(parcel);
                    Qd(dVarK);
                    parcel2.writeNoException();
                    break;
                case 21:
                    boolean zF = com.google.android.gms.internal.common.s.f(parcel);
                    com.google.android.gms.internal.common.s.b(parcel);
                    t5(zF);
                    parcel2.writeNoException();
                    break;
                case 22:
                    boolean zF2 = com.google.android.gms.internal.common.s.f(parcel);
                    com.google.android.gms.internal.common.s.b(parcel);
                    L5(zF2);
                    parcel2.writeNoException();
                    break;
                case 23:
                    boolean zF3 = com.google.android.gms.internal.common.s.f(parcel);
                    com.google.android.gms.internal.common.s.b(parcel);
                    i6(zF3);
                    parcel2.writeNoException();
                    break;
                case 24:
                    boolean zF4 = com.google.android.gms.internal.common.s.f(parcel);
                    com.google.android.gms.internal.common.s.b(parcel);
                    n8(zF4);
                    parcel2.writeNoException();
                    break;
                case 25:
                    Intent intent = (Intent) com.google.android.gms.internal.common.s.a(parcel, Intent.CREATOR);
                    com.google.android.gms.internal.common.s.b(parcel);
                    w6(intent);
                    parcel2.writeNoException();
                    break;
                case 26:
                    Intent intent2 = (Intent) com.google.android.gms.internal.common.s.a(parcel, Intent.CREATOR);
                    int i21 = parcel.readInt();
                    com.google.android.gms.internal.common.s.b(parcel);
                    F6(intent2, i21);
                    parcel2.writeNoException();
                    break;
                case 27:
                    d dVarK2 = d.a.k(parcel.readStrongBinder());
                    com.google.android.gms.internal.common.s.b(parcel);
                    hb(dVarK2);
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
            return true;
        }
    }

    boolean B0() throws RemoteException;

    void F6(@NonNull Intent intent, int i10) throws RemoteException;

    void L5(boolean z10) throws RemoteException;

    boolean M0() throws RemoteException;

    boolean Q0() throws RemoteException;

    void Qd(@NonNull d dVar) throws RemoteException;

    @NonNull
    d R() throws RemoteException;

    @p0
    String T() throws RemoteException;

    boolean U0() throws RemoteException;

    boolean X() throws RemoteException;

    boolean Y() throws RemoteException;

    boolean b1() throws RemoteException;

    @p0
    c c() throws RemoteException;

    @NonNull
    d f() throws RemoteException;

    int g() throws RemoteException;

    int h() throws RemoteException;

    void hb(@NonNull d dVar) throws RemoteException;

    void i6(boolean z10) throws RemoteException;

    @p0
    c j() throws RemoteException;

    @p0
    Bundle m() throws RemoteException;

    void n8(boolean z10) throws RemoteException;

    boolean o1() throws RemoteException;

    @NonNull
    d q() throws RemoteException;

    void t5(boolean z10) throws RemoteException;

    void w6(@NonNull Intent intent) throws RemoteException;

    boolean x0() throws RemoteException;
}
