package com.google.vr.vrcore.controller.api;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.vr.sdk.deps.b0;

/* JADX INFO: loaded from: classes5.dex */
public interface i extends IInterface {

    public static abstract class a extends b0 implements i {
        public a() {
            super("com.google.vr.vrcore.controller.api.IControllerServiceListener");
        }

        @Override // com.google.vr.sdk.deps.b0
        protected boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                int iY = y();
                parcel2.writeNoException();
                parcel2.writeInt(iY);
            } else {
                if (i10 != 2) {
                    return false;
                }
                W4(parcel.readInt());
            }
            return true;
        }
    }

    void W4(int i10) throws RemoteException;

    int y() throws RemoteException;
}
