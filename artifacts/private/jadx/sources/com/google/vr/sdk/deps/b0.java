package com.google.vr.sdk.deps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public class b0 extends Binder implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d2 f127706a;

    protected b0(String str) {
        attachInterface(this, str);
    }

    static synchronized void k(d2 d2Var) {
        try {
            if (d2Var == null) {
                throw new IllegalArgumentException("null interceptor");
            }
            if (f127706a != null) {
                throw new IllegalStateException("Duplicate TransactionInterceptor installation.");
            }
            f127706a = d2Var;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    protected boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        return false;
    }

    protected boolean n(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 > 16777215) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (n(i10, parcel, parcel2, i11)) {
            int i12 = 5 & 1;
            return true;
        }
        d2 d2Var = f127706a;
        return d2Var == null ? i(i10, parcel, parcel2, i11) : d2Var.y();
    }
}
