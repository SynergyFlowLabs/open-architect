package com.google.android.play.core.appupdate.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m extends h implements n {
    public m() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // com.google.android.play.core.appupdate.internal.h
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            Bundle bundle = (Bundle) i.a(parcel, Bundle.CREATOR);
            i.b(parcel);
            l7(bundle);
        } else {
            if (i10 != 3) {
                return false;
            }
            Bundle bundle2 = (Bundle) i.a(parcel, Bundle.CREATOR);
            i.b(parcel);
            r(bundle2);
        }
        return true;
    }
}
