package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
class t extends com.google.android.play.core.appupdate.internal.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.play.core.appupdate.internal.s f114882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.google.android.gms.tasks.l f114883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f114884c;

    t(w wVar, com.google.android.play.core.appupdate.internal.s sVar, com.google.android.gms.tasks.l lVar) {
        this.f114884c = wVar;
        this.f114882a = sVar;
        this.f114883b = lVar;
    }

    @Override // com.google.android.play.core.appupdate.internal.n
    public void l7(Bundle bundle) throws RemoteException {
        this.f114884c.f114889a.u(this.f114883b);
        this.f114882a.d("onRequestInfo", new Object[0]);
    }

    @Override // com.google.android.play.core.appupdate.internal.n
    public void r(Bundle bundle) throws RemoteException {
        this.f114884c.f114889a.u(this.f114883b);
        this.f114882a.d("onCompleteUpdate", new Object[0]);
    }
}
