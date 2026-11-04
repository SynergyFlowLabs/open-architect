package com.google.vr.vrcore.controller.api;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.vr.sdk.deps.b0;
import com.google.vr.sdk.deps.c1;

/* JADX INFO: loaded from: classes5.dex */
public interface g extends IInterface {

    public static abstract class a extends b0 implements g {
        public a() {
            super("com.google.vr.vrcore.controller.api.IControllerListener");
        }

        @Override // com.google.vr.sdk.deps.b0
        protected boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                int iY = y();
                parcel2.writeNoException();
                parcel2.writeInt(iY);
            } else if (i10 != 2) {
                switch (i10) {
                    case 9:
                        ControllerListenerOptions controllerListenerOptionsB = b();
                        parcel2.writeNoException();
                        c1.f(parcel2, controllerListenerOptionsB);
                        break;
                    case 10:
                        o0((ControllerEventPacket) c1.a(parcel, ControllerEventPacket.CREATOR));
                        break;
                    case 11:
                        w0((ControllerOrientationEvent) c1.a(parcel, ControllerOrientationEvent.CREATOR));
                        break;
                    case 12:
                        R0((ControllerEventPacket2) c1.a(parcel, ControllerEventPacket2.CREATOR));
                        break;
                    default:
                        return false;
                }
            } else {
                H0(parcel.readInt(), parcel.readInt());
            }
            return true;
        }
    }

    void H0(int i10, int i11) throws RemoteException;

    void R0(ControllerEventPacket2 controllerEventPacket2) throws RemoteException;

    ControllerListenerOptions b() throws RemoteException;

    void o0(ControllerEventPacket controllerEventPacket) throws RemoteException;

    void w0(ControllerOrientationEvent controllerOrientationEvent) throws RemoteException;

    int y() throws RemoteException;
}
