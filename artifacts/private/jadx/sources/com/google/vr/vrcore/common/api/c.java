package com.google.vr.vrcore.common.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.vr.sdk.deps.b0;

/* JADX INFO: loaded from: classes5.dex */
public interface c extends IInterface {

    public static abstract class a extends b0 implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f129962b = "com.google.vr.vrcore.common.api.ITransitionCallbacks";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f129963c = 1;

        /* JADX INFO: renamed from: com.google.vr.vrcore.common.api.c$a$a, reason: collision with other inner class name */
        public static class C1414a extends com.google.vr.sdk.deps.a implements c {
            C1414a(IBinder iBinder) {
                super(iBinder, a.f129962b);
            }

            @Override // com.google.vr.vrcore.common.api.c
            public void I7() throws RemoteException {
                p(1, i());
            }
        }

        public a() {
            super(f129962b);
        }

        public static c p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f129962b);
            return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new C1414a(iBinder);
        }

        @Override // com.google.vr.sdk.deps.b0
        protected boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1) {
                return false;
            }
            I7();
            return true;
        }
    }

    void I7() throws RemoteException;
}
