package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
final class u extends t {
    u(w wVar, com.google.android.gms.tasks.l lVar) {
        super(wVar, new com.google.android.play.core.appupdate.internal.s("OnCompleteUpdateCallback"), lVar);
    }

    @Override // com.google.android.play.core.appupdate.t, com.google.android.play.core.appupdate.internal.n
    public final void r(Bundle bundle) throws RemoteException {
        super.r(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f114883b.d(new com.google.android.play.core.install.a(bundle.getInt("error.code", -2)));
        } else {
            this.f114883b.e(null);
        }
    }
}
