package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
final class v extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f114885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ w f114886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(w wVar, com.google.android.gms.tasks.l lVar, String str) {
        super(wVar, new com.google.android.play.core.appupdate.internal.s("OnRequestInstallCallback"), lVar);
        this.f114886e = wVar;
        this.f114885d = str;
    }

    @Override // com.google.android.play.core.appupdate.t, com.google.android.play.core.appupdate.internal.n
    public final void l7(Bundle bundle) throws RemoteException {
        super.l7(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f114883b.d(new com.google.android.play.core.install.a(bundle.getInt("error.code", -2)));
        } else {
            this.f114883b.e(w.f(this.f114886e, bundle, this.f114885d));
        }
    }
}
